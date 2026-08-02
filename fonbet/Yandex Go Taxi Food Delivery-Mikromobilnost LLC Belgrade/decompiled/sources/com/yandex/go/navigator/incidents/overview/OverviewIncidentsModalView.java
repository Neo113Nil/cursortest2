package com.yandex.go.navigator.incidents.overview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.navigator.BaseNavigatorModalView;
import com.yandex.go.navigator.domain.e;
import com.yandex.go.navigator.incidents.overview.OverviewIncidentsModalView;
import com.yandex.go.navigator.incidents.overview.analytics.OverviewIncidentsAnalytics$AnalyticsStatusChange;
import com.yandex.go.navigator.repository.o;
import defpackage.ah00;
import defpackage.cma1;
import defpackage.ewc;
import defpackage.fuh0;
import defpackage.h1z;
import defpackage.jl40;
import defpackage.k1a;
import defpackage.md60;
import defpackage.ny61;
import defpackage.nyy;
import defpackage.p290;
import defpackage.qu;
import defpackage.t290;
import defpackage.t2v0;
import defpackage.tje;
import defpackage.u290;
import defpackage.vov;
import defpackage.w290;
import defpackage.w511;
import defpackage.wb50;
import defpackage.yov;
import defpackage.z290;
import defpackage.z5h0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.discovery.a;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BU\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0014¢\u0006\u0004\b!\u0010 J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101¨\u00062"}, d2 = {"Lcom/yandex/go/navigator/incidents/overview/OverviewIncidentsModalView;", "Lcom/yandex/go/navigator/BaseNavigatorModalView;", "Lp290;", "Lt290;", "Landroid/content/Context;", "context", "Lw290;", "presenter", "Lru/yandex/taxi/discovery/a;", "discoveryPresenter", "Lah00;", "mapController", "Lwb50;", "focusCoordinator", "Lcom/yandex/go/navigator/repository/o;", "userInteractionsListener", "Lcom/yandex/go/navigator/domain/e;", "focusModeChangeEventRepository", "Lewc;", "compassButtonPresenter", "Lcom/yandex/go/navigator/analitycs/a;", "navigatorMainScreenAnalyticInteractor", "<init>", "(Landroid/content/Context;Lw290;Lru/yandex/taxi/discovery/a;Lah00;Lwb50;Lcom/yandex/go/navigator/repository/o;Lcom/yandex/go/navigator/domain/e;Lewc;Lcom/yandex/go/navigator/analitycs/a;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lp290;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "screenName", "()Ljava/lang/String;", "", "isArrowsPermanentlyHidden", "()Z", "", "getBottomFocusRectOffset", "()I", "awaitFocusRectReady", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lz290;", "uiState", "render", "(Lz290;)V", "Lw290;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OverviewIncidentsModalView extends BaseNavigatorModalView<p290> implements t290 {
    public static final int $stable = 8;
    private final w290 presenter;

    public OverviewIncidentsModalView(Context context, w290 w290Var, a aVar, ah00 ah00Var, wb50 wb50Var, o oVar, e eVar, ewc ewcVar, com.yandex.go.navigator.analitycs.a aVar2) {
        super(context, aVar, ah00Var, wb50Var, oVar, eVar, ewcVar, aVar2);
        this.presenter = w290Var;
        setAnimateOnAppearing(true);
        getRightSideButtonsContainer().a.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$0$0$onDecline(w290 w290Var) {
        w290Var.F.a(OverviewIncidentsAnalytics$AnalyticsStatusChange.NotAnymore);
        yov yovVar = w290Var.E;
        yovVar.a.b(new vov(w290Var.y.a, yovVar, 1), true);
        ((k1a) w290Var.x.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$0$1$onApprove(w290 w290Var) {
        w290Var.F.a(OverviewIncidentsAnalytics$AnalyticsStatusChange.StillThere);
        yov yovVar = w290Var.E;
        yovVar.a.b(new vov(w290Var.y.a, yovVar, 0), true);
        ((k1a) w290Var.x.a).r(new qu(9));
    }

    @Override // defpackage.t290
    public Object awaitFocusRectReady(Continuation<? super zy11> continuation) {
        return prepareStaticFocusRect(continuation);
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public p290 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(fuh0.overview_event_view, parent, false);
        int i = z5h0.incident_icon;
        GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
        if (goImageView != null) {
            i = z5h0.incident_no;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = z5h0.incident_subtitle;
                ShimmeringRobotoTextView shimmeringRobotoTextView = (ShimmeringRobotoTextView) cma1.O(i, inflate);
                if (shimmeringRobotoTextView != null) {
                    i = z5h0.incident_title;
                    ShimmeringRobotoTextView shimmeringRobotoTextView2 = (ShimmeringRobotoTextView) cma1.O(i, inflate);
                    if (shimmeringRobotoTextView2 != null) {
                        i = z5h0.incident_yes;
                        ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                        if (buttonComponent2 != null) {
                            i = z5h0.small_camera_icon;
                            GoImageView goImageView2 = (GoImageView) cma1.O(i, inflate);
                            if (goImageView2 != null) {
                                return new p290((ConstraintLayout) inflate, goImageView, buttonComponent, shimmeringRobotoTextView, shimmeringRobotoTextView2, buttonComponent2, goImageView2);
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public int getBottomFocusRectOffset() {
        return tje.u(194, getContext());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return true;
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w290 w290Var = this.presenter;
        w290Var.Bg(this);
        tje.N(w290Var.Jg(), null, null, new OverviewIncidentsPresenter$dispatchCamera$1(w290Var, null), 3);
        w290Var.A.b(new u290(0, w290Var), true);
        tje.N(w290Var.Jg(), null, null, new OverviewIncidentsPresenter$listenUiState$$inlined$safeCollectIn$1(w290Var.I, null, w290Var), 3);
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eyi0
    public void render(z290 uiState) {
        p290 p290Var = (p290) getBinding();
        final int i = 0;
        if (uiState.a != null) {
            p290Var.b.setVisibility(0);
            p290Var.b.setImageResource(uiState.a.intValue());
        } else {
            p290Var.b.setVisibility(8);
        }
        ShimmeringRobotoTextView shimmeringRobotoTextView = p290Var.e;
        ShimmeringRobotoTextView shimmeringRobotoTextView2 = p290Var.d;
        shimmeringRobotoTextView.setText(uiState.b);
        p290Var.g.setVisibility(uiState.f ? 0 : 8);
        t2v0 t2v0Var = uiState.c;
        if (t2v0Var instanceof nyy) {
            shimmeringRobotoTextView2.setText(((nyy) t2v0Var).a);
            shimmeringRobotoTextView2.setVisibility(0);
            shimmeringRobotoTextView2.stopAnimation();
        } else if (jl40.l(t2v0Var, h1z.a)) {
            shimmeringRobotoTextView2.setVisibility(0);
            shimmeringRobotoTextView2.startAnimation();
        } else if (!jl40.l(t2v0Var, md60.a)) {
            w511.b();
            return;
        } else {
            shimmeringRobotoTextView2.setVisibility(8);
            shimmeringRobotoTextView2.stopAnimation();
        }
        ButtonComponent buttonComponent = p290Var.c;
        buttonComponent.setTextTypeface(3);
        buttonComponent.setText(uiState.e);
        final w290 w290Var = this.presenter;
        buttonComponent.setDebounceClickListener(new Runnable() { // from class: r290
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                w290 w290Var2 = w290Var;
                switch (i2) {
                    case 0:
                        OverviewIncidentsModalView.render$lambda$0$0$onDecline(w290Var2);
                        break;
                    default:
                        OverviewIncidentsModalView.render$lambda$0$1$onApprove(w290Var2);
                        break;
                }
            }
        });
        ButtonComponent buttonComponent2 = p290Var.f;
        buttonComponent2.setTextTypeface(3);
        buttonComponent2.setText(uiState.d);
        final w290 w290Var2 = this.presenter;
        final int i2 = 1;
        buttonComponent2.setDebounceClickListener(new Runnable() { // from class: r290
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                w290 w290Var22 = w290Var2;
                switch (i22) {
                    case 0:
                        OverviewIncidentsModalView.render$lambda$0$0$onDecline(w290Var22);
                        break;
                    default:
                        OverviewIncidentsModalView.render$lambda$0$1$onApprove(w290Var22);
                        break;
                }
            }
        });
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "overview_event_screen";
    }
}
