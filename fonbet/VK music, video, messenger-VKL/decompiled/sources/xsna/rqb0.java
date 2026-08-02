package xsna;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: PollOptionDrawable.kt */
/* loaded from: classes18.dex */
public final class rqb0 extends Drawable {
    public int a = 436222323;
    public int b = 251672947;
    public float c = iah0.a(4);
    public ValueAnimator d;
    public final Paint e;
    public final RectF f;

    public rqb0() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.e = paint;
        this.f = new RectF();
    }

    public final void a(int i, boolean z) {
        int level = getLevel();
        if (level < 0 || level >= 10001) {
            throw new IllegalArgumentException(("level should be from 0 to 10000, current: " + getLevel()).toString());
        }
        if (i < 0 || i >= 10001) {
            throw new IllegalArgumentException(lhg.a(i, "newLevel should be from 0 to 10000, current: ").toString());
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
        ofInt.setDuration(600L);
        ofInt.setInterpolator(qq2.f);
        ofInt.addUpdateListener(new hm7(this, 2));
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
        int i = this.a;
        Paint paint = this.e;
        paint.setColor(i);
        int save2 = canvas.save();
        int i2 = (int) level;
        int i3 = (int) height;
        canvas.clipRect(0, 0, i2, i3);
        float f = this.c;
        RectF rectF = this.f;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.restoreToCount(save2);
        paint.setColor(this.b);
        int save3 = canvas.save();
        canvas.clipRect(i2, 0, (int) width, i3);
        float f2 = this.c;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        canvas.restoreToCount(save3);
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
