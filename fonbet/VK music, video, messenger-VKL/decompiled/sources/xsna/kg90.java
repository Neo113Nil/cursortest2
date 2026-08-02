package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;

/* compiled from: PaintManager.kt */
/* loaded from: classes5.dex */
public final class kg90 {
    public static final Paint.Style b = Paint.Style.FILL;
    public static final float c = (float) Math.floor(Resources.getSystem().getDisplayMetrics().density * 16);
    public final Context a;

    public kg90(Context context) {
        this.a = context;
    }

    public static Paint a(kg90 kg90Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = -16711936;
        }
        Paint paint = new Paint();
        paint.setStyle(b);
        paint.setColor(i);
        paint.setTextSize(c);
        return paint;
    }
}
