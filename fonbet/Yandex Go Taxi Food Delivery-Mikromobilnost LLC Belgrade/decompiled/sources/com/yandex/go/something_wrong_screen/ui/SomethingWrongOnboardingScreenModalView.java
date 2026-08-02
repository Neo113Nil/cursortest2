package com.yandex.go.something_wrong_screen.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a8t0;
import defpackage.b8t0;
import defpackage.blh0;
import defpackage.c8t0;
import defpackage.cma1;
import defpackage.e230;
import defpackage.g8t0;
import defpackage.gas0;
import defpackage.k7x0;
import defpackage.mmp0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.r8h0;
import defpackage.tje;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y130;
import java.util.HashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B3\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R\u001a\u0010$\u001a\u00020\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/yandex/go/something_wrong_screen/ui/SomethingWrongOnboardingScreenModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lb8t0;", "Landroid/content/Context;", "context", "Lc8t0;", "presenter", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "Lg8t0;", "analytics", "<init>", "(Landroid/content/Context;Lc8t0;Lpav;Lk7x0;Lg8t0;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lb8t0;", "", "contentTop", "Lzy11;", "onModalViewAppear", "(I)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lc8t0;", "Lpav;", "Lk7x0;", "Lg8t0;", "fullscreenBackgroundAttrRes", CA20Status.STATUS_USER_I, "getFullscreenBackgroundAttrRes", "()I", "a8t0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SomethingWrongOnboardingScreenModalView extends SlideableBindingModalView<b8t0> {
    private final g8t0 analytics;
    private final int fullscreenBackgroundAttrRes;
    private final pav imageLoader;
    private final c8t0 presenter;
    private final k7x0 tagUrlFormatter;

    public SomethingWrongOnboardingScreenModalView(Context context, c8t0 c8t0Var, pav pavVar, k7x0 k7x0Var, g8t0 g8t0Var) {
        super(context);
        this.presenter = c8t0Var;
        this.imageLoader = pavVar;
        this.tagUrlFormatter = k7x0Var;
        this.analytics = g8t0Var;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
        this.fullscreenBackgroundAttrRes = xng0.bgTransparent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(SomethingWrongOnboardingScreenModalView somethingWrongOnboardingScreenModalView) {
        return somethingWrongOnboardingScreenModalView.getBinding().a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public b8t0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(blh0.something_wrong_onboarding_screen_modal_view, parent, false);
        int i = r8h0.button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = r8h0.screen_image;
            ImageView imageView = (ImageView) cma1.O(i, inflate);
            if (imageView != null) {
                i = r8h0.screen_title;
                ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
                if (listTitleComponent != null) {
                    return new b8t0((ConstraintLayout) inflate, buttonComponent, imageView, listTitleComponent);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getFullscreenBackgroundAttrRes() {
        return this.fullscreenBackgroundAttrRes;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new y130(0, new gas0(11, this), true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g8t0 g8t0Var = this.analytics;
        g8t0Var.getClass();
        g8t0Var.a.a("SomethingWrongScreen.Onboarding.Shown", new HashMap(), 1, new HashMap());
        c8t0 c8t0Var = this.presenter;
        a8t0 a8t0Var = new a8t0(this);
        c8t0Var.Bg(a8t0Var);
        tje.N(c8t0Var.Jg(), null, null, new SomethingWrongOnboardingScreenPresenter$attachView$$inlined$collectIn$1(new b(c8t0Var.x.a.k), null, a8t0Var), 3);
        tje.N(c8t0Var.Jg(), null, null, new SomethingWrongOnboardingScreenPresenter$attachView$3(c8t0Var, null), 3);
        tje.N(c8t0Var.Jg(), null, null, new SomethingWrongOnboardingScreenPresenter$onOnboardingShown$1(c8t0Var, null), 3);
        getBinding().b.setDebounceClickListener(new mmp0(29, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g8t0 g8t0Var = this.analytics;
        g8t0Var.getClass();
        g8t0Var.a.a("SomethingWrongScreen.Onboarding.Disappear", new HashMap(), 1, new HashMap());
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        xw31.w(getBinding().d);
    }
}
