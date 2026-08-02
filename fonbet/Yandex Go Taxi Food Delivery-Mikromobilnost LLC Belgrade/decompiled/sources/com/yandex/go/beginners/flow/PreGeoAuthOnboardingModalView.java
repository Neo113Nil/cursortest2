package com.yandex.go.beginners.flow;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.ahe0;
import defpackage.bd;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.f0w0;
import defpackage.fd;
import defpackage.fhh0;
import defpackage.fl5;
import defpackage.gdc;
import defpackage.gf41;
import defpackage.gl5;
import defpackage.grh0;
import defpackage.ip11;
import defpackage.jlh;
import defpackage.k7d0;
import defpackage.m2h0;
import defpackage.mqg0;
import defpackage.nn50;
import defpackage.ny61;
import defpackage.pge0;
import defpackage.pj;
import defpackage.pwy0;
import defpackage.qje;
import defpackage.qu;
import defpackage.r0d0;
import defpackage.tge0;
import defpackage.tls;
import defpackage.uge0;
import defpackage.vf41;
import defpackage.w030;
import defpackage.x95;
import defpackage.xng0;
import defpackage.y130;
import defpackage.zge0;
import defpackage.zmh;
import defpackage.zy11;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

@Metadata(d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001>\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002;AB5\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0018H\u0014¢\u0006\u0004\b&\u0010\u001aJ\u000f\u0010'\u001a\u00020\u0018H\u0002¢\u0006\u0004\b'\u0010\u001aJ\u0017\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010\u001aJ\u0017\u0010-\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b-\u0010+J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b.\u0010+J\u000f\u0010/\u001a\u00020\u0018H\u0002¢\u0006\u0004\b/\u0010\u001aJ+\u00105\u001a\u0002002\u0006\u00101\u001a\u0002002\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u001802H\u0002¢\u0006\u0004\b5\u00106R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010:R\u0018\u0010<\u001a\u00060;R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/yandex/go/beginners/flow/PreGeoAuthOnboardingModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lgl5;", "Landroid/content/Context;", "context", "Lcom/yandex/go/beginners/presentation/a;", "presenter", "Lpwy0;", "themeSwitcherProvider", "Lf0w0;", "superAppHeaderLogoViewDelegate", "Lip11;", "typefaceDelegate", "<init>", "(Landroid/content/Context;Lcom/yandex/go/beginners/presentation/a;Lpwy0;Lf0w0;Lip11;)V", "Ly130;", "insetsType", "()Ly130;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lgl5;", "Lzy11;", "onAttachedToWindow", "()V", "", "newState", "", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "Ljava/lang/Runnable;", "startAction", "endAction", "animateDismiss", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "onDetachedFromWindow", "setupLogo", "Lahe0;", "uiState", "setupTitles", "(Lahe0;)V", "setupRideIconHorizontalFlip", "setupButton", "setupAgreementBlock", "updateAgreementScrollFadeVisibility", "", "source", "Lkotlin/Function1;", "", "onLinkClick", "wrapAgreementLinkSpans", "(Ljava/lang/CharSequence;Ltls;)Ljava/lang/CharSequence;", "Lcom/yandex/go/beginners/presentation/a;", "Lpwy0;", "Lf0w0;", "Lip11;", "Ltge0;", "entranceAnimations", "Ltge0;", "uge0", "innerMvpView", "Luge0;", "wge0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PreGeoAuthOnboardingModalView extends SlideableBindingModalView<gl5> {
    public static final int $stable = 8;
    private final tge0 entranceAnimations;
    private final uge0 innerMvpView;
    private final com.yandex.go.beginners.presentation.a presenter;
    private final f0w0 superAppHeaderLogoViewDelegate;
    private final pwy0 themeSwitcherProvider;
    private final ip11 typefaceDelegate;

    public PreGeoAuthOnboardingModalView(Context context, com.yandex.go.beginners.presentation.a aVar, pwy0 pwy0Var, f0w0 f0w0Var, ip11 ip11Var) {
        super(context);
        this.presenter = aVar;
        this.themeSwitcherProvider = pwy0Var;
        this.superAppHeaderLogoViewDelegate = f0w0Var;
        this.typefaceDelegate = ip11Var;
        this.entranceAnimations = new tge0(this);
        this.innerMvpView = new uge0(this);
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
    }

    public static final /* synthetic */ gl5 access$getBinding(PreGeoAuthOnboardingModalView preGeoAuthOnboardingModalView) {
        return preGeoAuthOnboardingModalView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(PreGeoAuthOnboardingModalView preGeoAuthOnboardingModalView) {
        return preGeoAuthOnboardingModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupAgreementBlock(ahe0 uiState) {
        String str;
        bd bdVar;
        bd bdVar2 = uiState.e;
        if (bdVar2 == null || (str = bdVar2.e) == null || evu0.J(str)) {
            str = null;
        }
        int i = 0;
        getBinding().b.setVisibility(str != null ? 0 : 8);
        getBinding().f.setOnScrollChangeListener((nn50) null);
        if (str == null || bdVar2 == null) {
            getBinding().e.setText("");
            getBinding().d.setVisibility(8);
            getBinding().c.setVisibility(8);
            return;
        }
        getBinding().e.setMovementMethod(LinkMovementMethod.getInstance());
        getBinding().e.setNestedScrollingEnabled(false);
        getBinding().e.setText(wrapAgreementLinkSpans(Html.fromHtml(str, 0), new k7d0(16, this)));
        getBinding().e.setTextLinkColor(new gdc(mqg0.component_blue_normal));
        getBinding().f.setOnScrollChangeListener(new x95(7, this));
        NestedScrollViewAdvanced nestedScrollViewAdvanced = getBinding().f;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        if (!nestedScrollViewAdvanced.isLaidOut() || nestedScrollViewAdvanced.isLayoutRequested()) {
            nestedScrollViewAdvanced.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.beginners.flow.PreGeoAuthOnboardingModalView$setupAgreementBlock$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    PreGeoAuthOnboardingModalView.this.updateAgreementScrollFadeVisibility();
                }
            });
        } else {
            updateAgreementScrollFadeVisibility();
        }
        RobotoTextView robotoTextView = getBinding().e;
        if (!robotoTextView.isLaidOut() || robotoTextView.isLayoutRequested()) {
            robotoTextView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.beginners.flow.PreGeoAuthOnboardingModalView$setupAgreementBlock$$inlined$doOnLayout$2
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    PreGeoAuthOnboardingModalView.this.updateAgreementScrollFadeVisibility();
                }
            });
        } else {
            updateAgreementScrollFadeVisibility();
        }
        getBinding().f.post(new pge0(this, i));
        getBinding().e.post(new pge0(this, 1));
        GoLinearLayout goLinearLayout = getBinding().b;
        if (!goLinearLayout.isLaidOut() || goLinearLayout.isLayoutRequested()) {
            goLinearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.beginners.flow.PreGeoAuthOnboardingModalView$setupAgreementBlock$$inlined$doOnLayout$3
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    bd bdVar3;
                    view.removeOnLayoutChangeListener(this);
                    if (PreGeoAuthOnboardingModalView.access$getBinding(PreGeoAuthOnboardingModalView.this).b.getVisibility() != 0 || PreGeoAuthOnboardingModalView.access$getBinding(PreGeoAuthOnboardingModalView.this).b.getWidth() <= 0) {
                        return;
                    }
                    com.yandex.go.beginners.presentation.a aVar = PreGeoAuthOnboardingModalView.this.presenter;
                    if (aVar.D || (bdVar3 = aVar.y.e) == null) {
                        return;
                    }
                    aVar.D = true;
                    ((fd) aVar.B).g(bdVar3);
                }
            });
            return;
        }
        if (access$getBinding(this).b.getVisibility() != 0 || access$getBinding(this).b.getWidth() <= 0) {
            return;
        }
        com.yandex.go.beginners.presentation.a aVar = this.presenter;
        if (aVar.D || (bdVar = aVar.y.e) == null) {
            return;
        }
        aVar.D = true;
        ((fd) aVar.B).g(bdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 setupAgreementBlock$lambda$1(PreGeoAuthOnboardingModalView preGeoAuthOnboardingModalView, String str) {
        com.yandex.go.beginners.presentation.a aVar = preGeoAuthOnboardingModalView.presenter;
        bd bdVar = aVar.y.e;
        if (bdVar != null) {
            ((fd) aVar.B).f(bdVar, "text");
            zge0 zge0Var = aVar.x;
            zge0Var.getClass();
            String obj = evu0.k0(str).toString();
            if (obj.length() != 0) {
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                String str2 = null;
                boolean z6 = true;
                String str3 = null;
                boolean z7 = true;
                String str4 = null;
                boolean z8 = false;
                Float f = null;
                int i = 0;
                int i2 = 0;
                boolean z9 = false;
                boolean z10 = false;
                UiWebViewConfig.ModalViewMode modalViewMode = null;
                boolean z11 = false;
                boolean z12 = false;
                Object[] objArr = 0 == true ? 1 : 0;
                Object[] objArr2 = 0 == true ? 1 : 0;
                UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(new CoreWebViewConfig(obj, null, null, false, false, z, z2, z3, false, false, z4, false, z5, null, null, null, false, 131070, null), str2, z6, z, z2, z3, str3, z7, z4, str4, z5, z8, objArr, objArr2, f, i, i2, z9, z10, modalViewMode, z11, z12, 4194170, null);
                fl5 fl5Var = zge0Var.a;
                ((w030) fl5Var.F).s(vf41.a(((gf41) fl5Var.G).a().c(), uiWebViewConfig, null, null, null, 254), true);
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupButton(ahe0 uiState) {
        ButtonComponent buttonComponent = getBinding().g;
        buttonComponent.setText(uiState.c);
        buttonComponent.setDebounceClickListener(new pge0(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupButton$lambda$0$0(PreGeoAuthOnboardingModalView preGeoAuthOnboardingModalView) {
        com.yandex.go.beginners.presentation.a aVar = preGeoAuthOnboardingModalView.presenter;
        pj pjVar = (pj) aVar.A.a;
        pjVar.getClass();
        pjVar.a.a("EarlyAuthOnboarding.Button.Tapped", new HashMap(), 1, new HashMap());
        bd bdVar = aVar.y.e;
        if (bdVar != null) {
            ((fd) aVar.B).d(bdVar, Boolean.FALSE);
            ((com.yandex.go.agreement.interactor.a) aVar.C).a(bdVar);
        }
        aVar.x.a.r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupLogo() {
        f0w0 f0w0Var = this.superAppHeaderLogoViewDelegate;
        boolean z = this.themeSwitcherProvider.getThemeType() == ThemeType.LIGHT;
        ((jlh) f0w0Var).getClass();
        getBinding().h.setImageResource(z ? m2h0.ic_default_logo : m2h0.ic_default_logo_night);
        getBinding().i.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupRideIconHorizontalFlip() {
        getBinding().j.setScaleX(getResources().getConfiguration().getLayoutDirection() == 1 ? 1.0f : -1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupTitles(ahe0 uiState) {
        RobotoTextView robotoTextView;
        ip11 ip11Var = this.typefaceDelegate;
        getContext();
        Typeface d = ((zmh) ip11Var).d();
        int t = qje.t(xng0.textMain, getContext());
        if (uiState.d) {
            getBinding().n.setVisibility(8);
            getBinding().l.setVisibility(0);
            robotoTextView = getBinding().l;
        } else {
            getBinding().l.setVisibility(8);
            getBinding().n.setVisibility(0);
            robotoTextView = getBinding().n;
        }
        robotoTextView.setText(uiState.a);
        robotoTextView.setTypeface(d, 1);
        robotoTextView.setTextColor(t);
        RobotoTextView robotoTextView2 = getBinding().m;
        robotoTextView2.setText(uiState.b);
        robotoTextView2.setTypeface(d, 1);
        robotoTextView2.setTextColor(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAgreementScrollFadeVisibility() {
        if (getBinding().b.getVisibility() != 0) {
            getBinding().d.setVisibility(8);
            getBinding().c.setVisibility(8);
            return;
        }
        NestedScrollViewAdvanced nestedScrollViewAdvanced = getBinding().f;
        RobotoTextView robotoTextView = getBinding().e;
        int width = (nestedScrollViewAdvanced.getWidth() - nestedScrollViewAdvanced.getPaddingLeft()) - nestedScrollViewAdvanced.getPaddingRight();
        int height = (nestedScrollViewAdvanced.getHeight() - nestedScrollViewAdvanced.getPaddingTop()) - nestedScrollViewAdvanced.getPaddingBottom();
        if (width <= 0 || height <= 0) {
            getBinding().d.setVisibility(8);
            getBinding().c.setVisibility(8);
            return;
        }
        robotoTextView.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = robotoTextView.getMeasuredHeight() - height;
        if (measuredHeight < 0) {
            measuredHeight = 0;
        }
        boolean z = measuredHeight > 0;
        int scrollY = nestedScrollViewAdvanced.getScrollY();
        boolean z2 = scrollY > 0;
        boolean z3 = scrollY < measuredHeight;
        boolean z4 = z && z2;
        boolean z5 = z && z3;
        getBinding().d.setVisibility(z4 ? 0 : 8);
        getBinding().c.setVisibility(z5 ? 0 : 8);
        ViewParent parent = getBinding().c.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        if (z4) {
            viewGroup.bringChildToFront(getBinding().d);
        }
        if (z5) {
            viewGroup.bringChildToFront(getBinding().c);
        }
    }

    private final CharSequence wrapAgreementLinkSpans(CharSequence source, final tls onLinkClick) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(source);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
            int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
            final String url = uRLSpan.getURL();
            spannableStringBuilder.removeSpan(uRLSpan);
            spannableStringBuilder.setSpan(new URLSpan(url, onLinkClick) { // from class: com.yandex.go.beginners.flow.PreGeoAuthOnboardingModalView$wrapAgreementLinkSpans$1
                final /* synthetic */ tls $onLinkClick;
                final /* synthetic */ String $url;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(url);
                    this.$url = url;
                    this.$onLinkClick = onLinkClick;
                }

                @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                public void onClick(View widget) {
                    this.$onLinkClick.invoke(this.$url);
                }
            }, spanStart, spanEnd, spanFlags);
        }
        return spannableStringBuilder;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        this.entranceAnimations.c();
        super.animateDismiss(startAction, endAction);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public gl5 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View O2;
        View inflate = inflater.inflate(grh0.beginners_pre_geo_auth_onboarding, parent, false);
        int i = fhh0.agreement_block;
        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
        if (goLinearLayout != null && (O = cma1.O((i = fhh0.agreement_scroll_fade), inflate)) != null && (O2 = cma1.O((i = fhh0.agreement_scroll_fade_top), inflate)) != null) {
            i = fhh0.agreement_text;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = fhh0.agreement_text_scroll;
                NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) cma1.O(i, inflate);
                if (nestedScrollViewAdvanced != null) {
                    i = fhh0.bottom_section;
                    if (((GoLinearLayout) cma1.O(i, inflate)) != null) {
                        i = fhh0.btn_continue;
                        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                        if (buttonComponent != null) {
                            i = fhh0.logo;
                            GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                            if (goImageView != null) {
                                i = fhh0.logo_container;
                                GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
                                if (goFrameLayout != null) {
                                    i = fhh0.mock_illustration;
                                    GoImageView goImageView2 = (GoImageView) cma1.O(i, inflate);
                                    if (goImageView2 != null) {
                                        i = fhh0.mock_illustration_container;
                                        GoFrameLayout goFrameLayout2 = (GoFrameLayout) cma1.O(i, inflate);
                                        if (goFrameLayout2 != null) {
                                            i = fhh0.reversed_title_prefix;
                                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                                            if (robotoTextView2 != null) {
                                                i = fhh0.rides_icon_row;
                                                if (((GoLinearLayout) cma1.O(i, inflate)) != null) {
                                                    i = fhh0.title_highlight;
                                                    RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, inflate);
                                                    if (robotoTextView3 != null) {
                                                        i = fhh0.title_prefix;
                                                        RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i, inflate);
                                                        if (robotoTextView4 != null) {
                                                            i = fhh0.title_row;
                                                            if (((GoLinearLayout) cma1.O(i, inflate)) != null) {
                                                                return new gl5((GoConstraintLayout) inflate, goLinearLayout, O, O2, robotoTextView, nestedScrollViewAdvanced, buttonComponent, goImageView, goFrameLayout, goImageView2, goFrameLayout2, robotoTextView2, robotoTextView3, robotoTextView4);
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
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(1, new r0d0(17, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setInterceptOnBackPress(false);
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        this.presenter.Kg(this.innerMvpView);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        super.onBehaviorStateChanged(newState, movedByUser);
        this.entranceAnimations.e();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.entranceAnimations.c();
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }
}
