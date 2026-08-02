package com.yandex.go.payments.cards.verification.d3s;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.payments.api.card.CardScrollMode;
import com.yandex.go.payments.cards.ui.Card3dsView;
import com.yandex.go.payments.cards.ui.Card3dsViewImpl;
import defpackage.b7r0;
import defpackage.ca0;
import defpackage.da0;
import defpackage.dcp0;
import defpackage.e48;
import defpackage.erw;
import defpackage.f88;
import defpackage.g88;
import defpackage.hh5;
import defpackage.i88;
import defpackage.ney;
import defpackage.u88;
import defpackage.v32;
import defpackage.w511;
import defpackage.y5e;
import defpackage.y88;
import kotlin.Metadata;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.SlideableProgramModalView;

@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u00010\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BQ\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001cH\u0014¢\u0006\u0004\b#\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/yandex/go/payments/cards/verification/d3s/Card3dsModalView;", "Lru/yandex/taxi/widget/SlideableProgramModalView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lv32;", "analyticsDelegate", "Lney;", "lifecycleObservable", "Ldcp0;", "screenCaptureProtector", "Lb7r0;", "settingsCardNavigationDirectionHolderRepository", "Li88;", "card3dsNavigator", "Lu88;", "card3dsStepData", "Lcom/yandex/go/payments/api/card/CardScrollMode;", "cardScrollMode", "<init>", "(Landroid/content/Context;Lv32;Lney;Ldcp0;Lb7r0;Li88;Lu88;Lcom/yandex/go/payments/api/card/CardScrollMode;)V", "createContentRootView", "()Landroid/widget/FrameLayout;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onBackPressed", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "Lney;", "Ldcp0;", "Lb7r0;", "Li88;", "Lu88;", "Lcom/yandex/go/payments/api/card/CardScrollMode;", "Ly88;", "card3DsViewFactory", "Ly88;", "Lcom/yandex/go/payments/cards/ui/Card3dsView;", "card3dsView", "Lcom/yandex/go/payments/cards/ui/Card3dsView;", "g88", "card3dsViewLifecycleObserver", "Lg88;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Card3dsModalView extends SlideableProgramModalView<FrameLayout> {
    public static final int $stable = 8;
    private final y88 card3DsViewFactory;
    private final i88 card3dsNavigator;
    private final u88 card3dsStepData;
    private Card3dsView card3dsView;
    private final g88 card3dsViewLifecycleObserver;
    private final CardScrollMode cardScrollMode;
    private final ney lifecycleObservable;
    private final dcp0 screenCaptureProtector;
    private final b7r0 settingsCardNavigationDirectionHolderRepository;

    public Card3dsModalView(Context context, v32 v32Var, ney neyVar, dcp0 dcp0Var, b7r0 b7r0Var, i88 i88Var, u88 u88Var, CardScrollMode cardScrollMode) {
        super(context);
        this.lifecycleObservable = neyVar;
        this.screenCaptureProtector = dcp0Var;
        this.settingsCardNavigationDirectionHolderRepository = b7r0Var;
        this.card3dsNavigator = i88Var;
        this.card3dsStepData = u88Var;
        this.cardScrollMode = cardScrollMode;
        this.card3DsViewFactory = new y88(v32Var);
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        this.card3dsViewLifecycleObserver = new g88(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(Card3dsModalView card3dsModalView, erw erwVar) {
        card3dsModalView.settingsCardNavigationDirectionHolderRepository.a();
        ((da0) ((hh5) card3dsModalView.card3dsNavigator).b).r(new ca0(erwVar, 1));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        int i = f88.a[this.cardScrollMode.ordinal()];
        if (i == 1) {
            y5e.c(getContent(), startAction, endAction, null, 12);
        } else if (i == 2) {
            super.animateDismiss(startAction, endAction);
        } else {
            w511.b();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        int i = f88.a[this.cardScrollMode.ordinal()];
        if (i == 1) {
            y5e.d(getContent(), onAnimateShowStartAction, onAnimateShowEndAction, null, 12);
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
        e48 e48Var = new e48(2, this);
        y88 y88Var = this.card3DsViewFactory;
        Context context = getContext();
        u88 u88Var = this.card3dsStepData;
        dcp0 dcp0Var = this.screenCaptureProtector;
        y88Var.getClass();
        this.card3dsView = new Card3dsViewImpl(context, u88Var, e48Var, y88Var.a, dcp0Var);
        getContentRootView().addView(this.card3dsView, -1, -1);
        this.lifecycleObservable.a(this.card3dsViewLifecycleObserver, this);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        Card3dsView card3dsView = this.card3dsView;
        if (card3dsView == null || !card3dsView.onDismiss()) {
            super.onBackPressed();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.card3dsView = null;
        this.lifecycleObservable.d(this);
    }
}
