package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* loaded from: classes10.dex */
public class n69 extends i16 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(khx.a);

    @Override // defpackage.khx
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.i16
    public final Bitmap c(b16 b16Var, Bitmap bitmap, int i, int i2) {
        float width;
        float a;
        Paint paint = sw01.a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            f = oyr.a(bitmap.getWidth(), width, i, 0.5f);
            a = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            a = oyr.a(bitmap.getHeight(), width, i2, 0.5f);
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f + 0.5f), (int) (a + 0.5f));
        Bitmap f2 = b16Var.f(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        f2.setHasAlpha(bitmap.hasAlpha());
        sw01.a(bitmap, f2, matrix);
        return f2;
    }

    @Override // defpackage.khx
    public final boolean equals(Object obj) {
        return obj instanceof n69;
    }

    @Override // defpackage.khx
    public final int hashCode() {
        return -599754482;
    }
}
