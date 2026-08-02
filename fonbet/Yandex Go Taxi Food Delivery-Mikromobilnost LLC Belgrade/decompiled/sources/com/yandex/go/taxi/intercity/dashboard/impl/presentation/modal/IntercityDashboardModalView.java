package com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.taxi.intercity.dashboard.impl.experiment.IntercityDashboardFeedbackExperiment;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardAddressSelectorContainerView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardButtonsContainerView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardCommentSelectorContainerView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardPromoBannerContainerView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardSeatsSelectorContainerView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardTariffSelectorContainerView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardTimeSelectorContainerView;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.abw;
import defpackage.bbw;
import defpackage.bfw;
import defpackage.bjw;
import defpackage.cfw;
import defpackage.cjw;
import defpackage.clw;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.d2x0;
import defpackage.d6z;
import defpackage.dfw;
import defpackage.dhv;
import defpackage.djw;
import defpackage.dlw;
import defpackage.dzg0;
import defpackage.e3n;
import defpackage.efw;
import defpackage.ejw;
import defpackage.evu0;
import defpackage.fbw;
import defpackage.ffw;
import defpackage.fjw;
import defpackage.gbw;
import defpackage.gjw;
import defpackage.gk1;
import defpackage.glw;
import defpackage.h0t;
import defpackage.haw;
import defpackage.hbp0;
import defpackage.hjw;
import defpackage.ihw;
import defpackage.ike;
import defpackage.ip11;
import defpackage.j8h0;
import defpackage.jkw;
import defpackage.jqr;
import defpackage.jtq0;
import defpackage.k7x0;
import defpackage.kkw;
import defpackage.kp50;
import defpackage.kyh0;
import defpackage.llw;
import defpackage.m950;
import defpackage.mc;
import defpackage.mp60;
import defpackage.mqg0;
import defpackage.mth;
import defpackage.nac;
import defpackage.nfv;
import defpackage.ny61;
import defpackage.o430;
import defpackage.obv;
import defpackage.pav;
import defpackage.pcw;
import defpackage.pdc;
import defpackage.pfw;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.qef;
import defpackage.qfw;
import defpackage.qiw;
import defpackage.qjw;
import defpackage.qoi0;
import defpackage.qow;
import defpackage.r9w;
import defpackage.rhw;
import defpackage.riw;
import defpackage.rjw;
import defpackage.ry40;
import defpackage.s9w;
import defpackage.scc;
import defpackage.shw;
import defpackage.sjh;
import defpackage.t9w;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tkh0;
import defpackage.tpr;
import defpackage.tug0;
import defpackage.ucw;
import defpackage.ufw;
import defpackage.uy40;
import defpackage.uyj;
import defpackage.vfw;
import defpackage.vgw;
import defpackage.vng;
import defpackage.w511;
import defpackage.xaw;
import defpackage.xcw;
import defpackage.xuv;
import defpackage.xw31;
import defpackage.xy40;
import defpackage.yew;
import defpackage.zh0;
import defpackage.zmh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000ê\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ¦\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006§\u0001 \u0001¨\u0001B\u0085\u0001\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020*H\u0014¢\u0006\u0004\b-\u0010,J\u000f\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0014¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u0002012\u0006\u00105\u001a\u000204H\u0017¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020*2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020*H\u0015¢\u0006\u0004\b<\u0010,J\u0017\u0010?\u001a\u00020*2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020*H\u0002¢\u0006\u0004\bA\u0010,J\u000f\u0010B\u001a\u00020*H\u0002¢\u0006\u0004\bB\u0010,J\u000f\u0010C\u001a\u00020*H\u0002¢\u0006\u0004\bC\u0010,J\u000f\u0010D\u001a\u00020*H\u0002¢\u0006\u0004\bD\u0010,J\u000f\u0010E\u001a\u00020*H\u0002¢\u0006\u0004\bE\u0010,J\u0017\u0010H\u001a\u00020*2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020*2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020*2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJ'\u0010Y\u001a\u00020*2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020S0R2\b\u0010V\u001a\u0004\u0018\u00010UH\u0002¢\u0006\u0004\bW\u0010XJ\u001d\u0010Z\u001a\u00020*2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020S0RH\u0002¢\u0006\u0004\bZ\u0010[J'\u0010]\u001a\u00020*2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020S0R2\b\u0010V\u001a\u0004\u0018\u00010UH\u0002¢\u0006\u0004\b\\\u0010XJ!\u0010b\u001a\u00020*2\u0006\u0010_\u001a\u00020^2\b\u0010V\u001a\u0004\u0018\u00010UH\u0002¢\u0006\u0004\b`\u0010aJ\u000f\u0010c\u001a\u00020*H\u0002¢\u0006\u0004\bc\u0010,J\u0017\u0010f\u001a\u00020e2\u0006\u0010d\u001a\u00020SH\u0002¢\u0006\u0004\bf\u0010gR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010hR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010iR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010jR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010kR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010lR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010mR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010nR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010K\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bK\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008b\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0017\u0010\u0096\u0001\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u0098\u0001\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001c\u0010¡\u0001\u001a\u00070 \u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010¤\u0001\u001a\u00030£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001¨\u0006©\u0001"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/IntercityDashboardModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lffw;", "Lllw;", "Landroid/content/Context;", "context", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;", "dashboardPresenter", "Lufw;", "statusBarController", "Lpav;", "imageLoader", "Lip11;", "typefaceDelegate", "Lru/yandex/taxi/design/utils/b;", "bgRepository", "Lpwy0;", "themeSwitcherProvider", "Lqjw;", "sectionsDiffDispatcher", "Lr9w;", "dashboardAddressSelectorContainerViewFactory", "Lclw;", "dashboardTimeSelectorContainerViewFactory", "Labw;", "dashboardButtonsContainerViewFactory", "Ljkw;", "dashboardTariffSelectorContainerViewFactory", "Lrhw;", "dashboardPromoBannerContainerViewFactory", "Lqiw;", "dashboardSeatsSelectorContainerViewFactory", "Lfbw;", "dashboardCommentSelectorContainerViewFactory", "<init>", "(Landroid/content/Context;Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;Lufw;Lpav;Lip11;Lru/yandex/taxi/design/utils/b;Lpwy0;Lqjw;Lr9w;Lclw;Labw;Ljkw;Lrhw;Lqiw;Lfbw;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lffw;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "", "isApplyShadow", "()Z", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onBackPressed", "Landroid/graphics/drawable/Drawable;", "shadowDrawable", "renderButtonsContainerShadow", "(Landroid/graphics/drawable/Drawable;)V", "setupHeader", "close", "renderLoadingState", "disableLoadingState", "renderErrorState", "Lglw;", "content", "renderContent", "(Lglw;)V", "Lyew;", "header", "renderHeader", "(Lyew;)V", "", "iconTag", "renderIcon", "(Ljava/lang/String;)V", "Lmp60;", "Lhjw;", "sections", "Lckw;", "selectedTariffId", "updateAndRenderSections-sdzKFpM", "(Lmp60;Ljava/lang/String;)V", "updateAndRenderSections", "updateSectionPositionsByDiff", "(Lmp60;)V", "renderSections-sdzKFpM", "renderSections", "Lxaw;", "buttons", "renderButtons-sdzKFpM", "(Lxaw;Ljava/lang/String;)V", "renderButtons", "updateScrollIndicator", "section", "Landroid/view/View;", "mapSectionsToContainerView", "(Lhjw;)Landroid/view/View;", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;", "Lufw;", "Lpav;", "Lip11;", "Lru/yandex/taxi/design/utils/b;", "Lpwy0;", "Lqjw;", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardTimeSelectorContainerView;", "dashboardTimeSelectorContainerView", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardTimeSelectorContainerView;", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardAddressSelectorContainerView;", "dashboardAddressSelectorContainerView", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardAddressSelectorContainerView;", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardButtonsContainerView;", "dashboardButtonsContainerView", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardButtonsContainerView;", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardTariffSelectorContainerView;", "dashboardTariffSelectorContainerView", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardTariffSelectorContainerView;", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardPromoBannerContainerView;", "dashboardPromoBannerContainerView", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardPromoBannerContainerView;", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardSeatsSelectorContainerView;", "dashboardSeatsSelectorContainerView", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardSeatsSelectorContainerView;", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardCommentSelectorContainerView;", "dashboardCommentSelectorContainerView", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardCommentSelectorContainerView;", "Lru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;", "contentHolder", "Lru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;", "Lru/yandex/taxi/design/ListHeaderComponent;", "Lru/yandex/taxi/design/ListHeaderComponent;", "Landroid/widget/LinearLayout;", "sectionsContainer", "Landroid/widget/LinearLayout;", "Lru/yandex/taxi/widget/PlaceholderView;", "loadingView", "Lru/yandex/taxi/widget/PlaceholderView;", "loadingPlaceholder", "Landroid/widget/FrameLayout;", "buttonsContainerHolder", "Landroid/widget/FrameLayout;", "Lcom/yandex/go/design/view/GoImageView;", "footerShadow", "Lcom/yandex/go/design/view/GoImageView;", "scrollElevationThreshold", CA20Status.STATUS_USER_I, "showLoadingContentPlaceholder", "Z", "Lhbp0;", "mainScopeDelegate", "Lhbp0;", "Landroidx/transition/TransitionSet;", "transition", "Landroidx/transition/TransitionSet;", "Lefw;", "innerSectionPositionChangedListener", "Lefw;", "Lihw;", "intercityDashboardPreviousSectionHolder", "Lihw;", "Companion", "dfw", "cfw", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardModalView extends SlideableBindingModalView<ffw> implements llw {
    private static final cfw Companion = new cfw();
    private static final int SCROLLING_DIRECTION_DOWN = 1;
    private final ru.yandex.taxi.design.utils.b bgRepository;
    private final FrameLayout buttonsContainerHolder;
    private final NestedScrollViewAdvanced contentHolder;
    private final IntercityDashboardAddressSelectorContainerView dashboardAddressSelectorContainerView;
    private final IntercityDashboardButtonsContainerView dashboardButtonsContainerView;
    private final IntercityDashboardCommentSelectorContainerView dashboardCommentSelectorContainerView;
    private final g dashboardPresenter;
    private final IntercityDashboardPromoBannerContainerView dashboardPromoBannerContainerView;
    private final IntercityDashboardSeatsSelectorContainerView dashboardSeatsSelectorContainerView;
    private final IntercityDashboardTariffSelectorContainerView dashboardTariffSelectorContainerView;
    private final IntercityDashboardTimeSelectorContainerView dashboardTimeSelectorContainerView;
    private final GoImageView footerShadow;
    private final ListHeaderComponent header;
    private final pav imageLoader;
    private final efw innerSectionPositionChangedListener;
    private final ihw intercityDashboardPreviousSectionHolder;
    private final LinearLayout loadingPlaceholder;
    private final PlaceholderView loadingView;
    private final hbp0 mainScopeDelegate;
    private final int scrollElevationThreshold;
    private final LinearLayout sectionsContainer;
    private final qjw sectionsDiffDispatcher;
    private boolean showLoadingContentPlaceholder;
    private final ufw statusBarController;
    private final pwy0 themeSwitcherProvider;
    private final TransitionSet transition;
    private final ip11 typefaceDelegate;

    public IntercityDashboardModalView(Context context, g gVar, ufw ufwVar, pav pavVar, ip11 ip11Var, ru.yandex.taxi.design.utils.b bVar, pwy0 pwy0Var, qjw qjwVar, r9w r9wVar, clw clwVar, abw abwVar, jkw jkwVar, rhw rhwVar, qiw qiwVar, fbw fbwVar) {
        super(context);
        this.dashboardPresenter = gVar;
        this.statusBarController = ufwVar;
        this.imageLoader = pavVar;
        this.typefaceDelegate = ip11Var;
        this.bgRepository = bVar;
        this.themeSwitcherProvider = pwy0Var;
        this.sectionsDiffDispatcher = qjwVar;
        this.contentHolder = getBinding().c;
        this.header = getBinding().d;
        this.sectionsContainer = getBinding().i;
        this.loadingView = getBinding().h;
        this.loadingPlaceholder = getBinding().g;
        this.buttonsContainerHolder = getBinding().f;
        this.footerShadow = getBinding().e;
        this.scrollElevationThreshold = getResources().getDimensionPixelSize(tug0.scroll_elevation_threshold);
        this.showLoadingContentPlaceholder = true;
        this.mainScopeDelegate = new hbp0(new czo0(14), "", null);
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.P(133L);
        this.transition = autoTransition;
        this.innerSectionPositionChangedListener = new efw(this);
        this.intercityDashboardPreviousSectionHolder = new ihw();
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        setupHeader();
        mc mcVar = ((dlw) clwVar).a;
        IntercityDashboardTimeSelectorContainerView intercityDashboardTimeSelectorContainerView = new IntercityDashboardTimeSelectorContainerView((Context) mcVar.a.get(), gVar, (haw) mcVar.b.get());
        this.dashboardTimeSelectorContainerView = intercityDashboardTimeSelectorContainerView;
        t9w t9wVar = ((s9w) r9wVar).a;
        this.dashboardAddressSelectorContainerView = new IntercityDashboardAddressSelectorContainerView((Context) t9wVar.a.get(), gVar, (haw) t9wVar.d.a, (pav) t9wVar.b.get(), (k7x0) t9wVar.c.get());
        this.dashboardButtonsContainerView = new IntercityDashboardButtonsContainerView((Context) ((bbw) abwVar).a.a.get(), gVar);
        h0t h0tVar = ((kkw) jkwVar).a;
        IntercityDashboardTariffSelectorContainerView intercityDashboardTariffSelectorContainerView = new IntercityDashboardTariffSelectorContainerView((Context) h0tVar.a.get(), gVar, (pav) h0tVar.b.get(), (k7x0) h0tVar.c.get());
        this.dashboardTariffSelectorContainerView = intercityDashboardTariffSelectorContainerView;
        zh0 zh0Var = ((shw) rhwVar).a;
        this.dashboardPromoBannerContainerView = new IntercityDashboardPromoBannerContainerView((Context) zh0Var.a.get(), gVar, (pav) zh0Var.b.get(), (k7x0) zh0Var.c.get(), (pdc) zh0Var.d.get());
        this.dashboardSeatsSelectorContainerView = new IntercityDashboardSeatsSelectorContainerView((Context) ((riw) qiwVar).a.a.get(), gVar);
        this.dashboardCommentSelectorContainerView = new IntercityDashboardCommentSelectorContainerView((Context) ((gbw) fbwVar).a.a.get(), gVar);
        autoTransition.r(intercityDashboardTimeSelectorContainerView);
        autoTransition.r(intercityDashboardTariffSelectorContainerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void close() {
        super.onBackPressed();
    }

    private final void disableLoadingState() {
        this.loadingPlaceholder.setVisibility(8);
        this.loadingView.setVisibility(8);
        this.loadingView.setClickable(false);
        this.loadingView.setFocusable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View mapSectionsToContainerView(hjw section) {
        if (section instanceof bjw) {
            return this.dashboardAddressSelectorContainerView;
        }
        if (section instanceof djw) {
            return this.dashboardTimeSelectorContainerView;
        }
        if (section instanceof gjw) {
            return this.dashboardTariffSelectorContainerView;
        }
        if (section instanceof ejw) {
            return this.dashboardPromoBannerContainerView;
        }
        if (section instanceof fjw) {
            return this.dashboardSeatsSelectorContainerView;
        }
        if (section instanceof cjw) {
            return this.dashboardCommentSelectorContainerView;
        }
        w511.b();
        return null;
    }

    /* renamed from: renderButtons-sdzKFpM, reason: not valid java name */
    private final void m201renderButtonssdzKFpM(xaw buttons, String selectedTariffId) {
        this.dashboardButtonsContainerView.m200rendersdzKFpM(buttons, selectedTariffId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderButtonsContainerShadow(Drawable shadowDrawable) {
        Rect rect = new Rect();
        shadowDrawable.getPadding(rect);
        xw31.E(this.footerShadow, Integer.valueOf(-rect.left), Integer.valueOf(-rect.top), Integer.valueOf(-rect.right), Integer.valueOf(-rect.bottom));
        this.footerShadow.setBackground(shadowDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderContent(glw content) {
        this.showLoadingContentPlaceholder = false;
        disableLoadingState();
        this.contentHolder.setVisibility(0);
        renderHeader(content.b);
        mp60 mp60Var = content.c;
        String str = content.a;
        m203updateAndRenderSectionssdzKFpM(mp60Var, str);
        m201renderButtonssdzKFpM(content.d, str);
        if (content.g) {
            renderLoadingState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderErrorState() {
        disableLoadingState();
        this.loadingPlaceholder.setVisibility(0);
        this.contentHolder.setVisibility(4);
        com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.e eVar = this.dashboardPresenter.x.a;
        eVar.z((m950) eVar.N.get(), new qfw(eVar));
    }

    private final void renderHeader(yew header) {
        renderIcon(header.b);
        this.header.setTitle(header.a);
    }

    private final void renderIcon(String iconTag) {
        boolean J = evu0.J(iconTag);
        ListHeaderComponent listHeaderComponent = this.header;
        if (J) {
            listHeaderComponent.getLeadImageView().setVisibility(8);
            this.header.getLeadImageView().setTag(null);
            return;
        }
        listHeaderComponent.getLeadImageView().setVisibility(0);
        nac nacVar = (nac) this.imageLoader.a(this.header.getLeadImageView());
        nacVar.g(nfv.a);
        nacVar.b(new obv(iconTag, null, 6, 0));
        this.header.getLeadImageView().setTag(iconTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderLoadingState() {
        if (this.showLoadingContentPlaceholder) {
            this.loadingPlaceholder.setVisibility(0);
        }
        this.dashboardButtonsContainerView.renderLoading();
        this.loadingView.setVisibility(0);
        this.loadingView.setClickable(true);
        this.loadingView.setFocusable(true);
    }

    /* renamed from: renderSections-sdzKFpM, reason: not valid java name */
    private final void m202renderSectionssdzKFpM(mp60 sections, String selectedTariffId) {
        TransitionManager.a(this.transition, this.sectionsContainer);
        Object[] objArr = sections.a;
        int i = sections.b;
        for (int i2 = 0; i2 < i; i2++) {
            hjw hjwVar = (hjw) objArr[i2];
            if (hjwVar instanceof bjw) {
                this.dashboardAddressSelectorContainerView.m198rendersdzKFpM((bjw) hjwVar, selectedTariffId);
            } else if (hjwVar instanceof djw) {
                this.dashboardTimeSelectorContainerView.render((djw) hjwVar);
            } else if (hjwVar instanceof gjw) {
                this.dashboardTariffSelectorContainerView.render((gjw) hjwVar);
            } else if (hjwVar instanceof ejw) {
                this.dashboardPromoBannerContainerView.render$impl((ejw) hjwVar);
            } else if (hjwVar instanceof fjw) {
                this.dashboardSeatsSelectorContainerView.render((fjw) hjwVar);
            } else {
                if (!(hjwVar instanceof cjw)) {
                    w511.b();
                    return;
                }
                this.dashboardCommentSelectorContainerView.render((cjw) hjwVar);
            }
        }
        FrameLayout frameLayout = getBinding().a;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        if (!frameLayout.isLaidOut() || frameLayout.isLayoutRequested()) {
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.IntercityDashboardModalView$renderSections-sdzKFpM$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    IntercityDashboardModalView.this.updateScrollIndicator();
                }
            });
        } else {
            updateScrollIndicator();
        }
    }

    private final void setupHeader() {
        this.header.setTrailImage(dzg0.ic_cross_filled);
        this.header.setTrailContainerClickListener(new dhv(6, this));
        this.header.setTrailContentDescription(getContext().getString(kyh0.common_close));
        this.header.setTitleTypeface(((zmh) this.typefaceDelegate).f(getContext()));
    }

    /* renamed from: updateAndRenderSections-sdzKFpM, reason: not valid java name */
    private final void m203updateAndRenderSectionssdzKFpM(mp60 sections, String selectedTariffId) {
        updateSectionPositionsByDiff(sections);
        this.intercityDashboardPreviousSectionHolder.a = sections;
        m202renderSectionssdzKFpM(sections, selectedTariffId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateScrollIndicator() {
        this.footerShadow.setVisibility(!this.contentHolder.canScrollVertically(1) ? 4 : 0);
        this.contentHolder.setOnScrollChangeListener(new gk1(2, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateScrollIndicator$lambda$0(IntercityDashboardModalView intercityDashboardModalView, View view, int i, int i2, int i3, int i4) {
        intercityDashboardModalView.header.setElevation(Math.min(i2, intercityDashboardModalView.scrollElevationThreshold));
        intercityDashboardModalView.footerShadow.setVisibility(!intercityDashboardModalView.contentHolder.canScrollVertically(1) ? 4 : 0);
    }

    private final void updateSectionPositionsByDiff(mp60 sections) {
        ry40 ry40Var;
        qjw qjwVar = this.sectionsDiffDispatcher;
        uy40 i = ((xy40) this.intercityDashboardPreviousSectionHolder.a).i();
        uy40 i2 = ((xy40) sections).i();
        xy40 xy40Var = i2.a;
        efw efwVar = this.innerSectionPositionChangedListener;
        ((rjw) qjwVar).getClass();
        int i3 = 0;
        if (i.a.d()) {
            Iterator it = i2.iterator();
            while (true) {
                ry40 ry40Var2 = (ry40) it;
                if (!ry40Var2.hasNext()) {
                    return;
                }
                Object next = ry40Var2.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw null;
                }
                efwVar.a((hjw) next, i3);
                i3 = i4;
            }
        } else if (xy40Var.d()) {
            Iterator it2 = i.iterator();
            while (true) {
                ry40 ry40Var3 = (ry40) it2;
                if (!ry40Var3.hasNext()) {
                    return;
                } else {
                    efwVar.b((hjw) ry40Var3.next());
                }
            }
        } else {
            Iterator it3 = i.iterator();
            while (true) {
                ry40 ry40Var4 = (ry40) it3;
                if (!ry40Var4.hasNext()) {
                    break;
                }
                hjw hjwVar = (hjw) ry40Var4.next();
                if (!xy40Var.d()) {
                    Iterator it4 = i2.iterator();
                    do {
                        ry40Var = (ry40) it4;
                        if (ry40Var.hasNext()) {
                        }
                    } while (!hjwVar.getClass().equals(((hjw) ry40Var.next()).getClass()));
                }
                efwVar.b(hjwVar);
            }
            Iterator it5 = i2.iterator();
            int i5 = 0;
            while (true) {
                ry40 ry40Var5 = (ry40) it5;
                if (!ry40Var5.hasNext()) {
                    return;
                }
                Object next2 = ry40Var5.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    scc.m();
                    throw null;
                }
                hjw hjwVar2 = (hjw) next2;
                Iterator it6 = i.iterator();
                int i7 = 0;
                while (true) {
                    ry40 ry40Var6 = (ry40) it6;
                    if (!ry40Var6.hasNext()) {
                        i7 = -1;
                        break;
                    } else if (((hjw) ry40Var6.next()).getClass().equals(hjwVar2.getClass())) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 == -1) {
                    efwVar.a(hjwVar2, i5);
                } else if (i7 != i5) {
                    efwVar.b((hjw) i.get(i7));
                    efwVar.a(hjwVar2, i5);
                }
                i5 = i6;
            }
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        getBottomSheet().setBackgroundResource(mqg0.transparent);
        Object tag = this.header.getLeadImageView().getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str != null) {
            renderIcon(str);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.black;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ffw bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(tkh0.intercity_dashboard_modal_view, parent, false);
        int i = j8h0.below_footer_shadow;
        View O = cma1.O(i, inflate);
        if (O != null) {
            i = j8h0.dashboard_content;
            NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) cma1.O(i, inflate);
            if (nestedScrollViewAdvanced != null) {
                i = j8h0.dashboard_header;
                ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                if (listHeaderComponent != null) {
                    i = j8h0.footer_shadow;
                    GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                    if (goImageView != null) {
                        i = j8h0.intercity_dashboard_buttons_container_holder;
                        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                        if (frameLayout != null) {
                            i = j8h0.loading_placeholder;
                            LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                            if (linearLayout != null) {
                                i = j8h0.loading_view;
                                PlaceholderView placeholderView = (PlaceholderView) cma1.O(i, inflate);
                                if (placeholderView != null) {
                                    i = j8h0.sections_container;
                                    LinearLayout linearLayout2 = (LinearLayout) cma1.O(i, inflate);
                                    if (linearLayout2 != null) {
                                        i = j8h0.top_space;
                                        if (((Space) cma1.O(i, inflate)) != null) {
                                            return new ffw((FrameLayout) inflate, O, nestedScrollViewAdvanced, listHeaderComponent, goImageView, frameLayout, linearLayout, placeholderView, linearLayout2);
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
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return false;
    }

    @Override // defpackage.llw
    public View itemView() {
        return this;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((d2x0) ((vfw) this.statusBarController).a).a(0, qoi0.a(vfw.class), false);
        g gVar = this.dashboardPresenter;
        dfw dfwVar = new dfw(this);
        gVar.Bg(dfwVar);
        ((qow) gVar.L).d(qef.e);
        gVar.I.a((ike) gVar.Jg(), new c(gVar));
        r0 r0Var = gVar.A.c;
        gVar.y.getClass();
        sjh sjhVar = uyj.a;
        tpr F = kotlinx.coroutines.flow.e.F(r0Var, sjhVar);
        IntercityDashboardPresenter$attachView$2 intercityDashboardPresenter$attachView$2 = new IntercityDashboardPresenter$attachView$2(2, dfwVar, bfw.class, "render", "render(Ljava/lang/Object;)V", 4);
        int i = 3;
        kotlinx.coroutines.flow.e.H(gVar.Jg(), new jqr(new jqr(F, intercityDashboardPresenter$attachView$2, i), new IntercityDashboardPresenter$attachView$3(gVar, null), i));
        com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.f fVar = gVar.z;
        kotlinx.coroutines.flow.e.H(gVar.Jg(), kotlinx.coroutines.flow.e.F(new jqr(new mth(kotlinx.coroutines.flow.e.t(fVar.h()), 4), new IntercityDashboardPresenter$attachView$4(gVar, null), i), sjhVar));
        kotlinx.coroutines.flow.e.H(gVar.Jg(), kotlinx.coroutines.flow.e.F(new jqr(kotlinx.coroutines.flow.e.t(new com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.e(fVar.r.a, fVar)), new IntercityDashboardPresenter$attachView$5(gVar, null), i), sjhVar));
        kotlinx.coroutines.flow.e.H(gVar.Jg(), kotlinx.coroutines.flow.e.F(new jqr(new e(new jqr(((k) fVar.l).j.a(), new IntercityDashboardPresenter$attachView$6(gVar, null), i)), new IntercityDashboardPresenter$attachView$8(gVar, null), i), sjhVar));
        gVar.T = kotlinx.coroutines.flow.e.H(gVar.Jg(), kotlinx.coroutines.flow.e.F(new jqr(vng.l(((k) fVar.j.g).j.b(), new xuv(20), vng.c), new IntercityDashboardPresenter$attachView$10(gVar, null), i), sjhVar));
        tje.N(gVar.Jg(), sjhVar, null, new IntercityDashboardPresenter$attachView$11(gVar, null), 2);
        tje.N(gVar.Jg(), sjhVar, null, new IntercityDashboardPresenter$attachView$12(gVar, null), 2);
        kotlinx.coroutines.flow.e.H(gVar.Jg(), new jqr(gVar.Q.b, new IntercityDashboardPresenter$attachView$13(gVar, null), i));
        this.mainScopeDelegate.a();
        tje.N(this.mainScopeDelegate.c(), null, null, new IntercityDashboardModalView$onAttachedToWindow$$inlined$safeCollectIn$1(new b(this.themeSwitcherProvider.a(), this), null, this), 3);
        setDismissOnTouchOutside(false);
        getBottomSheet().setBackgroundResource(mqg0.transparent);
        requestApplyInsets();
        this.buttonsContainerHolder.addView(this.dashboardButtonsContainerView);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00dc  */
    @Override // ru.yandex.taxi.widget.ModalView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBackPressed() {
        pcw pcwVar;
        g gVar = this.dashboardPresenter;
        com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.f fVar = gVar.z;
        com.yandex.go.taxi.intercity.dashboard.impl.experiment.c cVar = fVar.c;
        vgw vgwVar = fVar.b;
        jtq0 jtq0Var = fVar.n;
        if (cVar.b().b) {
            long d = jtq0Var.d();
            long j = vgwVar.a.j("last_show_feedback_screen", 0L);
            o430 o430Var = e3n.b;
            if (d >= e3n.e(kp50.U(cVar.b().d, DurationUnit.DAYS)) + j) {
                IntercityDashboardFeedbackExperiment b = cVar.b();
                String Y = d6z.Y(b, b.e);
                IntercityDashboardFeedbackExperiment b2 = cVar.b();
                String Y2 = d6z.Y(b2, b2.f);
                IntercityDashboardFeedbackExperiment b3 = cVar.b();
                String Y3 = d6z.Y(b3, b3.g);
                IntercityDashboardFeedbackExperiment b4 = cVar.b();
                String Y4 = d6z.Y(b4, b4.h);
                List<IntercityDashboardFeedbackExperiment.Reason> list = cVar.b().i;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (IntercityDashboardFeedbackExperiment.Reason reason : list) {
                    arrayList.add(new xcw(reason.a, d6z.Y(cVar.b(), reason.a), reason.b));
                }
                pcwVar = new pcw(Y, Y2, Y3, Y4, arrayList);
                if (cVar.b().c) {
                    List L0 = kotlin.collections.a.L0(arrayList);
                    Collections.shuffle(L0);
                    pcwVar = new pcw(Y, Y2, Y3, Y4, L0);
                }
                if (pcwVar == null) {
                    vgwVar.a.q(jtq0Var.d(), "last_show_feedback_screen");
                    com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.e eVar = gVar.x.a;
                    eVar.A((m950) eVar.L.get(), new ucw(pcwVar), new pfw(eVar));
                    return;
                }
                ((bfw) gVar.Dg()).a5();
                pzt0 pzt0Var = gVar.T;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                gVar.N.a();
                gVar.H.b();
                return;
            }
        }
        pcwVar = null;
        if (pcwVar == null) {
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.dashboardPresenter.Cg();
        ((d2x0) ((vfw) this.statusBarController).a).b(qoi0.a(vfw.class));
        this.mainScopeDelegate.b();
    }

    @Override // defpackage.llw
    public /* bridge */ void onPause() {
    }

    @Override // defpackage.llw
    public /* bridge */ void onResume() {
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), getCardContentView(), event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }
}
