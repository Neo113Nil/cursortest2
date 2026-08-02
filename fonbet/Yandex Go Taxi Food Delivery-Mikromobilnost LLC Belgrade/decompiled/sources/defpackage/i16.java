package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;

/* loaded from: classes10.dex */
public abstract class i16 implements nw01 {
    @Override // defpackage.nw01
    public final otj0 b(Context context, otj0 otj0Var, int i, int i2) {
        if (!pw21.m(i, i2)) {
            ny61.g(b64.d(i, i2, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
            return null;
        }
        b16 bitmapPool = Glide.get(context).getBitmapPool();
        Bitmap bitmap = (Bitmap) otj0Var.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap c = c(bitmapPool, bitmap, i, i2);
        return bitmap.equals(c) ? otj0Var : h16.c(bitmapPool, c);
    }

    public abstract Bitmap c(b16 b16Var, Bitmap bitmap, int i, int i2);
}
