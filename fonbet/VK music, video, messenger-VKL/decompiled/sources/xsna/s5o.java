package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: DotDrawableWrapper.kt */
/* loaded from: classes17.dex */
public final class s5o extends alo {
    public final Rect b;
    public final float c;
    public final Paint d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5o(Drawable drawable, Rect rect, int i) {
        super(drawable);
        float b = iah0.b(3.0f);
        this.b = rect;
        this.c = b;
        Paint c = x9.c(true);
        c.setStyle(Paint.Style.FILL);
        c.setColor(i);
        c.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.d = c;
        this.e = true;
    }

    @Override // xsna.alo, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.e) {
            float intrinsicWidth = this.a.getIntrinsicWidth();
            float f = this.c;
            Rect rect = this.b;
            canvas.drawCircle((intrinsicWidth - f) - rect.right, rect.top + f, f, this.d);
        }
    }
}
