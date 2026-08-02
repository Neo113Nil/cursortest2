package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.iog0;
import defpackage.jx81;
import defpackage.vez0;
import defpackage.yvy0;
import defpackage.z2i0;
import defpackage.z610;

/* loaded from: classes11.dex */
public class MaterialRadioButton extends AppCompatRadioButton {
    private static final int DEF_STYLE_RES = g2i0.Widget_MaterialComponents_CompoundButton_RadioButton;
    private static final int[][] ENABLED_CHECKED_STATES = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList materialThemeColorsTintList;
    private boolean useMaterialThemeColors;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, r4), attributeSet, i);
        int i2 = DEF_STYLE_RES;
        Context context2 = getContext();
        TypedArray d = yvy0.d(context2, attributeSet, z2i0.MaterialRadioButton, i, i2, new int[0]);
        if (d.hasValue(z2i0.MaterialRadioButton_buttonTint)) {
            setButtonTintList(jx81.o(context2, d, z2i0.MaterialRadioButton_buttonTint));
        }
        if (d.hasValue(z2i0.MaterialRadioButton_rippleColor)) {
            setRippleColor(jx81.o(context2, d, z2i0.MaterialRadioButton_rippleColor));
        }
        this.useMaterialThemeColors = d.getBoolean(z2i0.MaterialRadioButton_useMaterialThemeColors, false);
        d.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.materialThemeColorsTintList == null) {
            int T = vez0.T(getContext(), z610.e(iog0.colorControlActivated, this));
            int T2 = vez0.T(getContext(), z610.e(eng0.colorOnSurface, this));
            int T3 = vez0.T(getContext(), z610.e(eng0.colorSurface, this));
            int[][] iArr = ENABLED_CHECKED_STATES;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = vez0.Q(1.0f, T3, T);
            iArr2[1] = vez0.Q(0.54f, T3, T2);
            iArr2[2] = vez0.Q(0.38f, T3, T2);
            iArr2[3] = vez0.Q(0.38f, T3, T2);
            this.materialThemeColorsTintList = new ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsTintList;
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.useMaterialThemeColors = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iog0.radioButtonStyle);
    }

    public MaterialRadioButton(Context context) {
        this(context, null);
    }
}
