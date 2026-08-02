package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class kuj0 {
    public static kuj0 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public yuf0 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final juj0 h = new juj0(6);

    public static synchronized kuj0 c() {
        kuj0 kuj0Var;
        synchronized (kuj0.class) {
            try {
                if (g == null) {
                    g = new kuj0();
                }
                kuj0Var = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kuj0Var;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (kuj0.class) {
            juj0 juj0Var = h;
            juj0Var.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) juj0Var.c(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        pnt0 pnt0Var = (pnt0) this.a.get(context);
        if (pnt0Var == null) {
            pnt0Var = new pnt0();
            this.a.put(context, pnt0Var);
        }
        int i2 = pnt0Var.w;
        if (i2 != 0 && i <= pnt0Var.b[i2 - 1]) {
            pnt0Var.d(i, colorStateList);
            return;
        }
        if (pnt0Var.a && i2 >= pnt0Var.b.length) {
            kp50.a(pnt0Var);
        }
        int i3 = pnt0Var.w;
        if (i3 >= pnt0Var.b.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            pnt0Var.b = Arrays.copyOf(pnt0Var.b, i7);
            pnt0Var.c = Arrays.copyOf(pnt0Var.c, i7);
        }
        pnt0Var.b[i3] = i;
        pnt0Var.c[i3] = colorStateList;
        pnt0Var.w = i3 + 1;
    }

    public final Drawable b(int i, Context context) {
        LayerDrawable layerDrawable;
        Drawable newDrawable;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            rnz rnzVar = (rnz) this.b.get(context);
            layerDrawable = null;
            if (rnzVar != null) {
                WeakReference weakReference = (WeakReference) rnzVar.c(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        newDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        rnzVar.i(j);
                    }
                }
            }
            newDrawable = null;
        }
        if (newDrawable != null) {
            return newDrawable;
        }
        if (this.e != null) {
            if (i == t4h0.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{d(t4h0.abc_cab_background_internal_bg, context), d(t4h0.abc_cab_background_top_mtrl_alpha, context)});
            } else if (i == t4h0.abc_ratingbar_material) {
                layerDrawable = yuf0.z(this, context, rwg0.abc_star_big);
            } else if (i == t4h0.abc_ratingbar_indicator_material) {
                layerDrawable = yuf0.z(this, context, rwg0.abc_star_medium);
            } else if (i == t4h0.abc_ratingbar_small_material) {
                layerDrawable = yuf0.z(this, context, rwg0.abc_star_small);
            }
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                if (constantState2 == null) {
                    return layerDrawable;
                }
                rnz rnzVar2 = (rnz) this.b.get(context);
                if (rnzVar2 == null) {
                    rnzVar2 = new rnz();
                    this.b.put(context, rnzVar2);
                }
                rnzVar2.h(j, new WeakReference(constantState2));
                return layerDrawable;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable d(int i, Context context) {
        return e(context, i, false);
    }

    public final synchronized Drawable e(Context context, int i, boolean z) {
        Drawable b;
        try {
            if (!this.d) {
                this.d = true;
                Drawable d = d(y0h0.abc_vector_test, context);
                if (d == null || (!(d instanceof VectorDrawableCompat) && !"android.graphics.drawable.VectorDrawable".equals(d.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            b = b(i, context);
            if (b == null) {
                b = context.getDrawable(i);
            }
            if (b != null) {
                b = h(context, i, z, b);
            }
            if (b != null) {
                vbm.a(b);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public final synchronized ColorStateList g(int i, Context context) {
        ColorStateList colorStateList;
        pnt0 pnt0Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (pnt0Var = (pnt0) weakHashMap.get(context)) == null) ? null : (ColorStateList) pnt0Var.b(i);
        if (colorStateList == null) {
            yuf0 yuf0Var = this.e;
            if (yuf0Var != null) {
                colorStateList2 = yuf0Var.B(i, context);
            }
            if (colorStateList2 != null) {
                a(context, i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable h(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList g2 = g(i, context);
        PorterDuff.Mode mode = null;
        if (g2 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(g2);
            if (this.e != null && i == t4h0.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        if (this.e != null) {
            if (i == t4h0.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int c = vwy0.c(iog0.colorControlNormal, context);
                PorterDuff.Mode mode2 = or2.b;
                yuf0.N(findDrawableByLayerId, c, mode2);
                yuf0.N(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), vwy0.c(iog0.colorControlNormal, context), mode2);
                yuf0.N(layerDrawable.findDrawableByLayerId(R.id.progress), vwy0.c(iog0.colorControlActivated, context), mode2);
                return drawable;
            }
            if (i == t4h0.abc_ratingbar_material || i == t4h0.abc_ratingbar_indicator_material || i == t4h0.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
                int b = vwy0.b(iog0.colorControlNormal, context);
                PorterDuff.Mode mode3 = or2.b;
                yuf0.N(findDrawableByLayerId2, b, mode3);
                yuf0.N(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), vwy0.c(iog0.colorControlActivated, context), mode3);
                yuf0.N(layerDrawable2.findDrawableByLayerId(R.id.progress), vwy0.c(iog0.colorControlActivated, context), mode3);
                return drawable;
            }
        }
        if (i(context, i, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Context context, int i, Drawable drawable) {
        int i2;
        boolean z;
        int round;
        yuf0 yuf0Var = this.e;
        if (yuf0Var != null) {
            PorterDuff.Mode mode = or2.b;
            if (yuf0.l(i, (int[]) yuf0Var.a)) {
                i2 = iog0.colorControlNormal;
            } else if (yuf0.l(i, (int[]) yuf0Var.c)) {
                i2 = iog0.colorControlActivated;
            } else {
                if (yuf0.l(i, (int[]) yuf0Var.d)) {
                    mode = PorterDuff.Mode.MULTIPLY;
                } else if (i == t4h0.abc_list_divider_mtrl_alpha) {
                    round = Math.round(40.8f);
                    i2 = 16842800;
                    z = true;
                    if (z) {
                        Drawable mutate = drawable.mutate();
                        mutate.setColorFilter(or2.c(vwy0.c(i2, context), mode));
                        if (round != -1) {
                            mutate.setAlpha(round);
                        }
                        return true;
                    }
                } else if (i != t4h0.abc_dialog_material_background) {
                    i2 = 0;
                    z = false;
                    round = -1;
                    if (z) {
                    }
                }
                i2 = 16842801;
            }
            z = true;
            round = -1;
            if (z) {
            }
        }
        return false;
    }
}
