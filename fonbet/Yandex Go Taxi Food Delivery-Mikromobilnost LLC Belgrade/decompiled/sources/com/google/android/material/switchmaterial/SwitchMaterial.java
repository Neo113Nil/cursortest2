package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.internal.e;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.iog0;
import defpackage.org0;
import defpackage.vez0;
import defpackage.yqn;
import defpackage.yvy0;
import defpackage.z2i0;
import defpackage.z610;

/* loaded from: classes11.dex */
public class SwitchMaterial extends SwitchCompat {
    private static final int DEF_STYLE_RES = g2i0.Widget_MaterialComponents_CompoundButton_Switch;
    private static final int[][] ENABLED_CHECKED_STATES = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private final yqn elevationOverlayProvider;
    private ColorStateList materialThemeColorsThumbTintList;
    private ColorStateList materialThemeColorsTrackTintList;
    private boolean useMaterialThemeColors;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SwitchMaterial(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, r4), attributeSet, i);
        int i2 = DEF_STYLE_RES;
        Context context2 = getContext();
        this.elevationOverlayProvider = new yqn(context2);
        int[] iArr = z2i0.SwitchMaterial;
        yvy0.a(context2, attributeSet, i, i2);
        yvy0.b(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.useMaterialThemeColors = obtainStyledAttributes.getBoolean(z2i0.SwitchMaterial_useMaterialThemeColors, false);
        obtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.materialThemeColorsThumbTintList == null) {
            int T = vez0.T(getContext(), z610.e(eng0.colorSurface, this));
            int T2 = vez0.T(getContext(), z610.e(iog0.colorControlActivated, this));
            float dimension = getResources().getDimension(org0.mtrl_switch_thumb_elevation);
            if (this.elevationOverlayProvider.a) {
                dimension += e.g(this);
            }
            int a = this.elevationOverlayProvider.a(dimension, T);
            int[][] iArr = ENABLED_CHECKED_STATES;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = vez0.Q(1.0f, T, T2);
            iArr2[1] = a;
            iArr2[2] = vez0.Q(0.38f, T, T2);
            iArr2[3] = a;
            this.materialThemeColorsThumbTintList = new ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsThumbTintList;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.materialThemeColorsTrackTintList == null) {
            int[][] iArr = ENABLED_CHECKED_STATES;
            int[] iArr2 = new int[iArr.length];
            int T = vez0.T(getContext(), z610.e(eng0.colorSurface, this));
            int T2 = vez0.T(getContext(), z610.e(iog0.colorControlActivated, this));
            int T3 = vez0.T(getContext(), z610.e(eng0.colorOnSurface, this));
            iArr2[0] = vez0.Q(0.54f, T, T2);
            iArr2[1] = vez0.Q(0.32f, T, T3);
            iArr2[2] = vez0.Q(0.12f, T, T2);
            iArr2[3] = vez0.Q(0.12f, T, T3);
            this.materialThemeColorsTrackTintList = new ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsTrackTintList;
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.useMaterialThemeColors && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.useMaterialThemeColors = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iog0.switchStyle);
    }

    public SwitchMaterial(Context context) {
        this(context, null);
    }
}
