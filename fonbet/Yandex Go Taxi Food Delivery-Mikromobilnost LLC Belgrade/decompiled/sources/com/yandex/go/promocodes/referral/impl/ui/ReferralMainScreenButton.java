package com.yandex.go.promocodes.referral.impl.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.a7h0;
import defpackage.dmn;
import defpackage.fvh0;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/promocodes/referral/impl/ui/ReferralMainScreenButton;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "shadowParent", "value", "Landroid/widget/ImageView;", "imageView", "getImageView", "()Landroid/widget/ImageView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReferralMainScreenButton extends FrameLayout {
    private ImageView imageView;
    private FrameLayout shadowParent;

    public ReferralMainScreenButton(Context context) {
        super(context);
        View.inflate(getContext(), fvh0.source_point_referral_gift_modal_button, this);
        setPadding(tje.u(11, getContext()), tje.u(18, getContext()), tje.u(11, getContext()), tje.u(11, getContext()));
        this.shadowParent = (FrameLayout) findViewById(a7h0.shadow_parent);
        this.imageView = (ImageView) findViewById(a7h0.referral_gift_button);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(xng0.component_circle_button_shadow, typedValue, true);
        Drawable drawable = getContext().getDrawable(typedValue.resourceId);
        GradientDrawable gradientDrawable = (GradientDrawable) (drawable != null ? drawable.mutate() : null);
        FrameLayout frameLayout = this.shadowParent;
        if (frameLayout != null) {
            frameLayout.addOnLayoutChangeListener(new dmn(2, gradientDrawable, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(GradientDrawable gradientDrawable, ReferralMainScreenButton referralMainScreenButton, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (referralMainScreenButton.shadowParent != null) {
            gradientDrawable.setGradientRadius(r2.getMeasuredHeight() / 2.0f);
            FrameLayout frameLayout = referralMainScreenButton.shadowParent;
            if (frameLayout != null) {
                frameLayout.setBackground(gradientDrawable);
            }
        }
    }

    public final ImageView getImageView() {
        return this.imageView;
    }
}
