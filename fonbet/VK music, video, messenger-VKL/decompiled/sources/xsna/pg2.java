package xsna;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: AnimatedBorderDrawable.kt */
/* loaded from: classes17.dex */
public final class pg2 extends Drawable {
    public final Context a;
    public float b;
    public final RectF c = new RectF();
    public final Path d = new Path();
    public ValueAnimator e;
    public Bitmap f;
    public Canvas g;
    public float h;
    public float i;
    public final Paint j;
    public long k;
    public final LinearInterpolator l;
    public boolean m;

    /* compiled from: AnimatedBorderDrawable.kt */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ ValueAnimator b;
        public final /* synthetic */ pg2 c;

        public a(ValueAnimator valueAnimator, pg2 pg2Var) {
            this.b = valueAnimator;
            this.c = pg2Var;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) this.b.getAnimatedValue()).floatValue();
            pg2 pg2Var = this.c;
            pg2Var.h = floatValue;
            RectF rectF = new RectF(pg2Var.getBounds());
            float f = pg2Var.b;
            rectF.inset(f, f);
            float f2 = pg2Var.i;
            Path path = pg2Var.d;
            float f3 = 2;
            path.moveTo(rectF.right / f3, rectF.top);
            path.lineTo(f2, rectF.top);
            RectF rectF2 = pg2Var.c;
            float f4 = f2 * f3;
            rectF2.set(rectF.left, rectF.top, f4, f4);
            path.arcTo(rectF2, -90.0f, -90.0f, false);
            path.lineTo(rectF.left, rectF.bottom - f2);
            float f5 = rectF.left;
            float f6 = rectF.bottom;
            rectF2.set(f5, f6 - f4, f5 + f4, f6);
            path.arcTo(rectF2, -180.0f, -90.0f, false);
            path.lineTo(rectF.right - f2, rectF.bottom);
            float f7 = rectF.right;
            float f8 = rectF.bottom;
            rectF2.set(f7 - f4, f8 - f4, f7, f8);
            path.arcTo(rectF2, 90.0f, -90.0f);
            path.lineTo(rectF.right, rectF.top + f2);
            float f9 = rectF.right;
            float f10 = rectF.top;
            rectF2.set(f9 - f4, f10, f9, f4 + f10);
            path.arcTo(rectF2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -90.0f);
            path.lineTo(rectF.right / f3, rectF.top);
            pg2Var.invalidateSelf();
        }
    }

    public pg2(Context context) {
        this.a = context;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        this.j = paint;
        this.k = 3500L;
        this.l = new LinearInterpolator();
    }

    public final float a() {
        RectF rectF = new RectF(getBounds());
        float f = this.b;
        rectF.inset(f, f);
        double width = (this.i * 3.141592653589793d) + rectF.width();
        RectF rectF2 = new RectF(getBounds());
        float f2 = this.b;
        rectF2.inset(f2, f2);
        return 2 * ((float) ((width + rectF2.height()) - (4 * this.i)));
    }

    public final void b(float f) throws IllegalArgumentException {
        ValueAnimator valueAnimator;
        if (this.m && (valueAnimator = this.e) != null) {
            valueAnimator.end();
            s3q0 s3q0Var = s3q0.a;
        }
        this.f = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
        this.g = new Canvas(this.f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(Arrays.copyOf(new float[]{a() * f, a()}, 2));
        ofFloat.setInterpolator(this.l);
        ofFloat.addUpdateListener(new a(ofFloat, this));
        ofFloat.setDuration((long) ((1.0f - f) * this.k));
        ofFloat.addListener(new b());
        ofFloat.start();
        this.e = ofFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Canvas canvas2;
        if (!this.m || (bitmap = this.f) == null || (canvas2 = this.g) == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        float a2 = a();
        float f = this.h;
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{a2 - f, f}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Paint paint = this.j;
        paint.setPathEffect(dashPathEffect);
        s3q0 s3q0Var = s3q0.a;
        Path path = this.d;
        canvas2.drawPath(path, paint);
        path.reset();
        canvas.drawBitmap(bitmap, getBounds(), getBounds(), paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    /* compiled from: Animator.kt */
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            pg2.this.m = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            pg2.this.m = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            pg2.this.m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
