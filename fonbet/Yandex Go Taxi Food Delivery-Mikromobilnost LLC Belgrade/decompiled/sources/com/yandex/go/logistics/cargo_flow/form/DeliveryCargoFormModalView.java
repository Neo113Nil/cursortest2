package com.yandex.go.logistics.cargo_flow.form;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a850;
import defpackage.azh;
import defpackage.c230;
import defpackage.e230;
import defpackage.i3y;
import defpackage.jw8;
import defpackage.md6;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.sc;
import defpackage.tth0;
import defpackage.uxh;
import defpackage.xi8;
import defpackage.xni;
import defpackage.zi8;
import kotlin.Metadata;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001f\u0010\u0011R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/go/logistics/cargo_flow/form/DeliveryCargoFormModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lazh;", "Landroid/content/Context;", "context", "", "shouldAnimateOnAppearing", "Lzi8;", "sdkCardMode", "Ljw8;", "cargoFormViewWrapper", "La850;", "navigationListener", "<init>", "(Landroid/content/Context;ZLzi8;Ljw8;La850;)V", "Lzy11;", "hideKeyboard", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lazh;", "Le230;", "insetsType", "()Le230;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "onAttachedToWindow", "onDetachedFromWindow", "Lzi8;", "Ljw8;", "La850;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryCargoFormModalView extends SlideableBindingModalView<azh> {
    private final jw8 cargoFormViewWrapper;
    private final a850 navigationListener;
    private final zi8 sdkCardMode;

    public DeliveryCargoFormModalView(Context context, boolean z, zi8 zi8Var, jw8 jw8Var, a850 a850Var) {
        super(context);
        this.sdkCardMode = zi8Var;
        this.cargoFormViewWrapper = jw8Var;
        this.navigationListener = a850Var;
        setCardMode((zi8Var == null || !zi8Var.a()) ? SlideableModalView.CardMode.FIXED_CARD : SlideableModalView.CardMode.SLIDEABLE_CARD);
        setAnimateOnAppearing(z);
        setOnAppearingListener(new sc(5, this));
    }

    private final void hideKeyboard() {
        View findFocus = getCardContentView().findFocus();
        if (findFocus == null) {
            findFocus = getCardContentView();
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(findFocus.getWindowToken(), 0);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return this.sdkCardMode instanceof xi8 ? mqg0.component_ever_back : mqg0.component_black_opacity_45;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public azh bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        if (parent != null) {
            inflater.inflate(tth0.delivery_cargo_form_modal_view, parent);
            return new azh(parent);
        }
        ny61.t("parent");
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        jw8 jw8Var = this.cargoFormViewWrapper;
        ((xni) ((i3y) ((md6) jw8Var).c).getValue()).b(getCardContentContainer());
        post(new uxh(1, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ((xni) ((i3y) ((md6) this.cargoFormViewWrapper).c).getValue()).a();
        hideKeyboard();
        super.onDetachedFromWindow();
    }
}
