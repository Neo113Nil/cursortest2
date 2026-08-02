package com.yandex.go.places.impl.ui.organizations;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.places.api.navigation.CardRevealing;
import com.yandex.go.places.base.ui.base_old.map.MapControlButtonsContainerView;
import com.yandex.go.places.impl.ui.organizations.OrganizationsModalView;
import com.yandex.go.places.impl.ui.organizations.base.BaseOrganizationsModalView;
import com.yandex.go.places.impl.ui.organizations.recycler.OrganizationsListAdapter$special$$inlined$itemType$1;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import defpackage.a3v;
import defpackage.a4j0;
import defpackage.a65;
import defpackage.an80;
import defpackage.b65;
import defpackage.bm50;
import defpackage.c2x0;
import defpackage.ci80;
import defpackage.cma1;
import defpackage.d760;
import defpackage.di80;
import defpackage.dna;
import defpackage.dug0;
import defpackage.e760;
import defpackage.ec01;
import defpackage.ei80;
import defpackage.ep8;
import defpackage.f760;
import defpackage.f89;
import defpackage.fp8;
import defpackage.fr;
import defpackage.g0c;
import defpackage.g760;
import defpackage.he7;
import defpackage.hm80;
import defpackage.ho80;
import defpackage.ht10;
import defpackage.i3y;
import defpackage.iru;
import defpackage.jd6;
import defpackage.jo80;
import defpackage.kbc0;
import defpackage.ko80;
import defpackage.lab1;
import defpackage.lki;
import defpackage.lo80;
import defpackage.mrg0;
import defpackage.mth;
import defpackage.ny61;
import defpackage.o6h0;
import defpackage.p3v;
import defpackage.p91;
import defpackage.pav;
import defpackage.px6;
import defpackage.qoi0;
import defpackage.scc;
import defpackage.sls;
import defpackage.t5r0;
import defpackage.teb;
import defpackage.tfx;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u370;
import defpackage.ub60;
import defpackage.ukr0;
import defpackage.us4;
import defpackage.uuh0;
import defpackage.vu30;
import defpackage.w511;
import defpackage.wac0;
import defpackage.wk80;
import defpackage.xg0;
import defpackage.xw31;
import defpackage.yac0;
import defpackage.zac0;
import defpackage.zm80;
import defpackage.zp01;
import defpackage.zxs;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.buttons.CircleButtonImageView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000Ù\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t*\u0003^\u008a\u0001\b\u0001\u0018\u0000 \u0095\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u0096\u0001\u0097\u0001Bs\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,H\u0017¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020(H\u0014¢\u0006\u0004\b0\u00101J\u001d\u00105\u001a\u00020(2\f\u00104\u001a\b\u0012\u0004\u0012\u00020302H\u0014¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0014¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020(H\u0014¢\u0006\u0004\b:\u00101J\u000f\u0010;\u001a\u00020\u000eH\u0014¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020(H\u0014¢\u0006\u0004\b=\u00101J\u000f\u0010>\u001a\u00020(H\u0016¢\u0006\u0004\b>\u00101J\u0013\u0010?\u001a\u00020(*\u00020\u0002H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020(H\u0002¢\u0006\u0004\bA\u00101J\u000f\u0010B\u001a\u00020(H\u0002¢\u0006\u0004\bB\u00101J\u0017\u0010D\u001a\u00020(2\u0006\u0010C\u001a\u000207H\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010H\u001a\u00020(2\u0006\u0010F\u001a\u0002072\u0006\u0010G\u001a\u000207H\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020(H\u0002¢\u0006\u0004\bJ\u00101J\u000f\u0010K\u001a\u00020(H\u0002¢\u0006\u0004\bK\u00101J\u000f\u0010L\u001a\u00020(H\u0002¢\u0006\u0004\bL\u00101J\u000f\u0010M\u001a\u00020\u000eH\u0002¢\u0006\u0004\bM\u0010<J\u000f\u0010N\u001a\u00020\u000eH\u0002¢\u0006\u0004\bN\u0010<J\u000f\u0010O\u001a\u00020\u000eH\u0002¢\u0006\u0004\bO\u0010<J\u000f\u0010P\u001a\u00020(H\u0002¢\u0006\u0004\bP\u00101J\u000f\u0010Q\u001a\u00020(H\u0002¢\u0006\u0004\bQ\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010RR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010SR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010TR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010UR\u001a\u0010\u0011\u001a\u00020\u00108\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010V\u001a\u0004\bW\u0010XR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010YR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010ZR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010[R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\\R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR!\u0010j\u001a\b\u0012\u0004\u0012\u00020e0d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR!\u0010m\u001a\b\u0012\u0004\u0012\u00020e0d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010g\u001a\u0004\bl\u0010iR\u001b\u0010r\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010g\u001a\u0004\bp\u0010qR!\u0010v\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\bs\u0010g\u0012\u0004\bu\u00101\u001a\u0004\bt\u00109R\u001b\u0010y\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010g\u001a\u0004\bx\u00109R\u0016\u0010z\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010UR\u0016\u0010{\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010UR\u0014\u0010|\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010UR\u0014\u0010}\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u007f\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010~R \u0010\u0084\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0081\u0001\u0010g\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010\u0089\u0001\u001a\u00030\u0085\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0086\u0001\u0010g\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\u008e\u0001\u001a\u00030\u008a\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008b\u0001\u0010g\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R \u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001d\u0010\u0094\u0001\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010U\u001a\u0005\b\u0094\u0001\u0010<¨\u0006\u0098\u0001"}, d2 = {"Lcom/yandex/go/places/impl/ui/organizations/OrganizationsModalView;", "Lcom/yandex/go/places/impl/ui/organizations/base/BaseOrganizationsModalView;", "Llo80;", "Lp3v;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Ltt2;", "appDispatchers", "Lru/yandex/taxi/design/utils/a;", "overlayShadowUtil", "Lc2x0;", "systemBarsCoordinator", "", "isOrganizationSnippetV2Enabled", "Lcom/yandex/go/places/impl/ui/organizations/d;", "presenter", "Lu370;", "openAnimationType", "Lyac0;", "mapConfig", "Lkbc0;", "placesMapScreenParamsOverride", "La3v;", "focusCoordinator", "La4j0;", "reportedOrganisationsIdInteractor", "<init>", "(Landroid/content/Context;Lpav;Ltt2;Lru/yandex/taxi/design/utils/a;Lc2x0;ZLcom/yandex/go/places/impl/ui/organizations/d;Lu370;Lyac0;Lkbc0;La3v;La4j0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Llo80;", "", "screenName", "()Ljava/lang/String;", "Lkotlin/Function0;", "Lzy11;", "listener", "setAppearAnimationCompleteListener", "(Lsls;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onAttachedToWindow", "()V", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", "bottomSheetBehavior", "setInitialBehaviorState", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "", "getMaxAnchoredHeight", "()I", "onSlideOut", "canDragToExpandFromAnchored", "()Z", "onDetachedFromWindow", "anchor", "setupOpenMapButton", "(Llo80;)V", "setMapEnabledMode", "processRecyclerViewScrollState", "lastVisibleItemPosition", "animateUpButton", "(I)V", "firstVisibleItemPosition", "dy", "animateHeader", "(II)V", "showHeader", "showHeaderAnimated", "hideHeaderAnimated", "canHideHeader", "isModalViewExpanded", "isModalViewGoingAnchored", "onUpButtonClicked", "setupContainersTopMargin", "Lpav;", "Ltt2;", "Lru/yandex/taxi/design/utils/a;", "Z", "Lcom/yandex/go/places/impl/ui/organizations/d;", "getPresenter", "()Lcom/yandex/go/places/impl/ui/organizations/d;", "Lu370;", "Lyac0;", "Lkbc0;", "La3v;", "La4j0;", "com/yandex/go/places/impl/ui/organizations/OrganizationsModalView$linearLayoutManager$1", "linearLayoutManager", "Lcom/yandex/go/places/impl/ui/organizations/OrganizationsModalView$linearLayoutManager$1;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "chipsLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "Lwk80;", "searchHeaderCardSpacer$delegate", "Li3y;", "getSearchHeaderCardSpacer", "()Ljava/util/List;", "searchHeaderCardSpacer", "searchHeaderCardSpacerWithChips$delegate", "getSearchHeaderCardSpacerWithChips", "searchHeaderCardSpacerWithChips", "Lcom/yandex/go/places/base/ui/base_old/map/MapControlButtonsContainerView;", "rightSideButtonsContainer$delegate", "getRightSideButtonsContainer", "()Lcom/yandex/go/places/base/ui/base_old/map/MapControlButtonsContainerView;", "rightSideButtonsContainer", "imagesContainerWidth$delegate", "getImagesContainerWidth", "getImagesContainerWidth$annotations", "imagesContainerWidth", "imagesContainerHeight$delegate", "getImagesContainerHeight", "imagesContainerHeight", "isHideInputShadow", "isHeaderHidden", "isRtl", "threshold", CA20Status.STATUS_USER_I, "amountScrollY", "Lzm80;", "adapter$delegate", "getAdapter", "()Lzm80;", "adapter", "Lhm80;", "chipsAdapter$delegate", "getChipsAdapter", "()Lhm80;", "chipsAdapter", "ko80", "scrollListener$delegate", "getScrollListener", "()Lko80;", "scrollListener", "Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "mapScreenId", "Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "getMapScreenId", "()Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "isMapEnabled", "Companion", "com/yandex/go/places/impl/ui/organizations/a", "jo80", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationsModalView extends BaseOrganizationsModalView<lo80> implements p3v {
    public static final int $stable = 8;
    private static final jo80 Companion = new jo80();

    @Deprecated
    public static final float IMAGES_WIDTH_TO_HEIGHT_RATIO = 0.5f;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final i3y adapter;
    private int amountScrollY;
    private final tt2 appDispatchers;

    /* renamed from: chipsAdapter$delegate, reason: from kotlin metadata */
    private final i3y chipsAdapter;
    private final LinearLayoutManager chipsLayoutManager;
    private final a3v focusCoordinator;
    private final pav imageLoader;

    /* renamed from: imagesContainerHeight$delegate, reason: from kotlin metadata */
    private final i3y imagesContainerHeight;

    /* renamed from: imagesContainerWidth$delegate, reason: from kotlin metadata */
    private final i3y imagesContainerWidth;
    private boolean isHeaderHidden;
    private boolean isHideInputShadow;
    private final boolean isMapEnabled;
    private final boolean isOrganizationSnippetV2Enabled;
    private final boolean isRtl;
    private final OrganizationsModalView$linearLayoutManager$1 linearLayoutManager;
    private final yac0 mapConfig;
    private final PlacesMapConfig$PlacesMapScreenName mapScreenId;
    private final u370 openAnimationType;
    private final ru.yandex.taxi.design.utils.a overlayShadowUtil;
    private final kbc0 placesMapScreenParamsOverride;
    private final d presenter;
    private final a4j0 reportedOrganisationsIdInteractor;

    /* renamed from: rightSideButtonsContainer$delegate, reason: from kotlin metadata */
    private final i3y rightSideButtonsContainer;

    /* renamed from: scrollListener$delegate, reason: from kotlin metadata */
    private final i3y scrollListener;

    /* renamed from: searchHeaderCardSpacer$delegate, reason: from kotlin metadata */
    private final i3y searchHeaderCardSpacer;

    /* renamed from: searchHeaderCardSpacerWithChips$delegate, reason: from kotlin metadata */
    private final i3y searchHeaderCardSpacerWithChips;
    private final int threshold;

    /* JADX WARN: Multi-variable type inference failed */
    public OrganizationsModalView(Context context, pav pavVar, tt2 tt2Var, ru.yandex.taxi.design.utils.a aVar, c2x0 c2x0Var, boolean z, d dVar, u370 u370Var, yac0 yac0Var, kbc0 kbc0Var, a3v a3vVar, a4j0 a4j0Var) {
        super(context, dVar, c2x0Var, u370Var, true);
        this.imageLoader = pavVar;
        this.appDispatchers = tt2Var;
        this.overlayShadowUtil = aVar;
        this.isOrganizationSnippetV2Enabled = z;
        this.presenter = dVar;
        this.openAnimationType = u370Var;
        this.mapConfig = yac0Var;
        this.placesMapScreenParamsOverride = kbc0Var;
        this.focusCoordinator = a3vVar;
        this.reportedOrganisationsIdInteractor = a4j0Var;
        OrganizationsModalView$linearLayoutManager$1 organizationsModalView$linearLayoutManager$1 = new OrganizationsModalView$linearLayoutManager$1(context);
        final int i = 1;
        organizationsModalView$linearLayoutManager$1.b0 = true;
        this.linearLayoutManager = organizationsModalView$linearLayoutManager$1;
        boolean z2 = false;
        z2 = false;
        this.chipsLayoutManager = new LinearLayoutManager(context, 0, false);
        final int i2 = z2 ? 1 : 0;
        sls slsVar = new sls(this) { // from class: io80
            public final /* synthetic */ OrganizationsModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                List searchHeaderCardSpacer_delegate$lambda$0;
                List searchHeaderCardSpacerWithChips_delegate$lambda$0;
                int imagesContainerWidth_delegate$lambda$0;
                zm80 adapter_delegate$lambda$0;
                hm80 chipsAdapter_delegate$lambda$0;
                ko80 scrollListener_delegate$lambda$0;
                int i3 = i2;
                OrganizationsModalView organizationsModalView = this.b;
                switch (i3) {
                    case 0:
                        searchHeaderCardSpacer_delegate$lambda$0 = OrganizationsModalView.searchHeaderCardSpacer_delegate$lambda$0(organizationsModalView);
                        return searchHeaderCardSpacer_delegate$lambda$0;
                    case 1:
                        searchHeaderCardSpacerWithChips_delegate$lambda$0 = OrganizationsModalView.searchHeaderCardSpacerWithChips_delegate$lambda$0(organizationsModalView);
                        return searchHeaderCardSpacerWithChips_delegate$lambda$0;
                    case 2:
                        imagesContainerWidth_delegate$lambda$0 = OrganizationsModalView.imagesContainerWidth_delegate$lambda$0(organizationsModalView);
                        break;
                    case 3:
                        imagesContainerWidth_delegate$lambda$0 = OrganizationsModalView.imagesContainerHeight_delegate$lambda$0(organizationsModalView);
                        break;
                    case 4:
                        adapter_delegate$lambda$0 = OrganizationsModalView.adapter_delegate$lambda$0(organizationsModalView);
                        return adapter_delegate$lambda$0;
                    case 5:
                        chipsAdapter_delegate$lambda$0 = OrganizationsModalView.chipsAdapter_delegate$lambda$0(organizationsModalView);
                        return chipsAdapter_delegate$lambda$0;
                    default:
                        scrollListener_delegate$lambda$0 = OrganizationsModalView.scrollListener_delegate$lambda$0(organizationsModalView);
                        return scrollListener_delegate$lambda$0;
                }
                return Integer.valueOf(imagesContainerWidth_delegate$lambda$0);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.searchHeaderCardSpacer = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        this.searchHeaderCardSpacerWithChips = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: io80
            public final /* synthetic */ OrganizationsModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                List searchHeaderCardSpacer_delegate$lambda$0;
                List searchHeaderCardSpacerWithChips_delegate$lambda$0;
                int imagesContainerWidth_delegate$lambda$0;
                zm80 adapter_delegate$lambda$0;
                hm80 chipsAdapter_delegate$lambda$0;
                ko80 scrollListener_delegate$lambda$0;
                int i3 = i;
                OrganizationsModalView organizationsModalView = this.b;
                switch (i3) {
                    case 0:
                        searchHeaderCardSpacer_delegate$lambda$0 = OrganizationsModalView.searchHeaderCardSpacer_delegate$lambda$0(organizationsModalView);
                        return searchHeaderCardSpacer_delegate$lambda$0;
                    case 1:
                        searchHeaderCardSpacerWithChips_delegate$lambda$0 = OrganizationsModalView.searchHeaderCardSpacerWithChips_delegate$lambda$0(organizationsModalView);
                        return searchHeaderCardSpacerWithChips_delegate$lambda$0;
                    case 2:
                        imagesContainerWidth_delegate$lambda$0 = OrganizationsModalView.imagesContainerWidth_delegate$lambda$0(organizationsModalView);
                        break;
                    case 3:
                        imagesContainerWidth_delegate$lambda$0 = OrganizationsModalView.imagesContainerHeight_delegate$lambda$0(organizationsModalView);
                        break;
                    case 4:
                        adapter_delegate$lambda$0 = OrganizationsModalView.adapter_delegate$lambda$0(organizationsModalView);
                        return adapter_delegate$lambda$0;
                    case 5:
                        chipsAdapter_delegate$lambda$0 = OrganizationsModalView.chipsAdapter_delegate$lambda$0(organizationsModalView);
                        return chipsAdapter_delegate$lambda$0;
                    default:
                        scrollListener_delegate$lambda$0 = OrganizationsModalView.scrollListener_delegate$lambda$0(organizationsModalView);
                        return scrollListener_delegate$lambda$0;
                }
                return Integer.valueOf(imagesContainerWidth_delegate$lambda$0);
            }
        });
        this.rightSideButtonsContainer = kotlin.a.b(lazyThreadSafetyMode, new bm50(20, this, context));
        final int i3 = 2;
        this.imagesContainerWidth = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: io80
            public final /* synthetic */ OrganizationsModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                List searchHeaderCardSpacer_delegate$lambda$0;
                List searchHeaderCardSpacerWithChips_delegate$lambda$0;
                int imagesContainerWidth_delegate$lambda$0;
                zm80 adapter_delegate$lambda$0;
                hm80 chipsAdapter_delegate$lambda$0;
                ko80 scrollListener_delegate$lambda$0;
                int i32 = i3;
                OrganizationsModalView organizationsModalView = this.b;
                switch (i32) {
                    case 0:
                        searchHeaderCardSpacer_delegate$lambda$0 = OrganizationsModalView.searchHeaderCardSpacer_delegate$lambda$0(organizationsModalView);
                        return searchHeaderCardSpacer_delegate$lambda$0;
                    case 1:
                        searchHeaderCardSpacerWithChips_delegate$lambda$0 = OrganizationsModalView.searchHeaderCardSpacerWithChips_delegate$lambda$0(organizationsModalView);
                        return searchHeaderCardSpacerWithChips_delegate$lambda$0;
                    case 2:
                        imagesContainerWidth_delegate$lambda$0 = OrganizationsModalView.imagesContainerWidth_delegate$lambda$0(organizationsModalView);
                        break;
                    case 3:
                        imagesContainerWidth_delegate$lambda$0 = OrganizationsModalView.imagesContainerHeight_delegate$lambda$0(organizationsModalView);
                        break;
                    case 4:
                        adapter_delegate$lambda$0 = OrganizationsModalView.adapter_delegate$lambda$0(organizationsModalView);
                        return adapter_delegate$lambda$0;
                    case 5:
                        chipsAdapter_delegate$lambda$0 = OrganizationsModalView.chipsAdapter_delegate$lambda$0(organizationsModalView);
                        return chipsAdapter_delegate$lambda$0;
                    default:
                        scrollListener_delegate$lambda$0 = OrganizationsModalView.scrollListener_delegate$lambda$0(organizationsModalView);
                        return scrollListener_delegate$lambda$0;
                }
                return Integer.valueOf(imagesContainerWidth_delegate$lambda$0);
            }
        });
        final int i4 = 3;
        this.imagesContainerHeight = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: io80
            public final /* synthetic */ OrganizationsModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                List searchHeaderCardSpacer_delegate$lambda$0;
                List searchHeaderCardSpacerWithChips_delegate$lambda$0;
                int imagesContainerWidth_delegate$lambda$0;
                zm80 adapter_delegate$lambda$0;
                hm80 chipsAdapter_delegate$lambda$0;
                ko80 scrollListener_delegate$lambda$0;
                int i32 = i4;
                OrganizationsModalView organizationsModalView = this.b;
                switch (i32) {
                    case 0:
                        searchHeaderCardSpacer_delegate$lambda$0 = OrganizationsModalView.searchHeaderCardSpacer_delegate$lambda$0(organizationsModalView);
                        return searchHeaderCardSpacer_delegate$lambda$0;
                    case 1:
                        searchHeaderCardSpacerWithChips_delegate$lambda$0 = OrganizationsModalView.searchHeaderCardSpacerWithChips_delegate$lambda$0(organizationsModalView);
                        return searchHeaderCardSpacerWithChips_delegate$lambda$0;
                    case 2:
                        imagesContainerWidth_delegate$lambda$0 = OrganizationsModalView.imagesContainerWidth_delegate$lambda$0(organizationsModalView);
                        break;
                    case 3:
                        imagesContainerWidth_delegate$lambda$0 = OrganizationsModalView.imagesContainerHeight_delegate$lambda$0(organizationsModalView);
                        break;
                    case 4:
                        adapter_delegate$lambda$0 = OrganizationsModalView.adapter_delegate$lambda$0(organizationsModalView);
                        return adapter_delegate$lambda$0;
                    case 5:
                        chipsAdapter_delegate$lambda$0 = OrganizationsModalView.chipsAdapter_delegate$lambda$0(organizationsModalView);
                        return chipsAdapter_delegate$lambda$0;
                    default:
                        scrollListener_delegate$lambda$0 = OrganizationsModalView.scrollListener_delegate$lambda$0(organizationsModalView);
                        return scrollListener_delegate$lambda$0;
                }
                return Integer.valueOf(imagesContainerWidth_delegate$lambda$0);
            }
        });
        this.isRtl = xw31.n(context);
        this.threshold = tje.u(70, getContext());
        final int i5 = 4;
        this.adapter = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: io80
            public final /* synthetic */ OrganizationsModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                List searchHeaderCardSpacer_delegate$lambda$0;
                List searchHeaderCardSpacerWithChips_delegate$lambda$0;
                int imagesContainerWidth_delegate$lambda$0;
                zm80 adapter_delegate$lambda$0;
                hm80 chipsAdapter_delegate$lambda$0;
                ko80 scrollListener_delegate$lambda$0;
                int i32 = i5;
                OrganizationsModalView organizationsModalView = this.b;
                switch (i32) {
                    case 0:
                        searchHeaderCardSpacer_delegate$lambda$0 = OrganizationsModalView.searchHeaderCardSpacer_delegate$lambda$0(organizationsModalView);
                        return searchHeaderCardSpacer_delegate$lambda$0;
                    case 1:
                        searchHeaderCardSpacerWithChips_delegate$lambda$0 = OrganizationsModalView.searchHeaderCardSpacerWithChips_delegate$lambda$0(organizationsModalView);
                        return searchHeaderCardSpacerWithChips_delegate$lambda$0;
                    case 2:
                        imagesContainerWidth_delegate$lambda$0 = OrganizationsModalView.imagesContainerWidth_delegate$lambda$0(organizationsModalView);
                        break;
                    case 3:
                        imagesContainerWidth_delegate$lambda$0 = OrganizationsModalView.imagesContainerHeight_delegate$lambda$0(organizationsModalView);
                        break;
                    case 4:
                        adapter_delegate$lambda$0 = OrganizationsModalView.adapter_delegate$lambda$0(organizationsModalView);
                        return adapter_delegate$lambda$0;
                    case 5:
                        chipsAdapter_delegate$lambda$0 = OrganizationsModalView.chipsAdapter_delegate$lambda$0(organizationsModalView);
                        return chipsAdapter_delegate$lambda$0;
                    default:
                        scrollListener_delegate$lambda$0 = OrganizationsModalView.scrollListener_delegate$lambda$0(organizationsModalView);
                        return scrollListener_delegate$lambda$0;
                }
                return Integer.valueOf(imagesContainerWidth_delegate$lambda$0);
            }
        });
        final int i6 = 5;
        this.chipsAdapter = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: io80
            public final /* synthetic */ OrganizationsModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                List searchHeaderCardSpacer_delegate$lambda$0;
                List searchHeaderCardSpacerWithChips_delegate$lambda$0;
                int imagesContainerWidth_delegate$lambda$0;
                zm80 adapter_delegate$lambda$0;
                hm80 chipsAdapter_delegate$lambda$0;
                ko80 scrollListener_delegate$lambda$0;
                int i32 = i6;
                OrganizationsModalView organizationsModalView = this.b;
                switch (i32) {
                    case 0:
                        searchHeaderCardSpacer_delegate$lambda$0 = OrganizationsModalView.searchHeaderCardSpacer_delegate$lambda$0(organizationsModalView);
                        return searchHeaderCardSpacer_delegate$lambda$0;
                    case 1:
                        searchHeaderCardSpacerWithChips_delegate$lambda$0 = OrganizationsModalView.searchHeaderCardSpacerWithChips_delegate$lambda$0(organizationsModalView);
                        return searchHeaderCardSpacerWithChips_delegate$lambda$0;
                    case 2:
                        imagesContainerWidth_delegate$lambda$0 = OrganizationsModalView.imagesContainerWidth_delegate$lambda$0(organizationsModalView);
                        break;
                    case 3:
                        imagesContainerWidth_delegate$lambda$0 = OrganizationsModalView.imagesContainerHeight_delegate$lambda$0(organizationsModalView);
                        break;
                    case 4:
                        adapter_delegate$lambda$0 = OrganizationsModalView.adapter_delegate$lambda$0(organizationsModalView);
                        return adapter_delegate$lambda$0;
                    case 5:
                        chipsAdapter_delegate$lambda$0 = OrganizationsModalView.chipsAdapter_delegate$lambda$0(organizationsModalView);
                        return chipsAdapter_delegate$lambda$0;
                    default:
                        scrollListener_delegate$lambda$0 = OrganizationsModalView.scrollListener_delegate$lambda$0(organizationsModalView);
                        return scrollListener_delegate$lambda$0;
                }
                return Integer.valueOf(imagesContainerWidth_delegate$lambda$0);
            }
        });
        final int i7 = 6;
        this.scrollListener = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: io80
            public final /* synthetic */ OrganizationsModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                List searchHeaderCardSpacer_delegate$lambda$0;
                List searchHeaderCardSpacerWithChips_delegate$lambda$0;
                int imagesContainerWidth_delegate$lambda$0;
                zm80 adapter_delegate$lambda$0;
                hm80 chipsAdapter_delegate$lambda$0;
                ko80 scrollListener_delegate$lambda$0;
                int i32 = i7;
                OrganizationsModalView organizationsModalView = this.b;
                switch (i32) {
                    case 0:
                        searchHeaderCardSpacer_delegate$lambda$0 = OrganizationsModalView.searchHeaderCardSpacer_delegate$lambda$0(organizationsModalView);
                        return searchHeaderCardSpacer_delegate$lambda$0;
                    case 1:
                        searchHeaderCardSpacerWithChips_delegate$lambda$0 = OrganizationsModalView.searchHeaderCardSpacerWithChips_delegate$lambda$0(organizationsModalView);
                        return searchHeaderCardSpacerWithChips_delegate$lambda$0;
                    case 2:
                        imagesContainerWidth_delegate$lambda$0 = OrganizationsModalView.imagesContainerWidth_delegate$lambda$0(organizationsModalView);
                        break;
                    case 3:
                        imagesContainerWidth_delegate$lambda$0 = OrganizationsModalView.imagesContainerHeight_delegate$lambda$0(organizationsModalView);
                        break;
                    case 4:
                        adapter_delegate$lambda$0 = OrganizationsModalView.adapter_delegate$lambda$0(organizationsModalView);
                        return adapter_delegate$lambda$0;
                    case 5:
                        chipsAdapter_delegate$lambda$0 = OrganizationsModalView.chipsAdapter_delegate$lambda$0(organizationsModalView);
                        return chipsAdapter_delegate$lambda$0;
                    default:
                        scrollListener_delegate$lambda$0 = OrganizationsModalView.scrollListener_delegate$lambda$0(organizationsModalView);
                        return scrollListener_delegate$lambda$0;
                }
                return Integer.valueOf(imagesContainerWidth_delegate$lambda$0);
            }
        });
        this.mapScreenId = PlacesMapConfig$PlacesMapScreenName.PLACES_ORGANIZATIONS_LIST;
        if (yac0Var.a(getMapScreenId()) != null && !tje.L(getContext())) {
            z2 = true;
        }
        this.isMapEnabled = z2;
        manualInit();
        setCardMode(getPresenter().F.a ? SlideableModalView.CardMode.SLIDEABLE_CARD : SlideableModalView.CardMode.FIXED_CARD);
        if (getIsMapEnabled()) {
            SlideableModalView.addViewAboveCard$default(this, getRightSideButtonsContainer(), 8388613, 0, 4, null);
        }
        lo80 lo80Var = (lo80) getBinding();
        ru.yandex.taxi.design.utils.c.z(new OrganizationsModalView$1$1(0, getPresenter(), d.class, "back", "back()V", 0), lo80Var.b);
        ru.yandex.taxi.design.utils.c.z(new OrganizationsModalView$1$2(0, this, OrganizationsModalView.class, "onUpButtonClicked", "onUpButtonClicked()V", 0), lo80Var.l);
        lo80Var.j.addItemDecoration(new an80(context));
        setupOpenMapButton(lo80Var);
        setupContainersTopMargin();
        ListItemComponent listItemComponent = lo80Var.h;
        OrganizationsModalView$1$3 organizationsModalView$1$3 = getIsMapEnabled() ? null : new OrganizationsModalView$1$3(0, getPresenter(), d.class, "back", "back()V", 0);
        listItemComponent.setDebounceClickListener(organizationsModalView$1$3 != null ? new jd6(organizationsModalView$1$3, i) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ lo80 access$getBinding(OrganizationsModalView organizationsModalView) {
        return (lo80) organizationsModalView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zm80 adapter_delegate$lambda$0(OrganizationsModalView organizationsModalView) {
        pav pavVar = organizationsModalView.imageLoader;
        tt2 tt2Var = organizationsModalView.appDispatchers;
        int imagesContainerWidth = organizationsModalView.getImagesContainerWidth();
        int imagesContainerHeight = organizationsModalView.getImagesContainerHeight();
        ru.yandex.taxi.design.utils.a aVar = organizationsModalView.overlayShadowUtil;
        a4j0 a4j0Var = organizationsModalView.reportedOrganisationsIdInteractor;
        ub60 ub60Var = new ub60(26, organizationsModalView);
        OrganizationsModalView$adapter$2$2 organizationsModalView$adapter$2$2 = new OrganizationsModalView$adapter$2$2(2, organizationsModalView.getPresenter(), d.class, "onTagClicked", "onTagClicked(Ljava/lang/String;Ljava/lang/String;)V", 0);
        OrganizationsModalView$adapter$2$3 organizationsModalView$adapter$2$3 = new OrganizationsModalView$adapter$2$3(0, organizationsModalView.getPresenter(), d.class, "onReloadNextPageClicked", "onReloadNextPageClicked()V", 0);
        int i = fp8.S;
        g0c a = qoi0.a(wk80.class);
        ep8 ep8Var = ep8.a;
        OrganizationsListAdapter$special$$inlined$itemType$1 organizationsListAdapter$special$$inlined$itemType$1 = OrganizationsListAdapter$special$$inlined$itemType$1.b;
        Class a2 = a.a();
        he7 he7Var = new he7(1, organizationsListAdapter$special$$inlined$itemType$1);
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, ep8Var, emptyList, he7Var, null);
        int i2 = com.yandex.go.places.impl.ui.organizations.recycler.viewholders.b.f0;
        g0c a3 = qoi0.a(a65.class);
        zxs zxsVar2 = new zxs(a3.a(), 0, null, emptyList, null, new p91(pavVar, tt2Var, imagesContainerWidth, imagesContainerHeight, aVar, ub60Var));
        int i3 = com.yandex.go.places.impl.ui.organizations.recycler.viewholders.a.h0;
        g0c a4 = qoi0.a(b65.class);
        zxs zxsVar3 = new zxs(a4.a(), 0, null, emptyList, null, new xg0(pavVar, tt2Var, imagesContainerWidth, imagesContainerHeight, a4j0Var, ub60Var, organizationsModalView$adapter$2$2));
        int i4 = e760.S;
        g0c a5 = qoi0.a(d760.class);
        zxs zxsVar4 = new zxs(a5.a(), 0, null, emptyList, null, new vu30(10));
        int i5 = g760.V;
        g0c a6 = qoi0.a(f760.class);
        return new zm80(scc.g(zxsVar, zxsVar2, zxsVar3, zxsVar4, new zxs(a6.a(), 0, null, emptyList, null, new us4(9, organizationsModalView$adapter$2$3))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter_delegate$lambda$0$0(OrganizationsModalView organizationsModalView, fr frVar) {
        organizationsModalView.getPresenter().Pg(frVar, organizationsModalView.isModalViewExpanded());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateHeader(int firstVisibleItemPosition, int dy) {
        int i = this.amountScrollY + dy;
        this.amountScrollY = i;
        int i2 = this.threshold;
        if (i > i2) {
            hideHeaderAnimated();
        } else if (i < (-i2) || firstVisibleItemPosition == 0) {
            showHeaderAnimated();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void animateUpButton(int lastVisibleItemPosition) {
        float f;
        if (lastVisibleItemPosition == 5) {
            cma1.g(0.0f, ((lo80) getBinding()).l).start();
            return;
        }
        if (lastVisibleItemPosition <= 4) {
            CircleButtonImageView circleButtonImageView = ((lo80) getBinding()).l;
            if (this.isRtl) {
                float f2 = -((lo80) getBinding()).l.getWidth();
                ViewGroup.LayoutParams layoutParams = ((lo80) getBinding()).l.getLayoutParams();
                f = f2 - (((ViewGroup.MarginLayoutParams) (layoutParams instanceof ViewGroup.MarginLayoutParams ? layoutParams : null)) != null ? r2.leftMargin : 0);
            } else {
                float width = ((lo80) getBinding()).l.getWidth();
                ViewGroup.LayoutParams layoutParams2 = ((lo80) getBinding()).l.getLayoutParams();
                f = width + (((ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null)) != null ? r2.rightMargin : 0);
            }
            cma1.g(f, circleButtonImageView).start();
        }
    }

    private final boolean canHideHeader() {
        return isModalViewExpanded() && !isModalViewGoingAnchored();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hm80 chipsAdapter_delegate$lambda$0(OrganizationsModalView organizationsModalView) {
        pav pavVar = organizationsModalView.imageLoader;
        tt2 tt2Var = organizationsModalView.appDispatchers;
        OrganizationsModalView$chipsAdapter$2$1 organizationsModalView$chipsAdapter$2$1 = new OrganizationsModalView$chipsAdapter$2$1(1, organizationsModalView.getPresenter(), d.class, "onChipClicked", "onChipClicked(Lcom/yandex/go/places/impl/ui/organizations/chips/model/OrganizationFilterChipItem;)V", 0);
        lki lkiVar = new lki(4);
        List list = com.yandex.go.places.impl.ui.organizations.chips.viewholders.a.V;
        g0c a = qoi0.a(di80.class);
        teb tebVar = new teb(22);
        int i = 8;
        f89 f89Var = new f89(i, pavVar, tt2Var, organizationsModalView$chipsAdapter$2$1);
        int i2 = 1;
        zxs zxsVar = new zxs(a.a(), 0, tebVar, list, new he7(i2, f89Var), null);
        List list2 = com.yandex.go.places.impl.ui.organizations.chips.viewholders.b.T;
        g0c a2 = qoi0.a(ei80.class);
        zxs zxsVar2 = new zxs(a2.a(), 0, new zp01(29), list2, new he7(i2, new ec01(i, organizationsModalView$chipsAdapter$2$1)), null);
        int i3 = t5r0.T;
        g0c a3 = qoi0.a(ci80.class);
        ukr0 ukr0Var = new ukr0(9);
        ukr0 ukr0Var2 = new ukr0(10);
        return new hm80(lkiVar, scc.g(zxsVar, zxsVar2, new zxs(a3.a(), 0, ukr0Var, EmptyList.a, new he7(i2, ukr0Var2), null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zm80 getAdapter() {
        return (zm80) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hm80 getChipsAdapter() {
        return (hm80) this.chipsAdapter.getValue();
    }

    private final int getImagesContainerHeight() {
        return ((Number) this.imagesContainerHeight.getValue()).intValue();
    }

    private final int getImagesContainerWidth() {
        return ((Number) this.imagesContainerWidth.getValue()).intValue();
    }

    private static /* synthetic */ void getImagesContainerWidth$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MapControlButtonsContainerView getRightSideButtonsContainer() {
        return (MapControlButtonsContainerView) this.rightSideButtonsContainer.getValue();
    }

    private final ko80 getScrollListener() {
        return (ko80) this.scrollListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<wk80> getSearchHeaderCardSpacer() {
        return (List) this.searchHeaderCardSpacer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<wk80> getSearchHeaderCardSpacerWithChips() {
        return (List) this.searchHeaderCardSpacerWithChips.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideHeaderAnimated() {
        if (this.isHeaderHidden || !canHideHeader()) {
            return;
        }
        cma1.h(-((lo80) getBinding()).f.getHeight(), ((lo80) getBinding()).f).start();
        cma1.h(-((lo80) getBinding()).g.getHeight(), ((lo80) getBinding()).g).start();
        this.isHeaderHidden = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int imagesContainerHeight_delegate$lambda$0(OrganizationsModalView organizationsModalView) {
        return (int) (organizationsModalView.getImagesContainerWidth() * 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int imagesContainerWidth_delegate$lambda$0(OrganizationsModalView organizationsModalView) {
        return xw31.v() - ((organizationsModalView.isOrganizationSnippetV2Enabled ? tje.r(mrg0.go_design_m_space, organizationsModalView.getContext()) : tje.r(mrg0.go_design_s_space, organizationsModalView.getContext())) * 2);
    }

    private final boolean isModalViewExpanded() {
        return getBottomSheetBehavior().E == 3 || getBottomSheetBehavior().E == 7;
    }

    private final boolean isModalViewGoingAnchored() {
        return getBottomSheetBehavior().y() == 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$1(tfx tfxVar) {
        ((sls) tfxVar).invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(OrganizationsModalView organizationsModalView) {
        organizationsModalView.getPresenter().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onUpButtonClicked() {
        showHeader();
        ((lo80) getBinding()).j.scrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void processRecyclerViewScrollState() {
        boolean canScrollVertically = ((lo80) getBinding()).j.canScrollVertically(-1);
        boolean z = this.isHideInputShadow;
        if (canScrollVertically) {
            if (z) {
                cma1.J(((lo80) getBinding()).g);
                this.isHideInputShadow = false;
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        cma1.M(((lo80) getBinding()).g);
        this.isHideInputShadow = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MapControlButtonsContainerView rightSideButtonsContainer_delegate$lambda$0(OrganizationsModalView organizationsModalView, Context context) {
        return new MapControlButtonsContainerView(context, new OrganizationsModalView$rightSideButtonsContainer$2$1(0, organizationsModalView.getPresenter(), d.class, "onZoomInButtonClicked", "onZoomInButtonClicked()V", 0), new OrganizationsModalView$rightSideButtonsContainer$2$2(0, organizationsModalView.getPresenter(), d.class, "onZoomOutButtonClicked", "onZoomOutButtonClicked()V", 0), new OrganizationsModalView$rightSideButtonsContainer$2$4(0, organizationsModalView.getPresenter(), d.class, "onLocationFocusingButtonClicked", "onLocationFocusingButtonClicked()V", 0), new OrganizationsModalView$rightSideButtonsContainer$2$3(0, organizationsModalView.getPresenter(), d.class, "onCompassButtonClicked", "onCompassButtonClicked()V", 0), organizationsModalView.getPresenter().y.b(), false, false, 192, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ko80 scrollListener_delegate$lambda$0(OrganizationsModalView organizationsModalView) {
        return new ko80(organizationsModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List searchHeaderCardSpacerWithChips_delegate$lambda$0(OrganizationsModalView organizationsModalView) {
        return Collections.singletonList(new wk80(ru.yandex.taxi.design.utils.c.d(dug0.discovery_organizations_search_header_with_chips, organizationsModalView)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List searchHeaderCardSpacer_delegate$lambda$0(OrganizationsModalView organizationsModalView) {
        return Collections.singletonList(new wk80(ru.yandex.taxi.design.utils.c.d(dug0.discovery_organizations_search_header, organizationsModalView)));
    }

    private final void setMapEnabledMode() {
        wac0 a = this.mapConfig.a(getMapScreenId());
        AnchorBottomSheetBehavior<View> bottomSheetBehavior = getBottomSheetBehavior();
        lab1.j(bottomSheetBehavior, a != null ? a.d : null, a != null ? a.f : null, getAnchorHeight());
        setArrowState(ArrowsView.State.PLAIN);
        getBottomSheetBehavior().N = new ht10(this, bottomSheetBehavior, false, 29);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupContainersTopMargin() {
        final int r = tje.r(dug0.discovery_organizations_modal_view_error_container_top_margin, getContext());
        final lo80 lo80Var = (lo80) getBinding();
        lo80Var.f.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.yandex.go.places.impl.ui.organizations.OrganizationsModalView$setupContainersTopMargin$1$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int height = lo80.this.f.getHeight() + r;
                xw31.L(height, lo80.this.d.b);
                xw31.E((GoLinearLayout) lo80.this.c.d, null, Integer.valueOf(height), null, null);
                lo80.this.f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    private final void setupOpenMapButton(lo80 lo80Var) {
        lo80Var.i.setDebounceClickListener(new ho80(this, 0));
        lo80Var.i.setPaddingRelative(tje.r(dug0.discovery_organizations_map_button_start_padding, getContext()), 0, tje.r(dug0.discovery_organizations_map_button_end_padding, getContext()), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupOpenMapButton$lambda$0(OrganizationsModalView organizationsModalView) {
        if (organizationsModalView.getIsMapEnabled()) {
            organizationsModalView.anchor();
            organizationsModalView.getPresenter().R.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showHeader() {
        if (this.isHeaderHidden) {
            this.isHeaderHidden = false;
            this.amountScrollY = 0;
            ((lo80) getBinding()).f.setTranslationY(0.0f);
            ((lo80) getBinding()).g.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showHeaderAnimated() {
        if (this.isHeaderHidden) {
            cma1.h(0.0f, ((lo80) getBinding()).f).start();
            cma1.h(0.0f, ((lo80) getBinding()).g).start();
            this.isHeaderHidden = false;
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void anchor() {
        super.anchor();
        showHeaderAnimated();
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public lo80 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(uuh0.organizations_modal_view, parent, false);
        int i = o6h0.back_button;
        GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
        if (goImageView != null && (O = cma1.O((i = o6h0.empty_container), inflate)) != null) {
            int i2 = o6h0.button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i2, O);
            if (buttonComponent != null) {
                GoLinearLayout goLinearLayout = (GoLinearLayout) O;
                i2 = o6h0.icon;
                GoImageView goImageView2 = (GoImageView) cma1.O(i2, O);
                if (goImageView2 != null) {
                    i2 = o6h0.subtitle;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, O);
                    if (robotoTextView != null) {
                        i2 = o6h0.title;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, O);
                        if (robotoTextView2 != null) {
                            dna dnaVar = new dna(goImageView2, goLinearLayout, buttonComponent, robotoTextView, robotoTextView2);
                            i = o6h0.error_loading_container;
                            View O2 = cma1.O(i, inflate);
                            if (O2 != null) {
                                px6 o = px6.o(O2);
                                i = o6h0.filter_chips;
                                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                                if (recyclerView != null) {
                                    i = o6h0.header_container;
                                    GoConstraintLayout goConstraintLayout = (GoConstraintLayout) cma1.O(i, inflate);
                                    if (goConstraintLayout != null) {
                                        i = o6h0.input_bottom_shadow;
                                        GoView goView = (GoView) cma1.O(i, inflate);
                                        if (goView != null) {
                                            i = o6h0.input_component;
                                            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                                            if (listItemComponent != null) {
                                                i = o6h0.open_map_button;
                                                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                                                if (buttonComponent2 != null) {
                                                    i = o6h0.organization_item_search_list;
                                                    RecyclerView recyclerView2 = (RecyclerView) cma1.O(i, inflate);
                                                    if (recyclerView2 != null) {
                                                        i = o6h0.organizations_container;
                                                        ShimmeringFrameLayout shimmeringFrameLayout = (ShimmeringFrameLayout) cma1.O(i, inflate);
                                                        if (shimmeringFrameLayout != null) {
                                                            i = o6h0.up_button;
                                                            CircleButtonImageView circleButtonImageView = (CircleButtonImageView) cma1.O(i, inflate);
                                                            if (circleButtonImageView != null) {
                                                                return new lo80((GoConstraintLayout) inflate, goImageView, dnaVar, o, recyclerView, goConstraintLayout, goView, listItemComponent, buttonComponent2, recyclerView2, shimmeringFrameLayout, circleButtonImageView);
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
            ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
            return null;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    @Override // defpackage.n3v
    public View getDelayedGoneLayoutReadyView() {
        return this;
    }

    @Override // defpackage.p3v
    public PlacesMapConfig$PlacesMapScreenName getMapScreenId() {
        return this.mapScreenId;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getMaxAnchoredHeight() {
        return getAnchorHeight() + getCurrentInsets().g;
    }

    @Override // defpackage.p3v
    /* renamed from: isMapEnabled, reason: from getter */
    public boolean getIsMapEnabled() {
        return this.isMapEnabled;
    }

    @Override // defpackage.n3v
    public /* bridge */ boolean isReadyForDelayedGone() {
        return super.isReadyForDelayedGone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.impl.ui.organizations.base.BaseOrganizationsModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        setOnBackPressedListener(new ho80(this, 1));
        d presenter = getPresenter();
        a aVar = new a(this);
        presenter.Bg(aVar);
        presenter.resume();
        tje.N(presenter.Jg(), null, null, new OrganizationsPresenter$attachView$$inlined$safeCollectIn$1(new c(presenter.K.a(), presenter), null, aVar), 3);
        e eVar = presenter.L;
        tje.N(presenter.Jg(), null, null, new OrganizationsPresenter$attachView$$inlined$safeCollectIn$2(new m0(kotlinx.coroutines.flow.e.d(eVar.e.a), eVar.d.c, new OrganizationsUiStateInteractor$screenUiStateFlow$1(eVar, null)), null, aVar), 3);
        tje.N(presenter.Jg(), null, null, new OrganizationsPresenter$attachView$$inlined$safeCollectIn$3(new mth(presenter.Q.b, 6), null, presenter), 3);
        lo80 lo80Var = (lo80) getBinding();
        RecyclerView recyclerView = lo80Var.j;
        recyclerView.setLayoutManager(this.linearLayoutManager);
        recyclerView.setAdapter(getAdapter());
        recyclerView.setItemAnimator(null);
        recyclerView.addOnScrollListener(getScrollListener());
        RecyclerView recyclerView2 = lo80Var.e;
        recyclerView2.setLayoutManager(this.chipsLayoutManager);
        recyclerView2.setAdapter(getChipsAdapter());
        recyclerView2.setNestedScrollingEnabled(false);
        recyclerView2.addItemDecoration(new iru(tje.r(dug0.discovery_organizations_header_filter_chips_insets, recyclerView2.getContext())));
        if (getIsMapEnabled()) {
            setMapEnabledMode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.impl.ui.organizations.base.BaseOrganizationsModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getPresenter().Cg();
        this.focusCoordinator.Lc(OrganizationsModalView.class, null);
        RecyclerView recyclerView = ((lo80) getBinding()).j;
        recyclerView.removeOnScrollListener(getScrollListener());
        recyclerView.setAdapter(null);
        this.reportedOrganisationsIdInteractor.a.a.clear();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
    }

    @Override // com.yandex.go.places.impl.ui.organizations.base.BaseOrganizationsModalView, ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return xw31.o(getRootView(), getCardContentView(), event);
    }

    @Override // com.yandex.go.places.base.ui.base_old.BaseOrganizationDiscoveryModalView, ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "OrganizationsModalView";
    }

    public void setAppearAnimationCompleteListener(sls listener) {
        setOneShotAppearAnimationCompleteListener(listener);
    }

    @Override // com.yandex.go.places.impl.ui.organizations.base.BaseOrganizationsModalView, ru.yandex.taxi.widget.SlideableModalView
    public void setInitialBehaviorState(AnchorBottomSheetBehavior<View> bottomSheetBehavior) {
        CardRevealing cardRevealing;
        wac0 a = this.mapConfig.a(getMapScreenId());
        int i = 3;
        if (getIsMapEnabled()) {
            kbc0 kbc0Var = this.placesMapScreenParamsOverride;
            if (kbc0Var == null || (cardRevealing = kbc0Var.a) == null) {
                i = lab1.e(a != null ? a.d : null, a != null ? a.f : null, getAnchorHeight(), a != null ? a.g : null);
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
        }
        bottomSheetBehavior.O(i);
        updateExpandedTopScrimForState(bottomSheetBehavior.E);
    }

    @Override // com.yandex.go.places.base.ui.base_old.BaseOrganizationDiscoveryModalView
    public d getPresenter() {
        return this.presenter;
    }
}
