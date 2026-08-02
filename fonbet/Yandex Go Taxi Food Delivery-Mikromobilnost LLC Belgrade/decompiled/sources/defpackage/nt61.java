package defpackage;

import java.security.AccessController;
import java.security.AlgorithmConstraints;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathValidator;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.ssl.SSLLogger;
import ru.CryptoPro.ssl.pc_10.cl_6;
import ru.CryptoPro.ssl.util.TLSSettings;
import ru.CryptoPro.ssl.util.cpSSLConfig;

/* loaded from: classes4.dex */
public final class nt61 extends vv61 {
    public static final boolean l = ((Boolean) AccessController.doPrivileged(new htf0("ru.CryptoPro.ssl.checkRevocation", 4))).booleanValue();
    public static final boolean m = ((Boolean) AccessController.doPrivileged(new htf0("com.sun.security.enableCRLDP", 4))).booleanValue();
    public static final boolean n = ((Boolean) AccessController.doPrivileged(new htf0("com.ibm.security.enableCRLDP", 4))).booleanValue();
    public static final boolean o = GetProperty.getBooleanProperty("ngate_set_jcsp_if_gost", false);
    public static final String p = GetProperty.getStringProperty("ru.CryptoPro.ssl.pkix.provider", null);
    public static final String q = GetProperty.getStringProperty("ru.CryptoPro.ssl.pkix.algorithm", null);
    public final HashSet f;
    public final HashSet g;
    public final PKIXBuilderParameters h;
    public final boolean i;
    public final HashMap j;
    public final boolean k;

