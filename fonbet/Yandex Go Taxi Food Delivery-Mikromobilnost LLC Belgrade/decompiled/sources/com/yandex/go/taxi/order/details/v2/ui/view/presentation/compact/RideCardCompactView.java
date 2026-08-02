package com.yandex.go.taxi.order.details.v2.ui.view.presentation.compact;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.taxi.order.details.v2.analytics.g;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import defpackage.aek0;
import defpackage.bkk0;
import defpackage.cek0;
import defpackage.ckk0;
import defpackage.cma1;
import defpackage.dek0;
import defpackage.dkk0;
import defpackage.eek0;
import defpackage.g1a0;
import defpackage.g6y0;
import defpackage.gek0;
import defpackage.gu11;
import defpackage.htc;
import defpackage.i3y;
import defpackage.i6y0;
import defpackage.iek0;
import defpackage.jek0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.kqe0;
import defpackage.m810;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.nz;
import defpackage.o2y0;
import defpackage.p8h0;
import defpackage.qd00;
import defpackage.sjh;
import defpackage.t1w;
import defpackage.tfk0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.u6y0;
import defpackage.ufk0;
import defpackage.uyj;
import defpackage.vfc0;
import defpackage.vfk0;
import defpackage.w511;
import defpackage.wmk0;
import defpackage.x4e;
import defpackage.ydk0;
import defpackage.z0a0;
import defpackage.zkh0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0002jkB[\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0014¢\u0006\u0004\b!\u0010\"J7\u0010)\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u001eH\u0014¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020#H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020#H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001bH\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001bH\u0016¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u00020\u001bH\u0016¢\u0006\u0004\b8\u00106J\u000f\u00109\u001a\u00020\u001bH\u0016¢\u0006\u0004\b9\u00106J\u000f\u0010:\u001a\u00020\u001bH\u0014¢\u0006\u0004\b:\u00106J\u000f\u0010;\u001a\u00020\u001bH\u0016¢\u0006\u0004\b;\u00106J\u000f\u0010<\u001a\u00020\u001bH\u0014¢\u0006\u0004\b<\u00106J\u001f\u0010?\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020+H\u0002¢\u0006\u0004\b?\u0010@J3\u0010E\u001a\u00020+*\u00020+2\u0006\u0010A\u001a\u00020+2\u0006\u0010B\u001a\u00020+2\u0006\u0010C\u001a\u00020+2\u0006\u0010D\u001a\u00020+H\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010GR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010HR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010IR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010JR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010KR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010LR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001b\u0010X\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001b\u0010]\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010U\u001a\u0004\b[\u0010\\R\u0016\u0010>\u001a\u00020+8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010^R\u0016\u0010_\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010`R\u0014\u0010b\u001a\u00020\u001e8\u0003X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010`R\u0016\u0010c\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010`R\u001a\u0010e\u001a\u00020d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010h¨\u0006l"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/presentation/compact/RideCardCompactView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Laek0;", "Landroid/content/Context;", "context", "Leek0;", "presenter", "Lz0a0;", "paymentIconLoader", "Lydk0;", "communicationAdapterAssistedFactoryInjector", "Lckk0;", "itemsAdapterAssistedFactory", "Lgu11;", "uiToggleDelegate", "Lcom/yandex/go/taxi/order/domain/repositories/f0;", "taxiOrderTrackingViewStateRepository", "Lo2y0;", "orderHolder", "Lcom/yandex/go/taxi/order/details/v2/analytics/perf/a;", "perfAnalyticsTracer", "Lg6y0;", "sessionTimelineTracker", "<init>", "(Landroid/content/Context;Leek0;Lz0a0;Lydk0;Lckk0;Lgu11;Lcom/yandex/go/taxi/order/domain/repositories/f0;Lo2y0;Lcom/yandex/go/taxi/order/details/v2/analytics/perf/a;Lg6y0;)V", "Lu6y0;", "delegate", "Lzy11;", "setDelegate", "(Lu6y0;)V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "", "collapseRate", "getHeight", "(F)I", "newState", "movedByUser", "onListStateChanged", "(IZ)V", "topItemIsCompletelyVisible", "()Z", "scrollToTop", "()V", "forceScrollToTop", "resume", "pause", "onAttachedToWindow", "disableNestedScrolling", "onDetachedFromWindow", "realHeight", "rate", "calculateCollapseHeight", "(IF)I", "originMin", "originMax", "targetMin", "targetMax", "remapToTranslation", "(FFFFF)F", "Leek0;", "Lz0a0;", "Lgu11;", "Lcom/yandex/go/taxi/order/domain/repositories/f0;", "Lo2y0;", "Lcom/yandex/go/taxi/order/details/v2/analytics/perf/a;", "Lg6y0;", "Lcek0;", "binding", "Lcek0;", "taxiOrderTrackingCompactViewDelegate", "Lu6y0;", "Lbkk0;", "itemsAdapter$delegate", "Li3y;", "getItemsAdapter", "()Lbkk0;", "itemsAdapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager$delegate", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "F", "minHeight", CA20Status.STATUS_USER_I, "maxHeight", "headerHeight", "firstItemHeight", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Companion", "iek0", "gek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardCompactView extends GoFrameLayout implements aek0 {
    public static final int $stable = 8;
    private static final gek0 Companion = new gek0();

    @Deprecated
    public static final float TRANSLATION_RATE_THRESHOLD = 0.75f;
    private final cek0 binding;
    private int firstItemHeight;
    private final int headerHeight;

    /* renamed from: itemsAdapter$delegate, reason: from kotlin metadata */
    private final i3y itemsAdapter;

    /* renamed from: layoutManager$delegate, reason: from kotlin metadata */
    private final i3y layoutManager;
    private int maxHeight;
    private int minHeight;
    private final o2y0 orderHolder;
    private final z0a0 paymentIconLoader;
    private final com.yandex.go.taxi.order.details.v2.analytics.perf.a perfAnalyticsTracer;
    private final eek0 presenter;
    private float rate;
    private final g6y0 sessionTimelineTracker;
    private u6y0 taxiOrderTrackingCompactViewDelegate;
    private final f0 taxiOrderTrackingViewStateRepository;
    private final gu11 uiToggleDelegate;
    private final View view;

    public RideCardCompactView(Context context, eek0 eek0Var, z0a0 z0a0Var, ydk0 ydk0Var, ckk0 ckk0Var, gu11 gu11Var, f0 f0Var, o2y0 o2y0Var, com.yandex.go.taxi.order.details.v2.analytics.perf.a aVar, g6y0 g6y0Var) {
        super(context, null, 0, 0, 14, null);
        this.presenter = eek0Var;
        this.paymentIconLoader = z0a0Var;
        this.uiToggleDelegate = gu11Var;
        this.taxiOrderTrackingViewStateRepository = f0Var;
        this.orderHolder = o2y0Var;
        this.perfAnalyticsTracer = aVar;
        this.sessionTimelineTracker = g6y0Var;
        View inflate = LayoutInflater.from(context).inflate(zkh0.ride_card_compact_layout, (ViewGroup) this, false);
        addView(inflate);
        int i = p8h0.badge_stub;
        ViewStub viewStub = (ViewStub) cma1.O(i, inflate);
        if (viewStub != null) {
            GoFrameLayout goFrameLayout = (GoFrameLayout) inflate;
            int i2 = p8h0.rv_items;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i2, inflate);
            if (recyclerView != null) {
                this.binding = new cek0(goFrameLayout, viewStub, recyclerView);
                kqe0 kqe0Var = new kqe0(13, ckk0Var, ydk0Var, this);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                this.itemsAdapter = kotlin.a.b(lazyThreadSafetyMode, kqe0Var);
                this.layoutManager = kotlin.a.b(lazyThreadSafetyMode, new qd00(context, 28));
                this.rate = 1.0f;
                this.minHeight = tje.u(72, getContext());
                int u = tje.u(72, getContext());
                this.headerHeight = u;
                this.view = this;
                f0Var.b(u, o2y0Var);
                return;
            }
            i = i2;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int calculateCollapseHeight(int realHeight, float rate) {
        return Math.min(m810.b(realHeight - (Math.abs(realHeight - this.minHeight) * rate)), realHeight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bkk0 getItemsAdapter() {
        return (bkk0) this.itemsAdapter.getValue();
    }

    private final LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.layoutManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bkk0 itemsAdapter_delegate$lambda$0(ckk0 ckk0Var, ydk0 ydk0Var, RideCardCompactView rideCardCompactView) {
        htc htcVar = ydk0Var.a;
        eek0 eek0Var = rideCardCompactView.presenter;
        return ((dkk0) ckk0Var).a(htcVar, new a(eek0Var), new jek0(eek0Var, 0), RideCardPresentationType.COMPACT, new vfc0(17, rideCardCompactView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void itemsAdapter_delegate$lambda$0$0(RideCardCompactView rideCardCompactView, long j, vfk0 vfk0Var) {
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint;
        if (vfk0Var instanceof tfk0) {
            taxiOrderSessionCheckpoint = TaxiOrderSessionCheckpoint.LCP_DEFAULTS;
        } else {
            if (!(vfk0Var instanceof ufk0)) {
                w511.b();
                return;
            }
            taxiOrderSessionCheckpoint = TaxiOrderSessionCheckpoint.LCP;
        }
        ((i6y0) rideCardCompactView.sessionTimelineTracker).b(new wmk0(taxiOrderSessionCheckpoint, m810.c(j / 1000000.0d), RideCardPresentationType.COMPACT, vfk0Var, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayoutManager layoutManager_delegate$lambda$0(Context context) {
        return new LinearLayoutManager(context, 1, false);
    }

    private final float remapToTranslation(float f, float f2, float f3, float f4, float f5) {
        return (((f5 - f4) / (f3 - f2)) * (f - f2)) + f4;
    }

    @Override // defpackage.oc80
    public void disableNestedScrolling() {
        this.binding.b.setNestedScrollingEnabled(false);
    }

    @Override // defpackage.oc80
    public void forceScrollToTop() {
        this.binding.b.scrollToPosition(0);
    }

    @Override // defpackage.oc80
    public int getHeight(float collapseRate) {
        return this.presenter.I ? calculateCollapseHeight(this.maxHeight, collapseRate) : getHeight();
    }

    @Override // defpackage.oc80
    public View getView() {
        return this.view;
    }

    @Override // defpackage.oc80
    public /* bridge */ void insetsType(t1w t1wVar) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.perfAnalyticsTracer.g();
        RecyclerView recyclerView = this.binding.b;
        recyclerView.setLayoutManager(getLayoutManager());
        recyclerView.setAdapter(getItemsAdapter());
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setItemAnimator(null);
        setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.r(mrg0.modal_view_corner_radius_big, getContext())));
        setClipToOutline(true);
        ((g1a0) this.paymentIconLoader).a();
        eek0 eek0Var = this.presenter;
        iek0 iek0Var = new iek0(this);
        eek0Var.Bg(iek0Var);
        g gVar = eek0Var.F;
        OrderScreen orderScreen = eek0Var.H;
        RideCardPresentationType rideCardPresentationType = RideCardPresentationType.COMPACT;
        gVar.c(orderScreen, rideCardPresentationType);
        eek0Var.C.b();
        tpr t = e.t(new m0(eek0Var.y.a(rideCardPresentationType), eek0Var.E.a(rideCardPresentationType), new RideCardCompactPresenter$attachView$1(3, eek0Var, eek0.class, "toCompactState", "toCompactState(Lcom/yandex/go/taxi/order/details/v2/state/RideCardState;Lcom/yandex/go/taxi/order/details/v2/state/elements/decorations/RideCardTopDecorationUiState;)Lcom/yandex/go/taxi/order/details/v2/ui/view/presentation/compact/RideCardCompactUiState;", 4)));
        eek0Var.G.getClass();
        sjh sjhVar = uyj.a;
        tpr F = e.F(t, sjhVar);
        tje.N(eek0Var.Jg(), null, null, new RideCardCompactPresenter$attachView$$inlined$collectLatestIn$1(F, null, iek0Var), 3);
        e.H(eek0Var.Jg(), new jqr(eek0Var.x.d, new RideCardCompactPresenter$attachView$3(2, iek0Var, dek0.class, "setMinHeight", "setMinHeight(I)V", 4), 3));
        tje.N(eek0Var.Jg(), null, CoroutineStart.UNDISPATCHED, new RideCardCompactPresenter$attachView$4(eek0Var, iek0Var, null), 1);
        tje.N(eek0Var.Jg(), sjhVar, null, new RideCardCompactPresenter$attachView$5(eek0Var, null), 2);
        tje.N(eek0Var.Jg(), null, null, new RideCardCompactPresenter$attachView$6(eek0Var, null), 3);
        OneShotPreDrawListener.add(this, new nz(this, this, SystemClock.elapsedRealtimeNanos(), this, 10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.binding.b.setAdapter(null);
        this.binding.b.setLayoutManager(null);
        ((g1a0) this.paymentIconLoader).d();
        this.presenter.Cg();
        this.perfAnalyticsTracer.h();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        float remapToTranslation = remapToTranslation(this.rate, 0.75f, 1.0f, 0.0f, -this.firstItemHeight);
        RecyclerView recyclerView = this.binding.b;
        if (remapToTranslation > 0.0f) {
            remapToTranslation = 0.0f;
        }
        recyclerView.setTranslationY(remapToTranslation);
        if (changed) {
            f0 f0Var = this.taxiOrderTrackingViewStateRepository;
            int height = getHeight();
            if (jl40.l(f0Var.q.getValue(), this.orderHolder)) {
                x4e.z(height, f0Var.g, null);
            }
            f0 f0Var2 = this.taxiOrderTrackingViewStateRepository;
            int height2 = getHeight();
            if (jl40.l(f0Var2.q.getValue(), this.orderHolder)) {
                x4e.z(height2, f0Var2.e, null);
            }
        }
    }

    @Override // defpackage.oc80
    public void onListStateChanged(int newState, boolean movedByUser) {
        this.presenter.D.c(newState, movedByUser);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int measuredHeight = getMeasuredHeight();
        this.maxHeight = measuredHeight;
        if (this.presenter.I) {
            setMeasuredDimension(getMeasuredWidth(), calculateCollapseHeight(measuredHeight, this.rate));
        }
    }

    @Override // defpackage.oc80
    public void pause() {
        this.presenter.pause();
    }

    @Override // defpackage.oc80
    public void resume() {
        this.presenter.resume();
    }

    @Override // defpackage.oc80
    public void scrollToTop() {
        this.binding.b.scrollToPosition(0);
    }

    @Override // defpackage.aek0
    public void setDelegate(u6y0 delegate) {
        this.taxiOrderTrackingCompactViewDelegate = delegate;
    }

    public /* bridge */ void setPullToRefreshListener(Runnable runnable) {
    }

    @Override // defpackage.oc80
    public boolean topItemIsCompletelyVisible() {
        return getLayoutManager().H1() == 0;
    }
}
