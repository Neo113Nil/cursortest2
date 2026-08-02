package com.yandex.go.taxi.order.multi.tracking;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.order.tariffs_suggest.ui.OrderWithTariffSuggestView;
import com.yandex.go.taxi.order.analytics.TaxiOrderAnalytics$RideCardPresentation;
import com.yandex.go.taxi.order.details.v2.core.availability.m;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.multi.feed.analytics.TaxiOrderFeedAnalytics$Source;
import com.yandex.go.taxi.order.multi.feed.ui.HandlerStickyView;
import com.yandex.go.taxi.order.multi.feed.ui.TaxiOrderFeedView;
import com.yandex.go.taxi.order.multi.feed.ui.TaxiOrderTrackingCompactViewProxyContainer;
import com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingView;
import com.yandex.go.taxi.order.multi.tracking.j;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import com.yandex.go.taxi.order.queue.interactor.QueueAvailabilityInteractorImpl$orderHasQueueFlow$$inlined$flatMapLatest$2;
import com.yandex.go.taxi.order.queue.interactor.QueueAvailabilityInteractorImpl$orderHasQueueFlow$$inlined$start$1;
import com.yandex.go.taxi.order.ui.TaxiOrderTrackingBackButton;
import com.yandex.go.taxi.order.ui.recenter.TaxiOrderTrackingRecenterButton;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.a1y0;
import defpackage.a3y0;
import defpackage.brq;
import defpackage.c2x0;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.d2x0;
import defpackage.d82;
import defpackage.eck0;
import defpackage.eg3;
import defpackage.eor;
import defpackage.f7y0;
import defpackage.g1y0;
import defpackage.g6y0;
import defpackage.gok0;
import defpackage.h1y0;
import defpackage.h7y0;
import defpackage.h8;
import defpackage.hbp0;
import defpackage.hwo0;
import defpackage.i3y;
import defpackage.i5m;
import defpackage.i5y0;
import defpackage.i6y0;
import defpackage.i7y0;
import defpackage.j7y0;
import defpackage.jqr;
import defpackage.k7y0;
import defpackage.keu0;
import defpackage.kok0;
import defpackage.kpa1;
import defpackage.l7y0;
import defpackage.lhc;
import defpackage.m7y0;
import defpackage.m810;
import defpackage.mb80;
import defpackage.mpk0;
import defpackage.mrg0;
import defpackage.mth;
import defpackage.ndh0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.p8h0;
import defpackage.pfq0;
import defpackage.pwy0;
import defpackage.qoi0;
import defpackage.qv10;
import defpackage.rbx0;
import defpackage.s3y0;
import defpackage.s5w0;
import defpackage.sls;
import defpackage.ssx0;
import defpackage.t1w;
import defpackage.t3y0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tsx0;
import defpackage.tt2;
import defpackage.u6y0;
import defpackage.uc80;
import defpackage.usg0;
import defpackage.v6y0;
import defpackage.vx0;
import defpackage.w0y0;
import defpackage.w511;
import defpackage.wug0;
import defpackage.x6y0;
import defpackage.x711;
import defpackage.xvf0;
import defpackage.xw31;
import defpackage.y4k0;
import defpackage.y6i0;
import defpackage.y7x0;
import defpackage.z4m0;
import defpackage.z6x0;
import defpackage.zkb1;
import defpackage.zkh0;
import defpackage.zni0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;
import ru.yandex.taxi.layers.domain.w;
import ru.yandex.taxi.models.OrderRatioHeightType;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ²\u00012\u00020\u00012\u00020\u0002:\u0004³\u0001´\u0001Bs\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001fH\u0016¢\u0006\u0004\b*\u0010!J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020$H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u001f2\u0006\u00103\u001a\u00020$H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u001fH\u0016¢\u0006\u0004\b6\u0010!J\u000f\u00107\u001a\u00020\u001fH\u0016¢\u0006\u0004\b7\u0010!J\r\u00108\u001a\u00020\u001f¢\u0006\u0004\b8\u0010!J\u0017\u0010:\u001a\u00020\u001f2\u0006\u00109\u001a\u00020$H\u0002¢\u0006\u0004\b:\u00105J\u0017\u0010<\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020.H\u0002¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\u00020\u001f2\u0006\u00109\u001a\u00020$2\u0006\u0010>\u001a\u00020.H\u0002¢\u0006\u0004\b?\u0010@J)\u0010E\u001a\u00020\u001f2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020.2\b\u0010D\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u001fH\u0002¢\u0006\u0004\bG\u0010!J\u000f\u0010H\u001a\u00020\u001fH\u0002¢\u0006\u0004\bH\u0010!J\u000f\u0010I\u001a\u00020\u001fH\u0002¢\u0006\u0004\bI\u0010!J\u000f\u0010J\u001a\u00020\u001fH\u0002¢\u0006\u0004\bJ\u0010!J\u000f\u0010K\u001a\u00020\u001fH\u0002¢\u0006\u0004\bK\u0010!J\u000f\u0010L\u001a\u00020\u001fH\u0002¢\u0006\u0004\bL\u0010!J\u000f\u0010M\u001a\u00020\u001fH\u0002¢\u0006\u0004\bM\u0010!J\u000f\u0010N\u001a\u00020\u001fH\u0002¢\u0006\u0004\bN\u0010!J\u000f\u0010O\u001a\u00020\u001fH\u0002¢\u0006\u0004\bO\u0010!J\u0017\u0010Q\u001a\u00020\u001f2\u0006\u0010P\u001a\u00020AH\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u001fH\u0002¢\u0006\u0004\bS\u0010!J\u0019\u0010T\u001a\u00020A2\b\u0010D\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\bT\u0010UJ#\u0010X\u001a\u00020A*\u00020A2\u0006\u0010V\u001a\u00020A2\u0006\u0010W\u001a\u00020AH\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020\u001f2\u0006\u0010Z\u001a\u00020.H\u0002¢\u0006\u0004\b[\u0010=J\u0019\u0010^\u001a\u00020\u001f2\b\u0010]\u001a\u0004\u0018\u00010\\H\u0002¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u001fH\u0002¢\u0006\u0004\b`\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010dR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010eR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010fR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010gR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010hR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010iR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010jR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010kR\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u001b\u0010u\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u00102R\u0018\u0010w\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010y\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010{\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b{\u0010zR\u0016\u0010|\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b~\u0010zR\u0016\u0010\u007f\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010zR\u0018\u0010\u0080\u0001\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010zR\u0019\u0010\u0081\u0001\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0019\u0010\u0083\u0001\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0082\u0001R\u0019\u0010\u0084\u0001\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0082\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001e\u0010\u008a\u0001\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010s\u001a\u0005\b\u0089\u0001\u0010-R \u0010\u008f\u0001\u001a\u00030\u008b\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008c\u0001\u0010s\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001f\u0010\u0092\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010\u0098\u0001\u001a\u00030\u0094\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0095\u0001\u0010s\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R \u0010\u009d\u0001\u001a\u00030\u0099\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009a\u0001\u0010s\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R \u0010¢\u0001\u001a\u00030\u009e\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009f\u0001\u0010s\u001a\u0006\b \u0001\u0010¡\u0001R\u001c\u0010¤\u0001\u001a\u0005\u0018\u00010£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u001c\u0010§\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001c\u0010ª\u0001\u001a\u0005\u0018\u00010©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001a\u0010\u00ad\u0001\u001a\u00030¬\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u001c\u0010°\u0001\u001a\u0005\u0018\u00010¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001¨\u0006µ\u0001"}, d2 = {"Lcom/yandex/go/taxi/order/multi/tracking/TaxiOrderTrackingView;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "", "Landroid/content/Context;", "context", "Lv6y0;", "compactOrderViewFactory", "Lc2x0;", "systemBarsCoordinator", "Lcom/yandex/go/taxi/order/ui/recenter/TaxiOrderTrackingRecenterButton;", "recenterButton", "Lcom/yandex/go/taxi/order/multi/tracking/i;", "presenter", "Ltsx0;", "tariffSuggestsViewFactory", "Lg1y0;", "taxiOrderFeedViewAssistedFactory", "Lg6y0;", "sessionTimelineTracker", "Lgok0;", "rideCardTaxiPanoramaEntryPointInteractor", "Lpwy0;", "themeSwitcherProvider", "Lru/yandex/taxi/design/utils/b;", "shadowBgRepository", "Ls3y0;", "taxiOrderMultimodalRoutesViewProvider", "Ly4k0;", "ridaAppDelegate", "<init>", "(Landroid/content/Context;Lv6y0;Lc2x0;Lcom/yandex/go/taxi/order/ui/recenter/TaxiOrderTrackingRecenterButton;Lcom/yandex/go/taxi/order/multi/tracking/i;Ltsx0;Lg1y0;Lg6y0;Lgok0;Lpwy0;Lru/yandex/taxi/design/utils/b;Ls3y0;Ly4k0;)V", "Lzy11;", "onAttachedToWindow", "()V", "Leor;", "button", "", "gravity", "addFloatButton", "(Leor;I)V", "removeFloatButton", "(Leor;)V", "onDetachedFromWindow", "Landroid/view/View;", "asModalView", "()Landroid/view/View;", "", "interceptOnBackPressed", "()Z", "anchoredHeight", "()I", "initialState", "show", "(I)V", "forceAnchor", "forceCollapse", "reload", ClidProvider.STATE, "setBehaviourState", "canDrag", "setCanDrag", "(Z)V", "movedByUser", "onBottomSheetStateChanged", "(IZ)V", "", "slideOffset", "settlingNewOffsets", "nestedScrollingChild", "onSlideOffsetChanged", "(FZLandroid/view/View;)V", "clearBottomContainer", "showFeed", "showMultimodal", "showTariffsSuggest", "hideContainer", "clearTariffSelection", "clearFeed", "clearMultimodalRoutes", "updateCollapsedHeightRatio", "ratio", "updateAnchoredHeight", "(F)V", "updateFeedErrorAnchorHeight", "getProperSlideOffset", "(Landroid/view/View;)F", "min", CspBioProgressConstants.MAX, "toRangeInverted", "(FFF)F", "isFeedError", "updateNestedScrollingChild", "Lmpk0;", "uiState", "renderTopDecoration", "(Lmpk0;)V", "updateTopEndFloatButtonVisibility", "Lc2x0;", "Lcom/yandex/go/taxi/order/ui/recenter/TaxiOrderTrackingRecenterButton;", "Lcom/yandex/go/taxi/order/multi/tracking/i;", "Ltsx0;", "Lg1y0;", "Lg6y0;", "Lgok0;", "Lpwy0;", "Lru/yandex/taxi/design/utils/b;", "Ls3y0;", "Ly4k0;", "La3y0;", "logger", "La3y0;", "Lhbp0;", "mainScope", "Lhbp0;", "dp48$delegate", "Li3y;", "getDp48", "dp48", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "panoramaButton", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "topInset", CA20Status.STATUS_USER_I, "navigationBarHeight", "isNavigationBarHeightSet", "Z", "nonErrorHeaderHeightPx", "errorHeaderHeightPx", "compactOrderViewHorizontalMarginPx", "targetAnchorRatio", "F", "currentSlideOffset", "blackBackgroundAlpha", "Ll7y0;", "binding", "Ll7y0;", "compactOrderView$delegate", "getCompactOrderView", "compactOrderView", "Lcom/yandex/go/taxi/order/multi/feed/ui/HandlerStickyView;", "handlerView$delegate", "getHandlerView", "()Lcom/yandex/go/taxi/order/multi/feed/ui/HandlerStickyView;", "handlerView", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/widget/LinearLayout;", "bottomSheetBehavior", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Lcom/yandex/go/taxi/order/ui/TaxiOrderTrackingBackButton;", "backNavigationButton$delegate", "getBackNavigationButton", "()Lcom/yandex/go/taxi/order/ui/TaxiOrderTrackingBackButton;", "backNavigationButton", "Lu6y0;", "compactCardDelegate$delegate", "getCompactCardDelegate", "()Lu6y0;", "compactCardDelegate", "Lm7y0;", "containerDelegate$delegate", "getContainerDelegate", "()Lm7y0;", "containerDelegate", "Lcom/yandex/go/taxi/order/multi/feed/ui/TaxiOrderFeedView;", "feedView", "Lcom/yandex/go/taxi/order/multi/feed/ui/TaxiOrderFeedView;", "Lcom/yandex/go/taxi/order/multi/tracking/TaxiOrderMultimodalRoutesView;", "taxiOrderMultimodalRoutesView", "Lcom/yandex/go/taxi/order/multi/tracking/TaxiOrderMultimodalRoutesView;", "Lssx0;", "tariffSuggestView", "Lssx0;", "Lcom/yandex/go/taxi/order/multi/tracking/TaxiOrderTrackingViewDelegate$Type;", "currentViewType", "Lcom/yandex/go/taxi/order/multi/tracking/TaxiOrderTrackingViewDelegate$Type;", "Landroid/widget/ImageView;", "topDecorationView", "Landroid/widget/ImageView;", "Companion", "h7y0", "f7y0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderTrackingView extends CoordinatorLayout implements uc80 {
    public static final int $stable = 8;

    @Deprecated
    public static final float ANCHORED_SLIDE_OFFSET = 0.0f;
    private static final f7y0 Companion = new f7y0();

    @Deprecated
    public static final float ERROR_STATE_FEED_HEIGHT_RATIO = 0.1f;

    @Deprecated
    public static final float EXPANDED_SLIDE_OFFSET = 1.0f;

    @Deprecated
    public static final int FAB_AND_COMPACT_OFFSET = 15;

    /* renamed from: backNavigationButton$delegate, reason: from kotlin metadata */
    private final i3y backNavigationButton;
    private final l7y0 binding;
    private float blackBackgroundAlpha;
    private final AnchorBottomSheetBehavior<LinearLayout> bottomSheetBehavior;

    /* renamed from: compactCardDelegate$delegate, reason: from kotlin metadata */
    private final i3y compactCardDelegate;

    /* renamed from: compactOrderView$delegate, reason: from kotlin metadata */
    private final i3y compactOrderView;
    private int compactOrderViewHorizontalMarginPx;

    /* renamed from: containerDelegate$delegate, reason: from kotlin metadata */
    private final i3y containerDelegate;
    private float currentSlideOffset;
    private TaxiOrderTrackingViewDelegate$Type currentViewType;

    /* renamed from: dp48$delegate, reason: from kotlin metadata */
    private final i3y dp48;
    private int errorHeaderHeightPx;
    private TaxiOrderFeedView feedView;

    /* renamed from: handlerView$delegate, reason: from kotlin metadata */
    private final i3y handlerView;
    private boolean isNavigationBarHeightSet;
    private final a3y0 logger;
    private final hbp0 mainScope;
    private int navigationBarHeight;
    private int nonErrorHeaderHeightPx;
    private RotatableFloatButton panoramaButton;
    private final i presenter;
    private final TaxiOrderTrackingRecenterButton recenterButton;
    private final y4k0 ridaAppDelegate;
    private final gok0 rideCardTaxiPanoramaEntryPointInteractor;
    private final g6y0 sessionTimelineTracker;
    private final ru.yandex.taxi.design.utils.b shadowBgRepository;
    private final c2x0 systemBarsCoordinator;
    private float targetAnchorRatio;
    private ssx0 tariffSuggestView;
    private final tsx0 tariffSuggestsViewFactory;
    private final g1y0 taxiOrderFeedViewAssistedFactory;
    private TaxiOrderMultimodalRoutesView taxiOrderMultimodalRoutesView;
    private final s3y0 taxiOrderMultimodalRoutesViewProvider;
    private final pwy0 themeSwitcherProvider;
    private ImageView topDecorationView;
    private int topInset;

    public TaxiOrderTrackingView(Context context, v6y0 v6y0Var, c2x0 c2x0Var, TaxiOrderTrackingRecenterButton taxiOrderTrackingRecenterButton, i iVar, tsx0 tsx0Var, g1y0 g1y0Var, g6y0 g6y0Var, gok0 gok0Var, pwy0 pwy0Var, ru.yandex.taxi.design.utils.b bVar, s3y0 s3y0Var, y4k0 y4k0Var) {
        super(context);
        this.systemBarsCoordinator = c2x0Var;
        this.recenterButton = taxiOrderTrackingRecenterButton;
        this.presenter = iVar;
        this.tariffSuggestsViewFactory = tsx0Var;
        this.taxiOrderFeedViewAssistedFactory = g1y0Var;
        this.sessionTimelineTracker = g6y0Var;
        this.rideCardTaxiPanoramaEntryPointInteractor = gok0Var;
        this.themeSwitcherProvider = pwy0Var;
        this.shadowBgRepository = bVar;
        this.taxiOrderMultimodalRoutesViewProvider = s3y0Var;
        this.ridaAppDelegate = y4k0Var;
        this.logger = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "TaxiOrderTrackingView");
        this.mainScope = new hbp0(new czo0(14), "TaxiOrderTrackingView", null);
        final int i = 0;
        sls slsVar = new sls(this) { // from class: e7y0
            public final /* synthetic */ TaxiOrderTrackingView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int dp48_delegate$lambda$0;
                j compactCardDelegate_delegate$lambda$0;
                k7y0 containerDelegate_delegate$lambda$0;
                int i2 = i;
                TaxiOrderTrackingView taxiOrderTrackingView = this.b;
                switch (i2) {
                    case 0:
                        dp48_delegate$lambda$0 = TaxiOrderTrackingView.dp48_delegate$lambda$0(taxiOrderTrackingView);
                        return Integer.valueOf(dp48_delegate$lambda$0);
                    case 1:
                        compactCardDelegate_delegate$lambda$0 = TaxiOrderTrackingView.compactCardDelegate_delegate$lambda$0(taxiOrderTrackingView);
                        return compactCardDelegate_delegate$lambda$0;
                    default:
                        containerDelegate_delegate$lambda$0 = TaxiOrderTrackingView.containerDelegate_delegate$lambda$0(taxiOrderTrackingView);
                        return containerDelegate_delegate$lambda$0;
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.dp48 = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        this.targetAnchorRatio = 0.5f;
        LayoutInflater.from(context).inflate(zkh0.taxi_order_tracking_view, this);
        int i2 = p8h0.bottom_container;
        GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i2, this);
        if (goFrameLayout != null) {
            i2 = p8h0.bottom_end_side_fab_container;
            FrameLayout frameLayout = (FrameLayout) cma1.O(i2, this);
            if (frameLayout != null) {
                i2 = p8h0.bottom_start_side_fab_container;
                FrameLayout frameLayout2 = (FrameLayout) cma1.O(i2, this);
                if (frameLayout2 != null) {
                    i2 = p8h0.footer_container;
                    FrameLayout frameLayout3 = (FrameLayout) cma1.O(i2, this);
                    if (frameLayout3 != null) {
                        i2 = p8h0.top_container;
                        LinearLayout linearLayout = (LinearLayout) cma1.O(i2, this);
                        if (linearLayout != null) {
                            i2 = p8h0.top_decoration_stub;
                            ViewStub viewStub = (ViewStub) cma1.O(i2, this);
                            if (viewStub != null) {
                                i2 = p8h0.top_end_side_fab_container;
                                FloatButtonHolderLayout floatButtonHolderLayout = (FloatButtonHolderLayout) cma1.O(i2, this);
                                if (floatButtonHolderLayout != null) {
                                    i2 = p8h0.top_start_side_fab_container;
                                    LinearLayout linearLayout2 = (LinearLayout) cma1.O(i2, this);
                                    if (linearLayout2 != null) {
                                        this.binding = new l7y0(this, goFrameLayout, frameLayout, frameLayout2, frameLayout3, linearLayout, viewStub, floatButtonHolderLayout, linearLayout2);
                                        final int i3 = 1;
                                        this.compactOrderView = kotlin.a.b(lazyThreadSafetyMode, new i5y0(i3, v6y0Var, this));
                                        this.handlerView = kotlin.a.b(lazyThreadSafetyMode, new kok0(context, 13));
                                        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                                        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
                                            ny61.g("The view is not a child of CoordinatorLayout");
                                            throw null;
                                        }
                                        CoordinatorLayout.a behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                                        if (!(behavior instanceof AnchorBottomSheetBehavior)) {
                                            ny61.g("The view is not associated with AnchorBottomSheetBehavior");
                                            throw null;
                                        }
                                        AnchorBottomSheetBehavior<LinearLayout> anchorBottomSheetBehavior = (AnchorBottomSheetBehavior) behavior;
                                        anchorBottomSheetBehavior.O(4);
                                        anchorBottomSheetBehavior.C = false;
                                        anchorBottomSheetBehavior.Z = false;
                                        anchorBottomSheetBehavior.g0 = true;
                                        anchorBottomSheetBehavior.c0 = true;
                                        anchorBottomSheetBehavior.d0 = true;
                                        anchorBottomSheetBehavior.J(true);
                                        anchorBottomSheetBehavior.N = new j7y0(this);
                                        anchorBottomSheetBehavior.M(0, false);
                                        this.bottomSheetBehavior = anchorBottomSheetBehavior;
                                        final int i4 = 2;
                                        this.backNavigationButton = kotlin.a.b(lazyThreadSafetyMode, new i5y0(i4, context, this));
                                        this.compactCardDelegate = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: e7y0
                                            public final /* synthetic */ TaxiOrderTrackingView b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // defpackage.sls
                                            public final Object invoke() {
                                                int dp48_delegate$lambda$0;
                                                j compactCardDelegate_delegate$lambda$0;
                                                k7y0 containerDelegate_delegate$lambda$0;
                                                int i22 = i3;
                                                TaxiOrderTrackingView taxiOrderTrackingView = this.b;
                                                switch (i22) {
                                                    case 0:
                                                        dp48_delegate$lambda$0 = TaxiOrderTrackingView.dp48_delegate$lambda$0(taxiOrderTrackingView);
                                                        return Integer.valueOf(dp48_delegate$lambda$0);
                                                    case 1:
                                                        compactCardDelegate_delegate$lambda$0 = TaxiOrderTrackingView.compactCardDelegate_delegate$lambda$0(taxiOrderTrackingView);
                                                        return compactCardDelegate_delegate$lambda$0;
                                                    default:
                                                        containerDelegate_delegate$lambda$0 = TaxiOrderTrackingView.containerDelegate_delegate$lambda$0(taxiOrderTrackingView);
                                                        return containerDelegate_delegate$lambda$0;
                                                }
                                            }
                                        });
                                        this.containerDelegate = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: e7y0
                                            public final /* synthetic */ TaxiOrderTrackingView b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // defpackage.sls
                                            public final Object invoke() {
                                                int dp48_delegate$lambda$0;
                                                j compactCardDelegate_delegate$lambda$0;
                                                k7y0 containerDelegate_delegate$lambda$0;
                                                int i22 = i4;
                                                TaxiOrderTrackingView taxiOrderTrackingView = this.b;
                                                switch (i22) {
                                                    case 0:
                                                        dp48_delegate$lambda$0 = TaxiOrderTrackingView.dp48_delegate$lambda$0(taxiOrderTrackingView);
                                                        return Integer.valueOf(dp48_delegate$lambda$0);
                                                    case 1:
                                                        compactCardDelegate_delegate$lambda$0 = TaxiOrderTrackingView.compactCardDelegate_delegate$lambda$0(taxiOrderTrackingView);
                                                        return compactCardDelegate_delegate$lambda$0;
                                                    default:
                                                        containerDelegate_delegate$lambda$0 = TaxiOrderTrackingView.containerDelegate_delegate$lambda$0(taxiOrderTrackingView);
                                                        return containerDelegate_delegate$lambda$0;
                                                }
                                            }
                                        });
                                        this.currentViewType = TaxiOrderTrackingViewDelegate$Type.EMPTY;
                                        goFrameLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(tje.r(usg0.taxi_order_tracking_bottom_container_corners_radius, getContext())));
                                        goFrameLayout.setClipToOutline(true);
                                        tje.i(this, 119, new s5w0(22, this));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(TaxiOrderTrackingView taxiOrderTrackingView, t1w t1wVar) {
        taxiOrderTrackingView.navigationBarHeight = t1wVar.d;
        taxiOrderTrackingView.isNavigationBarHeightSet = true;
        int i = t1wVar.b;
        taxiOrderTrackingView.topInset = i;
        taxiOrderTrackingView.bottomSheetBehavior.K(i, true);
        FrameLayout frameLayout = taxiOrderTrackingView.binding.d;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), taxiOrderTrackingView.navigationBarHeight);
        FrameLayout frameLayout2 = taxiOrderTrackingView.binding.c;
        frameLayout2.setPadding(frameLayout2.getPaddingLeft(), frameLayout2.getPaddingTop(), frameLayout2.getPaddingRight(), taxiOrderTrackingView.navigationBarHeight);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaxiOrderTrackingBackButton backNavigationButton_delegate$lambda$0(Context context, TaxiOrderTrackingView taxiOrderTrackingView) {
        TaxiOrderTrackingBackButton taxiOrderTrackingBackButton = new TaxiOrderTrackingBackButton(context);
        taxiOrderTrackingBackButton.setDebounceClickListener(new y7x0(14, taxiOrderTrackingView, taxiOrderTrackingBackButton));
        return taxiOrderTrackingBackButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void backNavigationButton_delegate$lambda$0$0$0(TaxiOrderTrackingView taxiOrderTrackingView, TaxiOrderTrackingBackButton taxiOrderTrackingBackButton) {
        i iVar = taxiOrderTrackingView.presenter;
        w0y0 w0y0Var = iVar.E;
        w0y0.b(w0y0Var, w0y0Var.a, "SuperappOrderDetails.BackButton.Tapped", TaxiOrderFeedAnalytics$Source.FEED_ORDER_DETAILS, null, 12);
        o2y0 o2y0Var = (o2y0) iVar.z.q.getValue();
        if (o2y0Var != null) {
            iVar.L.a(o2y0Var.b().a, kpa1.g(o2y0Var.c()), TaxiOrderAnalytics$RideCardPresentation.Compact, "order_card", "close", null);
        }
        Activity p = ru.yandex.taxi.design.utils.c.p(taxiOrderTrackingBackButton);
        if (p != null) {
            p.onBackPressed();
        }
    }

    private final void clearBottomContainer() {
        int i = i7y0.a[this.currentViewType.ordinal()];
        if (i == 1) {
            clearMultimodalRoutes();
            return;
        }
        if (i == 2) {
            clearFeed();
            return;
        }
        if (i == 3) {
            clearTariffSelection();
        } else if (i == 4) {
            this.binding.b.removeAllViews();
        } else {
            w511.b();
        }
    }

    private final void clearFeed() {
        this.feedView = null;
        this.binding.b.removeAllViews();
        this.binding.d.removeAllViews();
        this.binding.c.removeAllViews();
    }

    private final void clearMultimodalRoutes() {
        TaxiOrderMultimodalRoutesView taxiOrderMultimodalRoutesView = this.taxiOrderMultimodalRoutesView;
        if (taxiOrderMultimodalRoutesView != null) {
            taxiOrderMultimodalRoutesView.removeAllViews();
        }
        this.taxiOrderMultimodalRoutesView = null;
        this.binding.b.removeAllViews();
        this.binding.d.removeAllViews();
        this.binding.c.removeAllViews();
    }

    private final void clearTariffSelection() {
        this.tariffSuggestView = null;
        this.binding.b.removeAllViews();
        this.binding.e.removeAllViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j compactCardDelegate_delegate$lambda$0(TaxiOrderTrackingView taxiOrderTrackingView) {
        return new j(taxiOrderTrackingView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View compactOrderView_delegate$lambda$0(v6y0 v6y0Var, TaxiOrderTrackingView taxiOrderTrackingView) {
        u6y0 compactCardDelegate = taxiOrderTrackingView.getCompactCardDelegate();
        z4m0 z4m0Var = v6y0Var.a.a;
        return new TaxiOrderTrackingCompactViewProxyContainer((Context) ((xvf0) z4m0Var.b).get(), i5m.a((xvf0) z4m0Var.c), compactCardDelegate, i5m.a((xvf0) z4m0Var.w), (p2y0) ((xvf0) z4m0Var.x).get(), (m) ((xvf0) z4m0Var.y).get(), (eck0) ((zni0) z4m0Var.z).get(), (tt2) ((xvf0) z4m0Var.A).get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k7y0 containerDelegate_delegate$lambda$0(TaxiOrderTrackingView taxiOrderTrackingView) {
        return new k7y0(taxiOrderTrackingView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dp48_delegate$lambda$0(TaxiOrderTrackingView taxiOrderTrackingView) {
        return ru.yandex.taxi.design.utils.c.h(48, taxiOrderTrackingView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TaxiOrderTrackingBackButton getBackNavigationButton() {
        return (TaxiOrderTrackingBackButton) this.backNavigationButton.getValue();
    }

    private final u6y0 getCompactCardDelegate() {
        return (u6y0) this.compactCardDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getCompactOrderView() {
        return (View) this.compactOrderView.getValue();
    }

    private final m7y0 getContainerDelegate() {
        return (m7y0) this.containerDelegate.getValue();
    }

    private final int getDp48() {
        return ((Number) this.dp48.getValue()).intValue();
    }

    private final HandlerStickyView getHandlerView() {
        return (HandlerStickyView) this.handlerView.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float getProperSlideOffset(View nestedScrollingChild) {
        boolean z;
        float f;
        Pair pair;
        GoFrameLayout goFrameLayout;
        l7y0 l7y0Var = this.binding;
        int indexOfChild = l7y0Var.f.indexOfChild(l7y0Var.b);
        if (nestedScrollingChild != null && nestedScrollingChild != (goFrameLayout = this.binding.b)) {
            for (ViewParent parent = nestedScrollingChild.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == goFrameLayout) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z2 = indexOfChild != -1 && z;
        AnchorBottomSheetBehavior<LinearLayout> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        float w = anchorBottomSheetBehavior.w(anchorBottomSheetBehavior.x) - this.topInset;
        float top = this.binding.f.getTop() - this.topInset;
        float top2 = this.binding.b.getTop();
        if (z2) {
            ViewGroup.LayoutParams layoutParams = this.binding.b.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            float f2 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
            float f3 = w + f2;
            for (int i = 0; i < indexOfChild; i++) {
                View childAt = this.binding.f.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    if (childAt instanceof keu0) {
                        keu0 keu0Var = (keu0) childAt;
                        pair = new Pair(Integer.valueOf(keu0Var.getHeight(1.0f)), Integer.valueOf(keu0Var.getHeight(0.0f)));
                    } else {
                        pair = new Pair(Integer.valueOf(childAt.getHeight()), Integer.valueOf(childAt.getHeight()));
                    }
                    float intValue = f2 + ((Number) pair.getFirst()).intValue();
                    float intValue2 = f3 + ((Number) pair.getSecond()).intValue();
                    ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams2 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    int i2 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
                    ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                    if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams3 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    float f4 = i2 + (marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0);
                    f2 = intValue + f4;
                    f3 = intValue2 + f4;
                }
            }
            View compactOrderView = getCompactOrderView();
            ViewGroup.LayoutParams layoutParams4 = compactOrderView.getLayoutParams();
            if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams4 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
            int i3 = marginLayoutParams4 != null ? marginLayoutParams4.topMargin : 0;
            ViewGroup.LayoutParams layoutParams5 = compactOrderView.getLayoutParams();
            f = toRangeInverted(top2 + top + ((i3 + (((ViewGroup.MarginLayoutParams) (layoutParams5 instanceof ViewGroup.MarginLayoutParams ? layoutParams5 : null)) != null ? r8.bottomMargin : 0)) - 15), f2, f3);
        } else {
            f = (w - top) / w;
        }
        return y6i0.c(f, 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandlerStickyView handlerView_delegate$lambda$0(Context context) {
        return new HandlerStickyView(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideContainer() {
        clearBottomContainer();
        setCanDrag(false);
        forceCollapse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBottomSheetStateChanged(int state, boolean movedByUser) {
        if (this.bottomSheetBehavior.D(state)) {
            i iVar = this.presenter;
            iVar.getClass();
            qv10.B((state == 3 || state == 7) ? false : true, iVar.z.a, null);
            TaxiOrderFeedView taxiOrderFeedView = this.feedView;
            if (taxiOrderFeedView != null) {
                taxiOrderFeedView.bottomSheetStateChanged(state, movedByUser);
            }
            TaxiOrderMultimodalRoutesView taxiOrderMultimodalRoutesView = this.taxiOrderMultimodalRoutesView;
            if (taxiOrderMultimodalRoutesView != null) {
                taxiOrderMultimodalRoutesView.bottomSheetStateChanged(state);
            }
            ssx0 ssx0Var = this.tariffSuggestView;
            if (ssx0Var != null) {
                ssx0Var.bottomSheetStateChanged(state, movedByUser, this.bottomSheetBehavior.u());
            }
            if (state == 3 || state == 7) {
                ((d2x0) this.systemBarsCoordinator).a(0, qoi0.a(TaxiOrderTrackingView.class), false);
            } else {
                ((d2x0) this.systemBarsCoordinator).e(0, qoi0.a(TaxiOrderTrackingView.class));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSlideOffsetChanged(float slideOffset, boolean settlingNewOffsets, View nestedScrollingChild) {
        AnchorBottomSheetBehavior<LinearLayout> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        int w = anchorBottomSheetBehavior.w(anchorBottomSheetBehavior.x) - this.topInset;
        int top = this.binding.f.getTop() - this.topInset;
        float f = 0.0f;
        float properSlideOffset = w > top ? getProperSlideOffset(nestedScrollingChild) : 0.0f;
        f0 f0Var = this.presenter.z;
        Iterator it = f0Var.k.iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(Float.valueOf(properSlideOffset));
        }
        f0Var.i.g(Float.valueOf(properSlideOffset));
        qv10.B(properSlideOffset < 0.01f, f0Var.a, null);
        getBackNavigationButton().setSlideOffset(properSlideOffset);
        this.currentSlideOffset = properSlideOffset;
        getHandlerView().onSlide(slideOffset);
        updateTopEndFloatButtonVisibility();
        if (w > top && !settlingNewOffsets) {
            f = properSlideOffset;
        }
        this.blackBackgroundAlpha = f;
        ImageView imageView = this.topDecorationView;
        if (imageView != null) {
            imageView.setAlpha(1.0f - f);
        }
        this.binding.a.setBackgroundColor(lhc.f(ModalContentViewContainer.BASE_SHADOW_COLOR, Math.abs((int) (255.0f * this.blackBackgroundAlpha)) & 255));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderTopDecoration(mpk0 uiState) {
        ImageView imageView = this.topDecorationView;
        if (uiState == null) {
            if (imageView != null) {
                ru.yandex.taxi.design.utils.c.w(imageView, this.binding.g);
            }
            this.topDecorationView = null;
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setPaddingRelative(tje.r(wug0.ride_card_top_decoration_start_padding, imageView2.getContext()), imageView2.getPaddingTop(), imageView2.getPaddingEnd(), imageView2.getPaddingBottom());
            imageView2.setTranslationY(tje.u(20, imageView2.getContext()));
            imageView2.setAlpha(1.0f - this.blackBackgroundAlpha);
            this.topDecorationView = imageView2;
            this.binding.g.bringToFront();
            ru.yandex.taxi.design.utils.c.w(this.binding.g, imageView2);
        }
        ImageView imageView3 = this.topDecorationView;
        if (imageView3 != null) {
            imageView3.setImageDrawable(uiState.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBehaviourState(int state) {
        this.bottomSheetBehavior.O(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCanDrag(boolean canDrag) {
        this.bottomSheetBehavior.a0 = canDrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFeed() {
        clearBottomContainer();
        g1y0 g1y0Var = this.taxiOrderFeedViewAssistedFactory;
        m7y0 containerDelegate = getContainerDelegate();
        hwo0 hwo0Var = ((h1y0) g1y0Var).a;
        TaxiOrderFeedView taxiOrderFeedView = new TaxiOrderFeedView((Context) ((xvf0) hwo0Var.b).get(), (brq) ((xvf0) hwo0Var.c).get(), (a1y0) ((z6x0) hwo0Var.w).get(), (w0y0) ((rbx0) hwo0Var.x).get(), containerDelegate);
        this.feedView = taxiOrderFeedView;
        this.binding.b.addView(taxiOrderFeedView);
        updateAnchoredHeight(this.targetAnchorRatio);
        updateCollapsedHeightRatio();
        updateNestedScrollingChild(false);
        this.bottomSheetBehavior.W = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMultimodal() {
        clearBottomContainer();
        s3y0 s3y0Var = this.taxiOrderMultimodalRoutesViewProvider;
        m7y0 containerDelegate = getContainerDelegate();
        vx0 vx0Var = ((t3y0) s3y0Var).a;
        TaxiOrderMultimodalRoutesView taxiOrderMultimodalRoutesView = new TaxiOrderMultimodalRoutesView((Context) vx0Var.a.get(), (x711) vx0Var.b.get(), (f0) vx0Var.c.get(), containerDelegate);
        this.taxiOrderMultimodalRoutesView = taxiOrderMultimodalRoutesView;
        this.binding.b.addView(taxiOrderMultimodalRoutesView);
        updateAnchoredHeight(this.targetAnchorRatio);
        updateCollapsedHeightRatio();
        updateNestedScrollingChild(false);
        this.bottomSheetBehavior.W = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTariffsSuggest() {
        clearBottomContainer();
        OrderWithTariffSuggestView orderWithTariffSuggestView = (OrderWithTariffSuggestView) ((mb80) this.tariffSuggestsViewFactory).a.get();
        this.tariffSuggestView = orderWithTariffSuggestView;
        orderWithTariffSuggestView.setDelegate(getContainerDelegate());
        this.binding.d.removeAllViews();
        this.binding.c.removeAllViews();
        GoFrameLayout goFrameLayout = this.binding.b;
        ssx0 ssx0Var = this.tariffSuggestView;
        goFrameLayout.addView(ssx0Var != null ? ssx0Var.asView() : null);
        updateAnchoredHeight(this.targetAnchorRatio);
        AnchorBottomSheetBehavior<LinearLayout> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        anchorBottomSheetBehavior.M(this.binding.e.getHeight() + anchorBottomSheetBehavior.w(anchorBottomSheetBehavior.x), true);
        this.bottomSheetBehavior.W = false;
        updateNestedScrollingChild(false);
    }

    private final float toRangeInverted(float f, float f2, float f3) {
        return 1.0f - ((f - f2) / (f3 - f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAnchoredHeight(float ratio) {
        if (!this.isNavigationBarHeightSet) {
            requestApplyInsets();
        }
        this.targetAnchorRatio = ratio;
        TaxiOrderFeedView taxiOrderFeedView = this.feedView;
        if (taxiOrderFeedView == null || !taxiOrderFeedView.getIsErrorState()) {
            getBackNavigationButton().setSlideOffsetVisibilityEdge(ratio);
            updateTopEndFloatButtonVisibility();
            int height = (this.binding.a.getHeight() - this.topInset) - this.navigationBarHeight;
            this.bottomSheetBehavior.G(height - m810.b(height * ratio), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCollapsedHeightRatio() {
        if (this.errorHeaderHeightPx <= 0 || this.nonErrorHeaderHeightPx <= 0) {
            return;
        }
        if (!this.isNavigationBarHeightSet) {
            requestApplyInsets();
        }
        TaxiOrderFeedView taxiOrderFeedView = this.feedView;
        this.bottomSheetBehavior.M(((taxiOrderFeedView == null || !taxiOrderFeedView.getIsErrorState()) ? this.nonErrorHeaderHeightPx : this.errorHeaderHeightPx) + this.navigationBarHeight, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFeedErrorAnchorHeight() {
        if (!this.isNavigationBarHeightSet) {
            requestApplyInsets();
        }
        int height = this.binding.f.getHeight();
        int height2 = (this.binding.a.getHeight() - this.topInset) - this.navigationBarHeight;
        this.bottomSheetBehavior.G(height + (height2 - m810.b(height2 * 0.1f)), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNestedScrollingChild(boolean isFeedError) {
        l7y0 l7y0Var = this.binding;
        this.bottomSheetBehavior.L(isFeedError ? ru.yandex.taxi.design.utils.c.o(l7y0Var.b) : ru.yandex.taxi.design.utils.c.n(l7y0Var.b));
    }

    private final void updateTopEndFloatButtonVisibility() {
        float f = 1.0f - this.blackBackgroundAlpha;
        this.binding.h.setVisibility(f == 0.0f ? 8 : 0);
        this.binding.h.setAlpha(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.r330
    public void addFloatButton(eor button, int gravity) {
        ViewGroup viewGroup;
        switch (gravity) {
            case 8388659:
                viewGroup = this.binding.i;
                break;
            case 8388661:
                viewGroup = this.binding.h;
                break;
            case 8388691:
                viewGroup = this.binding.d;
                break;
            case 8388693:
                viewGroup = this.binding.c;
                break;
            default:
                viewGroup = null;
                break;
        }
        if (viewGroup == null) {
            a3y0.m(this.logger, "addFloatButton", new IllegalArgumentException("invalid gravity for float button"), null, 4);
        } else {
            viewGroup.addView((View) button);
            requestApplyInsets();
        }
    }

    @Override // defpackage.uc80
    public int anchoredHeight() {
        return ((this.binding.a.getHeight() - this.topInset) - this.binding.f.getTop()) + this.navigationBarHeight;
    }

    @Override // defpackage.uc80
    public View asModalView() {
        return this;
    }

    @Override // defpackage.uc80
    public void forceAnchor() {
        setBehaviourState(6);
    }

    @Override // defpackage.uc80
    public void forceCollapse() {
        setBehaviourState(4);
    }

    @Override // defpackage.uc80
    public boolean interceptOnBackPressed() {
        TaxiOrderFeedView taxiOrderFeedView = this.feedView;
        if (taxiOrderFeedView != null && taxiOrderFeedView.interceptOnBackPressed()) {
            return true;
        }
        if (this.bottomSheetBehavior.E != 3) {
            return false;
        }
        forceAnchor();
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((i6y0) this.sessionTimelineTracker).b(zkb1.a(TaxiOrderSessionCheckpoint.SCREEN_TRACKING_ATTACHED));
        RotatableFloatButton e = eg3.e(this.binding.h, new d82(1 == true ? 1 : 0), "");
        xw31.C(80, e);
        xw31.D(0, e);
        this.panoramaButton = e;
        LinearLayout linearLayout = this.binding.f;
        View compactOrderView = getCompactOrderView();
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -2);
        int r = tje.r(mrg0.go_design_s_space, getContext());
        this.compactOrderViewHorizontalMarginPx = r;
        layoutParams.setMargins(r, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, r, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        linearLayout.addView(compactOrderView, 0, layoutParams);
        this.binding.f.addView(getHandlerView(), 1);
        i iVar = this.presenter;
        h7y0 h7y0Var = new h7y0(this);
        f0 f0Var = iVar.z;
        iVar.Bg(h7y0Var);
        com.yandex.go.order.ui.order_list_modal_height.presentation.a aVar = iVar.y;
        aVar.a(OrderRatioHeightType.ORDER_FEED);
        iVar.P = iVar.D.d() && !iVar.C.a.a().getB();
        int i = 3;
        tje.N(iVar.Jg(), null, null, new TaxiOrderTrackingPresenter$attachView$1(iVar, null), 3);
        kotlinx.coroutines.flow.e.H(iVar.Jg(), new jqr(aVar.g, new TaxiOrderTrackingPresenter$attachView$2(2, h7y0Var, x6y0.class, "anchoredHeightRatioUpdated", "anchoredHeightRatioUpdated(F)V", 4), i));
        kotlinx.coroutines.flow.e.H(iVar.Jg(), new jqr(iVar.x.b(), new TaxiOrderTrackingPresenter$attachView$3(2, h7y0Var, x6y0.class, "updateBadgeText", "updateBadgeText(Ljava/lang/String;)V", 4), i));
        r0 r0Var = f0Var.f;
        r0 r0Var2 = f0Var.q;
        r0 r0Var3 = f0Var.h;
        com.yandex.go.taxi.order.queue.interactor.c cVar = (com.yandex.go.taxi.order.queue.interactor.c) iVar.B;
        cVar.getClass();
        int i2 = 6;
        kotlinx.coroutines.flow.e.H(iVar.Jg(), kotlinx.coroutines.flow.e.m(r0Var, r0Var3, com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(new mth(r0Var2, i2), new QueueAvailabilityInteractorImpl$orderHasQueueFlow$$inlined$flatMapLatest$2(null, cVar))), new QueueAvailabilityInteractorImpl$orderHasQueueFlow$$inlined$start$1(Boolean.FALSE, null)), new w(((pfq0) iVar.H).a.b), new TaxiOrderTrackingPresenter$attachView$4(h7y0Var, iVar, null)));
        tje.N(iVar.Jg(), null, null, new TaxiOrderTrackingPresenter$attachView$$inlined$collectLatestIn$1(kotlinx.coroutines.flow.e.t(new b(kotlinx.coroutines.flow.e.X(new mth(r0Var2, i2), new TaxiOrderTrackingPresenter$attachView$$inlined$flatMapLatest$1(3, null)))), null, iVar), 3);
        this.binding.i.setVisibility(4);
        this.ridaAppDelegate.getClass();
        addFloatButton(getBackNavigationButton(), 8388659);
        View findViewById = this.recenterButton.findViewById(ndh0.frame_to_scale);
        if (findViewById != null) {
            findViewById.getLayoutParams().width = getDp48();
            findViewById.getLayoutParams().height = getDp48();
        }
        FloatButtonHolderLayout.addFloatButton$default(this.binding.h, this.recenterButton, (Integer) null, 2, (Object) null);
        this.binding.h.setupHorizontalPadding();
        updateTopEndFloatButtonVisibility();
        TaxiOrderTrackingBackButton backNavigationButton = getBackNavigationButton();
        backNavigationButton.setTranslationY(backNavigationButton.getTranslationY() + 15.0f);
        FloatButtonHolderLayout floatButtonHolderLayout = this.binding.h;
        floatButtonHolderLayout.setTranslationY(floatButtonHolderLayout.getTranslationY() + 15.0f);
        this.mainScope.a();
        tje.N(this.mainScope, null, null, new TaxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1(this.themeSwitcherProvider.a(), null, this), 3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.mainScope.b();
        this.presenter.Cg();
        this.feedView = null;
        this.tariffSuggestView = null;
        h8 h8Var = new h8(3, this);
        while (h8Var.hasNext()) {
            View view = (View) h8Var.next();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // defpackage.uc80
    public /* bridge */ void pauseShortcuts() {
    }

    public final void reload() {
        this.presenter.N.g(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.r330
    public void removeFloatButton(eor button) {
        View view = (View) button;
        this.binding.i.removeView(view);
        this.binding.h.removeView(view);
        this.binding.d.removeView(view);
        this.binding.c.removeView(view);
    }

    @Override // defpackage.uc80
    public /* bridge */ void resumeShortcuts() {
    }

    @Override // defpackage.uc80
    public void show(int initialState) {
        TaxiOrderFeedView taxiOrderFeedView = this.feedView;
        if (taxiOrderFeedView != null) {
            taxiOrderFeedView.show();
        }
    }

    public /* bridge */ void addFloatButton(eor eorVar, int i, int i2, boolean z) {
    }

    @Override // defpackage.r330
    public /* bridge */ void addFloatButton(eor eorVar, int i, boolean z) {
    }

    public /* bridge */ void addFloatButton(eor eorVar, int i, int i2) {
    }
}
