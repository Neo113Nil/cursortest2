package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ViewsKt;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.an10;
import xsna.b0u0;
import xsna.epx;
import xsna.fpf0;
import xsna.iut0;
import xsna.p5j;
import xsna.p7f0;
import xsna.qcy;

/* compiled from: AspectImageView.kt */
/* loaded from: classes7.dex */
public class AspectImageView extends AppCompatImageView implements AspectView {
    static final /* synthetic */ qcy<Object>[] $$delegatedProperties = {new MutablePropertyReference1Impl(AspectImageView.class, "gravity", "getGravity()I", 0), p5j.a(0, AspectImageView.class, "aspectRatio", "getAspectRatio()F", fpf0.a), new MutablePropertyReference1Impl(AspectImageView.class, "imageScale", "getImageScale()Lcom/yandex/div/internal/widget/AspectImageView$Scale;", 0)};
    private final p7f0 aspectRatio$delegate;
    private final p7f0 gravity$delegate;
    private final p7f0 imageScale$delegate;
    private boolean isMatrixInvalidated;
    private final Matrix transformMatrix;

    /* compiled from: AspectImageView.kt */
    public enum Scale {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    /* compiled from: AspectImageView.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.NO_SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Scale.FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Scale.STRETCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AspectImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gravity$delegate = ViewsKt.appearanceAffecting$default(0, null, 2, null);
        this.aspectRatio$delegate = AspectView.Companion.aspectRatioProperty$div_release();
        this.imageScale$delegate = ViewsKt.dimensionAffecting$default(Scale.NO_SCALE, null, 2, null);
        this.transformMatrix = new Matrix();
        this.isMatrixInvalidated = true;
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    private final void applyAspectRatio(int i, int i2) {
        float aspectRatio = getAspectRatio();
        if (aspectRatio == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean canResizeWidth = canResizeWidth(i);
        boolean canResizeHeight = canResizeHeight(i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!canResizeWidth && !canResizeHeight) {
            measuredHeight = an10.b(measuredWidth / aspectRatio);
        } else if (!canResizeWidth && canResizeHeight) {
            measuredHeight = an10.b(measuredWidth / aspectRatio);
        } else if (canResizeWidth && !canResizeHeight) {
            measuredWidth = an10.b(measuredHeight * aspectRatio);
        } else if (canResizeWidth && canResizeHeight) {
            measuredHeight = an10.b(measuredWidth / aspectRatio);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, mode), View.MeasureSpec.makeMeasureSpec(measuredHeight, mode2));
    }

    private final void updateMatrix(int i, int i2) {
        float f;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        float f2 = paddingLeft;
        int paddingTop = (i2 - getPaddingTop()) - getPaddingBottom();
        float f3 = paddingTop >= 0 ? paddingTop : 0;
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        int gravity = getGravity();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(gravity, getLayoutDirection());
        Scale imageScale = getImageScale();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i3 = iArr[imageScale.ordinal()];
        if (i3 == 1) {
            f = 1.0f;
        } else if (i3 == 2) {
            f = Math.min(f2 / intrinsicWidth, f3 / intrinsicHeight);
        } else if (i3 == 3) {
            f = Math.max(f2 / intrinsicWidth, f3 / intrinsicHeight);
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            f = f2 / intrinsicWidth;
        }
        float f4 = iArr[getImageScale().ordinal()] == 4 ? f3 / intrinsicHeight : f;
        int i4 = absoluteGravity & 7;
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f6 = i4 != 1 ? i4 != 5 ? 0.0f : f2 - (intrinsicWidth * f) : (f2 - (intrinsicWidth * f)) / 2;
        int i5 = absoluteGravity & 112;
        if (i5 == 16) {
            f5 = (f3 - (intrinsicHeight * f4)) / 2;
        } else if (i5 == 80) {
            f5 = f3 - (intrinsicHeight * f4);
        }
        Matrix matrix = this.transformMatrix;
        matrix.reset();
        matrix.postScale(f, f4);
        matrix.postTranslate(f6, f5);
        setImageMatrix(this.transformMatrix);
    }

    public boolean canResizeHeight(int i) {
        return View.MeasureSpec.getMode(i) != 1073741824;
    }

    public boolean canResizeWidth(int i) {
        return View.MeasureSpec.getMode(i) != 1073741824;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getAspectRatio() {
        return ((Number) this.aspectRatio$delegate.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    @Override // android.widget.ImageView, android.view.View
    public int getBaseline() {
        return getMeasuredHeight() - getPaddingBottom();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getGravity() {
        return ((Number) this.gravity$delegate.getValue(this, $$delegatedProperties[0])).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Scale getImageScale() {
        return (Scale) this.imageScale$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.isMatrixInvalidated = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if ((getImageMatrix() == null || epx.f(getImageMatrix(), this.transformMatrix)) && this.isMatrixInvalidated && getWidth() > 0 && getHeight() > 0) {
            updateMatrix(getWidth(), getHeight());
            this.isMatrixInvalidated = false;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.isMatrixInvalidated = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        applyAspectRatio(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.isMatrixInvalidated = true;
    }

    @Override // com.yandex.div.core.widget.AspectView
    public final void setAspectRatio(float f) {
        this.aspectRatio$delegate.setValue(this, $$delegatedProperties[1], Float.valueOf(f));
    }

    public final void setGravity(int i) {
        this.gravity$delegate.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public final void setImageScale(Scale scale) {
        this.imageScale$delegate.setValue(this, $$delegatedProperties[2], scale);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }
}
