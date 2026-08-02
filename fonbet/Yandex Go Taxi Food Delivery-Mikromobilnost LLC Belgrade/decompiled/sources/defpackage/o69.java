package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* loaded from: classes12.dex */
public final class o69 extends mw01 {
    public static final o69 a = new o69();

    @Override // defpackage.mw01
    public final String a() {
        return "CenterCropTransformation";
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
        float max = Math.max(i / f, i2 / height);
        int b = m810.b(f * max);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate(-((b - i) / 2.0f), -((m810.b(r0 * max) - i2) / 2.0f));
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, bb1.e(bitmap));
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, matrix, new Paint(3));
        canvas.setBitmap(null);
        return createBitmap;
    }
}
