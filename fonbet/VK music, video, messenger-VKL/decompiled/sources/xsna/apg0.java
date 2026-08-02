package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import xsna.yuj;

/* compiled from: RoundedCornersDecoration.kt */
/* loaded from: classes4.dex */
public final class apg0 extends yuj {
    @Override // xsna.yuj
    public final void l(Canvas canvas, yuj.a aVar) {
        xso0 xso0Var = aVar.b;
        RectF rectF = aVar.a;
        float f = aVar.f;
        xso0Var.b(canvas, rectF, xso0.i);
        Paint paint = aVar.h;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(aVar.g);
        canvas.drawRoundRect(rectF, f, f, paint);
    }
}
