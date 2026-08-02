package com.yandex.div.internal.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0003RSTB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010+\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010:R\u0016\u0010O\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010:R\u0016\u0010P\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010:R\u0016\u0010Q\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010:¨\u0006U"}, d2 = {"Lcom/yandex/div/internal/drawable/ScalingDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "Lzy11;", "reset", "", "value", "setAlpha", "(I)V", "getOpacity", "()I", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "(Landroid/graphics/Bitmap;)V", "Landroid/graphics/Picture;", "picture", "setPicture", "(Landroid/graphics/Picture;)V", "drawable", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Lcom/yandex/div/internal/drawable/ScalingDrawable$ScaleType;", "customScaleType", "Lcom/yandex/div/internal/drawable/ScalingDrawable$ScaleType;", "getCustomScaleType", "()Lcom/yandex/div/internal/drawable/ScalingDrawable$ScaleType;", "setCustomScaleType", "(Lcom/yandex/div/internal/drawable/ScalingDrawable$ScaleType;)V", "Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentHorizontal;", "alignmentHorizontal", "Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentHorizontal;", "getAlignmentHorizontal", "()Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentHorizontal;", "setAlignmentHorizontal", "(Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentHorizontal;)V", "Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentVertical;", "alignmentVertical", "Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentVertical;", "getAlignmentVertical", "()Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentVertical;", "setAlignmentVertical", "(Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentVertical;)V", "", "additionalScale", "F", "getAdditionalScale", "()F", "setAdditionalScale", "(F)V", "originalBitmap", "Landroid/graphics/Bitmap;", "originalPicture", "Landroid/graphics/Picture;", "originalDrawable", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/Matrix;", "thumbTransformMatrix", "Landroid/graphics/Matrix;", "", "isDirtyRect", "Z", "xScale", "yScale", "xTranslate", "yTranslate", "AlignmentHorizontal", "AlignmentVertical", "ScaleType", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScalingDrawable extends Drawable {
    private boolean isDirtyRect;
    private Bitmap originalBitmap;
    private Drawable originalDrawable;
    private Picture originalPicture;
    private float xTranslate;
    private float yTranslate;
    private ScaleType customScaleType = ScaleType.NO_SCALE;
    private AlignmentHorizontal alignmentHorizontal = AlignmentHorizontal.LEFT;
    private AlignmentVertical alignmentVertical = AlignmentVertical.TOP;
    private float additionalScale = 1.0f;
    private final Paint paint = new Paint(3);
    private Matrix thumbTransformMatrix = new Matrix();
    private float xScale = 1.0f;
    private float yScale = 1.0f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentHorizontal;", "", "LEFT", "CENTER", "RIGHT", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AlignmentHorizontal {
        private static final /* synthetic */ AlignmentHorizontal[] $VALUES;
        public static final AlignmentHorizontal CENTER;
        public static final AlignmentHorizontal LEFT;
        public static final AlignmentHorizontal RIGHT;

        static {
            AlignmentHorizontal alignmentHorizontal = new AlignmentHorizontal("LEFT", 0);
            LEFT = alignmentHorizontal;
            AlignmentHorizontal alignmentHorizontal2 = new AlignmentHorizontal("CENTER", 1);
            CENTER = alignmentHorizontal2;
            AlignmentHorizontal alignmentHorizontal3 = new AlignmentHorizontal("RIGHT", 2);
            RIGHT = alignmentHorizontal3;
            $VALUES = new AlignmentHorizontal[]{alignmentHorizontal, alignmentHorizontal2, alignmentHorizontal3};
        }

        public static AlignmentHorizontal valueOf(String str) {
            return (AlignmentHorizontal) Enum.valueOf(AlignmentHorizontal.class, str);
        }

        public static AlignmentHorizontal[] values() {
            return (AlignmentHorizontal[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentVertical;", "", "TOP", "CENTER", "BOTTOM", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AlignmentVertical {
        private static final /* synthetic */ AlignmentVertical[] $VALUES;
        public static final AlignmentVertical BOTTOM;
        public static final AlignmentVertical CENTER;
        public static final AlignmentVertical TOP;

        static {
            AlignmentVertical alignmentVertical = new AlignmentVertical("TOP", 0);
            TOP = alignmentVertical;
            AlignmentVertical alignmentVertical2 = new AlignmentVertical("CENTER", 1);
            CENTER = alignmentVertical2;
            AlignmentVertical alignmentVertical3 = new AlignmentVertical("BOTTOM", 2);
            BOTTOM = alignmentVertical3;
            $VALUES = new AlignmentVertical[]{alignmentVertical, alignmentVertical2, alignmentVertical3};
        }

        public static AlignmentVertical valueOf(String str) {
            return (AlignmentVertical) Enum.valueOf(AlignmentVertical.class, str);
        }

        public static AlignmentVertical[] values() {
            return (AlignmentVertical[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/internal/drawable/ScalingDrawable$ScaleType;", "", "NO_SCALE", "FIT", "FILL", "STRETCH", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ScaleType {
        private static final /* synthetic */ ScaleType[] $VALUES;
        public static final ScaleType FILL;
        public static final ScaleType FIT;
        public static final ScaleType NO_SCALE;
        public static final ScaleType STRETCH;

        static {
            ScaleType scaleType = new ScaleType("NO_SCALE", 0);
            NO_SCALE = scaleType;
            ScaleType scaleType2 = new ScaleType("FIT", 1);
            FIT = scaleType2;
            ScaleType scaleType3 = new ScaleType("FILL", 2);
            FILL = scaleType3;
            ScaleType scaleType4 = new ScaleType("STRETCH", 3);
            STRETCH = scaleType4;
            $VALUES = new ScaleType[]{scaleType, scaleType2, scaleType3, scaleType4};
        }

        public static ScaleType valueOf(String str) {
            return (ScaleType) Enum.valueOf(ScaleType.class, str);
        }

        public static ScaleType[] values() {
            return (ScaleType[]) $VALUES.clone();
        }
    }

    private final void reset() {
        this.isDirtyRect = true;
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        int intValue;
        int intValue2;
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        float f5;
        canvas.save();
        Bitmap bitmap = this.originalBitmap;
        if (bitmap != null) {
            intValue = bitmap.getWidth();
        } else {
            Picture picture = this.originalPicture;
            if (picture != null) {
                intValue = picture.getWidth();
            } else {
                Drawable drawable = this.originalDrawable;
                Integer valueOf = drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null;
                intValue = valueOf != null ? valueOf.intValue() : 0;
            }
        }
        Bitmap bitmap2 = this.originalBitmap;
        if (bitmap2 != null) {
            intValue2 = bitmap2.getHeight();
        } else {
            Picture picture2 = this.originalPicture;
            if (picture2 != null) {
                intValue2 = picture2.getHeight();
            } else {
                Drawable drawable2 = this.originalDrawable;
                Integer valueOf2 = drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null;
                intValue2 = valueOf2 != null ? valueOf2.intValue() : 0;
            }
        }
        if (intValue2 <= 0 || intValue <= 0) {
            Bitmap bitmap3 = this.originalBitmap;
            if (bitmap3 != null) {
                canvas.drawBitmap(bitmap3, this.thumbTransformMatrix, this.paint);
            }
            Picture picture3 = this.originalPicture;
            if (picture3 != null) {
                canvas.drawPicture(picture3);
            }
            Drawable drawable3 = this.originalDrawable;
            if (drawable3 != null) {
                drawable3.draw(canvas);
            }
            canvas.restore();
            return;
        }
        if (this.isDirtyRect) {
            float width = getBounds().width();
            float height = getBounds().height();
            float f6 = intValue;
            this.xScale = width / f6;
            float f7 = intValue2;
            this.yScale = height / f7;
            int i2 = b.a[this.customScaleType.ordinal()];
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
                float f12 = this.additionalScale;
                this.xScale = f12;
                this.yScale = f12;
            }
            float f13 = f6 * this.xScale;
            float f14 = f7 * this.yScale;
            int i3 = b.b[this.alignmentHorizontal.ordinal()];
            float f15 = 0.0f;
            if (i3 == 1) {
                f = (width - f13) / 2.0f;
                f2 = this.xScale;
            } else if (i3 != 2) {
                f3 = 0.0f;
                this.xTranslate = f3;
                i = b.c[this.alignmentVertical.ordinal()];
                if (i == 1) {
                    if (i == 2) {
                        f4 = height - f14;
                        f5 = this.yScale;
                    }
                    this.yTranslate = f15;
                    this.isDirtyRect = false;
                } else {
                    f4 = (height - f14) / 2.0f;
                    f5 = this.yScale;
                }
                f15 = f4 / f5;
                this.yTranslate = f15;
                this.isDirtyRect = false;
            } else {
                f = width - f13;
                f2 = this.xScale;
            }
            f3 = f / f2;
            this.xTranslate = f3;
            i = b.c[this.alignmentVertical.ordinal()];
            if (i == 1) {
            }
            f15 = f4 / f5;
            this.yTranslate = f15;
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
        Drawable drawable4 = this.originalDrawable;
        if (drawable4 != null) {
            drawable4.draw(canvas);
        }
        canvas.restore();
    }

    public final float getAdditionalScale() {
        return this.additionalScale;
    }

    public final AlignmentHorizontal getAlignmentHorizontal() {
        return this.alignmentHorizontal;
    }

    public final AlignmentVertical getAlignmentVertical() {
        return this.alignmentVertical;
    }

    public final ScaleType getCustomScaleType() {
        return this.customScaleType;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        reset();
    }

    public final void setAdditionalScale(float f) {
        this.additionalScale = f;
    }

    public final void setAlignmentHorizontal(AlignmentHorizontal alignmentHorizontal) {
        this.alignmentHorizontal = alignmentHorizontal;
    }

    public final void setAlignmentVertical(AlignmentVertical alignmentVertical) {
        this.alignmentVertical = alignmentVertical;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int value) {
        this.paint.setAlpha(value);
        invalidateSelf();
    }

    public final void setBitmap(Bitmap bitmap) {
        this.originalBitmap = bitmap;
        this.originalPicture = null;
        this.originalDrawable = null;
        reset();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setCustomScaleType(ScaleType scaleType) {
        this.customScaleType = scaleType;
    }

    public final void setDrawable(Drawable drawable) {
        this.originalDrawable = drawable;
        this.originalBitmap = null;
        this.originalPicture = null;
        reset();
    }

    public final void setPicture(Picture picture) {
        this.originalPicture = picture;
        this.originalBitmap = null;
        this.originalDrawable = null;
        reset();
    }
}
