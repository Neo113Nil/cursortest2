package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class b650 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d650 b;

    public /* synthetic */ b650(d650 d650Var, int i) {
        this.a = i;
        this.b = d650Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        d650 d650Var = this.b;
        switch (i) {
            case 0:
                dw b = d650Var.b(qoi0.a(w8s0.class));
                if (b != null) {
                    return b;
                }
                ny61.r("Required value was null.");
                return null;
            case 1:
                dw b2 = d650Var.b(qoi0.a(iyj.class));
                if (b2 != null) {
                    return b2;
                }
                ny61.r("Required value was null.");
                return null;
            case 2:
                dw b3 = d650Var.b(qoi0.a(y7s0.class));
                if (b3 != null) {
                    return b3;
                }
                ny61.r("Required value was null.");
                return null;
            case 3:
                dw b4 = d650Var.b(qoi0.a(eiu.class));
                if (b4 != null) {
                    return b4;
                }
                ny61.r("Required value was null.");
                return null;
            case 4:
                dw b5 = d650Var.b(qoi0.a(t9s.class));
                if (b5 != null) {
                    return b5;
                }
                ny61.r("Required value was null.");
                return null;
            case 5:
                dw b6 = d650Var.b(qoi0.a(hj4.class));
                if (b6 != null) {
                    return b6;
                }
                ny61.r("Required value was null.");
                return null;
            case 6:
                dw b7 = d650Var.b(qoi0.a(w090.class));
                if (b7 != null) {
                    return b7;
                }
                ny61.r("Required value was null.");
                return null;
            case 7:
                return dta1.d(d650Var.a, d650Var.j);
            case 8:
                return new ij4(d650Var.a());
            case 9:
                return new jyj(d650Var.a());
            case 10:
                return new u9s(d650Var.a());
            case 11:
                return new fiu(d650Var.a());
            case 12:
                return new x090(d650Var.a());
            case 13:
                return new z7s0(d650Var.a());
            default:
                return new x8s0(d650Var.a());
        }
    }
}
