package defpackage;

import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.X509CRLSelector;

/* loaded from: classes4.dex */
public final class f490 extends X509CRLSelector {
    public final g490 a;

    public f490(g490 g490Var) {
        this.a = g490Var;
        CRLSelector cRLSelector = g490Var.a;
        if (cRLSelector instanceof X509CRLSelector) {
            X509CRLSelector x509CRLSelector = (X509CRLSelector) cRLSelector;
            setCertificateChecking(x509CRLSelector.getCertificateChecking());
            setDateAndTime(x509CRLSelector.getDateAndTime());
            setIssuers(x509CRLSelector.getIssuers());
            setMinCRLNumber(x509CRLSelector.getMinCRL());
            setMaxCRLNumber(x509CRLSelector.getMaxCRL());
        }
    }

    @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
    public final boolean match(CRL crl) {
        g490 g490Var = this.a;
        return g490Var == null ? crl != null : g490Var.Q0(crl);
    }
}
