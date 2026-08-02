package com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.tips_selector;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import defpackage.bpk0;
import defpackage.bts0;
import defpackage.dpk0;
import defpackage.grs0;
import defpackage.jkz0;
import defpackage.tje;
import defpackage.tls;
import defpackage.wug0;
import defpackage.xss0;
import defpackage.yss0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000f0\u001b¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/feedback/tips_selector/RideCardTipsSelectorView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "", "defStyleAttr", "Lbts0;", "slotItemViewFactory", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILbts0;)V", "", "Lbpk0;", "elements", "Lzy11;", "updateTips", "(Ljava/util/List;)V", "Ljkz0;", "Lfpk0;", "listener", "setTipsToggleListener", "(Ljkz0;)V", "resetTipsToggleListener", "()V", "Lxss0;", "uiState", "Lkotlin/Function1;", "Lnqs0;", "actionHandler", "updatePreferredTipsSubscription", "(Lxss0;Ltls;)V", "bottomRecyclerPaddingWhenSubscriptionIsVisible", CA20Status.STATUS_USER_I, "bottomRecyclerPaddingWhenSubscriptionIsInvisible", "Lcom/yandex/go/taxi/order/details/v2/ui/view/item/feedback/tips_selector/TipsSelectorView;", "tipsSelectorView", "Lcom/yandex/go/taxi/order/details/v2/ui/view/item/feedback/tips_selector/TipsSelectorView;", "Lyss0;", "preferredTipsSubscription", "Lyss0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardTipsSelectorView extends GoLinearLayout {
    public static final int $stable = 8;
    private final int bottomRecyclerPaddingWhenSubscriptionIsInvisible;
    private final int bottomRecyclerPaddingWhenSubscriptionIsVisible;
    private final yss0 preferredTipsSubscription;
    private final TipsSelectorView tipsSelectorView;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RideCardTipsSelectorView(Context context, AttributeSet attributeSet, int i, bts0 bts0Var) {
        super(context, attributeSet, i, r4, 8, null);
        int i2 = 0;
        this.bottomRecyclerPaddingWhenSubscriptionIsVisible = tje.r(wug0.tips_selector_with_subscription_bottom_recycler_padding, getContext());
        this.bottomRecyclerPaddingWhenSubscriptionIsInvisible = tje.r(wug0.tips_selector_bottom_recycler_padding, getContext());
        TipsSelectorView tipsSelectorView = new TipsSelectorView(context, attributeSet, i);
        this.tipsSelectorView = tipsSelectorView;
        SlotItemViewComponent slotItemViewComponent = new SlotItemViewComponent(context, null, i2, ((grs0) bts0Var).a, 6, null);
        preferredTipsSubscription$lambda$0(slotItemViewComponent);
        this.preferredTipsSubscription = slotItemViewComponent;
        setOrientation(1);
        addView(tipsSelectorView);
        addView(slotItemViewComponent.asView());
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

    public final void updatePreferredTipsSubscription(xss0 uiState, tls actionHandler) {
        yss0 yss0Var = this.preferredTipsSubscription;
        if (uiState == null) {
            yss0Var.asView().setVisibility(8);
            this.tipsSelectorView.updateBottomPadding(this.bottomRecyclerPaddingWhenSubscriptionIsInvisible);
        } else {
            yss0Var.render(uiState, false, new dpk0(0, actionHandler));
            this.preferredTipsSubscription.asView().setVisibility(0);
            this.tipsSelectorView.updateBottomPadding(this.bottomRecyclerPaddingWhenSubscriptionIsVisible);
        }
    }

    public final void updateTips(List<bpk0> elements) {
        this.tipsSelectorView.updateTips(elements);
    }

    public RideCardTipsSelectorView(Context context, AttributeSet attributeSet, bts0 bts0Var) {
        this(context, attributeSet, 0, bts0Var, 4, null);
    }

    public RideCardTipsSelectorView(Context context, bts0 bts0Var) {
        this(context, null, 0, bts0Var, 6, null);
    }

    public /* synthetic */ RideCardTipsSelectorView(Context context, AttributeSet attributeSet, int i, bts0 bts0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, bts0Var);
    }
}
