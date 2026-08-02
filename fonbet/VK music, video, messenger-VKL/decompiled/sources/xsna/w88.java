package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.vk.search.fragment.DiscoverSearchFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class w88 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ w88(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.setLayoutParams(layoutParams);
                break;
            case 1:
                int i2 = DiscoverSearchFragment.s0;
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                com.vk.sharing.core.view.f.T0((com.vk.sharing.core.view.f) view, valueAnimator);
                break;
        }
    }
}
