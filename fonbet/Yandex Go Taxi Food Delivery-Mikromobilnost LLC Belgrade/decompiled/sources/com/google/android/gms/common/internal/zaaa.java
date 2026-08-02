package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import defpackage.cvw;
import defpackage.gxh0;
import defpackage.jqg0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.s4h0;
import defpackage.s8o;

/* loaded from: classes11.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        ny61.r(oyr.i(i, "Unknown color scheme: "));
        return 0;
    }

    public final void zaa(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = s4h0.common_google_signin_btn_icon_dark;
        int i5 = s4h0.common_google_signin_btn_icon_light;
        int zab = zab(i2, i4, i5, i5);
        int i6 = s4h0.common_google_signin_btn_text_dark;
        int i7 = s4h0.common_google_signin_btn_text_light;
        int zab2 = zab(i2, i6, i7, i7);
        if (i == 0 || i == 1) {
            zab = zab2;
        } else if (i != 2) {
            ny61.r(oyr.i(i, "Unknown button size: "));
            return;
        }
        Drawable drawable = resources.getDrawable(zab);
        drawable.setTintList(resources.getColorStateList(jqg0.common_google_signin_btn_tint));
        drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawable);
        int i8 = jqg0.common_google_signin_btn_text_dark;
        int i9 = jqg0.common_google_signin_btn_text_light;
        ColorStateList colorStateList = resources.getColorStateList(zab(i2, i8, i9, i9));
        cvw.l(colorStateList);
        setTextColor(colorStateList);
        if (i == 0) {
            setText(resources.getString(gxh0.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(gxh0.common_signin_button_text_long));
        } else {
            if (i != 2) {
                ny61.r(oyr.i(i, "Unknown button size: "));
                return;
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (s8o.F(getContext())) {
            setGravity(19);
        }
    }
}
