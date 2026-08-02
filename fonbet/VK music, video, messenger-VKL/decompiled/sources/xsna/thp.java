package xsna;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: EmptySwipeStrategy.kt */
/* loaded from: classes17.dex */
public final class thp extends bp6 {
    @Override // xsna.dmn0
    public final void a(View view, MotionEvent motionEvent) {
        this.b.invoke(motionEvent);
    }

    @Override // xsna.bp6
    public final long c() {
        return 0L;
    }

    @Override // xsna.bp6
    public final float d(View view) {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.dmn0
    public final void b(View view, MotionEvent motionEvent) {
    }

    @Override // xsna.bp6
    public final void e(View view, ValueAnimator valueAnimator) {
    }
}
