package com.yandex.go.beginners.presentation;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.beginners.presentation.services_info.views.CommonServicesContainer;
import com.yandex.go.coroutines.b;
import defpackage.cl5;
import defpackage.cma1;
import defpackage.co40;
import defpackage.cxq0;
import defpackage.dho;
import defpackage.dl5;
import defpackage.f0w0;
import defpackage.fhh0;
import defpackage.fl5;
import defpackage.grh0;
import defpackage.hh5;
import defpackage.hvq0;
import defpackage.i3y;
import defpackage.ip11;
import defpackage.ipc;
import defpackage.j24;
import defpackage.jpc;
import defpackage.js4;
import defpackage.kn1;
import defpackage.lx4;
import defpackage.m950;
import defpackage.mrj;
import defpackage.nup0;
import defpackage.ny61;
import defpackage.ok5;
import defpackage.pwy0;
import defpackage.qtb1;
import defpackage.rk5;
import defpackage.vk5;
import defpackage.w6s0;
import defpackage.wk5;
import defpackage.xk5;
import defpackage.xvf0;
import defpackage.y130;
import defpackage.yvf0;
import defpackage.zmh;
import defpackage.zvq0;
import java.util.HashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.badge.DiscountBadgeView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000389:B=\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001e\u0010\u0013J\r\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\u0013J\u001f\u0010#\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0014¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u00112\u0006\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020 H\u0014¢\u0006\u0004\b'\u0010$J\u000f\u0010(\u001a\u00020\u0011H\u0014¢\u0006\u0004\b(\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u0006;"}, d2 = {"Lcom/yandex/go/beginners/presentation/BeginnersOnboardingModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lrk5;", "Landroid/content/Context;", "context", "Ldl5;", "presenter", "Lpwy0;", "themeSwitcherProvider", "Lf0w0;", "superAppHeaderLogoViewDelegate", "Lip11;", "typefaceDelegate", "Lipc;", "servicesAnimationManagerFactory", "<init>", "(Landroid/content/Context;Ldl5;Lpwy0;Lf0w0;Lip11;Lipc;)V", "Lzy11;", "setupModalViewConfig", "()V", "setupViewStyle", "Ly130;", "insetsType", "()Ly130;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lrk5;", "onAttachedToWindow", "disableExitAnimation", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "onDetachedFromWindow", "Ldl5;", "Lpwy0;", "Lf0w0;", "Lip11;", "Lipc;", "", "exitAnimationDisabled", "Z", "Lcom/yandex/go/beginners/presentation/services_info/animation/a;", "servicesAnimationManager$delegate", "Li3y;", "getServicesAnimationManager", "()Lcom/yandex/go/beginners/presentation/services_info/animation/a;", "servicesAnimationManager", "Companion", "xk5", "yk5", "wk5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BeginnersOnboardingModalView extends SlideableBindingModalView<rk5> {
    public static final int $stable = 8;
    public static final wk5 Companion = new wk5();
    public static final int MAIN_TEXT_SIZE = 56;
    public static final int SECONDARY_TEXT_SIZE = 31;
    private boolean exitAnimationDisabled;
    private final dl5 presenter;

    /* renamed from: servicesAnimationManager$delegate, reason: from kotlin metadata */
    private final i3y servicesAnimationManager;
    private final ipc servicesAnimationManagerFactory;
    private final f0w0 superAppHeaderLogoViewDelegate;
    private final pwy0 themeSwitcherProvider;
    private final ip11 typefaceDelegate;

    public BeginnersOnboardingModalView(Context context, dl5 dl5Var, pwy0 pwy0Var, f0w0 f0w0Var, ip11 ip11Var, ipc ipcVar) {
        super(context);
        this.presenter = dl5Var;
        this.themeSwitcherProvider = pwy0Var;
        this.superAppHeaderLogoViewDelegate = f0w0Var;
        this.typefaceDelegate = ip11Var;
        this.servicesAnimationManagerFactory = ipcVar;
        this.servicesAnimationManager = kotlin.a.b(LazyThreadSafetyMode.NONE, new vk5(this, 1));
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.yandex.go.beginners.presentation.services_info.animation.a getServicesAnimationManager() {
        return (com.yandex.go.beginners.presentation.services_info.animation.a) this.servicesAnimationManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(BeginnersOnboardingModalView beginnersOnboardingModalView) {
        return beginnersOnboardingModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(BeginnersOnboardingModalView beginnersOnboardingModalView) {
        dl5 dl5Var = beginnersOnboardingModalView.presenter;
        boolean z = beginnersOnboardingModalView.getServicesAnimationManager().h;
        mrj mrjVar = dl5Var.A;
        if (!z) {
            co40 co40Var = (co40) mrjVar.w;
            Double valueOf = ((dho) mrjVar.c).a(qtb1.w) != null ? Double.valueOf(r1.floatValue()) : null;
            co40Var.getClass();
            HashMap hashMap = new HashMap();
            if (valueOf != null) {
                hashMap.put("duration", valueOf);
            }
            co40Var.a.a("ServicesInfoOnboarding.servicesSkipped", hashMap, 1, new HashMap());
            ((cl5) dl5Var.Dg()).R0();
            return;
        }
        ((cl5) dl5Var.Dg()).startProgress();
        boolean z2 = dl5Var.C;
        if (!z2 && dl5Var.y.a) {
            b.g(dl5Var.Jg(), null, null, new BeginnersOnboardingPresenter$openAuthRouter$1(dl5Var, null), 3);
            return;
        }
        if (!z2) {
            i d = ((j) ((lx4) mrjVar.b)).d("ServicesInfoOnboarding.pushNotificationsPermissionChecked");
            d.d(ACSPConstants.STATUS, "notAsked");
            d.m();
        }
        hh5 hh5Var = dl5Var.x;
        j24 j24Var = new j24(23, dl5Var);
        fl5 fl5Var = (fl5) hh5Var.b;
        fl5Var.z((m950) ((yvf0) fl5Var.G).get(), new ok5(fl5Var, j24Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.yandex.go.beginners.presentation.services_info.animation.a servicesAnimationManager_delegate$lambda$0(BeginnersOnboardingModalView beginnersOnboardingModalView) {
        ipc ipcVar = beginnersOnboardingModalView.servicesAnimationManagerFactory;
        CommonServicesContainer commonServicesContainer = beginnersOnboardingModalView.getBinding().g;
        ButtonComponent buttonComponent = beginnersOnboardingModalView.getBinding().b;
        DiscountBadgeView discountBadgeView = beginnersOnboardingModalView.getBinding().c;
        cxq0 cxq0Var = ((jpc) ipcVar).a;
        return new com.yandex.go.beginners.presentation.services_info.animation.a(commonServicesContainer, buttonComponent, discountBadgeView, (kn1) ((nup0) cxq0Var.b).get(), (zvq0) ((xvf0) cxq0Var.c).get(), (hvq0) ((xvf0) cxq0Var.w).get(), (w6s0) ((xvf0) cxq0Var.x).get());
    }

    private final void setupModalViewConfig() {
        setInterceptOnBackPress(false);
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
    }

    private final void setupViewStyle() {
        ip11 ip11Var = this.typefaceDelegate;
        getContext();
        Typeface d = ((zmh) ip11Var).d();
        getBinding().g.setMainInfoTypeface(d);
        getBinding().c.setTypeface(d);
        RobotoTextView robotoTextView = getBinding().f;
        robotoTextView.setTextSize(1, 56.0f);
        ip11 ip11Var2 = this.typefaceDelegate;
        robotoTextView.getContext();
        robotoTextView.setTypeface(((zmh) ip11Var2).d(), 1);
        robotoTextView.setLineSpacing(0.0f, 0.0f);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        if (!this.exitAnimationDisabled) {
            cma1.b(0.0f, getContent()).withStartAction(startAction).withEndAction(endAction).start();
        } else {
            startAction.run();
            endAction.run();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        getContent().setAlpha(0.0f);
        cma1.b(1.0f, getContent()).withStartAction(onAnimateShowStartAction).withEndAction(onAnimateShowEndAction).start();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public rk5 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(grh0.beginners_onboarding, parent, false);
        int i = fhh0.btn_confirm;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = fhh0.discount_badge;
            DiscountBadgeView discountBadgeView = (DiscountBadgeView) cma1.O(i, inflate);
            if (discountBadgeView != null) {
                i = fhh0.logo;
                AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                if (appCompatImageView != null) {
                    i = fhh0.logo_container;
                    FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                    if (frameLayout != null) {
                        i = fhh0.onboarding_title;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView != null) {
                            i = fhh0.services_info_container;
                            CommonServicesContainer commonServicesContainer = (CommonServicesContainer) cma1.O(i, inflate);
                            if (commonServicesContainer != null) {
                                return new rk5((ConstraintLayout) inflate, buttonComponent, discountBadgeView, appCompatImageView, frameLayout, robotoTextView, commonServicesContainer);
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public final void disableExitAnimation() {
        this.exitAnimationDisabled = true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(1, new vk5(this, 0));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setupModalViewConfig();
        setupViewStyle();
        dl5 dl5Var = this.presenter;
        xk5 xk5Var = new xk5(this);
        dl5Var.Bg(xk5Var);
        mrj mrjVar = dl5Var.A;
        ((dho) mrjVar.c).c(qtb1.w);
        ((j) ((lx4) mrjVar.b)).d("ServicesInfoOnboarding.started").m();
        xk5Var.render(dl5Var.y);
        b.g(dl5Var.Jg(), null, null, new BeginnersOnboardingPresenter$attachView$1(dl5Var, xk5Var, null), 3);
        getBinding().b.setDebounceClickListener(new js4(10, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
