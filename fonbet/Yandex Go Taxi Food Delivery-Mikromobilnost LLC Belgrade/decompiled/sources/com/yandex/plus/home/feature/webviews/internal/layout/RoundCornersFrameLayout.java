package com.yandex.plus.home.feature.webviews.internal.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.n3i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/layout/RoundCornersFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "w", "h", "oldw", "oldh", "Lzy11;", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Path;", "clipPath", "Landroid/graphics/Path;", "", "rads", "[F", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RoundCornersFrameLayout extends FrameLayout {
    private final Path clipPath;
    private final float[] rads;

    public RoundCornersFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.clipPath = new Path();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, n3i0.RoundCornersLayout, 0, 0);
        try {
            float[] rads$lambda$0 = rads$lambda$0(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
            this.rads = rads$lambda$0;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private static final float[] rads$lambda$0(TypedArray typedArray) {
        float dimension = typedArray.getDimension(n3i0.RoundCornersLayout_plus_sdk_topLeftRadius, 0.0f);
        float dimension2 = typedArray.getDimension(n3i0.RoundCornersLayout_plus_sdk_topRightRadius, 0.0f);
        float dimension3 = typedArray.getDimension(n3i0.RoundCornersLayout_plus_sdk_bottomLeftRadius, 0.0f);
        float dimension4 = typedArray.getDimension(n3i0.RoundCornersLayout_plus_sdk_bottomRightRadius, 0.0f);
        return new float[]{dimension, dimension, dimension2, dimension2, dimension3, dimension3, dimension4, dimension4};
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.clipPath(this.clipPath);
        super.draw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.clipPath.reset();
        this.clipPath.addRoundRect(0.0f, 0.0f, w, h, this.rads, Path.Direction.CW);
    }

    public RoundCornersFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public RoundCornersFrameLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ RoundCornersFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public RoundCornersFrameLayout(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
