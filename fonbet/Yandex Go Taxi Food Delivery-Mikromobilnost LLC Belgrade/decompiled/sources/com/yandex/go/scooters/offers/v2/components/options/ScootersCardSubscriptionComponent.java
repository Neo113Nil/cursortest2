package com.yandex.go.scooters.offers.v2.components.options;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.cxo0;
import defpackage.fcl0;
import defpackage.fxo0;
import defpackage.gxo0;
import defpackage.kc;
import defpackage.l8x;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.pav;
import defpackage.q0h0;
import defpackage.qfh0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.two0;
import defpackage.vng;
import defpackage.x7n0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.xwo0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.SwitchComponent;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0005H\u0014¢\u0006\u0004\b%\u0010$J\u001f\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardSubscriptionComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lzy11;", "onSubscriptionClickListener", "Lkotlin/Function1;", "Lwwo0;", "onShown", "Lpav;", "imageLoader", "Ltse;", "coroutineScope", "", "onSubscriptionToggleChangedListener", "<init>", "(Landroid/content/Context;Lsls;Ltls;Lpav;Ltse;Ltls;)V", "", "imageTag", "updateLeadImage", "(Ljava/lang/String;)V", "Lcxo0;", "badge", "updateBadge", "(Lcxo0;)Z", "Lfxo0;", "toggle", "isSubscriptionToggleEnabled", "updateToggle", "(Lfxo0;Z)Z", "hasBadge", "hasToggle", "updateTrail", "(ZZ)V", "setUnavailable", "()V", "onDetachedFromWindow", "Ltwo0;", "subscription", "setSubscription", "(Ltwo0;Z)V", "Ltls;", "Lpav;", "Ltse;", "Lcom/yandex/go/design/view/GoLinearLayout;", "trailLinearLayout", "Lcom/yandex/go/design/view/GoLinearLayout;", "Lru/yandex/taxi/design/BadgeView;", "badgeView", "Lru/yandex/taxi/design/BadgeView;", "Lru/yandex/taxi/design/SwitchComponent;", "toggleView", "Lru/yandex/taxi/design/SwitchComponent;", "Ll8x;", "leadImageJob", "Ll8x;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersCardSubscriptionComponent extends ListItemComponent {
    public static final int $stable = 8;
    private final BadgeView badgeView;
    private final tse coroutineScope;
    private final pav imageLoader;
    private l8x leadImageJob;
    private final tls onShown;
    private final tls onSubscriptionToggleChangedListener;
    private final SwitchComponent toggleView;
    private final GoLinearLayout trailLinearLayout;

    public ScootersCardSubscriptionComponent(Context context, sls slsVar, tls tlsVar, pav pavVar, tse tseVar, tls tlsVar2) {
        super(context, null, 0, 6, null);
        this.onShown = tlsVar;
        this.imageLoader = pavVar;
        this.coroutineScope = tseVar;
        this.onSubscriptionToggleChangedListener = tlsVar2;
        AttributeSet attributeSet = null;
        int i = 0;
        GoLinearLayout goLinearLayout = new GoLinearLayout(context, attributeSet, i, 0, 14, null);
        goLinearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        goLinearLayout.setOrientation(0);
        goLinearLayout.setGravity(16);
        xw31.F(goLinearLayout, null, null, Integer.valueOf(tje.r(mrg0.go_design_s_space, goLinearLayout.getContext())), null);
        this.trailLinearLayout = goLinearLayout;
        int i2 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        BadgeView badgeView = new BadgeView(context, attributeSet, i, i2, defaultConstructorMarker);
        badgeView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        xw31.I(badgeView, null, Integer.valueOf(tje.u(1, badgeView.getContext())), null, null);
        xw31.I(badgeView, null, null, null, Integer.valueOf(tje.u(2, badgeView.getContext())));
        xw31.F(badgeView, Integer.valueOf(tje.r(mrg0.go_design_s_space, badgeView.getContext())), null, null, null);
        int r = tje.r(mrg0.go_design_s_space, badgeView.getContext());
        xw31.E(badgeView, null, Integer.valueOf(r), null, Integer.valueOf(r));
        badgeView.setBackground(vng.t(q0h0.scooters_badge_bg, badgeView.getContext()));
        badgeView.setTextColor(badgeView.getContext().getColor(mqg0.white));
        badgeView.setTextSize(tje.b0(badgeView.getContext(), 14.0f));
        badgeView.setElevation(tje.x(badgeView.getContext(), 3.0f));
        badgeView.setVisibility(8);
        this.badgeView = badgeView;
        SwitchComponent switchComponent = new SwitchComponent(context, attributeSet, i, i2, defaultConstructorMarker);
        switchComponent.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        switchComponent.setVisibility(8);
        switchComponent.setUncheckedColorAttr(xng0.controlMinor);
        switchComponent.setTrackColorAttr(xng0.controlMain);
        this.toggleView = switchComponent;
        setId(qfh0.scooters_component_option_subscription);
        goLinearLayout.addView(badgeView);
        goLinearLayout.addView(switchComponent);
        setDebounceClickListener(new fcl0(7, slsVar));
        setVisibility(8);
        setBackgroundResource(x7n0.a);
    }

    public static /* synthetic */ void setSubscription$default(ScootersCardSubscriptionComponent scootersCardSubscriptionComponent, two0 two0Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        scootersCardSubscriptionComponent.setSubscription(two0Var, z);
    }

    private final void setUnavailable() {
        l8x l8xVar = this.leadImageJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.leadImageJob = null;
        this.badgeView.setVisibility(8);
        this.toggleView.setVisibility(8);
        this.toggleView.setOnCheckedChangedListener(null);
        clearTrailView();
        clearLeadView();
        setSubtitle((CharSequence) null);
        setVisibility(8);
    }

    private final boolean updateBadge(cxo0 badge) {
        BadgeView badgeView = this.badgeView;
        if (badge == null) {
            badgeView.setVisibility(8);
            return false;
        }
        int i = badge.b;
        badgeView.setText(badge.a);
        this.badgeView.setTintColor(i);
        this.badgeView.setOutlineSpotShadowColor(i);
        this.badgeView.setVisibility(0);
        return true;
    }

    private final void updateLeadImage(String imageTag) {
        l8x l8xVar = this.leadImageJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.leadImageJob = tje.N(this.coroutineScope, null, null, new ScootersCardSubscriptionComponent$updateLeadImage$1(imageTag, this, null), 3);
    }

    private final boolean updateToggle(fxo0 toggle, boolean isSubscriptionToggleEnabled) {
        boolean z = toggle != null;
        this.toggleView.setVisibility(z ? 0 : 8);
        SwitchComponent switchComponent = this.toggleView;
        if (!z) {
            switchComponent.setOnCheckedChangedListener(null);
            return false;
        }
        switchComponent.setOnCheckedChangedListener(null);
        this.toggleView.setChecked(isSubscriptionToggleEnabled);
        this.toggleView.setOnCheckedChangedListener(new kc(2, this.onSubscriptionToggleChangedListener));
        return true;
    }

    private final void updateTrail(boolean hasBadge, boolean hasToggle) {
        ViewGroup.LayoutParams layoutParams = this.badgeView.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMarginEnd((hasBadge && hasToggle) ? tje.r(mrg0.go_design_s_space, getContext()) : 0);
            this.badgeView.setLayoutParams(layoutParams2);
        }
        if (hasBadge || hasToggle) {
            setTrailView(this.trailLinearLayout);
        } else {
            clearTrailView();
        }
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l8x l8xVar = this.leadImageJob;
        if (l8xVar != null) {
            this.leadImageJob = null;
            l8xVar.a(null);
        }
    }

    public final void setSubscription(two0 subscription, boolean isSubscriptionToggleEnabled) {
        xwo0 xwo0Var = subscription instanceof xwo0 ? (xwo0) subscription : null;
        gxo0 gxo0Var = xwo0Var != null ? xwo0Var.a : null;
        if (gxo0Var == null) {
            setUnavailable();
            return;
        }
        setTitle(gxo0Var.c);
        setSubtitle(gxo0Var.d);
        updateLeadImage(gxo0Var.b);
        updateTrail(updateBadge(gxo0Var.e), updateToggle(gxo0Var.f, isSubscriptionToggleEnabled));
        setVisibility(0);
        this.onShown.invoke(gxo0Var.a);
    }
}
