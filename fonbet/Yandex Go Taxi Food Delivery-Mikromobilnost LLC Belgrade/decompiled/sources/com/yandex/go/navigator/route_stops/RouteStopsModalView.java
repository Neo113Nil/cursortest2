package com.yandex.go.navigator.route_stops;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.edl0;
import defpackage.hxj0;
import defpackage.i3y;
import defpackage.iik0;
import defpackage.ip11;
import defpackage.jdl0;
import defpackage.jl40;
import defpackage.ne50;
import defpackage.pbu;
import defpackage.pdl0;
import defpackage.qcl0;
import defpackage.qdl0;
import defpackage.rcc;
import defpackage.rdl0;
import defpackage.s6k0;
import defpackage.scl0;
import defpackage.sgu0;
import defpackage.tcc;
import defpackage.tcl0;
import defpackage.td6;
import defpackage.tje;
import defpackage.u17;
import defpackage.upk0;
import defpackage.w511;
import defpackage.xcl0;
import defpackage.xvf0;
import defpackage.yxf0;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fB%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/yandex/go/navigator/route_stops/RouteStopsModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Ledl0;", "Landroid/content/Context;", "context", "Ljdl0;", "presenter", "Lscl0;", "routeStopsListAdapterFactory", "<init>", "(Landroid/content/Context;Ljdl0;Lscl0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lrdl0;", "uiState", "render", "(Lrdl0;)V", "Ljdl0;", "Lscl0;", "Lcom/yandex/go/navigator/route_stops/a;", "routeStopsListAdapter$delegate", "Li3y;", "getRouteStopsListAdapter", "()Lcom/yandex/go/navigator/route_stops/a;", "routeStopsListAdapter", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "xcl0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RouteStopsModalView extends SlideableModalView implements edl0 {
    public static final int $stable = 8;
    private final jdl0 presenter;

    /* renamed from: routeStopsListAdapter$delegate, reason: from kotlin metadata */
    private final i3y routeStopsListAdapter;
    private final scl0 routeStopsListAdapterFactory;

    public RouteStopsModalView(Context context, jdl0 jdl0Var, scl0 scl0Var) {
        super((View) new RecyclerView(context), (Integer) 6);
        this.presenter = jdl0Var;
        this.routeStopsListAdapterFactory = scl0Var;
        this.routeStopsListAdapter = kotlin.a.b(LazyThreadSafetyMode.NONE, new iik0(12, this));
    }

    private final a getRouteStopsListAdapter() {
        return (a) this.routeStopsListAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$1(RouteStopsModalView routeStopsModalView) {
        routeStopsModalView.getRouteStopsListAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a routeStopsListAdapter_delegate$lambda$0(RouteStopsModalView routeStopsModalView) {
        scl0 scl0Var = routeStopsModalView.routeStopsListAdapterFactory;
        xcl0 xcl0Var = new xcl0(routeStopsModalView);
        s6k0 s6k0Var = ((tcl0) scl0Var).a;
        return new a((sgu0) ((xvf0) s6k0Var.a).get(), (yxf0) ((upk0) s6k0Var.b).get(), (ip11) ((xvf0) s6k0Var.c).get(), xcl0Var);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        throw new IllegalStateException("It have not to be called");
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        jdl0 jdl0Var = this.presenter;
        jdl0Var.Bg(this);
        tje.N(jdl0Var.Jg(), null, null, new RouteStopsPresenter$attachView$$inlined$safeCollectIn$1(jdl0Var.y.c, null, this), 3);
        RecyclerView recyclerView = (RecyclerView) getCardContentView();
        recyclerView.addItemDecoration(new td6());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(getRouteStopsListAdapter());
        recyclerView.setItemAnimator(null);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.eyi0
    public void render(rdl0 uiState) {
        if (!(uiState instanceof pdl0)) {
            if (jl40.l(uiState, qdl0.a)) {
                onBackPressed();
                return;
            } else {
                w511.b();
                return;
            }
        }
        a routeStopsListAdapter = getRouteStopsListAdapter();
        ListBuilder a = rcc.a();
        a.add(pbu.a);
        List list = ((pdl0) uiState).a;
        List<ne50> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (ne50 ne50Var : list2) {
            boolean z = true;
            if (list.size() != 1) {
                z = false;
            }
            arrayList.add(new qcl0(ne50Var, z));
        }
        a.addAll(arrayList);
        a.add(u17.a);
        routeStopsListAdapter.submitList(a.j(), new hxj0(11, this));
    }
}
