package defpackage;

import java.security.cert.CertSelector;
import java.security.cert.PKIXParameters;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes4.dex */
public final class k490 {
    public final PKIXParameters a;
    public final Date b;
    public final Date c;
    public final j490 d;
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public final ArrayList g = new ArrayList();
    public final HashMap h = new HashMap();
    public final boolean i;
    public final Set j;

    public k490(PKIXParameters pKIXParameters) {
        this.a = (PKIXParameters) pKIXParameters.clone();
        CertSelector targetCertConstraints = pKIXParameters.getTargetCertConstraints();
        if (targetCertConstraints != null) {
            this.d = new j490((CertSelector) targetCertConstraints.clone());
        }
        Date date = pKIXParameters.getDate();
        this.b = date;
        this.c = date == null ? new Date() : date;
        this.i = pKIXParameters.isRevocationEnabled();
        this.j = pKIXParameters.getTrustAnchors();
    }
}
