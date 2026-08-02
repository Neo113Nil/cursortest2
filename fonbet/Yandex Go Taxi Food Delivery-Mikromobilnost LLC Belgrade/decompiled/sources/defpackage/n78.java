package defpackage;

import android.animation.ValueAnimator;
import com.yandex.go.taxi.order.search.ui.bubbles.CarPollingBubbleView;

/* loaded from: classes14.dex */
public final /* synthetic */ class n78 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CarPollingBubbleView b;

    public /* synthetic */ n78(CarPollingBubbleView carPollingBubbleView, int i) {
        this.a = i;
        this.b = carPollingBubbleView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        CarPollingBubbleView carPollingBubbleView = this.b;
        switch (i) {
            case 0:
                CarPollingBubbleView.alphaAnimator$lambda$0(carPollingBubbleView, valueAnimator);
                break;
            case 1:
                CarPollingBubbleView.scaleAnimator$lambda$0(carPollingBubbleView, valueAnimator);
                break;
            default:
                CarPollingBubbleView._init_$lambda$0(carPollingBubbleView, valueAnimator);
                break;
        }
    }
}