    public nt61(String str, Collection collection) {
        super("PKIX", str);
        List list;
        this.g = new HashSet();
        this.f = new HashSet();
        String defaultDigestSignatureSSLProvider = cpSSLConfig.getDefaultDigestSignatureSSLProvider();
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            X509Certificate x509Certificate = (X509Certificate) it.next();
            if (d(defaultDigestSignatureSSLProvider, x509Certificate)) {
                hashSet.add(new TrustAnchor(x509Certificate, null));
                this.f.add(x509Certificate);
            }
            this.g.add(x509Certificate);
        }
        try {
            PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(hashSet, (CertSelector) null);
            this.h = pKIXBuilderParameters;
            boolean z = false;
            if ((str.equalsIgnoreCase("tls server") || str.equalsIgnoreCase("tls client")) && (TLSSettings.getDefaultEnableRevocation() || l)) {
                z = true;
            }
            pKIXBuilderParameters.setRevocationEnabled(z);
            this.j = new HashMap();
            Iterator it2 = this.f.iterator();
            while (it2.hasNext()) {
                X509Certificate x509Certificate2 = (X509Certificate) it2.next();
                X500Principal subjectX500Principal = x509Certificate2.getSubjectX500Principal();
                if (this.j.containsKey(subjectX500Principal)) {
                    list = (List) this.j.get(subjectX500Principal);
                } else {
                    ArrayList arrayList = new ArrayList();
                    this.j.put(subjectX500Principal, arrayList);
                    list = arrayList;
                }
                list.add(x509Certificate2.getPublicKey());
            }
            this.k = str.equals("plugin code signing");
            try {
                this.h.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(this.g)));
            } catch (InvalidAlgorithmParameterException e) {
                ny61.n("Invalid certificate store", e);
                throw null;
            } catch (NoSuchAlgorithmException e2) {
                ny61.n("Invalid certificate store", e2);
                throw null;
            }
        } catch (InvalidAlgorithmParameterException e3) {
            throw new RuntimeException("Unexpected error: " + e3.toString(), e3);
        }
    }

    public static boolean d(String str, X509Certificate x509Certificate) {
        if (!x509Certificate.getSubjectX500Principal().equals(x509Certificate.getIssuerX500Principal())) {
            return false;
        }
        try {
            if (e(x509Certificate.getPublicKey())) {
                x509Certificate.verify(x509Certificate.getPublicKey(), str);
                return true;
            }
            x509Certificate.verify(x509Certificate.getPublicKey());
            return true;
        } catch (Exception e) {
            SSLLogger.subThrown(e);
            return false;
        }
    }

    public static boolean e(PublicKey publicKey) {
        if (!o) {
            return false;
        }
        String algorithm = publicKey.getAlgorithm();
        return algorithm.equalsIgnoreCase(JCP.GOST_EL_DEGREE_NAME) || algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME);
    }

    public static X509Certificate[] f(CertPath certPath, TrustAnchor trustAnchor) {
        List<? extends Certificate> certificates = certPath.getCertificates();
        int size = certificates.size();
        X509Certificate[] x509CertificateArr = new X509Certificate[size + 1];
        certificates.toArray(x509CertificateArr);
        X509Certificate trustedCert = trustAnchor.getTrustedCert();
        if (trustedCert == null) {
            throw new cl_6("TrustAnchor must be specified as certificate");
        }
        x509CertificateArr[size] = trustedCert;
        return x509CertificateArr;
    }

    public static X509Certificate[] h(X509Certificate[] x509CertificateArr, PKIXBuilderParameters pKIXBuilderParameters, Object obj) {
        try {
            if (e(x509CertificateArr[0].getPublicKey())) {
                pKIXBuilderParameters.setSigProvider(cpSSLConfig.getDefaultDigestSignatureSSLProvider());
                SSLLogger.fine("[PKIX] Signature provider (build): ", pKIXBuilderParameters.getSigProvider());
            }
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setCertificate(x509CertificateArr[0]);
            pKIXBuilderParameters.setTargetCertConstraints(x509CertSelector);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(x509CertificateArr));
            pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(arrayList)));
            rbh a = rbh.a(obj, pKIXBuilderParameters);
            String str = a.b;
            String str2 = a.c;
            PKIXCertPathBuilderResult pKIXCertPathBuilderResult = (PKIXCertPathBuilderResult) (str != null ? CertPathBuilder.getInstance(str2, str) : CertPathBuilder.getInstance(str2)).build(pKIXBuilderParameters);
            X509Certificate[] f = f(pKIXCertPathBuilderResult.getCertPath(), pKIXCertPathBuilderResult.getTrustAnchor());
            SSLLogger.fine("Built certificate chain size:", Integer.valueOf(f.length));
            return f;
        } catch (GeneralSecurityException e) {
            throw new cl_6("PKIX path building failed: " + e.toString(), e);
        }
    }

    @Override // defpackage.vv61
    public final Collection a() {
        return this.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r2 != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        return new java.security.cert.X509Certificate[]{r9[0]};
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        r0 = new java.security.cert.X509Certificate[r2];
        java.lang.System.arraycopy(r9, 0, r0, 0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        return g(r0, r1, r11);
     */
    @Override // defpackage.vv61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final X509Certificate[] b(X509Certificate[] x509CertificateArr, AlgorithmConstraints algorithmConstraints, Object obj) {
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            w511.y("null or zero-length certificate chain");
            return null;
        }
        PKIXBuilderParameters pKIXBuilderParameters = (PKIXBuilderParameters) this.h.clone();
        if (algorithmConstraints != null) {
            pKIXBuilderParameters.addCertPathChecker(new pq61(null, algorithmConstraints));
        }
        int i = 0;
        X500Principal x500Principal = null;
        while (true) {
            int length = x509CertificateArr.length;
            HashMap hashMap = this.j;
            if (i >= length) {
                X509Certificate x509Certificate = x509CertificateArr[x509CertificateArr.length - 1];
                X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                x509Certificate.getSubjectX500Principal();
                boolean containsKey = hashMap.containsKey(issuerX500Principal);
                boolean z = this.k;
                if (containsKey) {
                    List list = (List) hashMap.get(issuerX500Principal);
                    if (z) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            try {
                                x509Certificate.verify((PublicKey) it.next());
                            } catch (Exception unused) {
                            }
                        }
                    }
                    return g(x509CertificateArr, pKIXBuilderParameters, obj);
                }
                if (!z) {
                    return h(x509CertificateArr, pKIXBuilderParameters, obj);
                }
                if (x509CertificateArr.length > 1) {
                    int length2 = x509CertificateArr.length - 1;
                    X509Certificate[] x509CertificateArr2 = new X509Certificate[length2];
                    System.arraycopy(x509CertificateArr, 0, x509CertificateArr2, 0, length2);
                    try {
                        pKIXBuilderParameters.setTrustAnchors(Collections.singleton(new TrustAnchor(x509CertificateArr[x509CertificateArr.length - 1], null)));
                        g(x509CertificateArr2, pKIXBuilderParameters, obj);
                    } catch (InvalidAlgorithmParameterException e) {
                        throw new CertificateException(e);
                    }
                }
                throw new cl_6("No trusted certificate found", (X509Certificate) null);
            }
            X509Certificate x509Certificate2 = x509CertificateArr[i];
            X500Principal subjectX500Principal = x509Certificate2.getSubjectX500Principal();
            if (i != 0 && !subjectX500Principal.equals(x500Principal)) {
                return h(x509CertificateArr, pKIXBuilderParameters, obj);
            }
            if (this.f.contains(x509Certificate2) || (hashMap.containsKey(subjectX500Principal) && ((List) hashMap.get(subjectX500Principal)).contains(x509Certificate2.getPublicKey()))) {
                break;
            }
            x500Principal = x509Certificate2.getIssuerX500Principal();
            i++;
        }
    }

    public final X509Certificate[] g(X509Certificate[] x509CertificateArr, PKIXBuilderParameters pKIXBuilderParameters, Object obj) {
        String str;
        StringBuilder sb = new StringBuilder("*** Revocation parameters\n\tru.CryptoPro.ssl.checkRevocation: ");
        sb.append(l);
        sb.append("\n\tcom.sun.security.enableCRLDP: ");
        boolean z = m;
        sb.append(z);
        sb.append("\n\tcom.ibm.security.enableCRLDP: ");
        boolean z2 = n;
        sb.append(z2);
        sb.append("\n\tparameters from MFS: ");
        boolean z3 = this.i;
        sb.append(z3);
        SSLLogger.fine(sb.toString());
        try {
            if (e(x509CertificateArr[0].getPublicKey())) {
                pKIXBuilderParameters.setSigProvider(cpSSLConfig.getDefaultDigestSignatureSSLProvider());
                SSLLogger.fine("[PKIX] Signature provider (validate): ", pKIXBuilderParameters.getSigProvider());
            }
            if (!pKIXBuilderParameters.isRevocationEnabled()) {
                str = "Certificate validation is disabled (revocationEnabled = false).";
            } else if (z3) {
                str = "ManagerFactoryParameters verification is enabled.";
            } else {
                if (!z && !z2) {
                    throw new GeneralSecurityException("Online certificate validation is enabled but -Dcom.sun.security.enableCRLDP=false or -Dcom.ibm.security.enableCRLDP=false or they are undefined, or ManagerFactoryParameters is null.");
                }
                str = "Online certificate validation is enabled: -Dcom.sun.security.enableCRLDP=true or -Dcom.ibm.security.enableCRLDP=true";
            }
            SSLLogger.fine(str);
            rbh a = rbh.a(obj, pKIXBuilderParameters);
            String str2 = a.b;
            String str3 = a.c;
            CertPathValidator certPathValidator = str2 != null ? CertPathValidator.getInstance(str3, str2) : CertPathValidator.getInstance(str3);
            CertPath generateCertPath = vv61.e.generateCertPath(Arrays.asList(x509CertificateArr));
            return f(generateCertPath, ((PKIXCertPathValidatorResult) certPathValidator.validate(generateCertPath, pKIXBuilderParameters)).getTrustAnchor());
        } catch (GeneralSecurityException e) {
            throw new cl_6("PKIX path validation failed: " + e.toString(), e);
        }
    }

    public nt61(String str, PKIXBuilderParameters pKIXBuilderParameters) {
        super("PKIX", str);
        List list;
        this.g = new HashSet();
        this.f = new HashSet();
        String defaultDigestSignatureSSLProvider = cpSSLConfig.getDefaultDigestSignatureSSLProvider();
        Iterator<TrustAnchor> it = pKIXBuilderParameters.getTrustAnchors().iterator();
        while (it.hasNext()) {
            X509Certificate trustedCert = it.next().getTrustedCert();
            if (trustedCert != null) {
                if (d(defaultDigestSignatureSSLProvider, trustedCert)) {
                    this.f.add(trustedCert);
                }
                this.g.add(trustedCert);
            }
        }
        this.h = (PKIXBuilderParameters) pKIXBuilderParameters.clone();
        this.i = true;
        this.j = new HashMap();
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            X509Certificate x509Certificate = (X509Certificate) it2.next();
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            if (this.j.containsKey(subjectX500Principal)) {
                list = (List) this.j.get(subjectX500Principal);
            } else {
                ArrayList arrayList = new ArrayList();
                this.j.put(subjectX500Principal, arrayList);
                list = arrayList;
            }
            list.add(x509Certificate.getPublicKey());
        }
        this.k = str.equals("plugin code signing");
        try {
            this.h.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(this.g)));
        } catch (InvalidAlgorithmParameterException e) {
            ny61.n("Invalid certificate store", e);
            throw null;
        } catch (NoSuchAlgorithmException e2) {
            ny61.n("Invalid certificate store", e2);
            throw null;
        }
    }
}
