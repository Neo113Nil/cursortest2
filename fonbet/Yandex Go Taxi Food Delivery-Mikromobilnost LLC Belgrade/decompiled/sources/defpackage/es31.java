package defpackage;

/* loaded from: classes.dex */
public final class es31 implements i3y {
    public final g0c a;
    public final sls b;
    public final sls c;
    public final sls w;
    public yr31 x;

    public es31(g0c g0cVar, sls slsVar, sls slsVar2, sls slsVar3) {
        this.a = g0cVar;
        this.b = slsVar;
        this.c = slsVar2;
        this.w = slsVar3;
    }

    @Override // defpackage.i3y
    public final Object getValue() {
        yr31 yr31Var = this.x;
        if (yr31Var != null) {
            return yr31Var;
        }
        yr31 a = new ls31((qs31) this.b.invoke(), (hs31) this.c.invoke(), (y8f) this.w.invoke()).a(this.a);
        this.x = a;
        return a;
    }

    @Override // defpackage.i3y
    public final boolean isInitialized() {
        return this.x != null;
    }
}
