package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import defpackage.dcm;
import defpackage.eng0;
import defpackage.kp50;
import defpackage.mj2;
import defpackage.pvb;
import defpackage.uh6;
import defpackage.xqv;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class b extends xqv {
    public static final FastOutSlowInInterpolator k = mj2.b;
    public static final int[] l = {0, 1500, 3000, 4500};
    public static final float[] m = {0.1f, 0.87f};
    public static final Property n;
    public static final Property o;
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final TimeInterpolator e;
    public final pvb f;
    public int g;
    public float h;
    public float i;
    public Animatable2Compat.a j;

    static {
        final String str = "animationFraction";
        final Class<Float> cls = Float.class;
        n = new Property<b, Float>(cls, str) { // from class: com.google.android.material.progressindicator.CircularIndeterminateRetreatAnimatorDelegate$3
            @Override // android.util.Property
            public Float get(b bVar) {
                return Float.valueOf(bVar.h);
            }

            @Override // android.util.Property
            public void set(b bVar, Float f) {
                float floatValue = f.floatValue();
                bVar.h = floatValue;
                int i = (int) (floatValue * 6000.0f);
                TimeInterpolator timeInterpolator = bVar.e;
                ArrayList arrayList = bVar.b;
                dcm dcmVar = (dcm) arrayList.get(0);
                float f2 = bVar.h * 1080.0f;
                int[] iArr = b.l;
                float f3 = 0.0f;
                for (int i2 : iArr) {
                    f3 += timeInterpolator.getInterpolation(xqv.b(i, i2, 500)) * 90.0f;
                }
                dcmVar.g = f2 + f3;
                float interpolation = timeInterpolator.getInterpolation(xqv.b(i, 0, 3000)) - timeInterpolator.getInterpolation(xqv.b(i, 3000, 3000));
                dcmVar.a = 0.0f;
                float[] fArr = b.m;
                float H = uh6.H(fArr[0], fArr[1], interpolation);
                dcmVar.b = H;
                float f4 = bVar.i;
                if (f4 > 0.0f) {
                    dcmVar.b = (1.0f - f4) * H;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= iArr.length) {
                        break;
                    }
                    float b = xqv.b(i, iArr[i3], 100);
                    if (b >= 0.0f && b <= 1.0f) {
                        int i4 = i3 + bVar.g;
                        int[] iArr2 = bVar.f.e;
                        int length = i4 % iArr2.length;
                        int length2 = (length + 1) % iArr2.length;
                        ((dcm) arrayList.get(0)).c = ArgbEvaluatorCompat.getInstance().evaluate(timeInterpolator.getInterpolation(b), Integer.valueOf(iArr2[length]), Integer.valueOf(iArr2[length2])).intValue();
                        break;
                    }
                    i3++;
                }
                bVar.a.invalidateSelf();
            }
        };
        final String str2 = "completeEndFraction";
        o = new Property<b, Float>(cls, str2) { // from class: com.google.android.material.progressindicator.CircularIndeterminateRetreatAnimatorDelegate$4
            @Override // android.util.Property
            public Float get(b bVar) {
                return Float.valueOf(bVar.i);
            }

            @Override // android.util.Property
            public void set(b bVar, Float f) {
                bVar.i = f.floatValue();
            }
        };
    }

    public b(Context context, pvb pvbVar) {
        super(1);
        this.g = 0;
        this.j = null;
        this.f = pvbVar;
        this.e = kp50.P(context, eng0.motionEasingStandardInterpolator, k);
    }

    @Override // defpackage.xqv
    public final void a() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.xqv
    public final void c() {
        h();
        ObjectAnimator objectAnimator = this.c;
        pvb pvbVar = this.f;
        objectAnimator.setDuration((long) (pvbVar.n * 6000.0f));
        this.d.setDuration((long) (pvbVar.n * 500.0f));
        this.g = 0;
        ((dcm) this.b.get(0)).c = pvbVar.e[0];
        this.i = 0.0f;
    }

    @Override // defpackage.xqv
    public final void d(Animatable2Compat.a aVar) {
        this.j = aVar;
    }

    @Override // defpackage.xqv
    public final void e() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.a.isVisible()) {
            this.d.start();
        } else {
            a();
        }
    }

    @Override // defpackage.xqv
    public final void f() {
        h();
        this.g = 0;
        ((dcm) this.b.get(0)).c = this.f.e[0];
        this.i = 0.0f;
        this.c.start();
    }

    @Override // defpackage.xqv
    public final void g() {
        this.j = null;
    }

    public final void h() {
        ObjectAnimator objectAnimator = this.c;
        pvb pvbVar = this.f;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<b, Float>) n, 0.0f, 1.0f);
            this.c = ofFloat;
            ofFloat.setDuration((long) (pvbVar.n * 6000.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateRetreatAnimatorDelegate$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    b bVar = b.this;
                    bVar.g = (bVar.g + b.l.length) % bVar.f.e.length;
                }
            });
        }
        if (this.d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<b, Float>) o, 0.0f, 1.0f);
            this.d = ofFloat2;
            ofFloat2.setDuration((long) (pvbVar.n * 500.0f));
            this.d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateRetreatAnimatorDelegate$2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    b.this.a();
                    b bVar = b.this;
                    Animatable2Compat.a aVar = bVar.j;
                    if (aVar != null) {
                        aVar.a(bVar.a);
                    }
                }
            });
        }
    }
}
