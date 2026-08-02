package com.yandex.go.places.impl.ui.organizations.v2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$DiscoveryOrganisationListActionType;
import com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView;
import com.yandex.go.places.base.ui.views.MapButtonsView;
import com.yandex.go.places.common.ui.FilterButtonView;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$RevealingState;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bm50;
import defpackage.bn80;
import defpackage.c2x0;
import defpackage.cma1;
import defpackage.cn80;
import defpackage.dug0;
import defpackage.e3h0;
import defpackage.ez20;
import defpackage.go80;
import defpackage.h8;
import defpackage.i3y;
import defpackage.jio;
import defpackage.jl40;
import defpackage.jsj;
import defpackage.lec0;
import defpackage.ln80;
import defpackage.mec0;
import defpackage.mn80;
import defpackage.mqg0;
import defpackage.mth;
import defpackage.nec0;
import defpackage.nn80;
import defpackage.ny61;
import defpackage.o6h0;
import defpackage.oec0;
import defpackage.oep0;
import defpackage.on80;
import defpackage.pn80;
import defpackage.pzt0;
import defpackage.qu;
import defpackage.rn80;
import defpackage.ry20;
import defpackage.sls;
import defpackage.tbh;
import defpackage.tje;
import defpackage.ty20;
import defpackage.uuh0;
import defpackage.v66;
import defpackage.w511;
import defpackage.w8s0;
import defpackage.wac0;
import defpackage.xr00;
import defpackage.yac0;
import defpackage.yn80;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 h2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002ijBS\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010!\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b'\u0010(J\u001f\u0010-\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001fH\u0014¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u001fH\u0014¢\u0006\u0004\b1\u00100J\u0017\u00103\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u001aH\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001fH\u0002¢\u0006\u0004\b5\u00100J\u0017\u00107\u001a\u00020\u001f2\u0006\u00106\u001a\u00020&H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u001fH\u0002¢\u0006\u0004\b9\u00100J\u0017\u0010<\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0019\u0010?\u001a\u0004\u0018\u00010#2\u0006\u0010>\u001a\u00020#H\u0002¢\u0006\u0004\b?\u0010@J\u0013\u0010A\u001a\u00020\u001f*\u00020#H\u0002¢\u0006\u0004\bA\u0010BJ\u0019\u0010C\u001a\u0004\u0018\u00010#2\u0006\u0010>\u001a\u00020#H\u0002¢\u0006\u0004\bC\u0010@J\u0017\u0010E\u001a\u00020&2\u0006\u0010D\u001a\u00020\u001aH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u001fH\u0002¢\u0006\u0004\bG\u00100R\u001a\u0010\n\u001a\u00020\t8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\bI\u0010JR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010KR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010LR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010MR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010NR\u001b\u0010T\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001c\u0010W\u001a\u00020\u001a8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010\u001cR\u0016\u0010Z\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010[R\u0016\u0010_\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010[R\u001a\u0010a\u001a\u00020`8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010e\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\be\u0010[\u001a\u0004\be\u0010(R\u0014\u0010g\u001a\u00020\u001a8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bf\u0010\u001c¨\u0006k"}, d2 = {"Lcom/yandex/go/places/impl/ui/organizations/v2/OrganizationsListV2ModalView;", "Lcom/yandex/go/places/base/ui/modals/map/BasePlacesMapAwareModalView;", "Lpn80;", "Lrn80;", "Lp3v;", "Landroid/content/Context;", "context", "Lc2x0;", "systemBarsCoordinator", "Lcom/yandex/go/places/impl/ui/organizations/v2/f;", "presenter", "Lwac0;", "mapScreenConfigV2", "Ljsj;", "flexContentContainer", "Ljio;", "evgenPlacesAnalyticsProxy", "Lcn80;", "organizationsListParamsRepository", "Lyac0;", "mapConfig", "<init>", "(Landroid/content/Context;Lc2x0;Lcom/yandex/go/places/impl/ui/organizations/v2/f;Lwac0;Ljsj;Ljio;Lcn80;Lyac0;)V", "", "screenName", "()Ljava/lang/String;", "", "getTopPadding", "()I", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lkotlin/Function0;", "Lzy11;", "listener", "setAppearAnimationCompleteListener", "(Lsls;)V", "Landroid/view/View;", "getCardContainer", "()Landroid/view/View;", "", "canDragToExpandFromAnchored", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lpn80;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "newState", "onBottomSheetStateChanged", "(I)V", "calculateContainerHeights", "isExpanded", "updateExpandedState", "(Z)V", "updateSlidableViewWidthVariable", "Loec0;", "mode", "renderSearchbar", "(Loec0;)V", "view", "getScrollableView", "(Landroid/view/View;)Landroid/view/View;", "disableNestedScrollOnInnerRecyclers", "(Landroid/view/View;)V", "findScrollableView", ClidProvider.STATE, "shouldWireFlexToBottomSheet", "(I)Z", "updateNestedScrollView", "Lcom/yandex/go/places/impl/ui/organizations/v2/f;", "getPresenter", "()Lcom/yandex/go/places/impl/ui/organizations/v2/f;", "Lwac0;", "Ljsj;", "Ljio;", "Lcn80;", "Lcom/yandex/go/places/common/ui/FilterButtonView;", "organizationsListFilterButtonView$delegate", "Li3y;", "getOrganizationsListFilterButtonView", "()Lcom/yandex/go/places/common/ui/FilterButtonView;", "organizationsListFilterButtonView", "mainScrollableView", "Landroid/view/View;", "minItemsContainerHeight", CA20Status.STATUS_USER_I, "getMinItemsContainerHeight", "isErrorStateVisible", "Z", "canDragBeforeErrorState", "Ljava/lang/Boolean;", "isModalExpanded", "isCameraMovedByUser", "Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "mapScreenId", "Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "getMapScreenId", "()Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "isMapEnabled", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "Companion", "nn80", "mn80", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationsListV2ModalView extends BasePlacesMapAwareModalView<pn80, rn80> {
    public static final int $stable = 8;
    private static final mn80 Companion = new mn80();

    @Deprecated
    public static final float DEFAULT_MIN_SCREEN_HEIGHT = 146.0f;
    private Boolean canDragBeforeErrorState;
    private final jio evgenPlacesAnalyticsProxy;
    private final jsj flexContentContainer;
    private boolean isCameraMovedByUser;
    private boolean isErrorStateVisible;
    private final boolean isMapEnabled;
    private boolean isModalExpanded;
    private View mainScrollableView;
    private final wac0 mapScreenConfigV2;
    private final PlacesMapConfig$PlacesMapScreenName mapScreenId;
    private int minItemsContainerHeight;

    /* renamed from: organizationsListFilterButtonView$delegate, reason: from kotlin metadata */
    private final i3y organizationsListFilterButtonView;
    private final cn80 organizationsListParamsRepository;
    private final f presenter;

    /* JADX WARN: Multi-variable type inference failed */
    public OrganizationsListV2ModalView(Context context, c2x0 c2x0Var, f fVar, wac0 wac0Var, jsj jsjVar, jio jioVar, cn80 cn80Var, yac0 yac0Var) {
        super(context, new ez20(new ry20(146.0f), (wac0Var == null || (r0 = wac0Var.e) == null) ? (wac0Var == null || (r0 = wac0Var.d) == null) ? null : new ry20(r0.floatValue()) : new ty20(r0.floatValue()), new ty20(1.0f), PlacesMapConfig$RevealingState.ANCHORED, false, new xr00(true, true, true)), yac0Var, c2x0Var, fVar);
        Float f;
        Float f2;
        this.presenter = fVar;
        this.mapScreenConfigV2 = wac0Var;
        this.flexContentContainer = jsjVar;
        this.evgenPlacesAnalyticsProxy = jioVar;
        this.organizationsListParamsRepository = cn80Var;
        this.organizationsListFilterButtonView = kotlin.a.b(LazyThreadSafetyMode.NONE, new bm50(19, context, this));
        this.mapScreenId = PlacesMapConfig$PlacesMapScreenName.PLACES_ORGANIZATIONS_LIST_V2;
        this.isMapEnabled = true;
        jsjVar.b(((pn80) getBinding()).b);
    }

    private final void calculateContainerHeights() {
        OneShotPreDrawListener.add(this, new on80(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disableNestedScrollOnInnerRecyclers(View view) {
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).setNestedScrollingEnabled(false);
        }
        if (view instanceof ViewGroup) {
            h8 h8Var = new h8(3, (ViewGroup) view);
            while (h8Var.hasNext()) {
                disableNestedScrollOnInnerRecyclers((View) h8Var.next());
            }
        }
    }

    private final View findScrollableView(View view) {
        if (view instanceof RecyclerView) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View findScrollableView = findScrollableView(viewGroup.getChildAt(i));
            if (findScrollableView != null) {
                return findScrollableView;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMinItemsContainerHeight() {
        int i = this.minItemsContainerHeight;
        if (i <= 0) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FilterButtonView getOrganizationsListFilterButtonView() {
        return (FilterButtonView) this.organizationsListFilterButtonView.getValue();
    }

    private final View getScrollableView(View view) {
        View findScrollableView = findScrollableView(view);
        int i = 1;
        if (findScrollableView != null) {
            findScrollableView.setNestedScrollingEnabled(true);
        } else {
            findScrollableView = null;
        }
        if (this.mainScrollableView != findScrollableView) {
            this.mainScrollableView = findScrollableView;
            RecyclerView recyclerView = findScrollableView instanceof RecyclerView ? (RecyclerView) findScrollableView : null;
            if (recyclerView != null) {
                recyclerView.addOnChildAttachStateChangeListener(new tbh(this, i));
            }
        }
        RecyclerView recyclerView2 = findScrollableView instanceof RecyclerView ? (RecyclerView) findScrollableView : null;
        if (recyclerView2 != null) {
            int i2 = 0;
            while (true) {
                if (!(i2 < recyclerView2.getChildCount())) {
                    break;
                }
                int i3 = i2 + 1;
                View childAt = recyclerView2.getChildAt(i2);
                if (childAt == null) {
                    ny61.s();
                    return null;
                }
                disableNestedScrollOnInnerRecyclers(childAt);
                i2 = i3;
            }
        }
        return findScrollableView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$1(OrganizationsListV2ModalView organizationsListV2ModalView) {
        jio jioVar = organizationsListV2ModalView.evgenPlacesAnalyticsProxy;
        DiscoveryAnalytics$DiscoveryOrganisationListActionType discoveryAnalytics$DiscoveryOrganisationListActionType = DiscoveryAnalytics$DiscoveryOrganisationListActionType.Back;
        bn80 bn80Var = (bn80) organizationsListV2ModalView.organizationsListParamsRepository.a.getValue();
        jioVar.f(discoveryAnalytics$DiscoveryOrganisationListActionType, bn80Var != null ? bn80Var.a : null);
        f presenter = organizationsListV2ModalView.getPresenter();
        pzt0 pzt0Var = presenter.b0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        presenter.b0 = null;
        ((yn80) presenter.G.b).r(new qu(9));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FilterButtonView organizationsListFilterButtonView_delegate$lambda$0(Context context, OrganizationsListV2ModalView organizationsListV2ModalView) {
        FilterButtonView filterButtonView = new FilterButtonView(context, e3h0.ic_places_filter, new ln80(organizationsListV2ModalView, 1));
        filterButtonView.setVisibility(8);
        return filterButtonView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 organizationsListFilterButtonView_delegate$lambda$0$0(OrganizationsListV2ModalView organizationsListV2ModalView) {
        jio jioVar = organizationsListV2ModalView.evgenPlacesAnalyticsProxy;
        DiscoveryAnalytics$DiscoveryOrganisationListActionType discoveryAnalytics$DiscoveryOrganisationListActionType = DiscoveryAnalytics$DiscoveryOrganisationListActionType.Filter;
        bn80 bn80Var = (bn80) organizationsListV2ModalView.organizationsListParamsRepository.a.getValue();
        jioVar.f(discoveryAnalytics$DiscoveryOrganisationListActionType, bn80Var != null ? bn80Var.a : null);
        f presenter = organizationsListV2ModalView.getPresenter();
        w8s0 w8s0Var = presenter.k0;
        if (w8s0Var != null) {
            presenter.D.c.handleAction(w8s0Var);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderSearchbar(oec0 mode) {
        getPresenter().Ng();
        if (jl40.l(mode, mec0.a)) {
            getPresenter().Og(this, false, null);
            return;
        }
        if (mode instanceof nec0) {
            v66 v66Var = ((nec0) mode).a;
            v66Var.b(getChildAt(0));
            getPresenter().Og(this, true, v66Var);
        } else {
            if (jl40.l(mode, lec0.a)) {
                return;
            }
            w511.b();
        }
    }

    private final boolean shouldWireFlexToBottomSheet(int state) {
        return state == 3 || state == 7 || state == 1 || state == 2;
    }

    private final void updateExpandedState(boolean isExpanded) {
        if (this.isModalExpanded == isExpanded) {
            return;
        }
        this.isModalExpanded = isExpanded;
        if (isExpanded) {
            getPresenter().Pg(true);
        } else {
            getPresenter().Pg(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNestedScrollView() {
        getBottomSheetBehavior().M = null;
        ViewGroup viewGroup = this.flexContentContainer.a;
        if (shouldWireFlexToBottomSheet(getBottomSheetBehavior().E)) {
            getBottomSheetBehavior().L(getScrollableView(viewGroup));
        }
    }

    private final void updateSlidableViewWidthVariable() {
        OneShotPreDrawListener.add(this, new on80(this, 1));
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public pn80 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(uuh0.organizations_list_v2_modal_view, parent, false);
        int i = o6h0.inner_flex_container;
        ViewStub viewStub = (ViewStub) cma1.O(i, inflate);
        if (viewStub != null) {
            i = o6h0.organizations_list_v2_card_container;
            GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
            if (goFrameLayout != null) {
                return new pn80((GoFrameLayout) inflate, viewStub, goFrameLayout);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public View getCardContainer() {
        return ((pn80) getBinding()).c;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.r(dug0.discovery_organizations_list_v2_header_radius, getContext());
    }

    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView, defpackage.p3v
    public PlacesMapConfig$PlacesMapScreenName getMapScreenId() {
        return this.mapScreenId;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return 0;
    }

    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView, defpackage.p3v
    /* renamed from: isMapEnabled, reason: from getter */
    public boolean getIsMapEnabled() {
        return this.isMapEnabled;
    }

    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView, com.yandex.go.places.base.ui.modals.lifecycle.BasePlacesLifecycleAwareModalView, com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MapButtonsView rightSideButtonsContainer = getRightSideButtonsContainer();
        int i = 0;
        rightSideButtonsContainer.updateZoomButtonsVisibility(false);
        rightSideButtonsContainer.updateLocationFocusingButtonVisibility(false);
        rightSideButtonsContainer.addAdditionalButtonView(getOrganizationsListFilterButtonView());
        f presenter = getPresenter();
        nn80 nn80Var = new nn80(this);
        go80 go80Var = presenter.O;
        presenter.Bg(nn80Var);
        presenter.Gg();
        oep0.b(presenter.N, presenter.Mg());
        pzt0 pzt0Var = presenter.a0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        int i2 = 4;
        presenter.a0 = tje.N(presenter.Jg(), null, null, new OrganizationsListV2Presenter$subscribeToBboxUpdates$$inlined$safeCollectIn$1(new e(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.p(new mth(new com.yandex.go.places.map.data.repositories.d(go80Var.b(), go80Var), i2), 750L)), presenter), null, presenter), 3);
        tje.N(presenter.Jg(), null, null, new OrganizationsListV2Presenter$subscribeToBboxZoom$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.T(new mth(presenter.c0, 6), 1), null, presenter), 3);
        pzt0 pzt0Var2 = presenter.b0;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        presenter.b0 = tje.N(presenter.Jg(), null, null, new OrganizationsListV2Presenter$subscribeToCameraState$$inlined$safeCollectIn$1(new mth(go80Var.b(), i2), null, presenter), 3);
        tje.N(presenter.Jg(), null, null, new OrganizationsListV2Presenter$attachView$$inlined$collectIn$1(go80Var.c, null, nn80Var), 3);
        tje.N(presenter.Jg(), null, null, new OrganizationsListV2Presenter$attachView$2(presenter, null), 3);
        tje.N(presenter.Jg(), null, null, new OrganizationsListV2Presenter$attachView$$inlined$safeCollectIn$1(presenter.D.b.a(), null, presenter), 3);
        calculateContainerHeights();
        updateSlidableViewWidthVariable();
        attachBackButton(new ln80(this, i));
        getPresenter().Pg(false);
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public void onBottomSheetStateChanged(int newState) {
        f presenter = getPresenter();
        boolean shouldWireFlexToBottomSheet = shouldWireFlexToBottomSheet(newState);
        presenter.Z = shouldWireFlexToBottomSheet;
        if (presenter.W != shouldWireFlexToBottomSheet) {
            presenter.W = shouldWireFlexToBottomSheet;
            presenter.Mg().b0(presenter.W);
        }
        if (newState == 1) {
            updateExpandedState(false);
            return;
        }
        if (newState != 3) {
            if (newState == 4) {
                getRightSideButtonsContainer().updateLocationFocusingButtonVisibility(true);
                updateNestedScrollView();
                updateExpandedState(false);
                return;
            } else if (newState == 6) {
                getRightSideButtonsContainer().updateLocationFocusingButtonVisibility(this.isCameraMovedByUser);
                updateNestedScrollView();
                updateExpandedState(false);
                return;
            } else if (newState != 7) {
                return;
            }
        }
        getRightSideButtonsContainer().updateLocationFocusingButtonVisibility(this.isCameraMovedByUser);
        updateNestedScrollView();
        updateExpandedState(true);
    }

    @Override // com.yandex.go.places.base.ui.modals.lifecycle.BasePlacesLifecycleAwareModalView, com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getPresenter().Cg();
        this.mainScrollableView = null;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "OrganizationsListV2ModalView";
    }

    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView
    public void setAppearAnimationCompleteListener(sls listener) {
        setOneShotAppearAnimationCompleteListener(listener);
    }

    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView, com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public f getPresenter() {
        return this.presenter;
    }
}
