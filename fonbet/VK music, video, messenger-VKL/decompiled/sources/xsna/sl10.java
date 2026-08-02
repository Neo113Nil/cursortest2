package xsna;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;

/* compiled from: MaterialButtonHelper.java */
/* loaded from: classes13.dex */
public final class sl10 {
    public final MaterialButton a;

    @NonNull
    public com.google.android.material.shape.a b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    @Nullable
    public PorterDuff.Mode i;

    @Nullable
    public ColorStateList j;

    @Nullable
    public ColorStateList k;

    @Nullable
    public ColorStateList l;

    @Nullable
    public MaterialShapeDrawable m;
    public boolean q;
    public RippleDrawable s;
    public int t;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    public sl10(MaterialButton materialButton, @NonNull com.google.android.material.shape.a aVar) {
        this.a = materialButton;
        this.b = aVar;
    }

    @Nullable
    public final l6j0 a() {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.s.getNumberOfLayers() > 2 ? (l6j0) this.s.getDrawable(2) : (l6j0) this.s.getDrawable(1);
    }

    @Nullable
    public final MaterialShapeDrawable b(boolean z) {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void c(@NonNull com.google.android.material.shape.a aVar) {
        this.b = aVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(aVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(aVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(aVar);
        }
    }

    public final void d(int i, int i2) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.b);
        MaterialButton materialButton = this.a;
        materialShapeDrawable.initializeElevationOverlay(materialButton.getContext());
        materialShapeDrawable.setTintList(this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            materialShapeDrawable.setTintMode(mode);
        }
        materialShapeDrawable.setStroke(this.h, this.k);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.b);
        materialShapeDrawable2.setTint(0);
        materialShapeDrawable2.setStroke(this.h, this.n ? dm10.d(R$attr.colorSurface, materialButton) : 0);
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.b);
        this.m = materialShapeDrawable3;
        materialShapeDrawable3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(olg0.c(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable}), this.c, this.e, this.d, this.f), this.m);
        this.s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        MaterialShapeDrawable b = b(false);
        if (b != null) {
            b.setElevation(this.t);
            b.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i = 0;
        MaterialShapeDrawable b = b(false);
        MaterialShapeDrawable b2 = b(true);
        if (b != null) {
            b.setStroke(this.h, this.k);
            if (b2 != null) {
                float f = this.h;
                if (this.n) {
                    i = dm10.d(R$attr.colorSurface, this.a);
                }
                b2.setStroke(f, i);
            }
        }
    }
}
