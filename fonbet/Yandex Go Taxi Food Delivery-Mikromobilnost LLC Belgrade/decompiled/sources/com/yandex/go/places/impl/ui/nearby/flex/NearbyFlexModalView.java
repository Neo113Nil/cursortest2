package com.yandex.go.places.impl.ui.nearby.flex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$RevealingState;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.c2x0;
import defpackage.c9c0;
import defpackage.cma1;
import defpackage.dug0;
import defpackage.ez20;
import defpackage.ii30;
import defpackage.jsj;
import defpackage.mqg0;
import defpackage.nj50;
import defpackage.ny61;
import defpackage.o6h0;
import defpackage.oep0;
import defpackage.qdb1;
import defpackage.ro80;
import defpackage.sf30;
import defpackage.sj50;
import defpackage.sls;
import defpackage.tj50;
import defpackage.tje;
import defpackage.twa1;
import defpackage.ty20;
import defpackage.uuh0;
import defpackage.xr00;
import defpackage.yac0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001DB7\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001a\u0010\u0016J\u001d\u0010\u001e\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0017H\u0014¢\u0006\u0004\b#\u0010\u0019J\u000f\u0010$\u001a\u00020\u0017H\u0014¢\u0006\u0004\b$\u0010\u0019J\u001f\u0010)\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001cH\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001cH\u0014¢\u0006\u0004\b-\u0010,J\u0017\u0010/\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u0014H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u001cH\u0002¢\u0006\u0004\b1\u0010,R\u001a\u0010\n\u001a\u00020\t8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u00104R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00105R\u001c\u00106\u001a\u00020\u00148B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u0016R\u001a\u0010:\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b>\u0010\u0019R\u0018\u0010@\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0016¨\u0006E"}, d2 = {"Lcom/yandex/go/places/impl/ui/nearby/flex/NearbyFlexModalView;", "Lcom/yandex/go/places/base/ui/modals/map/BasePlacesMapAwareModalView;", "Lro80;", "Lsj50;", "Lp3v;", "Landroid/content/Context;", "context", "Lc2x0;", "systemBarsCoordinator", "Ltj50;", "presenter", "Ljsj;", "flexContentContainer", "Lyac0;", "mapConfig", "<init>", "(Landroid/content/Context;Lc2x0;Ltj50;Ljsj;Lyac0;)V", "", "screenName", "()Ljava/lang/String;", "", "getTopPadding", "()I", "", "isApplyShadow", "()Z", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lkotlin/Function0;", "Lzy11;", "listener", "setAppearAnimationCompleteListener", "(Lsls;)V", "Landroid/view/View;", "getCardContainer", "()Landroid/view/View;", "canDragToExpandFromAnchored", "shouldShowExpandedTopScrim", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lro80;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "newState", "onBottomSheetStateChanged", "(I)V", "calculateContainerHeights", "Ltj50;", "getPresenter", "()Ltj50;", "Ljsj;", "minItemsContainerHeight", CA20Status.STATUS_USER_I, "getMinItemsContainerHeight", "Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "mapScreenId", "Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "getMapScreenId", "()Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "isMapEnabled", "Z", "externalLocationButton", "Landroid/view/View;", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "nj50", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NearbyFlexModalView extends BasePlacesMapAwareModalView<ro80, sj50> {
    public static final int $stable = 8;
    private View externalLocationButton;
    private final jsj flexContentContainer;
    private final boolean isMapEnabled;
    private final PlacesMapConfig$PlacesMapScreenName mapScreenId;
    private int minItemsContainerHeight;
    private final tj50 presenter;

    /* JADX WARN: Multi-variable type inference failed */
    public NearbyFlexModalView(Context context, c2x0 c2x0Var, tj50 tj50Var, jsj jsjVar, yac0 yac0Var) {
        super(context, new ez20(null, null, new ty20(1.0f), PlacesMapConfig$RevealingState.ANCHORED, false, new xr00(true, true, true)), yac0Var, c2x0Var, tj50Var);
        this.presenter = tj50Var;
        this.flexContentContainer = jsjVar;
        this.mapScreenId = PlacesMapConfig$PlacesMapScreenName.PLACES_NEARBY;
        this.isMapEnabled = true;
        jsjVar.b(((ro80) getBinding()).b);
        setTopSystemWindowInset(tje.r(dug0.discovery_organizations_nearby_top_inset, getContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void calculateContainerHeights() {
        OneShotPreDrawListener.add(this, new ii30(7, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMinItemsContainerHeight() {
        int i = this.minItemsContainerHeight;
        if (i <= 0) {
            return -1;
        }
        return i;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ro80 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(uuh0.organizations_nearby_flex_modal_view, parent, false);
        int i = o6h0.inner_flex_container;
        ViewStub viewStub = (ViewStub) cma1.O(i, inflate);
        if (viewStub != null) {
            i = o6h0.places_nearby_card_container;
            GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
            if (goFrameLayout != null) {
                return new ro80((GoFrameLayout) inflate, viewStub, goFrameLayout);
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
        return ((ro80) getBinding()).c;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.r(dug0.discovery_organizations_nearby_header_radius, getContext());
    }

    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView, defpackage.p3v
    public PlacesMapConfig$PlacesMapScreenName getMapScreenId() {
        return this.mapScreenId;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return 0;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return false;
    }

    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView, defpackage.p3v
    /* renamed from: isMapEnabled, reason: from getter */
    public boolean getIsMapEnabled() {
        return this.isMapEnabled;
    }

    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView, com.yandex.go.places.base.ui.modals.lifecycle.BasePlacesLifecycleAwareModalView, com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tj50 presenter = getPresenter();
        presenter.Bg(new nj50(this));
        presenter.Gg();
        oep0.b(presenter.O, (c9c0) presenter.T.getValue());
        tje.N(presenter.Jg(), null, null, new NearbyFlexPresenter$attachView$1(presenter, null), 3);
        calculateContainerHeights();
        attachBackButton(new NearbyFlexModalView$onAttachedToWindow$1(0, getPresenter(), tj50.class, "back", "back()V", 0));
        this.externalLocationButton = qdb1.d(this, new sf30(14, getPresenter()));
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public void onBottomSheetStateChanged(int newState) {
        getBottomSheetBehavior().M = null;
        if (newState != 3) {
            if (newState == 4 || newState == 6) {
                getRightSideButtonsContainer().setVisibility(0);
                View view = this.externalLocationButton;
                if (view != null) {
                    twa1.i(view);
                }
                getRightSideButtonsContainer().updateLocationFocusingButtonVisibility(true);
                return;
            }
            if (newState != 7) {
                return;
            }
        }
        getRightSideButtonsContainer().setVisibility(8);
        View view2 = this.externalLocationButton;
        if (view2 != null) {
            twa1.h(view2);
        }
        getRightSideButtonsContainer().updateLocationFocusingButtonVisibility(false);
    }

    @Override // com.yandex.go.places.base.ui.modals.lifecycle.BasePlacesLifecycleAwareModalView, com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getPresenter().Cg();
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "NearbyFlexModalView";
    }

    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView
    public void setAppearAnimationCompleteListener(sls listener) {
        setOneShotAppearAnimationCompleteListener(listener);
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    /* renamed from: shouldShowExpandedTopScrim */
    public boolean getShouldShowExpandedTopScrim() {
        return false;
    }

    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView, com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public tj50 getPresenter() {
        return this.presenter;
    }
}
