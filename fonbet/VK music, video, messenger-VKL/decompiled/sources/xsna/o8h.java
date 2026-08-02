package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.common.view.DotsIndicatorView;
import com.vk.content.design.view.camera.ShutterButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class o8h implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o8h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                com.vk.profile.community.impl.ui.cover.redesign.delegate.a aVar = (com.vk.profile.community.impl.ui.cover.redesign.delegate.a) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aVar.c(floatValue);
                if (!aVar.n.b) {
                    floatValue = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                aVar.a.a(floatValue);
                break;
            case 1:
                DotsIndicatorView dotsIndicatorView = (DotsIndicatorView) this.c;
                dotsIndicatorView.n.setColor(n8g.d(valueAnimator.getAnimatedFraction(), dotsIndicatorView.g, dotsIndicatorView.u));
                dotsIndicatorView.invalidate();
                break;
            case 2:
                com.vk.im.video.e eVar = (com.vk.im.video.e) this.c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ConstraintLayout constraintLayout = eVar.n;
                if (constraintLayout == null) {
                    constraintLayout = null;
                }
                bwt0.m0(intValue, intValue, constraintLayout);
                break;
            case 3:
                ShutterButton shutterButton = (ShutterButton) this.c;
                shutterButton.setPivotX(shutterButton.H.n0);
                shutterButton.setPivotY(shutterButton.H.o0);
                shutterButton.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue() + 1.0f);
                shutterButton.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue() + 1.0f);
                break;
            default:
                View view = (View) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view.setAlpha(floatValue2);
                view.setScaleY(floatValue2);
                view.setScaleX(floatValue2);
                break;
        }
    }
}
