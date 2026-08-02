package xsna;

/* compiled from: CommunityTopBarParams.kt */
/* loaded from: classes5.dex */
public final class h4i {
    public final boolean a;
    public final mtk0<Float> b;
    public final mtk0<Boolean> c;
    public final mtk0<Boolean> d;
    public final mtk0<Boolean> e;
    public final mtk0<Integer> f;

    public h4i(boolean z, mtk0<Float> mtk0Var, mtk0<Boolean> mtk0Var2, mtk0<Boolean> mtk0Var3, mtk0<Boolean> mtk0Var4, mtk0<Integer> mtk0Var5) {
        this.a = z;
        this.b = mtk0Var;
        this.c = mtk0Var2;
        this.d = mtk0Var3;
        this.e = mtk0Var4;
        this.f = mtk0Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4i)) {
            return false;
        }
        h4i h4iVar = (h4i) obj;
        return this.a == h4iVar.a && epx.f(this.b, h4iVar.b) && epx.f(this.c, h4iVar.c) && epx.f(this.d, h4iVar.d) && epx.f(this.e, h4iVar.e) && epx.f(this.f, h4iVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CommunityTopBarParams(searchInsideCommunity=" + this.a + ", transformFraction=" + this.b + ", isSearchViewWiden=" + this.c + ", isLoading=" + this.d + ", isHeaderButtonReached=" + this.e + ", searchHintResId=" + this.f + ')';
    }
}
