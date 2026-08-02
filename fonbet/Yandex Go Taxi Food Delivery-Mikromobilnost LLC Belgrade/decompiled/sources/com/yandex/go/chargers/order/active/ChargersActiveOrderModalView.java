package com.yandex.go.chargers.order.active;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveOrderCardButtonNameV2;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveOrderCardCloseReason;
import com.yandex.go.chargers.design.components.ChargersGeoButtonIconComponent;
import com.yandex.go.chargers.design.components.ChargersOrderTabsView;
import com.yandex.go.chargers.order.active.ChargersActiveOrderModalView;
import com.yandex.go.chargers.order.active.q;
import com.yandex.go.design.view.GoImageView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.al9;
import defpackage.ays;
import defpackage.bhb1;
import defpackage.bl9;
import defpackage.ck9;
import defpackage.cma1;
import defpackage.dl9;
import defpackage.el9;
import defpackage.em9;
import defpackage.fd60;
import defpackage.fhb1;
import defpackage.fj70;
import defpackage.fl9;
import defpackage.g0c;
import defpackage.g18;
import defpackage.gei0;
import defpackage.gh00;
import defpackage.he7;
import defpackage.hh5;
import defpackage.hh8;
import defpackage.il9;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.lgp;
import defpackage.lj1;
import defpackage.mk9;
import defpackage.mqg0;
import defpackage.mth;
import defpackage.nk9;
import defpackage.nna;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qdb1;
import defpackage.qoi0;
import defpackage.qu;
import defpackage.rk9;
import defpackage.scc;
import defpackage.thh0;
import defpackage.tje;
import defpackage.tqs;
import defpackage.tsh0;
import defpackage.u90;
import defpackage.ub60;
import defpackage.uda;
import defpackage.vk9;
import defpackage.wls;
import defpackage.x8y;
import defpackage.xw31;
import defpackage.xx8;
import defpackage.xx9;
import defpackage.y8y;
import defpackage.ynn;
import defpackage.ytz;
import defpackage.z8y;
import defpackage.zk9;
import defpackage.zxs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\\BU\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010-\u001a\u00020\u00192\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0014¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0019H\u0014¢\u0006\u0004\b/\u00100J\u001f\u00104\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00172\u0006\u00103\u001a\u000202H\u0014¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0019H\u0014¢\u0006\u0004\b6\u00100J\u0017\u00109\u001a\u0002022\u0006\u00108\u001a\u000207H\u0017¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0017H\u0014¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u000202H\u0014¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0019H\u0014¢\u0006\u0004\b?\u00100J\u000f\u0010@\u001a\u00020\u0019H\u0014¢\u0006\u0004\b@\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010AR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010BR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010CR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010DR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010ER\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010>¨\u0006]"}, d2 = {"Lcom/yandex/go/chargers/order/active/ChargersActiveOrderModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lnk9;", "Landroid/content/Context;", "context", "Lytz;", "lottieLoader", "Lgei0;", "realtimeAnalyticsViewConfigurationProvider", "Lpav;", "imageLoader", "Lah00;", "mapController", "La3v;", "iFocusCoordinator", "Lnna;", "chargersPromoAnalytics", "Lxx9;", "chargersEnvironmentRepository", "Lcom/yandex/go/chargers/order/active/q;", "chargersActiveOrderPresenter", "<init>", "(Landroid/content/Context;Lytz;Lgei0;Lpav;Lah00;La3v;Lnna;Lxx9;Lcom/yandex/go/chargers/order/active/q;)V", "", ClidProvider.STATE, "Lzy11;", "setFocusCoordinatorMargins", "(I)V", "Lfl9;", "tabsConfig", "setupTabs", "(Lfl9;)V", "Luda;", "mode", "onTabChanged", "(Luda;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lnk9;", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", "bottomSheetBehavior", "setInitialBehaviorState", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "onAttachedToWindow", "()V", "newState", "", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "onDetachedFromWindow", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "canDragToExpandFromAnchored", "()Z", "onArrowClick", "onBackPressed", "Lpav;", "Lah00;", "La3v;", "Lnna;", "Lxx9;", "Lcom/yandex/go/chargers/order/active/q;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lcom/yandex/go/chargers/design/components/ChargersGeoButtonIconComponent;", "locationButton", "Lcom/yandex/go/chargers/design/components/ChargersGeoButtonIconComponent;", "Lg18;", "imageRequestCancellable", "Lg18;", "Lcom/yandex/go/chargers/design/components/ChargersOrderTabsView;", "tabsView", "Lcom/yandex/go/chargers/design/components/ChargersOrderTabsView;", "Lck9;", "itemsAdapter", "Lck9;", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "minimizedHeight", CA20Status.STATUS_USER_I, "isBackgroundVisible", "mk9", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersActiveOrderModalView extends SlideableBindingModalView<nk9> {
    private final FloatButtonIconComponent backButton;
    private final q chargersActiveOrderPresenter;
    private final xx9 chargersEnvironmentRepository;
    private final nna chargersPromoAnalytics;
    private final a3v iFocusCoordinator;
    private final pav imageLoader;
    private g18 imageRequestCancellable;
    private final ck9 itemsAdapter;
    private final ChargersGeoButtonIconComponent locationButton;
    private final ah00 mapController;
    private final int minimizedHeight;
    private final View.OnLayoutChangeListener onLayoutChangeListener;
    private ChargersOrderTabsView tabsView;

    public ChargersActiveOrderModalView(Context context, ytz ytzVar, gei0 gei0Var, pav pavVar, ah00 ah00Var, a3v a3vVar, nna nnaVar, xx9 xx9Var, final q qVar) {
        super(context);
        this.imageLoader = pavVar;
        this.mapController = ah00Var;
        this.iFocusCoordinator = a3vVar;
        this.chargersPromoAnalytics = nnaVar;
        this.chargersEnvironmentRepository = xx9Var;
        this.chargersActiveOrderPresenter = qVar;
        final int i = 0;
        this.backButton = qdb1.b(this, new Runnable() { // from class: lk9
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                q qVar2 = qVar;
                switch (i2) {
                    case 0:
                        ChargersActiveOrderModalView.backButton$backButtonClicked(qVar2);
                        break;
                    default:
                        ChargersActiveOrderModalView.locationButton$locationButtonClicked(qVar2);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.locationButton = fhb1.a(this, new Runnable() { // from class: lk9
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                q qVar2 = qVar;
                switch (i22) {
                    case 0:
                        ChargersActiveOrderModalView.backButton$backButtonClicked(qVar2);
                        break;
                    default:
                        ChargersActiveOrderModalView.locationButton$locationButtonClicked(qVar2);
                        break;
                }
            }
        });
        ChargersOrderTabsView chargersOrderTabsView = new ChargersOrderTabsView(context, null, 0, 6, null);
        chargersOrderTabsView.setOnTabSelectedListener(new hh5(23, this));
        SlideableModalView.addViewAboveCard$default(this, chargersOrderTabsView, 1, 0, 4, null);
        chargersOrderTabsView.setVisibility(4);
        OneShotPreDrawListener.add(chargersOrderTabsView, new tqs(chargersOrderTabsView, chargersOrderTabsView, this, 4));
        this.tabsView = chargersOrderTabsView;
        final ChargersActiveOrderModalView$itemsAdapter$1 chargersActiveOrderModalView$itemsAdapter$1 = new ChargersActiveOrderModalView$itemsAdapter$1(2, qVar, q.class, "itemClicked", "itemClicked(Lcom/yandex/go/chargers/api/ChargersOrderAction;Ljava/util/Map;)V", 0);
        ays aysVar = new ays() { // from class: com.yandex.go.chargers.order.active.c
            @Override // defpackage.ays
            public final void a(Object obj) {
                el9 el9Var = (el9) obj;
                ((ChargersActiveOrderModalView$itemsAdapter$1) wls.this).invoke(el9Var.getAction(), bhb1.a(el9Var));
            }
        };
        int i3 = f0.V;
        g0c a = qoi0.a(bl9.class);
        lj1 lj1Var = new lj1(context, 20);
        ynn ynnVar = new ynn(15, pavVar, nnaVar, gei0Var);
        int i4 = 3;
        zxs zxsVar = new zxs(a.a(), 0, lj1Var, scc.g(new lgp(ItemViewHolder$Companion$itemType$3.b, ItemViewHolder$Companion$itemType$4.b, i4), new lgp(ItemViewHolder$Companion$itemType$5.b, ItemViewHolder$Companion$itemType$6.b, i4), new lgp(ItemViewHolder$Companion$itemType$7.b, ItemViewHolder$Companion$itemType$8.b, i4), new lgp(ItemViewHolder$Companion$itemType$9.b, ItemViewHolder$Companion$itemType$10.b, i4)), new he7(1, ynnVar), null);
        int i5 = b.V;
        List g = scc.g(new lgp(BannerViewHolder$Companion$itemType$1.b, BannerViewHolder$Companion$itemType$2.b, i4), new lgp(BannerViewHolder$Companion$itemType$3.b, BannerViewHolder$Companion$itemType$4.b, i4), new lgp(BannerViewHolder$Companion$itemType$5.b, BannerViewHolder$Companion$itemType$6.b, i4), new lgp(BannerViewHolder$Companion$itemType$7.b, BannerViewHolder$Companion$itemType$8.b, i4));
        g0c a2 = qoi0.a(al9.class);
        zxs zxsVar2 = new zxs(a2.a(), 0, null, g, null, new xx8(16, pavVar, nnaVar, gei0Var));
        int i6 = fj70.V;
        d dVar = new d(chargersActiveOrderModalView$itemsAdapter$1);
        g0c a3 = qoi0.a(dl9.class);
        fd60 fd60Var = new fd60(17);
        ub60 ub60Var = new ub60(8, dVar);
        zxs zxsVar3 = new zxs(a3.a(), 0, fd60Var, EmptyList.a, new he7(1, ub60Var), null);
        int i7 = a.V;
        List g2 = scc.g(new lgp(AnimatedBannerViewHolder$Companion$itemType$1.b, AnimatedBannerViewHolder$Companion$itemType$2.b, i4), new lgp(AnimatedBannerViewHolder$Companion$itemType$3.b, AnimatedBannerViewHolder$Companion$itemType$4.b, i4), new lgp(AnimatedBannerViewHolder$Companion$itemType$5.b, AnimatedBannerViewHolder$Companion$itemType$6.b, i4), new lgp(AnimatedBannerViewHolder$Companion$itemType$7.b, AnimatedBannerViewHolder$Companion$itemType$8.b, i4));
        g0c a4 = qoi0.a(zk9.class);
        ck9 ck9Var = new ck9(aysVar, scc.g(zxsVar, zxsVar2, zxsVar3, new zxs(a4.a(), 0, null, g2, null, new xx8(12, ytzVar, nnaVar, gei0Var))));
        this.itemsAdapter = ck9Var;
        this.onLayoutChangeListener = new u90(13, this);
        int u = tje.u(HProv.PP_LCD_QUERY, getContext());
        this.minimizedHeight = u;
        RecyclerView recyclerView = getBinding().e;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(ck9Var);
        recyclerView.setItemAnimator(null);
        setBehaviorAnchorHeight(Integer.valueOf(u));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void backButton$backButtonClicked(q qVar) {
        em9 em9Var = qVar.x;
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV2 = ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Back;
        rk9 rk9Var = qVar.I;
        em9Var.b(chargersAnalytics$ChargersActiveOrderCardButtonNameV2, rk9Var.a, null, rk9Var.b);
        ChargersAnalytics$ChargersActiveOrderCardCloseReason chargersAnalytics$ChargersActiveOrderCardCloseReason = ChargersAnalytics$ChargersActiveOrderCardCloseReason.Back;
        HashMap hashMap = new HashMap();
        hashMap.put("close_reason", chargersAnalytics$ChargersActiveOrderCardCloseReason.getEventValue());
        em9Var.a.a("Chargers.ActiveOrderCard.Closed", hashMap, 1, new HashMap());
        vk9 vk9Var = (vk9) qVar.H.c;
        if (vk9Var.u()) {
            vk9Var.r(new qu(9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void locationButton$locationButtonClicked(q qVar) {
        em9 em9Var = qVar.x;
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV2 = ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Geo;
        rk9 rk9Var = qVar.I;
        em9Var.b(chargersAnalytics$ChargersActiveOrderCardButtonNameV2, rk9Var.a, null, rk9Var.b);
        tje.N(qVar.Jg(), null, null, new ChargersActiveOrderPresenter$locationButtonClicked$1(qVar, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLayoutChangeListener$lambda$0(ChargersActiveOrderModalView chargersActiveOrderModalView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        chargersActiveOrderModalView.setFocusCoordinatorMargins(chargersActiveOrderModalView.behaviourState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTabChanged(uda mode) {
        q qVar = this.chargersActiveOrderPresenter;
        em9 em9Var = qVar.x;
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV2 = ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Switcher;
        String str = mode != null ? mode.a : null;
        rk9 rk9Var = qVar.I;
        em9Var.b(chargersAnalytics$ChargersActiveOrderCardButtonNameV2, rk9Var.a, str, rk9Var.b);
        qVar.E.h.a.l(mode);
    }

    private final void setFocusCoordinatorMargins(int state) {
        this.iFocusCoordinator.Lc(this, new Rect(0, tje.u(68, getContext()), 0, tje.u(8, getContext()) + (state == 6 ? this.minimizedHeight : getBinding().a.getHeight())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupTabs(fl9 tabsConfig) {
        if (tabsConfig != null) {
            ArrayList arrayList = tabsConfig.a;
            if (!arrayList.isEmpty()) {
                ChargersOrderTabsView chargersOrderTabsView = this.tabsView;
                chargersOrderTabsView.setTabs(arrayList, tabsConfig.b);
                chargersOrderTabsView.setVisibility(0);
                return;
            }
        }
        this.tabsView.setVisibility(4);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public nk9 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(tsh0.chargers_active_order_modal_view, parent, false);
        int i = thh0.header_bottom_barrier;
        if (((Barrier) cma1.O(i, inflate)) != null) {
            i = thh0.header_end_title_text_view;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = thh0.header_icon;
                GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                if (goImageView != null) {
                    i = thh0.header_start_title_text_view;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        i = thh0.items_recycler_view;
                        RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                        if (recyclerView != null) {
                            return new nk9((ConstraintLayout) inflate, robotoTextView, goImageView, robotoTextView2, recyclerView);
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
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: isBackgroundVisible */
    public boolean getIsBackgroundVisibleState() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onArrowClick() {
        if (isAnchored()) {
            expand();
        } else {
            anchor();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object obj;
        uda udaVar;
        y8y y8yVar;
        Object obj2;
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        ((gh00) this.mapController).L(null);
        this.iFocusCoordinator.b8(this);
        getBinding().a.addOnLayoutChangeListener(this.onLayoutChangeListener);
        Iterator it = this.chargersPromoAnalytics.b.values().iterator();
        while (it.hasNext()) {
            ((Set) it.next()).clear();
        }
        q qVar = this.chargersActiveOrderPresenter;
        mk9 mk9Var = new mk9(this);
        String str = qVar.F;
        qVar.Bg(mk9Var);
        il9 il9Var = qVar.E;
        com.yandex.go.chargers.data.e eVar = qVar.C;
        ArrayList b = eVar.b();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof z8y) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it3.next();
                if (((z8y) obj).a.equals(str)) {
                    break;
                }
            }
        }
        z8y z8yVar = (z8y) obj;
        if (z8yVar != null && (y8yVar = z8yVar.n) != null) {
            Iterator it4 = y8yVar.b.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it4.next();
                    if (jl40.l(((x8y) obj2).a, y8yVar.a)) {
                        break;
                    }
                }
            }
            x8y x8yVar = (x8y) obj2;
            if (x8yVar != null) {
                udaVar = new uda(x8yVar.a, x8yVar.b, x8yVar.c);
                il9Var.h.a.l(udaVar);
                tje.N(qVar.Jg(), null, null, new ChargersActiveOrderPresenter$observeUiState$$inlined$collectIn$1(qVar.Mg(), null, qVar), 3);
                tje.N(qVar.Jg(), null, null, new ChargersActiveOrderPresenter$observeUiState$$inlined$collectIn$2(kotlinx.coroutines.flow.e.t(new n(qVar.Mg(), qVar)), null, qVar), 3);
                tje.N(qVar.Jg(), null, null, new ChargersActiveOrderPresenter$observePromoReceived$$inlined$collectIn$1(kotlinx.coroutines.flow.e.s(new l(qVar.Mg()), new hh8(12, qVar)), null, qVar), 3);
                tje.N(qVar.Jg(), null, null, new ChargersActiveOrderPresenter$observeLayersConditionChange$$inlined$collectIn$1(kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.n(new j(qVar.Mg()), new ChargersActiveOrderPresenter$observeLayersConditionChange$2(2, null))), null, qVar), 3);
                tje.N(qVar.Jg(), null, null, new ChargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1(new kotlinx.coroutines.flow.o(new h(kotlinx.coroutines.flow.e.d(eVar.d), qVar), new ChargersActiveOrderPresenter$listenOrderStatusForNavigating$2(qVar, null)), null, qVar), 3);
                tje.N(qVar.Jg(), null, null, new ChargersActiveOrderPresenter$listenNotifications$$inlined$collectIn$1(new jqr(new v(new t(new mth(new x(kotlinx.coroutines.flow.e.d(il9Var.g.d), str), 6), il9Var.d), il9Var), new ChargersActiveOrderUiStateInteractor$notificationsFlow$4(il9Var, null), 3), null, qVar), 3);
            }
        }
        udaVar = null;
        il9Var.h.a.l(udaVar);
        tje.N(qVar.Jg(), null, null, new ChargersActiveOrderPresenter$observeUiState$$inlined$collectIn$1(qVar.Mg(), null, qVar), 3);
        tje.N(qVar.Jg(), null, null, new ChargersActiveOrderPresenter$observeUiState$$inlined$collectIn$2(kotlinx.coroutines.flow.e.t(new n(qVar.Mg(), qVar)), null, qVar), 3);
        tje.N(qVar.Jg(), null, null, new ChargersActiveOrderPresenter$observePromoReceived$$inlined$collectIn$1(kotlinx.coroutines.flow.e.s(new l(qVar.Mg()), new hh8(12, qVar)), null, qVar), 3);
        tje.N(qVar.Jg(), null, null, new ChargersActiveOrderPresenter$observeLayersConditionChange$$inlined$collectIn$1(kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.n(new j(qVar.Mg()), new ChargersActiveOrderPresenter$observeLayersConditionChange$2(2, null))), null, qVar), 3);
        tje.N(qVar.Jg(), null, null, new ChargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$collectIn$1(new kotlinx.coroutines.flow.o(new h(kotlinx.coroutines.flow.e.d(eVar.d), qVar), new ChargersActiveOrderPresenter$listenOrderStatusForNavigating$2(qVar, null)), null, qVar), 3);
        tje.N(qVar.Jg(), null, null, new ChargersActiveOrderPresenter$listenNotifications$$inlined$collectIn$1(new jqr(new v(new t(new mth(new x(kotlinx.coroutines.flow.e.d(il9Var.g.d), str), 6), il9Var.d), il9Var), new ChargersActiveOrderUiStateInteractor$notificationsFlow$4(il9Var, null), 3), null, qVar), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        q qVar = this.chargersActiveOrderPresenter;
        em9 em9Var = qVar.x;
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV2 = ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Back;
        rk9 rk9Var = qVar.I;
        em9Var.b(chargersAnalytics$ChargersActiveOrderCardButtonNameV2, rk9Var.a, null, rk9Var.b);
        ChargersAnalytics$ChargersActiveOrderCardCloseReason chargersAnalytics$ChargersActiveOrderCardCloseReason = ChargersAnalytics$ChargersActiveOrderCardCloseReason.Back;
        HashMap hashMap = new HashMap();
        hashMap.put("close_reason", chargersAnalytics$ChargersActiveOrderCardCloseReason.getEventValue());
        em9Var.a.a("Chargers.ActiveOrderCard.Closed", hashMap, 1, new HashMap());
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        super.onBehaviorStateChanged(newState, movedByUser);
        setFocusCoordinatorMargins(behaviourState());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.iFocusCoordinator.t4(this);
        this.iFocusCoordinator.a0(this);
        getBinding().a.removeOnLayoutChangeListener(this.onLayoutChangeListener);
        this.chargersActiveOrderPresenter.Cg();
        g18 g18Var = this.imageRequestCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.imageRequestCancellable = null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), getCardContentView(), event)) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setInitialBehaviorState(AnchorBottomSheetBehavior<View> bottomSheetBehavior) {
        bottomSheetBehavior.O(3);
        updateUserInteractionBlockingOutside();
        bottomSheetBehavior.C = false;
        bottomSheetBehavior.W = false;
    }
}
