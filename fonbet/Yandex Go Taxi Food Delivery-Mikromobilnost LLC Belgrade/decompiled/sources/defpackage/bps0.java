package defpackage;

import android.animation.ValueAnimator;
import ru.yandex.taxi.design.SliderButtonView;

/* loaded from: classes5.dex */
public final /* synthetic */ class bps0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SliderButtonView b;

    public /* synthetic */ bps0(SliderButtonView sliderButtonView, int i) {
        this.a = i;
        this.b = sliderButtonView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        SliderButtonView sliderButtonView = this.b;
        switch (i) {
            case 0:
                sliderButtonView.updateUiState();
                break;
            case 1:
                SliderButtonView.hideToggleButton$lambda$0$0(sliderButtonView, valueAnimator);
                break;
            case 2:
                sliderButtonView.updateUiState();
                break;
            case 3:
                sliderButtonView.updateUiState();
                break;
            default:
                sliderButtonView.updateUiState();
                break;
        }
    }
}
