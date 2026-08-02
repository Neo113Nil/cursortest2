package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate;
import com.vk.search.fragment.DiscoverSearchFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class o6n implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o6n(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) obj2;
                int i2 = DiscoverSearchFragment.s0;
                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((View) obj).setLayoutParams(layoutParams);
                break;
            default:
                ((OnMediaUiComponentAnimationDelegate.c) obj2).a = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((OnMediaUiComponentAnimationDelegate) obj).a.invoke();
                break;
        }
    }
}
