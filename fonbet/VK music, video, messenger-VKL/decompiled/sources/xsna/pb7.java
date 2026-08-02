package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.util.Log;

/* compiled from: BitmapCanvas.kt */
/* loaded from: classes4.dex */
public final class pb7 {
    public Bitmap a;
    public Canvas b;
    public Integer c;
    public Integer d;
    public boolean e = true;
    public boolean f = true;

    public final void a(int i, int i2) {
        this.d = Integer.valueOf(i);
        this.c = Integer.valueOf(i2);
        this.f = false;
        this.e = true;
    }

    public final void b() {
        Bitmap bitmap;
        Integer num = this.d;
        if (num != null) {
            int intValue = num.intValue();
            Integer num2 = this.c;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                if (!this.e || intValue <= 0 || intValue2 <= 0) {
                    return;
                }
                Bitmap bitmap2 = this.a;
                boolean z = bitmap2 == null || bitmap2.isRecycled();
                Bitmap bitmap3 = this.a;
                boolean z2 = bitmap3 == null || intValue != bitmap3.getWidth() || (bitmap = this.a) == null || intValue2 != bitmap.getHeight();
                if (z || this.f || z2) {
                    try {
                        Bitmap bitmap4 = this.a;
                        this.a = null;
                        this.b = null;
                        if (bitmap4 != null) {
                            bitmap4.recycle();
                        }
                        Bitmap b = n3p.b(intValue, intValue2);
                        this.a = b;
                        this.b = new Canvas(b);
                    } catch (Throwable th) {
                        Log.e("BitmapCanvas", "cannot create bitmap", th);
                        n4p n4pVar = f370.e;
                        if (n4pVar != null) {
                            n4pVar.a(th);
                            s3q0 s3q0Var = s3q0.a;
                        }
                    }
                }
                Canvas canvas = this.b;
                if (canvas != null) {
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                }
                this.e = this.a == null;
            }
        }
    }

    public final void c(izs<? super Canvas, s3q0> izsVar) {
        b();
        Canvas canvas = this.b;
        if (canvas != null) {
            izsVar.invoke(canvas);
        }
    }
}
