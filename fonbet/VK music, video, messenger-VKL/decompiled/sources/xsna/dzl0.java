package xsna;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: StoryBottomAnimationHelper.kt */
/* loaded from: classes6.dex */
public final class dzl0 {
    public static void a(View view, float f, float f2) {
        view.setScaleX(f);
        view.setScaleY(f);
        ValueAnimator duration = ValueAnimator.ofFloat(f, f2).setDuration(100L);
        duration.addUpdateListener(new hm7(view, f2));
        duration.start();
    }
}
