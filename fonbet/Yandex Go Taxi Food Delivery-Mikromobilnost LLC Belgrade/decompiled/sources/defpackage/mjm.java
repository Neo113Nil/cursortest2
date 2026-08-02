package defpackage;

import android.animation.ValueAnimator;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.RideCardDriverSectionView;

/* loaded from: classes14.dex */
public final /* synthetic */ class mjm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pjm b;
    public final /* synthetic */ float c;

    public /* synthetic */ mjm(pjm pjmVar, float f, int i) {
        this.a = i;
        this.b = pjmVar;
        this.c = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        int i2;
        int i3 = this.a;
        float f = this.c;
        pjm pjmVar = this.b;
        switch (i3) {
            case 0:
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sue0 sue0Var = pjmVar.a;
                i = ((RideCardDriverSectionView) sue0Var.b).originalHeight;
                RideCardDriverSectionView rideCardDriverSectionView = (RideCardDriverSectionView) sue0Var.b;
                rideCardDriverSectionView.setTargetHeight(Integer.valueOf((int) (i * floatValue)));
                rideCardDriverSectionView.setAlpha(y6i0.c(f, 0.0f, 1.0f) * floatValue);
                rideCardDriverSectionView.requestLayout();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sue0 sue0Var2 = pjmVar.a;
                i2 = ((RideCardDriverSectionView) sue0Var2.b).originalHeight;
                RideCardDriverSectionView rideCardDriverSectionView2 = (RideCardDriverSectionView) sue0Var2.b;
                rideCardDriverSectionView2.setTargetHeight(Integer.valueOf((int) (i2 * floatValue2)));
                rideCardDriverSectionView2.setAlpha(y6i0.c(floatValue2, 0.0f, f));
                rideCardDriverSectionView2.requestLayout();
                break;
        }
    }
}
