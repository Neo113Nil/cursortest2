package com.yandex.go.places.organization.card.impl.ui.card.common;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.yandex.go.places.api.navigation.CardRevealing;
import com.yandex.go.places.base.ui.base_old.lifecycle.BasePlacesLifecycleAwareModalView;
import com.yandex.go.places.base.ui.base_old.map.MapControlButtonsContainerView;
import com.yandex.go.places.common.ui.ControlButtonView;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$RevealingState;
import com.yandex.go.places.organization.card.impl.ui.card.common.BaseOrganizationCardModalView;
import com.yandex.go.places.organization.card.impl.ui.gallery.OrganizationCardGalleryView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.c230;
import defpackage.c2x0;
import defpackage.d2x0;
import defpackage.dzg0;
import defpackage.fug0;
import defpackage.gus;
import defpackage.i3y;
import defpackage.i65;
import defpackage.ip11;
import defpackage.kbc0;
import defpackage.lab1;
import defpackage.lf80;
import defpackage.mh3;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.mzh0;
import defpackage.n5;
import defpackage.ny61;
import defpackage.of80;
import defpackage.p3v;
import defpackage.p7c0;
import defpackage.pav;
import defpackage.pf80;
import defpackage.qje;
import defpackage.sls;
import defpackage.t1w;
import defpackage.tje;
import defpackage.twa1;
import defpackage.v55;
import defpackage.w511;
import defpackage.wac0;
import defpackage.x55;
import defpackage.xg00;
import defpackage.xng0;
import defpackage.xtg0;
import defpackage.xw31;
import defpackage.y55;
import defpackage.yac0;
import defpackage.zac0;
import defpackage.zo31;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0010\b\u0001\u0010\u0006*\u00020\u0003*\u00020\u0004*\u00020\u00052\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u00020\bB¡\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010$\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H&¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020'H&¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020'H&¢\u0006\u0004\b+\u0010)J\u000f\u0010-\u001a\u00020,H&¢\u0006\u0004\b-\u0010.J\u001d\u00102\u001a\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0014¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0014H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0014H\u0014¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\u000fH\u0014¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u000fH\u0014¢\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u000200H\u0014¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u0002002\u0006\u0010?\u001a\u00020\u0014H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020BH\u0017¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u0002002\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u000200H\u0014¢\u0006\u0004\bJ\u0010>J\u0017\u0010M\u001a\u0002002\u0006\u0010L\u001a\u00020KH\u0014¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u000200H\u0014¢\u0006\u0004\bO\u0010>J\u000f\u0010P\u001a\u00020\u000fH\u0004¢\u0006\u0004\bP\u0010;J\u001d\u0010S\u001a\u0002002\f\u0010R\u001a\b\u0012\u0004\u0012\u00020'0QH\u0014¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0014H\u0014¢\u0006\u0004\bU\u00108J\u000f\u0010V\u001a\u000200H\u0002¢\u0006\u0004\bV\u0010>J\u0017\u0010X\u001a\u0002002\u0006\u0010W\u001a\u00020\u0016H\u0002¢\u0006\u0004\bX\u0010YJ\u001b\u0010[\u001a\u0002002\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u000200H\u0002¢\u0006\u0004\b]\u0010>J\u0019\u0010^\u001a\u0002002\b\b\u0002\u0010Z\u001a\u00020\u0014H\u0002¢\u0006\u0004\b^\u0010AJ\u0017\u0010_\u001a\u0002002\u0006\u0010W\u001a\u00020\u0016H\u0002¢\u0006\u0004\b_\u0010YJ\u000f\u0010`\u001a\u000200H\u0002¢\u0006\u0004\b`\u0010>J\u0017\u0010b\u001a\u0002002\u0006\u0010a\u001a\u00020\u000fH\u0002¢\u0006\u0004\bb\u0010cR \u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010d\u001a\u0004\be\u0010fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010gR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010hR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010hR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010hR\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010hR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010iR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010jR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010jR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010kR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010lR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010mR\u0016\u0010#\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010nR\u0014\u0010$\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010hR\"\u0010o\u001a\u00020\u00148D@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u00108\"\u0004\br\u0010AR\"\u0010s\u001a\u00020\u00148D@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bs\u0010p\u001a\u0004\bt\u00108\"\u0004\bu\u0010AR\u001b\u0010y\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u00108R\u001b\u0010~\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010w\u001a\u0004\b|\u0010}R\u001d\u0010\u0081\u0001\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u007f\u0010w\u001a\u0005\b\u0080\u0001\u00108R+\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0005\b`\u0010\u0087\u0001R\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R \u0010\u008e\u0001\u001a\u00030\u008a\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008b\u0001\u0010w\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R \u0010\u0093\u0001\u001a\u00030\u008f\u00018DX\u0084\u0084\u0002¢\u0006\u000f\n\u0005\b\u0090\u0001\u0010w\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R \u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u0099\u0001\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010;R\u0016\u0010\u009b\u0001\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u00108R\u0016\u0010\u009d\u0001\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u00108¨\u0006\u009e\u0001"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/ui/card/common/BaseOrganizationCardModalView;", "Lzo31;", "T", "Lxg00;", "", "Li65;", CA20Status.STATUS_CERTIFICATE_V, "Lcom/yandex/go/places/base/ui/base_old/lifecycle/BasePlacesLifecycleAwareModalView;", "Lp3v;", "Landroid/content/Context;", "context", "Ly55;", "presenter", "Lc2x0;", "systemBarsCoordinator", "", "shouldOpenFullscreenOnStart", "isCollapsable", "shouldHideGeoButton", "shouldHideZoomButtons", "", "anchoredHeight", "", "anchoredHeightAsScreenPercent", "Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$RevealingState;", "initialRevealingState", "minHeight", "maxHeightRatio", "Llf80;", "galleryConfig", "Lof80;", "organizationCardGalleryViewFactory", "Lyac0;", "mapConfig", "Lkbc0;", "placesMapScreenParamsOverride", "isExternalMapEnabled", "<init>", "(Landroid/content/Context;Ly55;Lc2x0;ZZZZLjava/lang/Integer;Ljava/lang/Float;Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$RevealingState;Ljava/lang/Float;Ljava/lang/Float;Llf80;Lof80;Lyac0;Lkbc0;Z)V", "Landroid/view/View;", "getCardContainer", "()Landroid/view/View;", "getCardContent", "getCardCloseButton", "Landroid/view/ViewStub;", "getCardGalleryViewStub", "()Landroid/view/ViewStub;", "Lkotlin/Function0;", "Lzy11;", "listener", "setAppearAnimationCompleteListener", "(Lsls;)V", "Lc230;", "insetsType", "()Lc230;", "getTopPadding", "()I", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "isApplyShadow", "()Z", "canDragToExpandFromAnchored", "onSlideOut", "()V", "newState", "onBottomSheetStateChanged", "(I)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "Lt1w;", "insets", "onInsetsHandled", "(Lt1w;)V", "onDetachedFromWindow", "shouldShowCloseButton", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "bottomSheetBehavior", "setInitialBehaviorState", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "getMaxAnchoredHeight", "setMapEnabledMode", "slideOffset", "setItemsLayoutTranslationY", "(F)V", ClidProvider.STATE, "updateCloseButtonVisibility", "(Ljava/lang/Integer;)V", "setBottomSheetInitialColor", "updateExpandedTopScrimForState", "updateExpandedTopScrimForSlide", "setGalleryView", "isGalleryRedesignEnabled", "setGalleryLayoutParams", "(Z)V", "Ly55;", "getPresenter", "()Ly55;", "Lc2x0;", "Z", "Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$RevealingState;", "Ljava/lang/Float;", "Llf80;", "Lof80;", "Lyac0;", "Lkbc0;", "imagesContainerHeight", CA20Status.STATUS_USER_I, "getImagesContainerHeight", "setImagesContainerHeight", "visibleGalleryHeight", "getVisibleGalleryHeight", "setVisibleGalleryHeight", "transparentColor$delegate", "Li3y;", "getTransparentColor", "transparentColor", "Lp7c0;", "expandedTopScrimController$delegate", "getExpandedTopScrimController", "()Lp7c0;", "expandedTopScrimController", "cardCornerRadius$delegate", "getCardCornerRadius", "cardCornerRadius", "Lcom/yandex/go/places/organization/card/impl/ui/gallery/OrganizationCardGalleryView;", "galleryView", "Lcom/yandex/go/places/organization/card/impl/ui/gallery/OrganizationCardGalleryView;", "getGalleryView", "()Lcom/yandex/go/places/organization/card/impl/ui/gallery/OrganizationCardGalleryView;", "(Lcom/yandex/go/places/organization/card/impl/ui/gallery/OrganizationCardGalleryView;)V", "externalCloseButton", "Landroid/view/View;", "Lcom/yandex/go/places/common/ui/ControlButtonView;", "backButton$delegate", "getBackButton", "()Lcom/yandex/go/places/common/ui/ControlButtonView;", "backButton", "Lcom/yandex/go/places/base/ui/base_old/map/MapControlButtonsContainerView;", "rightSideButtonsContainer$delegate", "getRightSideButtonsContainer", "()Lcom/yandex/go/places/base/ui/base_old/map/MapControlButtonsContainerView;", "rightSideButtonsContainer", "Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "mapScreenId", "Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "getMapScreenId", "()Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "isMapEnabled", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "getExpandedBottomSheetColor", "expandedBottomSheetColor", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BaseOrganizationCardModalView<T extends zo31, V extends xg00 & i65> extends BasePlacesLifecycleAwareModalView<T, V> implements p3v {
    public static final int $stable = 8;

    /* renamed from: backButton$delegate, reason: from kotlin metadata */
    private final i3y backButton;

    /* renamed from: cardCornerRadius$delegate, reason: from kotlin metadata */
    private final i3y cardCornerRadius;

    /* renamed from: expandedTopScrimController$delegate, reason: from kotlin metadata */
    private final i3y expandedTopScrimController;
    private View externalCloseButton;
    private final lf80 galleryConfig;
    private OrganizationCardGalleryView galleryView;
    private int imagesContainerHeight;
    private final PlacesMapConfig$RevealingState initialRevealingState;
    private final boolean isCollapsable;
    private final boolean isExternalMapEnabled;
    private final yac0 mapConfig;
    private final PlacesMapConfig$PlacesMapScreenName mapScreenId;
    private final Float maxHeightRatio;
    private final Float minHeight;
    private final of80 organizationCardGalleryViewFactory;
    private final kbc0 placesMapScreenParamsOverride;
    private final y55 presenter;

    /* renamed from: rightSideButtonsContainer$delegate, reason: from kotlin metadata */
    private final i3y rightSideButtonsContainer;
    private final boolean shouldHideGeoButton;
    private final boolean shouldHideZoomButtons;
    private final boolean shouldOpenFullscreenOnStart;
    private final c2x0 systemBarsCoordinator;

    /* renamed from: transparentColor$delegate, reason: from kotlin metadata */
    private final i3y transparentColor;
    private int visibleGalleryHeight;

    public BaseOrganizationCardModalView(final Context context, y55 y55Var, c2x0 c2x0Var, boolean z, boolean z2, boolean z3, boolean z4, Integer num, Float f, PlacesMapConfig$RevealingState placesMapConfig$RevealingState, Float f2, Float f3, lf80 lf80Var, of80 of80Var, yac0 yac0Var, kbc0 kbc0Var, boolean z5) {
        super(context, y55Var, true, num, f);
        this.presenter = y55Var;
        this.systemBarsCoordinator = c2x0Var;
        this.shouldOpenFullscreenOnStart = z;
        this.isCollapsable = z2;
        this.shouldHideGeoButton = z3;
        this.shouldHideZoomButtons = z4;
        this.initialRevealingState = placesMapConfig$RevealingState;
        this.minHeight = f2;
        this.maxHeightRatio = f3;
        this.galleryConfig = lf80Var;
        this.organizationCardGalleryViewFactory = of80Var;
        this.mapConfig = yac0Var;
        this.placesMapScreenParamsOverride = kbc0Var;
        this.isExternalMapEnabled = z5;
        final int i = 1;
        v55 v55Var = new v55(this, i);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.transparentColor = a.b(lazyThreadSafetyMode, v55Var);
        final int i2 = 0;
        this.expandedTopScrimController = a.b(lazyThreadSafetyMode, new sls(this) { // from class: w55
            public final /* synthetic */ BaseOrganizationCardModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                p7c0 expandedTopScrimController_delegate$lambda$0;
                MapControlButtonsContainerView rightSideButtonsContainer_delegate$lambda$0;
                int i3 = i2;
                Context context2 = context;
                BaseOrganizationCardModalView baseOrganizationCardModalView = this.b;
                switch (i3) {
                    case 0:
                        expandedTopScrimController_delegate$lambda$0 = BaseOrganizationCardModalView.expandedTopScrimController_delegate$lambda$0(baseOrganizationCardModalView, context2);
                        return expandedTopScrimController_delegate$lambda$0;
                    default:
                        rightSideButtonsContainer_delegate$lambda$0 = BaseOrganizationCardModalView.rightSideButtonsContainer_delegate$lambda$0(baseOrganizationCardModalView, context2);
                        return rightSideButtonsContainer_delegate$lambda$0;
                }
            }
        });
        this.cardCornerRadius = a.b(lazyThreadSafetyMode, new v55(this, 2));
        this.backButton = a.b(lazyThreadSafetyMode, new n5(context, 3));
        this.rightSideButtonsContainer = a.b(lazyThreadSafetyMode, new sls(this) { // from class: w55
            public final /* synthetic */ BaseOrganizationCardModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                p7c0 expandedTopScrimController_delegate$lambda$0;
                MapControlButtonsContainerView rightSideButtonsContainer_delegate$lambda$0;
                int i3 = i;
                Context context2 = context;
                BaseOrganizationCardModalView baseOrganizationCardModalView = this.b;
                switch (i3) {
                    case 0:
                        expandedTopScrimController_delegate$lambda$0 = BaseOrganizationCardModalView.expandedTopScrimController_delegate$lambda$0(baseOrganizationCardModalView, context2);
                        return expandedTopScrimController_delegate$lambda$0;
                    default:
                        rightSideButtonsContainer_delegate$lambda$0 = BaseOrganizationCardModalView.rightSideButtonsContainer_delegate$lambda$0(baseOrganizationCardModalView, context2);
                        return rightSideButtonsContainer_delegate$lambda$0;
                }
            }
        });
        this.mapScreenId = PlacesMapConfig$PlacesMapScreenName.PLACES_ORGANIZATION_CARD;
        manualInit();
        setCardMode(z2 ? SlideableModalView.CardMode.SLIDEABLE_CARD : SlideableModalView.CardMode.FIXED_CARD);
        getExpandedTopScrimController().b();
        getExpandedTopScrimController().a();
        updateExpandedTopScrimForState$default(this, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ControlButtonView backButton_delegate$lambda$0(Context context) {
        ControlButtonView controlButtonView = new ControlButtonView(context, null, 0, 6, null);
        controlButtonView.setImageResource(dzg0.ic_arrow_left);
        controlButtonView.setMirrorForRtl();
        controlButtonView.setContentDescription(context.getString(mzh0.common_back));
        return controlButtonView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int cardCornerRadius_delegate$lambda$0(BaseOrganizationCardModalView baseOrganizationCardModalView) {
        return c.d(fug0.discovery_organizations_card_content_container_corner_round_size, baseOrganizationCardModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p7c0 expandedTopScrimController_delegate$lambda$0(BaseOrganizationCardModalView baseOrganizationCardModalView, Context context) {
        return new p7c0(baseOrganizationCardModalView, new v55(baseOrganizationCardModalView, 0), new n5(context, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int expandedTopScrimController_delegate$lambda$0$1(Context context) {
        return context.getColor(mqg0.black);
    }

    private final ControlButtonView getBackButton() {
        return (ControlButtonView) this.backButton.getValue();
    }

    private final int getCardCornerRadius() {
        return ((Number) this.cardCornerRadius.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getExpandedBottomSheetColor() {
        return qje.t(xng0.bgMain, getContext());
    }

    private final p7c0 getExpandedTopScrimController() {
        return (p7c0) this.expandedTopScrimController.getValue();
    }

    private final int getTransparentColor() {
        return ((Number) this.transparentColor.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MapControlButtonsContainerView rightSideButtonsContainer_delegate$lambda$0(BaseOrganizationCardModalView baseOrganizationCardModalView, Context context) {
        return new MapControlButtonsContainerView(context, new BaseOrganizationCardModalView$rightSideButtonsContainer$2$1(0, baseOrganizationCardModalView.getPresenter(), y55.class, "onZoomInButtonClicked", "onZoomInButtonClicked()V", 0), new BaseOrganizationCardModalView$rightSideButtonsContainer$2$2(0, baseOrganizationCardModalView.getPresenter(), y55.class, "onZoomOutButtonClicked", "onZoomOutButtonClicked()V", 0), new BaseOrganizationCardModalView$rightSideButtonsContainer$2$4(0, baseOrganizationCardModalView.getPresenter(), y55.class, "onLocationFocusingButtonClicked", "onLocationFocusingButtonClicked()V", 0), new BaseOrganizationCardModalView$rightSideButtonsContainer$2$3(0, baseOrganizationCardModalView.getPresenter(), y55.class, "onCompassButtonClicked", "onCompassButtonClicked()V", 0), baseOrganizationCardModalView.getPresenter().y.b(), !baseOrganizationCardModalView.shouldHideGeoButton, !baseOrganizationCardModalView.shouldHideZoomButtons);
    }

    private final void setBottomSheetInitialColor() {
        updateExpandedTopScrimForState$default(this, 0, 1, null);
        getBottomSheet().setBackgroundColor((!this.isCollapsable || getBottomSheetBehavior().E == 3 || getBottomSheetBehavior().E == 7) ? getExpandedBottomSheetColor() : getTransparentColor());
    }

    private final void setGalleryLayoutParams(boolean isGalleryRedesignEnabled) {
        int r = isGalleryRedesignEnabled ? 0 : tje.r(mrg0.go_design_s_space, getContext());
        int r2 = (!isGalleryRedesignEnabled || getImagesContainerHeight() == 0) ? tje.r(fug0.discovery_organizations_card_gallery_bottom_margin, getContext()) : -getCardCornerRadius();
        OrganizationCardGalleryView organizationCardGalleryView = this.galleryView;
        if (organizationCardGalleryView != null) {
            ViewGroup.LayoutParams layoutParams = organizationCardGalleryView.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = getImagesContainerHeight();
            marginLayoutParams.setMargins(0, r, 0, 0);
            organizationCardGalleryView.setLayoutParams(marginLayoutParams);
        }
        View cardContent = getCardContent();
        ViewGroup.LayoutParams layoutParams2 = cardContent.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(0, r2, 0, 0);
        cardContent.setLayoutParams(marginLayoutParams2);
        this.visibleGalleryHeight = getImagesContainerHeight() + r + r2;
    }

    private final void setGalleryView() {
        getBinding();
        View cardCloseButton = getCardCloseButton();
        c.z(new BaseOrganizationCardModalView$setGalleryView$1$1$1(0, getPresenter(), y55.class, "back", "back()V", 0), cardCloseButton);
        cardCloseButton.setVisibility(shouldShowCloseButton() ? 0 : 8);
        lf80 lf80Var = this.galleryConfig;
        float f = lf80Var.a ? lf80Var.b : 0.5f;
        int v = xw31.v();
        this.imagesContainerHeight = (int) (v * f);
        View cardContent = getCardContent();
        cardContent.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(tje.r(fug0.discovery_organizations_card_content_container_corner_round_size, getContext())));
        cardContent.setClipToOutline(true);
        of80 of80Var = this.organizationCardGalleryViewFactory;
        Context context = getContext();
        y55 presenter = getPresenter();
        lf80 lf80Var2 = this.galleryConfig;
        int imagesContainerHeight = getImagesContainerHeight();
        gus gusVar = ((pf80) of80Var).a;
        OrganizationCardGalleryView organizationCardGalleryView = new OrganizationCardGalleryView(context, (pav) gusVar.a.get(), v, imagesContainerHeight, presenter, lf80Var2, (ip11) gusVar.b.get());
        this.galleryView = organizationCardGalleryView;
        organizationCardGalleryView.setImportantForAccessibility(4);
        c.w(getCardGalleryViewStub(), organizationCardGalleryView);
        setGalleryLayoutParams(this.galleryConfig.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setItemsLayoutTranslationY(float slideOffset) {
        OrganizationCardGalleryView organizationCardGalleryView = this.galleryView;
        if (organizationCardGalleryView != null) {
            int height = organizationCardGalleryView.getHeight();
            float maxAnchoredHeight = getMaxAnchoredHeight() / (xw31.u() - getCurrentInsets().b);
            float min = Math.min(((-height) * this.galleryConfig.c) + getCardCornerRadius(), 0.0f);
            if (slideOffset <= maxAnchoredHeight) {
                getCardContent().setTranslationY(min);
            } else {
                getCardContent().setTranslationY((1.0f - ((slideOffset - maxAnchoredHeight) / (1.0f - maxAnchoredHeight))) * min);
            }
        }
    }

    private final void setMapEnabledMode() {
        BaseOrganizationCardModalView<T, V> baseOrganizationCardModalView;
        ControlButtonView controlButtonView;
        int i = 0;
        Float f = null;
        if (this.galleryConfig.a) {
            int r = tje.r(xtg0.discovery_map_controls_edge_margin, getContext());
            int r2 = tje.r(mrg0.go_design_s_space, getContext());
            controlButtonView = getBackButton();
            c.z(new BaseOrganizationCardModalView$setMapEnabledMode$1$1(0, getPresenter(), y55.class, "back", "back()V", 0), controlButtonView);
            baseOrganizationCardModalView = this;
            SlideableModalView.addViewAboveCard$default(baseOrganizationCardModalView, controlButtonView, 8388611, 0, 4, null);
            xw31.E(controlButtonView, Integer.valueOf(r), 0, 0, Integer.valueOf(r2));
        } else {
            baseOrganizationCardModalView = this;
            controlButtonView = null;
        }
        baseOrganizationCardModalView.externalCloseButton = controlButtonView;
        if (!baseOrganizationCardModalView.shouldHideGeoButton || !baseOrganizationCardModalView.shouldHideZoomButtons) {
            SlideableModalView.addViewAboveCard$default(baseOrganizationCardModalView, baseOrganizationCardModalView.getRightSideButtonsContainer(), 8388613, 0, 4, null);
        }
        if (baseOrganizationCardModalView.shouldOpenFullscreenOnStart) {
            baseOrganizationCardModalView.setArrowState(ArrowsView.State.GONE);
        } else {
            baseOrganizationCardModalView.setArrowState(ArrowsView.State.PLAIN);
        }
        wac0 a = baseOrganizationCardModalView.mapConfig.a(baseOrganizationCardModalView.getMapScreenId());
        AnchorBottomSheetBehavior<View> bottomSheetBehavior = baseOrganizationCardModalView.getBottomSheetBehavior();
        if (baseOrganizationCardModalView.isExternalMapEnabled) {
            bottomSheetBehavior.C = false;
            bottomSheetBehavior.R(false);
            bottomSheetBehavior.a0 = true;
            bottomSheetBehavior.W = false;
            bottomSheetBehavior.Z = false;
            bottomSheetBehavior.V = true;
            bottomSheetBehavior.c0 = true;
        } else {
            Float f2 = baseOrganizationCardModalView.minHeight;
            if (f2 == null) {
                f2 = a != null ? a.d : null;
            }
            int anchorHeight = baseOrganizationCardModalView.getAnchorHeight();
            Float f3 = baseOrganizationCardModalView.maxHeightRatio;
            if (f3 != null) {
                f = f3;
            } else if (a != null) {
                f = a.f;
            }
            lab1.j(bottomSheetBehavior, f2, f, anchorHeight);
        }
        bottomSheetBehavior.J(true);
        bottomSheetBehavior.L(baseOrganizationCardModalView.getCardContainer());
        bottomSheetBehavior.N = new x55(baseOrganizationCardModalView, i);
        OrganizationCardGalleryView organizationCardGalleryView = baseOrganizationCardModalView.galleryView;
        if (organizationCardGalleryView != null) {
            organizationCardGalleryView.post(new mh3(11, baseOrganizationCardModalView, bottomSheetBehavior));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMapEnabledMode$lambda$1$0(BaseOrganizationCardModalView baseOrganizationCardModalView, AnchorBottomSheetBehavior anchorBottomSheetBehavior) {
        baseOrganizationCardModalView.setItemsLayoutTranslationY(baseOrganizationCardModalView.getBottomSheetBehavior().E == 6 ? baseOrganizationCardModalView.getMaxAnchoredHeight() / (xw31.u() - baseOrganizationCardModalView.getCurrentInsets().b) : anchorBottomSheetBehavior.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int transparentColor_delegate$lambda$0(BaseOrganizationCardModalView baseOrganizationCardModalView) {
        return c.a(mqg0.transparent, baseOrganizationCardModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCloseButtonVisibility(Integer state) {
        int intValue = state != null ? state.intValue() : getBottomSheetBehavior().E;
        boolean z = intValue == 3 || intValue == 7;
        if (this.galleryConfig.a && z) {
            View view = this.externalCloseButton;
            if (view != null) {
                twa1.i(view);
            }
            twa1.h(getCardCloseButton());
            return;
        }
        twa1.i(getCardCloseButton());
        View view2 = this.externalCloseButton;
        if (view2 != null) {
            twa1.h(view2);
        }
    }

    public static /* synthetic */ void updateCloseButtonVisibility$default(BaseOrganizationCardModalView baseOrganizationCardModalView, Integer num, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: updateCloseButtonVisibility");
            return;
        }
        if ((i & 1) != 0) {
            num = null;
        }
        baseOrganizationCardModalView.updateCloseButtonVisibility(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateExpandedTopScrimForSlide(float slideOffset) {
        getExpandedTopScrimController().e(convertToOffsetFromAnchored(slideOffset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateExpandedTopScrimForState(int state) {
        getExpandedTopScrimController().f(state);
    }

    public static void updateExpandedTopScrimForState$default(BaseOrganizationCardModalView baseOrganizationCardModalView, int i, int i2, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: updateExpandedTopScrimForState");
            return;
        }
        if ((i2 & 1) != 0) {
            i = baseOrganizationCardModalView.getBottomSheetBehavior().E;
        }
        baseOrganizationCardModalView.updateExpandedTopScrimForState(i);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        getExpandedTopScrimController().a();
        setBottomSheetInitialColor();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return this.isCollapsable ? mqg0.transparent : mqg0.black;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    public abstract View getCardCloseButton();

    public abstract View getCardContainer();

    public abstract View getCardContent();

    public abstract ViewStub getCardGalleryViewStub();

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.r(fug0.discovery_organizations_card_content_container_corner_round_size, getContext());
    }

    @Override // defpackage.n3v
    public View getDelayedGoneLayoutReadyView() {
        return this;
    }

    public final OrganizationCardGalleryView getGalleryView() {
        return this.galleryView;
    }

    public final int getImagesContainerHeight() {
        int i = this.imagesContainerHeight;
        return i <= 0 ? (int) (xw31.v() * 0.5f) : i;
    }

    @Override // defpackage.p3v
    public PlacesMapConfig$PlacesMapScreenName getMapScreenId() {
        return this.mapScreenId;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getMaxAnchoredHeight() {
        return getAnchorHeight() + getCurrentInsets().g;
    }

    public final MapControlButtonsContainerView getRightSideButtonsContainer() {
        return (MapControlButtonsContainerView) this.rightSideButtonsContainer.getValue();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return 0;
    }

    public final int getVisibleGalleryHeight() {
        int i = this.visibleGalleryHeight;
        return i <= 0 ? getImagesContainerHeight() : i;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow, reason: from getter */
    public boolean getIsCollapsable() {
        return this.isCollapsable;
    }

    @Override // defpackage.p3v
    /* renamed from: isMapEnabled */
    public boolean getIsMapEnabled() {
        return (getPresenter().D || this.mapConfig.a(getMapScreenId()) != null) && !this.isExternalMapEnabled;
    }

    @Override // defpackage.n3v
    public /* bridge */ boolean isReadyForDelayedGone() {
        return super.isReadyForDelayedGone();
    }

    @Override // com.yandex.go.places.base.ui.base_old.lifecycle.BasePlacesLifecycleAwareModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((d2x0) this.systemBarsCoordinator).a(0, this, false);
        getExpandedTopScrimController().d(getCurrentInsets());
        updateExpandedTopScrimForState$default(this, 0, 1, null);
        setBottomSheetInitialColor();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        setGalleryView();
        if (this.isCollapsable) {
            setMapEnabledMode();
        }
    }

    public void onBottomSheetStateChanged(int newState) {
    }

    @Override // com.yandex.go.places.base.ui.base_old.lifecycle.BasePlacesLifecycleAwareModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ((d2x0) this.systemBarsCoordinator).b(this);
        super.onDetachedFromWindow();
        this.galleryView = null;
        this.externalCloseButton = null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onInsetsHandled(t1w insets) {
        super.onInsetsHandled(insets);
        getExpandedTopScrimController().d(insets);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), getCardContainer(), event)) {
            return true;
        }
        if (this.isCollapsable) {
            return false;
        }
        return super.onTouchEvent(event);
    }

    public void setAppearAnimationCompleteListener(sls listener) {
        setOneShotAppearAnimationCompleteListener(listener);
    }

    public final void setImagesContainerHeight(int i) {
        this.imagesContainerHeight = i;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setInitialBehaviorState(AnchorBottomSheetBehavior<View> bottomSheetBehavior) {
        CardRevealing cardRevealing;
        wac0 a = this.mapConfig.a(getMapScreenId());
        int i = 3;
        if (this.isExternalMapEnabled || a == null) {
            if (!this.isCollapsable) {
                i = 7;
            } else if (!this.shouldOpenFullscreenOnStart) {
                i = 6;
            }
            bottomSheetBehavior.O(i);
        } else {
            setBehaviorAnchorHeight(Integer.valueOf(getAnchorHeight()));
            kbc0 kbc0Var = this.placesMapScreenParamsOverride;
            if (kbc0Var == null || (cardRevealing = kbc0Var.a) == null) {
                Float f = this.minHeight;
                if (f == null) {
                    f = a.d;
                }
                int anchorHeight = getAnchorHeight();
                Float f2 = this.maxHeightRatio;
                if (f2 == null) {
                    f2 = a.f;
                }
                PlacesMapConfig$RevealingState placesMapConfig$RevealingState = this.initialRevealingState;
                if (placesMapConfig$RevealingState == null) {
                    placesMapConfig$RevealingState = a.g;
                }
                i = lab1.e(f, f2, anchorHeight, placesMapConfig$RevealingState);
            } else {
                int i2 = zac0.a[cardRevealing.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        w511.b();
                        return;
                    }
                    i = 6;
                }
            }
            bottomSheetBehavior.O(i);
        }
        updateCloseButtonVisibility$default(this, null, 1, null);
        updateExpandedTopScrimForState(bottomSheetBehavior.E);
    }

    public final void setVisibleGalleryHeight(int i) {
        this.visibleGalleryHeight = i;
    }

    public final boolean shouldShowCloseButton() {
        if (this.galleryConfig.a) {
            return !this.isCollapsable || this.shouldOpenFullscreenOnStart;
        }
        return false;
    }

    @Override // com.yandex.go.places.base.ui.base_old.BaseOrganizationDiscoveryModalView
    public y55 getPresenter() {
        return this.presenter;
    }

    public final void setGalleryView(OrganizationCardGalleryView organizationCardGalleryView) {
        this.galleryView = organizationCardGalleryView;
    }
}
