package xsna;

/* compiled from: VhMsgSkeletonLoader.kt */
/* loaded from: classes2.dex */
public final class our0 extends osr0<lvr0> {
    public static final /* synthetic */ int n = 0;
    public final hh6 m;

    public our0(hh6 hh6Var) {
        super(hh6Var);
        this.m = hh6Var;
    }

    @Override // xsna.osr0
    public final void V5(Object obj, pk30 pk30Var) {
        lvr0 lvr0Var = (lvr0) obj;
        wz30 wz30Var = lvr0Var.b;
        hh6 hh6Var = this.m;
        hh6Var.setSkeletonConfig(wz30Var);
        hh6Var.setDialogUnreadMsgMediator(lvr0Var.g);
        hh6Var.b();
    }

    @Override // xsna.osr0
    public final void W5() {
        this.m.c();
    }
}
