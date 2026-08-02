package com.yandex.plus.pay.ui.core.mobile.ui.kit;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.Property;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import defpackage.i3y;
import defpackage.mxg0;
import defpackage.r0d0;
import defpackage.sng0;
import defpackage.tgd0;
import defpackage.vng;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/yandex/plus/pay/ui/core/mobile/ui/kit/PlusPayUiKitProgressBar;", "Landroid/widget/ProgressBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "areAnimationsEnabled", "()Z", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "getProgress", "()I", "progress", "setProgress", "(I)V", "Landroid/animation/ObjectAnimator;", "animator$delegate", "Li3y;", "getAnimator", "()Landroid/animation/ObjectAnimator;", "animator", "Companion", "tgd0", "pay-sdk-ui-core-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayUiKitProgressBar extends ProgressBar {
    private static final tgd0 Companion = new tgd0();

    @Deprecated
    public static final long ROTATION_DURATION_MILLIS = 1000;

    @Deprecated
    public static final float ROTATION_END_DEGREE = 360.0f;

    @Deprecated
    public static final float ROTATION_START_DEGREE = 0.0f;

    /* renamed from: animator$delegate, reason: from kotlin metadata */
    private final i3y animator;

    public PlusPayUiKitProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.animator = a.a(new r0d0(7, this));
        setIndeterminateTintList(ColorStateList.valueOf(vng.p(sng0.pay_sdk_progressColor, context)));
        setIndeterminateDrawable(vng.t(mxg0.pay_sdk_ic_spinner, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObjectAnimator animator_delegate$lambda$1(PlusPayUiKitProgressBar plusPayUiKitProgressBar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(plusPayUiKitProgressBar, (Property<PlusPayUiKitProgressBar, Float>) ProgressBar.ROTATION, 0.0f, 360.0f);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }

    private final boolean areAnimationsEnabled() {
        return !(Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f);
    }

    private final ObjectAnimator getAnimator() {
        return (ObjectAnimator) this.animator.getValue();
    }

    @Override // android.widget.ProgressBar
    public int getProgress() {
        return isIndeterminate() ? (int) getRotation() : super.getProgress();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isIndeterminate() && areAnimationsEnabled()) {
            getAnimator().start();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        if (getAnimator().isRunning()) {
            getAnimator().cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int progress) {
        if (!isIndeterminate()) {
            super.setProgress(progress);
        } else {
            setRotation(progress);
            getAnimator().setFloatValues(getRotation() + 0.0f, getRotation() + 360.0f);
        }
    }

    public PlusPayUiKitProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PlusPayUiKitProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PlusPayUiKitProgressBar(Context context) {
        this(context, null, 0, 6, null);
    }
}
