package defpackage;

import android.animation.ValueAnimator;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.go.taxi.order.bubble.a;

/* loaded from: classes14.dex */
public final /* synthetic */ class if2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ if2(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue(CaretView.ALPHA_PROPERTY)).floatValue();
                aVar.y.A(floatValue);
                if (floatValue == 0.0f) {
                    aVar.d();
                    break;
                }
                break;
            default:
                aVar.y.A(((Float) valueAnimator.getAnimatedValue(CaretView.ALPHA_PROPERTY)).floatValue());
                break;
        }
    }
}
