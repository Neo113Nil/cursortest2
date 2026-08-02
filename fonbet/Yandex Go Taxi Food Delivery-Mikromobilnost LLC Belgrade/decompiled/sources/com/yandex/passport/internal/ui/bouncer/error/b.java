package com.yandex.passport.internal.ui.bouncer.error;

import android.util.DisplayMetrics;
import com.lightside.visum.layouts.constraint.ConstraintSetBuilder;
import com.yandex.passport.internal.ui.bouncer.roundabout.w;
import defpackage.n7e;
import defpackage.p7e;
import defpackage.tls;
import defpackage.uc20;
import defpackage.uw51;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConstraintSetBuilder b;

    public /* synthetic */ b(int i, ConstraintSetBuilder constraintSetBuilder) {
        this.a = i;
        this.b = constraintSetBuilder;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ConstraintSetBuilder constraintSetBuilder = this.b;
        com.lightside.visum.layouts.constraint.c cVar = (com.lightside.visum.layouts.constraint.c) obj;
        switch (i) {
            case 0:
                cVar.d(-2);
                cVar.c(-2);
                ConstraintSetBuilder.Side side = ConstraintSetBuilder.Side.TOP;
                n7e d = uw51.d(side, side, cVar, 0);
                DisplayMetrics displayMetrics = uc20.a;
                int i2 = (int) (displayMetrics.density * 3.0f);
                constraintSetBuilder.getClass();
                p7e B = ConstraintSetBuilder.B(d, i2);
                ConstraintSetBuilder.Side side2 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(B, ConstraintSetBuilder.B(uw51.d(side2, side2, cVar, 0), (int) (3.0f * displayMetrics.density)));
                break;
            case 1:
                cVar.d(0);
                cVar.c(-2);
                ConstraintSetBuilder.Side side3 = ConstraintSetBuilder.Side.BOTTOM;
                n7e d2 = uw51.d(side3, side3, cVar, 0);
                int i3 = (int) (32.0f * uc20.a.density);
                constraintSetBuilder.getClass();
                p7e B2 = ConstraintSetBuilder.B(d2, i3);
                ConstraintSetBuilder.Side side4 = ConstraintSetBuilder.Side.START;
                n7e d3 = uw51.d(side4, side4, cVar, 0);
                ConstraintSetBuilder.Side side5 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(B2, d3, uw51.d(side5, side5, cVar, 0));
                break;
            case 2:
                DisplayMetrics displayMetrics2 = uc20.a;
                cVar.d((int) (displayMetrics2.density * 44.0f));
                cVar.c((int) (44.0f * displayMetrics2.density));
                ConstraintSetBuilder.Side side6 = ConstraintSetBuilder.Side.TOP;
                n7e d4 = uw51.d(side6, side6, cVar, 0);
                int i4 = (int) (displayMetrics2.density * 12.0f);
                constraintSetBuilder.getClass();
                p7e B3 = ConstraintSetBuilder.B(d4, i4);
                ConstraintSetBuilder.Side side7 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(B3, ConstraintSetBuilder.B(uw51.d(side7, side7, cVar, 0), (int) (12.0f * displayMetrics2.density)));
                break;
            case 3:
                cVar.d(-2);
                cVar.c(-2);
                ConstraintSetBuilder.Side side8 = ConstraintSetBuilder.Side.TOP;
                n7e d5 = uw51.d(side8, side8, cVar, 0);
                int i5 = (int) (36.0f * uc20.a.density);
                constraintSetBuilder.getClass();
                p7e B4 = ConstraintSetBuilder.B(d5, i5);
                ConstraintSetBuilder.Side side9 = ConstraintSetBuilder.Side.START;
                n7e d6 = uw51.d(side9, side9, cVar, 0);
                ConstraintSetBuilder.Side side10 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(B4, d6, uw51.d(side10, side10, cVar, 0));
                break;
            case 4:
                cVar.d(-2);
                cVar.c(-2);
                ConstraintSetBuilder.Side side11 = ConstraintSetBuilder.Side.TOP;
                n7e d7 = uw51.d(side11, side11, cVar, 0);
                int i6 = (int) (88.0f * uc20.a.density);
                constraintSetBuilder.getClass();
                p7e B5 = ConstraintSetBuilder.B(d7, i6);
                ConstraintSetBuilder.Side side12 = ConstraintSetBuilder.Side.START;
                n7e d8 = uw51.d(side12, side12, cVar, 0);
                ConstraintSetBuilder.Side side13 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(B5, d8, uw51.d(side13, side13, cVar, 0));
                break;
            case 5:
                int i7 = w.b;
                cVar.d(i7);
                cVar.c(i7);
                ConstraintSetBuilder.Side side14 = ConstraintSetBuilder.Side.TOP;
                n7e d9 = uw51.d(side14, side14, cVar, 0);
                DisplayMetrics displayMetrics3 = uc20.a;
                int i8 = (int) (displayMetrics3.density * 12.0f);
                constraintSetBuilder.getClass();
                p7e B6 = ConstraintSetBuilder.B(d9, i8);
                ConstraintSetBuilder.Side side15 = ConstraintSetBuilder.Side.START;
                constraintSetBuilder.z(B6, ConstraintSetBuilder.B(uw51.d(side15, side15, cVar, 0), (int) (12.0f * displayMetrics3.density)));
                break;
            default:
                cVar.d(0);
                cVar.c(0);
                ConstraintSetBuilder.Side side16 = ConstraintSetBuilder.Side.TOP;
                n7e d10 = uw51.d(side16, side16, cVar, 0);
                ConstraintSetBuilder.Side side17 = ConstraintSetBuilder.Side.BOTTOM;
                n7e d11 = uw51.d(side17, side17, cVar, 0);
                ConstraintSetBuilder.Side side18 = ConstraintSetBuilder.Side.START;
                n7e d12 = uw51.d(side18, side18, cVar, 0);
                ConstraintSetBuilder.Side side19 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(d10, d11, d12, uw51.d(side19, side19, cVar, 0));
                break;
        }
        return zy11Var;
    }
}
