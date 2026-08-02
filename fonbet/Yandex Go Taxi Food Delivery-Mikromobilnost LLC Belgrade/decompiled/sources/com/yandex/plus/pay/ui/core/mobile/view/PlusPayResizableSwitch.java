package com.yandex.plus.pay.ui.core.mobile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import defpackage.q3i0;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/plus/pay/ui/core/mobile/view/PlusPayResizableSwitch;", "Landroidx/appcompat/widget/SwitchCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "width", "Lzy11;", "rewriteSwitchWidth", "(I)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "desiredTrackWidth", CA20Status.STATUS_USER_I, "pay-sdk-ui-core-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayResizableSwitch extends SwitchCompat {
    private int desiredTrackWidth;

    public PlusPayResizableSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q3i0.PlusPayResizableSwitchCompat, i, 0);
        this.desiredTrackWidth = (int) obtainStyledAttributes.getDimension(q3i0.PlusPayResizableSwitchCompat_pay_sdk_trackWidth, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private final void rewriteSwitchWidth(int width) {
        try {
            Field declaredField = SwitchCompat.class.getDeclaredField("mSwitchWidth");
            boolean isAccessible = declaredField.isAccessible();
            declaredField.setAccessible(true);
            declaredField.setInt(this, width);
            declaredField.setAccessible(isAccessible);
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int i = this.desiredTrackWidth;
        if (i > 0) {
            int measuredWidth = getMeasuredWidth();
            if (i > measuredWidth) {
                i = measuredWidth;
            }
            rewriteSwitchWidth(i);
        }
    }

    public PlusPayResizableSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PlusPayResizableSwitch(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PlusPayResizableSwitch(Context context) {
        this(context, null, 0, 6, null);
    }
}
