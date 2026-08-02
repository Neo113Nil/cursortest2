package com.yandex.go.places.organization.card.impl.ui.card.flex.v1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.OneShotPreDrawListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$RevealingState;
import com.yandex.go.places.organization.card.impl.ui.card.common.BaseOrganizationCardModalView;
import defpackage.af80;
import defpackage.c2x0;
import defpackage.c9c0;
import defpackage.cma1;
import defpackage.ii30;
import defpackage.jsj;
import defpackage.kbc0;
import defpackage.lf80;
import defpackage.mth;
import defpackage.ne80;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.of80;
import defpackage.q6h0;
import defpackage.qe80;
import defpackage.re80;
import defpackage.ti80;
import defpackage.tje;
import defpackage.vuh0;
import defpackage.yac0;
import defpackage.ye80;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001SBÁ\u0001\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\t\u0012\b\b\u0001\u0010\r\u001a\u00020\t\u0012\b\b\u0001\u0010\u000e\u001a\u00020\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u000201H\u0016¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u000201H\u0016¢\u0006\u0004\b5\u00103J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020%H\u0014¢\u0006\u0004\b9\u0010'J\u000f\u0010:\u001a\u00020%H\u0014¢\u0006\u0004\b:\u0010'J\u0017\u0010<\u001a\u00020%2\u0006\u0010;\u001a\u00020\u000fH\u0014¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010>R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010?R\u001a\u0010\u001c\u001a\u00020\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010C\u001a\u00020\u000f8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010G\u001a\u00020\u000f8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010M\u001a\u00020L8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v1/OrganizationCardFlexModalView;", "Lcom/yandex/go/places/organization/card/impl/ui/card/common/BaseOrganizationCardModalView;", "Lre80;", "Lye80;", "Lpey;", "Landroid/content/Context;", "context", "Lc2x0;", "systemBarsCoordinator", "", "shouldOpenFullscreenOnStart", "isCollapsable", "shouldHideGeoButton", "shouldHideZoomButtons", "isExternalMapEnabled", "", "anchoredHeight", "", "anchoredHeightAsScreenPercent", "Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$RevealingState;", "initialRevealingState", "minHeight", "maxHeightRatio", "Llf80;", "galleryConfig", "Ljsj;", "flexOrganizationCardContainer", "Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v1/c;", "presenter", "Lof80;", "organizationCardGalleryViewFactory", "Lyac0;", "mapConfig", "Lkbc0;", "placesMapScreenParamsOverride", "<init>", "(Landroid/content/Context;Lc2x0;ZZZZZLjava/lang/Integer;Ljava/lang/Float;Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$RevealingState;Ljava/lang/Float;Ljava/lang/Float;Llf80;Ljsj;Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v1/c;Lof80;Lyac0;Lkbc0;)V", "Lzy11;", "calculateContainerHeights", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lre80;", "", "screenName", "()Ljava/lang/String;", "Landroid/view/View;", "getCardContainer", "()Landroid/view/View;", "getCardContent", "getCardCloseButton", "Landroid/view/ViewStub;", "getCardGalleryViewStub", "()Landroid/view/ViewStub;", "onAttachedToWindow", "onDetachedFromWindow", "newState", "onBottomSheetStateChanged", "(I)V", "Llf80;", "Ljsj;", "Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v1/c;", "getPresenter", "()Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v1/c;", "minItemsContainerHeight", CA20Status.STATUS_USER_I, "getMinItemsContainerHeight", "()I", "minItemsErrorContainerHeight", "getMinItemsErrorContainerHeight", "Landroidx/lifecycle/t;", "lifecycleRegistry", "Landroidx/lifecycle/t;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "skipFirstCollapsed", "Z", "qe80", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationCardFlexModalView extends BaseOrganizationCardModalView<re80, ye80> {
    public static final int $stable = 8;
    private final jsj flexOrganizationCardContainer;
    private final lf80 galleryConfig;
    private final Lifecycle lifecycle;
    private final t lifecycleRegistry;
    private int minItemsContainerHeight;
    private int minItemsErrorContainerHeight;
    private final c presenter;
    private boolean skipFirstCollapsed;

    /* JADX WARN: Multi-variable type inference failed */
    public OrganizationCardFlexModalView(Context context, c2x0 c2x0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, Float f, PlacesMapConfig$RevealingState placesMapConfig$RevealingState, Float f2, Float f3, lf80 lf80Var, jsj jsjVar, c cVar, of80 of80Var, yac0 yac0Var, kbc0 kbc0Var) {
        super(context, cVar, c2x0Var, z, z2, z3, z4, num, f, placesMapConfig$RevealingState, f2, f3, lf80Var, of80Var, yac0Var, kbc0Var, z5);
        this.galleryConfig = lf80Var;
        this.flexOrganizationCardContainer = jsjVar;
        this.presenter = cVar;
        boolean z6 = true;
        t tVar = new t(this, true);
        this.lifecycleRegistry = tVar;
        this.lifecycle = tVar;
        if (placesMapConfig$RevealingState != PlacesMapConfig$RevealingState.COLLAPSED && placesMapConfig$RevealingState != PlacesMapConfig$RevealingState.ANCHORED) {
            z6 = false;
        }
        this.skipFirstCollapsed = z6;
        jsjVar.b(((re80) getBinding()).d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ re80 access$getBinding(OrganizationCardFlexModalView organizationCardFlexModalView) {
        return (re80) organizationCardFlexModalView.getBinding();
    }

    private final void calculateContainerHeights() {
        OneShotPreDrawListener.add(this, new ii30(11, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMinItemsContainerHeight() {
        int i = this.minItemsContainerHeight;
        if (i <= 0) {
            return -1;
        }
        return i;
    }

    private final int getMinItemsErrorContainerHeight() {
        int i = this.minItemsErrorContainerHeight;
        if (i <= 0) {
            return -1;
        }
        return i;
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public re80 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(vuh0.organization_card_flex_modal_view, parent, false);
        int i = q6h0.close_button;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
        if (appCompatImageView != null) {
            i = q6h0.images_slider_layout;
            ViewStub viewStub = (ViewStub) cma1.O(i, inflate);
            if (viewStub != null) {
                i = q6h0.inner_flex_container;
                ViewStub viewStub2 = (ViewStub) cma1.O(i, inflate);
                if (viewStub2 != null) {
                    i = q6h0.items_layout;
                    FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                    if (frameLayout != null) {
                        i = q6h0.organization_card_container;
                        PlacesOrganizationCardNestedScrollView placesOrganizationCardNestedScrollView = (PlacesOrganizationCardNestedScrollView) cma1.O(i, inflate);
                        if (placesOrganizationCardNestedScrollView != null) {
                            return new re80((GoFrameLayout) inflate, appCompatImageView, viewStub, viewStub2, frameLayout, placesOrganizationCardNestedScrollView);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.organization.card.impl.ui.card.common.BaseOrganizationCardModalView
    public View getCardCloseButton() {
        return ((re80) getBinding()).b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.organization.card.impl.ui.card.common.BaseOrganizationCardModalView
    public View getCardContainer() {
        return ((re80) getBinding()).f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.organization.card.impl.ui.card.common.BaseOrganizationCardModalView
    public View getCardContent() {
        return ((re80) getBinding()).e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.organization.card.impl.ui.card.common.BaseOrganizationCardModalView
    public ViewStub getCardGalleryViewStub() {
        return ((re80) getBinding()).c;
    }

    @Override // com.yandex.go.places.base.ui.base_old.lifecycle.BasePlacesLifecycleAwareModalView, defpackage.pey
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @Override // com.yandex.go.places.organization.card.impl.ui.card.common.BaseOrganizationCardModalView, com.yandex.go.places.base.ui.base_old.lifecycle.BasePlacesLifecycleAwareModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c presenter = getPresenter();
        qe80 qe80Var = new qe80(this);
        presenter.Bg(qe80Var);
        presenter.Gg();
        oep0.b(presenter.b0, (c9c0) presenter.p0.getValue());
        tje.N(presenter.Jg(), null, null, new OrganizationCardFlexPresenter$attachView$$inlined$safeCollectIn$1(new mth(new mth(presenter.J.b, 4), 6), null, qe80Var, presenter), 3);
        calculateContainerHeights();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.organization.card.impl.ui.card.common.BaseOrganizationCardModalView
    public void onBottomSheetStateChanged(int newState) {
        if (newState != 3) {
            if (newState == 4 || newState == 6) {
                getBottomSheetBehavior().M = null;
                ((re80) getBinding()).f.setNestedScrollingEnabled(false);
                if (this.skipFirstCollapsed) {
                    this.skipFirstCollapsed = false;
                    return;
                }
                c presenter = getPresenter();
                com.yandex.go.places.analytics.organization.card.a aVar = presenter.Z;
                af80 af80Var = presenter.J;
                ne80 ne80Var = (ne80) af80Var.a.getValue();
                ti80 ti80Var = ne80Var != null ? ne80Var.a : null;
                ne80 ne80Var2 = (ne80) af80Var.a.getValue();
                aVar.p(ti80Var, ne80Var2 != null ? ne80Var2.b : null, "Discovery.OrganisationCard.Collapsed");
                return;
            }
            if (newState != 7) {
                return;
            }
        }
        getBottomSheetBehavior().L(((re80) getBinding()).f);
        ((re80) getBinding()).f.setNestedScrollingEnabled(true);
        c presenter2 = getPresenter();
        com.yandex.go.places.analytics.organization.card.a aVar2 = presenter2.Z;
        af80 af80Var2 = presenter2.J;
        ne80 ne80Var3 = (ne80) af80Var2.a.getValue();
        ti80 ti80Var2 = ne80Var3 != null ? ne80Var3.a : null;
        ne80 ne80Var4 = (ne80) af80Var2.a.getValue();
        aVar2.p(ti80Var2, ne80Var4 != null ? ne80Var4.b : null, "Discovery.OrganisationCard.Expanded");
    }

    @Override // com.yandex.go.places.organization.card.impl.ui.card.common.BaseOrganizationCardModalView, com.yandex.go.places.base.ui.base_old.lifecycle.BasePlacesLifecycleAwareModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getPresenter().Cg();
    }

    @Override // com.yandex.go.places.base.ui.base_old.BaseOrganizationDiscoveryModalView, ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "OrganizationCardFlexModalView";
    }

    @Override // com.yandex.go.places.organization.card.impl.ui.card.common.BaseOrganizationCardModalView, com.yandex.go.places.base.ui.base_old.BaseOrganizationDiscoveryModalView
    public c getPresenter() {
        return this.presenter;
    }
}
