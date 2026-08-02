package xsna;

/* compiled from: LazyItemScopeImpl.kt */
/* loaded from: classes11.dex */
final class si90 extends d730<ti90> {
    public final float a;
    public final mtk0<Integer> b;
    public final mtk0<Integer> c;

    public si90(mtk0 mtk0Var, mtk0 mtk0Var2) {
        this.a = 1.0f;
        this.b = mtk0Var;
        this.c = mtk0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si90)) {
            return false;
        }
        si90 si90Var = (si90) obj;
        return this.a == si90Var.a && epx.f(this.b, si90Var.b) && epx.f(this.c, si90Var.c);
    }

    public final int hashCode() {
        mtk0<Integer> mtk0Var = this.b;
        int hashCode = (mtk0Var != null ? mtk0Var.hashCode() : 0) * 31;
        mtk0<Integer> mtk0Var2 = this.c;
        return Float.hashCode(this.a) + ((hashCode + (mtk0Var2 != null ? mtk0Var2.hashCode() : 0)) * 31);
    }

    @Override // xsna.d730
    public final ti90 r() {
        ti90 ti90Var = new ti90();
        ti90Var.p = this.a;
        ti90Var.q = this.b;
        ti90Var.r = this.c;
        return ti90Var;
    }

    @Override // xsna.d730
    public final void s(ti90 ti90Var) {
        ti90 ti90Var2 = ti90Var;
        ti90Var2.p = this.a;
        ti90Var2.q = this.b;
        ti90Var2.r = this.c;
    }

    public /* synthetic */ si90(mtk0 mtk0Var, mtk0 mtk0Var2, int i) {
        this((i & 2) != 0 ? null : mtk0Var, (i & 4) != 0 ? null : mtk0Var2);
    }
}
