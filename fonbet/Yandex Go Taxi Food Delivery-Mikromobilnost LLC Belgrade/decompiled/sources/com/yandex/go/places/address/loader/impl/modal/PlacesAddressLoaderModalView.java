package com.yandex.go.places.address.loader.impl.modal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a5c0;
import defpackage.bvf0;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.da0;
import defpackage.h6h0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.l8x;
import defpackage.m2y;
import defpackage.ny61;
import defpackage.o400;
import defpackage.ouh0;
import defpackage.p4c0;
import defpackage.q4c0;
import defpackage.qhw0;
import defpackage.qu;
import defpackage.qzm;
import defpackage.r4c0;
import defpackage.s4c0;
import defpackage.sjh;
import defpackage.t9b0;
import defpackage.tje;
import defpackage.tse;
import defpackage.u4c0;
import defpackage.uyj;
import defpackage.w4c0;
import defpackage.y130;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002-.B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u0012\u0004\b\u001d\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*¨\u0006/"}, d2 = {"Lcom/yandex/go/places/address/loader/impl/modal/PlacesAddressLoaderModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ls4c0;", "Landroid/content/Context;", "context", "Lw4c0;", "presenter", "<init>", "(Landroid/content/Context;Lw4c0;)V", "Lzy11;", "setupButtons", "()V", "cancelAnimations", "setupCancelButton", "startCancelButtonAppearanceTimer", "animateCancelButtonAppearance", "animateButtonOnCancellation", "Ly130;", "insetsType", "()Ly130;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ls4c0;", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/content/Context;", "getContext$annotations", "Lw4c0;", "Ltse;", "scope", "Ltse;", "Ll8x;", "cancelButtonAppearanceJob", "Ll8x;", "Landroid/view/ViewPropertyAnimator;", "buttonCancelAnimation", "Landroid/view/ViewPropertyAnimator;", "", "isCancelled", "Z", "hasShownCancelButtonBefore", "Companion", "r4c0", "q4c0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesAddressLoaderModalView extends SlideableBindingModalView<s4c0> {
    private static final long CANCEL_BUTTON_APPEAR_DELAY = 2000;
    public static final q4c0 Companion = new q4c0();
    private ViewPropertyAnimator buttonCancelAnimation;
    private l8x cancelButtonAppearanceJob;
    private final Context context;
    private boolean hasShownCancelButtonBefore;
    private boolean isCancelled;
    private final w4c0 presenter;
    private final tse scope;

    public PlacesAddressLoaderModalView(Context context, w4c0 w4c0Var) {
        super(context);
        this.context = context;
        this.presenter = w4c0Var;
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        this.scope = bvf0.a(cvw.U(a, o400.a));
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
    }

    private final void animateButtonOnCancellation() {
        this.buttonCancelAnimation = cma1.b(0.0f, (ButtonComponent) getBinding().c.d).withEndAction(new p4c0(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateButtonOnCancellation$lambda$0(PlacesAddressLoaderModalView placesAddressLoaderModalView) {
        placesAddressLoaderModalView.buttonCancelAnimation = null;
        RobotoTextView robotoTextView = (RobotoTextView) placesAddressLoaderModalView.getBinding().c.b;
        robotoTextView.setVisibility(0);
        robotoTextView.setAlpha(0.0f);
        robotoTextView.setText(kyh0.loading_cancelled);
        cma1.b(1.0f, robotoTextView).withEndAction(new p4c0(placesAddressLoaderModalView, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateButtonOnCancellation$lambda$0$0$0(PlacesAddressLoaderModalView placesAddressLoaderModalView) {
        ((da0) placesAddressLoaderModalView.presenter.A.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateCancelButtonAppearance() {
        if (((ButtonComponent) getBinding().c.d).getVisibility() == 0 && ((ButtonComponent) getBinding().c.d).getAlpha() == 0.0f) {
            cma1.b(1.0f, (ButtonComponent) getBinding().c.d);
        }
    }

    private final void cancelAnimations() {
        ViewPropertyAnimator viewPropertyAnimator = this.buttonCancelAnimation;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        l8x l8xVar = this.cancelButtonAppearanceJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.cancelButtonAppearanceJob = null;
    }

    private static /* synthetic */ void getContext$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(PlacesAddressLoaderModalView placesAddressLoaderModalView) {
        return placesAddressLoaderModalView.getBinding().a;
    }

    private final void setupButtons() {
        s4c0 binding = getBinding();
        ((ButtonComponent) binding.c.d).setDebounceClickListener(new p4c0(this, 0));
        qzm qzmVar = binding.b;
        ((ButtonComponent) qzmVar.d).setDebounceClickListener(new p4c0(this, 1));
        ((ButtonComponent) qzmVar.h).setDebounceClickListener(new p4c0(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupButtons$lambda$0$0(PlacesAddressLoaderModalView placesAddressLoaderModalView) {
        placesAddressLoaderModalView.isCancelled = true;
        placesAddressLoaderModalView.animateButtonOnCancellation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupButtons$lambda$0$1(PlacesAddressLoaderModalView placesAddressLoaderModalView) {
        ((da0) placesAddressLoaderModalView.presenter.A.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupButtons$lambda$0$2(PlacesAddressLoaderModalView placesAddressLoaderModalView) {
        w4c0 w4c0Var = placesAddressLoaderModalView.presenter;
        ((u4c0) w4c0Var.Dg()).render(a5c0.a);
        tje.N(w4c0Var.Jg(), null, null, new PlacesAddressLoaderPresenter$loadAddressInfo$1(w4c0Var, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupCancelButton() {
        ButtonComponent buttonComponent = (ButtonComponent) getBinding().c.d;
        if (buttonComponent.getVisibility() != 0) {
            if (this.hasShownCancelButtonBefore) {
                buttonComponent.setAlpha(1.0f);
                buttonComponent.setVisibility(0);
            } else {
                buttonComponent.setAlpha(0.0f);
                buttonComponent.setVisibility(0);
                startCancelButtonAppearanceTimer();
            }
        }
    }

    private final void startCancelButtonAppearanceTimer() {
        if (this.cancelButtonAppearanceJob != null || this.isCancelled || this.hasShownCancelButtonBefore) {
            return;
        }
        this.cancelButtonAppearanceJob = tje.N(this.scope, null, null, new PlacesAddressLoaderModalView$startCancelButtonAppearanceTimer$1(this, null), 3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public s4c0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(ouh0.places_address_loader_modal_view, parent, false);
        int i = h6h0.error_layout;
        View O = cma1.O(i, inflate);
        if (O != null) {
            int i2 = h6h0.close_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i2, O);
            if (buttonComponent != null) {
                i2 = h6h0.error_button_layout;
                BottomEdgeButtonLayout bottomEdgeButtonLayout = (BottomEdgeButtonLayout) cma1.O(i2, O);
                if (bottomEdgeButtonLayout != null) {
                    i2 = h6h0.error_icon;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, O);
                    if (appCompatImageView != null) {
                        i2 = h6h0.error_subtitle;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, O);
                        if (robotoTextView != null) {
                            i2 = h6h0.error_title;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, O);
                            if (robotoTextView2 != null) {
                                i2 = h6h0.reload_button;
                                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i2, O);
                                if (buttonComponent2 != null) {
                                    qzm qzmVar = new qzm((ConstraintLayout) O, buttonComponent, bottomEdgeButtonLayout, appCompatImageView, robotoTextView, robotoTextView2, buttonComponent2, 4);
                                    i = h6h0.loading_layout;
                                    View O2 = cma1.O(i, inflate);
                                    if (O2 != null) {
                                        int i3 = h6h0.cancel_button;
                                        ButtonComponent buttonComponent3 = (ButtonComponent) cma1.O(i3, O2);
                                        if (buttonComponent3 != null) {
                                            i3 = h6h0.spinner;
                                            CircularProgressBar circularProgressBar = (CircularProgressBar) cma1.O(i3, O2);
                                            if (circularProgressBar != null) {
                                                i3 = h6h0.spinner_text;
                                                RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i3, O2);
                                                if (robotoTextView3 != null) {
                                                    return new s4c0((ConstraintLayout) inflate, qzmVar, new m2y((ViewGroup) O2, (View) buttonComponent3, (View) circularProgressBar, robotoTextView3, 5));
                                                }
                                            }
                                        }
                                        ny61.t("Missing required view with ID: ".concat(O2.getResources().getResourceName(i3)));
                                        return null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
            return null;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(1, new t9b0(12, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnTouchOutsideListener(null);
        setDismissOnTouchOutside(false);
        setupButtons();
        w4c0 w4c0Var = this.presenter;
        w4c0Var.Bg(new r4c0(this));
        ((u4c0) w4c0Var.Dg()).render(a5c0.a);
        tje.N(w4c0Var.Jg(), null, null, new PlacesAddressLoaderPresenter$loadAddressInfo$1(w4c0Var, null), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bvf0.j(this.scope, null);
        cancelAnimations();
        this.presenter.Cg();
    }
}
