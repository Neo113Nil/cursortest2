package xsna;

import java.util.Map;
import xsna.kyl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fyl implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fyl(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                gyl.a((izs) this.c, (kyl.e) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                return s3q0.a;
            case 1:
                dv60 dv60Var = (dv60) this.c;
                mu60 mu60Var = (mu60) this.d;
                qz60 qz60Var = (qz60) this.e;
                iw60 iw60Var = (iw60) obj;
                io.reactivex.rxjava3.internal.operators.single.y c = dv60Var.w().c(iw60Var, (jw60) obj2);
                int i = mu60Var.b;
                io.reactivex.rxjava3.core.x<lu60> A = dv60Var.A(c, i);
                int i2 = iw60Var.c;
                io.reactivex.rxjava3.internal.operators.single.i d = gv60.d(dv60Var.L(gv60.c(dv60Var.H(A, i2).m(dv60Var.n), dv60Var.g)).l(new nit(new tu60(i, dv60Var, qz60Var.d, qz60Var.c), 11)), i2, mu60Var.d, new o99(dv60Var, 8));
                if (dv60Var.y()) {
                    d = new io.reactivex.rxjava3.internal.operators.single.i(d, new h9b(new bw6(dv60Var, 9)));
                }
                return dv60Var.N(gv60.b(dv60Var.O(dv60Var.J(new io.reactivex.rxjava3.internal.operators.single.r(dv60Var.t(gv60.a(d)), new rt0(new wu60(dv60Var, i2, false), 25)), iw60Var)), new p99(dv60Var, 9), new f5x(dv60Var, 22)), i2, true);
            default:
                ((Integer) obj2).getClass();
                rd80.a((wh50) this.c, (Map) this.d, (String) this.e, (androidx.compose.runtime.a) obj, ne7.I(3511));
                return s3q0.a;
        }
    }

    public /* synthetic */ fyl(dv60 dv60Var, mu60 mu60Var, qz60 qz60Var) {
        this.b = 1;
        this.c = dv60Var;
        this.d = mu60Var;
        this.e = qz60Var;
    }
}
