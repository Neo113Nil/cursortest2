package yads;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes10.dex */
public final class u10 {
    public final View a;
    public final RectF b;
    public final Path c;
    public final float[] d;

    public /* synthetic */ u10(View view, float f, float f2, float f3, float f4) {
        this(view, f, f2, f3, f4, new RectF(), new Path());
    }

    public static float[] a(float f, float f2, float f3, float f4) {
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return new float[]{f, f, f2, f2, f3, f3, f4, f4};
        }
        return null;
    }

    public final void a() {
        if (this.d != null) {
            int measuredWidth = this.a.getMeasuredWidth();
            int measuredHeight = this.a.getMeasuredHeight();
            int paddingLeft = this.a.getPaddingLeft();
            int paddingTop = this.a.getPaddingTop();
            int paddingRight = measuredWidth - this.a.getPaddingRight();
            int paddingBottom = measuredHeight - this.a.getPaddingBottom();
            if (paddingLeft >= paddingRight || paddingTop >= paddingBottom) {
                return;
            }
            this.b.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
            this.c.reset();
            this.c.addRoundRect(this.b, this.d, Path.Direction.CW);
        }
    }

    public u10(View view, float f, float f2, float f3, float f4, RectF rectF, Path path) {
        this.a = view;
        this.b = rectF;
        this.c = path;
        this.d = a(f, f2, f3, f4);
    }
}
