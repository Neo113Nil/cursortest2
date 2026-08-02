package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class os6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ os6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = BaseVkSearchView.P;
                f4m.s(((Integer) valueAnimator.getAnimatedValue()).intValue(), ((BaseVkSearchView) obj).B);
                break;
            case 1:
                uwt0.a(((Integer) valueAnimator.getAnimatedValue()).intValue(), (View) obj);
                break;
            case 2:
                ((y6u0) obj).b.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                d0w0 d0w0Var = (d0w0) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                com.vk.libvideo.design.view.swipe.layout.a aVar = d0w0Var.d;
                FrameLayout frameLayout = d0w0Var.c;
                qcy<Object>[] qcyVarArr = bwt0.a;
                awt0.x(aVar, 0, 0, 0, ((int) frameLayout.getResources().getDimension(R.dimen.video_bottom_promo_container_width)) - ((int) floatValue), 7);
                frameLayout.setTranslationY(floatValue);
                break;
        }
    }
}
