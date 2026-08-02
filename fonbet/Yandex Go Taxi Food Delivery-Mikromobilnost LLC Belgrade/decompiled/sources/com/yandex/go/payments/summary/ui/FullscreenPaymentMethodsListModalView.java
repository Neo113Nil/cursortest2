package com.yandex.go.payments.summary.ui;

import android.content.Context;
import com.yandex.go.payments.paymentlist.domain.k;
import defpackage.pav;
import defpackage.rpr;
import defpackage.rxz;
import defpackage.u0a0;
import defpackage.vo51;
import defpackage.y5e;
import defpackage.z0a0;
import kotlin.Metadata;
import ru.yandex.taxi.animation.NavigationDirection;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0019H\u0014¢\u0006\u0004\b \u0010\u001dR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0016\u0010#\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lcom/yandex/go/payments/summary/ui/FullscreenPaymentMethodsListModalView;", "Lcom/yandex/go/payments/summary/ui/PaymentMethodsListModalView;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lz0a0;", "paymentImageLoader", "Lvo51;", "sdkRouterFactory", "Lrxz;", "loyaltyTabletFactory", "Lcom/yandex/go/payments/paymentlist/domain/k;", "presenter", "Lu0a0;", "paymentIconInfoFactory", "Lrpr;", "toolbarHolder", "Lru/yandex/taxi/animation/NavigationDirection;", "openingNavigationDirection", "<init>", "(Landroid/content/Context;Lpav;Lz0a0;Lvo51;Lrxz;Lcom/yandex/go/payments/paymentlist/domain/k;Lu0a0;Lrpr;Lru/yandex/taxi/animation/NavigationDirection;)V", "Lzy11;", "onAttachedToWindow", "()V", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "Lrpr;", "Lru/yandex/taxi/animation/NavigationDirection;", "closingNavigationDirection", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FullscreenPaymentMethodsListModalView extends PaymentMethodsListModalView {
    public static final int $stable = 8;
    private NavigationDirection closingNavigationDirection;
    private final NavigationDirection openingNavigationDirection;
    private final rpr toolbarHolder;

    public FullscreenPaymentMethodsListModalView(Context context, pav pavVar, z0a0 z0a0Var, vo51 vo51Var, rxz rxzVar, k kVar, u0a0 u0a0Var, rpr rprVar, NavigationDirection navigationDirection) {
        super(context, pavVar, z0a0Var, vo51Var, rxzVar, kVar, rprVar, u0a0Var);
        this.toolbarHolder = rprVar;
        this.openingNavigationDirection = navigationDirection;
        this.closingNavigationDirection = NavigationDirection.BACKWARD;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        y5e.c(getContent(), startAction, endAction, this.closingNavigationDirection, 4);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        y5e.d(getContent(), onAnimateShowStartAction, onAnimateShowEndAction, this.openingNavigationDirection, 4);
    }

    @Override // com.yandex.go.payments.summary.ui.PaymentMethodsListModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.toolbarHolder.c().setTrackedView(getPaymentMethodChooserView().getPaymentMethodList());
        setOnTouchOutsideListener(null);
        setDismissOnTouchOutside(false);
    }
}
