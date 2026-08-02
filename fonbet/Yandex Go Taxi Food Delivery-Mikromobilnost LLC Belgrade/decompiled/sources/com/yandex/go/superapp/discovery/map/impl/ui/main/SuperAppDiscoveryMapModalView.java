package com.yandex.go.superapp.discovery.map.impl.ui.main;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment;
import com.yandex.go.superapp.discovery.map.impl.ui.base.SuperAppDiscoveryMapLifecycleAwareModalView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.SuperAppDiscoveryMapModalView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerButtonView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerDistrictCoverageProgressView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerOutlineRobotoTextView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.filters.domain.entities.SuperAppDiscoveryMapFilter;
import com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.views.SuperAppMapSearchbarView;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ah00;
import defpackage.avv0;
import defpackage.bt00;
import defpackage.buv0;
import defpackage.bvo;
import defpackage.c230;
import defpackage.c5w0;
import defpackage.cma1;
import defpackage.cuv0;
import defpackage.czo0;
import defpackage.d230;
import defpackage.dwv0;
import defpackage.e230;
import defpackage.fvv0;
import defpackage.fwv0;
import defpackage.g0c;
import defpackage.gh00;
import defpackage.gtv0;
import defpackage.gvv0;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.i8h0;
import defpackage.ip11;
import defpackage.jgc0;
import defpackage.ktv0;
import defpackage.lhc;
import defpackage.lki;
import defpackage.m76;
import defpackage.mqg0;
import defpackage.nvv0;
import defpackage.ny61;
import defpackage.ovv0;
import defpackage.p9t0;
import defpackage.pav;
import defpackage.pvv0;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.qu;
import defpackage.r3v;
import defpackage.r4w0;
import defpackage.scc;
import defpackage.skh0;
import defpackage.sug0;
import defpackage.t1w;
import defpackage.t6c0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uvv0;
import defpackage.v66;
import defpackage.vuv0;
import defpackage.w66;
import defpackage.wor0;
import defpackage.wuo;
import defpackage.wvv0;
import defpackage.xlp0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yio0;
import defpackage.zhb0;
import defpackage.zmh;
import defpackage.zxs;
import defpackage.zy11;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.utils.e;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001|Bq\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020%H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020%H\u0014¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020%H\u0014¢\u0006\u0004\b+\u0010)J\u0017\u0010.\u001a\u00020%2\u0006\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0014¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u0002032\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010=\u001a\u00020%2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:H\u0014¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00020%2\u0006\u0010?\u001a\u00020:2\u0006\u0010@\u001a\u00020:H\u0014¢\u0006\u0004\bA\u0010>J\u0017\u0010C\u001a\u00020%2\u0006\u0010B\u001a\u00020\u0005H\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020%H\u0002¢\u0006\u0004\bE\u0010)J\u000f\u0010F\u001a\u00020%H\u0002¢\u0006\u0004\bF\u0010)J\u000f\u0010G\u001a\u00020%H\u0002¢\u0006\u0004\bG\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010HR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010IR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010JR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010KR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010LR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010MR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010NR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010OR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010PR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001b\u0010Z\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010W\u001a\u0004\b]\u0010^R\u001b\u0010b\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010W\u001a\u0004\ba\u0010^R\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001b\u0010j\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010W\u001a\u0004\bh\u0010iR&\u0010q\u001a\r\u0012\t\u0012\u00070l¢\u0006\u0002\bm0k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010W\u001a\u0004\bo\u0010pR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020[8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bu\u0010^R\u0014\u0010w\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u00105R\u0014\u0010{\u001a\u00020x8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006}"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/ui/main/SuperAppDiscoveryMapModalView;", "Lcom/yandex/go/superapp/discovery/map/impl/ui/base/SuperAppDiscoveryMapLifecycleAwareModalView;", "Lnvv0;", "Lfwv0;", "discoveryMapPresenter", "Lc5w0;", "searchbarState", "Landroid/content/Context;", "context", "Lr3v;", "userLocationOverlay", "Lvuv0;", "lifecycleRepository", "Lbt00;", "mapStylesRepository", "Lpav;", "imageLoader", "Lip11;", "typefaceDelegate", "Lw66;", "blurDelegateFactory", "Lah00;", "mapController", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "Ltt2;", "appDispatchers", "<init>", "(Lfwv0;Lc5w0;Landroid/content/Context;Lr3v;Lvuv0;Lbt00;Lpav;Lip11;Lw66;Lah00;Lru/yandex/taxi/widget/utils/e;Ltt2;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lnvv0;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "refreshTopPadding", "Lt1w;", "insets", "onInsetsHandled", "(Lt1w;)V", "Le230;", "insetsType", "()Le230;", "", "isApplyShadow", "()Z", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", ClidProvider.STATE, "setupSearchbar", "(Lc5w0;)V", "applyDistrictNameConstraintsForNoHeaderButtons", "applyBackgroundTintForButtons", "applyDistrictCoverageStyles", "Lfwv0;", "Lc5w0;", "Landroid/content/Context;", "Lr3v;", "Lvuv0;", "Lbt00;", "Lpav;", "Lip11;", "Lw66;", "Lah00;", "Lcom/yandex/go/superapp/discovery/map/impl/ui/main/searchbar/views/SuperAppMapSearchbarView;", "searchbarView", "Lcom/yandex/go/superapp/discovery/map/impl/ui/main/searchbar/views/SuperAppMapSearchbarView;", "Lv66;", "mapBlurDelegate$delegate", "Li3y;", "getMapBlurDelegate", "()Lv66;", "mapBlurDelegate", "", "categoryFilterEdgeMargin$delegate", "getCategoryFilterEdgeMargin", "()I", "categoryFilterEdgeMargin", "categoryFilterMargin$delegate", "getCategoryFilterMargin", "categoryFilterMargin", "Lhbp0;", "categoriesScopeDelegate", "Lhbp0;", "Lbuv0;", "mapCategoryFiltersAdapter$delegate", "getMapCategoryFiltersAdapter", "()Lbuv0;", "mapCategoryFiltersAdapter", "", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lkotlin/jvm/internal/EnhancedNullability;", "buttons$delegate", "getButtons", "()Ljava/util/List;", "buttons", "Lbvo;", "explorerTopFadeOverlay", "Lbvo;", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "isSearchBarEnabled", "Lcom/yandex/go/superapp/discovery/map/impl/ui/main/explorer/ExplorerDistrictCoverageProgressView;", "getCoverageProgressView", "()Lcom/yandex/go/superapp/discovery/map/impl/ui/main/explorer/ExplorerDistrictCoverageProgressView;", "coverageProgressView", "gvv0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperAppDiscoveryMapModalView extends SuperAppDiscoveryMapLifecycleAwareModalView<nvv0> {
    private final w66 blurDelegateFactory;

    /* renamed from: buttons$delegate, reason: from kotlin metadata */
    private final i3y buttons;
    private final hbp0 categoriesScopeDelegate;

    /* renamed from: categoryFilterEdgeMargin$delegate, reason: from kotlin metadata */
    private final i3y categoryFilterEdgeMargin;

    /* renamed from: categoryFilterMargin$delegate, reason: from kotlin metadata */
    private final i3y categoryFilterMargin;
    private final Context context;
    private final fwv0 discoveryMapPresenter;
    private bvo explorerTopFadeOverlay;
    private final pav imageLoader;
    private final vuv0 lifecycleRepository;

    /* renamed from: mapBlurDelegate$delegate, reason: from kotlin metadata */
    private final i3y mapBlurDelegate;

    /* renamed from: mapCategoryFiltersAdapter$delegate, reason: from kotlin metadata */
    private final i3y mapCategoryFiltersAdapter;
    private final ah00 mapController;
    private final bt00 mapStylesRepository;
    private final c5w0 searchbarState;
    private SuperAppMapSearchbarView searchbarView;
    private final ip11 typefaceDelegate;
    private final r3v userLocationOverlay;

    public SuperAppDiscoveryMapModalView(fwv0 fwv0Var, c5w0 c5w0Var, Context context, r3v r3vVar, vuv0 vuv0Var, bt00 bt00Var, pav pavVar, ip11 ip11Var, w66 w66Var, ah00 ah00Var, e eVar, tt2 tt2Var) {
        super(context);
        this.discoveryMapPresenter = fwv0Var;
        this.searchbarState = c5w0Var;
        this.context = context;
        this.userLocationOverlay = r3vVar;
        this.lifecycleRepository = vuv0Var;
        this.mapStylesRepository = bt00Var;
        this.imageLoader = pavVar;
        this.typefaceDelegate = ip11Var;
        this.blurDelegateFactory = w66Var;
        this.mapController = ah00Var;
        fvv0 fvv0Var = new fvv0(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.mapBlurDelegate = kotlin.a.b(lazyThreadSafetyMode, fvv0Var);
        this.categoryFilterEdgeMargin = kotlin.a.b(lazyThreadSafetyMode, new fvv0(this, 3));
        this.categoryFilterMargin = kotlin.a.b(lazyThreadSafetyMode, new fvv0(this, 4));
        this.categoriesScopeDelegate = new hbp0(new czo0(14), "SuperAppDiscoveryMapModalView", null);
        this.mapCategoryFiltersAdapter = kotlin.a.b(lazyThreadSafetyMode, new xlp0(18, tt2Var, this, eVar));
        this.buttons = kotlin.a.b(lazyThreadSafetyMode, new fvv0(this, 5));
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        getBottomSheet().setBackgroundColor(getContext().getColor(mqg0.transparent));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ nvv0 access$getBinding(SuperAppDiscoveryMapModalView superAppDiscoveryMapModalView) {
        return (nvv0) superAppDiscoveryMapModalView.getBinding();
    }

    private final void applyBackgroundTintForButtons() {
        Iterator<T> it = getButtons().iterator();
        while (it.hasNext()) {
            ((FloatButtonIconComponent) it.next()).getIcon().setBackgroundTintList(ColorStateList.valueOf(qje.t(xng0.bgMain, this.context)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void applyDistrictCoverageStyles() {
        getCoverageProgressView().setColorsAndTextStyles(lhc.f(qje.t(xng0.bgMain, this.context), Math.abs(204) & 255), qje.t(xng0.bgMain, this.context), lhc.f(getContext().getColor(mqg0.component_accent_color), Math.abs(76) & 255), getContext().getColor(mqg0.component_accent_color), qje.t(xng0.bgInvert, this.context), this.typefaceDelegate.c(this.context));
        ((nvv0) getBinding()).e.setTypeface(((zmh) this.typefaceDelegate).f(this.context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void applyDistrictNameConstraintsForNoHeaderButtons() {
        int dimensionPixelSize = this.context.getResources().getDimensionPixelSize(sug0.explorer_padding);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) ((nvv0) getBinding()).e.getLayoutParams();
        layoutParams.startToEnd = -1;
        layoutParams.endToStart = -1;
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = -1;
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        layoutParams.setMarginStart(dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize);
        ((nvv0) getBinding()).e.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final List buttons_delegate$lambda$0(SuperAppDiscoveryMapModalView superAppDiscoveryMapModalView) {
        nvv0 nvv0Var = (nvv0) superAppDiscoveryMapModalView.getBinding();
        return scc.g(nvv0Var.j, nvv0Var.i, nvv0Var.g, nvv0Var.c, nvv0Var.b, nvv0Var.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int categoryFilterEdgeMargin_delegate$lambda$0(SuperAppDiscoveryMapModalView superAppDiscoveryMapModalView) {
        return tje.r(sug0.super_app_map_category_filter_edge_margin, superAppDiscoveryMapModalView.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int categoryFilterMargin_delegate$lambda$0(SuperAppDiscoveryMapModalView superAppDiscoveryMapModalView) {
        return tje.r(sug0.super_app_map_category_filter_margin, superAppDiscoveryMapModalView.context);
    }

    private final List<FloatButtonIconComponent> getButtons() {
        return (List) this.buttons.getValue();
    }

    private final int getCategoryFilterEdgeMargin() {
        return ((Number) this.categoryFilterEdgeMargin.getValue()).intValue();
    }

    private final int getCategoryFilterMargin() {
        return ((Number) this.categoryFilterMargin.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final ExplorerDistrictCoverageProgressView getCoverageProgressView() {
        return ((nvv0) getBinding()).d;
    }

    private final v66 getMapBlurDelegate() {
        return (v66) this.mapBlurDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final buv0 getMapCategoryFiltersAdapter() {
        return (buv0) this.mapCategoryFiltersAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSearchBarEnabled() {
        return this.searchbarState != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v66 mapBlurDelegate_delegate$lambda$0(SuperAppDiscoveryMapModalView superAppDiscoveryMapModalView) {
        return w66.a(superAppDiscoveryMapModalView.blurDelegateFactory, "super_app_discovery_map_searchbar", false, null, new m76(null, 7), 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final buv0 mapCategoryFiltersAdapter_delegate$lambda$0(tt2 tt2Var, SuperAppDiscoveryMapModalView superAppDiscoveryMapModalView, e eVar) {
        hbp0 hbp0Var = superAppDiscoveryMapModalView.categoriesScopeDelegate;
        SuperAppDiscoveryMapModalView$mapCategoryFiltersAdapter$2$1 superAppDiscoveryMapModalView$mapCategoryFiltersAdapter$2$1 = new SuperAppDiscoveryMapModalView$mapCategoryFiltersAdapter$2$1(1, superAppDiscoveryMapModalView.discoveryMapPresenter, fwv0.class, "onFilterClicked", "onFilterClicked(Lcom/yandex/go/superapp/discovery/map/impl/domain/entities/main/SuperAppDiscoveryMapCategoryFilter;)V", 0);
        lki lkiVar = new lki(11);
        int i = com.yandex.go.superapp.discovery.map.impl.ui.main.filters.adapter.a.b0;
        g0c a = qoi0.a(gtv0.class);
        return new buv0(lkiVar, Collections.singletonList(new zxs(a.a(), 0, null, EmptyList.a, null, new zhb0(hbp0Var, eVar, tt2Var, superAppDiscoveryMapModalView$mapCategoryFiltersAdapter$2$1, 18))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0$onBackButtonClicked(fwv0 fwv0Var) {
        ((ovv0) fwv0Var.x.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0$onCompassButtonClicked(fwv0 fwv0Var) {
        CameraPosition cameraPosition = ((gh00) fwv0Var.H).e.c;
        ah00.b(fwv0Var.H, new CameraPosition(cameraPosition.getTarget(), cameraPosition.getZoom(), 0.0f, cameraPosition.getTilt()), Animation.Type.SMOOTH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0$onLocationFocusingButtonClicked(fwv0 fwv0Var) {
        tje.N(fwv0Var.Jg(), null, null, new SuperAppDiscoveryMapPresenter$onLocationFocusingButtonClicked$1(fwv0Var, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0$onSearchButtonClicked(fwv0 fwv0Var) {
        wor0 wor0Var = fwv0Var.x;
        yio0 yio0Var = new yio0(17, fwv0Var);
        ovv0 ovv0Var = (ovv0) wor0Var.a;
        com.yandex.go.superapp.discovery.map.impl.navigation.common.a.T(ovv0Var, ovv0Var.N, new wvv0(pvv0.b), yio0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0$onZoomInButtonClicked(fwv0 fwv0Var) {
        gh00 gh00Var = (gh00) fwv0Var.D.b;
        gh00Var.K(gh00Var.j() + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0$onZoomOutButtonClicked(fwv0 fwv0Var) {
        gh00 gh00Var = (gh00) fwv0Var.D.b;
        gh00Var.K(gh00Var.j() - 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onAttachedToWindow$lambda$1(SuperAppDiscoveryMapModalView superAppDiscoveryMapModalView) {
        return superAppDiscoveryMapModalView.getCurrentInsets().b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final int onAttachedToWindow$lambda$2(SuperAppDiscoveryMapModalView superAppDiscoveryMapModalView) {
        return ((nvv0) superAppDiscoveryMapModalView.getBinding()).d.getBottom();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupSearchbar(c5w0 state) {
        ((gh00) this.mapController).q(new p9t0(27, this));
        SuperAppMapSearchbarView superAppMapSearchbarView = new SuperAppMapSearchbarView(this.context, this.imageLoader, getMapBlurDelegate());
        this.searchbarView = superAppMapSearchbarView;
        ((nvv0) getBinding()).l.addView(superAppMapSearchbarView, new ViewGroup.LayoutParams(-1, -2));
        superAppMapSearchbarView.render(state, new SuperAppDiscoveryMapModalView$setupSearchbar$2(1, this.discoveryMapPresenter, fwv0.class, "handleSearchbarAction", "handleSearchbarAction(Lcom/yandex/go/superapp/discovery/map/impl/ui/main/searchbar/state/SuperAppMapSearchbarState$SearchbarAction;)V", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupSearchbar$lambda$0(SuperAppDiscoveryMapModalView superAppDiscoveryMapModalView, TaxiMapView taxiMapView) {
        superAppDiscoveryMapModalView.getMapBlurDelegate().b(taxiMapView);
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        startAction.run();
        endAction.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        onAnimateShowStartAction.run();
        onAnimateShowEndAction.run();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        getBottomSheet().setBackgroundColor(getContext().getColor(mqg0.transparent));
        applyBackgroundTintForButtons();
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public nvv0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(skh0.super_app_discovery_map_modal_view_layout, parent, false);
        int i = i8h0.back_button;
        FloatButtonIconComponent floatButtonIconComponent = (FloatButtonIconComponent) cma1.O(i, inflate);
        if (floatButtonIconComponent != null) {
            i = i8h0.center_horizontal_guideline;
            if (((Guideline) cma1.O(i, inflate)) != null) {
                i = i8h0.compass_button;
                FloatButtonIconComponent floatButtonIconComponent2 = (FloatButtonIconComponent) cma1.O(i, inflate);
                if (floatButtonIconComponent2 != null) {
                    i = i8h0.district_coverage_progress_view;
                    ExplorerDistrictCoverageProgressView explorerDistrictCoverageProgressView = (ExplorerDistrictCoverageProgressView) cma1.O(i, inflate);
                    if (explorerDistrictCoverageProgressView != null) {
                        i = i8h0.district_name_text;
                        ExplorerOutlineRobotoTextView explorerOutlineRobotoTextView = (ExplorerOutlineRobotoTextView) cma1.O(i, inflate);
                        if (explorerOutlineRobotoTextView != null) {
                            i = i8h0.explorer_button;
                            ExplorerButtonView explorerButtonView = (ExplorerButtonView) cma1.O(i, inflate);
                            if (explorerButtonView != null) {
                                i = i8h0.location_focusing_button;
                                FloatButtonIconComponent floatButtonIconComponent3 = (FloatButtonIconComponent) cma1.O(i, inflate);
                                if (floatButtonIconComponent3 != null) {
                                    i = i8h0.map_category_filters;
                                    RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                                    if (recyclerView != null) {
                                        i = i8h0.minus_button;
                                        FloatButtonIconComponent floatButtonIconComponent4 = (FloatButtonIconComponent) cma1.O(i, inflate);
                                        if (floatButtonIconComponent4 != null) {
                                            i = i8h0.plus_button;
                                            FloatButtonIconComponent floatButtonIconComponent5 = (FloatButtonIconComponent) cma1.O(i, inflate);
                                            if (floatButtonIconComponent5 != null) {
                                                i = i8h0.search_button;
                                                FloatButtonIconComponent floatButtonIconComponent6 = (FloatButtonIconComponent) cma1.O(i, inflate);
                                                if (floatButtonIconComponent6 != null) {
                                                    i = i8h0.searchbar_container;
                                                    GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
                                                    if (goFrameLayout != null) {
                                                        return new nvv0((GoConstraintLayout) inflate, floatButtonIconComponent, floatButtonIconComponent2, explorerDistrictCoverageProgressView, explorerOutlineRobotoTextView, explorerButtonView, floatButtonIconComponent3, recyclerView, floatButtonIconComponent4, floatButtonIconComponent5, floatButtonIconComponent6, goFrameLayout);
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
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return isSearchBarEnabled() ? new d230(0) : new c230(false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.superapp.discovery.map.impl.ui.base.SuperAppDiscoveryMapLifecycleAwareModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.categoriesScopeDelegate.a();
        this.lifecycleRepository.a = getLifecycle();
        setOnTouchOutsideListener(null);
        final int i = 0;
        setDismissOnTouchOutside(false);
        fwv0 fwv0Var = this.discoveryMapPresenter;
        fwv0Var.Bg(new gvv0(this));
        uvv0 uvv0Var = (uvv0) fwv0Var.Dg();
        ktv0 ktv0Var = fwv0Var.L;
        uvv0Var.m(ktv0Var.e(), ktv0Var.a());
        ((uvv0) fwv0Var.Dg()).c(fwv0Var.y.b());
        avv0 avv0Var = fwv0Var.z;
        com.yandex.go.superapp.discovery.map.impl.data.repositories.controls.b bVar = new com.yandex.go.superapp.discovery.map.impl.data.repositories.controls.b(avv0Var.a);
        tse Jg = fwv0Var.Jg();
        SuperAppDiscoveryMapPresenter$startObserveControlsHoldersState$$inlined$safeCollectIn$1 superAppDiscoveryMapPresenter$startObserveControlsHoldersState$$inlined$safeCollectIn$1 = new SuperAppDiscoveryMapPresenter$startObserveControlsHoldersState$$inlined$safeCollectIn$1(bVar, null, fwv0Var);
        final int i2 = 3;
        tje.N(Jg, null, null, superAppDiscoveryMapPresenter$startObserveControlsHoldersState$$inlined$safeCollectIn$1, 3);
        tje.N(fwv0Var.Jg(), null, null, new SuperAppDiscoveryMapPresenter$startObservePlacesOverlayState$$inlined$safeCollectIn$1(fwv0Var.A.b.a, null, fwv0Var), 3);
        tje.N(fwv0Var.Jg(), null, null, new SuperAppDiscoveryMapPresenter$startObserveTransportOverlayState$$inlined$safeCollectIn$1(fwv0Var.B.b.a, null, fwv0Var), 3);
        r4w0 r4w0Var = fwv0Var.G;
        tje.N(fwv0Var.Jg(), null, null, new SuperAppDiscoveryMapPresenter$subscribeToMapCategoryFilters$$inlined$safeCollectIn$1(new com.yandex.go.superapp.discovery.map.impl.domain.interactors.main.b(r4w0Var.a.c), null, fwv0Var), 3);
        tje.N(fwv0Var.Jg(), null, null, new SuperAppDiscoveryMapPresenter$subscribeToThemeSwitch$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(fwv0Var.K.a()), null, fwv0Var), 3);
        r0 r0Var = avv0Var.a;
        com.yandex.go.superapp.discovery.map.impl.data.repositories.controls.b bVar2 = new com.yandex.go.superapp.discovery.map.impl.data.repositories.controls.b(r0Var);
        wuo wuoVar = fwv0Var.M;
        tje.N(fwv0Var.Jg(), null, null, new SuperAppDiscoveryMapPresenter$subscribeToExplorerState$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(new m0(bVar2, kotlinx.coroutines.flow.e.d(wuoVar.b), new SuperAppDiscoveryMapPresenter$subscribeToExplorerState$1(3, null))), null, fwv0Var), 3);
        tje.N(fwv0Var.Jg(), null, null, new SuperAppDiscoveryMapPresenter$subscribeToExplorerState$$inlined$safeCollectIn$2(kotlinx.coroutines.flow.e.t(new m0(new com.yandex.go.superapp.discovery.map.impl.data.repositories.controls.b(r0Var), kotlinx.coroutines.flow.e.d(wuoVar.c), new SuperAppDiscoveryMapPresenter$subscribeToExplorerState$3(3, null))), null, fwv0Var), 3);
        tje.N(fwv0Var.Jg(), null, null, new SuperAppDiscoveryMapPresenter$getMapCategoryFilters$1(fwv0Var, null), 3);
        gtv0 gtv0Var = (gtv0) r4w0Var.a.a.getValue();
        SuperAppDiscoveryMapExperiment.CategoryFilterType categoryFilterType = gtv0Var != null ? gtv0Var.g : null;
        int i3 = categoryFilterType == null ? -1 : dwv0.b[categoryFilterType.ordinal()];
        final int i4 = 4;
        final int i5 = 2;
        final int i6 = 1;
        if (i3 != 1) {
            if (i3 == 2) {
                SuperAppDiscoveryMapFilter superAppDiscoveryMapFilter = SuperAppDiscoveryMapFilter.PLACES;
            } else if (i3 == 3) {
                SuperAppDiscoveryMapFilter superAppDiscoveryMapFilter2 = SuperAppDiscoveryMapFilter.PLACES;
            } else if (i3 == 4) {
                SuperAppDiscoveryMapFilter superAppDiscoveryMapFilter3 = SuperAppDiscoveryMapFilter.PLACES;
            }
        } else if (((Collection) fwv0Var.I.a.getValue()).isEmpty()) {
            r4w0Var.a.a.l(null);
            fwv0Var.C.l(t6c0.a);
        } else {
            SuperAppDiscoveryMapFilter superAppDiscoveryMapFilter4 = SuperAppDiscoveryMapFilter.PLACES;
        }
        ((gh00) fwv0Var.H).I(true);
        ((jgc0) this.userLocationOverlay).attach();
        nvv0 nvv0Var = (nvv0) getBinding();
        FloatButtonIconComponent floatButtonIconComponent = nvv0Var.j;
        ExplorerButtonView explorerButtonView = nvv0Var.f;
        FloatButtonIconComponent floatButtonIconComponent2 = nvv0Var.k;
        FloatButtonIconComponent floatButtonIconComponent3 = nvv0Var.b;
        final fwv0 fwv0Var2 = this.discoveryMapPresenter;
        floatButtonIconComponent.setDebounceClickListener(new Runnable() { // from class: evv0
            @Override // java.lang.Runnable
            public final void run() {
                int i7 = i5;
                fwv0 fwv0Var3 = fwv0Var2;
                switch (i7) {
                    case 0:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onBackButtonClicked(fwv0Var3);
                        break;
                    case 1:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onSearchButtonClicked(fwv0Var3);
                        break;
                    case 2:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onZoomInButtonClicked(fwv0Var3);
                        break;
                    case 3:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onZoomOutButtonClicked(fwv0Var3);
                        break;
                    case 4:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onCompassButtonClicked(fwv0Var3);
                        break;
                    default:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onLocationFocusingButtonClicked(fwv0Var3);
                        break;
                }
            }
        });
        FloatButtonIconComponent floatButtonIconComponent4 = nvv0Var.i;
        final fwv0 fwv0Var3 = this.discoveryMapPresenter;
        floatButtonIconComponent4.setDebounceClickListener(new Runnable() { // from class: evv0
            @Override // java.lang.Runnable
            public final void run() {
                int i7 = i2;
                fwv0 fwv0Var32 = fwv0Var3;
                switch (i7) {
                    case 0:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onBackButtonClicked(fwv0Var32);
                        break;
                    case 1:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onSearchButtonClicked(fwv0Var32);
                        break;
                    case 2:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onZoomInButtonClicked(fwv0Var32);
                        break;
                    case 3:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onZoomOutButtonClicked(fwv0Var32);
                        break;
                    case 4:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onCompassButtonClicked(fwv0Var32);
                        break;
                    default:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onLocationFocusingButtonClicked(fwv0Var32);
                        break;
                }
            }
        });
        FloatButtonIconComponent floatButtonIconComponent5 = nvv0Var.c;
        final fwv0 fwv0Var4 = this.discoveryMapPresenter;
        floatButtonIconComponent5.setDebounceClickListener(new Runnable() { // from class: evv0
            @Override // java.lang.Runnable
            public final void run() {
                int i7 = i4;
                fwv0 fwv0Var32 = fwv0Var4;
                switch (i7) {
                    case 0:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onBackButtonClicked(fwv0Var32);
                        break;
                    case 1:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onSearchButtonClicked(fwv0Var32);
                        break;
                    case 2:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onZoomInButtonClicked(fwv0Var32);
                        break;
                    case 3:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onZoomOutButtonClicked(fwv0Var32);
                        break;
                    case 4:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onCompassButtonClicked(fwv0Var32);
                        break;
                    default:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onLocationFocusingButtonClicked(fwv0Var32);
                        break;
                }
            }
        });
        FloatButtonIconComponent floatButtonIconComponent6 = nvv0Var.g;
        final fwv0 fwv0Var5 = this.discoveryMapPresenter;
        final int i7 = 5;
        floatButtonIconComponent6.setDebounceClickListener(new Runnable() { // from class: evv0
            @Override // java.lang.Runnable
            public final void run() {
                int i72 = i7;
                fwv0 fwv0Var32 = fwv0Var5;
                switch (i72) {
                    case 0:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onBackButtonClicked(fwv0Var32);
                        break;
                    case 1:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onSearchButtonClicked(fwv0Var32);
                        break;
                    case 2:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onZoomInButtonClicked(fwv0Var32);
                        break;
                    case 3:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onZoomOutButtonClicked(fwv0Var32);
                        break;
                    case 4:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onCompassButtonClicked(fwv0Var32);
                        break;
                    default:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onLocationFocusingButtonClicked(fwv0Var32);
                        break;
                }
            }
        });
        final fwv0 fwv0Var6 = this.discoveryMapPresenter;
        floatButtonIconComponent3.setDebounceClickListener(new Runnable() { // from class: evv0
            @Override // java.lang.Runnable
            public final void run() {
                int i72 = i;
                fwv0 fwv0Var32 = fwv0Var6;
                switch (i72) {
                    case 0:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onBackButtonClicked(fwv0Var32);
                        break;
                    case 1:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onSearchButtonClicked(fwv0Var32);
                        break;
                    case 2:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onZoomInButtonClicked(fwv0Var32);
                        break;
                    case 3:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onZoomOutButtonClicked(fwv0Var32);
                        break;
                    case 4:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onCompassButtonClicked(fwv0Var32);
                        break;
                    default:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onLocationFocusingButtonClicked(fwv0Var32);
                        break;
                }
            }
        });
        final fwv0 fwv0Var7 = this.discoveryMapPresenter;
        floatButtonIconComponent2.setDebounceClickListener(new Runnable() { // from class: evv0
            @Override // java.lang.Runnable
            public final void run() {
                int i72 = i6;
                fwv0 fwv0Var32 = fwv0Var7;
                switch (i72) {
                    case 0:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onBackButtonClicked(fwv0Var32);
                        break;
                    case 1:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onSearchButtonClicked(fwv0Var32);
                        break;
                    case 2:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onZoomInButtonClicked(fwv0Var32);
                        break;
                    case 3:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onZoomOutButtonClicked(fwv0Var32);
                        break;
                    case 4:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onCompassButtonClicked(fwv0Var32);
                        break;
                    default:
                        SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$0$onLocationFocusingButtonClicked(fwv0Var32);
                        break;
                }
            }
        });
        explorerButtonView.setOnToggleClicked(new SuperAppDiscoveryMapModalView$onAttachedToWindow$1$7(1, this.discoveryMapPresenter, fwv0.class, "onExplorerToggleClicked", "onExplorerToggleClicked(Z)V", 0));
        explorerButtonView.setOnNoPermissionClicked(new SuperAppDiscoveryMapModalView$onAttachedToWindow$1$8(0, this.discoveryMapPresenter, fwv0.class, "onExplorerNoPermissionClicked", "onExplorerNoPermissionClicked()V", 0));
        if (isSearchBarEnabled()) {
            floatButtonIconComponent3.setVisibility(8);
            floatButtonIconComponent2.setVisibility(8);
            applyDistrictNameConstraintsForNoHeaderButtons();
        }
        RecyclerView recyclerView = nvv0Var.h;
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(getMapCategoryFiltersAdapter());
        recyclerView.addItemDecoration(new cuv0(getCategoryFilterEdgeMargin(), getCategoryFilterMargin()));
        applyBackgroundTintForButtons();
        applyDistrictCoverageStyles();
        bvo bvoVar = new bvo(this, new fvv0(this, i), new fvv0(this, i6));
        this.explorerTopFadeOverlay = bvoVar;
        bvoVar.a();
        bvo bvoVar2 = this.explorerTopFadeOverlay;
        if (bvoVar2 != null) {
            bvoVar2.c();
        }
        c5w0 c5w0Var = this.searchbarState;
        if (c5w0Var != null) {
            setupSearchbar(c5w0Var);
        }
        int r = tje.r(sug0.super_app_map_category_filters_margin_bottom, getContext());
        RecyclerView recyclerView2 = ((nvv0) getBinding()).h;
        if (this.searchbarState != null) {
            r = -r;
        }
        xw31.E(recyclerView2, null, null, null, Integer.valueOf(r));
    }

    @Override // com.yandex.go.superapp.discovery.map.impl.ui.base.SuperAppDiscoveryMapLifecycleAwareModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bvo bvoVar = this.explorerTopFadeOverlay;
        if (bvoVar != null) {
            View view = bvoVar.d;
            if (view != null) {
                bvoVar.a.removeView(view);
            }
            bvoVar.d = null;
        }
        this.categoriesScopeDelegate.b();
        ((jgc0) this.userLocationOverlay).detach();
        this.discoveryMapPresenter.Cg();
        if (isSearchBarEnabled()) {
            getMapBlurDelegate().detach();
        }
        this.lifecycleRepository.a = null;
        this.searchbarView = null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onInsetsHandled(t1w insets) {
        super.onInsetsHandled(insets);
        SuperAppMapSearchbarView superAppMapSearchbarView = this.searchbarView;
        if (superAppMapSearchbarView != null) {
            superAppMapSearchbarView.applyBottomInset(insets.d);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void refreshTopPadding() {
        super.refreshTopPadding();
        bvo bvoVar = this.explorerTopFadeOverlay;
        if (bvoVar != null) {
            bvoVar.c();
        }
    }
}
