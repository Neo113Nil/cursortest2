package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import xsna.yuj;

/* compiled from: HardEdgesCornersDecoration.kt */
/* loaded from: classes4.dex */
public final class ytu extends yuj {
    public static final a6t j = new a6t(new uzt0(6), new bvj(6));
    public static final a6t k = new a6t(new uzt0(9), new bvj(9));

    @Override // xsna.yuj
    public final void l(Canvas canvas, yuj.a aVar) {
        xso0 xso0Var = aVar.b;
        RectF rectF = aVar.a;
        float f = aVar.f;
        int i = aVar.c;
        int i2 = aVar.d;
        Paint paint = aVar.h;
        int i3 = ((int) ((f * 2.0f) + 0.5f)) / 2;
        int i4 = (int) (aVar.g + 0.5f);
        float f2 = rectF.left;
        float f3 = i4;
        canvas.drawRect(f2, (i == 0 ? i4 : i3) + rectF.top, f2 + f3, rectF.bottom - (i == 0 ? i4 : i3), paint);
        float f4 = (i == 0 ? 0 : i3) + rectF.left;
        float f5 = rectF.top;
        int i5 = i2 - 1;
        canvas.drawRect(f4, f5, rectF.right - (i == i5 ? 0 : i3), f5 + f3, paint);
        float f6 = rectF.right;
        float f7 = f6 - f3;
        float f8 = (i == i5 ? i4 : i3) + rectF.top;
        float f9 = rectF.bottom;
        if (i != i5) {
            i4 = i3;
        }
        canvas.drawRect(f7, f8, f6, f9 - i4, paint);
        float f10 = (i == 0 ? 0 : i3) + rectF.left;
        float f11 = rectF.bottom;
        float f12 = f11 - f3;
        float f13 = rectF.right;
        if (i == i5) {
            i3 = 0;
        }
        canvas.drawRect(f10, f12, f13 - i3, f11, paint);
        int i6 = aVar.c;
        a6t a6tVar = j;
        a6t a6tVar2 = k;
        if (i6 == 0) {
            if (aVar.e) {
                a6tVar = a6tVar2;
            }
            xso0Var.b(canvas, rectF, a6tVar);
        } else {
            if (i6 != aVar.d - 1) {
                xso0Var.b(canvas, rectF, xso0.i);
                return;
            }
            if (!aVar.e) {
                a6tVar = a6tVar2;
            }
            xso0Var.b(canvas, rectF, a6tVar);
        }
    }
}
