package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* loaded from: classes10.dex */
public class p69 extends i16 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(khx.a);

    @Override // defpackage.khx
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.i16
    public final Bitmap c(b16 b16Var, Bitmap bitmap, int i, int i2) {
        Paint paint = sw01.a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            Log.isLoggable("TransformationUtils", 2);
            return sw01.b(b16Var, bitmap, i, i2);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    @Override // defpackage.khx
    public final boolean equals(Object obj) {
        return obj instanceof p69;
    }

    @Override // defpackage.khx
    public final int hashCode() {
        return -670243078;
    }
}
