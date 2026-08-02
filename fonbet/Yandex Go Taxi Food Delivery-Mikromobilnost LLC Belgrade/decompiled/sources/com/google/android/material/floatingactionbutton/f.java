package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Property;
import android.view.View;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.f;
import com.google.android.material.shape.MaterialShapeDrawable;
import defpackage.ab30;
import defpackage.ck2;
import defpackage.d6z;
import defpackage.eng0;
import defpackage.jjh0;
import defpackage.kb6;
import defpackage.kp50;
import defpackage.mj2;
import defpackage.mum;
import defpackage.qw01;
import defpackage.sr4;
import defpackage.tor;
import defpackage.uir0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class f {
    public static final FastOutLinearInInterpolator B = mj2.c;
    public static final int C = eng0.motionDurationLong2;
    public static final int D = eng0.motionEasingEmphasizedInterpolator;
    public static final int E = eng0.motionDurationMedium1;
    public static final int F = eng0.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] G = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] H = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] I = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] J = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] K = {R.attr.state_enabled};
    public static final int[] L = new int[0];
    public com.google.android.material.shape.b a;
    public MaterialShapeDrawable b;
    public RippleDrawable c;
    public BorderDrawable d;
    public RippleDrawable e;
    public boolean f;
    public float h;
    public float i;
    public float j;
    public int k;
    public StateListAnimator l;
    public Animator m;
    public ab30 n;
    public ab30 o;
    public int q;
    public ArrayList s;
    public ArrayList t;
    public ArrayList u;
    public final FloatingActionButton v;
    public final mum w;
    public boolean g = true;
    public float p = 1.0f;
    public int r = 0;
    public final Rect x = new Rect();
    public final RectF y = new RectF();
    public final RectF z = new RectF();
    public final Matrix A = new Matrix();

    public f(FloatingActionButton floatingActionButton, mum mumVar) {
        this.v = floatingActionButton;
        this.w = mumVar;
    }

    public final void a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.v.getDrawable();
        if (drawable == null || this.q == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.y;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        float f2 = this.q;
        RectF rectF2 = this.z;
        rectF2.set(0.0f, 0.0f, f2, f2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f3 = this.q / 2.0f;
        matrix.postScale(f, f, f3, f3);
    }

    public final AnimatorSet b(ab30 ab30Var, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.v;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        ab30Var.f("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        ab30Var.f("scale").a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        ab30Var.f("scale").a(ofFloat3);
        arrayList.add(ofFloat3);
        Matrix matrix = this.A;
        a(f3, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new ImageMatrixProperty(), new MatrixEvaluator() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.animation.MatrixEvaluator, android.animation.TypeEvaluator
            public Matrix evaluate(float f4, Matrix matrix2, Matrix matrix3) {
                f.this.p = f4;
                return super.evaluate(f4, matrix2, matrix3);
            }
        }, new Matrix(matrix));
        ab30Var.f("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        ck2.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f, final float f2, final float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.v;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f4 = this.p;
        final Matrix matrix = new Matrix(this.A);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vor
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f fVar = f.this;
                FloatingActionButton floatingActionButton2 = fVar.v;
                floatingActionButton2.setAlpha(mj2.b(alpha, f, 0.0f, 0.2f, floatValue));
                float f5 = scaleX;
                float f6 = f2;
                floatingActionButton2.setScaleX(mj2.a(f5, f6, floatValue));
                floatingActionButton2.setScaleY(mj2.a(scaleY, f6, floatValue));
                float f7 = f4;
                float f8 = f3;
                fVar.p = mj2.a(f7, f8, floatValue);
                float a = mj2.a(f7, f8, floatValue);
                Matrix matrix2 = matrix;
                fVar.a(a, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(ofFloat);
        ck2.a(animatorSet, arrayList);
        animatorSet.setDuration(kp50.O(floatingActionButton.getContext(), i, floatingActionButton.getContext().getResources().getInteger(jjh0.material_motion_duration_long_1)));
        animatorSet.setInterpolator(kp50.P(floatingActionButton.getContext(), i2, mj2.b));
        return animatorSet;
    }

    public final AnimatorSet d(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.v;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(B);
        return animatorSet;
    }

    public final void e(float f, float f2, float f3) {
        FloatingActionButton floatingActionButton = this.v;
        if (floatingActionButton.getStateListAnimator() == this.l) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(G, d(f, f3));
            stateListAnimator.addState(H, d(f, f2));
            stateListAnimator.addState(I, d(f, f2));
            stateListAnimator.addState(J, d(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(B);
            stateListAnimator.addState(K, animatorSet);
            stateListAnimator.addState(L, d(0.0f, 0.0f));
            this.l = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (((FloatingActionButton) this.w.a).compatPadding || (this.f && floatingActionButton.getSizeDimension() < this.k)) {
            i();
        }
    }

    public final void f() {
        MaterialShapeDrawable materialShapeDrawable;
        ArrayList arrayList = this.u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                tor torVar = (tor) it.next();
                qw01 qw01Var = torVar.a;
                FloatingActionButton floatingActionButton = torVar.b;
                sr4 sr4Var = (sr4) qw01Var;
                sr4Var.getClass();
                BottomAppBar bottomAppBar = (BottomAppBar) sr4Var.b;
                materialShapeDrawable = bottomAppBar.materialShapeDrawable;
                materialShapeDrawable.setInterpolation((floatingActionButton.getVisibility() == 0 && bottomAppBar.fabAnchorMode == 1) ? floatingActionButton.getScaleY() : 0.0f);
            }
        }
    }

    public final void g() {
        kb6 topEdgeTreatment;
        kb6 topEdgeTreatment2;
        MaterialShapeDrawable materialShapeDrawable;
        kb6 topEdgeTreatment3;
        MaterialShapeDrawable materialShapeDrawable2;
        kb6 topEdgeTreatment4;
        MaterialShapeDrawable materialShapeDrawable3;
        ArrayList arrayList = this.u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                tor torVar = (tor) it.next();
                qw01 qw01Var = torVar.a;
                FloatingActionButton floatingActionButton = torVar.b;
                sr4 sr4Var = (sr4) qw01Var;
                sr4Var.getClass();
                BottomAppBar bottomAppBar = (BottomAppBar) sr4Var.b;
                if (bottomAppBar.fabAnchorMode == 1) {
                    float translationX = floatingActionButton.getTranslationX();
                    topEdgeTreatment = bottomAppBar.getTopEdgeTreatment();
                    if (topEdgeTreatment.x != translationX) {
                        topEdgeTreatment4 = bottomAppBar.getTopEdgeTreatment();
                        topEdgeTreatment4.x = translationX;
                        materialShapeDrawable3 = bottomAppBar.materialShapeDrawable;
                        materialShapeDrawable3.invalidateSelf();
                    }
                    float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
                    topEdgeTreatment2 = bottomAppBar.getTopEdgeTreatment();
                    if (topEdgeTreatment2.w != max) {
                        topEdgeTreatment3 = bottomAppBar.getTopEdgeTreatment();
                        topEdgeTreatment3.c(max);
                        materialShapeDrawable2 = bottomAppBar.materialShapeDrawable;
                        materialShapeDrawable2.invalidateSelf();
                    }
                    materialShapeDrawable = bottomAppBar.materialShapeDrawable;
                    materialShapeDrawable.setInterpolation(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
                }
            }
        }
    }

    public final void h(com.google.android.material.shape.b bVar) {
        this.a = bVar;
        MaterialShapeDrawable materialShapeDrawable = this.b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(bVar);
        }
        Drawable.Callback callback = this.c;
        if (callback instanceof uir0) {
            ((uir0) callback).setShapeAppearanceModel(bVar);
        }
        BorderDrawable borderDrawable = this.d;
        if (borderDrawable != null) {
            borderDrawable.setShapeAppearanceModel(bVar);
        }
    }

    public final void i() {
        int i;
        int i2;
        int i3;
        int i4;
        mum mumVar = this.w;
        FloatingActionButton floatingActionButton = (FloatingActionButton) mumVar.a;
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) mumVar.a;
        boolean z = floatingActionButton.compatPadding;
        boolean z2 = this.f;
        Rect rect = this.x;
        FloatingActionButton floatingActionButton3 = this.v;
        if (z) {
            int max = z2 ? Math.max((this.k - floatingActionButton3.getSizeDimension()) / 2, 0) : 0;
            int max2 = Math.max(max, (int) Math.ceil(this.g ? floatingActionButton3.getElevation() + this.j : 0.0f));
            int max3 = Math.max(max, (int) Math.ceil(r1 * 1.5f));
            rect.set(max2, max3, max2, max3);
        } else {
            if (z2) {
                int sizeDimension = floatingActionButton3.getSizeDimension();
                int i5 = this.k;
                if (sizeDimension < i5) {
                    int sizeDimension2 = (i5 - floatingActionButton3.getSizeDimension()) / 2;
                    rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                }
            }
            rect.set(0, 0, 0, 0);
        }
        d6z.v(this.e, "Didn't initialize content background");
        if (((FloatingActionButton) mumVar.a).compatPadding || (this.f && floatingActionButton3.getSizeDimension() < this.k)) {
            super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            RippleDrawable rippleDrawable = this.e;
            if (rippleDrawable != null) {
                super/*android.view.View*/.setBackgroundDrawable(rippleDrawable);
            }
        }
        int i6 = rect.left;
        int i7 = rect.top;
        int i8 = rect.right;
        int i9 = rect.bottom;
        floatingActionButton2.shadowPadding.set(i6, i7, i8, i9);
        i = floatingActionButton2.imagePadding;
        int i10 = i + i6;
        i2 = floatingActionButton2.imagePadding;
        int i11 = i2 + i7;
        i3 = floatingActionButton2.imagePadding;
        int i12 = i3 + i8;
        i4 = floatingActionButton2.imagePadding;
        floatingActionButton2.setPadding(i10, i11, i12, i4 + i9);
    }
}
