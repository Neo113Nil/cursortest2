package defpackage;

import java.io.IOException;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;

/* loaded from: classes4.dex */
public final class i490 extends X509CertSelector {
    public final j490 a;

    public i490(j490 j490Var) {
        this.a = j490Var;
        CertSelector certSelector = j490Var.a;
        if (certSelector instanceof X509CertSelector) {
            X509CertSelector x509CertSelector = (X509CertSelector) certSelector;
            setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
            setBasicConstraints(x509CertSelector.getBasicConstraints());
            setCertificate(x509CertSelector.getCertificate());
            setCertificateValid(x509CertSelector.getCertificateValid());
            setKeyUsage(x509CertSelector.getKeyUsage());
            setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
            setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
            setSerialNumber(x509CertSelector.getSerialNumber());
            setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
            setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
            try {
                setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
                setIssuer(x509CertSelector.getIssuerAsBytes());
                setNameConstraints(x509CertSelector.getNameConstraints());
                setPathToNames(x509CertSelector.getPathToNames());
                setPolicy(x509CertSelector.getPolicy());
                setSubject(x509CertSelector.getSubjectAsBytes());
                setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
                setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
            } catch (IOException e) {
                ny61.h(x4e.d(e, new StringBuilder("base selector invalid: ")), e);
                throw null;
            }
        }
    }

    @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
    public final boolean match(Certificate certificate) {
        j490 j490Var = this.a;
        return j490Var == null ? certificate != null : j490Var.a.match(certificate);
    }
}
