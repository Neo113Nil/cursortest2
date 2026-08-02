package com.yandex.fintechsdk.core.ui.impl.api.view.button.back;

import android.R;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.b0h0;
import defpackage.fe4;
import defpackage.omg0;
import defpackage.vxh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/yandex/fintechsdk/core/ui/impl/api/view/button/back/BackButtonView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "clickable", "Lzy11;", "setClickable", "(Z)V", "focusable", "setFocusable", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/widget/ImageView;", "backButtonImage", "Landroid/widget/ImageView;", "Companion", "fe4", "impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BackButtonView extends FrameLayout {
    private static final fe4 Companion = new fe4();

    @Deprecated
    public static final int FULL_SIZE_DP = 40;

    @Deprecated
    public static final int PADDING_DP = 8;
    private final ImageView backButtonImage;

    public BackButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ImageView imageView = new ImageView(context);
        this.backButtonImage = imageView;
        Integer num = 8;
        int applyDimension = (int) TypedValue.applyDimension(1, num.floatValue(), Resources.getSystem().getDisplayMetrics());
        Integer num2 = 40;
        int applyDimension2 = (int) TypedValue.applyDimension(1, num2.floatValue(), Resources.getSystem().getDisplayMetrics());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(applyDimension2, applyDimension2));
        imageView.setPadding(applyDimension, applyDimension, applyDimension, applyDimension);
        imageView.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, omg0.finsdk_button_resize));
        imageView.setClickable(true);
        imageView.setFocusable(true);
        imageView.setBackgroundColor(context.getColor(R.color.transparent));
        imageView.setImageResource(b0h0.finsdk_ic_arrow_left);
        imageView.setContentDescription(context.getString(vxh0.finsdk_back));
        addView(imageView);
    }

    @Override // android.view.View
    public void setClickable(boolean clickable) {
        super.setClickable(clickable);
        this.backButtonImage.setClickable(clickable);
    }

    @Override // android.view.View
    public void setFocusable(boolean focusable) {
        super.setFocusable(focusable);
        this.backButtonImage.setFocusable(focusable);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l) {
        super.setOnClickListener(l);
        this.backButtonImage.setOnClickListener(l);
    }

    public BackButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public BackButtonView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ BackButtonView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public BackButtonView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
