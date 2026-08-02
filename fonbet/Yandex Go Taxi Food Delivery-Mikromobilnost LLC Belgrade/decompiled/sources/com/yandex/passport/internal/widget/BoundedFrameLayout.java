package com.yandex.passport.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.passport.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/yandex/passport/internal/widget/BoundedFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "", "maxWidth", "F", "maxHeight", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BoundedFrameLayout extends FrameLayout {
    public static final int $stable = 0;
    private final float maxHeight;
    private final float maxWidth;

    public BoundedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.PassportBoundedFrameLayout, 0, 0);
        this.maxWidth = obtainStyledAttributes.getDimension(R.styleable.PassportBoundedFrameLayout_passport_maxWidth, Float.MAX_VALUE);
        this.maxHeight = obtainStyledAttributes.getDimension(R.styleable.PassportBoundedFrameLayout_passport_maxHeight, Float.MAX_VALUE);
        setClipToPadding(false);
        setClipChildren(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int paddingLeft = getPaddingLeft();
        float f = size;
        float f2 = this.maxWidth;
        if (f > f2) {
            paddingLeft = (int) ((f - f2) / 2.0f);
        }
        int min = (int) Math.min(this.maxHeight, View.MeasureSpec.getSize(heightMeasureSpec));
        int paddingTop = getPaddingTop();
        float f3 = min;
        float f4 = this.maxHeight;
        if (f3 > f4) {
            paddingTop = (int) ((f3 - f4) / 2.0f);
        }
        setPadding(paddingLeft, paddingTop, paddingLeft, paddingTop);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public BoundedFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BoundedFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public BoundedFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }
}
