package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gkk0 implements hkk0 {
    public final String a;
    public final kdc b;
    public final akk0 c;

    public gkk0(kdc kdcVar, String str) {
        this.a = str;
        this.b = kdcVar;
        wrs0.a.getClass();
        this.c = vrs0.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkk0)) {
            return false;
        }
        gkk0 gkk0Var = (gkk0) obj;
        return this.a.equals(gkk0Var.a) && jl40.l(this.b, gkk0Var.b);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.c;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LineSlot(id=" + this.a + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
