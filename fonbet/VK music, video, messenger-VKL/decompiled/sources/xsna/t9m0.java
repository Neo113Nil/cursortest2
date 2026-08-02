package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stories.design.view.PrivacyHintView;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: StoryPrivacyHint.kt */
/* loaded from: classes16.dex */
public interface t9m0 {
    void H(int i);

    void b(boolean z);

    default void c() {
        h(false);
    }

    default void d() {
        h(true);
    }

    boolean f();

    default void h(final boolean z) {
        if (z && f()) {
            return;
        }
        if (z || f()) {
            TextView textView = i().c;
            if (textView == null) {
                textView = null;
            }
            if (textView.getText().length() <= 0) {
                bwt0.p0(i(), false);
                b(false);
                return;
            }
            if (z) {
                bwt0.p0(i(), true);
                b(true);
            } else {
                b(false);
            }
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            int measuredHeight = i().getMeasuredHeight();
            ref$IntRef.element = measuredHeight;
            if (measuredHeight == 0) {
                i().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                ref$IntRef.element = i().getMeasuredHeight();
            }
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f2 = z ? ref$IntRef.element : 0.0f;
            if (!z) {
                f = ref$IntRef.element;
            }
            long j = z ? 200L : 100L;
            i().setTranslationY(f2);
            i().animate().translationY(f).setDuration(j).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.s9m0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.H(an10.b((z ? -valueAnimator.getAnimatedFraction() : valueAnimator.getAnimatedFraction() - 1.0f) * ref$IntRef.element));
                }
            }).start();
        }
    }

    PrivacyHintView i();
}
