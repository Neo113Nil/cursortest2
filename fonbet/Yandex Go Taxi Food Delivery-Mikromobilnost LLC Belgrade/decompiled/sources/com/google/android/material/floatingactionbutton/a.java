package com.google.android.material.floatingactionbutton;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import defpackage.ab30;
import defpackage.ck2;
import defpackage.dk2;
import defpackage.lhc;
import defpackage.mj2;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class a implements g {
    public final Context a;
    public final ExtendedFloatingActionButton b;
    public final ArrayList c = new ArrayList();
    public final dk2 d;
    public ab30 e;
    public ab30 f;

    public a(ExtendedFloatingActionButton extendedFloatingActionButton, dk2 dk2Var) {
        this.b = extendedFloatingActionButton;
        this.a = extendedFloatingActionButton.getContext();
        this.d = dk2Var;
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public AnimatorSet d() {
        ab30 ab30Var = this.f;
        if (ab30Var == null) {
            if (this.e == null) {
                this.e = ab30.b(c(), this.a);
            }
            ab30Var = this.e;
            ab30Var.getClass();
        }
        return g(ab30Var);
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public void f() {
        this.d.a = null;
    }

    public final AnimatorSet g(ab30 ab30Var) {
        ArrayList arrayList = new ArrayList();
        boolean g = ab30Var.g("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        if (g) {
            arrayList.add(ab30Var.d("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (ab30Var.g("scale")) {
            arrayList.add(ab30Var.d("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(ab30Var.d("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (ab30Var.g("width")) {
            arrayList.add(ab30Var.d("width", extendedFloatingActionButton, ExtendedFloatingActionButton.WIDTH));
        }
        if (ab30Var.g("height")) {
            arrayList.add(ab30Var.d("height", extendedFloatingActionButton, ExtendedFloatingActionButton.HEIGHT));
        }
        if (ab30Var.g("paddingStart")) {
            arrayList.add(ab30Var.d("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.PADDING_START));
        }
        if (ab30Var.g("paddingEnd")) {
            arrayList.add(ab30Var.d("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.PADDING_END));
        }
        if (ab30Var.g("labelOpacity")) {
            final Class<Float> cls = Float.class;
            final String str = "LABEL_OPACITY_PROPERTY";
            arrayList.add(ab30Var.d("labelOpacity", extendedFloatingActionButton, new Property<ExtendedFloatingActionButton, Float>(cls, str) { // from class: com.google.android.material.floatingactionbutton.BaseMotionStrategy$1
                @Override // android.util.Property
                public Float get(ExtendedFloatingActionButton extendedFloatingActionButton2) {
                    int alpha = Color.alpha(extendedFloatingActionButton2.getCurrentOriginalTextColor());
                    return Float.valueOf(alpha != 0 ? Color.alpha(extendedFloatingActionButton2.getCurrentTextColor()) / alpha : 0.0f);
                }

                @Override // android.util.Property
                public void set(ExtendedFloatingActionButton extendedFloatingActionButton2, Float f) {
                    if (f.floatValue() == 1.0f) {
                        extendedFloatingActionButton2.silentlyUpdateTextColor(extendedFloatingActionButton2.getOriginalTextColor());
                    } else {
                        extendedFloatingActionButton2.silentlyUpdateTextColor(ColorStateList.valueOf(lhc.f(extendedFloatingActionButton2.getCurrentOriginalTextColor(), Math.round(mj2.a(0.0f, Color.alpha(r2), f.floatValue())))));
                    }
                }
            }));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ck2.a(animatorSet, arrayList);
        return animatorSet;
    }
}
