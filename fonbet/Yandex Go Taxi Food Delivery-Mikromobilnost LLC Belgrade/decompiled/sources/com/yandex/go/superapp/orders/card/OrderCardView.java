package com.yandex.go.superapp.orders.card;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.superapp.orders.card.OrderCardView;
import com.yandex.go.superapp.orders.card.actions.OrderCardActionButtonsView;
import com.yandex.go.superapp.orders.card.bottom_sections.BottomSectionsView;
import com.yandex.go.superapp.orders.card.circle_buttons.CircleButtonsView;
import com.yandex.go.superapp.orders.card.header.OrderCardHeaderView;
import com.yandex.go.superapp.orders.card.header.trails.OrderCardIconStackView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bm50;
import defpackage.bm70;
import defpackage.c8h0;
import defpackage.cma1;
import defpackage.e501;
import defpackage.g401;
import defpackage.hic;
import defpackage.ho4;
import defpackage.jl40;
import defpackage.k501;
import defpackage.ke6;
import defpackage.l501;
import defpackage.l7n;
import defpackage.m501;
import defpackage.m810;
import defpackage.mkh0;
import defpackage.n501;
import defpackage.ny61;
import defpackage.o501;
import defpackage.p501;
import defpackage.pav;
import defpackage.prb1;
import defpackage.q501;
import defpackage.qvq;
import defpackage.r501;
import defpackage.s8o;
import defpackage.sls;
import defpackage.t501;
import defpackage.tje;
import defpackage.tls;
import defpackage.tn70;
import defpackage.tse;
import defpackage.w511;
import defpackage.wn70;
import defpackage.xn70;
import defpackage.y6i0;
import defpackage.yn70;
import defpackage.zn70;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.carplates.ui.CarIndexComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.RatingBarComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.order.view.walking_info.WalkingInfoView;
import ru.yandex.taxi.superapp.orders.models.ActionType;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJg\u0010'\u001a\u00020\u00172\b\b\u0001\u0010\u001e\u001a\u00020\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u00062\b\b\u0001\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010#\u001a\u00020\u00062\b\b\u0001\u0010$\u001a\u00020\u00062\b\b\u0001\u0010%\u001a\u00020\u00062\b\b\u0001\u0010&\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00172\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00172\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020-H\u0016¢\u0006\u0004\b1\u00102J/\u00107\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0006H\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00172\u0006\u0010:\u001a\u000209H\u0014¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00172\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u00172\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bE\u0010FJ\u0019\u0010I\u001a\u00020\u00172\b\u0010H\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010O\u001a\u00020\u00172\u0006\u0010M\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u0006H\u0002¢\u0006\u0004\bO\u0010PR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010[R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010[R\u0016\u0010]\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010VR\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0017\u0010b\u001a\u00020a8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010g\u001a\u00020f8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010hR\u0014\u0010\u000b\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010u\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006b"}, d2 = {"Lcom/yandex/go/superapp/orders/card/OrderCardView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/yandex/taxi/design/ListItemComponent;", "header", "()Lru/yandex/taxi/design/ListItemComponent;", "Lwn70;", "style", "Ltse;", "scope", "Lpav;", "imageLoader", "Lt501;", "uiActionInteractor", "Lhic;", "colorizedCarIconFactory", "Lzy11;", "init", "(Lwn70;Ltse;Lpav;Lt501;Lhic;)V", "Lzn70;", ClidProvider.STATE, "setState", "(Lzn70;)V", "titleColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "carPlateBackgroundColor", "carPlateTextColor", "titleShimmerColor", "outlineIconBackgroundColor", "secondaryButtonBackgroundColor", "secondaryButtonTintColor", "ratingStarColor", "setColors", "(IIIIIIIII)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", CaretView.ALPHA_PROPERTY, "setAlpha", "(F)V", "getAlpha", "()F", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "setCardStyle", "(Lwn70;)V", "", "isShimmeringEnabled", "setShimmeringState", "(Z)V", "Lyn70;", Constants.KEY_DATA, "setReadyStateData", "(Lyn70;)V", "Lg401;", "uiState", "setRatingState", "(Lg401;)V", "setUiActionInteractor", "(Lt501;)V", "width", "height", "updateShadowLayerBounds", "(II)V", "Lwn70;", "Lbm70;", "binding", "Lbm70;", UrbanAdsBottomSheetFragment.CORNER_RADIUS, CA20Status.STATUS_USER_I, "Landroid/graphics/Paint;", "shadowPaint", "Landroid/graphics/Paint;", "shadowRadius", "F", "shadowDy", "alphaInt", "Landroid/graphics/RectF;", "shadowLayerBounds", "Landroid/graphics/RectF;", "Lcom/yandex/go/superapp/orders/card/OrderCardShimmeringView;", "card", "Lcom/yandex/go/superapp/orders/card/OrderCardShimmeringView;", "getCard", "()Lcom/yandex/go/superapp/orders/card/OrderCardShimmeringView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "content", "Lcom/yandex/go/design/view/GoLinearLayout;", "getContent", "()Lcom/yandex/go/design/view/GoLinearLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "skeleton", "Landroidx/constraintlayout/widget/ConstraintLayout;", "skeletonRedesign", "Lcom/yandex/go/superapp/orders/card/header/OrderCardHeaderView;", "Lcom/yandex/go/superapp/orders/card/header/OrderCardHeaderView;", "Lcom/yandex/go/superapp/orders/card/actions/OrderCardActionButtonsView;", "actionButtons", "Lcom/yandex/go/superapp/orders/card/actions/OrderCardActionButtonsView;", "Lcom/yandex/go/superapp/orders/card/circle_buttons/CircleButtonsView;", "circleButtons", "Lcom/yandex/go/superapp/orders/card/circle_buttons/CircleButtonsView;", "Lcom/yandex/go/superapp/orders/card/bottom_sections/BottomSectionsView;", "bottomSections", "Lcom/yandex/go/superapp/orders/card/bottom_sections/BottomSectionsView;", "Lru/yandex/taxi/order/view/walking_info/WalkingInfoView;", "walkingInfo", "Lru/yandex/taxi/order/view/walking_info/WalkingInfoView;", "Lru/yandex/taxi/design/RatingBarComponent;", "ratingBar", "Lru/yandex/taxi/design/RatingBarComponent;", "lastRatingUiState", "Lg401;"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderCardView extends GoFrameLayout {
    private final OrderCardActionButtonsView actionButtons;
    private float alpha;
    private int alphaInt;
    private final bm70 binding;
    private final BottomSectionsView bottomSections;
    private final OrderCardShimmeringView card;
    private final CircleButtonsView circleButtons;
    private final GoLinearLayout content;
    private int cornerRadius;
    private final OrderCardHeaderView header;
    private g401 lastRatingUiState;
    private final RatingBarComponent ratingBar;
    private float shadowDy;
    private final RectF shadowLayerBounds;
    private Paint shadowPaint;
    private float shadowRadius;
    private final ConstraintLayout skeleton;
    private final GoLinearLayout skeletonRedesign;
    private wn70 style;
    private final WalkingInfoView walkingInfo;

    public OrderCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        Throwable th;
        View O;
        View inflate = LayoutInflater.from(context).inflate(mkh0.order_card_content, (ViewGroup) this, false);
        addView(inflate);
        int i2 = c8h0.action_buttons;
        OrderCardActionButtonsView orderCardActionButtonsView = (OrderCardActionButtonsView) cma1.O(i2, inflate);
        if (orderCardActionButtonsView != null) {
            i2 = c8h0.bottom_sections;
            BottomSectionsView bottomSectionsView = (BottomSectionsView) cma1.O(i2, inflate);
            if (bottomSectionsView != null) {
                i2 = c8h0.circle_buttons;
                CircleButtonsView circleButtonsView = (CircleButtonsView) cma1.O(i2, inflate);
                if (circleButtonsView != null) {
                    i2 = c8h0.content;
                    GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i2, inflate);
                    if (goLinearLayout != null) {
                        OrderCardShimmeringView orderCardShimmeringView = (OrderCardShimmeringView) inflate;
                        i2 = c8h0.header;
                        OrderCardHeaderView orderCardHeaderView = (OrderCardHeaderView) cma1.O(i2, inflate);
                        if (orderCardHeaderView != null) {
                            i2 = c8h0.rating_bar;
                            RatingBarComponent ratingBarComponent = (RatingBarComponent) cma1.O(i2, inflate);
                            if (ratingBarComponent != null && (O = cma1.O((i2 = c8h0.skeleton_container), inflate)) != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) O;
                                int i3 = c8h0.subtitle_guide;
                                if (((Guideline) cma1.O(i3, O)) != null) {
                                    i3 = c8h0.title_guide;
                                    if (((Guideline) cma1.O(i3, O)) != null) {
                                        l7n l7nVar = new l7n(constraintLayout, constraintLayout);
                                        int i4 = c8h0.skeleton_redesign_container;
                                        View O2 = cma1.O(i4, inflate);
                                        if (O2 != null) {
                                            int i5 = c8h0.skeleton_1;
                                            th = null;
                                            ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i5, O2);
                                            if (shimmeringBar != null) {
                                                i5 = c8h0.skeleton_2;
                                                ShimmeringBar shimmeringBar2 = (ShimmeringBar) cma1.O(i5, O2);
                                                if (shimmeringBar2 != null) {
                                                    GoLinearLayout goLinearLayout2 = (GoLinearLayout) O2;
                                                    ho4 ho4Var = new ho4(goLinearLayout2, shimmeringBar, shimmeringBar2, 10);
                                                    int i6 = c8h0.walking_info;
                                                    WalkingInfoView walkingInfoView = (WalkingInfoView) cma1.O(i6, inflate);
                                                    if (walkingInfoView != null) {
                                                        this.binding = new bm70(orderCardShimmeringView, orderCardActionButtonsView, bottomSectionsView, circleButtonsView, goLinearLayout, orderCardHeaderView, ratingBarComponent, l7nVar, ho4Var, walkingInfoView);
                                                        this.alpha = 1.0f;
                                                        this.alphaInt = 255;
                                                        this.shadowLayerBounds = new RectF();
                                                        this.card = orderCardShimmeringView;
                                                        this.content = goLinearLayout;
                                                        this.skeleton = constraintLayout;
                                                        this.skeletonRedesign = goLinearLayout2;
                                                        this.header = orderCardHeaderView;
                                                        this.actionButtons = orderCardActionButtonsView;
                                                        this.circleButtons = circleButtonsView;
                                                        this.bottomSections = bottomSectionsView;
                                                        this.walkingInfo = walkingInfoView;
                                                        this.ratingBar = ratingBarComponent;
                                                        orderCardShimmeringView.setShimmering(false);
                                                        orderCardShimmeringView.setClipToOutline(true);
                                                        return;
                                                    }
                                                    i2 = i6;
                                                }
                                            }
                                            ny61.t("Missing required view with ID: ".concat(O2.getResources().getResourceName(i5)));
                                            throw null;
                                        }
                                        th = null;
                                        i2 = i4;
                                        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                                        throw th;
                                    }
                                }
                                ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i3)));
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        th = null;
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw th;
    }

    public static /* synthetic */ void init$default(OrderCardView orderCardView, wn70 wn70Var, tse tseVar, pav pavVar, t501 t501Var, hic hicVar, int i, Object obj) {
        if ((i & 16) != 0) {
            hicVar = null;
        }
        orderCardView.init(wn70Var, tseVar, pavVar, t501Var, hicVar);
    }

    private final void setCardStyle(wn70 style) {
        this.style = style;
        this.cornerRadius = style.y(getContext());
        this.card.init$card(style);
        OrderCardShimmeringView orderCardShimmeringView = this.card;
        orderCardShimmeringView.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(this.cornerRadius));
        orderCardShimmeringView.setClipToOutline(true);
        this.header.setStyle(style);
        this.actionButtons.setStyle(tje.u(style.s(), getContext()), tje.u(style.A(), getContext()), tje.u(style.G(), getContext()), this.cornerRadius, style.C(getContext()), style.h(getContext()), style.x(getContext()), style.i(getContext()));
        this.ratingBar.setColor(style.w(getContext()));
        this.ratingBar.setSelectedColor(style.B(getContext()));
        int n = style.n(getContext());
        ((ShimmeringBar) this.binding.b.b).setCenterColor(n);
        ((ShimmeringBar) this.binding.b.d).setCenterColor(n);
        this.shadowRadius = style.j(getContext());
        this.shadowDy = style.b(getContext());
        this.shadowPaint = style.F(getContext());
        updateShadowLayerBounds(getWidth(), getHeight());
        setWillNotDraw(this.shadowPaint == null);
    }

    private final void setRatingState(g401 uiState) {
        if (jl40.l(uiState, this.lastRatingUiState)) {
            return;
        }
        this.lastRatingUiState = uiState;
        this.ratingBar.setVisibility(uiState != null ? 0 : 8);
        if ((uiState != null ? uiState.d : null) == null || uiState.c == null) {
            this.ratingBar.setDefaultStars();
            wn70 wn70Var = this.style;
            if (wn70Var != null) {
                this.ratingBar.setColor(wn70Var.w(getContext()));
            }
            wn70 wn70Var2 = this.style;
            if (wn70Var2 != null) {
                this.ratingBar.setSelectedColor(wn70Var2.B(getContext()));
            }
        } else {
            e501 e501Var = uiState.b;
            if (e501Var != null) {
                RatingBarComponent ratingBarComponent = this.ratingBar;
                wn70 wn70Var3 = this.style;
                if (wn70Var3 == null) {
                    wn70Var3 = tn70.a;
                }
                ratingBarComponent.initWithLottieAnimation(s8o.m(prb1.b(e501Var, wn70Var3), getContext()));
            }
            this.ratingBar.setStarsDrawable(uiState.c, uiState.d);
            this.ratingBar.setSelectedStarsBackground(uiState.e);
            this.ratingBar.setAnimationType(RatingBarComponent.AnimationType.ALL_SELECTED);
        }
        this.ratingBar.setRating(uiState != null ? uiState.a : 0);
    }

    private final void setReadyStateData(yn70 data) {
        this.header.setState(data.a);
        this.walkingInfo.setState(data.b);
        this.actionButtons.setState(data.d);
        this.circleButtons.setState(data.e);
        this.bottomSections.setState(data.f);
        setRatingState(data.g);
    }

    private final void setShimmeringState(boolean isShimmeringEnabled) {
        if (isShimmeringEnabled) {
            this.card.restartShimmering();
        }
        this.card.setShimmering(isShimmeringEnabled);
        this.card.setDisableTouchEvents(isShimmeringEnabled);
    }

    private final void setUiActionInteractor(final t501 uiActionInteractor) {
        final int i = 0;
        this.header.setOnClickListeners(new sls() { // from class: ao70
            @Override // defpackage.sls
            public final Object invoke() {
                zy11 uiActionInteractor$lambda$0$0;
                zy11 uiActionInteractor$lambda$0$2;
                zy11 uiActionInteractor$lambda$0$3;
                zy11 uiActionInteractor$lambda$0$4;
                zy11 uiActionInteractor$lambda$0$5;
                int i2 = i;
                t501 t501Var = uiActionInteractor;
                switch (i2) {
                    case 0:
                        uiActionInteractor$lambda$0$0 = OrderCardView.setUiActionInteractor$lambda$0$0(t501Var);
                        return uiActionInteractor$lambda$0$0;
                    case 1:
                        uiActionInteractor$lambda$0$2 = OrderCardView.setUiActionInteractor$lambda$0$2(t501Var);
                        return uiActionInteractor$lambda$0$2;
                    case 2:
                        uiActionInteractor$lambda$0$3 = OrderCardView.setUiActionInteractor$lambda$0$3(t501Var);
                        return uiActionInteractor$lambda$0$3;
                    case 3:
                        uiActionInteractor$lambda$0$4 = OrderCardView.setUiActionInteractor$lambda$0$4(t501Var);
                        return uiActionInteractor$lambda$0$4;
                    default:
                        uiActionInteractor$lambda$0$5 = OrderCardView.setUiActionInteractor$lambda$0$5(t501Var);
                        return uiActionInteractor$lambda$0$5;
                }
            }
        }, new bm50(7, uiActionInteractor, this));
        final int i2 = 1;
        final int i3 = 2;
        this.actionButtons.setOnButtonClickListener(new sls() { // from class: ao70
            @Override // defpackage.sls
            public final Object invoke() {
                zy11 uiActionInteractor$lambda$0$0;
                zy11 uiActionInteractor$lambda$0$2;
                zy11 uiActionInteractor$lambda$0$3;
                zy11 uiActionInteractor$lambda$0$4;
                zy11 uiActionInteractor$lambda$0$5;
                int i22 = i2;
                t501 t501Var = uiActionInteractor;
                switch (i22) {
                    case 0:
                        uiActionInteractor$lambda$0$0 = OrderCardView.setUiActionInteractor$lambda$0$0(t501Var);
                        return uiActionInteractor$lambda$0$0;
                    case 1:
                        uiActionInteractor$lambda$0$2 = OrderCardView.setUiActionInteractor$lambda$0$2(t501Var);
                        return uiActionInteractor$lambda$0$2;
                    case 2:
                        uiActionInteractor$lambda$0$3 = OrderCardView.setUiActionInteractor$lambda$0$3(t501Var);
                        return uiActionInteractor$lambda$0$3;
                    case 3:
                        uiActionInteractor$lambda$0$4 = OrderCardView.setUiActionInteractor$lambda$0$4(t501Var);
                        return uiActionInteractor$lambda$0$4;
                    default:
                        uiActionInteractor$lambda$0$5 = OrderCardView.setUiActionInteractor$lambda$0$5(t501Var);
                        return uiActionInteractor$lambda$0$5;
                }
            }
        }, new sls() { // from class: ao70
            @Override // defpackage.sls
            public final Object invoke() {
                zy11 uiActionInteractor$lambda$0$0;
                zy11 uiActionInteractor$lambda$0$2;
                zy11 uiActionInteractor$lambda$0$3;
                zy11 uiActionInteractor$lambda$0$4;
                zy11 uiActionInteractor$lambda$0$5;
                int i22 = i3;
                t501 t501Var = uiActionInteractor;
                switch (i22) {
                    case 0:
                        uiActionInteractor$lambda$0$0 = OrderCardView.setUiActionInteractor$lambda$0$0(t501Var);
                        return uiActionInteractor$lambda$0$0;
                    case 1:
                        uiActionInteractor$lambda$0$2 = OrderCardView.setUiActionInteractor$lambda$0$2(t501Var);
                        return uiActionInteractor$lambda$0$2;
                    case 2:
                        uiActionInteractor$lambda$0$3 = OrderCardView.setUiActionInteractor$lambda$0$3(t501Var);
                        return uiActionInteractor$lambda$0$3;
                    case 3:
                        uiActionInteractor$lambda$0$4 = OrderCardView.setUiActionInteractor$lambda$0$4(t501Var);
                        return uiActionInteractor$lambda$0$4;
                    default:
                        uiActionInteractor$lambda$0$5 = OrderCardView.setUiActionInteractor$lambda$0$5(t501Var);
                        return uiActionInteractor$lambda$0$5;
                }
            }
        });
        final int i4 = 3;
        c.z(new sls() { // from class: ao70
            @Override // defpackage.sls
            public final Object invoke() {
                zy11 uiActionInteractor$lambda$0$0;
                zy11 uiActionInteractor$lambda$0$2;
                zy11 uiActionInteractor$lambda$0$3;
                zy11 uiActionInteractor$lambda$0$4;
                zy11 uiActionInteractor$lambda$0$5;
                int i22 = i4;
                t501 t501Var = uiActionInteractor;
                switch (i22) {
                    case 0:
                        uiActionInteractor$lambda$0$0 = OrderCardView.setUiActionInteractor$lambda$0$0(t501Var);
                        return uiActionInteractor$lambda$0$0;
                    case 1:
                        uiActionInteractor$lambda$0$2 = OrderCardView.setUiActionInteractor$lambda$0$2(t501Var);
                        return uiActionInteractor$lambda$0$2;
                    case 2:
                        uiActionInteractor$lambda$0$3 = OrderCardView.setUiActionInteractor$lambda$0$3(t501Var);
                        return uiActionInteractor$lambda$0$3;
                    case 3:
                        uiActionInteractor$lambda$0$4 = OrderCardView.setUiActionInteractor$lambda$0$4(t501Var);
                        return uiActionInteractor$lambda$0$4;
                    default:
                        uiActionInteractor$lambda$0$5 = OrderCardView.setUiActionInteractor$lambda$0$5(t501Var);
                        return uiActionInteractor$lambda$0$5;
                }
            }
        }, this.walkingInfo);
        final int i5 = 4;
        this.walkingInfo.setOnCancelButtonClickListener(new sls() { // from class: ao70
            @Override // defpackage.sls
            public final Object invoke() {
                zy11 uiActionInteractor$lambda$0$0;
                zy11 uiActionInteractor$lambda$0$2;
                zy11 uiActionInteractor$lambda$0$3;
                zy11 uiActionInteractor$lambda$0$4;
                zy11 uiActionInteractor$lambda$0$5;
                int i22 = i5;
                t501 t501Var = uiActionInteractor;
                switch (i22) {
                    case 0:
                        uiActionInteractor$lambda$0$0 = OrderCardView.setUiActionInteractor$lambda$0$0(t501Var);
                        return uiActionInteractor$lambda$0$0;
                    case 1:
                        uiActionInteractor$lambda$0$2 = OrderCardView.setUiActionInteractor$lambda$0$2(t501Var);
                        return uiActionInteractor$lambda$0$2;
                    case 2:
                        uiActionInteractor$lambda$0$3 = OrderCardView.setUiActionInteractor$lambda$0$3(t501Var);
                        return uiActionInteractor$lambda$0$3;
                    case 3:
                        uiActionInteractor$lambda$0$4 = OrderCardView.setUiActionInteractor$lambda$0$4(t501Var);
                        return uiActionInteractor$lambda$0$4;
                    default:
                        uiActionInteractor$lambda$0$5 = OrderCardView.setUiActionInteractor$lambda$0$5(t501Var);
                        return uiActionInteractor$lambda$0$5;
                }
            }
        });
        final int i6 = 0;
        this.circleButtons.setClickListener(new tls() { // from class: bo70
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 uiActionInteractor$lambda$0$6;
                zy11 uiActionInteractor$lambda$0$7;
                int i7 = i6;
                t501 t501Var = uiActionInteractor;
                switch (i7) {
                    case 0:
                        uiActionInteractor$lambda$0$6 = OrderCardView.setUiActionInteractor$lambda$0$6(t501Var, (ActionType) obj);
                        return uiActionInteractor$lambda$0$6;
                    default:
                        uiActionInteractor$lambda$0$7 = OrderCardView.setUiActionInteractor$lambda$0$7(t501Var, (ke6) obj);
                        return uiActionInteractor$lambda$0$7;
                }
            }
        });
        final int i7 = 1;
        this.bottomSections.setClickListener(new tls() { // from class: bo70
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 uiActionInteractor$lambda$0$6;
                zy11 uiActionInteractor$lambda$0$7;
                int i72 = i7;
                t501 t501Var = uiActionInteractor;
                switch (i72) {
                    case 0:
                        uiActionInteractor$lambda$0$6 = OrderCardView.setUiActionInteractor$lambda$0$6(t501Var, (ActionType) obj);
                        return uiActionInteractor$lambda$0$6;
                    default:
                        uiActionInteractor$lambda$0$7 = OrderCardView.setUiActionInteractor$lambda$0$7(t501Var, (ke6) obj);
                        return uiActionInteractor$lambda$0$7;
                }
            }
        });
        this.ratingBar.addOnRatingBarChangeListener(new qvq(i7, this, uiActionInteractor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setUiActionInteractor$lambda$0$0(t501 t501Var) {
        t501Var.b(m501.b);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setUiActionInteractor$lambda$0$1(t501 t501Var, OrderCardView orderCardView) {
        t501Var.b(new n501(orderCardView));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setUiActionInteractor$lambda$0$2(t501 t501Var) {
        t501Var.b(o501.b);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setUiActionInteractor$lambda$0$3(t501 t501Var) {
        t501Var.b(q501.b);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setUiActionInteractor$lambda$0$4(t501 t501Var) {
        t501Var.b(m501.b);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setUiActionInteractor$lambda$0$5(t501 t501Var) {
        t501Var.b(r501.b);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setUiActionInteractor$lambda$0$6(t501 t501Var, ActionType actionType) {
        t501Var.b(new l501(actionType));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setUiActionInteractor$lambda$0$7(t501 t501Var, ke6 ke6Var) {
        t501Var.b(new k501(ke6Var));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUiActionInteractor$lambda$0$8(OrderCardView orderCardView, t501 t501Var, float f, boolean z) {
        if (z) {
            int i = (int) f;
            orderCardView.ratingBar.startSelectionAnimation(i);
            t501Var.b(new p501(i));
        }
    }

    private final void updateShadowLayerBounds(int width, int height) {
        RectF rectF = this.shadowLayerBounds;
        float f = this.shadowRadius;
        float f2 = this.shadowDy;
        rectF.set(-f, f2 - f, width + f, height + f + f2);
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        if (themeType.c()) {
            this.shadowPaint = null;
        }
        wn70 wn70Var = this.style;
        if (wn70Var != null) {
            setCardStyle(wn70Var);
        }
    }

    @Override // android.view.View
    public float getAlpha() {
        return this.shadowPaint != null ? this.alpha : super.getAlpha();
    }

    public final OrderCardShimmeringView getCard() {
        return this.card;
    }

    public final GoLinearLayout getContent() {
        return this.content;
    }

    public final ListItemComponent header() {
        return this.header.getHeader();
    }

    public final void init(wn70 style, tse scope, pav imageLoader, t501 uiActionInteractor, hic colorizedCarIconFactory) {
        this.circleButtons.init(scope, imageLoader);
        this.header.init(style, imageLoader, colorizedCarIconFactory);
        this.actionButtons.init(style, imageLoader);
        this.bottomSections.init(imageLoader);
        setCardStyle(style);
        setUiActionInteractor(uiActionInteractor);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint = this.shadowPaint;
        if (paint != null) {
            int saveLayerAlpha = canvas.saveLayerAlpha(this.shadowLayerBounds, this.alphaInt);
            float width = getWidth();
            float height = getHeight();
            int i = this.cornerRadius;
            float f = i;
            float f2 = i;
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, width, height, f, f2, paint);
            canvas2.restoreToCount(saveLayerAlpha);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        updateShadowLayerBounds(w, h);
    }

    @Override // android.view.View
    public void setAlpha(float alpha) {
        if (this.shadowPaint == null) {
            super.setAlpha(alpha);
            return;
        }
        float c = y6i0.c(alpha, 0.0f, 1.0f);
        if (this.alpha == c) {
            return;
        }
        this.alpha = c;
        this.alphaInt = y6i0.d(m810.b(255.0f * c), 0, 255);
        this.card.setAlpha(c);
        invalidate();
    }

    public final void setColors(int titleColor, int backgroundColor, int carPlateBackgroundColor, int carPlateTextColor, int titleShimmerColor, int outlineIconBackgroundColor, int secondaryButtonBackgroundColor, int secondaryButtonTintColor, int ratingStarColor) {
        CarIndexComponent carIndexPlate = this.header.getCarIndexPlate();
        if (carIndexPlate != null) {
            carIndexPlate.setColors(carPlateTextColor, carPlateBackgroundColor);
        }
        this.content.setBackgroundColor(backgroundColor);
        this.header.setCardStyleTitleColor(titleColor);
        header().setSubtitleTextColor(titleColor);
        this.header.updateProgressAnimationColor(titleShimmerColor);
        OrderCardIconStackView orderCardIconStackView = (OrderCardIconStackView) this.header.getHeader().getTrailViewAs(OrderCardIconStackView.class);
        if (orderCardIconStackView != null) {
            orderCardIconStackView.setOutlineColor(outlineIconBackgroundColor);
        }
        this.actionButtons.setColors(secondaryButtonBackgroundColor, secondaryButtonTintColor);
        g401 g401Var = this.lastRatingUiState;
        if ((g401Var != null ? g401Var.c : null) != null) {
            if ((g401Var != null ? g401Var.d : null) != null) {
                return;
            }
        }
        this.ratingBar.setColor(ratingStarColor);
    }

    public final void setState(zn70 state) {
        wn70 wn70Var;
        wn70 wn70Var2;
        boolean z = state instanceof xn70;
        this.skeleton.setVisibility((!z || ((wn70Var2 = this.style) != null && wn70Var2.v())) ? 8 : 0);
        this.skeletonRedesign.setVisibility((z && (wn70Var = this.style) != null && wn70Var.v()) ? 0 : 8);
        boolean z2 = state instanceof yn70;
        this.content.setVisibility(z2 ? 0 : 8);
        if (!z) {
            if (!z2) {
                w511.b();
                return;
            }
            setReadyStateData((yn70) state);
        }
        setShimmeringState(z2 && ((yn70) state).h);
    }

    public OrderCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OrderCardView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ OrderCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
