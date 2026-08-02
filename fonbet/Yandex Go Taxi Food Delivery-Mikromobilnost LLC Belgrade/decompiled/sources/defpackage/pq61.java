package defpackage;

import java.security.AlgorithmConstraints;
import java.security.AlgorithmParameters;
import java.security.CryptoPrimitive;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXReason;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import ru.CryptoPro.reprov.x509.AlgorithmId;
import ru.CryptoPro.ssl.SSLLogger;
import ru.CryptoPro.ssl.util.DisabledAlgorithmConstraints;
import ru.CryptoPro.ssl.util.ParamUtil;

/* loaded from: classes4.dex */
public final class pq61 extends PKIXCertPathChecker {
    public static final Set w;
    public static final DisabledAlgorithmConstraints x;
    public final AlgorithmConstraints a;
    public final PublicKey b;
    public PublicKey c;

    static {
        CryptoPrimitive cryptoPrimitive = CryptoPrimitive.SIGNATURE;
        w = Collections.unmodifiableSet(EnumSet.of(cryptoPrimitive));
        Collections.unmodifiableSet(EnumSet.of(cryptoPrimitive, CryptoPrimitive.KEY_ENCAPSULATION, CryptoPrimitive.PUBLIC_KEY_ENCRYPTION, CryptoPrimitive.KEY_AGREEMENT));
        DisabledAlgorithmConstraints disabledAlgorithmConstraints = new DisabledAlgorithmConstraints("jdk.certpath.disabledAlgorithms");
        x = disabledAlgorithmConstraints;
        disabledAlgorithmConstraints.checkProperty("jdkCA");
    }

    public pq61(TrustAnchor trustAnchor, AlgorithmConstraints algorithmConstraints) {
        if (trustAnchor != null) {
            this.b = trustAnchor.getTrustedCert() != null ? trustAnchor.getTrustedCert().getPublicKey() : trustAnchor.getCAPublicKey();
        } else {
            this.b = null;
            SSLLogger.fine("TrustAnchor is null, trustedMatch is false.");
        }
        this.c = this.b;
        this.a = algorithmConstraints == null ? x : algorithmConstraints;
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public final void check(Certificate certificate, Collection collection) {
        AlgorithmConstraints algorithmConstraints;
        String str;
        if (!(certificate instanceof X509Certificate) || (algorithmConstraints = this.a) == null) {
            return;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (keyUsage != null && keyUsage.length < 9) {
            throw new CertPathValidatorException("incorrect KeyUsage extension", null, null, -1, PKIXReason.INVALID_KEY_USAGE);
        }
        PublicKey publicKey = certificate.getPublicKey();
        String sigAlgName = x509Certificate.getSigAlgName();
        String resolveSignatureAlgorithmByOid = ParamUtil.resolveSignatureAlgorithmByOid(sigAlgName);
        try {
            AlgorithmParameters parameters = AlgorithmId.get(((X509Certificate) certificate).getSigAlgOID()).getParameters();
            Set<CryptoPrimitive> set = w;
            if (!algorithmConstraints.permits(set, resolveSignatureAlgorithmByOid, parameters)) {
                throw new CertPathValidatorException(g8e.o("Algorithm constraints check failed: ", resolveSignatureAlgorithmByOid), null, null, -1, CertPathValidatorException.BasicReason.ALGORITHM_CONSTRAINED);
            }
            if (keyUsage != null) {
                EnumSet noneOf = EnumSet.noneOf(CryptoPrimitive.class);
                if (keyUsage[0] || keyUsage[1] || keyUsage[5] || keyUsage[6]) {
                    noneOf.add(CryptoPrimitive.SIGNATURE);
                }
                if (keyUsage[2]) {
                    noneOf.add(CryptoPrimitive.KEY_ENCAPSULATION);
                }
                if (keyUsage[3]) {
                    noneOf.add(CryptoPrimitive.PUBLIC_KEY_ENCRYPTION);
                }
                if (keyUsage[4]) {
                    noneOf.add(CryptoPrimitive.KEY_AGREEMENT);
                }
                if (!noneOf.isEmpty() && !algorithmConstraints.permits(noneOf, publicKey)) {
                    throw new CertPathValidatorException("algorithm constraints check failed", null, null, -1, CertPathValidatorException.BasicReason.ALGORITHM_CONSTRAINED);
                }
            }
            PublicKey publicKey2 = this.c;
            if (publicKey2 == null) {
                this.c = publicKey;
                return;
            }
            if (publicKey2 != null) {
                if (sigAlgName != null && !algorithmConstraints.permits(set, resolveSignatureAlgorithmByOid, publicKey2, parameters)) {
                    throw new CertPathValidatorException(g8e.o("Algorithm constraints check failed: ", resolveSignatureAlgorithmByOid), null, null, -1, CertPathValidatorException.BasicReason.ALGORITHM_CONSTRAINED);
                }
                if ((publicKey instanceof DSAPublicKey) && ((DSAPublicKey) publicKey).getParams() == null) {
                    PublicKey publicKey3 = this.c;
                    if (publicKey3 instanceof DSAPublicKey) {
                        DSAParams params = ((DSAPublicKey) publicKey3).getParams();
                        if (params != null) {
                            try {
                                publicKey = KeyFactory.getInstance("DSA").generatePublic(new DSAPublicKeySpec(((DSAPublicKey) publicKey).getY(), params.getP(), params.getQ(), params.getG()));
                            } catch (GeneralSecurityException e) {
                                throw new CertPathValidatorException("Unable to generate key with inherited parameters: " + e.getMessage(), e);
                            }
                        } else {
                            str = "Key parameters missing";
                        }
                    } else {
                        str = "Input key is not of a appropriate type for inheriting parameters";
                    }
                    dy31.r(str);
                    return;
                }
            }
            this.c = publicKey;
        } catch (NoSuchAlgorithmException e2) {
            throw new CertPathValidatorException(e2);
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public final Set getSupportedExtensions() {
        return null;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public final void init(boolean z) {
        if (z) {
            dy31.r("forward checking not supported");
            return;
        }
        PublicKey publicKey = this.b;
        if (publicKey != null) {
            this.c = publicKey;
        } else {
            this.c = null;
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public final boolean isForwardCheckingSupported() {
        return false;
    }
}
