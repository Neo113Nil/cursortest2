package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: ColorView.kt */
/* loaded from: classes16.dex */
public final class d9g extends View {
    public static final float m = dn70.a() * 2.0f;
    public static final float n = dn70.a() * 8.0f;
    public static final float o = dn70.a() * 4.0f;
    public int b;
    public float c;
    public boolean d;
    public ValueAnimator e;
    public final RectF f;
    public final int g;
    public final Paint h;
    public final Paint i;
    public final int j;
    public final int k;
    public final Paint l;

    public d9g(Context context) {
        super(context, null, 0);
        this.b = -1;
        this.f = new RectF();
        this.g = e3m.a(R.dimen.correction_color_inset, context);
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.vk_white));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.h = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(context.getColor(R.color.vk_white));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(m);
        this.i = paint2;
        int color = context.getColor(R.color.vk_white);
        this.j = color;
        this.k = context.getColor(R.color.vk_gray_1000);
        Paint paint3 = new Paint(1);
        paint3.setColor(color);
        paint3.setStyle(style);
        this.l = paint3;
    }

    public static void a(d9g d9gVar, ValueAnimator valueAnimator) {
        d9gVar.setSelectAnimationProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void setSelectAnimationProgress(float f) {
        if (this.c == f) {
            return;
        }
        this.c = f;
        invalidate();
    }

    public final int getColor() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.b;
        Paint paint = this.h;
        paint.setColor(i);
        RectF rectF = this.f;
        float f = n;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (isSelected()) {
            int i2 = (int) (this.c * 255.0f);
            Paint paint2 = this.i;
            paint2.setAlpha(i2);
            canvas.drawRoundRect(rectF, f, f, paint2);
        }
        if (isSelected() || this.d) {
            boolean isSelected = isSelected();
            float f2 = o;
            if (isSelected) {
                f2 *= this.c;
            }
            boolean isSelected2 = isSelected();
            Paint paint3 = this.l;
            if (isSelected2) {
                paint3.setColor(this.j);
            } else {
                paint3.setColor(this.k);
            }
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), f2, paint3);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.f;
        rectF.left = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rectF.top = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rectF.right = getWidth();
        rectF.bottom = getHeight();
        int i5 = this.g;
        rectF.inset(i5, i5);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(e3m.a(R.dimen.correction_color_size, getContext()), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void setColor(int i) {
        if (this.b != i) {
            this.b = i;
            invalidate();
        }
    }

    public final void setModified(boolean z) {
        if (this.d != z) {
            this.d = z;
            invalidate();
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c, isSelected() ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.addUpdateListener(new c9g(this, 0));
        ofFloat.start();
        this.e = ofFloat;
    }
}
