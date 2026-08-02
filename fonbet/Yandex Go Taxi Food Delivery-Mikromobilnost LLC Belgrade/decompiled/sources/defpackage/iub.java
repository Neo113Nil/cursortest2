package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* loaded from: classes10.dex */
public final class iub implements pw01 {
    public final String a = iub.class.getName();

    @Override // defpackage.pw01
    public final String a() {
        return this.a;
    }

    @Override // defpackage.pw01
    public final Bitmap b(Bitmap bitmap, wis0 wis0Var) {
        Paint paint = new Paint(3);
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f = min / 2.0f;
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, min, config);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f - (bitmap.getWidth() / 2.0f), f - (bitmap.getHeight() / 2.0f), paint);
        return createBitmap;
    }

    public final boolean equals(Object obj) {
        return obj instanceof iub;
    }

    public final int hashCode() {
        return iub.class.hashCode();
    }
}
