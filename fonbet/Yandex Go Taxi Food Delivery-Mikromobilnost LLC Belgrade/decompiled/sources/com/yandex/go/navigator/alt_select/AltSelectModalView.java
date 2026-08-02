package com.yandex.go.navigator.alt_select;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.navigator.BaseNavigatorModalView;
import com.yandex.go.navigator.alt_select.traffic.TrafficJamView;
import com.yandex.go.navigator.analitycs.NavigationAnalytics$SettingsSource;
import com.yandex.go.navigator.domain.FocusMode;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.navigator.repository.o;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import defpackage.ag31;
import defpackage.ah00;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.cv1;
import defpackage.cvw;
import defpackage.d4;
import defpackage.dv1;
import defpackage.e68;
import defpackage.ej40;
import defpackage.ev1;
import defpackage.ewc;
import defpackage.f1h0;
import defpackage.fuh0;
import defpackage.g0c;
import defpackage.hc;
import defpackage.hv1;
import defpackage.i3y;
import defpackage.i650;
import defpackage.jg;
import defpackage.jg50;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.kip;
import defpackage.kk31;
import defpackage.ksy;
import defpackage.kyh0;
import defpackage.leq0;
import defpackage.liq0;
import defpackage.lk31;
import defpackage.lv1;
import defpackage.m950;
import defpackage.mth;
import defpackage.mv1;
import defpackage.my30;
import defpackage.n;
import defpackage.n901;
import defpackage.ndr0;
import defpackage.nv1;
import defpackage.ny61;
import defpackage.o901;
import defpackage.ob31;
import defpackage.oeq0;
import defpackage.ov1;
import defpackage.p901;
import defpackage.pe50;
import defpackage.pwy0;
import defpackage.q901;
import defpackage.qe50;
import defpackage.qoi0;
import defpackage.quz;
import defpackage.qv1;
import defpackage.r901;
import defpackage.rv1;
import defpackage.sd6;
import defpackage.sg0;
import defpackage.sls;
import defpackage.srb1;
import defpackage.sv1;
import defpackage.sy60;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tn1;
import defpackage.tpr;
import defpackage.tv1;
import defpackage.uv1;
import defpackage.vc60;
import defpackage.vng;
import defpackage.vv1;
import defpackage.w511;
import defpackage.wb50;
import defpackage.wg50;
import defpackage.wqu;
import defpackage.wv1;
import defpackage.xb50;
import defpackage.xel0;
import defpackage.xng0;
import defpackage.xv1;
import defpackage.yv1;
import defpackage.z5h0;
import defpackage.zi;
import defpackage.zxs;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.m0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.preorder.summary.selector.analytics.VerticalSelectorAnalytics$SelectionChangeReason;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.recycler.PositionLayoutManager;

