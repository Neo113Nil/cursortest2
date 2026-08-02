package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes15.dex */
public final class nds0 {
    public Drawable a;
    public final Rect b = new Rect();
    public final RectF c = new RectF();
    public final Paint d;

    public nds0() {
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.d = paint;
    }
}
