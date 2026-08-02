package com.yandex.plus.pay.ui.core.internal.common.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.j73;
import defpackage.r3i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0006*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0006*\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/plus/pay/ui/core/internal/common/views/PaySdkCompoundDrawableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "getDrawableWidth", "(Landroid/content/res/TypedArray;)I", "getDrawableHeight", "", "getKeepAspectRatio", "(Landroid/content/res/TypedArray;)Z", "Lzy11;", "resizeCompoundDrawables", "()V", "drawableRes", "setDrawableEnd", "(I)V", "drawableWidth", CA20Status.STATUS_USER_I, "drawableHeight", "keepAspectRatio", "Z", "pay-sdk-ui-core-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaySdkCompoundDrawableTextView extends AppCompatTextView {
    private int drawableHeight;
    private int drawableWidth;
    private boolean keepAspectRatio;

    public PaySdkCompoundDrawableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r3i0.PaySdkCompoundDrawableTextView, i, 0);
        this.drawableWidth = getDrawableWidth(obtainStyledAttributes);
        this.drawableHeight = getDrawableHeight(obtainStyledAttributes);
        this.keepAspectRatio = getKeepAspectRatio(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        resizeCompoundDrawables();
    }

    private final int getDrawableHeight(TypedArray typedArray) {
        return typedArray.getDimensionPixelSize(r3i0.PaySdkCompoundDrawableTextView_pay_sdk_drawableHeight, 0);
    }

    private final int getDrawableWidth(TypedArray typedArray) {
        return typedArray.getDimensionPixelSize(r3i0.PaySdkCompoundDrawableTextView_pay_sdk_drawableWidth, 0);
    }

    private final boolean getKeepAspectRatio(TypedArray typedArray) {
        return typedArray.getBoolean(r3i0.PaySdkCompoundDrawableTextView_pay_sdk_keepAspectRatio, false);
    }

    private final void resizeCompoundDrawables() {
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        for (Drawable drawable : j73.A(compoundDrawablesRelative)) {
            Rect bounds = drawable.getBounds();
            int width = bounds.width();
            int height = bounds.height();
            int i = this.drawableWidth;
            if (i <= 0) {
                i = width;
            }
            int i2 = this.drawableHeight;
            if (i2 <= 0) {
                i2 = height;
            }
            if (this.keepAspectRatio && height > 0) {
                double d = width / height;
                if (i > i2) {
                    i2 = (int) (i / d);
                } else {
                    i = (int) (i2 * d);
                }
            }
            bounds.right = bounds.left + i;
            bounds.bottom = bounds.top + i2;
            drawable.setBounds(bounds);
        }
        setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    public final void setDrawableEnd(int drawableRes) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, drawableRes, 0);
        resizeCompoundDrawables();
    }

    public PaySdkCompoundDrawableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PaySdkCompoundDrawableTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PaySdkCompoundDrawableTextView(Context context) {
        this(context, null, 0, 6, null);
    }
}
