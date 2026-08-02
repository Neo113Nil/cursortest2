package defpackage;

/* loaded from: classes14.dex */
public final class fjk0 implements bgk0 {
    public final String a;
    public final kdc b;
    public final String c;
    public final akk0 d;

    public fjk0(kdc kdcVar, String str, String str2) {
        this.a = str;
        this.b = kdcVar;
        this.c = str2;
        wrs0.a.getClass();
        this.d = vrs0.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjk0)) {
            return false;
        }
        fjk0 fjk0Var = (fjk0) obj;
        return this.a.equals(fjk0Var.a) && jl40.l(this.b, fjk0Var.b) && jl40.l(this.c, fjk0Var.c);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.d;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.d(this.b, this.a.hashCode() * 31, 31);
    }
}
