package xsna;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$color;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: FloatingActionButtonImplLollipop.java */
/* loaded from: classes13.dex */
public final class zqr extends com.google.android.material.floatingactionbutton.d {

    @Nullable
    public StateListAnimator N;

    /* compiled from: FloatingActionButtonImplLollipop.java */
    public static class a extends MaterialShapeDrawable {
        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final float e() {
        return this.v.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void f(@NonNull Rect rect) {
        if (FloatingActionButton.this.l) {
            super.f(rect);
            return;
        }
        if (this.f) {
            FloatingActionButton floatingActionButton = this.v;
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i = this.k;
            if (sizeDimension < i) {
                int sizeDimension2 = (i - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void g(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        com.google.android.material.shape.a aVar = this.a;
        aVar.getClass();
        a aVar2 = new a(aVar);
        this.b = aVar2;
        aVar2.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        MaterialShapeDrawable materialShapeDrawable = this.b;
        FloatingActionButton floatingActionButton = this.v;
        materialShapeDrawable.initializeElevationOverlay(floatingActionButton.getContext());
        if (i > 0) {
            Context context = floatingActionButton.getContext();
            com.google.android.material.shape.a aVar3 = this.a;
            aVar3.getClass();
            m18 m18Var = new m18(aVar3);
            int color = context.getColor(R$color.design_fab_stroke_top_outer_color);
            int color2 = context.getColor(R$color.design_fab_stroke_top_inner_color);
            int color3 = context.getColor(R$color.design_fab_stroke_end_inner_color);
            int color4 = context.getColor(R$color.design_fab_stroke_end_outer_color);
            m18Var.i = color;
            m18Var.j = color2;
            m18Var.k = color3;
            m18Var.l = color4;
            float f = i;
            if (m18Var.h != f) {
                m18Var.h = f;
                m18Var.b.setStrokeWidth(f * 1.3333f);
                m18Var.n = true;
                m18Var.invalidateSelf();
            }
            if (colorStateList != null) {
                m18Var.m = colorStateList.getColorForState(m18Var.getState(), m18Var.m);
            }
            m18Var.p = colorStateList;
            m18Var.n = true;
            m18Var.invalidateSelf();
            this.d = m18Var;
            m18 m18Var2 = this.d;
            m18Var2.getClass();
            MaterialShapeDrawable materialShapeDrawable2 = this.b;
            materialShapeDrawable2.getClass();
            drawable = new LayerDrawable(new Drawable[]{m18Var2, materialShapeDrawable2});
        } else {
            this.d = null;
            drawable = this.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(olg0.c(colorStateList2), drawable, null);
        this.c = rippleDrawable;
        this.e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void i() {
        q();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void k(float f, float f2, float f3) {
        FloatingActionButton floatingActionButton = this.v;
        if (floatingActionButton.getStateListAnimator() == this.N) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.H, r(f, f3));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.I, r(f, f2));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.J, r(f, f2));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.K, r(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.d.C);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.L, animatorSet);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.M, r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            this.N = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (o()) {
            q();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void m(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(olg0.c(colorStateList));
        } else {
            super.m(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final boolean o() {
        if (FloatingActionButton.this.l) {
            return true;
        }
        return this.f && this.v.getSizeDimension() < this.k;
    }

    @NonNull
    public final AnimatorSet r(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.v;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.d.C);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void h() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void p() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void j(int[] iArr) {
    }
}
