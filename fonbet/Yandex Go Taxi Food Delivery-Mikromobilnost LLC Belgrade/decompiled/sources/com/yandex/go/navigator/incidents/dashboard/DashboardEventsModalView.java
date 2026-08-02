package com.yandex.go.navigator.incidents.dashboard;

import android.content.Context;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.navigator.BaseNavigatorModalView;
import com.yandex.go.navigator.domain.e;
import com.yandex.go.navigator.driving.top_view.DrivingTopView;
import com.yandex.go.navigator.incidents.IncidentType;
import com.yandex.go.navigator.repository.o;
import com.yandex.mapkit.map.IconStyle;
import defpackage.ah00;
import defpackage.aki0;
import defpackage.bdc;
import defpackage.bys;
import defpackage.cma1;
import defpackage.ewc;
import defpackage.f3x;
import defpackage.f4c0;
import defpackage.fuh0;
import defpackage.gh00;
import defpackage.i650;
import defpackage.j3x;
import defpackage.j9f;
import defpackage.m5b1;
import defpackage.n5;
import defpackage.ny61;
import defpackage.ofp0;
import defpackage.qoi0;
import defpackage.rig;
import defpackage.sig;
import defpackage.tbb;
import defpackage.tje;
import defpackage.u8b1;
import defpackage.uig;
import defpackage.v2h0;
import defpackage.vh91;
import defpackage.wb50;
import defpackage.wxs;
import defpackage.x4e;
import defpackage.xm00;
import defpackage.xng0;
import defpackage.z5h0;
import defpackage.zjg;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTitleComponent;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B]\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0014¢\u0006\u0004\b\"\u0010!J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u0018\u0010/\u001a\u00060.R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00103\u001a\n\u0012\u0006\b\u0000\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/yandex/go/navigator/incidents/dashboard/DashboardEventsModalView;", "Lcom/yandex/go/navigator/BaseNavigatorModalView;", "Luig;", "Landroid/content/Context;", "context", "Lsig;", "presenter", "Lcom/yandex/go/navigator/driving/top_view/DrivingTopView;", "drivingTopView", "Lru/yandex/taxi/discovery/a;", "discoveryPresenter", "Lah00;", "mapController", "Lwb50;", "focusCoordinator", "Lcom/yandex/go/navigator/repository/o;", "userInteractionsListener", "Lcom/yandex/go/navigator/domain/e;", "focusModeChangeEventRepository", "Lewc;", "compassButtonPresenter", "Lcom/yandex/go/navigator/analitycs/a;", "navigatorMainScreenAnalyticInteractor", "<init>", "(Landroid/content/Context;Lsig;Lcom/yandex/go/navigator/driving/top_view/DrivingTopView;Lru/yandex/taxi/discovery/a;Lah00;Lwb50;Lcom/yandex/go/navigator/repository/o;Lcom/yandex/go/navigator/domain/e;Lewc;Lcom/yandex/go/navigator/analitycs/a;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Luig;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "screenName", "()Ljava/lang/String;", "", "getBottomFocusRectOffset", "()I", "", "isArrowsPermanentlyHidden", "()Z", "Lsig;", "Lcom/yandex/go/navigator/driving/top_view/DrivingTopView;", "Lrig;", "innerMvp", "Lrig;", "Lbys;", "", "adapter", "Lbys;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DashboardEventsModalView extends BaseNavigatorModalView<uig> {
    public static final int $stable = 8;
    private final bys adapter;
    private final DrivingTopView drivingTopView;
    private final rig innerMvp;
    private final sig presenter;

    /* JADX WARN: Multi-variable type inference failed */
    public DashboardEventsModalView(Context context, sig sigVar, DrivingTopView drivingTopView, ru.yandex.taxi.discovery.a aVar, ah00 ah00Var, wb50 wb50Var, o oVar, e eVar, ewc ewcVar, com.yandex.go.navigator.analitycs.a aVar2) {
        super(context, aVar, ah00Var, wb50Var, oVar, eVar, ewcVar, aVar2);
        this.presenter = sigVar;
        this.drivingTopView = drivingTopView;
        this.innerMvp = new rig(this);
        RecyclerView recyclerView = ((uig) getBinding()).b;
        j3x j3xVar = new j3x();
        adapter$lambda$0(context, this, j3xVar);
        LinearLayoutManager linearLayoutManager = j3xVar.b;
        recyclerView.setLayoutManager(linearLayoutManager == null ? new LinearLayoutManager(recyclerView.getContext(), 1, false) : linearLayoutManager);
        bys bysVar = new bys(new wxs(), j3xVar.a);
        recyclerView.setAdapter(bysVar);
        this.adapter = bysVar;
        ((uig) getBinding()).b.setLayoutManager(new GridLayoutManager(context, 2));
        ViewGroup.LayoutParams layoutParams = drivingTopView.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = ofp0.c;
        drivingTopView.setLayoutParams(layoutParams);
        addViewAboveCard(drivingTopView, 48, 0);
        setAnimateOnAppearing(true);
        getRightSideButtonsContainer().a.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ uig access$getBinding(DashboardEventsModalView dashboardEventsModalView) {
        return (uig) dashboardEventsModalView.getBinding();
    }

    private static final zy11 adapter$lambda$0(Context context, DashboardEventsModalView dashboardEventsModalView, j3x j3xVar) {
        int i = 14;
        n5 n5Var = new n5(context, i);
        j3xVar.getClass();
        aki0.b(new f3x(zjg.class, j3xVar, n5Var), new tbb(i, dashboardEventsModalView));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonComponent adapter$lambda$0$0(Context context) {
        return new ButtonComponent(context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$0$1(DashboardEventsModalView dashboardEventsModalView, ButtonComponent buttonComponent, zjg zjgVar) {
        buttonComponent.setTag(qoi0.a(zjg.class));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int u = tje.u(4, buttonComponent.getContext());
        marginLayoutParams.setMargins(u, u, u, u);
        buttonComponent.setLayoutParams(marginLayoutParams);
        boolean z = zjgVar.b;
        IncidentType incidentType = zjgVar.a;
        if (z) {
            buttonComponent.setButtonBackground(new bdc(xng0.controlMain));
            buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControl));
            Integer valueOf = Integer.valueOf(incidentType.getSelectedIconRes());
            int titleRes = incidentType.getTitleRes();
            vh91.f(buttonComponent, valueOf, buttonComponent.getContext().getString(titleRes), false, Integer.valueOf(tje.u(24, buttonComponent.getContext())), true, 0, 32);
        } else {
            buttonComponent.setButtonBackground(new bdc(xng0.controlMinor));
            buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControlMinor));
            Integer valueOf2 = Integer.valueOf(incidentType.getNotSelectedIconRes());
            int titleRes2 = incidentType.getTitleRes();
            vh91.f(buttonComponent, valueOf2, buttonComponent.getContext().getString(titleRes2), false, Integer.valueOf(tje.u(24, buttonComponent.getContext())), true, 0, 32);
        }
        buttonComponent.setEnabled(true);
        buttonComponent.setDebounceClickListener(new j9f(22, dashboardEventsModalView, zjgVar));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void adapter$lambda$0$1$1(DashboardEventsModalView dashboardEventsModalView, zjg zjgVar) {
        sig sigVar = dashboardEventsModalView.presenter;
        IncidentType incidentType = zjgVar.a;
        i650 i650Var = sigVar.F.a;
        String type = m5b1.g(incidentType).getType();
        i650Var.getClass();
        i650Var.a.a("navigation.reports.road_events.event_type.click", x4e.p("event_type", type), 1, new HashMap());
        r0 r0Var = sigVar.A.b;
        r0Var.getClass();
        r0Var.m(null, incidentType);
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public uig bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(fuh0.dashboard_events_view, parent, false);
        int i = z5h0.incident_buttons;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
        if (recyclerView != null) {
            i = z5h0.incident_title;
            ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
            if (listTitleComponent != null) {
                i = z5h0.left_comment;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent != null) {
                    i = z5h0.send_button;
                    ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent2 != null) {
                        return new uig((ConstraintLayout) inflate, recyclerView, listTitleComponent, buttonComponent, buttonComponent2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public int getBottomFocusRectOffset() {
        return tje.u(334, getContext());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return true;
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.drivingTopView.onAttached();
        sig sigVar = this.presenter;
        rig rigVar = this.innerMvp;
        sigVar.Bg(rigVar);
        tje.N(sigVar.Jg(), null, null, new DashboardEventsPresenter$attachView$$inlined$safeCollectIn$1(sigVar.A.d, null, rigVar), 3);
        xm00 p = ((gh00) sigVar.D).i.p();
        sigVar.H = p;
        f4c0 r = p.r(sigVar.z.a);
        r.x(u8b1.h(v2h0.ic_incident_pin, sigVar.x));
        IconStyle iconStyle = new IconStyle();
        iconStyle.setAnchor(new PointF(0.5f, 0.9f));
        iconStyle.setScale(Float.valueOf(0.7f));
        iconStyle.setZIndex(Float.valueOf(21.0f));
        r.D(iconStyle);
        tje.N(sigVar.Jg(), null, null, new DashboardEventsPresenter$handleFocus$1(sigVar, null), 3);
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.drivingTopView.onDetach();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "dashboard_events_screen";
    }
}
