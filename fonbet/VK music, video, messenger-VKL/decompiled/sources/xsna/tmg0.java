package xsna;

import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;

/* compiled from: RotatableContainer.kt */
/* loaded from: classes7.dex */
public interface tmg0 extends j6m {
    List<View> getAnimatedViewsToRotate();

    List<View> getViewsToRotate();

    @Override // xsna.j6m
    default void v0(final float f) {
        Iterator<T> it = getViewsToRotate().iterator();
        while (it.hasNext()) {
            ((View) it.next()).setRotation(f);
        }
        List<View> animatedViewsToRotate = getAnimatedViewsToRotate();
        if (animatedViewsToRotate.isEmpty()) {
            return;
        }
        float rotation = ((View) j5g.Y(animatedViewsToRotate)).getRotation();
        float f2 = 360;
        float f3 = (rotation % f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f == 270.0f) ? -90.0f : (rotation == 270.0f && f % f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 360.0f : f;
        for (final View view : animatedViewsToRotate) {
            view.animate().rotation(f3).setDuration(300L).setInterpolator(new OvershootInterpolator(4.0f)).withEndAction(new Runnable() { // from class: xsna.umg0
                @Override // java.lang.Runnable
                public final void run() {
                    view.setRotation(f);
                }
            }).start();
        }
    }
}
