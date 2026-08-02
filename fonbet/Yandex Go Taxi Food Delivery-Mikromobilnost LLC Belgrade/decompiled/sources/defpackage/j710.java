package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;

/* loaded from: classes11.dex */
public final class j710 {
    public final MaterialButton a;
    public fhr0 b;
    public owt0 c;
    public x710 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public PorterDuff.Mode k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public MaterialShapeDrawable o;
    public boolean s;
    public RippleDrawable u;
    public int v;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean t = true;

    public j710(MaterialButton materialButton, fhr0 fhr0Var) {
        this.a = materialButton;
        this.b = fhr0Var;
    }

    public final MaterialShapeDrawable a(boolean z) {
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.u.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i, int i2, int i3, int i4) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.e;
        int i6 = this.g;
        int i7 = this.f;
        int i8 = this.h;
        this.e = i;
        this.g = i2;
        this.f = i3;
        this.h = i4;
        if (!this.q) {
            c();
        }
        materialButton.setPaddingRelative((paddingStart + i) - i5, (paddingTop + i2) - i6, (paddingEnd + i3) - i7, (paddingBottom + i4) - i8);
    }

    public final void c() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.b);
        owt0 owt0Var = this.c;
        if (owt0Var != null) {
            materialShapeDrawable.setCornerSpringForce(owt0Var);
        }
        x710 x710Var = this.d;
        if (x710Var != null) {
            materialShapeDrawable.setOnCornerSizeChangeListener(x710Var);
        }
        MaterialButton materialButton = this.a;
        Context context = materialButton.getContext();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setTintList(this.l);
        PorterDuff.Mode mode = this.k;
        if (mode != null) {
            materialShapeDrawable.setTintMode(mode);
        }
        materialShapeDrawable.setStroke(this.j, this.m);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.b);
        owt0 owt0Var2 = this.c;
        if (owt0Var2 != null) {
            materialShapeDrawable2.setCornerSpringForce(owt0Var2);
        }
        materialShapeDrawable2.setTint(0);
        materialShapeDrawable2.setStroke(this.j, this.p ? vez0.T(materialButton.getContext(), z610.e(eng0.colorSurface, materialButton)) : 0);
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.b);
        this.o = materialShapeDrawable3;
        owt0 owt0Var3 = this.c;
        if (owt0Var3 != null) {
            materialShapeDrawable3.setCornerSpringForce(owt0Var3);
        }
        this.o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(tt91.e(this.n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable}), this.e, this.g, this.f, this.h), this.o);
        this.u = rippleDrawable;
        FocusRingDrawable.layer(context, rippleDrawable);
        materialButton.setInternalBackground(this.u);
        MaterialShapeDrawable a = a(false);
        if (a != null) {
            a.setElevation(this.v);
            a.setState(materialButton.getDrawableState());
        }
        FocusRingDrawable find = FocusRingDrawable.find(materialButton.getBackground());
        if (find != null) {
            find.setFocusRingMaterialShapeDrawable(a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        uir0 uir0Var;
        MaterialShapeDrawable a = a(false);
        if (a != null) {
            a.setShapeAppearance(this.b);
            owt0 owt0Var = this.c;
            if (owt0Var != null) {
                a.setCornerSpringForce(owt0Var);
            }
        }
        MaterialShapeDrawable a2 = a(true);
        if (a2 != null) {
            a2.setShapeAppearance(this.b);
            owt0 owt0Var2 = this.c;
            if (owt0Var2 != null) {
                a2.setCornerSpringForce(owt0Var2);
            }
        }
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable != null) {
            Object findDrawableByLayerId = rippleDrawable.findDrawableByLayerId(R.id.mask);
            if (findDrawableByLayerId instanceof uir0) {
                uir0Var = (uir0) findDrawableByLayerId;
                if (uir0Var == null) {
                    boolean z = uir0Var instanceof MaterialShapeDrawable;
                    fhr0 fhr0Var = this.b;
                    if (!z) {
                        uir0Var.setShapeAppearanceModel(fhr0Var.c());
                        return;
                    }
                    MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) uir0Var;
                    materialShapeDrawable.setShapeAppearance(fhr0Var);
                    owt0 owt0Var3 = this.c;
                    if (owt0Var3 != null) {
                        materialShapeDrawable.setCornerSpringForce(owt0Var3);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        uir0Var = null;
        if (uir0Var == null) {
        }
    }

    public final void e() {
        int i = 0;
        MaterialShapeDrawable a = a(false);
        MaterialShapeDrawable a2 = a(true);
        if (a != null) {
            a.setStroke(this.j, this.m);
            if (a2 != null) {
                float f = this.j;
                if (this.p) {
                    int i2 = eng0.colorSurface;
                    MaterialButton materialButton = this.a;
                    i = vez0.T(materialButton.getContext(), z610.e(i2, materialButton));
                }
                a2.setStroke(f, i);
            }
        }
    }
}