@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B]\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001dH\u0016¢\u0006\u0004\b'\u0010&J\u001f\u0010*\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020 H\u0014¢\u0006\u0004\b*\u0010$J\u0017\u0010-\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001dH\u0014¢\u0006\u0004\b/\u0010&J\u000f\u00100\u001a\u00020\u001aH\u0014¢\u0006\u0004\b0\u0010\u001cJ\u001f\u00105\u001a\u00020\u00022\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001dH\u0014¢\u0006\u0004\b7\u0010&J\u000f\u00108\u001a\u00020\u001dH\u0014¢\u0006\u0004\b8\u0010&J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H\u0014¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020GH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020JH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020MH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020\u001d2\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020TH\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u001dH\u0002¢\u0006\u0004\bW\u0010&J\u0017\u0010X\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020CH\u0002¢\u0006\u0004\bX\u0010FJ\u0017\u0010[\u001a\u00020\u001d2\u0006\u0010Z\u001a\u00020YH\u0002¢\u0006\u0004\b[\u0010\\R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010]R\u001b\u0010c\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010i¨\u0006j"}, d2 = {"Lcom/yandex/go/navigator/alt_select/AltSelectModalView;", "Lcom/yandex/go/navigator/BaseNavigatorModalView;", "Lyv1;", "Lhv1;", "Landroid/content/Context;", "context", "Lcom/yandex/go/navigator/alt_select/e;", "presenter", "Lru/yandex/taxi/discovery/a;", "discoveryPresenter", "Lah00;", "mapController", "Lwb50;", "focusCoordinator", "Lcom/yandex/go/navigator/repository/o;", "userInteractionsListener", "Lcom/yandex/go/navigator/domain/e;", "focusModeChangeEventRepository", "Lewc;", "compassButtonPresenter", "Llk31;", "verticalsViewFactory", "Lcom/yandex/go/navigator/analitycs/a;", "navigatorMainScreenAnalyticInteractor", "<init>", "(Landroid/content/Context;Lcom/yandex/go/navigator/alt_select/e;Lru/yandex/taxi/discovery/a;Lah00;Lwb50;Lcom/yandex/go/navigator/repository/o;Lcom/yandex/go/navigator/domain/e;Lewc;Llk31;Lcom/yandex/go/navigator/analitycs/a;)V", "", "getBottomFocusRectOffset", "()I", "Lzy11;", "awaitFocusRectReady", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/Runnable;", "startAction", "endAction", "animateDismiss", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "onLocationButtonClicked", "()V", "onOverviewButtonClicked", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "", "duration", "animateShowBackground", "(J)V", "animateDismissBackground", "topRightSideButtonsOffset", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lyv1;", "onAttachedToWindow", "onDetachedFromWindow", "", "screenName", "()Ljava/lang/String;", "", "isArrowsPermanentlyHidden", "()Z", "Lwv1;", "uiState", "render", "(Lwv1;)V", "Lov1;", ClidProvider.STATE, "scrollToSelectedRoute", "(Lov1;)V", "Lmv1;", "renderBottomContainerShadow", "(Lmv1;)V", "Lnv1;", "renderBottomNotification", "(Lnv1;)V", "Lvv1;", "renderVerticals", "(Lvv1;)V", "Lsv1;", "errorState", "renderErrorState", "(Lsv1;)V", "Ltv1;", "renderLoadingState", "(Ltv1;)V", "renderLoadingButton", "renderContentState", "Le68;", "carParksState", "updateCarParksButton", "(Le68;)V", "Lcom/yandex/go/navigator/alt_select/e;", "Llv1;", "adapter$delegate", "Li3y;", "getAdapter", "()Llv1;", "adapter", "Lkk31;", "verticalsView", "Lkk31;", "Lru/yandex/taxi/widget/recycler/PositionLayoutManager;", "positionLayoutManager", "Lru/yandex/taxi/widget/recycler/PositionLayoutManager;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AltSelectModalView extends BaseNavigatorModalView<yv1> implements hv1 {
    public static final int $stable = 8;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final i3y adapter;
    private final PositionLayoutManager positionLayoutManager;
    private final e presenter;
    private final kk31 verticalsView;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.navigator.alt_select.AltSelectModalView$3, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            jg50 jg50Var = (jg50) ((e) this.receiver).x.a;
            jg50Var.A((m950) jg50Var.J.get(), new ndr0(NavigationAnalytics$SettingsSource.RouteSummary), sy60.Q2);
            return zy11.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AltSelectModalView(Context context, e eVar, ru.yandex.taxi.discovery.a aVar, ah00 ah00Var, wb50 wb50Var, o oVar, com.yandex.go.navigator.domain.e eVar2, ewc ewcVar, lk31 lk31Var, com.yandex.go.navigator.analitycs.a aVar2) {
        super(context, aVar, ah00Var, wb50Var, oVar, eVar2, ewcVar, aVar2);
        this.presenter = eVar;
        this.adapter = kotlin.a.b(LazyThreadSafetyMode.NONE, new d4(26, this));
        kk31 a = lk31Var.a(new tn1(12, this));
        this.verticalsView = a;
        PositionLayoutManager positionLayoutManager = new PositionLayoutManager(context);
        positionLayoutManager.d0 = new quz(9);
        this.positionLayoutManager = positionLayoutManager;
        setAnimateOnAppearing(false);
        RecyclerView recyclerView = ((yv1) getBinding()).g;
        recyclerView.setLayoutManager(positionLayoutManager);
        recyclerView.addItemDecoration(new wqu(tje.u(8, recyclerView.getContext())));
        recyclerView.setAdapter(getAdapter());
        getRightSideButtonsContainer().e.setIconPadding(tje.u(4, getContext()));
        ((yv1) getBinding()).f.setDebounceClickListener(new ev1(eVar, 0));
        ru.yandex.taxi.design.utils.c.z(new AnonymousClass3(0, eVar, e.class, "onSettingsClicked", "onSettingsClicked()V", 0), ((yv1) getBinding()).i);
        getRightSideButtonsContainer().b.setDebounceClickListener(new ev1(eVar, 1));
        ru.yandex.taxi.design.utils.c.w(((yv1) getBinding()).k, a.asView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onRouteConfirmClicked(e eVar) {
        ((jg50) eVar.x.a).r(new ej40(21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$toggleCarParksVisibility(e eVar) {
        eVar.P.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lv1 adapter_delegate$lambda$0(AltSelectModalView altSelectModalView) {
        AltSelectModalView$adapter$2$1 altSelectModalView$adapter$2$1 = new AltSelectModalView$adapter$2$1(1, altSelectModalView.presenter, e.class, "onRouteClicked", "onRouteClicked(Ljava/lang/String;)V", 0);
        int i = xv1.V;
        List v = n.v(null);
        g0c a = qoi0.a(xel0.class);
        return new lv1(Collections.singletonList(new zxs(a.a(), 0, null, v, null, new sg0(3, altSelectModalView$adapter$2$1))));
    }

    private final lv1 getAdapter() {
        return (lv1) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oeq0 positionLayoutManager$lambda$0$0(int i) {
        return leq0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderBottomContainerShadow(mv1 state) {
        cvw.e0(((yv1) getBinding()).b, new LayerDrawable(new Drawable[]{state.a, vng.t(f1h0.footer_bg, getContext())}), null, null, 14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderBottomNotification(nv1 uiState) {
        sd6 sd6Var = uiState.a;
        if (sd6Var.equals(vc60.a)) {
            ((yv1) getBinding()).c.setVisibility(8);
            return;
        }
        if (!(sd6Var instanceof ksy)) {
            w511.b();
            return;
        }
        ListItemComponent listItemComponent = ((yv1) getBinding()).c;
        listItemComponent.setVisibility(0);
        ksy ksyVar = (ksy) sd6Var;
        listItemComponent.setLeadImage(ksyVar.a);
        listItemComponent.setTitle(ksyVar.b);
        listItemComponent.setSubtitle(ksyVar.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderContentState(ov1 uiState) {
        Object obj;
        updateCarParksButton(uiState.d);
        AddressStateView addressStateView = ((yv1) getBinding()).j;
        qe50 qe50Var = uiState.b;
        List list = uiState.a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((cv1) obj).b) {
                    break;
                }
            }
        }
        cv1 cv1Var = (cv1) obj;
        addressStateView.updateUiState(qe50Var, cv1Var != null ? cv1Var.d : null);
        addressStateView.setSourceAddressOnClickListener(new AltSelectModalView$renderContentState$1$2(0, this.presenter, e.class, "onFromAddressClicked", "onFromAddressClicked()V", 0));
        addressStateView.setAddStopOnClickListener(new AltSelectModalView$renderContentState$1$3(0, this.presenter, e.class, "onAddStopClicked", "onAddStopClicked()V", 0));
        addressStateView.setStopsOnClickListener(new AltSelectModalView$renderContentState$1$4(0, this.presenter, e.class, "onStopsClicked", "onStopsClicked()V", 0));
        TrafficJamView trafficJamView = getRightSideButtonsContainer().e;
        trafficJamView.setDebounceClickListener(new ev1(this.presenter, 4));
        r901 r901Var = uiState.c;
        if (jl40.l(r901Var, n901.a)) {
            trafficJamView.showInactive();
        } else if (r901Var instanceof o901) {
            o901 o901Var = (o901) r901Var;
            trafficJamView.showActive(srb1.a(o901Var.a), o901Var.b);
        } else if (jl40.l(r901Var, p901.a)) {
            trafficJamView.showLoading();
        } else {
            if (!jl40.l(r901Var, q901.a)) {
                w511.b();
                return;
            }
            trafficJamView.showUnavailable();
        }
        lv1 adapter = getAdapter();
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new xel0((cv1) it2.next()));
        }
        adapter.submitList(arrayList, new hc(14, uiState, this));
        cma1.J(getRightSideButtonsContainer().a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderContentState$lambda$1$onTrafficJamClicked(e eVar) {
        eVar.F.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void renderContentState$lambda$3(ov1 ov1Var, AltSelectModalView altSelectModalView) {
        if (ov1Var.a.isEmpty()) {
            return;
        }
        ButtonComponent buttonComponent = ((yv1) altSelectModalView.getBinding()).f;
        buttonComponent.setDebounceClickListener(new ev1(altSelectModalView.presenter, 3));
        buttonComponent.setEnabled(true);
        buttonComponent.setText(buttonComponent.getContext().getText(kyh0.navigator_go));
        buttonComponent.setButtonBackground(new bdc(xng0.controlMain));
        buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControl));
        buttonComponent.updateShimmeringColor(new bdc(xng0.textInvert));
        buttonComponent.setProgressing(false);
        GoLinearLayout goLinearLayout = ((yv1) altSelectModalView.getBinding()).h;
        int childCount = goLinearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = goLinearLayout.getChildAt(i);
            ShimmeringBar shimmeringBar = childAt instanceof ShimmeringBar ? (ShimmeringBar) childAt : null;
            if (shimmeringBar != null) {
                shimmeringBar.setShimmering(false);
            }
        }
        cma1.L(((yv1) altSelectModalView.getBinding()).h);
        cma1.L(((yv1) altSelectModalView.getBinding()).e);
        cma1.J(((yv1) altSelectModalView.getBinding()).g);
        altSelectModalView.scrollToSelectedRoute(ov1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderContentState$lambda$3$0$onRouteConfirmClicked(e eVar) {
        ((jg50) eVar.x.a).r(new ej40(21));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderErrorState(sv1 errorState) {
        cma1.L(((yv1) getBinding()).h);
        cma1.L(((yv1) getBinding()).g);
        cma1.J(((yv1) getBinding()).e);
        dv1 dv1Var = ((yv1) getBinding()).d;
        dv1Var.d.setText(errorState.getContent().a);
        dv1Var.c.setText(errorState.getContent().b);
        ButtonComponent buttonComponent = ((yv1) getBinding()).f;
        buttonComponent.setEnabled(true);
        buttonComponent.setProgressing(false);
        buttonComponent.setText(errorState.getContent().c);
        buttonComponent.setButtonBackground(new bdc(xng0.controlMain));
        buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControl));
        if (errorState instanceof qv1) {
            buttonComponent.setDebounceClickListener(new ev1(this.presenter, 5));
        } else if (errorState instanceof rv1) {
            buttonComponent.setDebounceClickListener(new ev1(this.presenter, 6));
        } else {
            w511.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderErrorState$lambda$1$onReloadClicked(e eVar) {
        i650 i650Var = eVar.E.a;
        i650Var.a.a("navigation.request_route.reload_button.click", n.u(i650Var), 1, new HashMap());
        t tVar = eVar.G;
        pe50 c = tVar.a.c();
        if (c != null) {
            tVar.c(c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderLoadingButton() {
        ButtonComponent buttonComponent = ((yv1) getBinding()).f;
        buttonComponent.setEnabled(false);
        buttonComponent.setText(buttonComponent.getContext().getText(kyh0.navigator_route_screen_loading_button_title));
        buttonComponent.setButtonBackground(new bdc(xng0.controlMinor));
        buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControlMinor));
        buttonComponent.updateShimmeringColor(new bdc(xng0.textInvert));
        buttonComponent.setProgressing(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderLoadingState(tv1 uiState) {
        AddressStateView addressStateView = ((yv1) getBinding()).j;
        addressStateView.updateUiState(uiState.a, null);
        addressStateView.setSourceAddressOnClickListener(new AltSelectModalView$renderLoadingState$1$1(0, this.presenter, e.class, "onFromAddressClicked", "onFromAddressClicked()V", 0));
        addressStateView.setAddStopOnClickListener(new AltSelectModalView$renderLoadingState$1$2(0, this.presenter, e.class, "onAddStopClicked", "onAddStopClicked()V", 0));
        addressStateView.setStopsOnClickListener(new AltSelectModalView$renderLoadingState$1$3(0, this.presenter, e.class, "onStopsClicked", "onStopsClicked()V", 0));
        TrafficJamView trafficJamView = getRightSideButtonsContainer().e;
        trafficJamView.setDebounceClickListener(new zi(4));
        trafficJamView.showLoading();
        renderLoadingButton();
        GoLinearLayout goLinearLayout = ((yv1) getBinding()).h;
        int childCount = goLinearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = goLinearLayout.getChildAt(i);
            ShimmeringBar shimmeringBar = childAt instanceof ShimmeringBar ? (ShimmeringBar) childAt : null;
            if (shimmeringBar != null) {
                shimmeringBar.setShimmering(true);
            }
        }
        cma1.J(((yv1) getBinding()).h);
        cma1.L(((yv1) getBinding()).g);
        cma1.L(((yv1) getBinding()).e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderLoadingState$lambda$1$0() {
    }

    private final void renderVerticals(vv1 state) {
        List list = state.a;
        this.verticalsView.render(list);
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((ob31) it.next()).c) {
                break;
            } else {
                i++;
            }
        }
        this.verticalsView.updateHeaderState(i >= 0 ? i : 0, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void scrollToSelectedRoute(ov1 state) {
        Iterator it = state.a.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((cv1) it.next()).b) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i >= 0 ? i : 0;
        if (i2 < getAdapter().getItemCount()) {
            ((yv1) getBinding()).g.smoothScrollToPosition(i2);
        }
    }

    private final void updateCarParksButton(e68 carParksState) {
        getRightSideButtonsContainer().b.updateState(carParksState);
        getRightSideButtonsContainer().b.setDebounceClickListener(new ev1(this.presenter, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCarParksButton$toggleCarParksVisibility(e eVar) {
        eVar.P.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 verticalsView$lambda$0(AltSelectModalView altSelectModalView, int i, ob31 ob31Var) {
        e eVar = altSelectModalView.presenter;
        eVar.getClass();
        ob31 ob31Var2 = !ob31Var.c ? ob31Var : null;
        if (ob31Var2 != null) {
            ag31 ag31Var = eVar.Q;
            String str = ob31Var.a;
            String str2 = ob31Var.b;
            ob31 ob31Var3 = eVar.V;
            String str3 = ob31Var3 != null ? ob31Var3.a : null;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = ob31Var3 != null ? ob31Var3.b : null;
            ag31Var.a(str, str2, str3, str4 != null ? str4 : "", VerticalSelectorAnalytics$SelectionChangeReason.Tap);
            ((jg50) eVar.x.a).r(new my30(ob31Var2.a, 7));
        }
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        getRightSideButtonsContainer().a.setVisibility(8);
        startAction.run();
        endAction.run();
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView, ru.yandex.taxi.widget.ModalView
    public void animateDismissBackground() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        onAnimateShowStartAction.run();
        onAnimateShowEndAction.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShowBackground(long duration) {
    }

    @Override // defpackage.hv1
    public Object awaitFocusRectReady(Continuation<? super zy11> continuation) {
        return prepareStaticFocusRect(continuation);
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public yv1 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        int i = 0;
        View inflate = inflater.inflate(fuh0.alt_select_view, parent, false);
        int i2 = z5h0.bottom_buttons_container;
        if (((GoLinearLayout) cma1.O(i2, inflate)) != null) {
            i2 = z5h0.bottom_container;
            GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i2, inflate);
            if (goLinearLayout != null) {
                i2 = z5h0.bottom_notification;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i2, inflate);
                if (listItemComponent != null && (O = cma1.O((i2 = z5h0.error_container), inflate)) != null) {
                    int i3 = z5h0.brick_image;
                    if (((GoImageView) cma1.O(i3, O)) != null) {
                        i3 = z5h0.error_subtitle;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, O);
                        if (robotoTextView != null) {
                            i3 = z5h0.error_title;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i3, O);
                            if (robotoTextView2 != null) {
                                dv1 dv1Var = new dv1((ConstraintLayout) O, robotoTextView, robotoTextView2, i);
                                i2 = z5h0.error_placeholder;
                                GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i2, inflate);
                                if (goFrameLayout != null) {
                                    i2 = z5h0.go_btn;
                                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i2, inflate);
                                    if (buttonComponent != null) {
                                        i2 = z5h0.list;
                                        RecyclerView recyclerView = (RecyclerView) cma1.O(i2, inflate);
                                        if (recyclerView != null) {
                                            i2 = z5h0.placeholder;
                                            GoLinearLayout goLinearLayout2 = (GoLinearLayout) cma1.O(i2, inflate);
                                            if (goLinearLayout2 != null) {
                                                i2 = z5h0.settings_container;
                                                GoFrameLayout goFrameLayout2 = (GoFrameLayout) cma1.O(i2, inflate);
                                                if (goFrameLayout2 != null) {
                                                    i2 = z5h0.source_destination_state_view;
                                                    AddressStateView addressStateView = (AddressStateView) cma1.O(i2, inflate);
                                                    if (addressStateView != null) {
                                                        i2 = z5h0.verticals_stub;
                                                        GoView goView = (GoView) cma1.O(i2, inflate);
                                                        if (goView != null) {
                                                            return new yv1((GoLinearLayout) inflate, goLinearLayout, listItemComponent, dv1Var, goFrameLayout, buttonComponent, recyclerView, goLinearLayout2, goFrameLayout2, addressStateView, goView);
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
                    ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i3)));
                    return null;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public int getBottomFocusRectOffset() {
        return tje.u(396, getContext());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.navigator.BaseNavigatorModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        e eVar = this.presenter;
        liq0 liq0Var = eVar.H;
        pwy0 pwy0Var = eVar.L;
        kip kipVar = eVar.O;
        eVar.Bg(this);
        if (eVar.y) {
            tpr a = kipVar.a.a();
            wg50 wg50Var = eVar.N;
            i = 3;
            tje.N(eVar.Jg(), null, null, new AltSelectPresenter$renderVerticals$$inlined$safeCollectIn$1(new jqr(new m0(a, kotlinx.coroutines.flow.e.t(new m0(((k) wg50Var.a).i(), wg50Var.c.a(), new NavigatorVerticalsInteractor$stateFlow$1(3, wg50Var, wg50.class, "mapVerticalHeader", "mapVerticalHeader(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;", 4))), new AltSelectPresenter$renderVerticals$1(3, null)), new AltSelectPresenter$renderVerticals$2(eVar, null), i), null, (hv1) eVar.Dg()), 3);
        } else {
            i = 3;
        }
        eVar.D.a(FocusMode.FREE);
        tje.N(eVar.Jg(), null, null, new AltSelectPresenter$renderBottomShadow$$inlined$safeCollectIn$1(pwy0Var.a(), null, eVar), i);
        t tVar = eVar.G;
        int i2 = 6;
        tje.N(eVar.Jg(), null, null, new AltSelectPresenter$renderContent$$inlined$safeCollectIn$1(new d(new tpr[]{tVar.M, tVar.N, liq0Var.b, eVar.B.a(), eVar.F.c, eVar.P.d, com.yandex.go.coroutines.b.d(eVar.I.b, new AltSelectPresenter$renderContent$$inlined$start$1(null, null))}, eVar), null, (hv1) eVar.Dg()), 3);
        tje.N(eVar.Jg(), null, null, new AltSelectPresenter$renderBottomNotification$$inlined$safeCollectIn$1(new m0(kipVar.a.a(), eVar.R.b, new AltSelectPresenter$renderBottomNotification$1(3, null)), null, eVar), 3);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        DrivingRoute drivingRoute = (DrivingRoute) liq0Var.a.getValue();
        ref$ObjectRef.element = drivingRoute != null ? drivingRoute.getRouteId() : 0;
        tje.N(eVar.Jg(), null, null, new AltSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(new mth(liq0Var.b, i2)), null, ref$ObjectRef, eVar), 3);
        tje.N(eVar.Jg(), null, null, new AltSelectPresenter$dispatchLocationButtonVisibility$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(new m0(com.yandex.go.coroutines.b.d(eVar.W, new AltSelectPresenter$dispatchLocationButtonVisibility$$inlined$start$1(Boolean.FALSE, null)), pwy0Var.a(), new AltSelectPresenter$dispatchLocationButtonVisibility$1(3, null))), null, (hv1) eVar.Dg()), 3);
        getRightSideButtonsContainer().a.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.navigator.BaseNavigatorModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((yv1) getBinding()).g.setAdapter(null);
        this.presenter.Cg();
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public void onLocationButtonClicked() {
        super.onLocationButtonClicked();
        this.presenter.W.g(Boolean.TRUE);
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public void onOverviewButtonClicked() {
        super.onOverviewButtonClicked();
        e eVar = this.presenter;
        xb50 xb50Var = eVar.S;
        DrivingRoute drivingRoute = (DrivingRoute) xb50Var.a.a.getValue();
        if (drivingRoute != null) {
            xb50Var.a(drivingRoute, false);
        }
        eVar.W.g(Boolean.FALSE);
    }

    @Override // defpackage.eyi0
    public void render(wv1 uiState) {
        if (uiState instanceof ov1) {
            renderContentState((ov1) uiState);
        } else if (uiState instanceof tv1) {
            renderLoadingState((tv1) uiState);
        } else if (uiState instanceof sv1) {
            renderErrorState((sv1) uiState);
        } else if (uiState instanceof vv1) {
            renderVerticals((vv1) uiState);
        } else if (uiState instanceof nv1) {
            renderBottomNotification((nv1) uiState);
        } else if (uiState instanceof mv1) {
            renderBottomContainerShadow((mv1) uiState);
        } else {
            if (!(uiState instanceof uv1)) {
                w511.b();
                return;
            }
            getLocationButton().a(((uv1) uiState).a);
        }
        post(new jg(13, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "alt_route_select_screen";
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public int topRightSideButtonsOffset() {
        return 0;
    }
}
