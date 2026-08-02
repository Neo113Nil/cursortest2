package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* loaded from: classes12.dex */
public final class odr extends mw01 {
    public static final odr a = new odr();

    @Override // defpackage.mw01
    public final String a() {
        return "FitCenterTransformation";
    }

    @Override // defpackage.mw01
    public final Bitmap b(Bitmap bitmap, xis0 xis0Var) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        okj okjVar = xis0Var.a;
        int i = okjVar instanceof kkj ? ((kkj) okjVar).a : width;
        okj okjVar2 = xis0Var.b;
        int i2 = okjVar2 instanceof kkj ? ((kkj) okjVar2).a : height;
        if (width == i && height == i2) {
            return bitmap;
        }
        float f = width;
        float f2 = height;
        float min = Math.min(f / f, f2 / f2);
        int b = m810.b(f * min);
        int b2 = m810.b(f2 * min);
        Matrix matrix = new Matrix();
        matrix.postScale(min, min);
        Bitmap createBitmap = Bitmap.createBitmap(b, b2, bb1.e(bitmap));
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, matrix, new Paint(3));
        canvas.setBitmap(null);
        return createBitmap;
    }
}
