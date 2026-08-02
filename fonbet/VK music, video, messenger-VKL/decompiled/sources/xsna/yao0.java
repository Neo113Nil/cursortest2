package xsna;

/* compiled from: TestTag.kt */
/* loaded from: classes11.dex */
final class yao0 extends d730<zao0> {
    public final String a;

    public yao0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yao0)) {
            return false;
        }
        return epx.f(this.a, ((yao0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final zao0 r() {
        zao0 zao0Var = new zao0();
        zao0Var.p = this.a;
        return zao0Var;
    }

    @Override // xsna.d730
    public final void s(zao0 zao0Var) {
        zao0Var.p = this.a;
    }
}
