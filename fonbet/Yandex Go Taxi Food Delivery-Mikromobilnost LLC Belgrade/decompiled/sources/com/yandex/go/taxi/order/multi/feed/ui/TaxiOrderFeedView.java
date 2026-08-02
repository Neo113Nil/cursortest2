package com.yandex.go.taxi.order.multi.feed.ui;

import android.content.Context;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.shortcuts.impl.repository.i;
import com.yandex.go.taxi.order.multi.feed.analytics.TaxiOrderFeedAnalytics$Source;
import defpackage.a1y0;
import defpackage.bkx0;
import defpackage.brq;
import defpackage.e1y0;
import defpackage.f1y0;
import defpackage.i3y;
import defpackage.k7y0;
import defpackage.l7s0;
import defpackage.m7y0;
import defpackage.mth;
import defpackage.oew0;
import defpackage.qv10;
import defpackage.tje;
import defpackage.vng;
import defpackage.w0y0;
import defpackage.xng0;
import defpackage.ylr;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\b*\u0001(\b\u0007\u0018\u00002\u00020\u0001:\u0001.B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010&\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010\u0019R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/yandex/go/taxi/order/multi/feed/ui/TaxiOrderFeedView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Lbrq;", "feedSdkViewContainerFactory", "La1y0;", "presenter", "Lw0y0;", "analyticsManager", "Lm7y0;", "delegate", "<init>", "(Landroid/content/Context;Lbrq;La1y0;Lw0y0;Lm7y0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", ClidProvider.STATE, "", "isMovedByUser", "bottomSheetStateChanged", "(IZ)V", "interceptOnBackPressed", "()Z", "show", "Lbrq;", "La1y0;", "Lw0y0;", "Lm7y0;", "Lylr;", "flexSdkView", "Lylr;", "Lcom/yandex/go/taxi/order/multi/feed/ui/TaxiOrderFeedScrollUpButton;", "scrollUpButton", "Lcom/yandex/go/taxi/order/multi/feed/ui/TaxiOrderFeedScrollUpButton;", "value", "isErrorState", "Z", "f1y0", "feedScrollListener$delegate", "Li3y;", "getFeedScrollListener", "()Lf1y0;", "feedScrollListener", "e1y0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderFeedView extends GoFrameLayout {
    public static final int $stable = 8;
    private final w0y0 analyticsManager;
    private final m7y0 delegate;

    /* renamed from: feedScrollListener$delegate, reason: from kotlin metadata */
    private final i3y feedScrollListener;
    private final brq feedSdkViewContainerFactory;
    private ylr flexSdkView;
    private boolean isErrorState;
    private final a1y0 presenter;
    private TaxiOrderFeedScrollUpButton scrollUpButton;

    public TaxiOrderFeedView(Context context, brq brqVar, a1y0 a1y0Var, w0y0 w0y0Var, m7y0 m7y0Var) {
        super(context, null, 0, 0, 14, null);
        this.feedSdkViewContainerFactory = brqVar;
        this.presenter = a1y0Var;
        this.analyticsManager = w0y0Var;
        this.delegate = m7y0Var;
        this.feedScrollListener = kotlin.a.b(LazyThreadSafetyMode.NONE, new oew0(9, this));
        setMinimumHeight(getResources().getDisplayMetrics().heightPixels);
        setBackgroundAttr(xng0.bgMain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f1y0 feedScrollListener_delegate$lambda$0(TaxiOrderFeedView taxiOrderFeedView) {
        return new f1y0(taxiOrderFeedView);
    }

    private final f1y0 getFeedScrollListener() {
        return (f1y0) this.feedScrollListener.getValue();
    }

    public final void bottomSheetStateChanged(int state, boolean isMovedByUser) {
        TaxiOrderFeedScrollUpButton taxiOrderFeedScrollUpButton = this.scrollUpButton;
        if (taxiOrderFeedScrollUpButton != null) {
            taxiOrderFeedScrollUpButton.setCurrentBehaviorState(state);
        }
        ylr ylrVar = this.flexSdkView;
        if (ylrVar != null) {
            ylrVar.setCanScroll(state != 6);
        }
        qv10.B(state == 1 || state == 2 || state == 3, this.presenter.A.a, null);
        if (isMovedByUser) {
            this.presenter.Kg(null);
            r0 r0Var = this.presenter.x.l;
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
        }
        if (state == 3) {
            w0y0 w0y0Var = this.analyticsManager;
            w0y0.b(w0y0Var, w0y0Var.a, "FeedSDK.Card.Expanded", TaxiOrderFeedAnalytics$Source.FEED_ORDER_DETAILS, Boolean.valueOf(true ^ isMovedByUser), 4);
            w0y0Var.b = "FeedSDK.Card.Expanded";
            ylr ylrVar2 = this.flexSdkView;
            if (ylrVar2 != null) {
                ylrVar2.updateVisibilities();
                return;
            }
            return;
        }
        if (state == 4) {
            w0y0 w0y0Var2 = this.analyticsManager;
            w0y0.b(w0y0Var2, w0y0Var2.a, "FeedSDK.Card.Minimized", TaxiOrderFeedAnalytics$Source.FEED_ORDER_DETAILS, Boolean.valueOf(!isMovedByUser), 4);
            w0y0Var2.b = "FeedSDK.Card.Minimized";
        } else {
            if (state != 6) {
                return;
            }
            w0y0 w0y0Var3 = this.analyticsManager;
            w0y0.a(w0y0Var3.a, "FeedSDK.Card.Raised", TaxiOrderFeedAnalytics$Source.FEED_ORDER_DETAILS, w0y0Var3.b, Boolean.valueOf(!isMovedByUser));
            w0y0Var3.b = "FeedSDK.Card.Raised";
        }
    }

    public final boolean interceptOnBackPressed() {
        ylr ylrVar = this.flexSdkView;
        return ylrVar != null && ylrVar.interceptOnBackPressed();
    }

    /* renamed from: isErrorState, reason: from getter */
    public final boolean getIsErrorState() {
        return this.isErrorState;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TaxiOrderFeedScrollUpButton taxiOrderFeedScrollUpButton = new TaxiOrderFeedScrollUpButton(getContext(), this.analyticsManager);
        taxiOrderFeedScrollUpButton.addOnClickListener(new TaxiOrderFeedView$onAttachedToWindow$scrollButton$1$1(0, this, TaxiOrderFeedView.class, "interceptOnBackPressed", "interceptOnBackPressed()Z", 8));
        this.scrollUpButton = taxiOrderFeedScrollUpButton;
        ylr a = this.feedSdkViewContainerFactory.a(new l7s0(this));
        this.flexSdkView = a;
        addView(a.asView());
        a.addScrollListener(getFeedScrollListener());
        ((k7y0) this.delegate).a.addFloatButton(taxiOrderFeedScrollUpButton, 8388693);
        a1y0 a1y0Var = this.presenter;
        e1y0 e1y0Var = new e1y0(this);
        a1y0Var.Bg(e1y0Var);
        int i = 6;
        tje.N(a1y0Var.Jg(), null, null, new TaxiOrderFeedPresenter$attachView$$inlined$collectIn$1(new mth(new c(vng.l(kotlinx.coroutines.flow.e.X(new mth(a1y0Var.x.q, i), new TaxiOrderFeedPresenter$attachView$$inlined$flatMapLatest$1(3, null)), new bkx0(20), vng.c), a1y0Var.y), i), null, a1y0Var, e1y0Var), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        ylr ylrVar = this.flexSdkView;
        if (ylrVar != null) {
            ylrVar.removeScrollListener(getFeedScrollListener());
        }
        this.flexSdkView = null;
        this.isErrorState = false;
        this.scrollUpButton = null;
    }

    public final void show() {
        ((i) this.presenter.z).a();
    }
}
