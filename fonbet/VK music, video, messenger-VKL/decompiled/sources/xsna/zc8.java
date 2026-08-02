package xsna;

/* compiled from: BringIntoViewRequester.kt */
/* loaded from: classes11.dex */
final class zc8 extends d730<cd8> {
    public final yc8 a;

    public zc8(yc8 yc8Var) {
        this.a = yc8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zc8) {
            return epx.f(this.a, ((zc8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final cd8 r() {
        cd8 cd8Var = new cd8();
        cd8Var.p = this.a;
        return cd8Var;
    }

    @Override // xsna.d730
    public final void s(cd8 cd8Var) {
        cd8 cd8Var2 = cd8Var;
        yc8 yc8Var = cd8Var2.p;
        if (yc8Var instanceof bd8) {
            ((bd8) yc8Var).a.j(cd8Var2);
        }
        yc8 yc8Var2 = this.a;
        if (yc8Var2 instanceof bd8) {
            ((bd8) yc8Var2).a.b(cd8Var2);
        }
        cd8Var2.p = yc8Var2;
    }
}
