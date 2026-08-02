package com.yandex.go.permission.location_with_agreement.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import defpackage.bd;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.ebz;
import defpackage.fbz;
import defpackage.fd;
import defpackage.g18;
import defpackage.gbz;
import defpackage.gf41;
import defpackage.hbz;
import defpackage.hc6;
import defpackage.ibz;
import defpackage.ic6;
import defpackage.jc6;
import defpackage.kdc;
import defpackage.kk5;
import defpackage.nac;
import defpackage.naz;
import defpackage.ny61;
import defpackage.obz;
import defpackage.pav;
import defpackage.pbz;
import defpackage.qbz;
import defpackage.qeb1;
import defpackage.r2g;
import defpackage.rbz;
import defpackage.s8o;
import defpackage.seb1;
import defpackage.sth0;
import defpackage.tje;
import defpackage.uih0;
import defpackage.vf41;
import defpackage.vng;
import defpackage.w030;
import defpackage.xng0;
import defpackage.y130;
import defpackage.yow;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002U\u0005B7\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010 \u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001dH\u0014¢\u0006\u0004\b$\u0010!J\u0017\u0010'\u001a\u00020\u00182\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00182\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010*\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00182\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u001b\u00106\u001a\u00020\u00182\n\b\u0001\u00105\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b6\u00107J\u0019\u0010:\u001a\u00020\u00182\b\u00109\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00182\u0006\u0010<\u001a\u000204H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00182\u0006\u0010?\u001a\u00020-H\u0002¢\u0006\u0004\b@\u0010/J\u0017\u0010B\u001a\u00020\u00182\u0006\u0010A\u001a\u00020-H\u0002¢\u0006\u0004\bB\u0010/J\u001b\u0010D\u001a\u00020\u00182\n\b\u0001\u0010C\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\bD\u00107J\u0017\u0010G\u001a\u00020\u00182\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010IR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010JR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010KR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010T\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006V"}, d2 = {"Lcom/yandex/go/permission/location_with_agreement/ui/LocationPermissionWithAgreementModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Libz;", "Lcom/yandex/go/permission/location_with_agreement/ui/c;", "presenter", "Lhbz;", "payload", "Lpav;", "imageLoader", "Landroid/content/Context;", "context", "Lic6;", "shadowRendererFactory", "<init>", "(Lcom/yandex/go/permission/location_with_agreement/ui/c;Lhbz;Lpav;Landroid/content/Context;Lic6;)V", "Ly130;", "insetsType", "()Ly130;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Libz;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onBackPressed", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lrbz;", "title", "setTitle", "(Lrbz;)V", "", "setButtonTitle", "(Ljava/lang/String;)V", "Lobz;", "agreementParams", "setAgreement", "(Lobz;)V", "", "backgroundImageRes", "setRootBackground", "(Ljava/lang/Integer;)V", "Lqbz;", "locationState", "setLocation", "(Lqbz;)V", "visibility", "changeLocationViewsVisibility", "(I)V", "name", "setIconName", "text", "setIconText", "logoIcon", "setTitleIcon", "Lpbz;", "icon", "setIconImage", "(Lpbz;)V", "Lcom/yandex/go/permission/location_with_agreement/ui/c;", "Lhbz;", "Lpav;", "Lg18;", "iconLoadingCancellable", "Lg18;", "Lhc6;", "bottomContainerShadowRenderer", "Lhc6;", "getLinkTextColor", "()I", "linkTextColor", "gbz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LocationPermissionWithAgreementModalView extends SlideableBindingModalView<ibz> {
    public static final int $stable = 8;
    private final hc6 bottomContainerShadowRenderer;
    private g18 iconLoadingCancellable;
    private final pav imageLoader;
    private final hbz payload;
    private final c presenter;

    public LocationPermissionWithAgreementModalView(c cVar, hbz hbzVar, pav pavVar, Context context, ic6 ic6Var) {
        super(context);
        this.presenter = cVar;
        this.payload = hbzVar;
        this.imageLoader = pavVar;
        this.iconLoadingCancellable = g18.u1;
        this.bottomContainerShadowRenderer = new hc6(getBinding().j, getBinding().k, (ru.yandex.taxi.design.utils.a) ((r2g) ((jc6) ic6Var).a.b).get());
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
    }

    private final void changeLocationViewsVisibility(int visibility) {
        getBinding().d.setVisibility(visibility);
        getBinding().e.setVisibility(visibility);
        getBinding().f.setVisibility(visibility);
    }

    private final int getLinkTextColor() {
        return s8o.m(new bdc(xng0.textMain), getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(LocationPermissionWithAgreementModalView locationPermissionWithAgreementModalView) {
        return locationPermissionWithAgreementModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$onContinueClicked(c cVar) {
        tje.N(cVar.Jg(), null, null, new LocationWithAgreementPresenter$onContinueClicked$1(cVar, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAgreement(obz agreementParams) {
        RobotoTextView robotoTextView = getBinding().b;
        robotoTextView.setTextColor(agreementParams.b);
        robotoTextView.setLinkTextColor(agreementParams.c);
        Spanned c = qeb1.c(agreementParams.a);
        robotoTextView.setText(c);
        if (qeb1.d(c)) {
            robotoTextView.setMovementMethod(seb1.a(new ebz(this, 0)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 setAgreement$lambda$0$0(LocationPermissionWithAgreementModalView locationPermissionWithAgreementModalView, String str) {
        c cVar = locationPermissionWithAgreementModalView.presenter;
        bd bdVar = cVar.y;
        if (bdVar != null) {
            ((fd) cVar.C).f(bdVar, null);
        }
        naz nazVar = cVar.x;
        nazVar.getClass();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        String str2 = null;
        boolean z7 = true;
        String str3 = null;
        boolean z8 = true;
        String str4 = null;
        UiWebViewConfig.SignalForLoaded signalForLoaded = null;
        int i = 0;
        boolean z9 = false;
        boolean z10 = false;
        UiWebViewConfig.ModalViewMode modalViewMode = null;
        boolean z11 = false;
        boolean z12 = false;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(new CoreWebViewConfig(str, null, null, z, z2, z3, false, false, z4, false, z5, z6, false, null, null, null, false, 131070, null), str2, z7, z, z2, z3, str3, z8, z4, str4, z5, z6, signalForLoaded, objArr, objArr2, i, objArr3, z9, z10, modalViewMode, z11, z12, 4194170, null);
        kk5 kk5Var = nazVar.a;
        ((w030) kk5Var.F).s(vf41.a(((gf41) kk5Var.H).a().c(), uiWebViewConfig, null, null, null, 254), true);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setButtonTitle(String title) {
        getBinding().c.setText(title);
    }

    private final void setIconImage(pbz icon) {
        if (icon.a.length() == 0) {
            getBinding().d.setVisibility(4);
            return;
        }
        this.iconLoadingCancellable.cancel();
        nac nacVar = (nac) this.imageLoader.a(getBinding().d);
        nacVar.h = new ebz(this, 1);
        this.iconLoadingCancellable = nacVar.c(icon.a);
        kdc kdcVar = icon.b;
        if (kdcVar != null) {
            getBinding().d.setBackgroundTintList(ColorStateList.valueOf(s8o.m(kdcVar, getContext())));
        }
        kdc kdcVar2 = icon.c;
        if (kdcVar2 != null) {
            getBinding().d.setImageTintList(ColorStateList.valueOf(s8o.m(kdcVar2, getContext())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setIconImage$lambda$0(LocationPermissionWithAgreementModalView locationPermissionWithAgreementModalView, Drawable drawable) {
        cma1.J(locationPermissionWithAgreementModalView.getBinding().d);
        return zy11.a;
    }

    private final void setIconName(String name) {
        getBinding().e.setText(name);
    }

    private final void setIconText(String text) {
        getBinding().f.setText(text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLocation(qbz locationState) {
        if (locationState == null) {
            changeLocationViewsVisibility(8);
            return;
        }
        changeLocationViewsVisibility(0);
        setIconName(locationState.b);
        setIconText(locationState.c);
        setIconImage(locationState.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRootBackground(Integer backgroundImageRes) {
        Drawable drawable;
        ConstraintLayout constraintLayout = getBinding().g;
        if (backgroundImageRes != null) {
            drawable = vng.t(backgroundImageRes.intValue(), getContext());
        } else {
            drawable = null;
        }
        constraintLayout.setBackground(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTitle(rbz title) {
        RobotoTextView robotoTextView = getBinding().l;
        robotoTextView.setText(title.a);
        robotoTextView.setTypeface(title.d);
        robotoTextView.setTextSize(title.b);
        robotoTextView.setLineHeight((int) tje.b0(robotoTextView.getContext(), title.c));
        robotoTextView.setTextColor(title.e);
        ViewGroup.LayoutParams layoutParams = robotoTextView.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (title.f) {
            if (layoutParams2 != null) {
                layoutParams2.topToBottom = getBinding().h.getId();
            }
        } else if (layoutParams2 != null) {
            layoutParams2.topToBottom = getBinding().m.getId();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTitleIcon(Integer logoIcon) {
        if (logoIcon != null) {
            getBinding().i.setImageResource(logoIcon.intValue());
            getBinding().i.setTransitionName("splash_logo_transition");
            getBinding().h.setVisibility(0);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        if (this.payload.a) {
            cma1.b(0.0f, getContent()).withStartAction(startAction).withEndAction(endAction).start();
        } else {
            super.animateDismiss(startAction, endAction);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        if (!this.payload.a) {
            super.animateShow(onAnimateShowStartAction, onAnimateShowEndAction);
        } else {
            getContent().setAlpha(0.0f);
            cma1.b(1.0f, getContent()).withStartAction(onAnimateShowStartAction).withEndAction(onAnimateShowEndAction).start();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        c cVar = this.presenter;
        tje.N(cVar.Jg(), null, null, new LocationWithAgreementPresenter$onThemeChanged$1(cVar, null), 3);
        getBinding().b.setLinkTextColor(getLinkTextColor());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ibz bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(sth0.location_permission_with_agreement_modal_view, parent, false);
        int i = uih0.agreement_content;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView != null) {
            i = uih0.bottom_container;
            if (((FrameLayout) cma1.O(i, inflate)) != null) {
                i = uih0.continue_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent != null) {
                    i = uih0.location_icon;
                    ImageView imageView = (ImageView) cma1.O(i, inflate);
                    if (imageView != null) {
                        i = uih0.location_icon_name;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView2 != null) {
                            i = uih0.location_icon_text;
                            RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView3 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                i = uih0.logo_container;
                                FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                                if (frameLayout != null) {
                                    i = uih0.logo_view;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                                    if (appCompatImageView != null) {
                                        i = uih0.scroll_view;
                                        NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) cma1.O(i, inflate);
                                        if (nestedScrollViewAdvanced != null) {
                                            i = uih0.shadow;
                                            ImageView imageView2 = (ImageView) cma1.O(i, inflate);
                                            if (imageView2 != null) {
                                                i = uih0.title;
                                                RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i, inflate);
                                                if (robotoTextView4 != null) {
                                                    i = uih0.top_guideline;
                                                    Guideline guideline = (Guideline) cma1.O(i, inflate);
                                                    if (guideline != null) {
                                                        return new ibz(constraintLayout, robotoTextView, buttonComponent, imageView, robotoTextView2, robotoTextView3, constraintLayout, frameLayout, appCompatImageView, nestedScrollViewAdvanced, imageView2, robotoTextView4, guideline);
                                                    }
                                                }
                                            }
                                        }
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
    public y130 insetsType() {
        return new y130(1, new yow(22, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setInterceptOnBackPress(false);
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        c cVar = this.presenter;
        gbz gbzVar = new gbz(this);
        cVar.Bg(gbzVar);
        cVar.H.b();
        tje.N(cVar.Jg(), null, null, new LocationWithAgreementPresenter$attachView$1(gbzVar, cVar, null), 3);
        getBinding().c.setDebounceClickListener(new fbz(0, this.presenter));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        c cVar = this.presenter;
        bd bdVar = cVar.y;
        if (bdVar != null) {
            ((fd) cVar.C).c(bdVar);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.iconLoadingCancellable.cancel();
        this.presenter.Cg();
    }
}
