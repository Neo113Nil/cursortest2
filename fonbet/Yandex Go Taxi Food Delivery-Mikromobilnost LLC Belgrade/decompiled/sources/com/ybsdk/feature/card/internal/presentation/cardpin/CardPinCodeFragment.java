package com.ybsdk.feature.card.internal.presentation.cardpin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.b;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$SecondFactorResult;
import com.ybsdk.widgets.common.PinCodeDotsView;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import defpackage.bmg0;
import defpackage.cx7;
import defpackage.dcs;
import defpackage.dzh0;
import defpackage.e48;
import defpackage.eja1;
import defpackage.gwh0;
import defpackage.jl40;
import defpackage.kl8;
import defpackage.lcb1;
import defpackage.lfx;
import defpackage.ll8;
import defpackage.mf8;
import defpackage.ml8;
import defpackage.p761;
import defpackage.qas0;
import defpackage.qn8;
import defpackage.sza;
import defpackage.tje;
import defpackage.tl8;
import defpackage.ul8;
import defpackage.ung0;
import defpackage.vl8;
import defpackage.w511;
import defpackage.wl8;
import defpackage.xl8;
import defpackage.xty0;
import defpackage.y8f;
import defpackage.yl8;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 82\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00019B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\r*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0014¢\u0006\u0004\b(\u0010)J!\u0010.\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,H\u0014¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\r2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00106R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00107¨\u0006:"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/cardpin/CardPinCodeFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lp761;", "Lyl8;", "Lcom/ybsdk/feature/card/internal/presentation/cardpin/a;", "Lul8;", "viewModelFactory", "Lqn8;", "secondFactorHelper", "<init>", "(Lul8;Lqn8;)V", "Lwl8;", "viewState", "Lzy11;", "renderEnteringState", "(Lwl8;)V", "renderMismatchState", "()V", "renderLoadingState", "renderSuccessState", "renderErrorState", "switchToFirstDotsView", "switchToSecondDotsView", "", "filledCount", "", "getAccessibilityString", "(I)Ljava/lang/String;", "Landroidx/appcompat/widget/AppCompatTextView;", "resId", "setTextAndAnnounceA11y", "(Landroidx/appcompat/widget/AppCompatTextView;I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "createViewModel", "()Lcom/ybsdk/feature/card/internal/presentation/cardpin/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lp761;", "render", "(Lyl8;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Lul8;", "Lqn8;", "Companion", "ll8", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CardPinCodeFragment extends BaseMvvmFragment<p761, yl8, a> {
    public static final ll8 Companion = new ll8();
    private static final long ERROR_ANIMATION_DURATION = 500;
    private static final int HINT_LINES = 3;
    private static final long SUCCESS_ANIMATION_DURATION = 500;
    private final qn8 secondFactorHelper;
    private final ul8 viewModelFactory;

    public CardPinCodeFragment(ul8 ul8Var, qn8 qn8Var) {
        super(null, null, null, null, a.class, 15, null);
        this.viewModelFactory = ul8Var;
        this.secondFactorHelper = qn8Var;
    }

    private final String getAccessibilityString(int filledCount) {
        return requireContext().getResources().getQuantityString(gwh0.ybsdk_pin_pin_indicator_accessibility_announcer, filledCount, Integer.valueOf(filledCount));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(CardPinCodeFragment cardPinCodeFragment, String str, Bundle bundle) {
        CardSecondFactorHelper$SecondFactorResult a = ((mf8) cardPinCodeFragment.secondFactorHelper).a(bundle);
        if (a instanceof CardSecondFactorHelper$SecondFactorResult.VerificationToken) {
            cardPinCodeFragment.getViewModel().e0(((CardSecondFactorHelper$SecondFactorResult.VerificationToken) a).getVerificationToken());
        } else if (jl40.l(a, CardSecondFactorHelper$SecondFactorResult.Cancel.INSTANCE) || a == null) {
            cardPinCodeFragment.getViewModel().d0();
        } else {
            w511.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3$lambda$1(CardPinCodeFragment cardPinCodeFragment, char c) {
        cardPinCodeFragment.getViewModel().b0(sza.d(c));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3$lambda$2(CardPinCodeFragment cardPinCodeFragment) {
        cardPinCodeFragment.getViewModel().c0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderEnteringState(wl8 viewState) {
        PinCodeDotsView pinCodeDotsView;
        int i = ml8.a[viewState.b().ordinal()];
        int i2 = 2;
        if (i == 1) {
            switchToFirstDotsView();
            PinCodeDotsView.clear$default(((p761) getBinding()).c, null, 1, null);
            ((p761) getBinding()).b.setContentDescription(getAccessibilityString(viewState.a()));
            pinCodeDotsView = ((p761) getBinding()).b;
        } else if (i != 2) {
            w511.b();
            return;
        } else {
            switchToSecondDotsView();
            ((p761) getBinding()).c.setContentDescription(getAccessibilityString(viewState.a()));
            pinCodeDotsView = ((p761) getBinding()).c;
        }
        pinCodeDotsView.showSymbols(viewState.a(), new kl8(this, i2));
        if (!pinCodeDotsView.requestFocus() || lcb1.e(requireActivity())) {
            return;
        }
        lcb1.f(pinCodeDotsView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderEnteringState$lambda$5$lambda$4(CardPinCodeFragment cardPinCodeFragment) {
        cardPinCodeFragment.getViewModel().g0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderErrorState() {
        setTextAndAnnounceA11y(((p761) getBinding()).e, dzh0.ybsdk_card_pin_server_error_hint);
        ((p761) getBinding()).c.showError(new kl8(this, 1));
        PinCodeDotsView.clear$default(((p761) getBinding()).b, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderErrorState$lambda$8(CardPinCodeFragment cardPinCodeFragment) {
        cardPinCodeFragment.getViewModel().f0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderLoadingState() {
        switchToSecondDotsView();
        setTextAndAnnounceA11y(((p761) getBinding()).e, dzh0.ybsdk_card_pin_success_confirm_hint);
        ((p761) getBinding()).c.showLoading();
        PinCodeDotsView.clear$default(((p761) getBinding()).b, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderMismatchState() {
        setTextAndAnnounceA11y(((p761) getBinding()).e, dzh0.ybsdk_card_pin_different_pins_hint);
        ((p761) getBinding()).c.showError(new kl8(this, 3));
        PinCodeDotsView.clear$default(((p761) getBinding()).b, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderMismatchState$lambda$6(CardPinCodeFragment cardPinCodeFragment) {
        tje.N(eja1.s(cardPinCodeFragment), null, null, new CardPinCodeFragment$renderMismatchState$1$1(cardPinCodeFragment, null), 3);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderSuccessState() {
        switchToSecondDotsView();
        setTextAndAnnounceA11y(((p761) getBinding()).e, dzh0.ybsdk_card_pin_successfully_set_hint);
        xty0.f(((p761) getBinding()).e, ung0.ybColor_textIcon_positive);
        ((p761) getBinding()).c.showSuccess(new kl8(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderSuccessState$lambda$7(CardPinCodeFragment cardPinCodeFragment) {
        tje.N(eja1.s(cardPinCodeFragment.getViewLifecycleOwner()), null, null, new CardPinCodeFragment$renderSuccessState$1$1(cardPinCodeFragment, null), 3);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setTextAndAnnounceA11y(AppCompatTextView appCompatTextView, int i) {
        AppCompatTextView appCompatTextView2 = ((p761) getBinding()).e;
        appCompatTextView2.setText(i);
        b.r(appCompatTextView2, appCompatTextView2.getText());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void switchToFirstDotsView() {
        if (((p761) getBinding()).f.getDisplayedChild() != 0) {
            ((p761) getBinding()).f.setInAnimation(AnimationUtils.loadAnimation(requireContext(), bmg0.ybsdk_anim_pin_slide_in_left));
            ((p761) getBinding()).f.setOutAnimation(AnimationUtils.loadAnimation(requireContext(), bmg0.ybsdk_anim_pin_slide_out_right));
            ((p761) getBinding()).f.showNext();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void switchToSecondDotsView() {
        if (((p761) getBinding()).f.getDisplayedChild() != 1) {
            ((p761) getBinding()).f.setInAnimation(AnimationUtils.loadAnimation(requireContext(), bmg0.ybsdk_anim_pin_slide_in_right));
            ((p761) getBinding()).f.setOutAnimation(AnimationUtils.loadAnimation(requireContext(), bmg0.ybsdk_anim_pin_slide_out_left));
            ((p761) getBinding()).f.showPrevious();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof tl8) {
            setTextAndAnnounceA11y(((p761) getBinding()).e, dzh0.ybsdk_card_pin_repeat_hint);
        } else {
            super.consumeSideEffect(sideEffect);
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((vl8) this.viewModelFactory).a((CardPinScreenParams) dcs.a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getParentFragmentManager().m0(CardSecondFactorHelper$Request.SET_PIN.getKey(), this, new e48(9, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setTextAndAnnounceA11y(((p761) getBinding()).e, dzh0.ybsdk_card_pin_strength_hint);
        ((p761) getBinding()).e.setLines(3);
        NumberKeyboardView numberKeyboardView = ((p761) getBinding()).d;
        numberKeyboardView.setOnCharPressed(new cx7(14, this));
        numberKeyboardView.setOnKeyBackspacePressed(new kl8(this, 0));
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(yl8 viewState) {
        if (viewState instanceof wl8) {
            renderEnteringState((wl8) viewState);
            return;
        }
        if (viewState.equals(xl8.c)) {
            renderMismatchState();
            return;
        }
        if (viewState.equals(xl8.b)) {
            renderLoadingState();
            return;
        }
        if (viewState.equals(xl8.d)) {
            renderSuccessState();
        } else if (viewState.equals(xl8.a)) {
            renderErrorState();
        } else {
            w511.b();
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public p761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return p761.o(inflater, container);
    }
}
