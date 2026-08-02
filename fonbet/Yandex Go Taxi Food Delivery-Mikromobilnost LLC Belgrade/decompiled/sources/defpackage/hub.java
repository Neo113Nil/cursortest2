package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;

/* loaded from: classes12.dex */
public final class hub extends mw01 {
    public static final hub a = new hub();

    @Override // defpackage.mw01
    public final String a() {
        return "CircleCenterCropTransformation";
    }

    @Override // defpackage.mw01
    public final Bitmap b(Bitmap bitmap, xis0 xis0Var) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        okj okjVar = xis0Var.a;
        int i = okjVar instanceof kkj ? ((kkj) okjVar).a : width;
        okj okjVar2 = xis0Var.b;
        int min = Math.min(i, okjVar2 instanceof kkj ? ((kkj) okjVar2).a : height);
        float f = min;
        float f2 = width;
        float max = Math.max(f / f2, f / height);
        int b = m810.b(f2 * max);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate(-((b - min) / 2.0f), -((m810.b(r0 * max) - min) / 2.0f));
        Bitmap createBitmap = Bitmap.createBitmap(min, min, bb1.e(bitmap));
        Paint paint = new Paint(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f3 = f / 2.0f;
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawCircle(f3, f3, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }
}
