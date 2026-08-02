package xsna;

import android.animation.ValueAnimator;
import android.util.Size;
import android.view.KeyEvent;
import android.view.View;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vkontakte.android.ui.layout.ExpandableBarLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class b8q implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ b8q(KeyEvent.Callback callback, int i) {
        this.b = i;
        this.c = callback;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        KeyEvent.Callback callback = this.c;
        switch (i) {
            case 0:
                ExpandableBarLayout expandableBarLayout = (ExpandableBarLayout) callback;
                int i2 = ExpandableBarLayout.m;
                expandableBarLayout.getClass();
                float animatedFraction = valueAnimator.getAnimatedFraction();
                izs<Float, s3q0> izsVar = expandableBarLayout.g;
                if (izsVar != null) {
                    izsVar.invoke(Float.valueOf(animatedFraction));
                }
                expandableBarLayout.f.setAlpha((int) (animatedFraction * 102.0f));
                expandableBarLayout.invalidate();
                break;
            case 1:
                com.vk.story.viewer.impl.presentation.stories.c cVar = (com.vk.story.viewer.impl.presentation.stories.c) callback;
                cVar.getClass();
                cVar.p.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                ((View) callback).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                VkScreenSpinner vkScreenSpinner = (VkScreenSpinner) callback;
                int i3 = VkScreenSpinner.i;
                Size size = (Size) valueAnimator.getAnimatedValue();
                vkScreenSpinner.getLayoutParams().width = size.getWidth();
                vkScreenSpinner.getLayoutParams().height = size.getHeight();
                vkScreenSpinner.requestLayout();
                break;
        }
    }
}
