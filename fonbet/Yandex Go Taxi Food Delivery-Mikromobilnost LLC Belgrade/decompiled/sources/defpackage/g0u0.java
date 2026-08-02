package defpackage;

import com.yandex.dsl.views.layouts.constraint.ConstraintSetBuilder;
import com.yandex.dsl.views.layouts.constraint.d;

/* loaded from: classes15.dex */
public final /* synthetic */ class g0u0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConstraintSetBuilder b;

    public /* synthetic */ g0u0(int i, ConstraintSetBuilder constraintSetBuilder) {
        this.a = i;
        this.b = constraintSetBuilder;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ConstraintSetBuilder constraintSetBuilder = this.b;
        d dVar = (d) obj;
        switch (i) {
            case 0:
                dVar.e(-2);
                dVar.d(-2);
                ConstraintSetBuilder.Side side = ConstraintSetBuilder.Side.TOP;
                m7e f = tse0.f(side, side, dVar, 0);
                int b = kjs0.b(7);
                constraintSetBuilder.getClass();
                o7e C = ConstraintSetBuilder.C(f, b);
                ConstraintSetBuilder.Side side2 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(C, ConstraintSetBuilder.C(tse0.f(side2, side2, dVar, 0), kjs0.b(10)));
                break;
            case 1:
                dVar.e(0);
                dVar.d(-2);
                ConstraintSetBuilder.Side side3 = ConstraintSetBuilder.Side.BOTTOM;
                m7e f2 = tse0.f(side3, side3, dVar, 0);
                ConstraintSetBuilder.Side side4 = ConstraintSetBuilder.Side.START;
                m7e f3 = tse0.f(side4, side4, dVar, 0);
                ConstraintSetBuilder.Side side5 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(f2, f3, tse0.f(side5, side5, dVar, 0));
                break;
            case 2:
                dVar.e(0);
                dVar.d(-2);
                ConstraintSetBuilder.Side side6 = ConstraintSetBuilder.Side.BOTTOM;
                m7e f4 = tse0.f(side6, side6, dVar, 0);
                ConstraintSetBuilder.Side side7 = ConstraintSetBuilder.Side.START;
                m7e f5 = tse0.f(side7, side7, dVar, 0);
                ConstraintSetBuilder.Side side8 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(f4, f5, tse0.f(side8, side8, dVar, 0));
                break;
            case 3:
                dVar.e(-2);
                dVar.d(-2);
                ConstraintSetBuilder.Side side9 = ConstraintSetBuilder.Side.BOTTOM;
                int b2 = kjs0.b(6);
                ConstraintSetBuilder constraintSetBuilder2 = dVar.b;
                int i2 = dVar.a;
                constraintSetBuilder2.w(i2, side9.getSideId(), b2);
                ConstraintSetBuilder.Side side10 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder2.w(i2, side10.getSideId(), kjs0.b(2));
                constraintSetBuilder.z(tse0.f(side9, side9, dVar, 0), tse0.f(side10, side10, dVar, 0));
                break;
            default:
                dVar.e(0);
                dVar.d(kjs0.b(48));
                ConstraintSetBuilder.Side side11 = ConstraintSetBuilder.Side.BOTTOM;
                m7e f6 = tse0.f(side11, side11, dVar, 0);
                int b3 = kjs0.b(8);
                constraintSetBuilder.getClass();
                o7e C2 = ConstraintSetBuilder.C(f6, b3);
                ConstraintSetBuilder.Side side12 = ConstraintSetBuilder.Side.START;
                o7e C3 = ConstraintSetBuilder.C(tse0.f(side12, side12, dVar, 0), kjs0.b(8));
                ConstraintSetBuilder.Side side13 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(C2, C3, ConstraintSetBuilder.C(tse0.f(side13, side13, dVar, 0), kjs0.b(8)));
                break;
        }
        return zy11Var;
    }
}
