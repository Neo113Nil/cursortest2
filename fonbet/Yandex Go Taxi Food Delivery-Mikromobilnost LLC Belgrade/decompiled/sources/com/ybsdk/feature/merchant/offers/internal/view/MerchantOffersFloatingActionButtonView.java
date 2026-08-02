package com.ybsdk.feature.merchant.offers.internal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.amg0;
import defpackage.kp50;
import defpackage.zo10;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/view/MerchantOffersFloatingActionButtonView;", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newPositionY", "recyclerMeasuredHeight", "Lzy11;", "animateFloatingButton", "(II)V", "startCustomAnimation", "()V", "stopCustomAnimation", "setCurrentScrollPositionY", "onDetachedFromWindow", "lastScrollPositionY", CA20Status.STATUS_USER_I, "", "needSetScrollPositionY", "Z", "getNeedSetScrollPositionY", "()Z", "setNeedSetScrollPositionY", "(Z)V", "Companion", "zo10", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MerchantOffersFloatingActionButtonView extends FloatingActionButton {
    private static final zo10 Companion = new zo10();
    private static final int MINIMUM_SCROLL_DELTA_FOR_FAB_APPEAR_DP = kp50.v(50);

    @Deprecated
    public static final double MINIMUM_VISIBLE_AREA_FOR_FAB_DISAPPEAR = 0.8d;
    private int lastScrollPositionY;
    private boolean needSetScrollPositionY;

    public /* synthetic */ MerchantOffersFloatingActionButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void animateFloatingButton(int newPositionY, int recyclerMeasuredHeight) {
        if (newPositionY > recyclerMeasuredHeight * 0.8d) {
            int i = this.lastScrollPositionY;
            int i2 = newPositionY - i;
            int i3 = MINIMUM_SCROLL_DELTA_FOR_FAB_APPEAR_DP;
            if (i2 < i3) {
                if (newPositionY - i < (-i3)) {
                    startCustomAnimation();
                    return;
                }
                return;
            }
        }
        stopCustomAnimation();
    }

    private final void startCustomAnimation() {
        if (getVisibility() == 0) {
            return;
        }
        setVisibility(0);
        startAnimation(AnimationUtils.loadAnimation(getContext(), amg0.ybsdk_floating_button_appear_bounce_animation));
    }

    private final void stopCustomAnimation() {
        if (getVisibility() == 0) {
            startAnimation(AnimationUtils.loadAnimation(getContext(), amg0.ybsdk_floating_button_disappear_bounce_animation));
            setVisibility(8);
        }
    }

    public final boolean getNeedSetScrollPositionY() {
        return this.needSetScrollPositionY;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animation animation = getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        clearAnimation();
    }

    public final void setCurrentScrollPositionY(int newPositionY, int recyclerMeasuredHeight) {
        animateFloatingButton(newPositionY, recyclerMeasuredHeight);
        if (this.needSetScrollPositionY) {
            this.lastScrollPositionY = newPositionY;
        }
    }

    public final void setNeedSetScrollPositionY(boolean z) {
        this.needSetScrollPositionY = z;
    }

    public MerchantOffersFloatingActionButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public MerchantOffersFloatingActionButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MerchantOffersFloatingActionButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.needSetScrollPositionY = true;
    }
}
