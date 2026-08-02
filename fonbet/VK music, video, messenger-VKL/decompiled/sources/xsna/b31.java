package xsna;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.vk.libvideo.ui.ad.AdvertBannerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b31(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                AdvertBannerView advertBannerView = (AdvertBannerView) this.c;
                ViewGroup.LayoutParams layoutParams = advertBannerView.getLayoutParams();
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                advertBannerView.setLayoutParams(layoutParams);
                break;
            case 1:
                ((xn2) this.c).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                com.vk.attachpicker.screen.p pVar = (com.vk.attachpicker.screen.p) this.c;
                pVar.getClass();
                pVar.H(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
