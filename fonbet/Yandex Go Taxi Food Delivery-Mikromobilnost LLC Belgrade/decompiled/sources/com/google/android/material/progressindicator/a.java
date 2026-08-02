package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import defpackage.dcm;
import defpackage.pvb;
import defpackage.xqv;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class a extends xqv {
    public static final int[] k = {0, 1350, 2700, 4050};
    public static final int[] l = {667, 2017, 3367, 4717};
    public static final int[] m = {1000, 2350, 3700, 5050};
    public static final Property n;
    public static final Property o;
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final FastOutSlowInInterpolator e;
    public final pvb f;
    public int g;
    public float h;
    public float i;
    public Animatable2Compat.a j;

    static {
        final String str = "animationFraction";
        final Class<Float> cls = Float.class;
        n = new Property<a, Float>(cls, str) { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate$3
            @Override // android.util.Property
            public Float get(a aVar) {
                return Float.valueOf(aVar.h);
            }

            @Override // android.util.Property
            public void set(a aVar, Float f) {
                float floatValue = f.floatValue();
                aVar.h = floatValue;
                int i = (int) (floatValue * 5400.0f);
                FastOutSlowInInterpolator fastOutSlowInInterpolator = aVar.e;
                ArrayList arrayList = aVar.b;
                dcm dcmVar = (dcm) arrayList.get(0);
                float f2 = aVar.h * 1520.0f;
                dcmVar.a = (-20.0f) + f2;
                dcmVar.b = f2;
                for (int i2 = 0; i2 < 4; i2++) {
                    dcmVar.b = (fastOutSlowInInterpolator.getInterpolation(xqv.b(i, a.k[i2], 667)) * 250.0f) + dcmVar.b;
                    dcmVar.a = (fastOutSlowInInterpolator.getInterpolation(xqv.b(i, a.l[i2], 667)) * 250.0f) + dcmVar.a;
                }
                float f3 = dcmVar.a;
                float f4 = dcmVar.b;
                dcmVar.a = (((f4 - f3) * aVar.i) + f3) / 360.0f;
                dcmVar.b = f4 / 360.0f;
                int i3 = 0;
                while (true) {
                    if (i3 >= 4) {
                        break;
                    }
                    float b = xqv.b(i, a.m[i3], 333);
                    if (b > 0.0f && b < 1.0f) {
                        int i4 = i3 + aVar.g;
                        int[] iArr = aVar.f.e;
                        int length = i4 % iArr.length;
                        int length2 = (length + 1) % iArr.length;
                        int i5 = iArr[length];
                        int i6 = iArr[length2];
                        ((dcm) arrayList.get(0)).c = ArgbEvaluatorCompat.getInstance().evaluate(fastOutSlowInInterpolator.getInterpolation(b), Integer.valueOf(i5), Integer.valueOf(i6)).intValue();
                        break;
                    }
                    i3++;
                }
                aVar.a.invalidateSelf();
            }
        };
        final String str2 = "completeEndFraction";
        o = new Property<a, Float>(cls, str2) { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate$4
            @Override // android.util.Property
            public Float get(a aVar) {
                return Float.valueOf(aVar.i);
            }

            @Override // android.util.Property
            public void set(a aVar, Float f) {
                aVar.i = f.floatValue();
            }
        };
    }

    public a(pvb pvbVar) {
        super(1);
        this.g = 0;
        this.j = null;
        this.f = pvbVar;
        this.e = new FastOutSlowInInterpolator();
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
        objectAnimator.setDuration((long) (pvbVar.n * 5400.0f));
        this.d.setDuration((long) (pvbVar.n * 333.0f));
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<a, Float>) n, 0.0f, 1.0f);
            this.c = ofFloat;
            ofFloat.setDuration((long) (pvbVar.n * 5400.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    a aVar = a.this;
                    aVar.g = (aVar.g + 4) % aVar.f.e.length;
                }
            });
        }
        if (this.d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<a, Float>) o, 0.0f, 1.0f);
            this.d = ofFloat2;
            ofFloat2.setDuration((long) (pvbVar.n * 333.0f));
            this.d.setInterpolator(this.e);
            this.d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate$2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    a.this.a();
                    a aVar = a.this;
                    Animatable2Compat.a aVar2 = aVar.j;
                    if (aVar2 != null) {
                        aVar2.a(aVar.a);
                    }
                }
            });
        }
    }
}
