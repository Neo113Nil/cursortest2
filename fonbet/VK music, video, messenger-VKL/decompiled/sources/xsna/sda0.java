package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import com.vk.attachpicker.a;
import com.vkontakte.android.R;
import com.yandex.div.internal.widget.slider.SliderView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class sda0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sda0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                com.vk.attachpicker.a aVar = (com.vk.attachpicker.a) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a.b bVar = aVar.a;
                bVar.e.setAlpha(1 - floatValue);
                bVar.f.setAlpha(floatValue);
                break;
            case 1:
                ((dhh) this.c).invoke((Float) valueAnimator.getAnimatedValue());
                break;
            case 2:
                f3r f3rVar = (f3r) this.c;
                f3rVar.setScale(((Float) valueAnimator.getAnimatedValue()).floatValue());
                f3rVar.setTranslationY(y5f0.h);
                break;
            case 3:
                SliderView.trySetThumbSecondaryValue$lambda$5$lambda$4((SliderView) this.c, valueAnimator);
                break;
            default:
                d0w0 d0w0Var = (d0w0) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                com.vk.libvideo.design.view.swipe.layout.a aVar2 = d0w0Var.d;
                View view = d0w0Var.b;
                awt0.x(aVar2, 0, 0, bwt0.y(R.dimen.video_right_promo_container_width, view) - ((int) floatValue2), 0, 11);
                view.setTranslationX(floatValue2);
                break;
        }
    }
}
