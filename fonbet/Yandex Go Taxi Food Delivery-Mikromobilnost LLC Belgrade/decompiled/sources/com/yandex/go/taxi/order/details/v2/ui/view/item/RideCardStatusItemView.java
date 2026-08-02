package com.yandex.go.taxi.order.details.v2.ui.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bts0;
import defpackage.ei;
import defpackage.evu0;
import defpackage.grs0;
import defpackage.i3y;
import defpackage.kdc;
import defpackage.kqe0;
import defpackage.mqg0;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.s8o;
import defpackage.xng0;
import defpackage.yss0;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0011J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020$8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/RideCardStatusItemView;", "Lru/yandex/taxi/widget/ShimmeringFrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Lbts0;", "slotItemViewFactory", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILbts0;)V", "Lkdc;", "color", "Lzy11;", "setBackgroundColorInternal", "(Lkdc;)V", "setAccessibilityDelegateCompat", "()V", "onAttachedToWindow", "setBackgroundColor", "", "isShimmeringEnabled", "enableShimmering", "(Z)V", "", "contentDescription", "setContentDescription", "(Ljava/lang/String;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lkdc;", "Lyss0;", "slotItem$delegate", "Li3y;", "getSlotItem", "()Lyss0;", "slotItem", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardStatusItemView extends ShimmeringFrameLayout implements nwy0 {
    public static final int $stable = 8;
    private kdc backgroundColor;

    /* renamed from: slotItem$delegate, reason: from kotlin metadata */
    private final i3y slotItem;

    public RideCardStatusItemView(Context context, AttributeSet attributeSet, int i, bts0 bts0Var) {
        super(context, attributeSet, i);
        this.slotItem = a.b(LazyThreadSafetyMode.NONE, new kqe0(16, bts0Var, context, this));
    }

    private final void setAccessibilityDelegateCompat() {
        b.p(this, new ei(17));
    }

    private final void setBackgroundColorInternal(kdc color) {
        getSlotItem().setColor(color);
        this.backgroundColor = color;
        setCenterColor(s8o.m(color, getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yss0 slotItem_delegate$lambda$0(bts0 bts0Var, Context context, RideCardStatusItemView rideCardStatusItemView) {
        SlotItemViewComponent slotItemViewComponent = new SlotItemViewComponent(context, null, 0, ((grs0) bts0Var).a, 6, null);
        slotItem_delegate$lambda$0$0(rideCardStatusItemView, slotItemViewComponent);
        return slotItemViewComponent;
    }

    private static final zy11 slotItem_delegate$lambda$0$0(RideCardStatusItemView rideCardStatusItemView, View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        view.setAccessibilityHeading(true);
        rideCardStatusItemView.addView(view);
        return zy11.a;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        kdc kdcVar = this.backgroundColor;
        setCenterColor(kdcVar != null ? s8o.m(kdcVar, getContext()) : qje.t(xng0.bgMain, getContext()));
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void enableShimmering(boolean isShimmeringEnabled) {
        setShimmering(isShimmeringEnabled);
        if (isShimmeringEnabled) {
            restartShimmering();
        }
    }

    public final yss0 getSlotItem() {
        return (yss0) this.slotItem.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setColors(qje.t(xng0.bgMain, getContext()), getContext().getColor(mqg0.transparent));
        setAccessibilityDelegateCompat();
    }

    public final void setBackgroundColor(kdc color) {
        setBackgroundColorInternal(color);
    }

    public final void setContentDescription(String contentDescription) {
        if (contentDescription == null || evu0.J(contentDescription)) {
            getSlotItem().asView().setImportantForAccessibility(1);
            setContentDescription((CharSequence) null);
        } else {
            getSlotItem().asView().setImportantForAccessibility(4);
            setContentDescription((CharSequence) contentDescription);
        }
    }

    public RideCardStatusItemView(Context context, AttributeSet attributeSet, bts0 bts0Var) {
        this(context, attributeSet, 0, bts0Var, 4, null);
    }

    public RideCardStatusItemView(Context context, bts0 bts0Var) {
        this(context, null, 0, bts0Var, 6, null);
    }

    public /* synthetic */ RideCardStatusItemView(Context context, AttributeSet attributeSet, int i, bts0 bts0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, bts0Var);
    }
}
