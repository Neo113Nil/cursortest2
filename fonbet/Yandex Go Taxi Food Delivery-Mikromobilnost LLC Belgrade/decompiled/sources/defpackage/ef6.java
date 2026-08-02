package defpackage;

/* loaded from: classes3.dex */
public final class ef6 implements v7p {
    public final /* synthetic */ int a;
    public final u1g b;

    public /* synthetic */ ef6(u1g u1gVar, int i) {
        this.a = i;
        this.b = u1gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        u1g u1gVar = this.b;
        switch (i) {
            case 0:
                return new df6((opx) u1gVar.get());
            default:
                return new mpx((opx) u1gVar.get());
        }
    }
}
