package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.yandex.go.taxi.order.map.curtain.floating.button.OrderMapCurtainHideFloatingButtonView;

/* loaded from: classes14.dex */
public final class jz70 implements hz70 {
    public final /* synthetic */ OrderMapCurtainHideFloatingButtonView a;

    public jz70(OrderMapCurtainHideFloatingButtonView orderMapCurtainHideFloatingButtonView) {
        this.a = orderMapCurtainHideFloatingButtonView;
    }

    @Override // defpackage.hz70
    public final void A5() {
        final OrderMapCurtainHideFloatingButtonView orderMapCurtainHideFloatingButtonView = this.a;
        cma1.P(orderMapCurtainHideFloatingButtonView).e(new AnimatorListenerAdapter() { // from class: com.yandex.go.taxi.order.map.curtain.floating.button.OrderMapCurtainHideFloatingButtonView$InnerMvpView$hideFloatingButtonAnimated$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                OrderMapCurtainHideFloatingButtonView.this.setVisibility(8);
            }
        });
    }

    @Override // defpackage.hz70
    public final void p5(iz70 iz70Var) {
        String str = iz70Var.a;
        OrderMapCurtainHideFloatingButtonView orderMapCurtainHideFloatingButtonView = this.a;
        orderMapCurtainHideFloatingButtonView.setTitle(str);
        orderMapCurtainHideFloatingButtonView.setContentDescription(iz70Var.b);
    }

    @Override // defpackage.hz70
    public final void ud() {
        OrderMapCurtainHideFloatingButtonView orderMapCurtainHideFloatingButtonView = this.a;
        orderMapCurtainHideFloatingButtonView.setVisibility(0);
        cma1.P(orderMapCurtainHideFloatingButtonView).f(null);
    }
}
