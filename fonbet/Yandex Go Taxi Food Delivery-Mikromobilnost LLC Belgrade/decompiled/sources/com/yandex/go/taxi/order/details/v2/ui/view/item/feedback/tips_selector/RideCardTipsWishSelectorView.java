package com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.tips_selector;

import android.content.Context;
import android.graphics.Outline;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import defpackage.bpk0;
import defpackage.bts0;
import defpackage.dg4;
import defpackage.dpk0;
import defpackage.evu0;
import defpackage.grs0;
import defpackage.hg4;
import defpackage.hpk0;
import defpackage.i3y;
import defpackage.ipk0;
import defpackage.jkz0;
import defpackage.jpk0;
import defpackage.kpk0;
import defpackage.n4h0;
import defpackage.o8k0;
import defpackage.s8o;
import defpackage.tje;
import defpackage.tls;
import defpackage.w511;
import defpackage.wug0;
import defpackage.xss0;
import defpackage.xw31;
import defpackage.yss0;
import defpackage.zy11;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b \u0010\u001fJ\u001b\u0010$\u001a\u00020\u001d2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J+\u0010/\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010*2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u001d0,¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\u001d2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\u001d2\u0006\u00105\u001a\u00020\u0006¢\u0006\u0004\b6\u00107J\u001b\u0010;\u001a\u00020\u001d2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020908¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u001d¢\u0006\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0014\u0010B\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u0014\u0010C\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010@R\u0014\u0010D\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010@R\u0014\u0010E\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010@R\u0014\u0010F\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010@R\u0014\u0010G\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010@R\u0014\u0010H\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010K\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001b\u0010W\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/feedback/tips_selector/RideCardTipsWishSelectorView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "", "defStyleAttr", "Lbts0;", "slotItemViewFactory", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILbts0;)V", "maxLines", "Lru/yandex/taxi/widget/RobotoTextView;", "createTextView", "(I)Lru/yandex/taxi/widget/RobotoTextView;", "textContainer", "Lcom/yandex/go/design/view/GoFrameLayout;", "content", "createTopContainer", "(Lcom/yandex/go/design/view/GoLinearLayout;Lcom/yandex/go/design/view/GoFrameLayout;)Lcom/yandex/go/design/view/GoLinearLayout;", "title", "subtitle", "createTextContainer", "(Lru/yandex/taxi/widget/RobotoTextView;Lru/yandex/taxi/widget/RobotoTextView;)Lcom/yandex/go/design/view/GoLinearLayout;", "Lcom/yandex/go/taxi/order/details/v2/ui/view/item/feedback/tips_selector/TipsWishSelectorView;", "createTipsSelectorView", "()Lcom/yandex/go/taxi/order/details/v2/ui/view/item/feedback/tips_selector/TipsWishSelectorView;", "", "Lzy11;", "updateTitle", "(Ljava/lang/CharSequence;)V", "updateSubtitle", "", "Lbpk0;", "elements", "updateTips", "(Ljava/util/List;)V", "Lhg4;", C0553n3.g, "updateTipsWishCardBackground", "(Lhg4;)V", "Lxss0;", "uiState", "Lkotlin/Function1;", "Lnqs0;", "actionHandler", "updatePreferredTipsSubscription", "(Lxss0;Ltls;)V", "Lkpk0;", "mediaContent", "updateMediaContent", "(Lkpk0;)V", "radius", "updateBackgroundCornerRadius", "(I)V", "Ljkz0;", "Lfpk0;", "listener", "setTipsToggleListener", "(Ljkz0;)V", "resetTipsToggleListener", "()V", "endPadding", CA20Status.STATUS_USER_I, "startPadding", "topPadding", "bottomPadding", "bottomRecyclerPaddingWhenSubscriptionIsVisible", "bottomRecyclerPaddingWhenSubscriptionIsInvisible", "maxContentWidth", "maxContentHeight", "titleTextView", "Lru/yandex/taxi/widget/RobotoTextView;", "subtitleTextView", "tipsSelectorView", "Lcom/yandex/go/taxi/order/details/v2/ui/view/item/feedback/tips_selector/TipsWishSelectorView;", "Lyss0;", "preferredTipsSubscription", "Lyss0;", "mediaContentContainer", "Lcom/yandex/go/design/view/GoFrameLayout;", "Lcom/airbnb/lottie/LottieAnimationView;", "lottieAnimationView$delegate", "Li3y;", "getLottieAnimationView", "()Lcom/airbnb/lottie/LottieAnimationView;", "lottieAnimationView", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardTipsWishSelectorView extends GoLinearLayout {
    public static final int $stable = 8;
    private final int bottomPadding;
    private final int bottomRecyclerPaddingWhenSubscriptionIsInvisible;
    private final int bottomRecyclerPaddingWhenSubscriptionIsVisible;
    private final int endPadding;

    /* renamed from: lottieAnimationView$delegate, reason: from kotlin metadata */
    private final i3y lottieAnimationView;
    private final int maxContentHeight;
    private final int maxContentWidth;
    private final GoFrameLayout mediaContentContainer;
    private final yss0 preferredTipsSubscription;
    private final int startPadding;
    private final RobotoTextView subtitleTextView;
    private final TipsWishSelectorView tipsSelectorView;
    private final RobotoTextView titleTextView;
    private final int topPadding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RideCardTipsWishSelectorView(Context context, AttributeSet attributeSet, int i, bts0 bts0Var) {
        super(context, attributeSet, i, r4, 8, null);
        int i2 = 0;
        this.endPadding = tje.r(wug0.tips_wish_selector_end_padding, getContext());
        this.startPadding = tje.r(wug0.tips_wish_selector_start_padding, getContext());
        this.topPadding = tje.r(wug0.tips_wish_selector_top_padding, getContext());
        this.bottomPadding = tje.r(wug0.tips_wish_selector_bottom_padding, getContext());
        this.bottomRecyclerPaddingWhenSubscriptionIsVisible = tje.r(wug0.tips_selector_with_subscription_bottom_recycler_padding, getContext());
        this.bottomRecyclerPaddingWhenSubscriptionIsInvisible = tje.r(wug0.tips_selector_bottom_recycler_padding, getContext());
        this.maxContentWidth = tje.r(wug0.tips_wish_selector_max_content_width, getContext());
        this.maxContentHeight = tje.r(wug0.tips_wish_selector_max_content_height, getContext());
        RobotoTextView createTextView = createTextView(2);
        this.titleTextView = createTextView;
        RobotoTextView createTextView2 = createTextView(2);
        this.subtitleTextView = createTextView2;
        TipsWishSelectorView createTipsSelectorView = createTipsSelectorView();
        this.tipsSelectorView = createTipsSelectorView;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet2 = null;
        SlotItemViewComponent slotItemViewComponent = new SlotItemViewComponent(context, attributeSet2, i2, ((grs0) bts0Var).a, 6, defaultConstructorMarker);
        preferredTipsSubscription$lambda$0(slotItemViewComponent);
        this.preferredTipsSubscription = slotItemViewComponent;
        GoFrameLayout goFrameLayout = new GoFrameLayout(context, attributeSet2, i2, 0, 14, defaultConstructorMarker);
        goFrameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        goFrameLayout.setScaleX(xw31.n(context) ? -1.0f : 1.0f);
        this.mediaContentContainer = goFrameLayout;
        this.lottieAnimationView = a.a(new o8k0(5, context, this));
        setOrientation(1);
        addView(createTopContainer(createTextContainer(createTextView, createTextView2), goFrameLayout));
        addView(createTipsSelectorView);
        addView(slotItemViewComponent.asView());
    }

    private final GoLinearLayout createTextContainer(RobotoTextView title, RobotoTextView subtitle) {
        GoLinearLayout goLinearLayout = new GoLinearLayout(getContext(), null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        goLinearLayout.setLayoutParams(layoutParams);
        goLinearLayout.setOrientation(1);
        goLinearLayout.setPaddingRelative(this.startPadding, this.topPadding, this.endPadding, this.bottomPadding);
        goLinearLayout.addView(title);
        goLinearLayout.addView(subtitle);
        return goLinearLayout;
    }

    private final RobotoTextView createTextView(int maxLines) {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        robotoTextView.setMaxLines(maxLines);
        robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
        return robotoTextView;
    }

    private final TipsWishSelectorView createTipsSelectorView() {
        TipsWishSelectorView tipsWishSelectorView = new TipsWishSelectorView(getContext(), null, 0, 6, null);
        tipsWishSelectorView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return tipsWishSelectorView;
    }

    private final GoLinearLayout createTopContainer(GoLinearLayout textContainer, GoFrameLayout content) {
        GoLinearLayout goLinearLayout = new GoLinearLayout(getContext(), null, 0, 0, 14, null);
        goLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        goLinearLayout.setOrientation(0);
        goLinearLayout.addView(textContainer);
        goLinearLayout.addView(content);
        return goLinearLayout;
    }

    private final LottieAnimationView getLottieAnimationView() {
        return (LottieAnimationView) this.lottieAnimationView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieAnimationView lottieAnimationView_delegate$lambda$0(Context context, RideCardTipsWishSelectorView rideCardTipsWishSelectorView) {
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setLayoutParams(new LinearLayout.LayoutParams(rideCardTipsWishSelectorView.maxContentWidth, rideCardTipsWishSelectorView.maxContentHeight));
        lottieAnimationView.setRepeatMode(1);
        lottieAnimationView.setRepeatCount(-1);
        return lottieAnimationView;
    }

    private static final zy11 preferredTipsSubscription$lambda$0(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.bottomMargin = c.h(6, view);
        view.setLayoutParams(marginLayoutParams);
        view.setVisibility(8);
        return zy11.a;
    }

    public final void resetTipsToggleListener() {
        this.tipsSelectorView.setButtonToggledListener(null);
    }

    public final void setTipsToggleListener(jkz0 listener) {
        this.tipsSelectorView.setButtonToggledListener(listener);
    }

    public final void updateBackgroundCornerRadius(final int radius) {
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.tips_selector.RideCardTipsWishSelectorView$updateBackgroundCornerRadius$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, RideCardTipsWishSelectorView.this.getWidth(), RideCardTipsWishSelectorView.this.getHeight(), c.h(radius, RideCardTipsWishSelectorView.this));
            }
        });
    }

    public final void updateMediaContent(kpk0 mediaContent) {
        this.mediaContentContainer.removeAllViews();
        if (mediaContent instanceof jpk0) {
            GoFrameLayout goFrameLayout = this.mediaContentContainer;
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(((jpk0) mediaContent).a.getDrawable());
            goFrameLayout.addView(imageView);
            return;
        }
        if (mediaContent instanceof hpk0) {
            this.mediaContentContainer.addView(getLottieAnimationView());
            LottieAnimationView lottieAnimationView = getLottieAnimationView();
            lottieAnimationView.setComposition(((hpk0) mediaContent).a);
            lottieAnimationView.playAnimation();
            return;
        }
        if (!(mediaContent instanceof ipk0)) {
            w511.b();
            return;
        }
        GoFrameLayout goFrameLayout2 = this.mediaContentContainer;
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(n4h0.default_tips_wish_content_image);
        goFrameLayout2.addView(imageView2);
    }

    public final void updatePreferredTipsSubscription(xss0 uiState, tls actionHandler) {
        yss0 yss0Var = this.preferredTipsSubscription;
        if (uiState == null) {
            yss0Var.asView().setVisibility(8);
            this.tipsSelectorView.updateBottomPadding(this.bottomRecyclerPaddingWhenSubscriptionIsInvisible);
        } else {
            yss0Var.render(uiState, false, new dpk0(1, actionHandler));
            this.preferredTipsSubscription.asView().setVisibility(0);
            this.tipsSelectorView.updateBottomPadding(this.bottomRecyclerPaddingWhenSubscriptionIsVisible);
        }
    }

    public final void updateSubtitle(CharSequence subtitle) {
        this.subtitleTextView.setText(subtitle);
        this.subtitleTextView.setVisibility(subtitle == null || evu0.J(subtitle) ? 8 : 0);
    }

    public final void updateTips(List<bpk0> elements) {
        this.tipsSelectorView.setVisibility(!elements.isEmpty() ? 0 : 8);
        if (this.tipsSelectorView.getVisibility() == 0) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), 0);
        } else {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), this.bottomPadding);
        }
        this.tipsSelectorView.updateTips(elements);
    }

    public final void updateTipsWishCardBackground(hg4 background) {
        updateBackground(background);
        dg4 dg4Var = background instanceof dg4 ? (dg4) background : null;
        if (dg4Var == null) {
            return;
        }
        this.tipsSelectorView.updateShadowColor(s8o.m(dg4Var.a, getContext()));
    }

    public final void updateTitle(CharSequence title) {
        this.titleTextView.setText(title);
        this.titleTextView.setVisibility(title == null || evu0.J(title) ? 8 : 0);
    }

    public RideCardTipsWishSelectorView(Context context, AttributeSet attributeSet, bts0 bts0Var) {
        this(context, attributeSet, 0, bts0Var, 4, null);
    }

    public RideCardTipsWishSelectorView(Context context, bts0 bts0Var) {
        this(context, null, 0, bts0Var, 6, null);
    }

    public /* synthetic */ RideCardTipsWishSelectorView(Context context, AttributeSet attributeSet, int i, bts0 bts0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, bts0Var);
    }
}
