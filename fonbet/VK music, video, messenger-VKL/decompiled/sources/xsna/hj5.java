package xsna;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AutoRotateDrawable.java */
/* loaded from: classes12.dex */
public final class hj5 extends j9s implements Runnable {
    public final int f;
    public final boolean g;
    public float h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj5(Drawable drawable, int i) {
        super(drawable);
        drawable.getClass();
        this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.i = false;
        this.f = i;
        this.g = true;
    }

    @Override // xsna.j9s, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.h;
        if (!this.g) {
            f = 360.0f - f;
        }
        canvas.rotate(f, (i / 2) + r3, (i2 / 2) + r1);
        super.draw(canvas);
        canvas.restoreToCount(save);
        if (this.i) {
            return;
        }
        this.i = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i = false;
        this.h += (int) ((20.0f / this.f) * 360.0f);
        invalidateSelf();
    }
}
