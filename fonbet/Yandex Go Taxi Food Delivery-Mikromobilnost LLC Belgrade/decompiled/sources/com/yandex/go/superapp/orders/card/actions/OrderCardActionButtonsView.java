package com.yandex.go.superapp.orders.card.actions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.c8h0;
import defpackage.cma1;
import defpackage.ijs;
import defpackage.m301;
import defpackage.mkh0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qje;
import defpackage.sls;
import defpackage.tje;
import defpackage.wn70;
import defpackage.xl70;
import defpackage.xng0;
import defpackage.yl70;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J]\u0010\u001c\u001a\u00020\n2\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J)\u0010%\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\"¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020\n2\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u00103R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u00103R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u00103R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u00103R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u00104¨\u00065"}, d2 = {"Lcom/yandex/go/superapp/orders/card/actions/OrderCardActionButtonsView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateButtonsStyle", "()V", "Lwn70;", "style", "Lpav;", "imageLoader", "init", "(Lwn70;Lpav;)V", "containerPadding", "height", "spacing", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "primaryButtonBackgroundColor", "primaryButtonTextColor", "secondaryButtonBackgroundColor", "secondaryButtonTextColor", "setStyle", "(IIIFIIII)V", "Lyl70;", ClidProvider.STATE, "setState", "(Lyl70;)V", "Lkotlin/Function0;", "onPrimaryButtonCallback", "onSecondaryButtonCallback", "setOnButtonClickListener", "(Lsls;Lsls;)V", "setColors", "(II)V", "Lxl70;", "binding", "Lxl70;", "Lcom/yandex/go/superapp/orders/card/actions/TrackingCardButtonView;", "primaryButton", "Lcom/yandex/go/superapp/orders/card/actions/TrackingCardButtonView;", "secondaryButton", "Landroid/view/View;", "spacer", "Landroid/view/View;", CA20Status.STATUS_USER_I, "F", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderCardActionButtonsView extends GoLinearLayout {
    private final xl70 binding;
    private float cornerRadius;
    private final TrackingCardButtonView primaryButton;
    private int primaryButtonBackgroundColor;
    private int primaryButtonTextColor;
    private final TrackingCardButtonView secondaryButton;
    private int secondaryButtonBackgroundColor;
    private int secondaryButtonTextColor;
    private final View spacer;

    public OrderCardActionButtonsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        View O;
        LayoutInflater.from(context).inflate(mkh0.order_card_action_buttons, this);
        int i2 = c8h0.primary_button;
        TrackingCardButtonView trackingCardButtonView = (TrackingCardButtonView) cma1.O(i2, this);
        if (trackingCardButtonView != null) {
            i2 = c8h0.secondary_button;
            TrackingCardButtonView trackingCardButtonView2 = (TrackingCardButtonView) cma1.O(i2, this);
            if (trackingCardButtonView2 != null && (O = cma1.O((i2 = c8h0.spacer), this)) != null) {
                this.binding = new xl70(this, trackingCardButtonView, trackingCardButtonView2, O);
                this.primaryButton = trackingCardButtonView;
                this.secondaryButton = trackingCardButtonView2;
                this.spacer = O;
                this.primaryButtonBackgroundColor = qje.t(xng0.controlMain, getContext());
                this.primaryButtonTextColor = qje.t(xng0.textOnControl, getContext());
                this.secondaryButtonBackgroundColor = qje.t(xng0.controlMinor, getContext());
                this.secondaryButtonTextColor = qje.t(xng0.textOnControlMinor, getContext());
                this.cornerRadius = tje.w(16, getContext());
                setOrientation(0);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void updateButtonsStyle() {
        this.primaryButton.setRoundedBackground(this.primaryButtonBackgroundColor, this.cornerRadius);
        this.primaryButton.setTitleTextColor(this.primaryButtonTextColor);
        this.primaryButton.setSubtitleTextColor(this.primaryButtonTextColor);
        this.secondaryButton.setRoundedBackground(this.secondaryButtonBackgroundColor, this.cornerRadius);
        this.secondaryButton.setTitleTextColor(this.secondaryButtonTextColor);
        this.secondaryButton.setSubtitleTextColor(this.secondaryButtonTextColor);
    }

    public final void init(wn70 style, pav imageLoader) {
        this.primaryButton.init(style, imageLoader);
        this.secondaryButton.init(style, imageLoader);
    }

    public final void setColors(int secondaryButtonBackgroundColor, int secondaryButtonTextColor) {
        this.secondaryButtonBackgroundColor = secondaryButtonBackgroundColor;
        this.secondaryButtonTextColor = secondaryButtonTextColor;
        updateButtonsStyle();
    }

    public final void setOnButtonClickListener(sls onPrimaryButtonCallback, sls onSecondaryButtonCallback) {
        this.primaryButton.setDebounceClickListener(new ijs(17, onPrimaryButtonCallback));
        this.secondaryButton.setDebounceClickListener(new ijs(18, onSecondaryButtonCallback));
    }

    public final void setState(yl70 state) {
        setVisibility(state != null ? 0 : 8);
        if (state == null) {
            return;
        }
        m301 m301Var = state.b;
        m301 m301Var2 = state.a;
        this.spacer.setVisibility((m301Var2 == null || m301Var == null) ? false : true ? 0 : 8);
        this.primaryButton.render(m301Var2);
        this.secondaryButton.render(m301Var);
    }

    public final void setStyle(int containerPadding, int height, int spacing, float cornerRadius, int primaryButtonBackgroundColor, int primaryButtonTextColor, int secondaryButtonBackgroundColor, int secondaryButtonTextColor) {
        setPadding(containerPadding, getPaddingTop(), containerPadding, containerPadding);
        c.E(spacing, this.spacer);
        c.C(height, this.primaryButton);
        c.C(height, this.secondaryButton);
        this.cornerRadius = cornerRadius;
        this.primaryButtonBackgroundColor = primaryButtonBackgroundColor;
        this.primaryButtonTextColor = primaryButtonTextColor;
        this.secondaryButtonBackgroundColor = secondaryButtonBackgroundColor;
        this.secondaryButtonTextColor = secondaryButtonTextColor;
        updateButtonsStyle();
    }

    public OrderCardActionButtonsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OrderCardActionButtonsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ OrderCardActionButtonsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
