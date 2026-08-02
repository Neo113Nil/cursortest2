package com.google.android.material.card;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import defpackage.dyk0;
import defpackage.eng0;
import defpackage.fhr0;
import defpackage.kp50;
import defpackage.leh0;
import defpackage.lnf;
import defpackage.mj2;
import defpackage.o3i0;
import defpackage.v0i0;
import defpackage.yso;
import defpackage.zre;

/* loaded from: classes11.dex */
public final class a {
    public static final double z = Math.cos(Math.toRadians(45.0d));
    public final MaterialCardView a;
    public final MaterialShapeDrawable c;
    public final MaterialShapeDrawable d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Drawable j;
    public Drawable k;
    public ColorStateList l;
    public ColorStateList m;
    public fhr0 n;
    public ColorStateList o;
    public RippleDrawable p;
    public LayerDrawable q;
    public MaterialShapeDrawable r;
    public boolean t;
    public ValueAnimator u;
    public final TimeInterpolator v;
    public final int w;
    public final int x;
    public final Rect b = new Rect();
    public boolean s = false;
    public float y = 0.0f;

    public a(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.e = -1.0f;
        this.a = materialCardView;
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, o3i0.CardView, i, v0i0.CardView);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(materialCardView.getContext(), attributeSet, i, i2);
        this.c = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(materialCardView.getContext());
        materialShapeDrawable.setShadowColor(-12303292);
        b.a m = materialShapeDrawable.getShapeAppearanceModel().m();
        if (obtainStyledAttributes.hasValue(o3i0.CardView_cardCornerRadius)) {
            float dimension = obtainStyledAttributes.getDimension(o3i0.CardView_cardCornerRadius, 0.0f);
            this.e = dimension;
            m.c(dimension);
        }
        this.d = new MaterialShapeDrawable();
        h(m.a());
        this.v = kp50.P(materialCardView.getContext(), eng0.motionEasingLinearInterpolator, mj2.a);
        this.w = kp50.O(materialCardView.getContext(), eng0.motionDurationShort2, 300);
        this.x = kp50.O(materialCardView.getContext(), eng0.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(zre zreVar, float f) {
        if (zreVar instanceof dyk0) {
            return (float) ((1.0d - z) * f);
        }
        if (zreVar instanceof lnf) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        float f = 0.0f;
        for (b bVar : this.n.d()) {
            if (bVar != null) {
                zre zreVar = bVar.a;
                MaterialShapeDrawable materialShapeDrawable = this.c;
                f = Math.max(f, Math.max(Math.max(b(zreVar, materialShapeDrawable.getTopLeftCornerResolvedSize()), b(bVar.b, materialShapeDrawable.getTopRightCornerResolvedSize())), Math.max(b(bVar.c, materialShapeDrawable.getBottomRightCornerResolvedSize()), b(bVar.d, materialShapeDrawable.getBottomLeftCornerResolvedSize()))));
            }
        }
        return f;
    }

    public final LayerDrawable c() {
        if (this.p == null) {
            this.r = new MaterialShapeDrawable(this.n);
            this.p = new RippleDrawable(this.l, null, this.r);
        }
        if (this.q == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.p, this.d, this.k});
            FocusRingDrawable.layer(this.a.getContext(), layerDrawable, this.r);
            layerDrawable.setId(2, leh0.mtrl_card_checked_layer_id);
            this.q = layerDrawable;
        }
        return this.q;
    }

    public final Drawable d(final Drawable drawable) {
        final int i;
        final int i2;
        if (this.a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            i = (int) Math.ceil(r0.getMaxCardElevation() + (i() ? a() : 0.0f));
            i2 = ceil;
        } else {
            i = 0;
            i2 = 0;
        }
        final int i3 = i;
        final int i4 = i2;
        return new InsetDrawable(drawable, i, i2, i3, i4) { // from class: com.google.android.material.card.MaterialCardViewHelper$1
            @Override // android.graphics.drawable.Drawable
            public int getMinimumHeight() {
                return -1;
            }

            @Override // android.graphics.drawable.Drawable
            public int getMinimumWidth() {
                return -1;
            }

            @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
            public boolean getPadding(Rect rect) {
                return false;
            }
        };
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.q != null) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getUseCompatPadding()) {
                i3 = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                i4 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            int i7 = this.h;
            boolean z2 = (i7 & 8388613) == 8388613;
            int i8 = this.f;
            int i9 = z2 ? ((i - i8) - this.g) - i4 : i8;
            int i10 = (i7 & 80) == 80 ? i8 : ((i2 - i8) - this.g) - i3;
            int i11 = (i7 & 8388613) == 8388613 ? i8 : ((i - i8) - this.g) - i4;
            if ((i7 & 80) == 80) {
                i8 = ((i2 - i8) - this.g) - i3;
            }
            int i12 = i8;
            if (materialCardView.getLayoutDirection() == 1) {
                i6 = i11;
                i5 = i9;
            } else {
                i5 = i11;
                i6 = i9;
            }
            this.q.setLayerInset(2, i6, i12, i5, i10);
        }
    }

    public final void f(boolean z2, boolean z3) {
        Drawable drawable = this.k;
        if (drawable != null) {
            if (!z3) {
                drawable.setAlpha(z2 ? 255 : 0);
                this.y = z2 ? 1.0f : 0.0f;
                return;
            }
            float f = z2 ? 1.0f : 0.0f;
            float f2 = this.y;
            if (z2) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.u;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.u = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, f);
            this.u = ofFloat;
            ofFloat.addUpdateListener(new yso(9, this));
            this.u.setInterpolator(this.v);
            this.u.setDuration((long) ((z2 ? this.w : this.x) * f2));
            this.u.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.k = mutate;
            mutate.setTintList(this.m);
            f(this.a.isChecked(), false);
        } else {
            this.k = null;
        }
        LayerDrawable layerDrawable = this.q;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(leh0.mtrl_card_checked_layer_id, this.k);
        }
    }

    public final void h(fhr0 fhr0Var) {
        this.n = fhr0Var;
        MaterialShapeDrawable materialShapeDrawable = this.c;
        materialShapeDrawable.setShapeAppearance(fhr0Var);
        this.d.setShapeAppearance(fhr0Var);
        MaterialShapeDrawable materialShapeDrawable2 = this.r;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearance(fhr0Var);
        }
        materialShapeDrawable.setShadowBitmapDrawingEnable(!materialShapeDrawable.isRoundRect());
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.a;
        return materialCardView.getPreventCornerOverlap() && this.c.isRoundRect() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.j;
        Drawable c = j() ? c() : this.d;
        this.j = c;
        if (drawable != c) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(c);
            } else {
                materialCardView.setForeground(d(c));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.a;
        float f = 0.0f;
        float a = ((!materialCardView.getPreventCornerOverlap() || this.c.isRoundRect()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f = (float) ((1.0d - z) * materialCardView.getCardViewRadius());
        }
        int i = (int) (a - f);
        Rect rect = this.b;
        materialCardView.setAncestorContentPadding(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
    }

    public final void m() {
        boolean z2 = this.s;
        MaterialCardView materialCardView = this.a;
        if (!z2) {
            materialCardView.setBackgroundInternal(d(this.c));
        }
        materialCardView.setForeground(d(this.j));
    }
}
