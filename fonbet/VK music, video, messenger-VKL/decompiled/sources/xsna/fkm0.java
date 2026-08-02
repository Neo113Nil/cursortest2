package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import xsna.r9r0;

/* compiled from: StoryUploadProgressAnimation.kt */
/* loaded from: classes6.dex */
public final class fkm0 implements akm0 {
    public final Context a;
    public final ArrayList b;
    public final r9r0 c;
    public final uvl0 d;
    public final bqz0 e;
    public final dyl0 f;
    public final sk3<Integer> g;
    public Integer h;
    public final float i;
    public final float j;
    public final float k;
    public float l;
    public ValueAnimator m;
    public ValueAnimator n;
    public final r9r0.a o;

    /* compiled from: StoryUploadProgressAnimation.kt */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ float c;

        public a(float f) {
            this.c = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            float f = this.c;
            fkm0 fkm0Var = fkm0.this;
            if (f >= 1.0f) {
                fkm0Var.f.b();
            }
            fkm0Var.n = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            fkm0.this.f.onStart();
        }
    }

    public fkm0(Context context, ArrayList arrayList, r9r0 r9r0Var, uvl0 uvl0Var, bqz0 bqz0Var, dyl0 dyl0Var) {
        Integer l;
        this.a = context;
        this.b = arrayList;
        this.c = r9r0Var;
        this.d = uvl0Var;
        this.e = bqz0Var;
        this.f = dyl0Var;
        sk3<Integer> sk3Var = new sk3<>();
        sk3Var.addAll(j5g.y0(arrayList));
        this.g = sk3Var;
        do {
            l = sk3Var.l();
            if (l != null && this.d.j(l.intValue())) {
                break;
            }
        } while (!sk3Var.isEmpty());
        this.h = l;
        this.o = new r9r0.a(0);
        if (arrayList.isEmpty()) {
            this.i = 1.0f;
            this.k = 0.005f;
        } else {
            this.i = 1.0f / arrayList.size();
            this.k = 0.005f / arrayList.size();
        }
        this.j = this.i / 3.0f;
    }

    @Override // xsna.akm0
    public final boolean a() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.m;
        return (valueAnimator2 != null && valueAnimator2.isStarted()) || ((valueAnimator = this.n) != null && valueAnimator.isStarted());
    }

    public final void b(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.o.b, f);
        ofFloat.setInterpolator(null);
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new vye(this, 2));
        ofFloat.addListener(new a(f));
        ofFloat.start();
        this.n = ofFloat;
    }

    @Override // xsna.akm0
    public final void cancel() {
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.m = null;
        ValueAnimator valueAnimator2 = this.n;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.n = null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.akm0
    public final void draw(Canvas canvas) {
        r9r0 r9r0Var = this.c;
        ?? r1 = r9r0Var.f;
        r9r0.a aVar = this.o;
        if (aVar.b >= 1.0f) {
            r9r0Var.b(this.a, canvas);
            return;
        }
        if (r9r0Var.c()) {
            float f = r9r0Var.i + 2.0f;
            r9r0Var.i = f;
            r9r0Var.i = f % ((Number) r9r0Var.e.getValue()).floatValue();
        }
        ((Paint) r1.getValue()).setPathEffect(r9r0Var.a(aVar.b));
        canvas.save();
        if (!r9r0Var.c()) {
            canvas.rotate(aVar.a, canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f);
            ((Paint) r1.getValue()).setStrokeCap(Paint.Cap.ROUND);
        }
        canvas.drawPath(r9r0Var.a, (Paint) r1.getValue());
        canvas.restore();
    }

    @Override // xsna.akm0
    public final void pause() {
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
        ValueAnimator valueAnimator2 = this.n;
        if (valueAnimator2 != null) {
            valueAnimator2.pause();
        }
    }

    @Override // xsna.akm0
    public final void resume() {
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            valueAnimator.resume();
        }
        ValueAnimator valueAnimator2 = this.n;
        if (valueAnimator2 != null) {
            valueAnimator2.resume();
        }
    }
}
