package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.div.core.widget.b;
import defpackage.b64;
import defpackage.jl40;
import defpackage.kgx;
import defpackage.m810;
import defpackage.oyr;
import defpackage.qoi0;
import defpackage.th;
import defpackage.w511;
import defpackage.xbi0;
import defpackage.y83;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001QB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u0011J7\u0010#\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b#\u0010$J/\u0010)\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0014¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b-\u0010.R$\u00100\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R+\u0010<\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u0017\"\u0004\b:\u0010;R+\u0010C\u001a\u00020=2\u0006\u00106\u001a\u00020=8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u00108\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR*\u0010F\u001a\u00020D2\u0006\u0010E\u001a\u00020D8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lcom/yandex/div/internal/widget/AspectImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Ly83;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "applyAspectRatio", "(II)V", "updateMatrix", "()V", "Landroid/widget/ImageView$ScaleType;", "scaleType", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "getBaseline", "()I", "onMeasure", "", "canResizeWidth", "(I)Z", "canResizeHeight", "invalidate", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "width", "height", "oldWidth", "oldHeight", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Bitmap;", "currentBitmapWithoutFilters", "Landroid/graphics/Bitmap;", "getCurrentBitmapWithoutFilters$div_release", "()Landroid/graphics/Bitmap;", "setCurrentBitmapWithoutFilters$div_release", "(Landroid/graphics/Bitmap;)V", "<set-?>", "gravity$delegate", "Lxbi0;", "getGravity", "setGravity", "(I)V", "gravity", "", "aspectRatio$delegate", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio", "Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "value", "imageScale", "Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "getImageScale", "()Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "setImageScale", "(Lcom/yandex/div/internal/widget/AspectImageView$Scale;)V", "Landroid/graphics/Matrix;", "transformMatrix", "Landroid/graphics/Matrix;", "isMatrixInvalidated", "Z", "Scale", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class AspectImageView extends AppCompatImageView implements y83 {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new MutablePropertyReference1Impl("gravity", 0, "getGravity()I", AspectImageView.class), oyr.B(qoi0.a, AspectImageView.class, "aspectRatio", "getAspectRatio()F", 0)};

    /* renamed from: aspectRatio$delegate, reason: from kotlin metadata */
    private final xbi0 aspectRatio;
    private Bitmap currentBitmapWithoutFilters;

    /* renamed from: gravity$delegate, reason: from kotlin metadata */
    private final xbi0 gravity;
    private Scale imageScale;
    private boolean isMatrixInvalidated;
    private final Matrix transformMatrix;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "", "NO_SCALE", "FIT", "FILL", "STRETCH", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Scale {
        private static final /* synthetic */ Scale[] $VALUES;
        public static final Scale FILL;
        public static final Scale FIT;
        public static final Scale NO_SCALE;
        public static final Scale STRETCH;

        static {
            Scale scale = new Scale("NO_SCALE", 0);
            NO_SCALE = scale;
            Scale scale2 = new Scale("FIT", 1);
            FIT = scale2;
            Scale scale3 = new Scale("FILL", 2);
            FILL = scale3;
            Scale scale4 = new Scale("STRETCH", 3);
            STRETCH = scale4;
            $VALUES = new Scale[]{scale, scale2, scale3, scale4};
        }

        public static Scale valueOf(String str) {
            return (Scale) Enum.valueOf(Scale.class, str);
        }

        public static Scale[] values() {
            return (Scale[]) $VALUES.clone();
        }
    }

    public AspectImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        th thVar = new th();
        thVar.a = 0;
        this.gravity = thVar;
        this.aspectRatio = b.a();
        this.imageScale = Scale.NO_SCALE;
        this.transformMatrix = new Matrix();
        this.isMatrixInvalidated = true;
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    private final void applyAspectRatio(int widthMeasureSpec, int heightMeasureSpec) {
        float aspectRatio = getAspectRatio();
        if (aspectRatio == 0.0f) {
            return;
        }
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        boolean canResizeWidth = canResizeWidth(widthMeasureSpec);
        boolean canResizeHeight = canResizeHeight(heightMeasureSpec);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!canResizeWidth && !canResizeHeight) {
            measuredHeight = m810.b(measuredWidth / aspectRatio);
        } else if (!canResizeWidth && canResizeHeight) {
            measuredHeight = m810.b(measuredWidth / aspectRatio);
        } else if (canResizeWidth && !canResizeHeight) {
            measuredWidth = m810.b(measuredHeight * aspectRatio);
        } else if (canResizeWidth && canResizeHeight) {
            measuredHeight = m810.b(measuredWidth / aspectRatio);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, mode), View.MeasureSpec.makeMeasureSpec(measuredHeight, mode2));
    }

    private final void updateMatrix() {
        float width;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float u = com.yandex.div.core.view2.divs.a.u(this);
        float t = com.yandex.div.core.view2.divs.a.t(this);
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        int absoluteGravity = Gravity.getAbsoluteGravity(getGravity(), getLayoutDirection());
        Scale scale = this.imageScale;
        int[] iArr = a.a;
        int i = iArr[scale.ordinal()];
        if (i == 1) {
            width = this.currentBitmapWithoutFilters != null ? (r5.getWidth() * getContext().getResources().getDisplayMetrics().density) / intrinsicWidth : 1.0f;
        } else if (i == 2) {
            width = Math.min(u / intrinsicWidth, t / intrinsicHeight);
        } else if (i == 3) {
            width = Math.max(u / intrinsicWidth, t / intrinsicHeight);
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            width = u / intrinsicWidth;
        }
        float f = iArr[this.imageScale.ordinal()] == 4 ? t / intrinsicHeight : width;
        int i2 = absoluteGravity & 7;
        float f2 = 0.0f;
        float a = i2 != 1 ? i2 != 5 ? 0.0f : u - (intrinsicWidth * width) : b64.a(intrinsicWidth, width, u, 2.0f);
        int i3 = absoluteGravity & 112;
        if (i3 == 16) {
            f2 = b64.a(intrinsicHeight, f, t, 2.0f);
        } else if (i3 == 80) {
            f2 = t - (intrinsicHeight * f);
        }
        Matrix matrix = this.transformMatrix;
        matrix.reset();
        matrix.postScale(width, f);
        matrix.postTranslate(a, f2);
        setImageMatrix(this.transformMatrix);
    }

    public boolean canResizeHeight(int heightMeasureSpec) {
        return View.MeasureSpec.getMode(heightMeasureSpec) != 1073741824;
    }

    public boolean canResizeWidth(int widthMeasureSpec) {
        return View.MeasureSpec.getMode(widthMeasureSpec) != 1073741824;
    }

    public final float getAspectRatio() {
        return ((Number) this.aspectRatio.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    @Override // android.widget.ImageView, android.view.View
    public int getBaseline() {
        return getMeasuredHeight() - getPaddingBottom();
    }

    /* renamed from: getCurrentBitmapWithoutFilters$div_release, reason: from getter */
    public final Bitmap getCurrentBitmapWithoutFilters() {
        return this.currentBitmapWithoutFilters;
    }

    public final int getGravity() {
        return ((Number) this.gravity.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final Scale getImageScale() {
        return this.imageScale;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.isMatrixInvalidated = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if ((getImageMatrix() == null || jl40.l(getImageMatrix(), this.transformMatrix)) && this.isMatrixInvalidated && getWidth() > 0 && getHeight() > 0) {
            updateMatrix();
            this.isMatrixInvalidated = false;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.isMatrixInvalidated = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        applyAspectRatio(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        this.isMatrixInvalidated = true;
    }

    @Override // defpackage.y83
    public final void setAspectRatio(float f) {
        this.aspectRatio.setValue(this, $$delegatedProperties[1], Float.valueOf(f));
    }

    public final void setCurrentBitmapWithoutFilters$div_release(Bitmap bitmap) {
        this.currentBitmapWithoutFilters = bitmap;
    }

    public final void setGravity(int i) {
        this.gravity.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public final void setImageScale(Scale scale) {
        if (this.imageScale != scale) {
            this.imageScale = scale;
            invalidate();
            if (com.yandex.div.core.view2.divs.a.P(this)) {
                requestLayout();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public AspectImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AspectImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public AspectImageView(Context context) {
        this(context, null, 0, 6, null);
    }
}
