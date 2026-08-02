package xsna;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.spinner.VkSpinner;
import xsna.xn6;

/* compiled from: ProgressSpinnerDrawable.kt */
/* loaded from: classes.dex */
public final class m3e0 extends xn6 {
    public VkSpinner.IndicatorDirection d = VkSpinner.IndicatorDirection.Clockwise;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        try {
            if (this.d == VkSpinner.IndicatorDirection.CounterClockwise) {
                canvas.scale(-1.0f, 1.0f, bounds.exactCenterX(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            this.b.a(canvas, bounds);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        xn6.a aVar = this.b;
        aVar.a = -0.25f;
        aVar.b = (i / 10000.0f) - 0.25f;
        invalidateSelf();
        return true;
    }
}
