package defpackage;

import java.security.cert.CertSelector;
import java.security.cert.Certificate;

/* loaded from: classes4.dex */
public final class j490 implements blq0 {
    public final CertSelector a;

    public j490(CertSelector certSelector) {
        this.a = certSelector;
    }

    @Override // defpackage.blq0
    public final boolean Q0(Object obj) {
        return this.a.match((Certificate) obj);
    }

    public final Object clone() {
        return new j490(this.a);
    }
}
