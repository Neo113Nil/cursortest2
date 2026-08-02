package com.yandex.go.payments.shared.antifraud.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.payments.shared.business.accountcreation.corp.personalaccount.splash.CorpPersonalAccountSplashView;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import defpackage.c230;
import defpackage.cma1;
import defpackage.e6h0;
import defpackage.foc;
import defpackage.fue;
import defpackage.gue;
import defpackage.jue;
import defpackage.lse;
import defpackage.lue;
import defpackage.luh0;
import defpackage.lyc;
import defpackage.nue;
import defpackage.ny61;
import defpackage.pue;
import defpackage.ru8;
import defpackage.rue;
import defpackage.tje;
import defpackage.yfa;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/go/payments/shared/antifraud/ui/CorpAntiFraudModalView;", "Llue;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lfue;", "Landroid/content/Context;", "context", "Lnue;", "presenter", "<init>", "(Landroid/content/Context;Lnue;)V", "Lgue;", "corpAntiFraudData", "Lzy11;", "bindTitle", "(Lgue;)V", "bindSubtitle", "bindCreateButton", "bindBackButton", "Lc230;", "insetsType", "()Lc230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lfue;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "isShowSplash", "render", "(Lgue;Z)V", "Lnue;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CorpAntiFraudModalView extends SlideableBindingModalView<fue> implements lue {
    public static final int $stable = 8;
    private final nue presenter;

    public CorpAntiFraudModalView(Context context, nue nueVar) {
        super(context);
        this.presenter = nueVar;
    }

    private final void bindBackButton(gue corpAntiFraudData) {
        ButtonComponent buttonComponent = getBinding().e;
        if (corpAntiFraudData.d.length() <= 0) {
            buttonComponent.setVisibility(8);
            return;
        }
        buttonComponent.setVisibility(0);
        buttonComponent.setText(corpAntiFraudData.d);
        buttonComponent.setDebounceClickListener(new jue(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindBackButton$lambda$0(CorpAntiFraudModalView corpAntiFraudModalView) {
        nue nueVar = corpAntiFraudModalView.presenter;
        yfa yfaVar = nueVar.x;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = nueVar.A;
        rue rueVar = (rue) yfaVar.a;
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        rueVar.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        rueVar.a.a("CorpAntiFraudScreen.CancelTaped", hashMap, 1, new HashMap());
        ((pue) nueVar.B.a).r(new foc(21));
    }

    private final void bindCreateButton(gue corpAntiFraudData) {
        ButtonComponent buttonComponent = getBinding().d;
        if (corpAntiFraudData.c.length() <= 0) {
            buttonComponent.setVisibility(8);
            return;
        }
        buttonComponent.setVisibility(0);
        buttonComponent.setText(corpAntiFraudData.c);
        buttonComponent.setDebounceClickListener(new jue(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindCreateButton$lambda$0(CorpAntiFraudModalView corpAntiFraudModalView) {
        nue nueVar = corpAntiFraudModalView.presenter;
        yfa yfaVar = nueVar.x;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = nueVar.A;
        rue rueVar = (rue) yfaVar.a;
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        rueVar.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        rueVar.a.a("CorpAntiFraudScreen.CreateTaped", hashMap, 1, new HashMap());
        ((pue) nueVar.B.a).r(new foc(22));
    }

    private final void bindSubtitle(gue corpAntiFraudData) {
        if (corpAntiFraudData.b.length() <= 0) {
            getBinding().f.setVisibility(8);
        } else {
            getBinding().f.setVisibility(0);
            getBinding().f.setText(corpAntiFraudData.b);
        }
    }

    private final void bindTitle(gue corpAntiFraudData) {
        if (corpAntiFraudData.a.length() <= 0) {
            getBinding().g.setVisibility(8);
        } else {
            getBinding().g.setVisibility(0);
            getBinding().g.setText(corpAntiFraudData.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(CorpAntiFraudModalView corpAntiFraudModalView) {
        return corpAntiFraudModalView.getBinding().c;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public fue bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(luh0.corp_anti_fraud, parent, false);
        int i = e6h0.anti_fraud_splash;
        CorpPersonalAccountSplashView corpPersonalAccountSplashView = (CorpPersonalAccountSplashView) cma1.O(i, inflate);
        if (corpPersonalAccountSplashView != null) {
            i = e6h0.bottom_button_container;
            if (((BottomEdgeButtonLayout) cma1.O(i, inflate)) != null) {
                i = e6h0.content;
                ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, inflate);
                if (constraintLayout != null) {
                    i = e6h0.end_button;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent != null) {
                        i = e6h0.start_button;
                        ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                        if (buttonComponent2 != null) {
                            i = e6h0.subtitle;
                            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView != null) {
                                i = e6h0.title;
                                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                                if (robotoTextView2 != null) {
                                    i = e6h0.title_icon;
                                    if (((AppCompatImageView) cma1.O(i, inflate)) != null) {
                                        return new fue((FrameLayout) inflate, corpPersonalAccountSplashView, constraintLayout, buttonComponent, buttonComponent2, robotoTextView, robotoTextView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(0, new lyc(20, this), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        nue nueVar = this.presenter;
        gue a = nueVar.z.a();
        nueVar.Bg(this);
        render(a, true);
        yfa yfaVar = nueVar.x;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = nueVar.A;
        rue rueVar = (rue) yfaVar.a;
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        rueVar.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        rueVar.a.a("CorpAntiFraudScreen.Shown", hashMap, 1, new HashMap());
        tje.N(nueVar.Jg(), new ru8(lse.a, 2), null, new CorpAntiFraudPresenter$attachView$1(nueVar, a, this, null), 2);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.lue
    public void render(gue corpAntiFraudData, boolean isShowSplash) {
        if (isShowSplash) {
            Drawable drawable = corpAntiFraudData.f;
            if (drawable != null) {
                getBinding().b.setDrawable(drawable);
            }
            getBinding().b.setAnimating(true);
            getBinding().b.setVisibility(0);
            getBinding().c.setVisibility(4);
        } else {
            getBinding().b.setVisibility(4);
            getBinding().c.setVisibility(0);
        }
        bindTitle(corpAntiFraudData);
        bindSubtitle(corpAntiFraudData);
        bindCreateButton(corpAntiFraudData);
        bindBackButton(corpAntiFraudData);
    }
}
