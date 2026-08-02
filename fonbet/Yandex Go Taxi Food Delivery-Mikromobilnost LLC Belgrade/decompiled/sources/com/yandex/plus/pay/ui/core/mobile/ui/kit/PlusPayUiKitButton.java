package com.yandex.plus.pay.ui.core.mobile.ui.kit;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatButton;
import com.yandex.plus.pay.ui.core.mobile.haptic.HapticType;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.gbd0;
import defpackage.mm91;
import defpackage.msa1;
import defpackage.ovg0;
import defpackage.ph91;
import defpackage.q3i0;
import defpackage.rgd0;
import defpackage.sng0;
import defpackage.t2d0;
import defpackage.vng;
import defpackage.wpg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/yandex/plus/pay/ui/core/mobile/ui/kit/PlusPayUiKitButton;", "Landroidx/appcompat/widget/AppCompatButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Lgbd0;", "designSystem", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;Lgbd0;)V", "Landroid/graphics/drawable/Drawable;", "getBackgroundDrawable", "(Lgbd0;)Landroid/graphics/drawable/Drawable;", "Landroid/content/res/ColorStateList;", "getTextColorStateList", "()Landroid/content/res/ColorStateList;", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "buttonType", CA20Status.STATUS_USER_I, "rippleColor", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "F", "Companion", "rgd0", "pay-sdk-ui-core-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayUiKitButton extends AppCompatButton {

    @Deprecated
    public static final int BUTTON_TYPE_BRAND = 1;

    @Deprecated
    public static final int BUTTON_TYPE_OTHER = 0;

    @Deprecated
    public static final int BUTTON_TYPE_PRIMARY = 2;

    @Deprecated
    public static final int BUTTON_TYPE_SECONDARY = 3;
    private static final rgd0 Companion = new rgd0();

    @Deprecated
    public static final int DEFAULT_BUTTON_TYPE = 0;

    @Deprecated
    public static final int DEFAULT_RIPPLE_COLOR = -1;
    private int buttonType;
    private float cornerRadius;
    private int rippleColor;

    public PlusPayUiKitButton(Context context, AttributeSet attributeSet, gbd0 gbd0Var) {
        super(context, attributeSet);
        this.rippleColor = -1;
        this.cornerRadius = getResources().getDimension(ovg0.pay_sdk_button_corner_radius);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q3i0.PlusPayUiKitButton);
        try {
            this.buttonType = obtainStyledAttributes.getInt(q3i0.PlusPayUiKitButton_pay_sdk_buttonType, this.buttonType);
            this.rippleColor = obtainStyledAttributes.getColor(q3i0.PlusPayUiKitButton_pay_sdk_buttonRippleColor, this.rippleColor);
            this.cornerRadius = obtainStyledAttributes.getDimension(q3i0.PlusPayUiKitButton_pay_sdk_buttonCornerRadius, this.cornerRadius);
            setBackground(getBackgroundDrawable(gbd0Var));
            setTextColor(getTextColorStateList());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final Drawable getBackgroundDrawable(gbd0 designSystem) {
        Drawable a;
        ColorDrawable colorDrawable;
        int i = this.buttonType;
        RippleDrawable rippleDrawable = null;
        if (i == 1) {
            if (designSystem != null) {
                getContext();
                a = t2d0.a();
            }
            a = null;
        } else if (i == 2) {
            if (designSystem != null) {
                colorDrawable = new ColorDrawable(getContext().getColor(wpg0.pay_sdk_semantic_control_btn_primary_bg));
                a = colorDrawable;
            }
            a = null;
        } else if (i != 3) {
            a = getBackground();
        } else {
            if (designSystem != null) {
                colorDrawable = new ColorDrawable(getContext().getColor(wpg0.pay_sdk_semantic_control_btn_secondary_bg));
                a = colorDrawable;
            }
            a = null;
        }
        if (a != null) {
            Drawable o = msa1.o(a, this.cornerRadius);
            int i2 = this.rippleColor;
            float f = this.cornerRadius;
            rippleDrawable = mm91.a(o, i2, f, f, f, f);
        }
        Drawable o2 = msa1.o(new ColorDrawable(vng.p(sng0.pay_sdk_buttonDisabledColor, getContext())), this.cornerRadius);
        int i3 = this.rippleColor;
        float f2 = this.cornerRadius;
        RippleDrawable a2 = mm91.a(o2, i3, f2, f2, f2, f2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, a2);
        stateListDrawable.addState(new int[0], rippleDrawable);
        return stateListDrawable;
    }

    private final ColorStateList getTextColorStateList() {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{vng.p(sng0.pay_sdk_buttonDisabledTextColor, getContext()), getCurrentTextColor()});
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Integer valueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            ph91.c(this, HapticType.CLICK);
        }
        return super.onTouchEvent(event);
    }

    public PlusPayUiKitButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null, 4, null);
    }

    public /* synthetic */ PlusPayUiKitButton(Context context, AttributeSet attributeSet, gbd0 gbd0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? null : gbd0Var);
    }

    public PlusPayUiKitButton(Context context) {
        this(context, null, null, 6, null);
    }
}
