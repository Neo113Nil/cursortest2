package com.yandex.go.scooters.misc.common_dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.b64;
import defpackage.cma1;
import defpackage.i3y;
import defpackage.j6m0;
import defpackage.lx4;
import defpackage.m7h0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.p7n0;
import defpackage.pav;
import defpackage.q7n0;
import defpackage.r7n0;
import defpackage.s7n0;
import defpackage.sls;
import defpackage.t7n0;
import defpackage.v3n0;
import defpackage.wjh0;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001a\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/yandex/go/scooters/misc/common_dialog/ScootersCommonDialogModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lt7n0;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lq7n0;", "analyticsFactory", "Lkotlin/Function0;", "Lzy11;", "goBack", "Ls7n0;", ConfigConstants.CONFIG, "<init>", "(Landroid/content/Context;Lpav;Lq7n0;Lsls;Ls7n0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lt7n0;", "onAttachedToWindow", "()V", "onTouchOutside", "onBackPressed", "onSlideOut", "Lpav;", "Lq7n0;", "Lsls;", "Ls7n0;", "Lp7n0;", "analytics$delegate", "Li3y;", "getAnalytics", "()Lp7n0;", "analytics", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersCommonDialogModalView extends SlideableBindingModalView<t7n0> {
    public static final int $stable = 8;

    /* renamed from: analytics$delegate, reason: from kotlin metadata */
    private final i3y analytics;
    private final q7n0 analyticsFactory;
    private final s7n0 config;
    private final sls goBack;
    private final pav imageLoader;

    public ScootersCommonDialogModalView(Context context, pav pavVar, q7n0 q7n0Var, sls slsVar, s7n0 s7n0Var) {
        super(context);
        this.imageLoader = pavVar;
        this.analyticsFactory = q7n0Var;
        this.goBack = slsVar;
        this.config = s7n0Var;
        this.analytics = kotlin.a.a(new j6m0(21, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p7n0 analytics_delegate$lambda$0(ScootersCommonDialogModalView scootersCommonDialogModalView) {
        q7n0 q7n0Var = scootersCommonDialogModalView.analyticsFactory;
        return new p7n0((lx4) ((r7n0) q7n0Var).a.a.get(), scootersCommonDialogModalView.config);
    }

    private final p7n0 getAnalytics() {
        return (p7n0) this.analytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ScootersCommonDialogModalView scootersCommonDialogModalView) {
        p7n0 analytics = scootersCommonDialogModalView.getAnalytics();
        ScootersCommonDialogAnalytics$Button scootersCommonDialogAnalytics$Button = ScootersCommonDialogAnalytics$Button.OK;
        s7n0 s7n0Var = analytics.b;
        String j = b64.j(s7n0Var.e, ".Tapped");
        String str = s7n0Var.a;
        i d = ((j) analytics.a).d(j);
        d.d("type", str);
        d.d("button_name", scootersCommonDialogAnalytics$Button.getButtonName());
        d.m();
        scootersCommonDialogModalView.getAnalytics().a(ScootersCommonDialogAnalytics$CloseReason.BUTTON);
        scootersCommonDialogModalView.goBack.invoke();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public t7n0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(wjh0.scooters_common_dialog_modal_view, (ViewGroup) this, false);
        int i = m7h0.image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
        if (appCompatImageView != null) {
            i = m7h0.ok_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = m7h0.subtitle;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = m7h0.title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        return new t7n0(appCompatImageView, (ConstraintLayout) inflate, buttonComponent, robotoTextView, robotoTextView2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        p7n0 analytics = getAnalytics();
        s7n0 s7n0Var = analytics.b;
        String j = b64.j(s7n0Var.e, ".Shown");
        String str = s7n0Var.a;
        i d = ((j) analytics.a).d(j);
        d.d("type", str);
        d.m();
        getBinding().c.setDebounceClickListener(new v3n0(1, this));
        t7n0 binding = getBinding();
        String str2 = this.config.d;
        if (str2 == null) {
            binding.b.setVisibility(8);
        } else {
            binding.b.setVisibility(0);
            ((nac) this.imageLoader.a(binding.b)).c(str2);
        }
        RobotoTextView robotoTextView = binding.e;
        ButtonComponent buttonComponent = binding.c;
        robotoTextView.setText(this.config.b);
        binding.d.setText(this.config.c);
        buttonComponent.setAccent(true);
        buttonComponent.setText(this.config.f);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        getAnalytics().a(ScootersCommonDialogAnalytics$CloseReason.BACK_PRESSED);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        super.onSlideOut();
        getAnalytics().a(ScootersCommonDialogAnalytics$CloseReason.SLIDE_OUT);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        getAnalytics().a(ScootersCommonDialogAnalytics$CloseReason.TOUCH_OUTSIDE);
    }
}
