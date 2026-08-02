package com.yandex.go.external_service.view;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.yandex.go.shortcuts.dto.response.PromoMode;
import com.yandex.go.superapp.api.analytics.SuperappAnalytics$EatsKitControllerState;
import com.yandex.go.superapp.api.analytics.SuperappAnalytics$ModalViewState;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.c1o;
import defpackage.c2p;
import defpackage.cma1;
import defpackage.d1p;
import defpackage.d2p;
import defpackage.dzm;
import defpackage.e1p;
import defpackage.e2p;
import defpackage.esv0;
import defpackage.fam;
import defpackage.fva0;
import defpackage.g2p;
import defpackage.g8e;
import defpackage.gof0;
import defpackage.h1p;
import defpackage.ham;
import defpackage.ith0;
import defpackage.jih0;
import defpackage.jst;
import defpackage.lbm;
import defpackage.loj;
import defpackage.nac;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pav;
import defpackage.q7w0;
import defpackage.qoi0;
import defpackage.rvq0;
import defpackage.rx3;
import defpackage.t1w;
import defpackage.v770;
import defpackage.v8w0;
import defpackage.w130;
import defpackage.w511;
import defpackage.wrv0;
import defpackage.x4e;
import defpackage.x6w0;
import defpackage.xby;
import defpackage.xen;
import defpackage.xw31;
import defpackage.y3p;
import defpackage.yrv0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.random.Random;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.eatskit.Controller$State;
import ru.yandex.taxi.eatskit.EatsKitContentView;
import ru.yandex.taxi.eatskit.c;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.superapp.adjust.SupportedAdjustEvents;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FB3\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0012H\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\"J\u000f\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\u00122\b\u0010/\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b0\u0010.J\u0017\u00103\u001a\u00020\u001e2\u0006\u00102\u001a\u000201H\u0017¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0012H\u0014¢\u0006\u0004\b5\u0010\"J\u000f\u00106\u001a\u00020\u0012H\u0014¢\u0006\u0004\b6\u0010\"J\u0017\u00108\u001a\u00020\u001e2\u0006\u00107\u001a\u000201H\u0016¢\u0006\u0004\b8\u00104J\u000f\u00109\u001a\u00020\u0012H\u0014¢\u0006\u0004\b9\u0010\"J\u000f\u0010:\u001a\u00020\u001eH\u0002¢\u0006\u0004\b:\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010<R\u0016\u0010=\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/yandex/go/external_service/view/ExternalServiceModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Le2p;", "Landroid/content/Context;", "context", "Lq7w0;", "superAppWebViewFacade", "Lg2p;", "presenter", "Lx6w0;", "serviceModel", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lq7w0;Lg2p;Lx6w0;Lpav;)V", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", "behavior", "Lzy11;", "initBehavior", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "Lw130;", "insetsType", "()Lw130;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Le2p;", "", "isApplyShadow", "()Z", "onAttachedToWindow", "()V", "expand", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "", "newOffset", "setBackgroundDimColor", "(F)V", "Ljava/lang/Runnable;", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "onTouchOutsideListener", "setOnTouchOutsideListener", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onDetachedFromWindow", "onAppearAnimationComplete", "ev", "onInterceptTouchEvent", "onBackPressed", "canScrollWebViewContentUp", "Lq7w0;", "Lg2p;", "dismissZoneHeightPx", CA20Status.STATUS_USER_I, "Lham;", "draggableHeaderBehaviour", "Lham;", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "webView", "d2p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExternalServiceModalView extends SlideableBindingModalView<e2p> {
    private int dismissZoneHeightPx;
    private final ham draggableHeaderBehaviour;
    private final g2p presenter;
    private final q7w0 superAppWebViewFacade;

    public ExternalServiceModalView(Context context, q7w0 q7w0Var, g2p g2pVar, x6w0 x6w0Var, pav pavVar) {
        super(context, 4);
        this.superAppWebViewFacade = q7w0Var;
        this.presenter = g2pVar;
        this.dismissZoneHeightPx = -1;
        this.draggableHeaderBehaviour = new ham(new c1o(11, this));
        e2p binding = getBinding();
        binding.b.setCurrentStateChangeListener(new xen(8, this));
        EatsKitContentView eatsKitContentView = binding.b;
        c cVar = g2pVar.A;
        cVar.l = eatsKitContentView;
        cVar.v(eatsKitContentView);
        eatsKitContentView.updateState(cVar.f);
        binding.a.addView(getWebView(), 0);
        setEnableBackgroundOnAppearing(false);
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
        setArrowState(ArrowsView.State.GONE);
        String str = x6w0Var.q;
        h1p h1pVar = x6w0Var.a;
        if (str != null) {
            lbm f = pavVar.f(new loj(17, this), getBinding().b);
            if (h1pVar.getLogoId() != 0) {
                ((nac) f).e(h1pVar.getLogoId());
            }
            ((nac) f).c(str);
        }
    }

    private final boolean canScrollWebViewContentUp() {
        return this.superAppWebViewFacade.canScrollUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean draggableHeaderBehaviour$lambda$0(ExternalServiceModalView externalServiceModalView) {
        return !externalServiceModalView.canScrollWebViewContentUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebView getWebView() {
        return this.superAppWebViewFacade.getView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(ExternalServiceModalView externalServiceModalView, t1w t1wVar) {
        externalServiceModalView.setPadding(externalServiceModalView.getPaddingLeft(), t1wVar.b, externalServiceModalView.getPaddingRight(), externalServiceModalView.getPaddingBottom());
        ViewGroup cardContentContainer = externalServiceModalView.getCardContentContainer();
        cardContentContainer.setPadding(cardContentContainer.getPaddingLeft(), cardContentContainer.getPaddingTop(), cardContentContainer.getPaddingRight(), t1wVar.g);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$0(ExternalServiceModalView externalServiceModalView, Controller$State controller$State) {
        g2p g2pVar = externalServiceModalView.presenter;
        yrv0 yrv0Var = g2pVar.I;
        h1p h1pVar = g2pVar.J;
        yrv0Var.getClass();
        if (controller$State != Controller$State.ERROR) {
            if (controller$State == Controller$State.LOADING) {
                fva0.f(yrv0Var.c, g8e.o("Superapp.Showcase.LoadingIndicatorDisappeared.", h1pVar.getValue()), PerformanceAnalytics$Type.Loading, 0L, 4);
            }
            yrv0Var.a(h1pVar).d = null;
            yrv0Var.a(h1pVar).b = null;
            yrv0Var.a(h1pVar).e = null;
            yrv0Var.a(h1pVar).c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$1$0(ExternalServiceModalView externalServiceModalView, EatsKitContentView eatsKitContentView, Drawable drawable) {
        externalServiceModalView.getBinding().b.setServiceLogo(drawable);
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return R.color.black;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public e2p bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(ith0.external_service_modal_view, parent, false);
        FrameLayout frameLayout = (FrameLayout) inflate;
        int i = jih0.superapp_card_content;
        EatsKitContentView eatsKitContentView = (EatsKitContentView) cma1.O(i, inflate);
        if (eatsKitContentView != null) {
            return new e2p(frameLayout, eatsKitContentView);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void expand() {
        long j;
        SuperappAnalytics$EatsKitControllerState superappAnalytics$EatsKitControllerState;
        super.expand();
        g2p g2pVar = this.presenter;
        g2pVar.K.a(0, qoi0.a(g2p.class), false);
        e1p e1pVar = g2pVar.D;
        y3p y3pVar = g2pVar.B;
        v770 v770Var = y3pVar.a.b;
        if (v770Var == null) {
            v770Var = v770.b;
        }
        boolean z = y3pVar.c;
        gof0 gof0Var = e1pVar.b;
        h1p h1pVar = e1pVar.c;
        PromoMode a = gof0Var.a();
        yrv0 yrv0Var = e1pVar.a;
        yrv0Var.getClass();
        yrv0Var.c("Superapp.Showcase.Appeared", h1pVar, new rx3(v770Var, a, !z, 16));
        yrv0Var.h = new esv0(v770Var, h1pVar, System.currentTimeMillis());
        String a2 = yrv0Var.e.a(SupportedAdjustEvents.SHOWCASE_APPEARED, h1pVar.getValue());
        if (a2 != null) {
            ((j) yrv0Var.a).v(a2);
        }
        wrv0 a3 = yrv0Var.a(h1pVar);
        a3.a = true;
        yrv0Var.d(h1pVar, a3);
        Long l = g2pVar.P;
        if (l != null) {
            j = SystemClock.elapsedRealtime() - l.longValue();
        } else {
            j = 0;
        }
        g2pVar.P = null;
        Controller$State controller$State = g2pVar.A.f;
        int i = (int) j;
        v8w0 v8w0Var = e1pVar.d;
        String value = h1pVar.getValue();
        int i2 = d1p.a[controller$State.ordinal()];
        if (i2 == 1 || i2 == 2) {
            superappAnalytics$EatsKitControllerState = SuperappAnalytics$EatsKitControllerState.Loading;
        } else {
            if (i2 != 3 && i2 != 4 && i2 != 5) {
                w511.b();
                return;
            }
            superappAnalytics$EatsKitControllerState = SuperappAnalytics$EatsKitControllerState.Active;
        }
        HashMap p = x4e.p(Constants.KEY_SERVICE, value);
        p.put(ClidProvider.STATE, superappAnalytics$EatsKitControllerState.getEventValue());
        p.put("timeSinceAttach", Integer.valueOf(i));
        v8w0Var.a.a("Superapp.Showcase.Expanded", p, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void initBehavior(AnchorBottomSheetBehavior<View> behavior) {
        super.initBehavior(behavior);
        behavior.K(0, true);
        behavior.c0 = true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public w130 insetsType() {
        return new w130(1, new dzm(13, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g2p g2pVar = this.presenter;
        d2p d2pVar = new d2p(this);
        g2pVar.Bg(d2pVar);
        g2pVar.P = Long.valueOf(SystemClock.elapsedRealtime());
        g2pVar.H.a(d2pVar);
        g2pVar.C.a();
        c cVar = g2pVar.A;
        cVar.x = new dzm(14, d2pVar);
        g2pVar.O.a.set(true);
        rvq0 rvq0Var = g2pVar.L;
        h1p h1pVar = g2pVar.J;
        rvq0Var.c.d = h1pVar.getValue();
        cVar.t(true);
        int i = 0;
        g2pVar.N.i(h1pVar.getValue(), false);
        ham hamVar = this.draggableHeaderBehaviour;
        View cardContentView = getCardContentView();
        ViewGroup bottomSheet = getBottomSheet();
        AnchorBottomSheetBehavior<View> bottomSheetBehavior = getBottomSheetBehavior();
        hamVar.getClass();
        bottomSheetBehavior.q0 = new fam(ru.yandex.taxi.design.utils.c.o(cardContentView), bottomSheet, new int[2], hamVar, bottomSheetBehavior, 1);
        bottomSheetBehavior.M = null;
        bottomSheetBehavior.J(true);
        if (this.presenter.A.f == Controller$State.LOADING) {
            getWebView().post(new c2p(this, i));
            return;
        }
        Random.a.getClass();
        long g = Random.b.g();
        getWebView().postVisualStateCallback(g, new ExternalServiceModalView$onAttachedToWindow$2(g, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        if (this.presenter.A.i()) {
            return;
        }
        collapse();
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        ham hamVar = this.draggableHeaderBehaviour;
        hamVar.getClass();
        if (ev.getAction() == 0) {
            hamVar.c = (int) ev.getY();
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        SuperappAnalytics$ModalViewState superappAnalytics$ModalViewState;
        boolean o = xw31.o(getRootView(), getCardContentView(), event);
        if (!o) {
            g2p g2pVar = this.presenter;
            int i = getBottomSheetBehavior().E;
            e1p e1pVar = g2pVar.D;
            e1pVar.getClass();
            switch (i) {
                case 1:
                case 2:
                    superappAnalytics$ModalViewState = SuperappAnalytics$ModalViewState.Settling;
                    break;
                case 3:
                case 6:
                case 7:
                    superappAnalytics$ModalViewState = SuperappAnalytics$ModalViewState.Expanded;
                    break;
                case 4:
                case 5:
                    superappAnalytics$ModalViewState = SuperappAnalytics$ModalViewState.Collapsed;
                    break;
                default:
                    superappAnalytics$ModalViewState = null;
                    xby.t(jst.e, "SUPERAPP:EXTERNAL_SERVICE:ANALYTICS", null, oyr.i(i, "Tried to log with incorrect modal view state: "), 6);
                    break;
            }
            if (superappAnalytics$ModalViewState != null) {
                v8w0 v8w0Var = e1pVar.d;
                HashMap p = x4e.p(Constants.KEY_SERVICE, e1pVar.c.getValue());
                p.put(ClidProvider.STATE, superappAnalytics$ModalViewState.getEventValue());
                v8w0Var.a.a("Superapp.Showcase.TouchOutside", p, 1, new HashMap());
            }
        }
        return o;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setBackgroundDimColor(float newOffset) {
        int i = getBottomSheetBehavior().E;
        if (i == 1 || i == 2) {
            super.setBackgroundDimColor(newOffset);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void setOnTouchOutsideListener(Runnable onTouchOutsideListener) {
    }
}
