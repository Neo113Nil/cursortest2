package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: CustomRippleDrawable.kt */
/* loaded from: classes14.dex */
public final class vnk extends Drawable {
    public final ObjectAnimator a;
    public final ObjectAnimator b;
    public final ObjectAnimator c;
    public boolean d;
    public PointF e;
    public final Paint f;
    public final Paint g;
    public final float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public boolean n;
    public float o;
    public float p;

    /* compiled from: CustomRippleDrawable.kt */
    public static final class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            vnk vnkVar = vnk.this;
            if (vnkVar.n) {
                return;
            }
            vnkVar.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* compiled from: CustomRippleDrawable.kt */
    public static final class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            vnk.this.m = animator.getStartDelay() > 0;
        }
    }

    /* compiled from: CustomRippleDrawable.kt */
    public static final class c extends Property<vnk, Integer> {
        @Override // android.util.Property
        public final Integer get(vnk vnkVar) {
            return Integer.valueOf(vnkVar.f.getAlpha());
        }

        @Override // android.util.Property
        public final void set(vnk vnkVar, Integer num) {
            vnkVar.setAlpha(num.intValue());
        }
    }

    /* compiled from: CustomRippleDrawable.kt */
    public static final class d extends Property<vnk, Float> {
        @Override // android.util.Property
        public final Float get(vnk vnkVar) {
            return Float.valueOf(vnkVar.i);
        }

        @Override // android.util.Property
        public final void set(vnk vnkVar, Float f) {
            vnk vnkVar2 = vnkVar;
            vnkVar2.i = f.floatValue();
            vnkVar2.invalidateSelf();
        }
    }

    /* compiled from: CustomRippleDrawable.kt */
    public static final class e extends Property<vnk, Float> {
        @Override // android.util.Property
        public final Float get(vnk vnkVar) {
            return Float.valueOf(vnkVar.j);
        }

        @Override // android.util.Property
        public final void set(vnk vnkVar, Float f) {
            vnkVar.a(f.floatValue());
        }
    }

    public vnk(Context context) {
        Class cls = Float.TYPE;
        e eVar = new e(cls, "ripple_radius");
        d dVar = new d(cls, "radius");
        c cVar = new c(Integer.TYPE, "alpha");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, eVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.a = ofFloat;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, dVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.b = ofFloat2;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, cVar, 0);
        this.c = ofInt;
        Paint paint = new Paint();
        this.f = paint;
        Paint paint2 = new Paint();
        this.g = paint2;
        this.k = 1000.0f;
        this.l = 50;
        this.m = true;
        paint.setAntiAlias(false);
        paint.setColor(-16777216);
        paint.setAlpha(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
        paint2.setAntiAlias(false);
        paint2.setColor(-16777216);
        paint2.setAlpha(170);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        ofFloat.setDuration(320L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new a());
        ofInt.setDuration(320L);
        ofInt.addListener(new b());
        ofFloat2.setDuration(320L);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.h = context.getResources().getDisplayMetrics().density;
    }

    public final void a(float f) {
        if (f < 50.0f) {
            this.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.e = null;
            int[] iArr = {this.l, 0};
            ObjectAnimator objectAnimator = this.c;
            objectAnimator.setIntValues(iArr);
            objectAnimator.setStartDelay(200L);
            objectAnimator.start();
            ObjectAnimator objectAnimator2 = this.b;
            objectAnimator2.setFloatValues(1.0f, 0.7f);
            objectAnimator2.setStartDelay(200L);
            objectAnimator2.start();
        } else {
            this.j = f;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.f;
        if (paint.getAlpha() > 0) {
            int save = canvas.save();
            float f = this.h * 100;
            if (Math.abs(canvas.getWidth() - canvas.getHeight()) < f) {
                this.o = (canvas.getWidth() / 3) * 2;
                this.p = this.d ? (f / 2) + (canvas.getWidth() * 1.13f) : -((f / 2) + (canvas.getWidth() * 0.13f));
            } else if (canvas.getWidth() < canvas.getHeight()) {
                this.o = Math.min(canvas.getWidth(), canvas.getHeight());
                this.p = this.d ? (canvas.getWidth() / 2.0f) * 3.0f : (-canvas.getWidth()) / 2.0f;
            } else {
                this.o = canvas.getWidth() / 2;
                this.p = this.d ? canvas.getWidth() * 1.13f : (-canvas.getWidth()) * 0.13f;
            }
            this.k = this.o;
            canvas.drawCircle(this.p, canvas.getHeight() / 2.0f, this.o * this.i, paint);
            PointF pointF = this.e;
            if (pointF != null) {
                canvas.drawCircle(pointF.x, pointF.y, this.j, this.g);
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
