package com.yandex.div.internal.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ScalingDrawable.kt */
/* loaded from: classes7.dex */
public final class ScalingDrawable extends Drawable {
    private boolean isDirtyRect;
    private Bitmap originalBitmap;
    private Picture originalPicture;
    private float xTranslate;
    private float yTranslate;
    private ScaleType customScaleType = ScaleType.NO_SCALE;
    private AlignmentHorizontal alignmentHorizontal = AlignmentHorizontal.LEFT;
    private AlignmentVertical alignmentVertical = AlignmentVertical.TOP;
    private final Paint paint = new Paint(3);
    private Matrix thumbTransformMatrix = new Matrix();
    private float xScale = 1.0f;
    private float yScale = 1.0f;

    /* compiled from: ScalingDrawable.kt */
    public enum AlignmentHorizontal {
        LEFT,
        CENTER,
        RIGHT
    }

    /* compiled from: ScalingDrawable.kt */
    public enum AlignmentVertical {
        TOP,
        CENTER,
        BOTTOM
    }

    /* compiled from: ScalingDrawable.kt */
    public enum ScaleType {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    /* compiled from: ScalingDrawable.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ScaleType.values().length];
            try {
                iArr[ScaleType.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScaleType.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScaleType.NO_SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AlignmentHorizontal.values().length];
            try {
                iArr2[AlignmentHorizontal.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AlignmentHorizontal.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AlignmentVertical.values().length];
            try {
                iArr3[AlignmentVertical.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AlignmentVertical.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private final void reset() {
        this.isDirtyRect = true;
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        int width;
        int height;
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        float f5;
        canvas.save();
        Bitmap bitmap = this.originalBitmap;
        if (bitmap != null) {
            width = bitmap.getWidth();
        } else {
            Picture picture = this.originalPicture;
            width = picture != null ? picture.getWidth() : 0;
        }
        Bitmap bitmap2 = this.originalBitmap;
        if (bitmap2 != null) {
            height = bitmap2.getHeight();
        } else {
            Picture picture2 = this.originalPicture;
            height = picture2 != null ? picture2.getHeight() : 0;
        }
        if (height <= 0 || width <= 0) {
            Bitmap bitmap3 = this.originalBitmap;
            if (bitmap3 != null) {
                canvas.drawBitmap(bitmap3, this.thumbTransformMatrix, this.paint);
            }
            Picture picture3 = this.originalPicture;
            if (picture3 != null) {
                canvas.drawPicture(picture3);
            }
            canvas.restore();
            return;
        }
        if (this.isDirtyRect) {
            float width2 = getBounds().width();
            float height2 = getBounds().height();
            float f6 = width;
            this.xScale = width2 / f6;
            float f7 = height;
            this.yScale = height2 / f7;
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.customScaleType.ordinal()];
            if (i2 == 1) {
                float f8 = this.xScale;
                float f9 = this.yScale;
                if (f8 < f9) {
                    f8 = f9;
                }
                this.xScale = f8;
                this.yScale = f8;
            } else if (i2 == 2) {
                float f10 = this.xScale;
                float f11 = this.yScale;
                if (f10 > f11) {
                    f10 = f11;
                }
                this.xScale = f10;
                this.yScale = f10;
            } else if (i2 == 3) {
                this.xScale = 1.0f;
                this.yScale = 1.0f;
            }
            float f12 = f6 * this.xScale;
            float f13 = f7 * this.yScale;
            int i3 = WhenMappings.$EnumSwitchMapping$1[this.alignmentHorizontal.ordinal()];
            float f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i3 == 1) {
                f = (width2 - f12) / 2;
                f2 = this.xScale;
            } else if (i3 != 2) {
                f3 = 0.0f;
                this.xTranslate = f3;
                i = WhenMappings.$EnumSwitchMapping$2[this.alignmentVertical.ordinal()];
                if (i == 1) {
                    if (i == 2) {
                        f4 = height2 - f13;
                        f5 = this.yScale;
                    }
                    this.yTranslate = f14;
                    this.isDirtyRect = false;
                } else {
                    f4 = (height2 - f13) / 2;
                    f5 = this.yScale;
                }
                f14 = f4 / f5;
                this.yTranslate = f14;
                this.isDirtyRect = false;
            } else {
                f = width2 - f12;
                f2 = this.xScale;
            }
            f3 = f / f2;
            this.xTranslate = f3;
            i = WhenMappings.$EnumSwitchMapping$2[this.alignmentVertical.ordinal()];
            if (i == 1) {
            }
            f14 = f4 / f5;
            this.yTranslate = f14;
            this.isDirtyRect = false;
        }
        canvas.scale(this.xScale, this.yScale);
        canvas.translate(this.xTranslate, this.yTranslate);
        Bitmap bitmap4 = this.originalBitmap;
        if (bitmap4 != null) {
            canvas.drawBitmap(bitmap4, this.thumbTransformMatrix, this.paint);
        }
        Picture picture4 = this.originalPicture;
        if (picture4 != null) {
            canvas.drawPicture(picture4);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        reset();
    }

    public final void setAlignmentHorizontal(AlignmentHorizontal alignmentHorizontal) {
        this.alignmentHorizontal = alignmentHorizontal;
    }

    public final void setAlignmentVertical(AlignmentVertical alignmentVertical) {
        this.alignmentVertical = alignmentVertical;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
        invalidateSelf();
    }

    public final void setBitmap(Bitmap bitmap) {
        this.originalBitmap = bitmap;
        this.originalPicture = null;
        reset();
    }

    public final void setCustomScaleType(ScaleType scaleType) {
        this.customScaleType = scaleType;
    }

    public final void setPicture(Picture picture) {
        this.originalPicture = picture;
        this.originalBitmap = null;
        reset();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
