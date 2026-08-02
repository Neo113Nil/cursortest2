package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import com.yandex.dsl.views.layouts.constraint.ConstraintSetBuilder;
import com.yandex.dsl.views.layouts.constraint.d;
import com.yandex.messaging.views.BadgedFloatingActionButton;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final /* synthetic */ class gbz0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConstraintSetBuilder b;
    public final /* synthetic */ hbz0 c;

    public /* synthetic */ gbz0(hbz0 hbz0Var, ConstraintSetBuilder constraintSetBuilder) {
        this.a = 2;
        this.c = hbz0Var;
        this.b = constraintSetBuilder;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        hbz0 hbz0Var = this.c;
        ConstraintSetBuilder constraintSetBuilder = this.b;
        d dVar = (d) obj;
        switch (i) {
            case 0:
                dVar.e(0);
                dVar.d(0);
                ConstraintSetBuilder.Side side = ConstraintSetBuilder.Side.TOP;
                ConstraintSetBuilder.Side side2 = ConstraintSetBuilder.Side.BOTTOM;
                m7e c = dVar.c(new Pair(side, side2), hbz0Var.I);
                m7e f = tse0.f(side2, side2, dVar, 0);
                ConstraintSetBuilder.Side side3 = ConstraintSetBuilder.Side.START;
                m7e f2 = tse0.f(side3, side3, dVar, 0);
                ConstraintSetBuilder.Side side4 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(c, f, f2, tse0.f(side4, side4, dVar, 0));
                break;
            case 1:
                dVar.e(0);
                dVar.d(-2);
                m7e b = dVar.b(new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM), hbz0Var.S);
                ConstraintSetBuilder.Side side5 = ConstraintSetBuilder.Side.START;
                m7e f3 = tse0.f(side5, side5, dVar, 0);
                ConstraintSetBuilder.Side side6 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(b, f3, tse0.f(side6, side6, dVar, 0));
                break;
            case 2:
                dVar.e(-2);
                dVar.d(hbz0Var.w.getDimensionPixelSize(gvg0.chat_input_height));
                ConstraintSetBuilder.Side side7 = ConstraintSetBuilder.Side.BOTTOM;
                m7e f4 = tse0.f(side7, side7, dVar, 0);
                ConstraintSetBuilder.Side side8 = ConstraintSetBuilder.Side.START;
                m7e f5 = tse0.f(side8, side8, dVar, 0);
                ConstraintSetBuilder.Side side9 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(f4, f5, tse0.f(side9, side9, dVar, 0));
                break;
            case 3:
                dVar.e(0);
                dVar.d(0);
                ConstraintSetBuilder.Side side10 = ConstraintSetBuilder.Side.TOP;
                Pair pair = new Pair(side10, side10);
                ViewGroup viewGroup = hbz0Var.x;
                m7e b2 = dVar.b(pair, viewGroup);
                ConstraintSetBuilder.Side side11 = ConstraintSetBuilder.Side.BOTTOM;
                m7e b3 = dVar.b(new Pair(side11, side11), viewGroup);
                int b4 = kjs0.b(1);
                constraintSetBuilder.getClass();
                o7e C = ConstraintSetBuilder.C(b3, b4);
                ConstraintSetBuilder.Side side12 = ConstraintSetBuilder.Side.START;
                m7e b5 = dVar.b(new Pair(side12, side12), viewGroup);
                ConstraintSetBuilder.Side side13 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(b2, C, b5, dVar.b(new Pair(side13, side13), viewGroup));
                break;
            case 4:
                dVar.e(0);
                dVar.d(0);
                m7e b6 = dVar.b(new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM), hbz0Var.x);
                ConstraintSetBuilder.Side side14 = ConstraintSetBuilder.Side.START;
                m7e f6 = tse0.f(side14, side14, dVar, 0);
                ConstraintSetBuilder.Side side15 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(b6, f6, tse0.f(side15, side15, dVar, 0));
                break;
            case 5:
                dVar.e(0);
                dVar.d(-2);
                m7e c2 = dVar.c(new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM), hbz0Var.H);
                ConstraintSetBuilder.Side side16 = ConstraintSetBuilder.Side.START;
                m7e f7 = tse0.f(side16, side16, dVar, 0);
                ConstraintSetBuilder.Side side17 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(c2, f7, tse0.f(side17, side17, dVar, 0));
                break;
            case 6:
                dVar.e(0);
                dVar.d(-2);
                m7e c3 = dVar.c(new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM), hbz0Var.D);
                ConstraintSetBuilder.Side side18 = ConstraintSetBuilder.Side.START;
                m7e f8 = tse0.f(side18, side18, dVar, 0);
                ConstraintSetBuilder.Side side19 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(c3, f8, tse0.f(side19, side19, dVar, 0));
                break;
            case 7:
                dVar.e(0);
                dVar.d(-2);
                dVar.b.x(dVar.a, 8);
                m7e c4 = dVar.c(new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM), hbz0Var.E);
                ConstraintSetBuilder.Side side20 = ConstraintSetBuilder.Side.START;
                m7e f9 = tse0.f(side20, side20, dVar, 0);
                ConstraintSetBuilder.Side side21 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(c4, f9, tse0.f(side21, side21, dVar, 0));
                break;
            case 8:
                dVar.e(0);
                dVar.d(-2);
                dVar.b.x(dVar.a, 8);
                m7e c5 = dVar.c(new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM), hbz0Var.F);
                ConstraintSetBuilder.Side side22 = ConstraintSetBuilder.Side.START;
                m7e f10 = tse0.f(side22, side22, dVar, 0);
                ConstraintSetBuilder.Side side23 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(c5, f10, tse0.f(side23, side23, dVar, 0));
                break;
            case 9:
                dVar.e(0);
                dVar.d(-2);
                m7e c6 = dVar.c(new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM), hbz0Var.G);
                ConstraintSetBuilder.Side side24 = ConstraintSetBuilder.Side.START;
                m7e f11 = tse0.f(side24, side24, dVar, 0);
                ConstraintSetBuilder.Side side25 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(c6, f11, tse0.f(side25, side25, dVar, 0));
                break;
            case 10:
                dVar.e(0);
                dVar.d(0);
                ConstraintSetBuilder.Side side26 = ConstraintSetBuilder.Side.TOP;
                m7e c7 = dVar.c(new Pair(side26, side26), hbz0Var.I);
                ConstraintSetBuilder.Side side27 = ConstraintSetBuilder.Side.BOTTOM;
                m7e f12 = tse0.f(side27, side27, dVar, 0);
                ConstraintSetBuilder.Side side28 = ConstraintSetBuilder.Side.START;
                m7e f13 = tse0.f(side28, side28, dVar, 0);
                ConstraintSetBuilder.Side side29 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(c7, f12, f13, tse0.f(side29, side29, dVar, 0));
                break;
            case 11:
                dVar.e(0);
                dVar.d(kjs0.b(64));
                m7e c8 = dVar.c(new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM), hbz0Var.G);
                ConstraintSetBuilder.Side side30 = ConstraintSetBuilder.Side.START;
                m7e f14 = tse0.f(side30, side30, dVar, 0);
                ConstraintSetBuilder.Side side31 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(c8, f14, tse0.f(side31, side31, dVar, 0));
                break;
            case 12:
                dVar.e(0);
                dVar.d(0);
                ConstraintSetBuilder.Side side32 = ConstraintSetBuilder.Side.TOP;
                ConstraintSetBuilder.Side side33 = ConstraintSetBuilder.Side.BOTTOM;
                m7e b7 = dVar.b(new Pair(side32, side33), hbz0Var.x);
                m7e f15 = tse0.f(side33, side33, dVar, 0);
                Context context = hbz0Var.a;
                int i2 = gvg0.chat_input_height;
                DisplayMetrics displayMetrics = kjs0.a;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
                constraintSetBuilder.getClass();
                o7e C2 = ConstraintSetBuilder.C(f15, dimensionPixelSize);
                ConstraintSetBuilder.Side side34 = ConstraintSetBuilder.Side.START;
                m7e f16 = tse0.f(side34, side34, dVar, 0);
                ConstraintSetBuilder.Side side35 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(b7, C2, f16, tse0.f(side35, side35, dVar, 0));
                break;
            case 13:
                dVar.e(0);
                dVar.d(0);
                ConstraintSetBuilder.Side side36 = ConstraintSetBuilder.Side.TOP;
                ConstraintSetBuilder.Side side37 = ConstraintSetBuilder.Side.BOTTOM;
                m7e b8 = dVar.b(new Pair(side36, side37), hbz0Var.x);
                m7e f17 = tse0.f(side37, side37, dVar, 0);
                Context context2 = hbz0Var.a;
                int i3 = gvg0.chat_input_height;
                DisplayMetrics displayMetrics2 = kjs0.a;
                int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(i3);
                constraintSetBuilder.getClass();
                o7e C3 = ConstraintSetBuilder.C(f17, dimensionPixelSize2);
                ConstraintSetBuilder.Side side38 = ConstraintSetBuilder.Side.START;
                m7e f18 = tse0.f(side38, side38, dVar, 0);
                ConstraintSetBuilder.Side side39 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(b8, C3, f18, tse0.f(side39, side39, dVar, 0));
                break;
            case 14:
                dVar.e(-2);
                dVar.d(-2);
                ConstraintSetBuilder.Side side40 = ConstraintSetBuilder.Side.BOTTOM;
                dVar.b.w(dVar.a, side40.getSideId(), kjs0.b(48));
                Pair pair2 = new Pair(side40, ConstraintSetBuilder.Side.TOP);
                BadgedFloatingActionButton badgedFloatingActionButton = hbz0Var.A;
                m7e b9 = dVar.b(pair2, badgedFloatingActionButton);
                ConstraintSetBuilder.Side side41 = ConstraintSetBuilder.Side.START;
                m7e b10 = dVar.b(new Pair(side41, side41), badgedFloatingActionButton);
                ConstraintSetBuilder.Side side42 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(b9, b10, dVar.b(new Pair(side42, side42), badgedFloatingActionButton));
                break;
            default:
                dVar.e(0);
                dVar.d(-2);
                m7e b11 = dVar.b(new Pair(ConstraintSetBuilder.Side.TOP, ConstraintSetBuilder.Side.BOTTOM), hbz0Var.x);
                ConstraintSetBuilder.Side side43 = ConstraintSetBuilder.Side.START;
                m7e f19 = tse0.f(side43, side43, dVar, 0);
                ConstraintSetBuilder.Side side44 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(b11, f19, tse0.f(side44, side44, dVar, 0));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ gbz0(ConstraintSetBuilder constraintSetBuilder, hbz0 hbz0Var, int i) {
        this.a = i;
        this.b = constraintSetBuilder;
        this.c = hbz0Var;
    }
}
