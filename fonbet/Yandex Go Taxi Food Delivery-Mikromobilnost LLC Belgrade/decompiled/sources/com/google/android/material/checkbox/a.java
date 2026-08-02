package com.google.android.material.checkbox;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

/* loaded from: classes11.dex */
public final class a extends Animatable2Compat.a {
    public final /* synthetic */ MaterialCheckBox b;

    public a(MaterialCheckBox materialCheckBox) {
        this.b = materialCheckBox;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.a
    public final void a(Drawable drawable) {
        ColorStateList colorStateList = this.b.buttonTintList;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.a
    public final void b(Drawable drawable) {
        int[] iArr;
        MaterialCheckBox materialCheckBox = this.b;
        ColorStateList colorStateList = materialCheckBox.buttonTintList;
        if (colorStateList != null) {
            iArr = materialCheckBox.currentStateChecked;
            drawable.setTint(colorStateList.getColorForState(iArr, materialCheckBox.buttonTintList.getDefaultColor()));
        }
    }
}
