package xsna;

import android.animation.ValueAnimator;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.search.fragment.DiscoverSearchFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class p6n implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p6n(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = DiscoverSearchFragment.s0;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                VkSearchView vkSearchView = ((DiscoverSearchFragment) obj).k0;
                if (vkSearchView != null) {
                    BaseVkSearchView.d5(vkSearchView, 0, intValue, 11);
                    break;
                }
                break;
            case 1:
                com.vk.sharing.core.view.f.X0((com.vk.sharing.core.view.f) obj, valueAnimator);
                break;
            default:
                nxt0 nxt0Var = (nxt0) obj;
                nxt0Var.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                nxt0Var.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                nxt0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
