package defpackage;

/* loaded from: classes.dex */
public final class jb70 extends gc70 {
    public static final jb70 d;
    public static final jb70 e;
    public static final jb70 f;
    public static final jb70 g;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new jb70(i, 2, 0);
        int i2 = 1;
        e = new jb70(i2, i2, 1);
        f = new jb70(i, 2, 2);
        int i3 = 1;
        g = new jb70(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jb70(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // defpackage.gc70
    public final void a(vc70 vc70Var, o13 o13Var, ows0 ows0Var, zti0 zti0Var, jc70 jc70Var) {
        switch (this.c) {
            case 0:
                Object invoke = ((sls) vc70Var.b(0)).invoke();
                yss yssVar = (yss) vc70Var.b(1);
                int a = vc70Var.a(0);
                yssVar.getClass();
                ows0Var.X(ows0Var.c(yssVar), invoke);
                o13Var.k(a, invoke);
                o13Var.n(invoke);
                break;
            case 1:
                yss yssVar2 = (yss) vc70Var.b(0);
                int a2 = vc70Var.a(0);
                o13Var.p();
                yssVar2.getClass();
                o13Var.m(a2, ows0Var.E(ows0Var.c(yssVar2)));
                break;
            case 2:
                Object b = vc70Var.b(0);
                yss yssVar3 = (yss) vc70Var.b(1);
                int a3 = vc70Var.a(0);
                if (b instanceof gts) {
                    gts gtsVar = (gts) b;
                    zti0Var.e.b(gtsVar);
                    zti0Var.d.a(gtsVar);
                }
                Object M = ows0Var.M(ows0Var.c(yssVar3), a3, b);
                if (!(M instanceof gts)) {
                    if (M instanceof aii0) {
                        ((aii0) M).c();
                        break;
                    }
                } else {
                    zti0Var.e((gts) M);
                    break;
                }
                break;
            default:
                Object b2 = vc70Var.b(0);
                int a4 = vc70Var.a(0);
                if (b2 instanceof gts) {
                    gts gtsVar2 = (gts) b2;
                    zti0Var.e.b(gtsVar2);
                    zti0Var.d.a(gtsVar2);
                }
                Object M2 = ows0Var.M(ows0Var.t, a4, b2);
                if (!(M2 instanceof gts)) {
                    if (M2 instanceof aii0) {
                        ((aii0) M2).c();
                        break;
                    }
                } else {
                    zti0Var.e((gts) M2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.gc70
    public yss b(vc70 vc70Var) {
        switch (this.c) {
            case 0:
                return (yss) vc70Var.b(1);
            case 1:
                return (yss) vc70Var.b(0);
            default:
                return super.b(vc70Var);
        }
    }
}
