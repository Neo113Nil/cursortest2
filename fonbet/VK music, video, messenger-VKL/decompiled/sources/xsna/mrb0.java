package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.vkontakte.android.R;

/* compiled from: PollResultRateDrawable.kt */
/* loaded from: classes17.dex */
public final class mrb0 extends Drawable {
    public final int a;
    public final int b;
    public final float c;
    public ValueAnimator d;
    public final Paint e;
    public final RectF f;

    public mrb0() {
        Context context = e43.a;
        this.a = (context == null ? null : context).getColor(R.color.vk_blue_300);
        Context context2 = e43.a;
        this.b = (context2 != null ? context2 : null).getColor(R.color.vk_gray_50);
        this.c = iah0.a(2);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.e = paint;
        this.f = new RectF();
    }

    public final void a(int i, boolean z) {
        int level = getLevel();
        if (level < 0 || level >= 10001) {
            throw new IllegalArgumentException("level should be from 0 to 10000");
        }
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = null;
        if (!z) {
            setLevel(i);
            invalidateSelf();
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(getLevel(), i);
        ofInt.setDuration(500L);
        ofInt.setInterpolator(qq2.f);
        ofInt.addUpdateListener(new lrb0(this, 0));
        ofInt.start();
        this.d = ofInt;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        float level = (getLevel() / 10000) * width;
        int save = canvas.save();
        if (!xpg0.b()) {
            canvas.scale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
        }
        int i = this.b;
        Paint paint = this.e;
        paint.setColor(i);
        float f = getBounds().right;
        RectF rectF = this.f;
        rectF.right = f;
        float f2 = this.c;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setColor(this.a);
        rectF.right = level;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f.set(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }
}
