package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;

/* compiled from: DrawingCanvasImpl.kt */
/* loaded from: classes4.dex */
public final class nlo implements mlo {
    public final pb7 b;
    public final Paint c;

    public nlo(pb7 pb7Var) {
        this.b = pb7Var;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.c = paint;
    }

    @Override // xsna.mlo
    public final void b(izs<? super Canvas, s3q0> izsVar) {
        this.b.c(izsVar);
    }

    @Override // xsna.mlo
    public final void clear() {
        pb7 pb7Var = this.b;
        pb7Var.b();
        Canvas canvas = pb7Var.b;
        if (canvas != null) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
