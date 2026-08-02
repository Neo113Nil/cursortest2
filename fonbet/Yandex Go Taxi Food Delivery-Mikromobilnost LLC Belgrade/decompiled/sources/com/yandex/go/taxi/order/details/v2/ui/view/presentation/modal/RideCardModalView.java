package com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.superapp.order.multi.old.view.OrderStackView;
import com.yandex.go.taxi.order.analytics.TaxiOrderAnalytics$RideCardPresentation;
import com.yandex.go.taxi.order.details.v2.analytics.g;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.RideCardModalView;
import com.yandex.go.taxi.order.map.curtain.floating.button.OrderMapCurtainHideFloatingButtonView;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ars0;
import defpackage.bkk0;
import defpackage.ckk0;
import defpackage.cma1;
import defpackage.d82;
import defpackage.dkk0;
import defpackage.e230;
import defpackage.eg3;
import defpackage.ekk0;
import defpackage.g1a0;
import defpackage.g6y0;
import defpackage.gci0;
import defpackage.gok0;
import defpackage.h3y;
import defpackage.htc;
import defpackage.hxj0;
import defpackage.i3y;
import defpackage.i6y0;
import defpackage.jek0;
import defpackage.jqr;
import defpackage.k030;
import defpackage.kpa1;
import defpackage.kqe0;
import defpackage.kyh0;
import defpackage.lg;
import defpackage.m810;
import defpackage.mdh;
import defpackage.mpk0;
import defpackage.mrg0;
import defpackage.mth;
import defpackage.ndh0;
import defpackage.ng;
import defpackage.nkk0;
import defpackage.ny61;
import defpackage.nz;
import defpackage.o230;
import defpackage.o2y0;
import defpackage.ohk0;
import defpackage.okk0;
import defpackage.p8h0;
import defpackage.qd00;
import defpackage.qje;
import defpackage.rkk0;
import defpackage.rpk0;
import defpackage.sje;
import defpackage.sjh;
import defpackage.t1w;
import defpackage.tfk0;
import defpackage.tje;
import defpackage.tkk0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.u680;
import defpackage.ufk0;
import defpackage.ukk0;
import defpackage.usg0;
import defpackage.uyj;
import defpackage.va80;
import defpackage.vfc0;
import defpackage.vfk0;
import defpackage.w130;
import defpackage.w511;
import defpackage.wa80;
import defpackage.wmk0;
import defpackage.wug0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y4k0;
import defpackage.y641;
import defpackage.ydk0;
import defpackage.ykk0;
import defpackage.yqs0;
import defpackage.z0a0;
import defpackage.zkb1;
import defpackage.zkh0;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.altpins.order.p;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;
import ru.yandex.taxi.order.view.walking_info.WalkingInfoView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.ui.recenter.RecenterButton;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u0000 Ã\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004Ä\u0001Å\u0001B§\u0001\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020*H\u0014¢\u0006\u0004\b-\u0010,J\u000f\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020.H\u0014¢\u0006\u0004\b1\u00100J\u001d\u00105\u001a\u00020*2\f\u00104\u001a\b\u0012\u0004\u0012\u00020302H\u0014¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020.2\u0006\u00108\u001a\u000207H\u0017¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020*2\u0006\u0010<\u001a\u00020;H\u0014¢\u0006\u0004\b=\u0010>J\u001f\u0010B\u001a\u00020*2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020.H\u0014¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020*H\u0014¢\u0006\u0004\bD\u0010,J\u000f\u0010E\u001a\u00020.H\u0014¢\u0006\u0004\bE\u00100J\u000f\u0010F\u001a\u00020?H\u0014¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u00020HH\u0014¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020*2\u0006\u0010<\u001a\u00020;H\u0014¢\u0006\u0004\bK\u0010>J\u001f\u0010P\u001a\u00020\u00022\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010T\u001a\u00020*2\u0006\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020*H\u0014¢\u0006\u0004\bV\u0010,J\r\u0010W\u001a\u00020?¢\u0006\u0004\bW\u0010GJ\r\u0010X\u001a\u00020?¢\u0006\u0004\bX\u0010GJ\u000f\u0010Y\u001a\u00020*H\u0014¢\u0006\u0004\bY\u0010,J\u0019\u0010[\u001a\u00020*2\b\b\u0001\u0010Z\u001a\u00020\u0005H\u0002¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020*2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020*2\u0006\u0010_\u001a\u00020\u0005H\u0002¢\u0006\u0004\b`\u0010\\J\u000f\u0010a\u001a\u00020*H\u0002¢\u0006\u0004\ba\u0010,J\u000f\u0010b\u001a\u00020*H\u0002¢\u0006\u0004\bb\u0010,J\u0017\u0010c\u001a\u00020*2\u0006\u0010_\u001a\u00020\u0005H\u0002¢\u0006\u0004\bc\u0010\\J\u001f\u0010e\u001a\u00020*2\u0006\u0010d\u001a\u00020;2\u0006\u0010_\u001a\u00020?H\u0002¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020*H\u0002¢\u0006\u0004\bg\u0010,J\u0017\u0010h\u001a\u00020*2\u0006\u0010_\u001a\u00020?H\u0002¢\u0006\u0004\bh\u0010^J\u000f\u0010i\u001a\u00020*H\u0002¢\u0006\u0004\bi\u0010,J\u000f\u0010j\u001a\u00020*H\u0002¢\u0006\u0004\bj\u0010,J\u000f\u0010k\u001a\u00020*H\u0002¢\u0006\u0004\bk\u0010,J\u0019\u0010n\u001a\u00020*2\b\u0010m\u001a\u0004\u0018\u00010lH\u0002¢\u0006\u0004\bn\u0010oR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010p\u001a\u0004\bq\u0010rR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010sR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010tR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010uR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010vR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010wR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010xR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010yR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010zR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010{R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010|R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010}R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010~R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u007fR\u001c\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R!\u0010\u0088\u0001\u001a\u00030\u0083\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R!\u0010\u0093\u0001\u001a\u00030\u008f\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0085\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0019\u0010\u009d\u0001\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0019\u0010\u009f\u0001\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009e\u0001R\u0019\u0010 \u0001\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u009e\u0001R\u0018\u0010¢\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u001c\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010§\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010ª\u0001\u001a\u00030©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001f\u0010®\u0001\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b¬\u0001\u0010\u0085\u0001\u001a\u0005\b\u00ad\u0001\u0010GR\u001f\u0010±\u0001\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b¯\u0001\u0010\u0085\u0001\u001a\u0005\b°\u0001\u0010GR\u001f\u0010´\u0001\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b²\u0001\u0010\u0085\u0001\u001a\u0005\b³\u0001\u0010GR\u001f\u0010·\u0001\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bµ\u0001\u0010\u0085\u0001\u001a\u0005\b¶\u0001\u0010GR\u001f\u0010º\u0001\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b¸\u0001\u0010\u0085\u0001\u001a\u0005\b¹\u0001\u0010GR\u001e\u0010»\u0001\u001a\u00020?8\u0015X\u0094\u0004¢\u0006\u000f\n\u0006\b»\u0001\u0010\u009e\u0001\u001a\u0005\b¼\u0001\u0010GR\u0016\u0010¾\u0001\u001a\u00020?8TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b½\u0001\u0010GR\u0016\u0010À\u0001\u001a\u00020?8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010GR\u0016\u0010Â\u0001\u001a\u00020?8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010G¨\u0006Æ\u0001"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/presentation/modal/RideCardModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lekk0;", "Landroid/content/Context;", "context", "Lykk0;", "initialModalViewState", "Ltse;", "mainScope", "Lars0;", "slotItemButtonViewFactory", "Lk030;", "appearAnimationCallback", "Lz0a0;", "paymentIconLoader", "Lukk0;", "presenter", "Lokk0;", "shadowListenerFactory", "Lwa80;", "orderViewTopOffsetCoordinator", "Lcom/yandex/go/taxi/order/details/v2/analytics/g;", "rideCardAnalyticsInteractor", "Lcom/yandex/go/taxi/order/details/v2/analytics/perf/a;", "perfAnalyticsTracer", "Lru/yandex/taxi/ui/recenter/RecenterButton;", "recenterButton", "Lgok0;", "rideCardTaxiPanoramaEntryPointInteractor", "Lh3y;", "Lcom/yandex/go/taxi/order/map/curtain/floating/button/OrderMapCurtainHideFloatingButtonView;", "orderMapCurtainHideFloatingButtonView", "Lydk0;", "communicationAdapterAssistedFactoryInjector", "Lckk0;", "itemsAdapterAssistedFactory", "Lg6y0;", "sessionTimelineTracker", "Ly4k0;", "ridaAppDelegate", "<init>", "(Landroid/content/Context;Lykk0;Ltse;Lars0;Lk030;Lz0a0;Lukk0;Lokk0;Lwa80;Lcom/yandex/go/taxi/order/details/v2/analytics/g;Lcom/yandex/go/taxi/order/details/v2/analytics/perf/a;Lru/yandex/taxi/ui/recenter/RecenterButton;Lgok0;Lh3y;Lydk0;Lckk0;Lg6y0;Ly4k0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "isApplyShadow", "()Z", "isArrowsPermanentlyHidden", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", "bottomSheetBehavior", "setInitialBehaviorState", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "newOffset", "onDialogSlide", "(F)V", "", "newState", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "onSlideOut", "canDragToExpandFromAnchored", "getMaxAnchoredHeight", "()I", "Le230;", "insetsType", "()Le230;", "setBackgroundDimColor", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lekk0;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onBackPressed", "getCardTop", "getBottomSheetState", "dispatchAccessibilityBlockOnExpanded", "initialState", "applyInitialModalViewState", "(Lykk0;)V", "updateScrollState", "(I)V", ClidProvider.STATE, "applyModalViewState", "applyMaxTopOffset", "initTopRightFloatButton", "applyStateRatio", "cardOffset", "handleButtonsContainerVisibility", "(FI)V", "updateAccessibilityButtons", "updateDimColor", "addRecenterButton", "addPanoramaButton", "addMapCurtainHideButton", "Lmpk0;", "uiState", "renderDecorations", "(Lmpk0;)V", "Ltse;", "getMainScope", "()Ltse;", "Lars0;", "Lk030;", "Lz0a0;", "Lukk0;", "Lokk0;", "Lwa80;", "Lcom/yandex/go/taxi/order/details/v2/analytics/g;", "Lcom/yandex/go/taxi/order/details/v2/analytics/perf/a;", "Lru/yandex/taxi/ui/recenter/RecenterButton;", "Lgok0;", "Lh3y;", "Lg6y0;", "Ly4k0;", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "panoramaButton", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "Lbkk0;", "itemsAdapter$delegate", "Li3y;", "getItemsAdapter", "()Lbkk0;", "itemsAdapter", "Lcom/yandex/go/taxi/order/details/v2/ui/view/presentation/modal/d;", "shadowListener", "Lcom/yandex/go/taxi/order/details/v2/ui/view/presentation/modal/d;", "Lyqs0;", "doneButtonView", "Lyqs0;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager$delegate", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "Lru/yandex/taxi/order/view/walking_info/WalkingInfoView;", "walkingInfoView", "Lru/yandex/taxi/order/view/walking_info/WalkingInfoView;", "Landroid/widget/ImageView;", "topDecorationView", "Landroid/widget/ImageView;", "Lt1w;", "insets", "Lt1w;", "targetAnchorHeight", CA20Status.STATUS_USER_I, "maxTopOffset", "appTopOffset", "Lva80;", "topOffsetListener", "Lva80;", "Lng;", "accessibilityButtonsDelegate", "Lng;", "blockOthersAccessibilityOnExpand", "Z", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "touchExplorationStateChangeListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "dp8$delegate", "getDp8", "dp8", "dp12$delegate", "getDp12", "dp12", "dp16$delegate", "getDp16", "dp16", "dp48$delegate", "getDp48", "dp48", "dp56$delegate", "getDp56", "dp56", "slideableBackgroundAttrRes", "getSlideableBackgroundAttrRes", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "getScreenHeight", "screenHeight", "getHeightWithButtonsDelta", "heightWithButtonsDelta", "Companion", "com/yandex/go/taxi/order/details/v2/ui/view/presentation/modal/b", "tkk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardModalView extends SlideableBindingModalView<ekk0> {
    public static final int $stable = 8;
    private static final float BUTTONS_CONTAINER_ANIMATION_THRESHOLD = 0.75f;
    public static final tkk0 Companion = new tkk0();
    public static final float DEFAULT_ANCHOR_RATIO = 0.4f;
    public static final float DEFAULT_COLLAPSED_RATIO = 0.15f;
    private static final int MAP_CURTAIN_HIDE_FLOATING_BUTTON_INDEX = -2;
    private ng accessibilityButtonsDelegate;
    private int appTopOffset;
    private final k030 appearAnimationCallback;
    private boolean blockOthersAccessibilityOnExpand;
    private yqs0 doneButtonView;

    /* renamed from: dp12$delegate, reason: from kotlin metadata */
    private final i3y dp12;

    /* renamed from: dp16$delegate, reason: from kotlin metadata */
    private final i3y dp16;

    /* renamed from: dp48$delegate, reason: from kotlin metadata */
    private final i3y dp48;

    /* renamed from: dp56$delegate, reason: from kotlin metadata */
    private final i3y dp56;

    /* renamed from: dp8$delegate, reason: from kotlin metadata */
    private final i3y dp8;
    private t1w insets;

    /* renamed from: itemsAdapter$delegate, reason: from kotlin metadata */
    private final i3y itemsAdapter;

    /* renamed from: layoutManager$delegate, reason: from kotlin metadata */
    private final i3y layoutManager;
    private final tse mainScope;
    private int maxTopOffset;
    private final h3y orderMapCurtainHideFloatingButtonView;
    private final wa80 orderViewTopOffsetCoordinator;
    private RotatableFloatButton panoramaButton;
    private final z0a0 paymentIconLoader;
    private final com.yandex.go.taxi.order.details.v2.analytics.perf.a perfAnalyticsTracer;
    private final ukk0 presenter;
    private final RecenterButton recenterButton;
    private final y4k0 ridaAppDelegate;
    private final g rideCardAnalyticsInteractor;
    private final gok0 rideCardTaxiPanoramaEntryPointInteractor;
    private final g6y0 sessionTimelineTracker;
    private d shadowListener;
    private final okk0 shadowListenerFactory;
    private final int slideableBackgroundAttrRes;
    private final ars0 slotItemButtonViewFactory;
    private int targetAnchorHeight;
    private ImageView topDecorationView;
    private final va80 topOffsetListener;
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;
    private WalkingInfoView walkingInfoView;

    public RideCardModalView(Context context, ykk0 ykk0Var, tse tseVar, ars0 ars0Var, k030 k030Var, z0a0 z0a0Var, ukk0 ukk0Var, okk0 okk0Var, wa80 wa80Var, g gVar, com.yandex.go.taxi.order.details.v2.analytics.perf.a aVar, RecenterButton recenterButton, gok0 gok0Var, h3y h3yVar, ydk0 ydk0Var, ckk0 ckk0Var, g6y0 g6y0Var, y4k0 y4k0Var) {
        super(context);
        this.mainScope = tseVar;
        this.slotItemButtonViewFactory = ars0Var;
        this.appearAnimationCallback = k030Var;
        this.paymentIconLoader = z0a0Var;
        this.presenter = ukk0Var;
        this.shadowListenerFactory = okk0Var;
        this.orderViewTopOffsetCoordinator = wa80Var;
        this.rideCardAnalyticsInteractor = gVar;
        this.perfAnalyticsTracer = aVar;
        this.recenterButton = recenterButton;
        this.rideCardTaxiPanoramaEntryPointInteractor = gok0Var;
        this.orderMapCurtainHideFloatingButtonView = h3yVar;
        this.sessionTimelineTracker = g6y0Var;
        this.ridaAppDelegate = y4k0Var;
        kqe0 kqe0Var = new kqe0(14, ckk0Var, ydk0Var, this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.itemsAdapter = kotlin.a.b(lazyThreadSafetyMode, kqe0Var);
        this.layoutManager = kotlin.a.b(lazyThreadSafetyMode, new qd00(context, 29));
        this.targetAnchorHeight = (int) (getScreenHeight() * 0.4f);
        this.topOffsetListener = new va80() { // from class: skk0
            @Override // defpackage.va80
            public final void a(int i) {
                RideCardModalView.topOffsetListener$lambda$0(RideCardModalView.this, i);
            }
        };
        int i = 2;
        this.touchExplorationStateChangeListener = new sje(i, this);
        this.dp8 = kotlin.a.b(lazyThreadSafetyMode, new rkk0(this, i));
        this.dp12 = kotlin.a.b(lazyThreadSafetyMode, new rkk0(this, 3));
        this.dp16 = kotlin.a.b(lazyThreadSafetyMode, new rkk0(this, 4));
        this.dp48 = kotlin.a.b(lazyThreadSafetyMode, new rkk0(this, 5));
        this.dp56 = kotlin.a.b(lazyThreadSafetyMode, new rkk0(this, 6));
        setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
        setDismissOnBackPressed(true);
        setDismissOnTouchOutside(false);
        applyInitialModalViewState(ykk0Var);
        this.slideableBackgroundAttrRes = xng0.bgTransparent;
    }

    private final void addMapCurtainHideButton() {
        SlideableModalView.addViewToContainer(getBinding().d, (View) this.orderMapCurtainHideFloatingButtonView.get(), -2);
        ((OrderMapCurtainHideFloatingButtonView) this.orderMapCurtainHideFloatingButtonView.get()).setTranslationY(getDp16());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ((OrderMapCurtainHideFloatingButtonView) this.orderMapCurtainHideFloatingButtonView.get()).getLayoutParams();
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = getDp16();
        ((OrderMapCurtainHideFloatingButtonView) this.orderMapCurtainHideFloatingButtonView.get()).setLayoutParams(layoutParams);
    }

    private final void addPanoramaButton() {
        RotatableFloatButton e = eg3.e(getBinding().f, new d82(1), "");
        xw31.C(80, e);
        xw31.D(0, e);
        this.panoramaButton = e;
    }

    private final void addRecenterButton() {
        View findViewById = this.recenterButton.findViewById(ndh0.frame_to_scale);
        ViewGroup.LayoutParams layoutParams = findViewById != null ? findViewById.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.width = getDp48();
        }
        ViewGroup.LayoutParams layoutParams3 = findViewById != null ? findViewById.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            layoutParams4.height = getDp48();
        }
        FloatButtonHolderLayout.addFloatButton$default(getBinding().f, this.recenterButton, (Integer) null, 2, (Object) null);
    }

    private final void applyInitialModalViewState(ykk0 initialState) {
        Integer num = initialState.a;
        if (num != null) {
            updateDimColor(num.intValue());
        }
    }

    private final void applyMaxTopOffset() {
        t1w t1wVar = this.insets;
        int dp12 = (((t1wVar != null ? t1wVar.b : 0) + this.appTopOffset) + getDp12()) - getBinding().d.getHeight();
        int i = dp12 >= 0 ? dp12 : 0;
        if (this.maxTopOffset == i) {
            return;
        }
        this.maxTopOffset = i;
        View contentView = getContentView();
        ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        setPadding(getPaddingLeft(), this.maxTopOffset, getPaddingRight(), getPaddingBottom());
        contentView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyModalViewState(ykk0 state) {
        getBottomSheetBehavior().a0 = state.b;
        applyMaxTopOffset();
        applyStateRatio(state);
        this.blockOthersAccessibilityOnExpand = state.f;
        Integer num = state.a;
        if (num != null) {
            int intValue = num.intValue();
            if (getBottomSheetBehavior().D(intValue)) {
                setBehaviorState(intValue);
            }
        }
    }

    private final void applyStateRatio(ykk0 state) {
        int screenHeight;
        Float f = state.e;
        int screenHeight2 = (int) (getScreenHeight() * (f != null ? f.floatValue() : 0.15f));
        if (state.c) {
            screenHeight = screenHeight2;
        } else {
            Float f2 = state.d;
            screenHeight = (int) (getScreenHeight() * (f2 != null ? f2.floatValue() : 0.4f));
        }
        this.targetAnchorHeight = screenHeight;
        setBehaviorPeekHeight(screenHeight2 + getHeightWithButtonsDelta());
        setBehaviorAnchorHeight(Integer.valueOf(this.targetAnchorHeight + getHeightWithButtonsDelta()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dp12_delegate$lambda$0(RideCardModalView rideCardModalView) {
        return ru.yandex.taxi.design.utils.c.h(12, rideCardModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dp16_delegate$lambda$0(RideCardModalView rideCardModalView) {
        return ru.yandex.taxi.design.utils.c.d(mrg0.go_design_m_space, rideCardModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dp48_delegate$lambda$0(RideCardModalView rideCardModalView) {
        return ru.yandex.taxi.design.utils.c.h(48, rideCardModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dp56_delegate$lambda$0(RideCardModalView rideCardModalView) {
        return ru.yandex.taxi.design.utils.c.h(56, rideCardModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dp8_delegate$lambda$0(RideCardModalView rideCardModalView) {
        return ru.yandex.taxi.design.utils.c.d(mrg0.go_design_s_space, rideCardModalView);
    }

    private final int getDp12() {
        return ((Number) this.dp12.getValue()).intValue();
    }

    private final int getDp16() {
        return ((Number) this.dp16.getValue()).intValue();
    }

    private final int getDp48() {
        return ((Number) this.dp48.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDp56() {
        return ((Number) this.dp56.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDp8() {
        return ((Number) this.dp8.getValue()).intValue();
    }

    private final int getHeightWithButtonsDelta() {
        return getBinding().e.getTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bkk0 getItemsAdapter() {
        return (bkk0) this.itemsAdapter.getValue();
    }

    private final LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.layoutManager.getValue();
    }

    private final int getScreenHeight() {
        return getHeight();
    }

    private final void handleButtonsContainerVisibility(float cardOffset, int state) {
        boolean z = getBinding().d.getVisibility() == 0;
        boolean z2 = getItemsAdapter().getItemCount() > 0;
        boolean z3 = cardOffset < 0.75f;
        boolean z4 = state == 7;
        if (!z && z3 && z2 && !z4) {
            cma1.P(getBinding().d).f(null);
            cma1.P(getBinding().f).f(null);
        } else if (z) {
            if (!z3 || z4) {
                cma1.P(getBinding().d).e(null);
                cma1.P(getBinding().f).e(null);
            }
        }
    }

    private final void initTopRightFloatButton() {
        addRecenterButton();
        addMapCurtainHideButton();
        addPanoramaButton();
        getBinding().f.setupHorizontalPadding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(RideCardModalView rideCardModalView, t1w t1wVar) {
        rideCardModalView.insets = t1wVar;
        rideCardModalView.applyMaxTopOffset();
        GoConstraintLayout goConstraintLayout = rideCardModalView.getBinding().e;
        goConstraintLayout.setPadding(goConstraintLayout.getPaddingLeft(), goConstraintLayout.getPaddingTop(), goConstraintLayout.getPaddingRight(), t1wVar.g);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bkk0 itemsAdapter_delegate$lambda$0(ckk0 ckk0Var, ydk0 ydk0Var, RideCardModalView rideCardModalView) {
        htc htcVar = ydk0Var.a;
        ukk0 ukk0Var = rideCardModalView.presenter;
        return ((dkk0) ckk0Var).a(htcVar, new c(ukk0Var), new jek0(ukk0Var, 1), RideCardPresentationType.DETAILS, new vfc0(18, rideCardModalView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void itemsAdapter_delegate$lambda$0$0(RideCardModalView rideCardModalView, long j, vfk0 vfk0Var) {
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
        ((i6y0) rideCardModalView.sessionTimelineTracker).b(new wmk0(taxiOrderSessionCheckpoint, m810.c(j / 1000000.0d), RideCardPresentationType.DETAILS, vfk0Var, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayoutManager layoutManager_delegate$lambda$0(Context context) {
        return new LinearLayoutManager(context, 1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1$0(RideCardModalView rideCardModalView) {
        g gVar = rideCardModalView.rideCardAnalyticsInteractor;
        RideCardPresentationType rideCardPresentationType = RideCardPresentationType.DETAILS;
        o2y0 o2y0Var = gVar.a;
        TaxiOrderAnalytics$RideCardPresentation f = kpa1.f(rideCardPresentationType);
        if (f != null) {
            gVar.f.a(o2y0Var.b().a, kpa1.g(o2y0Var.c()), f, "order_card", "back", null);
        }
        rideCardModalView.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$2(RideCardModalView rideCardModalView) {
        if (rideCardModalView.getBottomSheetState() == 3) {
            rideCardModalView.anchor();
            rideCardModalView.getBinding().i.scrollTo(0, 0);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$3(RideCardModalView rideCardModalView) {
        rideCardModalView.expand();
        rideCardModalView.getBinding().i.scrollTo(0, 0);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderDecorations(mpk0 uiState) {
        ImageView imageView = this.topDecorationView;
        if (uiState == null) {
            if (imageView != null) {
                cma1.L(imageView);
                return;
            }
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setTranslationY(getDp16());
            imageView2.setPaddingRelative(tje.r(wug0.ride_card_top_decoration_start_padding, imageView2.getContext()), imageView2.getPaddingTop(), imageView2.getPaddingEnd(), imageView2.getPaddingBottom());
            this.topDecorationView = imageView2;
            ru.yandex.taxi.design.utils.c.w(getBinding().j, imageView2);
        }
        ImageView imageView3 = this.topDecorationView;
        if (imageView3 != null) {
            imageView3.setImageDrawable(uiState.a);
        }
        ImageView imageView4 = this.topDecorationView;
        if (imageView4 != null) {
            cma1.J(imageView4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void topOffsetListener$lambda$0(RideCardModalView rideCardModalView, int i) {
        rideCardModalView.appTopOffset = i;
        rideCardModalView.applyMaxTopOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAccessibilityButtons() {
        ng ngVar = this.accessibilityButtonsDelegate;
        if (ngVar == null) {
            return;
        }
        if (!tje.L(getContext())) {
            ngVar.a();
            ngVar.b();
            return;
        }
        int behaviourFinalState = behaviourFinalState();
        if (behaviourFinalState != 3) {
            if (behaviourFinalState == 4 || behaviourFinalState == 6) {
                ngVar.a();
                ngVar.d();
                return;
            } else if (behaviourFinalState != 7) {
                ngVar.a();
                ngVar.b();
                return;
            }
        }
        ngVar.c(false);
        ngVar.b();
    }

    private final void updateDimColor(int state) {
        if (state == 7) {
            setBackgroundDimColor(1.0f);
        }
    }

    private final void updateScrollState(int newState) {
        int H1;
        if (!getBottomSheetBehavior().D(newState) || (H1 = getLayoutManager().H1()) == -1 || H1 == 0) {
            return;
        }
        getBinding().i.scrollToPosition(0);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        tje.N(this.mainScope, null, null, new RideCardModalView$applyTheme$1(this, null), 3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ekk0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.ride_card_layout, parent, false);
        parent.addView(inflate);
        int i = p8h0.badge_stub;
        ViewStub viewStub = (ViewStub) cma1.O(i, inflate);
        if (viewStub != null) {
            i = p8h0.button_done_container;
            if (((GoFrameLayout) cma1.O(i, inflate)) != null) {
                i = p8h0.button_done_stub;
                ViewStub viewStub2 = (ViewStub) cma1.O(i, inflate);
                if (viewStub2 != null) {
                    i = p8h0.button_footer;
                    GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
                    if (goFrameLayout != null) {
                        i = p8h0.buttons_container;
                        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                        if (frameLayout != null) {
                            i = p8h0.content_container;
                            GoConstraintLayout goConstraintLayout = (GoConstraintLayout) cma1.O(i, inflate);
                            if (goConstraintLayout != null) {
                                i = p8h0.float_right_button_holder;
                                FloatButtonHolderLayout floatButtonHolderLayout = (FloatButtonHolderLayout) cma1.O(i, inflate);
                                if (floatButtonHolderLayout != null) {
                                    i = p8h0.footer_shadow;
                                    GoView goView = (GoView) cma1.O(i, inflate);
                                    if (goView != null) {
                                        i = p8h0.ic_close;
                                        BackButtonIconComponent backButtonIconComponent = (BackButtonIconComponent) cma1.O(i, inflate);
                                        if (backButtonIconComponent != null) {
                                            GoLinearLayout goLinearLayout = (GoLinearLayout) inflate;
                                            i = p8h0.rv_items;
                                            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                                            if (recyclerView != null) {
                                                i = p8h0.top_card_container;
                                                if (((FrameLayout) cma1.O(i, inflate)) != null) {
                                                    i = p8h0.top_decoration_stub;
                                                    ViewStub viewStub3 = (ViewStub) cma1.O(i, inflate);
                                                    if (viewStub3 != null) {
                                                        i = p8h0.upsell_stub;
                                                        if (((ViewStub) cma1.O(i, inflate)) != null) {
                                                            i = p8h0.walking_info_stub;
                                                            ViewStub viewStub4 = (ViewStub) cma1.O(i, inflate);
                                                            if (viewStub4 != null) {
                                                                return new ekk0(goLinearLayout, viewStub, viewStub2, goFrameLayout, frameLayout, goConstraintLayout, floatButtonHolderLayout, goView, backButtonIconComponent, recyclerView, viewStub3, viewStub4);
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
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return getBottomSheetBehavior().u();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void dispatchAccessibilityBlockOnExpanded() {
        if (this.blockOthersAccessibilityOnExpand) {
            super.dispatchAccessibilityBlockOnExpanded();
        }
    }

    public final int getBottomSheetState() {
        return getBottomSheetBehavior().E;
    }

    public final int getCardTop() {
        return getBottomSheet().getTop();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.r(usg0.round_section_radius, getContext());
    }

    public final tse getMainScope() {
        return this.mainScope;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getMaxAnchoredHeight() {
        return this.targetAnchorHeight + getHeightWithButtonsDelta();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getSlideableBackgroundAttrRes() {
        return this.slideableBackgroundAttrRes;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new ohk0(2, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getRouteSummaryIsVisible() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.perfAnalyticsTracer.g();
        ((i6y0) this.sessionTimelineTracker).b(zkb1.a(TaxiOrderSessionCheckpoint.SCREEN_DETAILS_ATTACHED));
        RecyclerView recyclerView = getBinding().i;
        recyclerView.setLayoutManager(getLayoutManager());
        recyclerView.setAdapter(getItemsAdapter());
        int i = 0;
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setItemAnimator(null);
        d dVar = this.shadowListener;
        if (dVar != null) {
            getBinding().i.addOnScrollListener(dVar);
        }
        d dVar2 = this.shadowListener;
        if (dVar2 != null) {
            dVar2.b();
        }
        ukk0 ukk0Var = this.presenter;
        b bVar = new b(this);
        ukk0Var.Bg(bVar);
        g gVar = ukk0Var.J;
        OrderScreen orderScreen = OrderScreen.ORDER_DETAILS;
        RideCardPresentationType rideCardPresentationType = RideCardPresentationType.DETAILS;
        gVar.c(orderScreen, rideCardPresentationType);
        tpr a = ukk0Var.x.a(rideCardPresentationType);
        gci0 gci0Var = ukk0Var.D.j;
        k a2 = ukk0Var.E.a(rideCardPresentationType);
        rpk0 rpk0Var = ukk0Var.z;
        tpr t = e.t(e.l(a, gci0Var, a2, ((p) ((y641) rpk0Var.b.get())).f(rpk0Var.a), ukk0Var.C.b(), new RideCardModalViewPresenter$attachView$1(6, ukk0Var, ukk0.class, "mapToModalViewState", "mapToModalViewState(Lcom/yandex/go/taxi/order/details/v2/state/RideCardState;Lcom/yandex/go/taxi/order/details/v2/ui/view/presentation/modal/state/bottom_sheet/RideCardModalViewState;Lcom/yandex/go/taxi/order/details/v2/state/elements/decorations/RideCardTopDecorationUiState;Lru/yandex/taxi/order/view/walking_info/WalkingInfoUiState;Ljava/lang/String;)Lcom/yandex/go/taxi/order/details/v2/ui/view/presentation/modal/state/RideCardModalUiState;", 4)));
        ukk0Var.K.getClass();
        sjh sjhVar = uyj.a;
        int i2 = 3;
        e.H(ukk0Var.Jg(), new jqr(e.F(t, sjhVar), new RideCardModalViewPresenter$attachView$2(2, bVar, nkk0.class, "render", "render(Lcom/yandex/go/taxi/order/details/v2/ui/view/presentation/modal/state/RideCardModalUiState;)V", 4), i2));
        o230 o230Var = ukk0Var.B;
        if (o230Var != null) {
            tje.N(ukk0Var.Jg(), null, null, new RideCardModalViewPresenter$attachView$lambda$0$$inlined$collectLatestIn$1(new mth(ukk0Var.M, 4), null, o230Var), 3);
        }
        tje.N(ukk0Var.Jg(), null, null, new RideCardModalViewPresenter$startModalViewStateSubscriptions$1(ukk0Var, null), 3);
        tje.N(ukk0Var.Jg(), null, null, new RideCardModalViewPresenter$startModalViewStateSubscriptions$2(ukk0Var, null), 3);
        tje.N(ukk0Var.Jg(), null, null, new RideCardModalViewPresenter$startModalViewStateSubscriptions$3(ukk0Var, null), 3);
        tje.N(ukk0Var.Jg(), sjhVar, null, new RideCardModalViewPresenter$attachView$4(ukk0Var, null), 2);
        tje.N(ukk0Var.Jg(), null, null, new RideCardModalViewPresenter$attachView$5(ukk0Var, null), 3);
        tpr c = ((ru.yandex.taxi.panorama.ridecard.d) ukk0Var.G).c(ukk0Var.H);
        if (((com.yandex.go.taxi.order.perf.experiment.d) ukk0Var.L).b().c) {
            c = e.F(c, mdh.b);
        }
        e.H(ukk0Var.Jg(), new jqr(c, new RideCardModalViewPresenter$attachView$7(2, bVar, nkk0.class, "renderPanoramaButton", "renderPanoramaButton(Lcom/yandex/go/taxi/order/api/panorama/RideCardPanoramaViewState;)V", 4), i2));
        wa80 wa80Var = this.orderViewTopOffsetCoordinator;
        va80 va80Var = this.topOffsetListener;
        wa80Var.b.add(va80Var);
        va80Var.a(wa80Var.a());
        k030 k030Var = this.appearAnimationCallback;
        if (k030Var != null) {
            u680 u680Var = (u680) k030Var;
            OrderStackView.openTaxiDetailsModal$lambda$2(u680Var.a, u680Var.b, this);
        }
        this.ridaAppDelegate.getClass();
        BackButtonIconComponent backButtonIconComponent = getBinding().h;
        backButtonIconComponent.setDebounceClickListener(new hxj0(5, this));
        backButtonIconComponent.setBadgeBackgroundColor(qje.t(xng0.controlMain, backButtonIconComponent.getContext()));
        backButtonIconComponent.setBadgeTextColorAttr(xng0.textOnControl);
        initTopRightFloatButton();
        getBottomSheet().setBackground(null);
        GoConstraintLayout goConstraintLayout = getBinding().e;
        goConstraintLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(tje.r(mrg0.go_design_card_divider_radius, getContext())));
        goConstraintLayout.setClipToOutline(true);
        this.accessibilityButtonsDelegate = new ng(this, getCardContentView(), new lg(getTopPadding(), new rkk0(this, i), new rkk0(this, 1), Integer.valueOf(kyh0.notifications_collapse), 8));
        updateAccessibilityButtons();
        tje.B(getContext()).addTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        ((g1a0) this.paymentIconLoader).a();
        OneShotPreDrawListener.add(this, new nz(this, this, SystemClock.elapsedRealtimeNanos(), this, 19));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.ridaAppDelegate.getClass();
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        Object value;
        ykk0 ykk0Var;
        super.onBehaviorStateChanged(newState, movedByUser);
        handleButtonsContainerVisibility(getCurrentOffset(), newState);
        ukk0 ukk0Var = this.presenter;
        float currentOffset = getCurrentOffset();
        AnchorBottomSheetBehavior<View> bottomSheetBehavior = getBottomSheetBehavior();
        ukk0Var.M.g(new Pair(Integer.valueOf((int) currentOffset), Integer.valueOf(bottomSheetBehavior.w(bottomSheetBehavior.x))));
        r0 r0Var = ukk0Var.D.b.a;
        do {
            value = r0Var.getValue();
            ykk0Var = (ykk0) value;
            Integer num = ykk0Var.a;
            if (num == null || num.intValue() != 7) {
                ykk0Var = ykk0.a(ykk0Var, null, false, false, null, null, false, 62);
            }
        } while (!r0Var.k(value, ykk0Var));
        updateScrollState(newState);
        updateAccessibilityButtons();
        updateDimColor(newState);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.walkingInfoView = null;
        this.doneButtonView = null;
        this.panoramaButton = null;
        getBinding().i.setAdapter(null);
        this.accessibilityButtonsDelegate = null;
        this.presenter.Cg();
        d dVar = this.shadowListener;
        if (dVar != null) {
            getBinding().i.removeOnScrollListener(dVar);
        }
        ((g1a0) this.paymentIconLoader).d();
        wa80 wa80Var = this.orderViewTopOffsetCoordinator;
        wa80Var.b.remove(this.topOffsetListener);
        tje.B(getContext()).removeTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        this.perfAnalyticsTracer.h();
        getBinding().f.removeAllViews();
        getBinding().d.removeAllViews();
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onDialogSlide(float newOffset) {
        super.onDialogSlide(newOffset);
        handleButtonsContainerVisibility(newOffset, behaviourState());
        ukk0 ukk0Var = this.presenter;
        int cardTop = getCardTop();
        int top = getCardContentContainer().getTop();
        float convertToOffsetFromAnchored = convertToOffsetFromAnchored(getSlideOffset());
        float x = getBottomSheetBehavior().x();
        AnchorBottomSheetBehavior<View> bottomSheetBehavior = getBottomSheetBehavior();
        ukk0Var.M.g(new Pair(Integer.valueOf((int) newOffset), Integer.valueOf(bottomSheetBehavior.w(bottomSheetBehavior.x))));
        ukk0Var.I.a(cardTop, top, convertToOffsetFromAnchored, x, true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Pair pair = new Pair(Integer.valueOf((int) event.getX()), Integer.valueOf((int) event.getY()));
        if (xw31.l(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), 0, getCardContentView())) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setBackgroundDimColor(float newOffset) {
        getDimBackgroundView().setBackgroundColor(cma1.m(newOffset, getContext().getColor(getBackgroundColor())));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setInitialBehaviorState(AnchorBottomSheetBehavior<View> bottomSheetBehavior) {
        super.setInitialBehaviorState(bottomSheetBehavior);
        bottomSheetBehavior.C = false;
        bottomSheetBehavior.a0 = true;
        bottomSheetBehavior.W = true;
        bottomSheetBehavior.V = true;
        bottomSheetBehavior.c0 = true;
        setEnableBackgroundOnAppearing(false);
    }
}
