package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
abstract class BasePaintDrawable extends BaseDrawable {

    @Nullable
    private Paint mPaint;

    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable
    public final void onDraw(@NonNull Canvas canvas, int i, int i2) {
        if (this.mPaint == null) {
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setAntiAlias(true);
            this.mPaint.setColor(-16777216);
            onPreparePaint(this.mPaint);
        }
        this.mPaint.setAlpha(this.mAlpha);
        this.mPaint.setColorFilter(getColorFilterForDrawing());
        onDraw(canvas, i, i2, this.mPaint);
    }

    public abstract void onDraw(@NonNull Canvas canvas, int i, int i2, @NonNull Paint paint);

    public abstract void onPreparePaint(@NonNull Paint paint);
}
