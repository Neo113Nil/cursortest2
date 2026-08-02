package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewGroup;
import defpackage.ab30;
import defpackage.dk2;
import defpackage.nmg0;
import defpackage.vwo;

/* loaded from: classes11.dex */
public final class b extends a {
    public final vwo g;
    public final boolean h;
    public final /* synthetic */ ExtendedFloatingActionButton i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ExtendedFloatingActionButton extendedFloatingActionButton, dk2 dk2Var, vwo vwoVar, boolean z) {
        super(extendedFloatingActionButton, dk2Var);
        this.i = extendedFloatingActionButton;
        this.g = vwoVar;
        this.h = z;
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final void a() {
        this.d.a = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        extendedFloatingActionButton.isTransforming = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        vwo vwoVar = this.g;
        layoutParams.width = vwoVar.g().width;
        layoutParams.height = vwoVar.g().height;
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final boolean b() {
        boolean z;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        z = extendedFloatingActionButton.isExtended;
        return this.h == z || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final int c() {
        return this.h ? nmg0.mtrl_extended_fab_change_size_expand_motion_spec : nmg0.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // com.google.android.material.floatingactionbutton.a, com.google.android.material.floatingactionbutton.g
    public final AnimatorSet d() {
        ab30 ab30Var = this.f;
        if (ab30Var == null) {
            if (this.e == null) {
                this.e = ab30.b(c(), this.a);
            }
            ab30Var = this.e;
            ab30Var.getClass();
        }
        boolean g = ab30Var.g("width");
        vwo vwoVar = this.g;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        if (g) {
            PropertyValuesHolder[] e = ab30Var.e("width");
            e[0].setFloatValues(extendedFloatingActionButton.getWidth(), vwoVar.getWidth());
            ab30Var.h("width", e);
        }
        if (ab30Var.g("height")) {
            PropertyValuesHolder[] e2 = ab30Var.e("height");
            e2[0].setFloatValues(extendedFloatingActionButton.getHeight(), vwoVar.getHeight());
            ab30Var.h("height", e2);
        }
        if (ab30Var.g("paddingStart")) {
            PropertyValuesHolder[] e3 = ab30Var.e("paddingStart");
            e3[0].setFloatValues(extendedFloatingActionButton.getPaddingStart(), vwoVar.getPaddingStart());
            ab30Var.h("paddingStart", e3);
        }
        if (ab30Var.g("paddingEnd")) {
            PropertyValuesHolder[] e4 = ab30Var.e("paddingEnd");
            e4[0].setFloatValues(extendedFloatingActionButton.getPaddingEnd(), vwoVar.getPaddingEnd());
            ab30Var.h("paddingEnd", e4);
        }
        if (ab30Var.g("labelOpacity")) {
            PropertyValuesHolder[] e5 = ab30Var.e("labelOpacity");
            int alpha = Color.alpha(extendedFloatingActionButton.getCurrentOriginalTextColor());
            e5[0].setFloatValues(alpha != 0 ? Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / alpha : 0.0f, this.h ? 1.0f : 0.0f);
            ab30Var.h("labelOpacity", e5);
        }
        return g(ab30Var);
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final void e() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        boolean z = this.h;
        extendedFloatingActionButton.isExtended = z;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!z) {
            extendedFloatingActionButton.originalWidth = layoutParams.width;
            extendedFloatingActionButton.originalHeight = layoutParams.height;
        }
        vwo vwoVar = this.g;
        layoutParams.width = vwoVar.g().width;
        layoutParams.height = vwoVar.g().height;
        if (z) {
            extendedFloatingActionButton.silentlyUpdateTextColor(extendedFloatingActionButton.originalTextCsl);
        } else if (extendedFloatingActionButton.getText() != null && extendedFloatingActionButton.getText() != "") {
            extendedFloatingActionButton.silentlyUpdateTextColor(ColorStateList.valueOf(0));
        }
        extendedFloatingActionButton.setPaddingRelative(vwoVar.getPaddingStart(), extendedFloatingActionButton.getPaddingTop(), vwoVar.getPaddingEnd(), extendedFloatingActionButton.getPaddingBottom());
        extendedFloatingActionButton.requestLayout();
        extendedFloatingActionButton.updateTooltip();
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final void onAnimationStart(Animator animator) {
        dk2 dk2Var = this.d;
        Animator animator2 = dk2Var.a;
        if (animator2 != null) {
            animator2.cancel();
        }
        dk2Var.a = animator;
        boolean z = this.h;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        extendedFloatingActionButton.isExtended = z;
        extendedFloatingActionButton.isTransforming = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
        extendedFloatingActionButton.updateTooltip();
    }
}
