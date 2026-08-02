package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class kub0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv10 b;
    public final /* synthetic */ y0c0 c;
    public final /* synthetic */ b1c0 w;

    public /* synthetic */ kub0(xv10 xv10Var, y0c0 y0c0Var, b1c0 b1c0Var, int i) {
        this.a = i;
        this.b = xv10Var;
        this.c = y0c0Var;
        this.w = b1c0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        b1c0 b1c0Var = this.w;
        y0c0 y0c0Var = this.c;
        xv10 xv10Var = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                ((a400) ((yvi0) xv10Var.x).a).a.setMotionEventSplittingEnabled(false);
                wtr wtrVar = (wtr) xv10Var.w;
                if (wtrVar.c == 0) {
                    wtrVar.b.b8(wtrVar.a);
                }
                wtrVar.c++;
                ((hpr0) xv10Var.b).a(y0c0Var, b1c0Var);
                return ((sey) xv10Var.c).a(new kub0(xv10Var, y0c0Var, b1c0Var, i2));
            default:
                wtr wtrVar2 = (wtr) xv10Var.w;
                int i3 = wtrVar2.c - 1;
                wtrVar2.c = i3;
                if (i3 == 0) {
                    wtrVar2.b.a0(wtrVar2.a);
                }
                ((a400) ((yvi0) xv10Var.x).a).a.setMotionEventSplittingEnabled(true);
                ((hpr0) xv10Var.b).b(y0c0Var, b1c0Var);
                return zy11.a;
        }
    }
}
