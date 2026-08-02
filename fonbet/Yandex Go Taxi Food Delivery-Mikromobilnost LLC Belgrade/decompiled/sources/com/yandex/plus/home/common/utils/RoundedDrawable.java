package com.yandex.plus.home.common.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import defpackage.msa1;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/plus/home/common/utils/RoundedDrawable;", "Lcom/yandex/plus/home/common/utils/DrawableWrapper;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "topLeftRadius", "topRightRadius", "bottomRightRadius", "bottomLeftRadius", "<init>", "(Landroid/graphics/drawable/Drawable;FFFF)V", "Landroid/graphics/Rect;", "bounds", "Lzy11;", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "F", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "Landroid/graphics/Path;", "mask", "Landroid/graphics/Path;", "homeless-core-android-extensions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RoundedDrawable extends DrawableWrapper {
    private final float bottomLeftRadius;
    private final float bottomRightRadius;
    private RectF bounds;
    private Path mask;
    private final Paint paint;
    private final float topLeftRadius;
    private final float topRightRadius;

    public RoundedDrawable(Drawable drawable, float f, float f2, float f3, float f4) {
        super(drawable);
        this.topLeftRadius = f;
        this.topRightRadius = f2;
        this.bottomRightRadius = f3;
        this.bottomLeftRadius = f4;
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.paint = paint;
        this.bounds = new RectF();
    }

    private static final zy11 draw$lambda$0(RoundedDrawable roundedDrawable, Canvas canvas, Canvas canvas2) {
        super.draw(canvas);
        return zy11.a;
    }

    @Override // com.yandex.plus.home.common.utils.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = this.bounds;
        Path path = this.mask;
        Paint paint = this.paint;
        if (path == null) {
            draw$lambda$0(this, canvas, canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(rectF, null);
        draw$lambda$0(this, canvas, canvas);
        canvas.drawPath(path, paint);
        canvas.restoreToCount(saveLayer);
    }

    @Override // com.yandex.plus.home.common.utils.DrawableWrapper, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        Path path;
        super.onBoundsChange(bounds);
        this.bounds.set(bounds);
        RectF rectF = this.bounds;
        float f = this.topLeftRadius;
        float f2 = this.topRightRadius;
        float f3 = this.bottomRightRadius;
        float f4 = this.bottomLeftRadius;
        if (msa1.n(f, f2, f3, f4)) {
            path = new Path();
            path.addRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, Path.Direction.CW);
            path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CCW);
        } else {
            path = null;
        }
        this.mask = path;
    }
}
