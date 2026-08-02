package com.yandex.go.platform.ui.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.apg0;
import defpackage.eyh0;
import defpackage.gmg0;
import defpackage.i3h0;
import defpackage.ing0;
import defpackage.kob1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006 "}, d2 = {"Lcom/yandex/go/platform/ui/components/SpinnerProgressView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "visibility", "Lzy11;", "setVisibility", "(I)V", "Landroid/view/View;", "spinner", "()Landroid/view/View;", "onDetachedFromWindow", "()V", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "rotateAnimation", "Landroid/view/animation/Animation;", "Landroid/view/View;", "Landroidx/appcompat/widget/AppCompatTextView;", "textView", "Landroidx/appcompat/widget/AppCompatTextView;", "getPrimaryColor", "()I", "primaryColor", "getTextColor", "textColor", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SpinnerProgressView extends FrameLayout {
    private final Animation rotateAnimation;
    private final View spinner;
    private final AppCompatTextView textView;

    public SpinnerProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Animation loadAnimation = AnimationUtils.loadAnimation(context, gmg0.rotate);
        this.rotateAnimation = loadAnimation;
        View view = new View(context);
        this.spinner = view;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        this.textView = appCompatTextView;
        Drawable drawable = getContext().getDrawable(i3h0.bg_spinner_loader);
        appCompatTextView.setText(eyh0.web_app_loading_in_progress);
        appCompatTextView.setTextColor(getTextColor());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        if (drawable != null) {
            ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), 17);
            view.setBackground(drawable);
            drawable.setTint(getPrimaryColor());
            addView(view, layoutParams2);
            view.startAnimation(loadAnimation);
            layoutParams.topMargin = (drawable.getIntrinsicHeight() / 2) + ((int) TypedValue.applyDimension(1, 16.0f, getContext().getResources().getDisplayMetrics()));
        }
        addView(appCompatTextView, layoutParams);
        if (getBackground() == null) {
            setBackgroundColor(getContext().getColor(apg0.white));
        }
    }

    private final int getPrimaryColor() {
        return kob1.b(ing0.go_platform_primary_color, getContext());
    }

    private final int getTextColor() {
        return getContext().getColor(apg0.black);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        animate().cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        if (getVisibility() == visibility || !this.spinner.isInLayout()) {
            return;
        }
        View view = this.spinner;
        if (visibility == 0) {
            view.startAnimation(this.rotateAnimation);
        } else {
            view.clearAnimation();
        }
    }

    /* renamed from: spinner, reason: from getter */
    public final View getSpinner() {
        return this.spinner;
    }

    public SpinnerProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SpinnerProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SpinnerProgressView(Context context) {
        this(context, null, 0, 6, null);
    }
}
