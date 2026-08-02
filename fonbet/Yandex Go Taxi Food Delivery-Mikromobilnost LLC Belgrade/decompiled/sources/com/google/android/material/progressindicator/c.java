package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import defpackage.dcm;
import defpackage.gjy;
import defpackage.xqv;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class c extends xqv {
    public static final Property i;
    public ObjectAnimator c;
    public final FastOutSlowInInterpolator d;
    public final gjy e;
    public int f;
    public boolean g;
    public float h;

    static {
        final Class<Float> cls = Float.class;
        final String str = "animationFraction";
        i = new Property<c, Float>(cls, str) { // from class: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate$2
            @Override // android.util.Property
            public Float get(c cVar) {
                return Float.valueOf(cVar.h);
            }

            @Override // android.util.Property
            public void set(c cVar, Float f) {
                float floatValue = f.floatValue();
                cVar.h = floatValue;
                ArrayList arrayList = cVar.b;
                ((dcm) arrayList.get(0)).a = 0.0f;
                float b = xqv.b((int) (floatValue * 333.0f), 0, 667);
                dcm dcmVar = (dcm) arrayList.get(0);
                dcm dcmVar2 = (dcm) arrayList.get(1);
                FastOutSlowInInterpolator fastOutSlowInInterpolator = cVar.d;
                float interpolation = fastOutSlowInInterpolator.getInterpolation(b);
                dcmVar2.a = interpolation;
                dcmVar.b = interpolation;
                dcm dcmVar3 = (dcm) arrayList.get(1);
                dcm dcmVar4 = (dcm) arrayList.get(2);
                float interpolation2 = fastOutSlowInInterpolator.getInterpolation(b + 0.49925038f);
                dcmVar4.a = interpolation2;
                dcmVar3.b = interpolation2;
                ((dcm) arrayList.get(2)).b = 1.0f;
                if (cVar.g && ((dcm) arrayList.get(1)).b < 1.0f) {
                    ((dcm) arrayList.get(2)).c = ((dcm) arrayList.get(1)).c;
                    ((dcm) arrayList.get(1)).c = ((dcm) arrayList.get(0)).c;
                    ((dcm) arrayList.get(0)).c = cVar.e.e[cVar.f];
                    cVar.g = false;
                }
                cVar.a.invalidateSelf();
            }
        };
    }

    public c(gjy gjyVar) {
        super(3);
        this.f = 1;
        this.e = gjyVar;
        this.d = new FastOutSlowInInterpolator();
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
        this.c.setDuration((long) (this.e.n * 333.0f));
        i();
    }

    @Override // defpackage.xqv
    public final void d(Animatable2Compat.a aVar) {
    }

    @Override // defpackage.xqv
    public final void e() {
    }

    @Override // defpackage.xqv
    public final void f() {
        h();
        i();
        this.c.start();
    }

    @Override // defpackage.xqv
    public final void g() {
    }

    public final void h() {
        if (this.c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<c, Float>) i, 0.0f, 1.0f);
            this.c = ofFloat;
            ofFloat.setDuration((long) (this.e.n * 333.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    c cVar = c.this;
                    cVar.f = (cVar.f + 1) % cVar.e.e.length;
                    cVar.g = true;
                }
            });
        }
    }

    public final void i() {
        this.g = true;
        this.f = 1;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            dcm dcmVar = (dcm) it.next();
            gjy gjyVar = this.e;
            dcmVar.c = gjyVar.e[0];
            dcmVar.d = gjyVar.i / 2;
        }
    }
}
