package com.yandex.go.taxi.order.multi.feed.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.taxi.order.details.v2.core.availability.m;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.multi.tracking.j;
import defpackage.a3y0;
import defpackage.aek0;
import defpackage.cck0;
import defpackage.eck0;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.hst;
import defpackage.ifk0;
import defpackage.jst;
import defpackage.keu0;
import defpackage.lzu0;
import defpackage.o2y0;
import defpackage.o400;
import defpackage.oc80;
import defpackage.p2y0;
import defpackage.q9y0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u6y0;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B[\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020)2\b\b\u0001\u0010&\u001a\u00020%H\u0017¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u001aH\u0014¢\u0006\u0004\b,\u0010\u001eJ\u000f\u0010-\u001a\u00020\u001aH\u0014¢\u0006\u0004\b-\u0010\u001eR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00102R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/yandex/go/taxi/order/multi/feed/ui/TaxiOrderTrackingCompactViewProxyContainer;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Lkeu0;", "Landroid/content/Context;", "context", "Lh3y;", "Loc80;", "ordersListView", "Lu6y0;", "taxiOrderTrackingCompactViewDelegate", "Lcom/yandex/go/taxi/order/details/v2/navigation/d;", "rideCardRouterFacade", "Lp2y0;", "orderHolderRepository", "Lcom/yandex/go/taxi/order/details/v2/core/availability/m;", "rideCardAvailabilityRepository", "Leck0;", "rideCardAvailabilityAnalytics", "Ltt2;", "appDispatchers", "<init>", "(Landroid/content/Context;Lh3y;Lu6y0;Lh3y;Lp2y0;Lcom/yandex/go/taxi/order/details/v2/core/availability/m;Leck0;Ltt2;)V", "Lkotlin/Pair;", "Lo2y0;", "Lcck0;", "pair", "Lzy11;", "addCompactView", "(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addOrderListView", "()V", "orderHolder", "addRideCardView", "(Lo2y0;)V", "Landroid/view/View;", "asView", "()Landroid/view/View;", "", "slide", "onSlide", "(F)V", "", "getHeight", "(F)I", "onAttachedToWindow", "onDetachedFromWindow", "Lh3y;", "Lu6y0;", "Lp2y0;", "Lcom/yandex/go/taxi/order/details/v2/core/availability/m;", "Leck0;", "Ltt2;", "La3y0;", "logger", "La3y0;", "Lhbp0;", "scope", "Lhbp0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderTrackingCompactViewProxyContainer extends GoFrameLayout implements keu0 {
    public static final int $stable = 8;
    private final tt2 appDispatchers;
    private final a3y0 logger;
    private final p2y0 orderHolderRepository;
    private final h3y ordersListView;
    private final eck0 rideCardAvailabilityAnalytics;
    private final m rideCardAvailabilityRepository;
    private final h3y rideCardRouterFacade;
    private final hbp0 scope;
    private final u6y0 taxiOrderTrackingCompactViewDelegate;

    /* JADX WARN: Multi-variable type inference failed */
    public TaxiOrderTrackingCompactViewProxyContainer(Context context, h3y h3yVar, u6y0 u6y0Var, h3y h3yVar2, p2y0 p2y0Var, m mVar, eck0 eck0Var, tt2 tt2Var) {
        super(context, null, 0, 0, 14, null);
        this.ordersListView = h3yVar;
        this.taxiOrderTrackingCompactViewDelegate = u6y0Var;
        this.rideCardRouterFacade = h3yVar2;
        this.orderHolderRepository = p2y0Var;
        this.rideCardAvailabilityRepository = mVar;
        this.rideCardAvailabilityAnalytics = eck0Var;
        this.appDispatchers = tt2Var;
        this.logger = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "TrackingCompactViewProxyContainer");
        this.scope = new hbp0(new TaxiOrderTrackingCompactViewProxyContainer$scope$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object addCompactView(Pair<o2y0, ? extends cck0> pair, Continuation<? super zy11> continuation) {
        o2y0 o2y0Var = (o2y0) pair.getFirst();
        cck0 cck0Var = (cck0) pair.getSecond();
        this.logger.getClass();
        a3y0.h(new String[]{"addCompactView"});
        hst hstVar = jst.e;
        this.appDispatchers.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new TaxiOrderTrackingCompactViewProxyContainer$addCompactView$3(this, cck0Var, o2y0Var, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    private static final String addCompactView$lambda$0(cck0 cck0Var) {
        return "received: " + cck0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addOrderListView() {
        oc80 oc80Var = (oc80) this.ordersListView.get();
        oc80Var.disableNestedScrolling();
        View view = oc80Var.getView();
        view.setImportantForAccessibility(2);
        view.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.u(24, view.getContext())));
        view.setClipToOutline(true);
        addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addRideCardView(o2y0 orderHolder) {
        ((com.yandex.go.taxi.order.details.v2.navigation.d) this.rideCardRouterFacade.get()).e(new q9y0(orderHolder, OrderScreen.ORDER_TRACKING, new lzu0(28, this, orderHolder)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 addRideCardView$lambda$0(TaxiOrderTrackingCompactViewProxyContainer taxiOrderTrackingCompactViewProxyContainer, o2y0 o2y0Var, View view) {
        aek0 aek0Var = (aek0) view;
        aek0Var.disableNestedScrolling();
        aek0Var.setDelegate(taxiOrderTrackingCompactViewProxyContainer.taxiOrderTrackingCompactViewDelegate);
        View view2 = aek0Var.getView();
        view2.setImportantForAccessibility(2);
        view2.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.u(24, view2.getContext())));
        view2.setClipToOutline(true);
        ((j) taxiOrderTrackingCompactViewProxyContainer.taxiOrderTrackingCompactViewDelegate).a(o2y0Var);
        taxiOrderTrackingCompactViewProxyContainer.addView(view2);
        return zy11.a;
    }

    public View asView() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.keu0
    public int getHeight(float slide) {
        View childAt = getChildAt(0);
        if (!(childAt instanceof oc80)) {
            return getHeight();
        }
        int height = ((oc80) childAt).getHeight(slide);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = height + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null);
        return i + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.scope.f();
        hbp0.e(this.scope, null, null, new TaxiOrderTrackingCompactViewProxyContainer$onAttachedToWindow$1(this, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ifk0 ifk0Var = ((com.yandex.go.taxi.order.details.v2.navigation.d) this.rideCardRouterFacade.get()).f;
        if (ifk0Var != null) {
            ifk0Var.i();
        }
        this.scope.b();
        super.onDetachedFromWindow();
    }

    public void onSlide(float slide) {
    }
}
