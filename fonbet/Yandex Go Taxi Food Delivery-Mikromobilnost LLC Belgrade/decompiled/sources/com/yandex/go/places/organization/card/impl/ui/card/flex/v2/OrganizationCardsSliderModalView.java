package com.yandex.go.places.organization.card.impl.ui.card.flex.v2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.flex.common.api.actions.CloseAction;
import com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$RevealingState;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardPageView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardsSliderModalView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.bottom_panel.OrganizationCardBottomPanelView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bm50;
import defpackage.c2x0;
import defpackage.c9c0;
import defpackage.cma1;
import defpackage.d230;
import defpackage.dac0;
import defpackage.e9c0;
import defpackage.ef80;
import defpackage.exu0;
import defpackage.ez20;
import defpackage.fe80;
import defpackage.fug0;
import defpackage.g470;
import defpackage.gh80;
import defpackage.goa0;
import defpackage.gus;
import defpackage.ht10;
import defpackage.i3y;
import defpackage.ih80;
import defpackage.ii8;
import defpackage.j73;
import defpackage.jh80;
import defpackage.jsj;
import defpackage.kh80;
import defpackage.kr;
import defpackage.l770;
import defpackage.lh80;
import defpackage.mqg0;
import defpackage.mth;
import defpackage.n3w;
import defpackage.ne80;
import defpackage.nh80;
import defpackage.nu;
import defpackage.ny61;
import defpackage.o8c0;
import defpackage.oep0;
import defpackage.op70;
import defpackage.pav;
import defpackage.q6h0;
import defpackage.qd00;
import defpackage.qra0;
import defpackage.rg80;
import defpackage.rh80;
import defpackage.rkr;
import defpackage.ry20;
import defpackage.sls;
import defpackage.sy20;
import defpackage.ti80;
import defpackage.tje;
import defpackage.tls;
import defpackage.ty20;
import defpackage.u131;
import defpackage.ub60;
import defpackage.uh60;
import defpackage.v4r0;
import defpackage.vh80;
import defpackage.vuh0;
import defpackage.xg80;
import defpackage.xr00;
import defpackage.xsj;
import defpackage.xtg0;
import defpackage.xw31;
import defpackage.y6i0;
import defpackage.y7c0;
import defpackage.yac0;
import defpackage.yg80;
import defpackage.yh80;
import defpackage.ze80;
import defpackage.zf80;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.builders.SetBuilder;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u000e*\u0002§\u0001\b\u0007\u0018\u0000 ±\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0004²\u0001³\u0001BQ\b\u0007\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010'\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020,H\u0014¢\u0006\u0004\b/\u0010.J\u0017\u00101\u001a\u00020,2\u0006\u00100\u001a\u00020,H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0014¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020%H\u0014¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020,H\u0014¢\u0006\u0004\b8\u0010.J\u001f\u0010<\u001a\u00020%2\u0006\u00109\u001a\u00020!2\u0006\u0010;\u001a\u00020:H\u0014¢\u0006\u0004\b<\u0010=J\u001d\u0010@\u001a\u00020%2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020!0>H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u0002032\u0006\u0010C\u001a\u00020BH\u0017¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020%2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020%H\u0014¢\u0006\u0004\bJ\u00107J\u000f\u0010K\u001a\u00020%H\u0014¢\u0006\u0004\bK\u00107J\u0017\u0010N\u001a\u00020%2\u0006\u0010M\u001a\u00020LH\u0014¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020%H\u0014¢\u0006\u0004\bP\u00107J\u0017\u0010R\u001a\u00020%2\u0006\u0010Q\u001a\u000203H\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020%2\u0006\u0010T\u001a\u00020,H\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010Y\u001a\u0002032\u0006\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020%2\u0006\u00100\u001a\u00020,H\u0014¢\u0006\u0004\b[\u0010VJ\u001f\u0010\\\u001a\u00020%2\u0006\u00109\u001a\u00020!2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b\\\u0010=J\u001f\u0010_\u001a\u00020%2\u0006\u0010]\u001a\u00020,2\u0006\u0010^\u001a\u00020:H\u0002¢\u0006\u0004\b_\u0010`J9\u0010f\u001a\u00020%2\u0006\u0010a\u001a\u00020,2\u0006\u0010b\u001a\u00020,2\u0006\u0010c\u001a\u00020:2\u0006\u0010d\u001a\u00020,2\b\b\u0002\u0010e\u001a\u000203H\u0002¢\u0006\u0004\bf\u0010gJ\u0017\u0010h\u001a\u00020%2\u0006\u0010a\u001a\u00020,H\u0002¢\u0006\u0004\bh\u0010VJ'\u0010i\u001a\u00020%2\u0006\u0010b\u001a\u00020,2\u0006\u0010c\u001a\u00020:2\u0006\u0010d\u001a\u00020,H\u0002¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020%H\u0002¢\u0006\u0004\bk\u00107J\u0017\u0010m\u001a\u00020%2\u0006\u0010l\u001a\u000203H\u0002¢\u0006\u0004\bm\u0010SJ\u000f\u0010n\u001a\u00020%H\u0002¢\u0006\u0004\bn\u00107J\u0019\u0010o\u001a\u00020%2\b\b\u0002\u0010e\u001a\u000203H\u0002¢\u0006\u0004\bo\u0010SJ-\u0010s\u001a\u00020%2\b\b\u0002\u0010e\u001a\u0002032\u0012\u0010r\u001a\u000e\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020%0pH\u0002¢\u0006\u0004\bs\u0010tJ\u0011\u0010u\u001a\u0004\u0018\u00010qH\u0002¢\u0006\u0004\bu\u0010vJ\u0019\u0010x\u001a\u0004\u0018\u00010!2\u0006\u0010w\u001a\u00020!H\u0002¢\u0006\u0004\bx\u0010yJ\u000f\u0010z\u001a\u00020%H\u0002¢\u0006\u0004\bz\u00107J\u0017\u0010|\u001a\u00020%2\u0006\u0010{\u001a\u00020qH\u0002¢\u0006\u0004\b|\u0010}J\u0017\u0010~\u001a\u00020%2\u0006\u0010{\u001a\u00020qH\u0002¢\u0006\u0004\b~\u0010}J\u000f\u0010\u007f\u001a\u000203H\u0002¢\u0006\u0004\b\u007f\u00105J\u001c\u0010\u0081\u0001\u001a\u00020,2\t\b\u0001\u0010\u0080\u0001\u001a\u00020,H\u0002¢\u0006\u0005\b\u0081\u0001\u00102R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0082\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0083\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0084\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u0085\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u0086\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R \u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0090\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0017\u0010\u0092\u0001\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0017\u0010\u0094\u0001\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0093\u0001R\u0017\u0010\u0095\u0001\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0093\u0001R\u0017\u0010\u0096\u0001\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0093\u0001R\u0019\u0010\u0097\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0093\u0001R\u0019\u0010\u0098\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0093\u0001R\u0019\u0010\u0099\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0019\u0010\u009b\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0091\u0001R!\u0010\u009c\u0001\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001f\u0010¡\u0001\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010.R!\u0010¦\u0001\u001a\u00030¢\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b£\u0001\u0010\u009f\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010¨\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0016\u0010ª\u0001\u001a\u0002038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u00105R\u0016\u0010¬\u0001\u001a\u00020,8TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u0010.R\u0016\u0010®\u0001\u001a\u00020,8TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010.R\u0016\u0010°\u0001\u001a\u00020,8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010.¨\u0006´\u0001"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/OrganizationCardsSliderModalView;", "Lcom/yandex/go/places/base/ui/modals/map/BasePlacesMapAwareModalView;", "Llh80;", "Lnh80;", "Lp3v;", "Lrkr;", "Landroid/content/Context;", "context", "Lc2x0;", "systemBarsCoordinator", "Lzf80;", ConfigConstants.CONFIG, "Lze80;", "navigator", "Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/g;", "sliderPresenter", "Lyac0;", "mapConfig", "Lpav;", "imageLoader", "Lexu0;", "styleDelegate", "<init>", "(Landroid/content/Context;Lc2x0;Lzf80;Lze80;Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/g;Lyac0;Lpav;Lexu0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Llh80;", "", "screenName", "()Ljava/lang/String;", "Landroid/view/View;", "getCardContainer", "()Landroid/view/View;", "Lkotlin/Function0;", "Lzy11;", "listener", "setAppearAnimationCompleteListener", "(Lsls;)V", "Ld230;", "insetsType", "()Ld230;", "", "getTopPadding", "()I", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, ClidProvider.STATE, "getBottomSheetBackgroundColor", "(I)I", "", "canDragToExpandFromAnchored", "()Z", "onSlideOut", "()V", "getMaxAnchoredHeight", "bottomSheet", "", "slideOffset", "onBottomSheetSlide", "(Landroid/view/View;F)V", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "behavior", "configureBottomSheetBehavior", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "onDetachedFromWindow", "Ljava/lang/Runnable;", "onAnimationEnd", "dismissInternal", "(Ljava/lang/Runnable;)V", "dismissInternalWithoutAnimation", "isBackPressedEnabled", "changeBackPressedState", "(Z)V", "newState", "onBottomSheetStateChanged", "(I)V", "Lkr;", "action", "handleAction", "(Lkr;)Z", "onInitialBehaviorStateSet", "handleCardSlide", "fullHeight", "fraction", "applyInterpolatedVisualState", "(IF)V", "marginHorizontal", "height", "bottomRadius", "bottomPanelPadding", "onlyCurrentCard", "updateCurrentState", "(IIFIZ)V", "updateMarginsForAllCards", "updateCenterCardAnimation", "(IFI)V", "calculateViewPagerHeight", "isExpanded", "updateExpandedState", "applyExpandedVisualState", "applyCollapsedVisualState", "Lkotlin/Function1;", "Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/OrganizationCardPageView;", "applyState", "applyStateToVisibleCards", "(ZLtls;)V", "getCurrentVisiblePageView", "()Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/OrganizationCardPageView;", "view", "findScrollableView", "(Landroid/view/View;)Landroid/view/View;", "updateNestedScrollView", "pageView", "showBottomPanelLoadingShimmer", "(Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/OrganizationCardPageView;)V", "applyBottomPanelPadding", "shouldUseNativeShimmer", "resId", "getDimen", "Lzf80;", "Lze80;", "Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/g;", "Lyac0;", "Lpav;", "Lexu0;", "Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/a;", "adapter", "Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/a;", "Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "mapScreenId", "Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "getMapScreenId", "()Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "isCardExpanded", "Z", "cardMarginHorizontal", CA20Status.STATUS_USER_I, "cardCornerRadius", "viewPagerBottomPadding", "peekOffset", "currentMarginHorizontal", "currentHeight", "currentBottomRadius", "F", "currentBottomPanelUltimaMode", "backPressedHandler", "Lsls;", "transparentColor$delegate", "Li3y;", "getTransparentColor", "transparentColor", "Lqra0;", "peekTransformer$delegate", "getPeekTransformer", "()Lqra0;", "peekTransformer", "kh80", "pageChangeCallback", "Lkh80;", "isMapEnabled", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "getExpandedTopScrimCornerRadius", "expandedTopScrimCornerRadius", "getCollapsedClippedHeight", "collapsedClippedHeight", "Companion", "ih80", "gh80", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationCardsSliderModalView extends BasePlacesMapAwareModalView<lh80, nh80> implements rkr {
    public static final int $stable = 8;
    private static final float ANCHORED_HEIGHT_AS_SCREEN_WIDTH_PERCENT = 0.91f;
    public static final gh80 Companion = new gh80();
    private static final String SCREEN_NAME = "OrganizationCardsSliderModalView";
    private final a adapter;
    private sls backPressedHandler;
    private final int cardCornerRadius;
    private final int cardMarginHorizontal;
    private final zf80 config;
    private boolean currentBottomPanelUltimaMode;
    private float currentBottomRadius;
    private int currentHeight;
    private int currentMarginHorizontal;
    private final pav imageLoader;
    private boolean isCardExpanded;
    private final yac0 mapConfig;
    private final PlacesMapConfig$PlacesMapScreenName mapScreenId;
    private final ze80 navigator;
    private final kh80 pageChangeCallback;
    private final int peekOffset;

    /* renamed from: peekTransformer$delegate, reason: from kotlin metadata */
    private final i3y peekTransformer;
    private final g sliderPresenter;
    private final exu0 styleDelegate;

    /* renamed from: transparentColor$delegate, reason: from kotlin metadata */
    private final i3y transparentColor;
    private final int viewPagerBottomPadding;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrganizationCardsSliderModalView(Context context, c2x0 c2x0Var, zf80 zf80Var, ze80 ze80Var, g gVar, yac0 yac0Var, pav pavVar, exu0 exu0Var) {
        super(context, new ez20(r8, r9, new ty20(r0 != null ? r0.floatValue() : 1.0f), zf80Var.h, true, new xr00(!zf80Var.e, !zf80Var.c, !zf80Var.d)), yac0Var, c2x0Var, gVar);
        sy20 sy20Var = new sy20(ANCHORED_HEIGHT_AS_SCREEN_WIDTH_PERCENT);
        Float f = zf80Var.i;
        ry20 ry20Var = f != null ? new ry20(f.floatValue()) : null;
        Float f2 = zf80Var.j;
        this.config = zf80Var;
        this.navigator = ze80Var;
        this.sliderPresenter = gVar;
        this.mapConfig = yac0Var;
        this.imageLoader = pavVar;
        this.styleDelegate = exu0Var;
        this.mapScreenId = PlacesMapConfig$PlacesMapScreenName.PLACES_ORGANIZATION_CARD;
        this.cardMarginHorizontal = getDimen(fug0.places_card_horizontal_margin);
        this.cardCornerRadius = getDimen(fug0.places_card_bottom_corners_radius);
        this.viewPagerBottomPadding = getDimen(fug0.places_card_view_pager_bottom_padding);
        this.peekOffset = getDimen(fug0.places_card_peek_visible);
        qd00 qd00Var = new qd00(context, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.transparentColor = kotlin.a.b(lazyThreadSafetyMode, qd00Var);
        this.peekTransformer = kotlin.a.b(lazyThreadSafetyMode, new uh60(29, this));
        this.pageChangeCallback = new kh80(this);
        a aVar = new a(gVar, new bm50(13, this, context), new ub60(22, this), getLifecycle());
        this.adapter = aVar;
        ViewPager2 viewPager2 = ((lh80) getBinding()).b;
        viewPager2.setAdapter(aVar);
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setPageTransformer(getPeekTransformer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final rg80 _init_$lambda$1(OrganizationCardsSliderModalView organizationCardsSliderModalView, Context context) {
        g gVar = organizationCardsSliderModalView.sliderPresenter;
        gVar.getClass();
        jsj jsjVar = new jsj(context);
        goa0 goa0Var = new goa0(gVar.K);
        rg80 rg80Var = new rg80(jsjVar, goa0Var, (o8c0) gVar.k0.getValue(), new rh80(gVar, 0));
        fe80 fe80Var = new fe80(new b(gVar, rg80Var));
        fe80 fe80Var2 = new fe80(gVar.M, new c(gVar, rg80Var));
        com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_catalog.a aVar = new com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_catalog.a((g470) ((n3w) gVar.N.a.a).a, jsjVar, gVar, new ht10(rg80Var, gVar, 0 == true ? 1 : 0, 28));
        yh80 yh80Var = gVar.L;
        y7c0 y7c0Var = gVar.D;
        xsj xsjVar = new xsj(gVar, 3);
        vh80 vh80Var = new vh80(gVar, rg80Var);
        int i = 1;
        Set f0 = j73.f0(new e9c0[]{fe80Var, fe80Var2});
        Set f02 = j73.f0(new nu[]{gVar.F, aVar, gVar.P, new com.yandex.go.places.organization.card.impl.ui.card.flex.actions.change_modal_state.a(new rh80(gVar, i))});
        dac0 dac0Var = gVar.J;
        com.yandex.div.core.expression.variables.a aVar2 = new com.yandex.div.core.expression.variables.a(dac0Var.d);
        String a = gVar.T.a().a();
        l770 l770Var = yh80Var.b;
        ef80 ef80Var = new ef80(i, dac0Var);
        gus gusVar = l770Var.a;
        com.yandex.go.places.common.flex.actions.web.a aVar3 = new com.yandex.go.places.common.flex.actions.web.a((oep0) gusVar.a.get(), gusVar.b, ef80Var);
        SetBuilder setBuilder = new SetBuilder();
        setBuilder.addAll(v4r0.h(yh80Var.a, f02));
        setBuilder.add(aVar3);
        SetBuilder b = setBuilder.b();
        yh80Var.c.a.getClass();
        rg80Var.a = dac0.a(dac0Var, y7c0Var, goa0Var, jsjVar, b, xsjVar, vh80Var, new yg80(gVar), f0, a, aVar2, HProv.ALG_TYPE_DH);
        fe80Var.f = rg80Var;
        return rg80Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$2(OrganizationCardsSliderModalView organizationCardsSliderModalView, OrganizationCardPageView organizationCardPageView) {
        Integer valueOf = Integer.valueOf(organizationCardsSliderModalView.currentMarginHorizontal);
        int i = organizationCardsSliderModalView.currentHeight;
        if (i <= 0) {
            i = -1;
        }
        OrganizationCardPageView.updateCardState$default(organizationCardPageView, valueOf, null, Integer.valueOf(i), Float.valueOf(organizationCardsSliderModalView.currentBottomRadius), null, 18, null);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ lh80 access$getBinding(OrganizationCardsSliderModalView organizationCardsSliderModalView) {
        return (lh80) organizationCardsSliderModalView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyBottomPanelPadding(OrganizationCardPageView pageView) {
        pageView.setPanelBottomPadding(gh80.a(Companion, getBottomSheetBehavior()) ? getCurrentInsets().g : 0);
    }

    private final void applyCollapsedVisualState(boolean onlyCurrentCard) {
        updateCurrentState(this.cardMarginHorizontal, getMaxAnchoredHeight() - this.viewPagerBottomPadding, this.cardCornerRadius, 0, onlyCurrentCard);
    }

    public static /* synthetic */ void applyCollapsedVisualState$default(OrganizationCardsSliderModalView organizationCardsSliderModalView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        organizationCardsSliderModalView.applyCollapsedVisualState(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyExpandedVisualState() {
        updateCurrentState(0, 0, 0.0f, getCurrentInsets().g, false);
    }

    private final void applyInterpolatedVisualState(int fullHeight, float fraction) {
        float f = 1.0f - fraction;
        int i = (int) (this.cardMarginHorizontal * f);
        float f2 = this.cardCornerRadius * f;
        getPeekTransformer().a((int) (this.peekOffset * f));
        updateMarginsForAllCards(i);
        updateCenterCardAnimation((int) (((fullHeight - getCollapsedClippedHeight()) * fraction) + getCollapsedClippedHeight()), f2, (int) (getCurrentInsets().g * fraction));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void applyStateToVisibleCards(boolean onlyCurrentCard, tls applyState) {
        OrganizationCardPageView organizationCardPageView;
        if (onlyCurrentCard) {
            OrganizationCardPageView currentVisiblePageView = getCurrentVisiblePageView();
            if (currentVisiblePageView != null) {
                applyState.invoke(currentVisiblePageView);
                return;
            }
            return;
        }
        View childAt = ((lh80) getBinding()).b.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            x0 childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
            xg80 xg80Var = childViewHolder instanceof xg80 ? (xg80) childViewHolder : null;
            if (xg80Var != null && (organizationCardPageView = xg80Var.O) != null) {
                applyState.invoke(organizationCardPageView);
            }
        }
    }

    public static /* synthetic */ void applyStateToVisibleCards$default(OrganizationCardsSliderModalView organizationCardsSliderModalView, boolean z, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        organizationCardsSliderModalView.applyStateToVisibleCards(z, tlsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 applyTheme$lambda$0(ThemeType themeType, OrganizationCardPageView organizationCardPageView) {
        organizationCardPageView.applyTheme(themeType);
        return zy11.a;
    }

    private final void calculateViewPagerHeight() {
        OneShotPreDrawListener.add(this, new jh80(this, 0));
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

    private final int getCollapsedClippedHeight() {
        ez20 slideableMode = getSlideableMode();
        return (slideableMode != null ? slideableMode.a() : 0) - this.viewPagerBottomPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final OrganizationCardPageView getCurrentVisiblePageView() {
        View childAt = ((lh80) getBinding()).b.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            int currentItem = ((lh80) getBinding()).b.getCurrentItem();
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt2 = recyclerView.getChildAt(i);
                x0 childViewHolder = recyclerView.getChildViewHolder(childAt2);
                xg80 xg80Var = childViewHolder instanceof xg80 ? (xg80) childViewHolder : null;
                if (xg80Var != null && recyclerView.getChildAdapterPosition(childAt2) == currentItem) {
                    return xg80Var.O;
                }
            }
        }
        return null;
    }

    private final int getDimen(int resId) {
        return getContext().getResources().getDimensionPixelSize(resId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qra0 getPeekTransformer() {
        return (qra0) this.peekTransformer.getValue();
    }

    private final int getTransparentColor() {
        return ((Number) this.transparentColor.getValue()).intValue();
    }

    private final void handleCardSlide(View bottomSheet, float slideOffset) {
        int height = bottomSheet.getHeight();
        if (height <= 0) {
            return;
        }
        float x = getBottomSheetBehavior().x();
        if (x >= 1.0f) {
            applyExpandedVisualState();
            return;
        }
        if (slideOffset <= x) {
            getPeekTransformer().a(this.peekOffset);
            applyCollapsedVisualState(true);
            return;
        }
        float c = y6i0.c((slideOffset - x) / (1.0f - x), 0.0f, 1.0f);
        if (c >= 0.5f && !this.isCardExpanded) {
            updateExpandedState(true);
        } else if (c < 0.5f && this.isCardExpanded) {
            updateExpandedState(false);
        }
        applyInterpolatedVisualState(height, c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(OrganizationCardsSliderModalView organizationCardsSliderModalView) {
        sls slsVar = organizationCardsSliderModalView.backPressedHandler;
        if (slsVar != null) {
            slsVar.invoke();
            return;
        }
        g gVar = organizationCardsSliderModalView.sliderPresenter;
        com.yandex.go.places.analytics.organization.card.a aVar = gVar.H;
        ne80 ne80Var = gVar.a0;
        aVar.m(ne80Var.a, ne80Var.b);
        ((nh80) gVar.Dg()).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final qra0 peekTransformer_delegate$lambda$0(OrganizationCardsSliderModalView organizationCardsSliderModalView) {
        return new qra0(((lh80) organizationCardsSliderModalView.getBinding()).b, organizationCardsSliderModalView.peekOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldUseNativeShimmer() {
        return (this.config.a || gh80.a(Companion, getBottomSheetBehavior()) || this.config.h == PlacesMapConfig$RevealingState.EXPANDED) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showBottomPanelLoadingShimmer(OrganizationCardPageView pageView) {
        OrganizationCardBottomPanelView organizationCardBottomPanelView = new OrganizationCardBottomPanelView(getContext(), this.imageLoader, this.styleDelegate, new OrganizationCardsSliderModalView$showBottomPanelLoadingShimmer$1(1, this.sliderPresenter, g.class, "handleAction", "handleAction(Lcom/yandex/go/places/models/domain/entities/Action;)V", 0), new OrganizationCardsSliderModalView$showBottomPanelLoadingShimmer$2(1, this.sliderPresenter, g.class, "handlePromoDetailsAction", "handlePromoDetailsAction(Lflex/core/model/Action;)V", 0));
        pageView.setBottomPanel(organizationCardBottomPanelView);
        organizationCardBottomPanelView.setUltimaMode(this.currentBottomPanelUltimaMode);
        organizationCardBottomPanelView.setShimmering(true);
        applyBottomPanelPadding(pageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int transparentColor_delegate$lambda$0(Context context) {
        return context.getColor(mqg0.transparent);
    }

    private final void updateCenterCardAnimation(int height, float bottomRadius, int bottomPanelPadding) {
        this.currentHeight = height;
        this.currentBottomRadius = bottomRadius;
        OrganizationCardPageView currentVisiblePageView = getCurrentVisiblePageView();
        if (currentVisiblePageView != null) {
            if (height == 0) {
                height = -1;
            }
            OrganizationCardPageView.updateCardState$default(currentVisiblePageView, null, null, Integer.valueOf(height), Float.valueOf(bottomRadius), Integer.valueOf(bottomPanelPadding), 3, null);
        }
    }

    private final void updateCurrentState(final int marginHorizontal, final int height, final float bottomRadius, final int bottomPanelPadding, boolean onlyCurrentCard) {
        this.currentMarginHorizontal = marginHorizontal;
        this.currentHeight = height;
        this.currentBottomRadius = bottomRadius;
        applyStateToVisibleCards(onlyCurrentCard, new tls() { // from class: fh80
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 updateCurrentState$lambda$0;
                updateCurrentState$lambda$0 = OrganizationCardsSliderModalView.updateCurrentState$lambda$0(marginHorizontal, height, bottomRadius, bottomPanelPadding, (OrganizationCardPageView) obj);
                return updateCurrentState$lambda$0;
            }
        });
    }

    public static /* synthetic */ void updateCurrentState$default(OrganizationCardsSliderModalView organizationCardsSliderModalView, int i, int i2, float f, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        organizationCardsSliderModalView.updateCurrentState(i, i2, f, i3, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updateCurrentState$lambda$0(int i, int i2, float f, int i3, OrganizationCardPageView organizationCardPageView) {
        Integer valueOf = Integer.valueOf(i);
        if (i2 == 0) {
            i2 = -1;
        }
        OrganizationCardPageView.updateCardState$default(organizationCardPageView, valueOf, null, Integer.valueOf(i2), Float.valueOf(f), Integer.valueOf(i3), 2, null);
        return zy11.a;
    }

    private final void updateExpandedState(boolean isExpanded) {
        this.isCardExpanded = isExpanded;
        this.sliderPresenter.J.d.i(new u131("discovery.is_modal_view_expanded", isExpanded));
    }

    private final void updateMarginsForAllCards(int marginHorizontal) {
        this.currentMarginHorizontal = marginHorizontal;
        applyStateToVisibleCards(false, new ii8(marginHorizontal, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updateMarginsForAllCards$lambda$0(int i, OrganizationCardPageView organizationCardPageView) {
        organizationCardPageView.setCardMargins(i, 0);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNestedScrollView() {
        xg80 xg80Var;
        rg80 rg80Var = null;
        getBottomSheetBehavior().M = null;
        a aVar = this.adapter;
        ti80 ti80Var = aVar.A;
        if (ti80Var != null && (xg80Var = (xg80) aVar.z.get(ti80Var)) != null) {
            rg80Var = xg80Var.P;
        }
        if (rg80Var != null) {
            boolean a = gh80.a(Companion, getBottomSheetBehavior());
            c9c0 c9c0Var = rg80Var.a;
            if (c9c0Var != null) {
                c9c0Var.b0(a);
            }
        }
        OrganizationCardPageView currentVisiblePageView = getCurrentVisiblePageView();
        if (currentVisiblePageView != null && gh80.a(Companion, getBottomSheetBehavior())) {
            View scrollableContainer = currentVisiblePageView.getScrollableContainer();
            View findScrollableView = findScrollableView(scrollableContainer);
            if (findScrollableView != null) {
                scrollableContainer = findScrollableView;
            }
            getBottomSheetBehavior().L(scrollableContainer);
            scrollableContainer.setNestedScrollingEnabled(true);
        }
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        applyStateToVisibleCards$default(this, false, new ub60(21, themeType), 1, null);
        getBottomSheet().setBackgroundColor(getTransparentColor());
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public lh80 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(vuh0.organization_cards_slider_modal_view, parent, false);
        int i = q6h0.cards_view_pager;
        ViewPager2 viewPager2 = (ViewPager2) cma1.O(i, inflate);
        if (viewPager2 != null) {
            return new lh80((GoFrameLayout) inflate, viewPager2);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    public void changeBackPressedState(boolean isBackPressedEnabled) {
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public void configureBottomSheetBehavior(AnchorBottomSheetBehavior<View> behavior) {
        if (this.config.e) {
            behavior.C = false;
            behavior.R(false);
            behavior.a0 = true;
            behavior.W = false;
            behavior.Z = false;
            behavior.V = true;
            behavior.c0 = true;
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void dismissInternal(Runnable onAnimationEnd) {
        this.adapter.B = true;
        super.dismissInternal(onAnimationEnd);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void dismissInternalWithoutAnimation() {
        this.adapter.B = true;
        super.dismissInternalWithoutAnimation();
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public int getBottomSheetBackgroundColor(int state) {
        return getTransparentColor();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public View getCardContainer() {
        return ((lh80) getBinding()).b;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return 0;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public int getExpandedTopScrimCornerRadius() {
        return getDimen(xtg0.discovery_base_container_corner_radius);
    }

    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView, defpackage.p3v
    public PlacesMapConfig$PlacesMapScreenName getMapScreenId() {
        return this.mapScreenId;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView
    public int getMaxAnchoredHeight() {
        ez20 slideableMode = getSlideableMode();
        if (slideableMode != null) {
            return slideableMode.a();
        }
        return 0;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return 0;
    }

    @Override // defpackage.rkr
    public boolean handleAction(kr action) {
        if (!(action instanceof CloseAction)) {
            return false;
        }
        onBackPressed();
        return true;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView
    public d230 insetsType() {
        return new d230(0);
    }

    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView, defpackage.p3v
    /* renamed from: isMapEnabled */
    public boolean getIsMapEnabled() {
        return (this.config.k || this.mapConfig.a(getMapScreenId()) != null) && !this.config.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView, com.yandex.go.places.base.ui.modals.lifecycle.BasePlacesLifecycleAwareModalView, com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ti80 ti80Var;
        super.onAttachedToWindow();
        this.adapter.B = false;
        attachBackButton(new OrganizationCardsSliderModalView$onAttachedToWindow$1(0, this.sliderPresenter, g.class, "onBackButtonClicked", "onBackButtonClicked()V", 0));
        setDismissOnBackPressed(false);
        setOnBackPressedListener(new op70(11, this));
        if (!this.config.a) {
            setArrowState(ArrowsView.State.PLAIN);
        }
        g gVar = this.sliderPresenter;
        gVar.Bg(new ih80(this));
        gVar.Gg();
        if (gVar.E) {
            ne80 ne80Var = (ne80) kotlin.collections.a.R(gVar.Z);
            gVar.W = (ne80Var == null || (ti80Var = ne80Var.a) == null) ? null : g.Mg(ti80Var);
            tje.N(gVar.Jg(), null, null, new OrganizationCardsSliderPresenter$subscribeToBboxUpdatesIfNeeded$$inlined$safeCollectIn$1(gVar.K.b.c, null, gVar), 3);
        }
        tje.N(gVar.Jg(), null, null, new OrganizationCardsSliderPresenter$subscribeToParamsUpdates$$inlined$safeCollectIn$1(new mth(gVar.G.b, 4), null, gVar), 3);
        tje.N(gVar.Jg(), null, null, new OrganizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(new f(((ru.yandex.taxi.styling.g) gVar.R).c())), null, gVar), 3);
        gVar.Q.e = false;
        calculateViewPagerHeight();
        ((lh80) getBinding()).b.registerOnPageChangeCallback(this.pageChangeCallback);
        this.adapter.l(0);
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public void onBottomSheetSlide(View bottomSheet, float slideOffset) {
        handleCardSlide(bottomSheet, slideOffset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public void onBottomSheetStateChanged(int newState) {
        if (newState != 3) {
            if (newState == 4 || newState == 6) {
                ((lh80) getBinding()).b.setUserInputEnabled(true);
                updateNestedScrollView();
                applyCollapsedVisualState(false);
                this.sliderPresenter.Ng(false);
                return;
            }
            if (newState != 7) {
                return;
            }
        }
        ((lh80) getBinding()).b.setUserInputEnabled(false);
        updateNestedScrollView();
        applyExpandedVisualState();
        this.sliderPresenter.Ng(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.lifecycle.BasePlacesLifecycleAwareModalView, com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((lh80) getBinding()).b.unregisterOnPageChangeCallback(this.pageChangeCallback);
        a aVar = this.adapter;
        aVar.B = true;
        ArrayList arrayList = aVar.y;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rg80 rg80Var = (rg80) it.next();
            if (rg80Var.f) {
                c9c0 c9c0Var = rg80Var.a;
                if (c9c0Var != null) {
                    c9c0Var.a0(false);
                }
                c9c0 c9c0Var2 = rg80Var.a;
                if (c9c0Var2 != null) {
                    c9c0Var2.i();
                }
                rg80Var.f = false;
            }
        }
        arrayList.clear();
        aVar.z.clear();
        aVar.A = null;
        this.sliderPresenter.Cg();
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public void onInitialBehaviorStateSet(int state) {
        OneShotPreDrawListener.add(this, new jh80(this, 1));
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), ((lh80) getBinding()).b, event)) {
            return true;
        }
        if (this.config.b) {
            return false;
        }
        return super.onTouchEvent(event);
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return SCREEN_NAME;
    }

    @Override // com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView
    public void setAppearAnimationCompleteListener(sls listener) {
        setOneShotAppearAnimationCompleteListener(listener);
    }
}
