package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import defpackage.dcm;
import defpackage.gjy;
import defpackage.mmg0;
import defpackage.sb2;
import defpackage.xqv;
import defpackage.y5e;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class d extends xqv {
    public static final int[] k = {533, 567, 850, 750};
    public static final int[] l = {1267, 1000, 333, 0};
    public static final Property m;
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final Interpolator[] e;
    public final gjy f;
    public int g;
    public boolean h;
    public float i;
    public Animatable2Compat.a j;

    static {
        final Class<Float> cls = Float.class;
        final String str = "animationFraction";
        m = new Property<d, Float>(cls, str) { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$3
            @Override // android.util.Property
            public Float get(d dVar) {
                return Float.valueOf(dVar.i);
            }

            @Override // android.util.Property
            public void set(d dVar, Float f) {
                float floatValue = f.floatValue();
                dVar.i = floatValue;
                int i = (int) (floatValue * 1800.0f);
                Interpolator[] interpolatorArr = dVar.e;
                ArrayList arrayList = dVar.b;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    dcm dcmVar = (dcm) arrayList.get(i2);
                    int[] iArr = d.l;
                    int i3 = i2 * 2;
                    int i4 = iArr[i3];
                    int[] iArr2 = d.k;
                    dcmVar.a = sb2.j(interpolatorArr[i3].getInterpolation(xqv.b(i, i4, iArr2[i3])), 0.0f, 1.0f);
                    int i5 = i3 + 1;
                    dcmVar.b = sb2.j(interpolatorArr[i5].getInterpolation(xqv.b(i, iArr[i5], iArr2[i5])), 0.0f, 1.0f);
                }
                if (dVar.h) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((dcm) it.next()).c = dVar.f.e[dVar.g];
                    }
                    dVar.h = false;
                }
                dVar.a.invalidateSelf();
            }
        };
    }

    public d(Context context, gjy gjyVar) {
        super(2);
        this.g = 0;
        this.j = null;
        this.f = gjyVar;
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, mmg0.linear_indeterminate_line1_head_interpolator);
        y5e.H(loadInterpolator, "Failed to parse interpolator, no start tag found");
        Interpolator loadInterpolator2 = AnimationUtils.loadInterpolator(context, mmg0.linear_indeterminate_line1_tail_interpolator);
        y5e.H(loadInterpolator2, "Failed to parse interpolator, no start tag found");
        Interpolator loadInterpolator3 = AnimationUtils.loadInterpolator(context, mmg0.linear_indeterminate_line2_head_interpolator);
        y5e.H(loadInterpolator3, "Failed to parse interpolator, no start tag found");
        Interpolator loadInterpolator4 = AnimationUtils.loadInterpolator(context, mmg0.linear_indeterminate_line2_tail_interpolator);
        y5e.H(loadInterpolator4, "Failed to parse interpolator, no start tag found");
        this.e = new Interpolator[]{loadInterpolator, loadInterpolator2, loadInterpolator3, loadInterpolator4};
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
        gjy gjyVar = this.f;
        objectAnimator.setDuration((long) (gjyVar.n * 1800.0f));
        this.d.setDuration((long) (gjyVar.n * 1800.0f));
        i();
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
        a();
        if (this.a.isVisible()) {
            this.d.setFloatValues(this.i, 1.0f);
            this.d.setDuration((long) ((1.0f - this.i) * 1800.0f));
            this.d.start();
        }
    }

    @Override // defpackage.xqv
    public final void f() {
        h();
        i();
        this.c.start();
    }

    @Override // defpackage.xqv
    public final void g() {
        this.j = null;
    }

    public final void h() {
        ObjectAnimator objectAnimator = this.c;
        gjy gjyVar = this.f;
        Property property = m;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<d, Float>) property, 0.0f, 1.0f);
            this.c = ofFloat;
            ofFloat.setDuration((long) (gjyVar.n * 1800.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    d dVar = d.this;
                    dVar.g = (dVar.g + 1) % dVar.f.e.length;
                    dVar.h = true;
                }
            });
        }
        if (this.d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<d, Float>) property, 1.0f);
            this.d = ofFloat2;
            ofFloat2.setDuration((long) (gjyVar.n * 1800.0f));
            this.d.setInterpolator(null);
            this.d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    d.this.a();
                    d dVar = d.this;
                    Animatable2Compat.a aVar = dVar.j;
                    if (aVar != null) {
                        aVar.a(dVar.a);
                    }
                }
            });
        }
    }

    public final void i() {
        this.g = 0;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((dcm) it.next()).c = this.f.e[0];
        }
    }
}
