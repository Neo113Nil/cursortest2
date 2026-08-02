package com.yandex.go.routestops;

import android.content.Context;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.adl0;
import defpackage.avj0;
import defpackage.bel0;
import defpackage.c83;
import defpackage.cdl0;
import defpackage.cvw;
import defpackage.cwb;
import defpackage.ddl0;
import defpackage.ecl0;
import defpackage.fdl0;
import defpackage.gdl0;
import defpackage.h7h0;
import defpackage.hcl0;
import defpackage.hxj0;
import defpackage.idl0;
import defpackage.iik0;
import defpackage.kp50;
import defpackage.kyh0;
import defpackage.m950;
import defpackage.mdl0;
import defpackage.ndh0;
import defpackage.o8g0;
import defpackage.ob0;
import defpackage.pcl0;
import defpackage.pzt0;
import defpackage.qje;
import defpackage.rp31;
import defpackage.s80;
import defpackage.sgu0;
import defpackage.sjh0;
import defpackage.sls;
import defpackage.sue0;
import defpackage.sy60;
import defpackage.t621;
import defpackage.tje;
import defpackage.tse;
import defpackage.vdm;
import defpackage.vez0;
import defpackage.w4l0;
import defpackage.wiq0;
import defpackage.xj;
import defpackage.xng0;
import defpackage.yln;
import defpackage.yxf0;
import java.util.WeakHashMap;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.widget.SlidableCoordinatorLayout;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.views.SlideableShadowView;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B;\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001b\u0010\u0015J5\u0010$\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\"H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0013H\u0016¢\u0006\u0004\b,\u0010\u0015J\u0019\u0010/\u001a\u00020\u00132\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00132\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u00020\u00132\u0006\u00102\u001a\u0002012\u0006\u00105\u001a\u00020\u0017H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0013H\u0016¢\u0006\u0004\b8\u0010\u0015J\u000f\u00109\u001a\u00020\u0013H\u0016¢\u0006\u0004\b9\u0010\u0015J\u000f\u0010:\u001a\u00020\u0013H\u0016¢\u0006\u0004\b:\u0010\u0015J\u000f\u0010;\u001a\u00020\u0013H\u0016¢\u0006\u0004\b;\u0010\u0015J\u000f\u0010<\u001a\u00020\u0013H\u0016¢\u0006\u0004\b<\u0010\u0015J\u000f\u0010=\u001a\u00020(H\u0014¢\u0006\u0004\b=\u0010>R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010?R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010@R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010AR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010BR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020\u00178TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lcom/yandex/go/routestops/RouteStopsModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Ladl0;", "", "Lbel0;", "Landroid/content/Context;", "context", "Ltse;", "coroutineScope", "Lidl0;", "presenter", "Lsgu0;", "stopPointsProvider", "Lfdl0;", "navigator", "Lgdl0;", "routeStopsPayload", "<init>", "(Landroid/content/Context;Ltse;Lidl0;Lsgu0;Lfdl0;Lgdl0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "contentTop", "onModalViewAppear", "(I)V", "onModalViewDisappear", "Lddl0;", "provider", "Ljava/util/function/IntConsumer;", "askAddOrUpdateStopConsumer", "", "buttonText", "Lkotlin/Function0;", "onButtonClick", "setStops", "(Lddl0;Ljava/util/function/IntConsumer;Ljava/lang/String;Lsls;)V", "Lecl0;", "diff", "", "isUpdateInProgress", "onStopsUpdated", "(Lecl0;Z)V", "askAddOrUpdateStop", "Lcdl0;", "listener", "setOnTopMovedListener", "(Lcdl0;)V", "Lcom/yandex/go/address/models/Address;", "source", "askAdd", "(Lcom/yandex/go/address/models/Address;)V", "stopIndex", "askUpdate", "(Lcom/yandex/go/address/models/Address;I)V", "dismiss", "close", "attachBackButton", "attachSlideableShadowView", "showRouteStopsShadow", "isApplyShadow", "()Z", "Ltse;", "Lidl0;", "Lsgu0;", "Lfdl0;", "Lgdl0;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lpcl0;", "adapter", "Lpcl0;", "onTopMovedListener", "Lcdl0;", "Landroidx/core/widget/NestedScrollView;", "routeStopsScrollView", "Landroidx/core/widget/NestedScrollView;", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Lhcl0;", "onDragCompletedListener", "Lhcl0;", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RouteStopsModalView extends SlideableModalView implements adl0, bel0 {
    public static final int $stable = 8;
    private pcl0 adapter;
    private final tse coroutineScope;
    private final fdl0 navigator;
    private final hcl0 onDragCompletedListener;
    private final View.OnLayoutChangeListener onLayoutChangeListener;
    private cdl0 onTopMovedListener;
    private final idl0 presenter;
    private final RecyclerView recyclerView;
    private final gdl0 routeStopsPayload;
    private final NestedScrollView routeStopsScrollView;
    private final sgu0 stopPointsProvider;

    public RouteStopsModalView(Context context, tse tseVar, idl0 idl0Var, sgu0 sgu0Var, fdl0 fdl0Var, gdl0 gdl0Var) {
        super(context);
        this.coroutineScope = tseVar;
        this.presenter = idl0Var;
        this.stopPointsProvider = sgu0Var;
        this.navigator = fdl0Var;
        this.routeStopsPayload = gdl0Var;
        int i = h7h0.route_stops;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.recyclerView = (RecyclerView) ((View) rp31.d(this, i));
        this.routeStopsScrollView = (NestedScrollView) ((View) rp31.d(this, h7h0.route_stops_scroll_view));
        this.onLayoutChangeListener = new yln(19, this);
        this.onDragCompletedListener = new sue0(29, this);
        idl0Var.K = gdl0Var.a;
        setAnimateOnAppearing(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer attachSlideableShadowView$lambda$0(RouteStopsModalView routeStopsModalView) {
        return Integer.valueOf(routeStopsModalView.getTopOffset());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLayoutChangeListener$lambda$0(RouteStopsModalView routeStopsModalView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 != i6) {
            routeStopsModalView.getClass();
        }
    }

    @Override // defpackage.adl0
    public void askAdd(Address source) {
        yxf0 yxf0Var = (yxf0) this.navigator;
        yxf0Var.getClass();
        s80 s80Var = new s80(source);
        SourcePicker sourcePicker = SourcePicker.NONE;
        gdl0 gdl0Var = (gdl0) yxf0Var.a;
        c83 c83Var = new c83(s80Var, sourcePicker, gdl0Var.b, gdl0Var.c, gdl0Var.d);
        vdm vdmVar = (vdm) yxf0Var.b;
        vdmVar.A((m950) ((xj) vdmVar.I).get(), c83Var, sy60.Q2);
    }

    public void askAddOrUpdateStop() {
        this.presenter.Kg();
    }

    @Override // defpackage.adl0
    public void askUpdate(Address source, int stopIndex) {
        yxf0 yxf0Var = (yxf0) this.navigator;
        yxf0Var.getClass();
        t621 t621Var = new t621(source, stopIndex);
        SourcePicker sourcePicker = SourcePicker.NONE;
        gdl0 gdl0Var = (gdl0) yxf0Var.a;
        c83 c83Var = new c83(t621Var, sourcePicker, gdl0Var.b, gdl0Var.c, gdl0Var.d);
        vdm vdmVar = (vdm) yxf0Var.b;
        vdmVar.A((m950) ((xj) vdmVar.I).get(), c83Var, sy60.Q2);
    }

    @Override // defpackage.adl0
    public void attachBackButton() {
        cvw.g0(qje.t(xng0.bgMain, getContext()), getCornersRadius(), this.routeStopsScrollView);
        int i = h7h0.ic_route_stops_close;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        BackButtonIconComponent backButtonIconComponent = (BackButtonIconComponent) ((View) rp31.d(this, i));
        backButtonIconComponent.setVisibility(0);
        backButtonIconComponent.setDebounceClickListener(new hxj0(12, this));
        getBottomSheet().setBackground(null);
    }

    @Override // defpackage.adl0
    public void attachSlideableShadowView() {
        ((SlidableCoordinatorLayout) getContent()).addView(new SlideableShadowView(getContext(), ndh0.slideable_modal_view_bottom_sheet, new ob0(11, this)), 0);
    }

    @Override // defpackage.adl0
    public void close() {
        idl0 idl0Var = this.presenter;
        pzt0 pzt0Var = idl0Var.I;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = idl0Var.H;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismiss() {
        super.dismiss();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return sjh0.route_stops_list;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        String h;
        super.onAttachedToWindow();
        idl0 idl0Var = this.presenter;
        idl0Var.Bg(this);
        w4l0 w4l0Var = idl0Var.x;
        w4l0Var.h();
        int a = idl0Var.K != null ? Integer.MAX_VALUE : idl0Var.y.a();
        cwb cwbVar = idl0Var.z;
        wiq0 wiq0Var = idl0Var.B;
        mdl0 mdl0Var = new mdl0(a, cwbVar, wiq0Var, idl0Var.D, idl0Var.A, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY.equals(((k) wiq0Var).h()));
        o8g0 o8g0Var = idl0Var.K;
        if (o8g0Var == null || (h = (String) o8g0Var.a) == null) {
            h = ((avj0) idl0Var.C).h(kyh0.add_route_stop);
        }
        setStops(mdl0Var, idl0Var.G, h, new iik0(13, idl0Var));
        idl0Var.J = mdl0Var;
        idl0Var.H = tje.N(idl0Var.Jg(), null, null, new RouteStopsPresenter$attachView$$inlined$safeCollectIn$1(w4l0Var.g(), null, idl0Var), 3);
        tje.N(idl0Var.Jg(), null, null, new RouteStopsPresenter$attachView$$inlined$safeCollectIn$2(idl0Var.E, null, idl0Var), 3);
        if (idl0Var.K != null) {
            ((adl0) idl0Var.Dg()).attachBackButton();
            ((adl0) idl0Var.Dg()).showRouteStopsShadow();
        } else {
            ((adl0) idl0Var.Dg()).attachSlideableShadowView();
        }
        if (this.routeStopsPayload.a == null) {
            this.presenter.Kg();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        getCardContentView().addOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        getCardContentView().removeOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    @Override // defpackage.bdl0
    public void onStopsUpdated(ecl0 diff, boolean isUpdateInProgress) {
        pcl0 pcl0Var = this.adapter;
        if (vez0.j0(pcl0Var, "Missing route stops adapter")) {
            kp50.f(diff, true).b(pcl0Var);
        }
    }

    public void setOnTopMovedListener(cdl0 listener) {
    }

    @Override // defpackage.adl0
    public void setStops(ddl0 provider, IntConsumer askAddOrUpdateStopConsumer, String buttonText, sls onButtonClick) {
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        pcl0 pcl0Var = new pcl0(getContext(), this.coroutineScope, provider, askAddOrUpdateStopConsumer, this.onDragCompletedListener, this.stopPointsProvider, buttonText, onButtonClick);
        this.adapter = pcl0Var;
        this.recyclerView.setAdapter(pcl0Var);
        boolean equals = TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY.equals(((k) this.presenter.B).h());
        NestedScrollView nestedScrollView = this.routeStopsScrollView;
        if (equals) {
            nestedScrollView.setPadding(0, 0, 0, 0);
        } else {
            nestedScrollView.setPadding(0, tje.u(20, getContext()), 0, 0);
        }
    }

    @Override // defpackage.adl0
    public void showRouteStopsShadow() {
        int i = h7h0.route_stops_shadow;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ((View) rp31.d(this, i)).setVisibility(0);
    }
}
