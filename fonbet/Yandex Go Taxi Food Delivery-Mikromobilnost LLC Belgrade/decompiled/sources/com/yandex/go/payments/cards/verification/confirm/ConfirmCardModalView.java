package com.yandex.go.payments.cards.verification.confirm;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.payments.api.card.CardScrollMode;
import com.yandex.go.payments.cards.data.c;
import com.yandex.go.payments.cards.data.f;
import com.yandex.go.payments.cards.domain.model.PaymentMethodVerificationSession;
import com.yandex.go.payments.cards.pci_dss.data.a;
import com.yandex.go.payments.cards.ui.ConfirmPaymentMethodView;
import com.yandex.go.payments.cards.ui.ConfirmPaymentMethodViewImpl;
import defpackage.b3e;
import defpackage.b4u;
import defpackage.b7r0;
import defpackage.b90;
import defpackage.bi6;
import defpackage.c3e;
import defpackage.d3e;
import defpackage.dcp0;
import defpackage.dt20;
import defpackage.erw;
import defpackage.g3e;
import defpackage.gyc;
import defpackage.hit;
import defpackage.j3e;
import defpackage.k3e;
import defpackage.n1d;
import defpackage.n3w;
import defpackage.ney;
import defpackage.qsj0;
import defpackage.tt2;
import defpackage.u32;
import defpackage.v88;
import defpackage.w10;
import defpackage.w511;
import defpackage.xcz;
import defpackage.xvf0;
import defpackage.y5e;
import defpackage.y931;
import defpackage.yuf0;
import kotlin.Metadata;
import ru.yandex.taxi.animation.NavigationDirection;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.SlideableProgramModalView;

