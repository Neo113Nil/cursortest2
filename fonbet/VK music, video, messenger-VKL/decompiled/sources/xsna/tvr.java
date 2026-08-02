package xsna;

/* compiled from: FocusInvalidationManager.kt */
/* loaded from: classes11.dex */
public final class tvr {
    public final gwr a;
    public final p52 b;
    public final qh50<dxr> c = k5h0.a();
    public final qh50<lvr> d = k5h0.a();
    public boolean e;

    public tvr(gwr gwrVar, p52 p52Var) {
        this.a = gwrVar;
        this.b = p52Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.b.q(new ud5(0, this, tvr.class, "invalidateNodes", "invalidateNodes()V", 0, 1));
        this.e = true;
    }
}
