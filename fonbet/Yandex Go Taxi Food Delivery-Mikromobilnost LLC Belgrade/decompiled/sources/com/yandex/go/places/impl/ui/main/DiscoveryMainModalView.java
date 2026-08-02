package com.yandex.go.places.impl.ui.main;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$RevealingState;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.atj;
import defpackage.btj;
import defpackage.bz20;
import defpackage.c2x0;
import defpackage.c9c0;
import defpackage.cma1;
import defpackage.d230;
import defpackage.dac0;
import defpackage.dug0;
import defpackage.e230;
import defpackage.em80;
import defpackage.ez20;
import defpackage.fz20;
import defpackage.i3h;
import defpackage.j73;
import defpackage.jsj;
import defpackage.mqg0;
import defpackage.nu;
import defpackage.ny61;
import defpackage.o6h0;
import defpackage.osj;
import defpackage.pav;
import defpackage.qje;
import defpackage.qu;
import defpackage.ry20;
import defpackage.t1w;
import defpackage.t5w;
import defpackage.tje;
import defpackage.tl80;
import defpackage.tsj;
import defpackage.uuh0;
import defpackage.uxh;
import defpackage.w4c;
import defpackage.wac0;
import defpackage.xng0;
import defpackage.xr00;
import defpackage.xsj;
import defpackage.xw31;
import defpackage.y6i0;
import defpackage.y7c0;
import defpackage.yac0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001kBS\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0012H\u0014¢\u0006\u0004\b)\u0010\u0017J\u000f\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b+\u0010,J\u001f\u00101\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u001b2\u0006\u00104\u001a\u000203H\u0014¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020&H\u0014¢\u0006\u0004\b7\u0010(J\u000f\u00108\u001a\u00020\u001bH\u0014¢\u0006\u0004\b8\u0010\u001dJ\u000f\u00109\u001a\u00020\u001bH\u0014¢\u0006\u0004\b9\u0010\u001dJ\u000f\u0010:\u001a\u00020\u001bH\u0014¢\u0006\u0004\b:\u0010\u001dJ\u000f\u0010;\u001a\u00020\u001bH\u0014¢\u0006\u0004\b;\u0010\u001dJ\u000f\u0010<\u001a\u00020\u001bH\u0014¢\u0006\u0004\b<\u0010\u001dJ\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020&H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0012H\u0014¢\u0006\u0004\bC\u0010\u0017J\u0013\u0010D\u001a\u00020\u001b*\u00020\u0002H\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u001bH\u0002¢\u0006\u0004\bF\u0010\u001dJ\u001f\u0010J\u001a\u00020\u00182\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020\u0012H\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u001b2\u0006\u0010L\u001a\u00020&H\u0002¢\u0006\u0004\bM\u0010BJ\u0013\u0010N\u001a\u00020\u0012*\u00020/H\u0002¢\u0006\u0004\bN\u0010OR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010PR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010PR\u001a\u0010\r\u001a\u00020\f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\r\u0010Q\u001a\u0004\bR\u0010SR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010TR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010UR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010VR\u0016\u0010C\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010VR\u0016\u0010[\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010VR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010a\u001a\u00020`8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0014\u0010e\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010\u0017R\u0014\u0010g\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010?R\u0014\u0010i\u001a\u00020&8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bh\u0010(R\u0014\u0010j\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010\u0017¨\u0006l"}, d2 = {"Lcom/yandex/go/places/impl/ui/main/DiscoveryMainModalView;", "Lcom/yandex/go/places/base/ui/modals/map/BasePlacesMapAwareModalView;", "Ltl80;", "Ltsj;", "Lp3v;", "Landroid/content/Context;", "context", "Lc2x0;", "systemBarsCoordinator", "Ljsj;", "nativeModalViewContentContainer", "flexModalViewContentContainer", "Lcom/yandex/go/places/impl/ui/main/d;", "presenter", "Lpav;", "imageLoader", "Lyac0;", "mapConfig", "", "isTabBarV2Enabled", "<init>", "(Landroid/content/Context;Lc2x0;Ljsj;Ljsj;Lcom/yandex/go/places/impl/ui/main/d;Lpav;Lyac0;Z)V", "isReadyForDelayedGone", "()Z", "", "screenName", "()Ljava/lang/String;", "Lzy11;", "onAppearAnimationComplete", "()V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "getTopPadding", "()I", "isApplyShadow", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ltl80;", "Lt1w;", "insets", "onInsetsHandled", "(Lt1w;)V", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "onAttachedToWindow", "onSlideOut", "onTouchOutside", "onBackPressed", "onDetachedFromWindow", "Landroid/view/View;", "getCardContainer", "()Landroid/view/View;", "newState", "onBottomSheetStateChanged", "(I)V", "shouldShowExpandedTopScrim", "setupOpenMapButton", "(Ltl80;)V", "setBottomSheetBackgroundColor", "Lbtj;", "tab", "isSelected", "getTabIconUrl", "(Lbtj;Z)Ljava/lang/String;", "bottomMargin", "setContainersBottomMargin", "hasMeasuredChild", "(Landroid/view/ViewGroup;)Z", "Ljsj;", "Lcom/yandex/go/places/impl/ui/main/d;", "getPresenter", "()Lcom/yandex/go/places/impl/ui/main/d;", "Lpav;", "Lyac0;", "Z", "Landroidx/recyclerview/widget/RecyclerView;", "nestedScrollingView", "Landroidx/recyclerview/widget/RecyclerView;", "isMapTabOpened", "hasRenderedUiState", "", "Lem80;", "tabViewBindings", "Ljava/util/List;", "Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "mapScreenId", "Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "getMapScreenId", "()Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "isMapEnabled", "getDelayedGoneLayoutReadyView", "delayedGoneLayoutReadyView", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "isMainScreenMapEnabled", "osj", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscoveryMainModalView extends BasePlacesMapAwareModalView<tl80, tsj> {
    public static final int $stable = 8;
    private final jsj flexModalViewContentContainer;
    private boolean hasRenderedUiState;
    private final pav imageLoader;
    private boolean isMapTabOpened;
    private final boolean isTabBarV2Enabled;
    private final yac0 mapConfig;
    private final PlacesMapConfig$PlacesMapScreenName mapScreenId;
    private final jsj nativeModalViewContentContainer;
    private RecyclerView nestedScrollingView;
    private final d presenter;
    private boolean shouldShowExpandedTopScrim;
    private final List<em80> tabViewBindings;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DiscoveryMainModalView(Context context, c2x0 c2x0Var, jsj jsjVar, jsj jsjVar2, d dVar, pav pavVar, yac0 yac0Var, boolean z) {
        super(context, r0, yac0Var, c2x0Var, dVar);
        fz20 bz20Var;
        Float f;
        if (!yac0Var.a || z) {
            bz20Var = new bz20(true);
        } else {
            wac0 a = yac0Var.a(PlacesMapConfig$PlacesMapScreenName.PLACES_MAIN);
            bz20Var = new ez20(new ry20((a == null || (f = a.d) == null) ? 376.0f : f.floatValue()), PlacesMapConfig$RevealingState.EXPANDED, new xr00(true, true, true), 5);
        }
        this.nativeModalViewContentContainer = jsjVar;
        this.flexModalViewContentContainer = jsjVar2;
        this.presenter = dVar;
        this.imageLoader = pavVar;
        this.mapConfig = yac0Var;
        this.isTabBarV2Enabled = z;
        tl80 tl80Var = (tl80) getBinding();
        jsjVar2.b(tl80Var.b);
        jsjVar.b(tl80Var.c);
        this.shouldShowExpandedTopScrim = true;
        this.tabViewBindings = new ArrayList();
        this.mapScreenId = PlacesMapConfig$PlacesMapScreenName.PLACES_MAIN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ tl80 access$getBinding(DiscoveryMainModalView discoveryMainModalView) {
        return (tl80) discoveryMainModalView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getTabIconUrl(btj tab, boolean isSelected) {
        return isSelected ? tab.c : tab.b;
    }

    private final boolean hasMeasuredChild(ViewGroup viewGroup) {
        if (viewGroup.getWidth() != 0 && viewGroup.getHeight() != 0) {
            Iterable n = y6i0.n(0, viewGroup.getChildCount());
            if ((n instanceof Collection) && ((Collection) n).isEmpty()) {
                return false;
            }
            Iterator it = n.iterator();
            while (it.hasNext()) {
                View childAt = viewGroup.getChildAt(((t5w) it).nextInt());
                if (childAt.getWidth() > 0 && childAt.getHeight() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean isMainScreenMapEnabled() {
        return isSlideable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBottomSheetBackgroundColor() {
        int t;
        if (this.isMapTabOpened) {
            t = getContext().getColor(mqg0.transparent);
        } else {
            t = qje.t(xng0.bgMain, getContext());
        }
        getBottomSheet().setBackgroundColor(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setContainersBottomMargin(int bottomMargin) {
        xw31.x(bottomMargin, this.flexModalViewContentContainer.a);
        xw31.x(bottomMargin, this.nativeModalViewContentContainer.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupOpenMapButton(tl80 tl80Var) {
        ShimmeringFrameLayout shimmeringFrameLayout = ((tl80) getBinding()).g;
        shimmeringFrameLayout.setShimmering(false);
        shimmeringFrameLayout.setRepeatCount(0);
        int r = this.isTabBarV2Enabled ? tje.r(dug0.discovery_map_button_with_tabs_bottom_margin, getContext()) : tje.r(dug0.discovery_map_button_without_tabs_bottom_margin, getContext());
        ViewGroup.LayoutParams layoutParams = shimmeringFrameLayout.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(0, 0, 0, r);
        shimmeringFrameLayout.setLayoutParams(marginLayoutParams);
        tl80Var.e.setDebounceClickListener(new uxh(19, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupOpenMapButton$lambda$1(DiscoveryMainModalView discoveryMainModalView) {
        if (discoveryMainModalView.isMainScreenMapEnabled()) {
            discoveryMainModalView.anchor();
            discoveryMainModalView.getPresenter().H.c();
            RecyclerView recyclerView = discoveryMainModalView.nestedScrollingView;
            if (recyclerView != null) {
                recyclerView.scrollToPosition(0);
            }
        }
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        setBottomSheetBackgroundColor();
        Iterator<T> it = this.tabViewBindings.iterator();
        while (it.hasNext()) {
            ((em80) it.next()).b.setImageTintList(ColorStateList.valueOf(qje.t(xng0.textMain, getContext())));
        }
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return getIsMapEnabled() ? mqg0.transparent : mqg0.black;
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public tl80 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(uuh0.organizations_discovery_main_modal_view, parent, false);
        int i = o6h0.inner_flex_container;
        ViewStub viewStub = (ViewStub) cma1.O(i, inflate);
        if (viewStub != null) {
            i = o6h0.inner_native_container;
            ViewStub viewStub2 = (ViewStub) cma1.O(i, inflate);
            if (viewStub2 != null) {
                i = o6h0.navbar_view;
                GoView goView = (GoView) cma1.O(i, inflate);
                if (goView != null) {
                    i = o6h0.open_map_button;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent != null) {
                        GoFrameLayout goFrameLayout = (GoFrameLayout) inflate;
                        i = o6h0.shimmering_layout;
                        ShimmeringFrameLayout shimmeringFrameLayout = (ShimmeringFrameLayout) cma1.O(i, inflate);
                        if (shimmeringFrameLayout != null) {
                            i = o6h0.tab_bar;
                            GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
                            if (goLinearLayout != null) {
                                return new tl80(goFrameLayout, viewStub, viewStub2, goView, buttonComponent, goFrameLayout, shimmeringFrameLayout, goLinearLayout);
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public View getCardContainer() {
        return ((tl80) getBinding()).f;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.r(dug0.discovery_organizations_search_header_radius, getContext());
    }

    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView, defpackage.n3v
    public View getDelayedGoneLayoutReadyView() {
        return this.nativeModalViewContentContainer.a;
    }

    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView, defpackage.p3v
    public PlacesMapConfig$PlacesMapScreenName getMapScreenId() {
        return this.mapScreenId;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return 0;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new d230(112);
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return false;
    }

    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView, defpackage.p3v
    /* renamed from: isMapEnabled */
    public boolean getIsMapEnabled() {
        return this.mapConfig.a(getMapScreenId()) != null;
    }

    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView, defpackage.n3v
    public boolean isReadyForDelayedGone() {
        if (this.hasRenderedUiState) {
            return !this.isMapTabOpened ? getWidth() > 0 && getHeight() > 0 : getWidth() > 0 && getHeight() > 0 && hasMeasuredChild(this.nativeModalViewContentContainer.a);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        if (isMainScreenMapEnabled()) {
            cma1.J(((tl80) getBinding()).g).setListener(new Animator.AnimatorListener() { // from class: com.yandex.go.places.impl.ui.main.DiscoveryMainModalView$onAppearAnimationComplete$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    ShimmeringFrameLayout shimmeringFrameLayout = DiscoveryMainModalView.access$getBinding(DiscoveryMainModalView.this).g;
                    shimmeringFrameLayout.setShimmering(true);
                    shimmeringFrameLayout.restartShimmering();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animation) {
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView, com.yandex.go.places.base.ui.modals.lifecycle.BasePlacesLifecycleAwareModalView, com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBackgroundColor();
        if (isMainScreenMapEnabled()) {
            setArrowState(ArrowsView.State.PLAIN);
        }
        d presenter = getPresenter();
        osj osjVar = new osj(this);
        presenter.Bg(osjVar);
        dac0 dac0Var = presenter.h0;
        y7c0 y7c0Var = presenter.E;
        jsj jsjVar = presenter.F;
        xsj xsjVar = new xsj(presenter, 0);
        presenter.q0 = dac0.a(dac0Var, y7c0Var, presenter.K, jsjVar, j73.f0(new nu[]{(com.yandex.go.places.common.flex.actions.web.a) presenter.m0.getValue(), (i3h) presenter.k0.getValue(), presenter.b0, presenter.c0, (w4c) presenter.l0.getValue()}), xsjVar, new c(presenter), presenter.a0, EmptySet.a, presenter.f0.a().a(), null, HProv.ALG_TYPE_SECURECHANNEL);
        tje.N(presenter.Jg(), null, null, new DiscoveryMainPresenter$attachView$1(presenter, osjVar, null), 3);
        if (isMainScreenMapEnabled()) {
            setupOpenMapButton((tl80) getBinding());
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        ((atj) getPresenter().D.a).r(new qu(9));
        super.onBackPressed();
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public void onBottomSheetStateChanged(int newState) {
        d presenter = getPresenter();
        boolean z = newState != 6;
        c9c0 c9c0Var = presenter.q0;
        if (c9c0Var != null) {
            c9c0Var.b0(z);
        }
    }

    @Override // com.yandex.go.places.base.ui.modals.lifecycle.BasePlacesLifecycleAwareModalView, com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.tabViewBindings.clear();
        getPresenter().Cg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView
    public void onInsetsHandled(t1w insets) {
        super.onInsetsHandled(insets);
        if (!this.isTabBarV2Enabled) {
            ((tl80) getBinding()).d.setVisibility(8);
            return;
        }
        xw31.E(((tl80) getBinding()).h, null, null, null, Integer.valueOf(insets.d));
        GoView goView = ((tl80) getBinding()).d;
        ru.yandex.taxi.design.utils.c.D(goView.getLayoutParams().width, insets.d, goView);
        ((tl80) getBinding()).d.setVisibility(0);
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        ((atj) getPresenter().D.a).r(new qu(9));
        super.onSlideOut();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return xw31.o(getRootView(), ((tl80) getBinding()).f, event) && !this.isMapTabOpened;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        ((atj) getPresenter().D.a).r(new qu(9));
        super.onTouchOutside();
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "DiscoveryMainModalView";
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    /* renamed from: shouldShowExpandedTopScrim, reason: from getter */
    public boolean getShouldShowExpandedTopScrim() {
        return this.shouldShowExpandedTopScrim;
    }

    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView, com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public d getPresenter() {
        return this.presenter;
    }
}
