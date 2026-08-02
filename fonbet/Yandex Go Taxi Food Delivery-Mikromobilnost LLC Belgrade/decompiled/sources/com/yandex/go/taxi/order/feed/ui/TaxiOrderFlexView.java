package com.yandex.go.taxi.order.feed.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.view.b;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.expression.variables.a;
import com.yandex.go.flex.common.api.actions.SendRealtimeAnalyticsAction;
import com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout;
import com.yandex.go.taxi.order.feed.ui.TaxiOrderFlexView;
import com.yandex.go.taxi.order.multi.feed.ui.TaxiOrderFeedView;
import com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingView;
import defpackage.cay0;
import defpackage.czo0;
import defpackage.frq;
import defpackage.gep0;
import defpackage.grq;
import defpackage.gym;
import defpackage.hbp0;
import defpackage.hqq;
import defpackage.i3y;
import defpackage.ifq0;
import defpackage.jl40;
import defpackage.joq;
import defpackage.jqr;
import defpackage.k7y0;
import defpackage.koq;
import defpackage.l7s0;
import defpackage.loq;
import defpackage.m1y0;
import defpackage.m7y0;
import defpackage.mhp0;
import defpackage.n1y0;
import defpackage.o1y0;
import defpackage.p1y0;
import defpackage.pei0;
import defpackage.pey;
import defpackage.q1y0;
import defpackage.qkv0;
import defpackage.sei0;
import defpackage.sls;
import defpackage.tei0;
import defpackage.u131;
import defpackage.uqq;
import defpackage.w511;
import defpackage.wj6;
import defpackage.ykh0;
import defpackage.zwl;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000¯\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\b\b*\u0003ITZ\u0018\u00002\u00020\u0001:\u0001`Bc\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0014¢\u0006\u0004\b(\u0010#J\u000f\u0010)\u001a\u00020\u001fH\u0014¢\u0006\u0004\b)\u0010#J\u000f\u0010*\u001a\u00020\u001fH\u0003¢\u0006\u0004\b*\u0010#J\u0017\u0010-\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u0018H\u0002¢\u0006\u0004\b0\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00106R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00108R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00109R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010:R\u001a\u0010<\u001a\u00020;8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001b\u0010Y\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010V\u001a\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010\u001a¨\u0006a"}, d2 = {"Lcom/yandex/go/taxi/order/feed/ui/TaxiOrderFlexView;", "Lcom/yandex/go/flex/common/api/ui/FlexSdkFrameLayout;", "Landroid/content/Context;", "context", "Lflex/engine/a;", "engine", "Landroidx/lifecycle/Lifecycle;", "activityLifecycle", "Lcom/yandex/go/taxi/order/feed/data/a;", "loadInteractor", "Lhqq;", "feedSdkErrorListener", "Lq1y0;", "flexViewCallback", "Lgep0;", "screenProvider", "Lsei0;", "realtimeEventsReporter", "Lcom/yandex/div/core/expression/variables/a;", "divVariableController", "Lgrq;", "feedVisibilityRepository", "<init>", "(Landroid/content/Context;Lflex/engine/a;Landroidx/lifecycle/Lifecycle;Lcom/yandex/go/taxi/order/feed/data/a;Lhqq;Lq1y0;Lgep0;Lsei0;Lcom/yandex/div/core/expression/variables/a;Lgrq;)V", "", "interceptOnBackPressed", "()Z", "Landroid/view/ViewGroup;", "provideEngineContainer", "()Landroid/view/ViewGroup;", "canScroll", "Lzy11;", "setCanScroll", "(Z)V", "updateVisibilities", "()V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "onDetachedFromWindow", "resetRecyclerBindings", "Lloq;", ClidProvider.STATE, "updateFeed", "(Lloq;)V", "isError", "renderErrorState", "Lflex/engine/a;", "Landroidx/lifecycle/Lifecycle;", "getActivityLifecycle", "()Landroidx/lifecycle/Lifecycle;", "Lcom/yandex/go/taxi/order/feed/data/a;", "Lhqq;", "Lq1y0;", "Lgep0;", "Lsei0;", "Lcom/yandex/div/core/expression/variables/a;", "Lp1y0;", "binding", "Lp1y0;", "getBinding", "()Lp1y0;", "Lhbp0;", "mainScope", "Lhbp0;", "", "previousScreen", "Ljava/lang/String;", "", "recyclerScrollDY", CA20Status.STATUS_USER_I, "o1y0", "screenListener", "Lo1y0;", "Landroidx/lifecycle/q;", "lifecycleListener", "Landroidx/lifecycle/q;", "feedIsScrolled", "Z", "Lfrq;", "hideFeedController", "Lfrq;", "n1y0", "rootScrollListener$delegate", "Li3y;", "getRootScrollListener", "()Ln1y0;", "rootScrollListener", "m1y0", "documentTracker$delegate", "getDocumentTracker", "()Lm1y0;", "documentTracker", "isExpanded", "ifq0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderFlexView extends FlexSdkFrameLayout {
    private final Lifecycle activityLifecycle;
    private final p1y0 binding;
    private final a divVariableController;

    /* renamed from: documentTracker$delegate, reason: from kotlin metadata */
    private final i3y documentTracker;
    private final flex.engine.a engine;
    private boolean feedIsScrolled;
    private final hqq feedSdkErrorListener;
    private final q1y0 flexViewCallback;
    private final frq hideFeedController;
    private final q lifecycleListener;
    private final com.yandex.go.taxi.order.feed.data.a loadInteractor;
    private final hbp0 mainScope;
    private String previousScreen;
    private final sei0 realtimeEventsReporter;
    private int recyclerScrollDY;

    /* renamed from: rootScrollListener$delegate, reason: from kotlin metadata */
    private final i3y rootScrollListener;
    private final o1y0 screenListener;
    private final gep0 screenProvider;

    public TaxiOrderFlexView(Context context, flex.engine.a aVar, Lifecycle lifecycle, com.yandex.go.taxi.order.feed.data.a aVar2, hqq hqqVar, q1y0 q1y0Var, gep0 gep0Var, sei0 sei0Var, a aVar3, grq grqVar) {
        super(context, aVar, false, 4, null);
        this.engine = aVar;
        this.activityLifecycle = lifecycle;
        this.loadInteractor = aVar2;
        this.feedSdkErrorListener = hqqVar;
        this.flexViewCallback = q1y0Var;
        this.screenProvider = gep0Var;
        this.realtimeEventsReporter = sei0Var;
        this.divVariableController = aVar3;
        LayoutInflater.from(context).inflate(ykh0.taxi_order_flex_view, this);
        this.binding = new p1y0(this);
        this.mainScope = new hbp0(new czo0(14), "", null);
        this.screenListener = new o1y0(this);
        this.lifecycleListener = new wj6(8, this);
        this.hideFeedController = new frq(aVar3, grqVar);
        final int i = 0;
        sls slsVar = new sls(this) { // from class: l1y0
            public final /* synthetic */ TaxiOrderFlexView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                n1y0 rootScrollListener_delegate$lambda$0;
                m1y0 documentTracker_delegate$lambda$0;
                int i2 = i;
                TaxiOrderFlexView taxiOrderFlexView = this.b;
                switch (i2) {
                    case 0:
                        rootScrollListener_delegate$lambda$0 = TaxiOrderFlexView.rootScrollListener_delegate$lambda$0(taxiOrderFlexView);
                        return rootScrollListener_delegate$lambda$0;
                    default:
                        documentTracker_delegate$lambda$0 = TaxiOrderFlexView.documentTracker_delegate$lambda$0(taxiOrderFlexView);
                        return documentTracker_delegate$lambda$0;
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.rootScrollListener = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        b.p(getBinding().a, new ifq0(7, this));
        final int i2 = 1;
        this.documentTracker = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: l1y0
            public final /* synthetic */ TaxiOrderFlexView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                n1y0 rootScrollListener_delegate$lambda$0;
                m1y0 documentTracker_delegate$lambda$0;
                int i22 = i2;
                TaxiOrderFlexView taxiOrderFlexView = this.b;
                switch (i22) {
                    case 0:
                        rootScrollListener_delegate$lambda$0 = TaxiOrderFlexView.rootScrollListener_delegate$lambda$0(taxiOrderFlexView);
                        return rootScrollListener_delegate$lambda$0;
                    default:
                        documentTracker_delegate$lambda$0 = TaxiOrderFlexView.documentTracker_delegate$lambda$0(taxiOrderFlexView);
                        return documentTracker_delegate$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m1y0 documentTracker_delegate$lambda$0(TaxiOrderFlexView taxiOrderFlexView) {
        return new m1y0(taxiOrderFlexView);
    }

    private final m1y0 getDocumentTracker() {
        return (m1y0) this.documentTracker.getValue();
    }

    private final n1y0 getRootScrollListener() {
        return (n1y0) this.rootScrollListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isExpanded() {
        m7y0 m7y0Var;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior;
        m7y0Var = ((TaxiOrderFeedView) ((l7s0) ((gym) this.flexViewCallback).a).a).delegate;
        anchorBottomSheetBehavior = ((k7y0) m7y0Var).a.bottomSheetBehavior;
        int i = anchorBottomSheetBehavior.E;
        return i == 3 || i == 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleListener$lambda$0(TaxiOrderFlexView taxiOrderFlexView, pey peyVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START && jl40.l(taxiOrderFlexView.previousScreen, ((cay0) taxiOrderFlexView.screenProvider).b())) {
            tei0 tei0Var = (tei0) taxiOrderFlexView.realtimeEventsReporter;
            Iterator it = ((pei0) tei0Var.a).b.iterator();
            while (it.hasNext()) {
                ((com.yandex.go.analytics.realtime.a) tei0Var.b).d(tei0.b((SendRealtimeAnalyticsAction.Event) it.next()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderErrorState(boolean isError) {
        m7y0 m7y0Var;
        float f;
        TaxiOrderFeedView taxiOrderFeedView = (TaxiOrderFeedView) ((l7s0) ((gym) this.flexViewCallback).a).a;
        taxiOrderFeedView.isErrorState = isError;
        m7y0Var = taxiOrderFeedView.delegate;
        TaxiOrderTrackingView taxiOrderTrackingView = ((k7y0) m7y0Var).a;
        if (isError) {
            taxiOrderTrackingView.updateFeedErrorAnchorHeight();
        } else {
            f = taxiOrderTrackingView.targetAnchorRatio;
            taxiOrderTrackingView.updateAnchoredHeight(f);
        }
        taxiOrderTrackingView.updateCollapsedHeightRatio();
    }

    private final void resetRecyclerBindings() {
        RecyclerView n = c.n(this);
        if (n != null) {
            RecyclerView.Adapter adapter = n.getAdapter();
            int i = this.recyclerScrollDY;
            this.recyclerScrollDY = 0;
            n.setAdapter(null);
            n.setAdapter(adapter);
            n.post(new qkv0(n, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n1y0 rootScrollListener_delegate$lambda$0(TaxiOrderFlexView taxiOrderFlexView) {
        return new n1y0(taxiOrderFlexView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFeed(loq state) {
        if (state instanceof joq) {
            this.engine.D(((joq) state).a, zwl.c);
        } else if (!(state instanceof koq)) {
            w511.b();
        } else {
            koq koqVar = (koq) state;
            flex.engine.a.q(this.engine, koqVar.a, koqVar.b, false, 4);
        }
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        resetRecyclerBindings();
    }

    public final Lifecycle getActivityLifecycle() {
        return this.activityLifecycle;
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout, defpackage.ylr
    public boolean interceptOnBackPressed() {
        m7y0 m7y0Var;
        if (isExpanded() && this.feedIsScrolled) {
            uqq.a(this.engine);
            return true;
        }
        if (!isExpanded()) {
            return false;
        }
        m7y0Var = ((TaxiOrderFeedView) ((l7s0) ((gym) this.flexViewCallback).a).a).delegate;
        ((k7y0) m7y0Var).a.setBehaviourState(6);
        return true;
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        onResume();
        this.mainScope.a();
        addScrollListener(getRootScrollListener());
        this.engine.c(getDocumentTracker());
        int i = 3;
        e.H(this.mainScope, new jqr(this.feedSdkErrorListener.b, new TaxiOrderFlexView$onAttachedToWindow$1(this, null), i));
        e.H(this.mainScope, new jqr(this.loadInteractor.c(), new TaxiOrderFlexView$onAttachedToWindow$2(2, this, TaxiOrderFlexView.class, "updateFeed", "updateFeed(Lcom/yandex/go/taxi/order/feed/data/FeedDocumentStates;)V", 4), i));
        gep0 gep0Var = this.screenProvider;
        ((cay0) gep0Var).a(this.screenListener);
        this.activityLifecycle.a(this.lifecycleListener);
        frq frqVar = this.hideFeedController;
        u131 u131Var = (u131) frqVar.c.getValue();
        if (u131Var != null) {
            u131Var.a(frqVar.d);
        }
        this.recyclerScrollDY = 0;
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        frq frqVar = this.hideFeedController;
        u131 u131Var = (u131) frqVar.c.getValue();
        if (u131Var != null) {
            u131Var.f(frqVar.d);
        }
        this.recyclerScrollDY = 0;
        this.mainScope.b();
        removeScrollListener(getRootScrollListener());
        ((cay0) this.screenProvider).c(this.screenListener);
        this.activityLifecycle.d(this.lifecycleListener);
        super.onDetachedFromWindow();
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout
    public ViewGroup provideEngineContainer() {
        return getBinding().a;
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout, defpackage.ylr
    public void setCanScroll(boolean canScroll) {
        RecyclerView n = c.n(this);
        if (n == null) {
            return;
        }
        Object layoutManager = n.getLayoutManager();
        mhp0 mhp0Var = layoutManager instanceof mhp0 ? (mhp0) layoutManager : null;
        if (mhp0Var == null) {
            return;
        }
        mhp0Var.w(canScroll);
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout, defpackage.ylr
    public void updateVisibilities() {
        this.engine.n();
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout
    public p1y0 getBinding() {
        return this.binding;
    }
}
