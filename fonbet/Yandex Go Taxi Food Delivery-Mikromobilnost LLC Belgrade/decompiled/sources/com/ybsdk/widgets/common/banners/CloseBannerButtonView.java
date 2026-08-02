package com.ybsdk.widgets.common.banners;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ybsdk.core.utils.ext.view.b;
import defpackage.cma1;
import defpackage.dzh0;
import defpackage.fch0;
import defpackage.j4c;
import defpackage.l461;
import defpackage.m810;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.smg0;
import defpackage.w3i0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/widgets/common/banners/CloseBannerButtonView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lj4c;", ClidProvider.STATE, "Lzy11;", "render", "(Lj4c;)Lzy11;", "Ll461;", "binding", "Ll461;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CloseBannerButtonView extends FrameLayout {
    private final l461 binding;

    public CloseBannerButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_promo_banner_close_button_layout, this);
        int i2 = fch0.closeBannerButtonBackground;
        ImageView imageView = (ImageView) cma1.O(i2, this);
        if (imageView != null) {
            i2 = fch0.closeBannerButtonIcon;
            ImageView imageView2 = (ImageView) cma1.O(i2, this);
            if (imageView2 != null) {
                this.binding = new l461(this, imageView, imageView2);
                setContentDescription(getResources().getString(dzh0.ybsdk_common_accessibility_close_title));
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, w3i0.YbSdkCloseBannerButtonView, i, i);
                int b = m810.b(b.v(obtainStyledAttributes, w3i0.YbSdkCloseBannerButtonView_ybsdk_closeBannerButtonBackgroundSize, 0.0f));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, b);
                layoutParams.gravity = 17;
                imageView.setLayoutParams(layoutParams);
                int b2 = m810.b(b.v(obtainStyledAttributes, w3i0.YbSdkCloseBannerButtonView_ybsdk_closeBannerButtonCrossSize, 0.0f));
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(b2, b2);
                layoutParams2.gravity = 17;
                imageView2.setLayoutParams(layoutParams2);
                obtainStyledAttributes.recycle();
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, smg0.ybsdk_click_scale_animator));
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    public final zy11 render(j4c state) {
        l461 l461Var = this.binding;
        l461Var.c.getDrawable().setTint(state.a);
        ImageView imageView = l461Var.b;
        Integer num = state.b;
        imageView.setVisibility(num == null ? 4 : 0);
        if (num == null) {
            return null;
        }
        imageView.getDrawable().setTint(num.intValue());
        return zy11.a;
    }

    public CloseBannerButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CloseBannerButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CloseBannerButtonView(Context context) {
        this(context, null, 0, 6, null);
    }
}
