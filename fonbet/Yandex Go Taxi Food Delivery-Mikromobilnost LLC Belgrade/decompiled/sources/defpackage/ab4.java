package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import com.yandex.messaging.internal.avatar.AvatarPlaceholderDrawable;

/* loaded from: classes15.dex */
public final class ab4 {
    public final ymu a;

    public ab4(ymu ymuVar) {
        this.a = ymuVar;
    }

    public static Paint a(Bitmap bitmap, int i) {
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        paint.setColor(-1);
        paint.setAlpha(255);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        float f = i;
        matrix.preScale(f / bitmap.getWidth(), f / bitmap.getHeight());
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        return paint;
    }

    public static AvatarPlaceholderDrawable b(ab4 ab4Var, String str, String str2, jb4 jb4Var, int i) {
        if ((i & 8) != 0) {
            jb4Var = hb4.a;
        }
        return ab4Var.a.l(str, str2, null, jb4Var);
    }
}
