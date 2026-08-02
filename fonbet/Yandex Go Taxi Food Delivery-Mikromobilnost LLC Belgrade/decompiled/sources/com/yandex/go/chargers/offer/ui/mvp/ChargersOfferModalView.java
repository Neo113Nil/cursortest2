package com.yandex.go.chargers.offer.ui.mvp;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.r;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.widget.NestedScrollView;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOfferCardButtonNameV6;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOfferCardCloseReason;
import com.yandex.go.chargers.design.components.badges.ChargersBadgesView;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountTypeDto;
import com.yandex.go.chargers.offer.experiments.ChargersDiscountsEntryPointExperiment;
import com.yandex.go.chargers.payments.domain.d;
import com.yandex.go.chargers.tariff_item_info.api.ChargersTariffsView;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;
import com.yandex.passport.internal.ui.sloth.e;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.b8a;
import defpackage.bts;
import defpackage.c8a;
import defpackage.cma1;
import defpackage.cpb1;
import defpackage.dn9;
import defpackage.do91;
import defpackage.dy90;
import defpackage.e230;
import defpackage.em9;
import defpackage.f1h0;
import defpackage.fi91;
import defpackage.fid;
import defpackage.g18;
import defpackage.h9a;
import defpackage.hh8;
import defpackage.hm9;
import defpackage.hpb1;
import defpackage.im9;
import defpackage.io9;
import defpackage.ir9;
import defpackage.jl40;
import defpackage.jm9;
import defpackage.km9;
import defpackage.ku9;
import defpackage.l8a;
import defpackage.ldc;
import defpackage.lna;
import defpackage.m8a;
import defpackage.m950;
import defpackage.n8a;
import defpackage.nac;
import defpackage.ndh0;
import defpackage.ny61;
import defpackage.o8a;
import defpackage.oaa;
import defpackage.p8a;
import defpackage.pav;
import defpackage.pwy0;
import defpackage.q1h0;
import defpackage.qdb1;
import defpackage.qje;
import defpackage.qo9;
import defpackage.r8a;
import defpackage.rea0;
import defpackage.rzo;
import defpackage.s8o;
import defpackage.sb0;
import defpackage.shh0;
import defpackage.sog0;
import defpackage.ssh0;
import defpackage.swa;
import defpackage.sy60;
import defpackage.t1w;
import defpackage.t6a;
import defpackage.tje;
import defpackage.tla;
import defpackage.tn9;
import defpackage.u08;
import defpackage.u90;
import defpackage.uj9;
import defpackage.uo9;
import defpackage.up2;
import defpackage.uz;
import defpackage.v7a;
import defpackage.vr60;
import defpackage.vvb1;
import defpackage.w130;
import defpackage.w511;
import defpackage.w7a;
import defpackage.wp2;
import defpackage.wwg;
import defpackage.x6a;
import defpackage.x7a;
import defpackage.xng0;
import defpackage.xqg0;
import defpackage.xw31;
import defpackage.xx8;
import defpackage.y7a;
import defpackage.zp2;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NumberCheckoutView;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0089\u0001BU\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001aH\u0014¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u001aH\u0014¢\u0006\u0004\b&\u0010\u001cJ\u000f\u0010'\u001a\u00020\u001aH\u0014¢\u0006\u0004\b'\u0010\u001cJ\u001f\u0010,\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020.2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020.2\u0006\u00108\u001a\u000204H\u0017¢\u0006\u0004\b9\u00107J\u0017\u0010<\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010@\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020.H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020.H\u0014¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020!2\u0006\u0010E\u001a\u00020\u001eH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u001aH\u0002¢\u0006\u0004\bK\u0010\u001cJ\u001f\u0010P\u001a\u00020\u001a2\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u001aH\u0002¢\u0006\u0004\bR\u0010\u001cJ\u000f\u0010S\u001a\u00020\u001aH\u0002¢\u0006\u0004\bS\u0010\u001cJ\u0017\u0010T\u001a\u00020.2\u0006\u00108\u001a\u000204H\u0002¢\u0006\u0004\bT\u00107J\u0017\u0010U\u001a\u00020\u001a2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\bW\u0010=J\u0017\u0010Y\u001a\u00020\u001a2\u0006\u0010X\u001a\u00020\u001eH\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u001aH\u0002¢\u0006\u0004\b[\u0010\u001cJ\u0017\u0010]\u001a\u00020\u001a2\u0006\u0010\\\u001a\u00020\u001eH\u0002¢\u0006\u0004\b]\u0010ZJ\u000f\u0010^\u001a\u00020\u001aH\u0002¢\u0006\u0004\b^\u0010\u001cJ\u0017\u0010`\u001a\u00020\u001a2\u0006\u0010_\u001a\u00020.H\u0002¢\u0006\u0004\b`\u0010DJ\u0017\u0010c\u001a\u00020\u001a2\u0006\u0010b\u001a\u00020aH\u0002¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\u001aH\u0002¢\u0006\u0004\be\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010gR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010hR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010iR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010jR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010kR\u0014\u0010l\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010mR\u0014\u0010o\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010mR\u0016\u0010p\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010mR\u0016\u0010q\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010s\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010rR\u0016\u0010t\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010mR\u0016\u0010v\u001a\u00020u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010|\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0018\u0010~\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010}R\u0018\u0010\u007f\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010}R\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008a\u0001"}, d2 = {"Lcom/yandex/go/chargers/offer/ui/mvp/ChargersOfferModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lr8a;", "Landroid/content/Context;", "context", "Lrea0;", "paymentModelsTitleInteractor", "Ltla;", "chargersPaymentComponentHolder", "Lpav;", "imageLoader", "Lem9;", "chargersAnalytics", "Lpwy0;", "themeSwitcherProvider", "Lcom/yandex/go/chargers/domain/a;", "chargersAuthWaitingInteractor", "Lku9;", "chargersDiscountsEntryPointExperimentRepository", "Lcom/yandex/go/chargers/offer/ui/mvp/c;", "presenter", "<init>", "(Landroid/content/Context;Lrea0;Ltla;Lpav;Lem9;Lpwy0;Lcom/yandex/go/chargers/domain/a;Lku9;Lcom/yandex/go/chargers/offer/ui/mvp/c;)V", "Le230;", "insetsType", "()Le230;", "Lzy11;", "onAttachedToWindow", "()V", "onSlideOut", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "", "newOffset", "setBackgroundDimColor", "(F)V", "onBackPressed", "animateDismissBackground", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lr8a;", "", "canHandleScreenTracking", "()Z", "", "screenName", "()Ljava/lang/String;", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "newState", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "settle", "updateAnchoredHeight", "(Z)V", "dp", "dpToPx", "(I)F", "Lru/yandex/taxi/design/ListItemComponent;", "createPricingListItem", "()Lru/yandex/taxi/design/ListItemComponent;", "cancelJobs", "Landroid/graphics/Rect;", "infoIconRect", "", "hint", "showHintBubble", "(Landroid/graphics/Rect;Ljava/lang/CharSequence;)V", "setAttentionHeader", "disablePromoImageClipping", "isTouchInsideCardContent", "hideHintBubbleOnTouch", "(Landroid/view/MotionEvent;)V", "changeShimmerTheme", "height", "setCardHeight", "(I)V", "fitCardToContent", "minOffset", "applyMinOffset", "onContentLoaded", "isVisible", "setAttentionHeaderVisibility", "Loaa;", "successUiState", "renderSuccess", "(Loaa;)V", "renderLoading", "Lpav;", "Lem9;", "Lpwy0;", "Lcom/yandex/go/chargers/domain/a;", "Lku9;", "Lcom/yandex/go/chargers/offer/ui/mvp/c;", "loadingCardHeight", CA20Status.STATUS_USER_I, "minOffsetWithCollapsedPlaque", "minOffsetWithExpandedPlaque", "currentMinOffset", "hasAttention", "Z", "isLoading", "pendingBottomPadding", "Landroid/graphics/drawable/Drawable;", "hintDrawable", "Landroid/graphics/drawable/Drawable;", "Lcom/yandex/go/chargers/offer/ui/mvp/ChargersOfferBottomComponent;", "chargersOfferBottomComponent", "Lcom/yandex/go/chargers/offer/ui/mvp/ChargersOfferBottomComponent;", "Lg18;", "loadAttentionIconBackgroundJob", "Lg18;", "loadAttentionImageBackgroundJob", "loadBannerImageBackgroundJob", "Lru/yandex/taxi/widget/RobotoTextView;", "hintTextView", "Lru/yandex/taxi/widget/RobotoTextView;", "Lru/yandex/taxi/design/bubble/BubbleComponent;", "bubbleComponent", "Lru/yandex/taxi/design/bubble/BubbleComponent;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "o8a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersOfferModalView extends SlideableBindingModalView<r8a> {
    public static final int $stable = 8;
    private final FloatButtonIconComponent backButton;
    private final BubbleComponent bubbleComponent;
    private final em9 chargersAnalytics;
    private final com.yandex.go.chargers.domain.a chargersAuthWaitingInteractor;
    private final ku9 chargersDiscountsEntryPointExperimentRepository;
    private final ChargersOfferBottomComponent chargersOfferBottomComponent;
    private int currentMinOffset;
    private boolean hasAttention;
    private Drawable hintDrawable;
    private final RobotoTextView hintTextView;
    private final pav imageLoader;
    private boolean isLoading;
    private g18 loadAttentionIconBackgroundJob;
    private g18 loadAttentionImageBackgroundJob;
    private g18 loadBannerImageBackgroundJob;
    private final int loadingCardHeight;
    private final int minOffsetWithCollapsedPlaque;
    private final int minOffsetWithExpandedPlaque;
    private int pendingBottomPadding;
    private final c presenter;
    private final pwy0 themeSwitcherProvider;

    public ChargersOfferModalView(Context context, rea0 rea0Var, tla tlaVar, pav pavVar, em9 em9Var, pwy0 pwy0Var, com.yandex.go.chargers.domain.a aVar, ku9 ku9Var, c cVar) {
        super(context, 6);
        this.imageLoader = pavVar;
        this.chargersAnalytics = em9Var;
        this.themeSwitcherProvider = pwy0Var;
        this.chargersAuthWaitingInteractor = aVar;
        this.chargersDiscountsEntryPointExperimentRepository = ku9Var;
        this.presenter = cVar;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        this.loadingCardHeight = tje.u(320, getContext());
        this.minOffsetWithCollapsedPlaque = tje.u(120, getContext());
        int u = tje.u(MSException.ERROR_BUSY, getContext());
        this.minOffsetWithExpandedPlaque = u;
        this.currentMinOffset = u;
        this.isLoading = true;
        this.hintDrawable = tje.y(q1h0.ic_chargers_info_outline, context);
        this.chargersOfferBottomComponent = new ChargersOfferBottomComponent(context, pavVar, ((dy90) ((d) tlaVar).b()).a.d(), rea0Var, new l8a(this, 1));
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        robotoTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        int u2 = tje.u(8, robotoTextView.getContext());
        int u3 = tje.u(12, robotoTextView.getContext());
        robotoTextView.setPadding(u3, u2, u3, u2);
        robotoTextView.setGravity(1);
        this.hintTextView = robotoTextView;
        BubbleComponent bubbleComponent = new BubbleComponent(context, null, 0, 6, null);
        bubbleComponent.addView(robotoTextView);
        getBinding().a.addView(bubbleComponent, tje.u(214, bubbleComponent.getContext()), -2);
        bubbleComponent.setVisibility(4);
        this.bubbleComponent = bubbleComponent;
        this.backButton = qdb1.b(this, new m8a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyMinOffset(int minOffset) {
        this.currentMinOffset = minOffset;
        getBottomSheetBehavior().K(minOffset, true);
        if (this.isLoading) {
            return;
        }
        fitCardToContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void backButton$lambda$0(ChargersOfferModalView chargersOfferModalView) {
        chargersOfferModalView.presenter.Kg(t6a.a, null);
    }

    private final void cancelJobs() {
        g18 g18Var = this.loadAttentionImageBackgroundJob;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.loadAttentionImageBackgroundJob = null;
        g18 g18Var2 = this.loadAttentionIconBackgroundJob;
        if (g18Var2 != null) {
            g18Var2.cancel();
        }
        this.loadAttentionIconBackgroundJob = null;
        g18 g18Var3 = this.loadBannerImageBackgroundJob;
        if (g18Var3 != null) {
            g18Var3.cancel();
        }
        this.loadBannerImageBackgroundJob = null;
    }

    private final void changeShimmerTheme(ThemeType themeType) {
        int color = getContext().getColor(xqg0.transparent_50_white);
        int color2 = getContext().getColor(sog0.shimmer_edge_dark);
        int color3 = getContext().getColor(xqg0.white);
        int color4 = getContext().getColor(sog0.shimmering_center_dark);
        int i = p8a.a[themeType.ordinal()];
        if (i == 1) {
            getBinding().t.setEdgeColor(color);
            getBinding().t.setCenterColor(color3);
        } else if (i != 2) {
            w511.b();
        } else {
            getBinding().t.setEdgeColor(color2);
            getBinding().t.setCenterColor(color4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 chargersOfferBottomComponent$lambda$0(ChargersOfferModalView chargersOfferModalView, uj9 uj9Var) {
        chargersOfferModalView.presenter.Kg(uj9Var, null);
        return zy11.a;
    }

    private final ListItemComponent createPricingListItem() {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        listItemComponent.setAutoMinHeight();
        return listItemComponent;
    }

    private final void disablePromoImageClipping() {
        ViewParent parent = getBinding().d.getParent();
        while ((parent instanceof ViewGroup) && !parent.equals(this)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            viewGroup.setClipToOutline(false);
            parent = viewGroup.getParent();
        }
        View findViewById = findViewById(ndh0.slideable_modal_view_bottom_sheet);
        if (findViewById != null) {
            fi91.f(findViewById, qje.t(xng0.bgMain, getContext()), dpToPx(24));
        }
    }

    private final float dpToPx(int dp) {
        return dp * getContext().getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fitCardToContent() {
        int height = getBinding().p.getHeight() + ((this.hasAttention && getBinding().e.getVisibility() == 0) ? getBinding().e.getHeight() : 0);
        if (height == 0) {
            return;
        }
        int height2 = getContent().getHeight() - this.currentMinOffset;
        if (height > height2) {
            height = height2;
        }
        setCardHeight(height);
    }

    private final void hideHintBubbleOnTouch(MotionEvent ev) {
        if (ev.getAction() == 0 && this.bubbleComponent.getVisibility() == 0) {
            BubbleComponent.hide$default(this.bubbleComponent, false, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(ChargersOfferModalView chargersOfferModalView, t1w t1wVar) {
        boolean z = t1wVar.f;
        zy11 zy11Var = zy11.a;
        if (z) {
            return zy11Var;
        }
        chargersOfferModalView.setTopSystemWindowInset(t1wVar.b - ru.yandex.taxi.design.utils.c.h(24, chargersOfferModalView));
        ChargersOfferBottomComponent chargersOfferBottomComponent = chargersOfferModalView.chargersOfferBottomComponent;
        chargersOfferBottomComponent.setPadding(chargersOfferBottomComponent.getPaddingLeft(), chargersOfferBottomComponent.getPaddingTop(), chargersOfferBottomComponent.getPaddingRight(), t1wVar.g);
        return zy11Var;
    }

    private final boolean isTouchInsideCardContent(MotionEvent event) {
        return xw31.o(getRootView(), getCardContentView(), event) || xw31.o(getRootView(), this.backButton, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ChargersOfferModalView chargersOfferModalView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 == i8 || chargersOfferModalView.isLoading) {
            return;
        }
        chargersOfferModalView.fitCardToContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$1(ChargersOfferModalView chargersOfferModalView, int i, int i2) {
        chargersOfferModalView.pendingBottomPadding = i2;
        if (chargersOfferModalView.isLoading) {
            chargersOfferModalView.setCardHeight(chargersOfferModalView.loadingCardHeight + i2);
        } else {
            e.n(i2, chargersOfferModalView.getBinding().p);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$2(ChargersOfferModalView chargersOfferModalView, qo9 qo9Var) {
        em9.p(chargersOfferModalView.chargersAnalytics, ChargersAnalytics$ChargersOfferCardButtonNameV6.Badge, null, null, qo9Var.a, null, null, 54);
        chargersOfferModalView.presenter.Kg(qo9Var.e, null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$3(ChargersOfferModalView chargersOfferModalView) {
        chargersOfferModalView.getBottomSheetBehavior().K(chargersOfferModalView.backButton.getHeight(), true);
    }

    private final void onContentLoaded() {
        if (this.isLoading) {
            e.n(this.pendingBottomPadding, getBinding().p);
            OneShotPreDrawListener.add(getBinding().q, new uz(13, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderLoading() {
        this.isLoading = true;
        this.hasAttention = false;
        getBinding().t.setVisibility(8);
        getBinding().u.setVisibility(0);
        getBinding().r.setVisibility(8);
        this.chargersOfferBottomComponent.loading();
        setCardHeight(this.loadingCardHeight + this.pendingBottomPadding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r4v95 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void renderSuccess(oaa successUiState) {
        int i;
        int i2;
        String str;
        float[] fArr;
        getBinding().t.setVisibility(successUiState.g ? 0 : 8);
        if (successUiState.g) {
            this.chargersOfferBottomComponent.loading();
        }
        getBinding().u.setVisibility(8);
        getBinding().r.setVisibility(0);
        this.chargersOfferBottomComponent.setDiscountsButtonDebounceClickListener(new u08(29, this, successUiState));
        c8a c8aVar = successUiState.d;
        y7a y7aVar = c8aVar.e;
        List list = c8aVar.h;
        swa swaVar = c8aVar.i;
        w7a w7aVar = c8aVar.d;
        v7a v7aVar = c8aVar.c;
        b8a b8aVar = c8aVar.b;
        vr60 vr60Var = c8aVar.f;
        boolean z = y7aVar == null;
        getBinding().z.setVisibility(z ? 0 : 8);
        getBinding().x.setVisibility(z ? 0 : 8);
        getBinding().v.setVisibility(!z ? 0 : 8);
        boolean z2 = vr60Var != null;
        this.hasAttention = z2;
        setAttentionHeaderVisibility(z2);
        if (vr60Var != null) {
            String str2 = vr60Var.f;
            String str3 = vr60Var.c;
            ru.yandex.taxi.design.utils.c.z(new sb0(13, this, vr60Var, successUiState), getBinding().e);
            getBinding().f.setText(vr60Var.a);
            getBinding().c.setVisibility(str3 != null ? 0 : 8);
            if (str3 != null) {
                g18 g18Var = this.loadAttentionIconBackgroundJob;
                if (g18Var != null) {
                    g18Var.cancel();
                }
                this.loadAttentionIconBackgroundJob = ((nac) this.imageLoader.a(getBinding().c)).c(str3);
            }
            getBinding().d.setVisibility(str2 != null ? 0 : 8);
            if (str2 != null) {
                g18 g18Var2 = this.loadAttentionImageBackgroundJob;
                if (g18Var2 != null) {
                    g18Var2.cancel();
                }
                this.loadAttentionImageBackgroundJob = ((nac) this.imageLoader.a(getBinding().d)).c(str2);
            }
            ViewParent parent = getBinding().e.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                fi91.f(viewGroup, s8o.m(vr60Var.b, getContext()), dpToPx(24));
            }
            getBinding().s.show();
        }
        if (z) {
            boolean z3 = b8aVar != null;
            getBinding().w.initDependencies(this.imageLoader);
            getBinding().w.setNumber(b8aVar != null ? b8aVar.a : null);
            getBinding().w.setHint(b8aVar != null ? b8aVar.b : null);
            getBinding().w.setIcon(b8aVar != null ? b8aVar.c : null);
            getBinding().w.setVisibility(z3 ? 0 : 8);
            boolean z4 = (v7aVar == null || (v7aVar.a == null && v7aVar.b == null)) ? false : true;
            getBinding().b.setTitle(v7aVar != null ? v7aVar.a : null);
            getBinding().b.setSubtitle(v7aVar != null ? v7aVar.b : null);
            getBinding().b.setVisibility(z4 ? 0 : 8);
        } else {
            getBinding().o.setText(y7aVar.a);
            getBinding().y.setText(y7aVar.b);
        }
        getBinding().k.setVisibility(w7aVar != null ? 0 : 8);
        if (w7aVar != null) {
            String str4 = w7aVar.c;
            lna lnaVar = w7aVar.d;
            tn9 tn9Var = w7aVar.f;
            getBinding().n.setText(w7aVar.a);
            getBinding().m.setText(w7aVar.b);
            Integer num = w7aVar.e;
            getBinding().h.setBackgroundDrawable(cpb1.e(dpToPx(20), num != null ? num.intValue() : qje.t(xng0.bgMinor, getContext())));
            ru.yandex.taxi.design.utils.c.z(new n8a(0, this, w7aVar), getBinding().h);
            getBinding().i.setVisibility(tn9Var != null ? 0 : 8);
            if (tn9Var != null) {
                getBinding().i.setText(tn9Var.a);
                RobotoTextView robotoTextView = getBinding().i;
                int i3 = tn9Var.b;
                if (Float.isNaN(100.0f) || Float.isInfinite(100.0f)) {
                    i2 = 8;
                    fArr = null;
                } else {
                    i2 = 8;
                    fArr = new float[8];
                    for (int i4 = 0; i4 < 8; i4++) {
                        fArr[i4] = 100.0f;
                    }
                }
                str = null;
                RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
                ShapeDrawable shapeDrawable = new ShapeDrawable();
                shapeDrawable.setShape(roundRectShape);
                shapeDrawable.getPaint().setColor(i3);
                robotoTextView.setBackgroundDrawable(shapeDrawable);
            } else {
                i2 = 8;
                str = null;
            }
            String str5 = lnaVar != null ? lnaVar.b : str;
            if (str5 == null) {
                str5 = "";
            }
            boolean z5 = str5.length() > 0;
            getBinding().j.setVisibility(z5 ? 0 : i2);
            if (z5) {
                getBinding().j.setViewCompositionStrategy(r.b);
                ?? r9 = lnaVar != null ? lnaVar.c : str;
                up2 up2Var = new up2(zp2.a);
                if (r9 != 0) {
                    up2Var = new up2(rzo.d(r9.intValue()));
                }
                ?? r4 = lnaVar != null ? lnaVar.d : str;
                i = 0;
                up2 up2Var2 = new up2(rzo.e(0, 173, 255, 255));
                if (r4 != 0) {
                    up2Var2 = new up2(rzo.d(r4.intValue()));
                }
                getBinding().j.setContent(new androidx.compose.runtime.internal.a(-287008665, new xx8(29, str5, up2Var, up2Var2), true));
            } else {
                i = 0;
            }
            getBinding().l.setVisibility((z5 || str4 == null) ? 8 : i);
            if (str4 != null) {
                g18 g18Var3 = this.loadBannerImageBackgroundJob;
                if (g18Var3 != null) {
                    g18Var3.cancel();
                }
                this.loadBannerImageBackgroundJob = ((nac) this.imageLoader.a(getBinding().l)).c(str4);
            }
        } else {
            i = 0;
        }
        getBinding().A.setOnTariffDetailItemTitleClickListener(new ChargersOfferModalView$renderSuccess$4(1, this.presenter, c.class, "onTariffItemInfoTapped", "onTariffItemInfoTapped(Lcom/yandex/go/chargers/tariff_item_info/api/domain/model/ChargersTariffDetailItem$Hint;)V", 0));
        getBinding().A.setOnTariffDetailItemValueClickListener(new l8a(this, 3));
        getBinding().A.success(swaVar);
        getBinding().A.setVisibility(swaVar != null ? i : 8);
        ChargersBadgesView chargersBadgesView = getBinding().g;
        List<qo9> list2 = c8aVar.j;
        if (list2 == null) {
            list2 = EmptyList.a;
        }
        chargersBadgesView.submitBadges(list2);
        if (list.isEmpty()) {
            return;
        }
        CharSequence charSequence = successUiState.c;
        x7a x7aVar = c8aVar.m;
        this.chargersOfferBottomComponent.m187successnAiNo((uo9) kotlin.collections.a.P(list), successUiState.b, charSequence, c8aVar.k, (x7aVar != null && this.chargersAuthWaitingInteractor.b() && ((ChargersDiscountsEntryPointExperiment) this.chargersDiscountsEntryPointExperimentRepository.a.b()).b) ? x7aVar : null, successUiState.g);
        onContentLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderSuccess$lambda$0(ChargersOfferModalView chargersOfferModalView, oaa oaaVar) {
        chargersOfferModalView.presenter.Kg(new x6a(oaaVar.a), null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderSuccess$lambda$1$0(ChargersOfferModalView chargersOfferModalView, vr60 vr60Var, oaa oaaVar) {
        Object obj;
        c cVar = chargersOfferModalView.presenter;
        km9 km9Var = vr60Var.e;
        String str = oaaVar.a;
        io9 io9Var = cVar.H;
        if (km9Var instanceof hm9) {
            h9a h9aVar = (h9a) io9Var.a;
            h9aVar.A((m950) h9aVar.Q.get(), new dn9((hm9) km9Var), sy60.Q2);
        } else if (km9Var instanceof jm9) {
            jm9 jm9Var = (jm9) km9Var;
            em9.p(cVar.x, ChargersAnalytics$ChargersOfferCardButtonNameV6.PromoNotch, null, null, null, jm9Var.b, null, 46);
            Iterator<E> it = ChargersDiscountTypeDto.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((ChargersDiscountTypeDto) obj).name(), jm9Var.a)) {
                    break;
                }
            }
            ChargersDiscountTypeDto chargersDiscountTypeDto = (ChargersDiscountTypeDto) obj;
            if (chargersDiscountTypeDto != null) {
                io9Var.q(str, cVar.G, new ir9(chargersDiscountTypeDto, jm9Var.b, null));
            }
        } else if (!jl40.l(km9Var, im9.a)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderSuccess$lambda$2$0(ChargersOfferModalView chargersOfferModalView, w7a w7aVar) {
        chargersOfferModalView.presenter.Kg(w7aVar.g, null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderSuccess$lambda$2$2(String str, wp2 wp2Var, wp2 wp2Var2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            rzo.a(wwg.S(1770075676, true, new xx8(28, str, wp2Var, wp2Var2), btsVar), btsVar, 6);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderSuccess$lambda$2$2$0(String str, wp2 wp2Var, wp2 wp2Var2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            hpb1.c(str, wp2Var, wp2Var2, vvb1.x, 4.0f, ldc.b(ldc.b, 0.5f, 0.0f, 0.0f, 0.0f, 14), null, btsVar, 224256, 64);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderSuccess$lambda$3(ChargersOfferModalView chargersOfferModalView, uj9 uj9Var) {
        chargersOfferModalView.presenter.Kg(uj9Var, ChargersAnalytics$ChargersOfferCardButtonNameV6.SurgeIcon);
        return zy11.a;
    }

    private final void setAttentionHeader() {
        DialogueComponent dialogueComponent = getBinding().s;
        dialogueComponent.setHeaderView(getBinding().e);
        dialogueComponent.setContentView(getBinding().q);
        disablePromoImageClipping();
        dialogueComponent.setAnimationType(DialogueComponent.AnimationType.CONTENT_SLIDE_BOTTOM);
    }

    private final void setAttentionHeaderVisibility(boolean isVisible) {
        if (isVisible) {
            getBinding().e.setVisibility(0);
            getBinding().f.setVisibility(0);
            return;
        }
        Fade fade = new Fade();
        fade.c = 600L;
        TransitionManager.a(fade, getBinding().e);
        getBinding().c.setVisibility(8);
        getBinding().f.setVisibility(8);
        getBinding().d.setVisibility(8);
        getBinding().e.setVisibility(8);
    }

    private final void setCardHeight(int height) {
        ViewGroup.LayoutParams layoutParams = getBinding().a.getLayoutParams();
        if (layoutParams.height != height) {
            layoutParams.height = height;
            getBinding().a.setLayoutParams(layoutParams);
        }
        setBehaviorAnchorHeight(Integer.valueOf(height));
    }

    private final void showHintBubble(Rect infoIconRect, CharSequence hint) {
        em9.p(this.presenter.x, ChargersAnalytics$ChargersOfferCardButtonNameV6.PricingHint, null, null, null, null, null, 62);
        this.hintTextView.setText(hint);
        OneShotPreDrawListener.add(this.hintTextView, new do91(3, this, infoIconRect));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismissBackground() {
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        changeShimmerTheme(themeType);
        this.hintDrawable = tje.y(q1h0.ic_chargers_info_outline, getContext());
        disablePromoImageClipping();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return xqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public r8a bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(ssh0.chargers_offer_modal_view, parent, false);
        int i = shh0.address;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
        if (listItemComponent != null) {
            i = shh0.attention_header_icon;
            ImageView imageView = (ImageView) cma1.O(i, inflate);
            if (imageView != null) {
                i = shh0.attention_header_image;
                ImageView imageView2 = (ImageView) cma1.O(i, inflate);
                if (imageView2 != null) {
                    i = shh0.attention_header_layout;
                    GoConstraintLayout goConstraintLayout = (GoConstraintLayout) cma1.O(i, inflate);
                    if (goConstraintLayout != null) {
                        i = shh0.attention_header_text;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView != null) {
                            i = shh0.badges;
                            ChargersBadgesView chargersBadgesView = (ChargersBadgesView) cma1.O(i, inflate);
                            if (chargersBadgesView != null) {
                                i = shh0.banner_background;
                                GoView goView = (GoView) cma1.O(i, inflate);
                                if (goView != null) {
                                    i = shh0.banner_badge;
                                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                                    if (robotoTextView2 != null) {
                                        i = shh0.banner_coupon;
                                        ComposeView composeView = (ComposeView) cma1.O(i, inflate);
                                        if (composeView != null) {
                                            i = shh0.banner_group;
                                            Group group = (Group) cma1.O(i, inflate);
                                            if (group != null) {
                                                i = shh0.banner_image;
                                                GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                                                if (goImageView != null) {
                                                    i = shh0.banner_subtitle;
                                                    RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, inflate);
                                                    if (robotoTextView3 != null) {
                                                        i = shh0.banner_title;
                                                        RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i, inflate);
                                                        if (robotoTextView4 != null) {
                                                            i = shh0.company_name;
                                                            RobotoTextView robotoTextView5 = (RobotoTextView) cma1.O(i, inflate);
                                                            if (robotoTextView5 != null) {
                                                                i = shh0.container_constraint;
                                                                GoConstraintLayout goConstraintLayout2 = (GoConstraintLayout) cma1.O(i, inflate);
                                                                if (goConstraintLayout2 != null) {
                                                                    i = shh0.container_scroll_view;
                                                                    NestedScrollView nestedScrollView = (NestedScrollView) cma1.O(i, inflate);
                                                                    if (nestedScrollView != null) {
                                                                        i = shh0.content_group;
                                                                        Group group2 = (Group) cma1.O(i, inflate);
                                                                        if (group2 != null) {
                                                                            i = shh0.dialogue;
                                                                            DialogueComponent dialogueComponent = (DialogueComponent) cma1.O(i, inflate);
                                                                            if (dialogueComponent != null) {
                                                                                i = shh0.full_screen_shimmer;
                                                                                ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i, inflate);
                                                                                if (shimmeringBar != null) {
                                                                                    i = shh0.loading_group;
                                                                                    Group group3 = (Group) cma1.O(i, inflate);
                                                                                    if (group3 != null) {
                                                                                        i = shh0.new_title_group;
                                                                                        Group group4 = (Group) cma1.O(i, inflate);
                                                                                        if (group4 != null) {
                                                                                            i = shh0.number_checkout_view;
                                                                                            NumberCheckoutView numberCheckoutView = (NumberCheckoutView) cma1.O(i, inflate);
                                                                                            if (numberCheckoutView != null) {
                                                                                                i = shh0.old_title_group;
                                                                                                Group group5 = (Group) cma1.O(i, inflate);
                                                                                                if (group5 != null) {
                                                                                                    i = shh0.shimmering_bar_1;
                                                                                                    if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                                                                                        i = shh0.shimmering_bar_2;
                                                                                                        if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                                                                                            i = shh0.space;
                                                                                                            if (((Space) cma1.O(i, inflate)) != null) {
                                                                                                                i = shh0.station_number;
                                                                                                                RobotoTextView robotoTextView6 = (RobotoTextView) cma1.O(i, inflate);
                                                                                                                if (robotoTextView6 != null) {
                                                                                                                    i = shh0.tariff_divider;
                                                                                                                    CardDivider cardDivider = (CardDivider) cma1.O(i, inflate);
                                                                                                                    if (cardDivider != null) {
                                                                                                                        i = shh0.tariff_view;
                                                                                                                        ChargersTariffsView chargersTariffsView = (ChargersTariffsView) cma1.O(i, inflate);
                                                                                                                        if (chargersTariffsView != null) {
                                                                                                                            i = shh0.title_barrier;
                                                                                                                            if (((Barrier) cma1.O(i, inflate)) != null) {
                                                                                                                                return new r8a((FrameLayout) inflate, listItemComponent, imageView, imageView2, goConstraintLayout, robotoTextView, chargersBadgesView, goView, robotoTextView2, composeView, group, goImageView, robotoTextView3, robotoTextView4, robotoTextView5, goConstraintLayout2, nestedScrollView, group2, dialogueComponent, shimmeringBar, group3, group4, numberCheckoutView, group5, robotoTextView6, cardDivider, chargersTariffsView);
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
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public boolean canHandleScreenTracking() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        hideHintBubbleOnTouch(ev);
        return super.dispatchTouchEvent(ev);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new l8a(this, 0));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        getBottomSheetBehavior().C = false;
        getBottomSheetBehavior().a0 = false;
        getBinding().q.setNestedScrollingEnabled(false);
        setCardHeight(this.loadingCardHeight);
        getBinding().y.setBackgroundResource(f1h0.bg_rectangle_round_16dp_minor);
        this.chargersOfferBottomComponent.attach((CoordinatorLayout) getContent());
        getBinding().p.addOnLayoutChangeListener(new u90(16, this));
        this.chargersOfferBottomComponent.setOnSizeChangedListener(new hh8(18, this));
        getBinding().g.setBadgeClickListener(new l8a(this, 2));
        setAttentionHeader();
        c cVar = this.presenter;
        o8a o8aVar = new o8a(this);
        cVar.Bg(o8aVar);
        tje.N(cVar.Jg(), null, null, new ChargersOfferPresenter$attachView$$inlined$collectIn$1(cVar.I, null, o8aVar), 3);
        tje.N(cVar.Jg(), null, null, new ChargersOfferPresenter$listenToPlaquesState$$inlined$collectIn$1(kotlinx.coroutines.flow.e.t(new b(kotlinx.coroutines.flow.e.d(cVar.B.a))), null, cVar), 3);
        tje.N(cVar.Jg(), null, null, new ChargersOfferPresenter$attachView$2(cVar, null), 3);
        tje.N(cVar.Jg(), null, null, new ChargersOfferPresenter$attachView$$inlined$safeCollectIn$1(cVar.z.c(cVar.G), null, cVar), 3);
        this.backButton.post(new m8a(this, 1));
        changeShimmerTheme(this.themeSwitcherProvider.getThemeType());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        c cVar = this.presenter;
        em9.p(cVar.x, ChargersAnalytics$ChargersOfferCardButtonNameV6.Back, null, null, null, null, null, 62);
        cVar.x.n(ChargersAnalytics$ChargersOfferCardCloseReason.Back);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        if (newState == 6) {
            updateUserInteractionBlockingOutside();
        } else {
            super.onBehaviorStateChanged(newState, movedByUser);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        cancelJobs();
        getBinding().g.removeBadgeClickListener();
        getBinding().j.disposeComposition();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (isTouchInsideCardContent(event)) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "chargers_offer_card";
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setBackgroundDimColor(float newOffset) {
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void updateAnchoredHeight(boolean settle) {
        super.updateAnchoredHeight(settle);
        int height = getContent().getHeight() - getMaxAnchoredHeight();
        if (height < 0) {
            height = 0;
        }
        AnchorBottomSheetBehavior<View> bottomSheetBehavior = getBottomSheetBehavior();
        if (height != bottomSheetBehavior.w(bottomSheetBehavior.x)) {
            getBottomSheetBehavior().I(0, settle && behaviourFinalState() == 6, height);
        }
    }
}