@Metadata(d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u00017\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:Bc\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001f\u0010\u001dJ\u001f\u0010#\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0014¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020 H\u0014¢\u0006\u0004\b'\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010-R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010.R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010/R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/yandex/go/payments/cards/verification/confirm/ConfirmCardModalView;", "Lru/yandex/taxi/widget/SlideableProgramModalView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lney;", "lifecycleObservable", "Ldcp0;", "screenCaptureProtector", "Lk3e;", "confirmCardViewFactory", "Lb3e;", "confirmCardComponentDependencies", "Lb7r0;", "settingsCardNavigationDirectionHolderRepository", "", "startFlow", "Lg3e;", "confirmCardNavigator", "Lerw;", "confirmStepData", "Lcom/yandex/go/payments/api/card/CardScrollMode;", "cardScrollMode", "<init>", "(Landroid/content/Context;Lney;Ldcp0;Lk3e;Lb3e;Lb7r0;ZLg3e;Lerw;Lcom/yandex/go/payments/api/card/CardScrollMode;)V", "createContentRootView", "()Landroid/widget/FrameLayout;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onBackPressed", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "Lney;", "Ldcp0;", "Lk3e;", "Lb3e;", "Lb7r0;", "Z", "Lg3e;", "Lerw;", "Lcom/yandex/go/payments/api/card/CardScrollMode;", "Lru/yandex/taxi/animation/NavigationDirection;", "closingNavigationDirection", "Lru/yandex/taxi/animation/NavigationDirection;", "Lcom/yandex/go/payments/cards/ui/ConfirmPaymentMethodView;", "confirmCardView", "Lcom/yandex/go/payments/cards/ui/ConfirmPaymentMethodView;", "d3e", "confirmCardViewLifecycleObserver", "Ld3e;", "gyc", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ConfirmCardModalView extends SlideableProgramModalView<FrameLayout> {
    public static final int $stable = 8;
    private final CardScrollMode cardScrollMode;
    private NavigationDirection closingNavigationDirection;
    private final b3e confirmCardComponentDependencies;
    private final g3e confirmCardNavigator;
    private ConfirmPaymentMethodView confirmCardView;
    private final k3e confirmCardViewFactory;
    private final d3e confirmCardViewLifecycleObserver;
    private final erw confirmStepData;
    private final ney lifecycleObservable;
    private final dcp0 screenCaptureProtector;
    private final b7r0 settingsCardNavigationDirectionHolderRepository;
    private final boolean startFlow;

    public ConfirmCardModalView(Context context, ney neyVar, dcp0 dcp0Var, k3e k3eVar, b3e b3eVar, b7r0 b7r0Var, boolean z, g3e g3eVar, erw erwVar, CardScrollMode cardScrollMode) {
        super(context);
        this.lifecycleObservable = neyVar;
        this.screenCaptureProtector = dcp0Var;
        this.confirmCardViewFactory = k3eVar;
        this.confirmCardComponentDependencies = b3eVar;
        this.settingsCardNavigationDirectionHolderRepository = b7r0Var;
        this.startFlow = z;
        this.confirmCardNavigator = g3eVar;
        this.confirmStepData = erwVar;
        this.cardScrollMode = cardScrollMode;
        NavigationDirection navigationDirection = NavigationDirection.BACKWARD;
        this.closingNavigationDirection = navigationDirection;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        if (z && b7r0Var.a == navigationDirection && cardScrollMode == CardScrollMode.HORIZONTAL) {
            b7r0Var.a();
        }
        this.confirmCardViewLifecycleObserver = new d3e(this);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        int i = c3e.a[this.cardScrollMode.ordinal()];
        if (i == 1) {
            y5e.c(getContent(), startAction, endAction, this.closingNavigationDirection, 4);
        } else if (i == 2) {
            super.animateDismiss(startAction, endAction);
        } else {
            w511.b();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        int i = c3e.a[this.cardScrollMode.ordinal()];
        if (i == 1) {
            y5e.d(getContent(), onAnimateShowStartAction, onAnimateShowEndAction, this.settingsCardNavigationDirectionHolderRepository.a, 4);
        } else if (i == 2) {
            super.animateShow(onAnimateShowStartAction, onAnimateShowEndAction);
        } else {
            w511.b();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableProgramModalView
    public FrameLayout createContentRootView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        b3e b3eVar = this.confirmCardComponentDependencies;
        k3e k3eVar = this.confirmCardViewFactory;
        b3eVar.getClass();
        k3eVar.getClass();
        Context context = getContext();
        erw erwVar = this.confirmStepData;
        gyc gycVar = new gyc(this);
        dcp0 dcp0Var = this.screenCaptureProtector;
        ney neyVar = this.lifecycleObservable;
        j3e j3eVar = k3eVar.a;
        y931 y931Var = ((b90) erwVar).f;
        PaymentMethodVerificationSession paymentMethodVerificationSession = ((b90) erwVar).b;
        n1d n1dVar = j3eVar.a;
        c cVar = new c((tt2) ((xvf0) n1dVar.a).get(), (xvf0) n1dVar.b, (xvf0) n1dVar.c, (bi6) ((xvf0) n1dVar.d).get(), (f) ((xvf0) n1dVar.e).get(), (b4u) ((n3w) n1dVar.f).a, (dt20) ((xcz) n1dVar.g).get(), y931Var, paymentMethodVerificationSession);
        yuf0 yuf0Var = k3eVar.b.a;
        this.confirmCardView = new ConfirmPaymentMethodViewImpl(context, new com.yandex.go.payments.cards.ui.c(erwVar, cVar, gycVar, dcp0Var, neyVar, (u32) ((xvf0) yuf0Var.a).get(), (v88) ((xvf0) yuf0Var.b).get(), (hit) ((xvf0) yuf0Var.c).get(), (a) ((w10) yuf0Var.d).get(), (qsj0) ((xvf0) yuf0Var.e).get(), (com.yandex.go.payments.cards.experiments.a) ((xvf0) yuf0Var.f).get()), k3eVar.c, k3eVar.d);
        getContentRootView().addView(this.confirmCardView, -1, -1);
        this.lifecycleObservable.a(this.confirmCardViewLifecycleObserver, this);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        ConfirmPaymentMethodView confirmPaymentMethodView = this.confirmCardView;
        if (confirmPaymentMethodView == null || !confirmPaymentMethodView.onDismiss()) {
            if (this.settingsCardNavigationDirectionHolderRepository.a == NavigationDirection.BACKWARD) {
                this.settingsCardNavigationDirectionHolderRepository.a();
            }
            super.onBackPressed();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.confirmCardView = null;
        this.lifecycleObservable.d(this);
    }
}
