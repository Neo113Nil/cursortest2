package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class bh00 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah00 b;

    public /* synthetic */ bh00(ah00 ah00Var, int i) {
        this.a = i;
        this.b = ah00Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 5;
        ah00 ah00Var = this.b;
        switch (i) {
            case 0:
                b01 b01Var = new b01(11, (tls) obj);
                gh00 gh00Var = (gh00) ah00Var;
                gh00Var.e(b01Var);
                return new p500(i2, gh00Var, b01Var);
            default:
                return new yh00(i2, ah00Var, (y6f0) obj);
        }
    }
}
