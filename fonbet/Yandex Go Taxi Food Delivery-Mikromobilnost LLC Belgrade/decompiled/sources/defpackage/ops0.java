package defpackage;

import android.animation.ValueAnimator;
import com.yandex.div.internal.widget.slider.SliderView;

/* loaded from: classes11.dex */
public final /* synthetic */ class ops0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SliderView b;

    public /* synthetic */ ops0(SliderView sliderView, int i) {
        this.a = i;
        this.b = sliderView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        SliderView sliderView = this.b;
        switch (i) {
            case 0:
                SliderView.trySetThumbValue$lambda$3$lambda$2(sliderView, valueAnimator);
                break;
            default:
                SliderView.trySetThumbSecondaryValue$lambda$5$lambda$4(sliderView, valueAnimator);
                break;
        }
    }
}
