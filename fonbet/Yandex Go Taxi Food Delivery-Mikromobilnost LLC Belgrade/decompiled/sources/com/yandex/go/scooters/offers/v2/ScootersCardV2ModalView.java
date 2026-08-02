package com.yandex.go.scooters.offers.v2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.yandex.go.scooters.offers.v2.ScootersCardV2ModalView;
import com.yandex.go.scooters.offers.v2.components.ScootersComponentsView;
import com.yandex.go.scooters.offers.v2.components.bottom.ScootersCardBottomComponent;
import com.yandex.go.scooters.offers.v2.f;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a3n0;
import defpackage.a3v;
import defpackage.a6p0;
import defpackage.ah00;
import defpackage.ajl0;
import defpackage.avo0;
import defpackage.bia0;
import defpackage.bvo0;
import defpackage.cq80;
import defpackage.e230;
import defpackage.e7p0;
import defpackage.f4p0;
import defpackage.fcj0;
import defpackage.fy30;
import defpackage.g4p0;
import defpackage.g6n0;
import defpackage.g8n0;
import defpackage.gh00;
import defpackage.h4p0;
import defpackage.h6n0;
import defpackage.h7n0;
import defpackage.i2b1;
import defpackage.i3y;
import defpackage.i4p0;
import defpackage.i5m;
import defpackage.j6n0;
import defpackage.j741;
import defpackage.jpj0;
import defpackage.k1b1;
import defpackage.k6n0;
import defpackage.ktg;
import defpackage.l4n0;
import defpackage.lzm0;
import defpackage.mqg0;
import defpackage.msg0;
import defpackage.n7n0;
import defpackage.nsg0;
import defpackage.ny61;
import defpackage.o4n0;
import defpackage.o7n0;
import defpackage.ozm0;
import defpackage.pav;
import defpackage.qdb1;
import defpackage.qfh0;
import defpackage.quo0;
import defpackage.r2n0;
import defpackage.rea0;
import defpackage.s4n0;
import defpackage.s6n0;
import defpackage.sje;
import defpackage.sls;
import defpackage.son0;
import defpackage.srh0;
import defpackage.t2n0;
import defpackage.tje;
import defpackage.tse;
import defpackage.u7g;
import defpackage.ug;
import defpackage.vpa;
import defpackage.vty;
import defpackage.w040;
import defpackage.wfz;
import defpackage.xng0;
import defpackage.xvf0;
import defpackage.xw31;
import defpackage.y5n0;
import defpackage.yln;
import defpackage.z0a0;
import defpackage.z2n0;
import defpackage.zmm0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.scooters.presentation.common.ui.preview.ScootersVehiclePreviewView;
import ru.yandex.taxi.scooters.utils.ScootersCompassRotatableFloatButton;
import ru.yandex.taxi.scooters.utils.ScootersGeoButtonIconComponent;
import ru.yandex.taxi.scooters.utils.ScootersSupportButtonIconComponent;
import ru.yandex.taxi.scooters.utils.ScootersVehicleActualPhotoButtonIconComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u009d\u0001Bw\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H\u0014¢\u0006\u0004\b+\u0010*J\u001f\u0010/\u001a\u00020(2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0019H\u0014¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0019H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020,H\u0014¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020(H\u0014¢\u0006\u0004\b5\u0010*J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00192\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00192\u0006\u0010:\u001a\u000209H\u0017¢\u0006\u0004\b=\u0010<J\u0017\u0010@\u001a\u00020(2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020(H\u0014¢\u0006\u0004\bB\u0010*J\u0017\u0010D\u001a\u00020(2\u0006\u0010C\u001a\u00020\u0019H\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020(2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0019H\u0002¢\u0006\u0004\bK\u0010EJ\u000f\u0010L\u001a\u00020(H\u0002¢\u0006\u0004\bL\u0010*J\u001f\u0010O\u001a\u00020\u00192\u0006\u0010M\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u0019H\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020(H\u0002¢\u0006\u0004\bQ\u0010*J\u000f\u0010R\u001a\u00020(H\u0002¢\u0006\u0004\bR\u0010*J\u0017\u0010S\u001a\u00020\u00192\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bS\u0010<J\u0017\u0010U\u001a\u00020(2\u0006\u0010T\u001a\u00020FH\u0002¢\u0006\u0004\bU\u0010IJ\u000f\u0010V\u001a\u00020(H\u0002¢\u0006\u0004\bV\u0010*J\u000f\u0010W\u001a\u00020(H\u0002¢\u0006\u0004\bW\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010XR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010YR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010ZR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010[R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\\R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010]R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010^R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010_R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010`R\u001e\u0010b\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u001e\u0010d\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010cR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010q\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010gR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010u\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010z\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R!\u0010\u008a\u0001\u001a\u00030\u0085\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010_R\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u008f\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u0091\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0090\u0001R\u0017\u0010\u0092\u0001\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0090\u0001R\u0017\u0010\u0093\u0001\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0097\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010_R\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001e\u0010\u009b\u0001\u001a\u00020,8\u0014X\u0094\u0004¢\u0006\u000f\n\u0006\b\u009b\u0001\u0010\u0090\u0001\u001a\u0005\b\u009c\u0001\u00104¨\u0006\u009e\u0001"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/ScootersCardV2ModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lk6n0;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/scooters/presentation/common/ui/preview/ScootersVehiclePreviewView;", "scootersVehiclePreviewViewProvider", "Ll4n0;", "scootersCardBottomComponentFactory", "Lg8n0;", "scootersCompassRotatableFloatButtonFactory", "Lpav;", "imageLoader", "La3v;", "iFocusCoordinator", "Lcom/yandex/go/scooters/offers/v2/f;", "scootersCardV2Presenter", "Ls6n0;", "scootersCardV2ProxyAnalytics", "Llzm0;", "scootersAttentionViewDelegate", "Lg4p0;", "scootersTariffFixRouteOverlayFactory", "Lcom/yandex/go/scooters/offers/v2/analytics/c;", "scootersOfferCardPerformanceAnalytics", "", "hideFloatButtonsRelatedToMap", "Lcom/yandex/go/scooters/offers/v2/components/ScootersComponentsView;", "scootersComponentsView", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/scooters/presentation/common/ui/preview/ScootersVehiclePreviewView;Ll4n0;Lg8n0;Lpav;La3v;Lcom/yandex/go/scooters/offers/v2/f;Ls6n0;Llzm0;Lg4p0;Lcom/yandex/go/scooters/offers/v2/analytics/c;ZLcom/yandex/go/scooters/offers/v2/components/ScootersComponentsView;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lk6n0;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "newState", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "canDragToExpandFromAnchored", "()Z", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "animateDismissBackground", "", "screenName", "()Ljava/lang/String;", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "Ljava/lang/Runnable;", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "onArrowClick", "isOpened", "onAttentionHeaderChanged", "(Z)V", "Landroid/view/View;", "view", "onAttentionAttach", "(Landroid/view/View;)V", BackendConfig.Restrictions.ENABLED, "onTouchExplorationStateChanged", "onDrawEvent", "firstVisibleFromScroll", "secondVisibleFromExpandedState", "isResultShadowVisible", "(ZZ)Z", "updateFocusCoordinatorMargins", "updateHeights", "isTouchInsideCardContent", "bottomStickyContainer", "setupAccessibilityFocusOrder", "expandOnTouchExploration", "cleanAndSetNullTooltipContainer", "Lpav;", "La3v;", "Lcom/yandex/go/scooters/offers/v2/f;", "Ls6n0;", "Llzm0;", "Lg4p0;", "Lcom/yandex/go/scooters/offers/v2/analytics/c;", "Z", "Lcom/yandex/go/scooters/offers/v2/components/ScootersComponentsView;", "Lkotlin/Function0;", "onHwBackPressedListener", "Lsls;", "onSoftBackPressedListener", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lru/yandex/taxi/scooters/utils/ScootersCompassRotatableFloatButton;", "compassButton", "Lru/yandex/taxi/scooters/utils/ScootersCompassRotatableFloatButton;", "Lru/yandex/taxi/scooters/utils/ScootersGeoButtonIconComponent;", "geoButton", "Lru/yandex/taxi/scooters/utils/ScootersGeoButtonIconComponent;", "Lru/yandex/taxi/scooters/utils/ScootersVehicleActualPhotoButtonIconComponent;", "vehicleActualPhotoButton", "Lru/yandex/taxi/scooters/utils/ScootersVehicleActualPhotoButtonIconComponent;", "supportButton", "Lcom/yandex/go/scooters/offers/v2/components/bottom/ScootersCardBottomComponent;", "scootersCardBottomComponent", "Lcom/yandex/go/scooters/offers/v2/components/bottom/ScootersCardBottomComponent;", "alternativeOfferPreviewView", "Lru/yandex/taxi/scooters/presentation/common/ui/preview/ScootersVehiclePreviewView;", "Lktg;", "mapFocusChangeDebouncer", "Lktg;", "updateAnchoredHeightRunnable", "Ljava/lang/Runnable;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "drawListener", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Lo7n0;", "combinedShadowVisibilityConsumer", "Lo7n0;", "Lbvo0;", "expandedStateConsumer", "Lbvo0;", "Lf4p0;", "scootersRouteOverlay$delegate", "Li3y;", "getScootersRouteOverlay", "()Lf4p0;", "scootersRouteOverlay", "touchExplorationEnabled", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "touchExplorationStateChangeListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "collapsedHeight", CA20Status.STATUS_USER_I, "anchorHeight", "focusRectTopMargin", "focusRectBottomAdditionalMargin", "", "contentViewOccupiedWidth", "F", "isDisabled", "Le7p0;", "vehicleActualPhotoTooltipContainer", "Le7p0;", "slideableBackgroundAttrRes", "getSlideableBackgroundAttrRes", "j6n0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersCardV2ModalView extends SlideableBindingModalView<k6n0> {
    public static final int $stable = 8;
    private final ScootersVehiclePreviewView alternativeOfferPreviewView;
    private int anchorHeight;
    private final FloatButtonIconComponent backButton;
    private int collapsedHeight;
    private final o7n0 combinedShadowVisibilityConsumer;
    private final ScootersCompassRotatableFloatButton compassButton;
    private final float contentViewOccupiedWidth;
    private final ViewTreeObserver.OnDrawListener drawListener;
    private final bvo0 expandedStateConsumer;
    private final int focusRectBottomAdditionalMargin;
    private final int focusRectTopMargin;
    private final ScootersGeoButtonIconComponent geoButton;
    private final boolean hideFloatButtonsRelatedToMap;
    private final a3v iFocusCoordinator;
    private final pav imageLoader;
    private boolean isDisabled;
    private final ktg mapFocusChangeDebouncer;
    private sls onHwBackPressedListener;
    private sls onSoftBackPressedListener;
    private final lzm0 scootersAttentionViewDelegate;
    private final ScootersCardBottomComponent scootersCardBottomComponent;
    private final f scootersCardV2Presenter;
    private final s6n0 scootersCardV2ProxyAnalytics;
    private final ScootersComponentsView scootersComponentsView;
    private final com.yandex.go.scooters.offers.v2.analytics.c scootersOfferCardPerformanceAnalytics;

    /* renamed from: scootersRouteOverlay$delegate, reason: from kotlin metadata */
    private final i3y scootersRouteOverlay;
    private final g4p0 scootersTariffFixRouteOverlayFactory;
    private final int slideableBackgroundAttrRes;
    private final FloatButtonIconComponent supportButton;
    private boolean touchExplorationEnabled;
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;
    private final Runnable updateAnchoredHeightRunnable;
    private final ScootersVehicleActualPhotoButtonIconComponent vehicleActualPhotoButton;
    private e7p0 vehicleActualPhotoTooltipContainer;

    public ScootersCardV2ModalView(Context context, ScootersVehiclePreviewView scootersVehiclePreviewView, l4n0 l4n0Var, g8n0 g8n0Var, pav pavVar, a3v a3vVar, final f fVar, s6n0 s6n0Var, lzm0 lzm0Var, g4p0 g4p0Var, com.yandex.go.scooters.offers.v2.analytics.c cVar, boolean z, ScootersComponentsView scootersComponentsView) {
        super(context, 6);
        this.imageLoader = pavVar;
        this.iFocusCoordinator = a3vVar;
        this.scootersCardV2Presenter = fVar;
        this.scootersCardV2ProxyAnalytics = s6n0Var;
        this.scootersAttentionViewDelegate = lzm0Var;
        this.scootersTariffFixRouteOverlayFactory = g4p0Var;
        this.scootersOfferCardPerformanceAnalytics = cVar;
        this.hideFloatButtonsRelatedToMap = z;
        this.scootersComponentsView = scootersComponentsView;
        final int i = 0;
        BackButtonIconComponent b = qdb1.b(this, new g6n0(this, i));
        this.backButton = b;
        vpa vpaVar = new vpa(22);
        int i2 = 14;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet = null;
        int i3 = 0;
        int i4 = 0;
        ScootersVehicleActualPhotoButtonIconComponent scootersVehicleActualPhotoButtonIconComponent = new ScootersVehicleActualPhotoButtonIconComponent(getContext(), attributeSet, i3, i4, i2, defaultConstructorMarker);
        scootersVehicleActualPhotoButtonIconComponent.setDebounceClickListener(vpaVar);
        scootersVehicleActualPhotoButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, scootersVehicleActualPhotoButtonIconComponent.getContext())));
        vehicleActualPhotoButton$lambda$1(scootersVehicleActualPhotoButtonIconComponent);
        addFloatButton(scootersVehicleActualPhotoButtonIconComponent, 8388613);
        this.vehicleActualPhotoButton = scootersVehicleActualPhotoButtonIconComponent;
        Runnable runnable = new Runnable() { // from class: i6n0
            @Override // java.lang.Runnable
            public final void run() {
                int i5 = i;
                f fVar2 = fVar;
                switch (i5) {
                    case 0:
                        ScootersCardV2ModalView.supportButton$supportTapped(fVar2);
                        break;
                    default:
                        ScootersCardV2ModalView._init_$handleFocus(fVar2);
                        break;
                }
            }
        };
        ScootersSupportButtonIconComponent scootersSupportButtonIconComponent = new ScootersSupportButtonIconComponent(getContext(), attributeSet, i3, i4, i2, defaultConstructorMarker);
        scootersSupportButtonIconComponent.setDebounceClickListener(runnable);
        scootersSupportButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, scootersSupportButtonIconComponent.getContext())));
        addFloatButton(scootersSupportButtonIconComponent, 8388613);
        this.supportButton = scootersSupportButtonIconComponent;
        w040 w040Var = ((o4n0) l4n0Var).a;
        ScootersCardBottomComponent scootersCardBottomComponent = new ScootersCardBottomComponent((Context) ((xvf0) w040Var.a).get(), (tse) ((xvf0) w040Var.b).get(), (pav) ((xvf0) w040Var.c).get(), (z0a0) ((xvf0) w040Var.d).get(), (bia0) ((xvf0) w040Var.e).get(), (s4n0) ((fy30) w040Var.g).get(), (s6n0) ((xvf0) w040Var.f).get(), (rea0) ((xvf0) w040Var.h).get());
        this.scootersCardBottomComponent = scootersCardBottomComponent;
        scootersVehiclePreviewView.setVisibility(8);
        this.alternativeOfferPreviewView = scootersVehiclePreviewView;
        this.mapFocusChangeDebouncer = new ktg();
        this.updateAnchoredHeightRunnable = new g6n0(this, 2);
        final int i5 = 1;
        this.drawListener = new vty(i5, this);
        o7n0 o7n0Var = new o7n0(new ScootersCardV2ModalView$combinedShadowVisibilityConsumer$1(2, this, ScootersCardV2ModalView.class, "isResultShadowVisible", "isResultShadowVisible(ZZ)Z", 0));
        this.combinedShadowVisibilityConsumer = o7n0Var;
        this.expandedStateConsumer = new n7n0(o7n0Var, 0);
        this.scootersRouteOverlay = kotlin.a.a(new h6n0(this, i5));
        this.touchExplorationEnabled = tje.L(context);
        this.touchExplorationStateChangeListener = new sje(4, this);
        this.collapsedHeight = tje.r(nsg0.scooters_default_collapsed_height, getContext());
        this.anchorHeight = tje.r(nsg0.scooters_default_anchor_height, getContext());
        this.focusRectTopMargin = tje.r(msg0.scooters_top_notification_focus_rect_margin, getContext());
        this.focusRectBottomAdditionalMargin = tje.u(64, getContext());
        this.contentViewOccupiedWidth = tje.w(98, getContext());
        son0 b2 = k1b1.b(this, g8n0Var.a(), new Runnable() { // from class: i6n0
            @Override // java.lang.Runnable
            public final void run() {
                int i52 = i5;
                f fVar2 = fVar;
                switch (i52) {
                    case 0:
                        ScootersCardV2ModalView.supportButton$supportTapped(fVar2);
                        break;
                    default:
                        ScootersCardV2ModalView._init_$handleFocus(fVar2);
                        break;
                }
            }
        });
        ScootersGeoButtonIconComponent scootersGeoButtonIconComponent = b2.a;
        this.geoButton = scootersGeoButtonIconComponent;
        ScootersCompassRotatableFloatButton scootersCompassRotatableFloatButton = b2.b;
        this.compassButton = scootersCompassRotatableFloatButton;
        scootersGeoButtonIconComponent.setVisibility(z ? 8 : 0);
        scootersCompassRotatableFloatButton.setVisibility(z ? 8 : 0);
        b.setVisibility(z ? 8 : 0);
        scootersSupportButtonIconComponent.setVisibility(8);
        ((k6n0) getBinding()).b.addView(scootersComponentsView);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getContentView();
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        coordinatorLayout.addView(scootersCardBottomComponent, layoutParams);
        scootersVehiclePreviewView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        SlideableModalView.addViewAboveCard$default(this, scootersVehiclePreviewView, 1, 0, 4, null);
        a6p0 a6p0Var = new a6p0(scootersCardBottomComponent);
        _init_$lambda$2(this, a6p0Var);
        ViewGroup viewGroup = (ViewGroup) scootersCardBottomComponent.getParent();
        ViewGroup.LayoutParams layoutParams2 = scootersCardBottomComponent.getLayoutParams();
        int indexOfChild = viewGroup.indexOfChild(scootersCardBottomComponent);
        viewGroup.removeView(scootersCardBottomComponent);
        cq80 cq80Var = a6p0Var.b;
        cq80Var.c.addView(scootersCardBottomComponent);
        viewGroup.addView(cq80Var.b, indexOfChild, layoutParams2);
        s6n0Var.b = new h6n0(this, 0);
        setupAccessibilityFocusOrder(scootersCardBottomComponent);
        scootersCardBottomComponent.addOnLayoutChangeListener(new yln(20, this));
        scootersComponentsView.setPadding(scootersComponentsView.getPaddingLeft(), scootersComponentsView.getPaddingTop(), scootersComponentsView.getPaddingRight(), tje.r(nsg0.scooters_default_components_bottom_padding, getContext()));
        this.slideableBackgroundAttrRes = xng0.bgTransparent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$handleFocus(f fVar) {
        tje.N(fVar.Jg(), null, null, new ScootersCardV2Presenter$handleFocus$1(fVar, null), 3);
    }

    private static final zy11 _init_$lambda$2(ScootersCardV2ModalView scootersCardV2ModalView, a6p0 a6p0Var) {
        o7n0 o7n0Var = scootersCardV2ModalView.combinedShadowVisibilityConsumer;
        o7n0Var.b = a6p0Var;
        new avo0(scootersCardV2ModalView.getBinding().a, new n7n0(o7n0Var, 1));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$3(ScootersCardV2ModalView scootersCardV2ModalView) {
        return scootersCardV2ModalView.getBottomSheetBehavior().E == 3 || scootersCardV2ModalView.getBottomSheetBehavior().E == 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void backButton$lambda$0(ScootersCardV2ModalView scootersCardV2ModalView) {
        sls slsVar = scootersCardV2ModalView.onSoftBackPressedListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanAndSetNullTooltipContainer() {
        e7p0 e7p0Var = this.vehicleActualPhotoTooltipContainer;
        if (e7p0Var != null) {
            if (e7p0Var.d != null) {
                e7p0Var.b();
                BubbleComponent.hide$default(e7p0Var.c().a, false, 1, null);
            }
            e7p0Var.d = null;
        }
        this.vehicleActualPhotoTooltipContainer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void expandOnTouchExploration() {
        if (this.touchExplorationEnabled) {
            expand();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f4p0 getScootersRouteOverlay() {
        return (f4p0) this.scootersRouteOverlay.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isResultShadowVisible(boolean firstVisibleFromScroll, boolean secondVisibleFromExpandedState) {
        return firstVisibleFromScroll || secondVisibleFromExpandedState;
    }

    private final boolean isTouchInsideCardContent(MotionEvent event) {
        return xw31.o(getRootView(), getCardContentView(), event) || xw31.o(getRootView(), this.backButton, event) || xw31.o(getRootView(), this.vehicleActualPhotoButton, event) || xw31.o(getRootView(), this.geoButton, event) || xw31.o(getRootView(), this.compassButton, event) || xw31.o(getRootView(), this.supportButton, event) || xw31.o(getRootView(), this.alternativeOfferPreviewView, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAttentionAttach(View view) {
        view.setId(qfh0.scooters_attention);
        getBinding().b.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAttentionHeaderChanged(boolean isOpened) {
        if (isOpened) {
            updateAnchoredHeight(false);
        } else {
            postDelayed(this.updateAnchoredHeightRunnable, 600L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDrawEvent() {
        f fVar = this.scootersCardV2Presenter;
        tje.N(fVar.Jg(), null, null, new ScootersCardV2Presenter$cardHeightChanged$1(fVar, getContentView().getHeight() - ((int) getBottomSheet().getY()), null), 3);
        float width = getContentView().getWidth() - this.contentViewOccupiedWidth;
        if (this.alternativeOfferPreviewView.getWidth() > width) {
            ScootersVehiclePreviewView scootersVehiclePreviewView = this.alternativeOfferPreviewView;
            ViewGroup.LayoutParams layoutParams = scootersVehiclePreviewView.getLayoutParams();
            layoutParams.width = (int) width;
            scootersVehiclePreviewView.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTouchExplorationStateChanged(boolean enabled) {
        if (this.touchExplorationEnabled != enabled) {
            this.touchExplorationEnabled = enabled;
            getBottomSheetBehavior().a0 = !this.touchExplorationEnabled;
            expandOnTouchExploration();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f4p0 scootersRouteOverlay_delegate$lambda$0(ScootersCardV2ModalView scootersCardV2ModalView) {
        fcj0 fcj0Var = ((h4p0) scootersCardV2ModalView.scootersTariffFixRouteOverlayFactory).a;
        u7g u7gVar = new u7g(fcj0Var, 1);
        return (i4p0) i5m.b(new zmm0(u7gVar, new u7g(fcj0Var, 0), new u7g(fcj0Var, 2), i5m.b(new jpj0(u7gVar, i5m.b(quo0.a), new u7g(fcj0Var, 3), 27, false)), new u7g(fcj0Var, 4), 19)).get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnBackPressedListener$lambda$0(ScootersCardV2ModalView scootersCardV2ModalView, Runnable runnable) {
        if (!scootersCardV2ModalView.isAnchored() && !scootersCardV2ModalView.touchExplorationEnabled) {
            scootersCardV2ModalView.anchor();
            return;
        }
        a3n0 a3n0Var = (a3n0) scootersCardV2ModalView.scootersCardV2Presenter.B.a.getValue();
        if ((a3n0Var instanceof r2n0) || (a3n0Var instanceof t2n0) || (a3n0Var instanceof z2n0)) {
            return;
        }
        runnable.run();
    }

    private final void setupAccessibilityFocusOrder(View bottomStickyContainer) {
        androidx.core.view.b.p(bottomStickyContainer, new ug(getCardContentView(), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void supportButton$supportTapped(f fVar) {
        ((h7n0) fVar.A).k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFocusCoordinatorMargins() {
        this.iFocusCoordinator.Lc(wfz.P, new Rect(0, this.focusRectTopMargin, 0, Math.max(getContentView().getHeight() - getBottomSheet().getTop(), this.collapsedHeight) + this.focusRectBottomAdditionalMargin));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateHeights() {
        ScootersComponentsView scootersComponentsView = this.scootersComponentsView;
        scootersComponentsView.setPadding(scootersComponentsView.getPaddingLeft(), scootersComponentsView.getPaddingTop(), scootersComponentsView.getPaddingRight(), this.scootersCardBottomComponent.getHeight());
        int i = this.collapsedHeight;
        if (i == 0) {
            setBehaviorPeekHeight(0);
        } else {
            setBehaviorPeekHeight(this.scootersCardBottomComponent.getHeight() + i);
        }
        setBehaviorAnchorHeight(Integer.valueOf(this.scootersCardBottomComponent.getHeight() + this.anchorHeight));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vehicleActualPhotoButton$lambda$0() {
    }

    private static final zy11 vehicleActualPhotoButton$lambda$1(FloatButtonIconComponent floatButtonIconComponent) {
        floatButtonIconComponent.setY(ru.yandex.taxi.design.utils.c.j(46, floatButtonIconComponent));
        floatButtonIconComponent.setVisibility(8);
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismissBackground() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public k6n0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(srh0.scooters_card_v2_modal_view, parent, false);
        parent.addView(inflate);
        if (inflate != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) inflate;
            return new k6n0(nestedScrollView, nestedScrollView);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getSlideableBackgroundAttrRes() {
        return this.slideableBackgroundAttrRes;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return i2b1.b(this, this.scootersCardBottomComponent, this.scootersComponentsView);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onArrowClick() {
        if (this.touchExplorationEnabled) {
            return;
        }
        if (isAnchored()) {
            expand();
        } else {
            anchor();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setDismissOnBackPressed(false);
        getBottomSheetBehavior().C = false;
        getBottomSheetBehavior().a0 = !this.touchExplorationEnabled;
        setBehaviorPeekHeight(this.collapsedHeight);
        setBehaviorAnchorHeight(Integer.valueOf(this.anchorHeight));
        getBinding().b.removeAllViews();
        ((ozm0) this.scootersAttentionViewDelegate).a(this.scootersComponentsView, new ScootersCardV2ModalView$onAttachedToWindow$1(1, this, ScootersCardV2ModalView.class, "onAttentionHeaderChanged", "onAttentionHeaderChanged(Z)V", 0), new ScootersCardV2ModalView$onAttachedToWindow$2(1, this.scootersCardV2Presenter, f.class, "attentionMessageClicked", "attentionMessageClicked(Lcom/yandex/go/scooters/misc/api/attention/domain/ScootersAttention;)V", 0), new ScootersCardV2ModalView$onAttachedToWindow$3(1, this, ScootersCardV2ModalView.class, "onAttentionAttach", "onAttentionAttach(Landroid/view/View;)V", 0));
        f fVar = this.scootersCardV2Presenter;
        fVar.Bg(new j6n0(this));
        fVar.C.b.Fg(Boolean.TRUE);
        fVar.O.a().getClass();
        tje.N(fVar.Jg(), null, null, new ScootersCardV2Presenter$listenToOffer$1(fVar, null), 3);
        tje.N(fVar.Jg(), null, null, new ScootersCardV2Presenter$listenToCurrentOffer$1(fVar, null), 3);
        tje.N(fVar.Jg(), null, null, new ScootersCardV2Presenter$listenToFocusType$1(fVar, null), 3);
        tje.N(fVar.Jg(), null, null, new ScootersCardV2Presenter$listenToBookState$$inlined$collectIn$1(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.d(fVar.B.a)), null, fVar), 3);
        tje.N(fVar.Jg(), null, null, new ScootersCardV2Presenter$listenToPhotocontrolTerminalState$$inlined$collectIn$1(kotlinx.coroutines.flow.e.t(new e(fVar.y.f("photocontrol"))), null, fVar.A), 3);
        tje.N(fVar.Jg(), null, null, new ScootersCardV2Presenter$listenToDriverLicenseNotification$1(fVar, null), 3);
        tje.N(fVar.Jg(), null, null, new ScootersCardV2Presenter$listenToTransportSegment$1(fVar, null), 3);
        tje.N(fVar.Jg(), null, null, new ScootersCardV2Presenter$adjustCardHeight$1(fVar, null), 3);
        tje.B(getContext()).addTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        getViewTreeObserver().addOnDrawListener(this.drawListener);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        y5n0 y5n0Var;
        int i = 1;
        this.expandedStateConsumer.a(!isExpanded());
        if (isExpanded() || isAnchored() || isCollapsed()) {
            s6n0 s6n0Var = this.scootersCardV2ProxyAnalytics;
            h6n0 h6n0Var = s6n0Var.b;
            if (h6n0Var == null) {
                h6n0Var = null;
            }
            boolean booleanValue = ((Boolean) h6n0Var.invoke()).booleanValue();
            if (booleanValue != s6n0Var.c && (y5n0Var = s6n0Var.d) != null) {
                s6n0Var.a.d(y5n0Var, booleanValue, s6n0Var.e);
            }
            s6n0Var.c = booleanValue;
        }
        if (newState == 6) {
            ktg ktgVar = this.mapFocusChangeDebouncer;
            g6n0 g6n0Var = new g6n0(this, i);
            ktgVar.a();
            ktgVar.b = g6n0Var;
            ktgVar.a.postDelayed(g6n0Var, 700L);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.updateAnchoredHeightRunnable);
        ozm0 ozm0Var = (ozm0) this.scootersAttentionViewDelegate;
        ozm0Var.a.Cg();
        ozm0Var.c = null;
        ozm0Var.f = false;
        ozm0Var.e = null;
        ozm0Var.b = null;
        i4p0 i4p0Var = (i4p0) getScootersRouteOverlay();
        ((gh00) ((ah00) i4p0Var.b)).u(i4p0Var.w);
        i4p0Var.c.Cg();
        Iterator it = i4p0Var.x.values().iterator();
        while (it.hasNext()) {
            ((ru.yandex.taxi.map.c) ((j741) it.next())).a();
        }
        getViewTreeObserver().removeOnDrawListener(this.drawListener);
        this.scootersCardV2Presenter.Cg();
        tje.B(getContext()).removeTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        getBinding().b.removeAllViews();
        this.isDisabled = false;
        cleanAndSetNullTooltipContainer();
        this.alternativeOfferPreviewView.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return this.isDisabled ? isTouchInsideCardContent(event) : super.onInterceptTouchEvent(event);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (this.isDisabled) {
            return isTouchInsideCardContent(event);
        }
        if (isTouchInsideCardContent(event)) {
            return super.onTouchEvent(event);
        }
        if (isExpanded() && !this.touchExplorationEnabled) {
            anchor();
        }
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "scooters";
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        this.onSoftBackPressedListener = new ScootersCardV2ModalView$setOnBackPressedListener$1(0, onBackPressedListener, Runnable.class, "run", "run()V", 0);
        ajl0 ajl0Var = new ajl0(13, this, onBackPressedListener);
        super.setOnBackPressedListener(ajl0Var);
        this.onHwBackPressedListener = new ScootersCardV2ModalView$setOnBackPressedListener$2(0, ajl0Var, Runnable.class, "run", "run()V", 0);
    }
}
