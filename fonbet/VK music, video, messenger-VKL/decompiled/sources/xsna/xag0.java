package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import xsna.d33;

/* compiled from: ResourceManagerInternal.java */
/* loaded from: classes.dex */
public final class xag0 {
    public static xag0 g;
    public WeakHashMap<Context, wik0<ColorStateList>> a;
    public final WeakHashMap<Context, x500<WeakReference<Drawable.ConstantState>>> b = new WeakHashMap<>(0);
    public TypedValue c;
    public boolean d;
    public d33.a e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final a h = new a(6);

    /* compiled from: ResourceManagerInternal.java */
    public static class a extends m900<Integer, PorterDuffColorFilter> {
    }

    public static synchronized xag0 b() {
        xag0 xag0Var;
        synchronized (xag0.class) {
            try {
                if (g == null) {
                    g = new xag0();
                }
                xag0Var = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xag0Var;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (xag0.class) {
            a aVar = h;
            aVar.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = aVar.get(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                aVar.put(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(int i, @NonNull Context context) {
        Drawable drawable;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            x500<WeakReference<Drawable.ConstantState>> x500Var = this.b.get(context);
            drawable = null;
            if (x500Var != null) {
                WeakReference<Drawable.ConstantState> weakReference = x500Var.get(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        x500Var.remove(j);
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(R.drawable.abc_cab_background_internal_bg, context), c(R.drawable.abc_cab_background_top_mtrl_alpha, context)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = d33.a.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = d33.a.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = d33.a.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                if (constantState2 != null) {
                    x500<WeakReference<Drawable.ConstantState>> x500Var2 = this.b.get(context);
                    if (x500Var2 == null) {
                        x500Var2 = new x500<>();
                        this.b.put(context, x500Var2);
                    }
                    x500Var2.put(j, new WeakReference<>(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(int i, @NonNull Context context) {
        return d(i, context, false);
    }

    public final synchronized Drawable d(int i, @NonNull Context context, boolean z) {
        Drawable a2;
        try {
            if (!this.d) {
                this.d = true;
                Drawable c = c(R.drawable.abc_vector_test, context);
                if (c == null || (!(c instanceof elr0) && !"android.graphics.drawable.VectorDrawable".equals(c.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a2 = a(i, context);
            if (a2 == null) {
                a2 = context.getDrawable(i);
            }
            if (a2 != null) {
                a2 = g(context, i, z, a2);
            }
            if (a2 != null) {
                rko.a(a2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    public final synchronized ColorStateList f(int i, @NonNull Context context) {
        ColorStateList g2;
        wik0<ColorStateList> wik0Var;
        WeakHashMap<Context, wik0<ColorStateList>> weakHashMap = this.a;
        ColorStateList colorStateList = null;
        g2 = (weakHashMap == null || (wik0Var = weakHashMap.get(context)) == null) ? null : wik0Var.g(i);
        if (g2 == null) {
            d33.a aVar = this.e;
            if (aVar != null) {
                colorStateList = aVar.d(i, context);
            }
            if (colorStateList != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap<>();
                }
                wik0<ColorStateList> wik0Var2 = this.a.get(context);
                if (wik0Var2 == null) {
                    wik0Var2 = new wik0<>();
                    this.a.put(context, wik0Var2);
                }
                wik0Var2.a(i, colorStateList);
            }
            g2 = colorStateList;
        }
        return g2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(@NonNull Context context, int i, boolean z, @NonNull Drawable drawable) {
        int i2;
        boolean z2;
        int round;
        ColorStateList f2 = f(i, context);
        PorterDuff.Mode mode = null;
        if (f2 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(f2);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c = qpo0.c(R.attr.colorControlNormal, context);
                PorterDuff.Mode mode2 = d33.b;
                d33.a.e(findDrawableByLayerId, c, mode2);
                d33.a.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), qpo0.c(R.attr.colorControlNormal, context), mode2);
                d33.a.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), qpo0.c(R.attr.colorControlActivated, context), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b = qpo0.b(R.attr.colorControlNormal, context);
                PorterDuff.Mode mode3 = d33.b;
                d33.a.e(findDrawableByLayerId2, b, mode3);
                d33.a.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), qpo0.c(R.attr.colorControlActivated, context), mode3);
                d33.a.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), qpo0.c(R.attr.colorControlActivated, context), mode3);
                return drawable;
            }
        }
        d33.a aVar = this.e;
        boolean z3 = false;
        if (aVar != null) {
            PorterDuff.Mode mode4 = d33.b;
            if (d33.a.a(i, aVar.a)) {
                i2 = R.attr.colorControlNormal;
            } else if (d33.a.a(i, aVar.c)) {
                i2 = R.attr.colorControlActivated;
            } else {
                if (d33.a.a(i, aVar.d)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                    round = Math.round(40.8f);
                    i2 = 16842800;
                    z2 = true;
                    if (z2) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(d33.c(qpo0.c(i2, context), mode4));
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                        z3 = true;
                    }
                } else if (i != R.drawable.abc_dialog_material_background) {
                    i2 = 0;
                    z2 = false;
                    round = -1;
                    if (z2) {
                    }
                }
                i2 = 16842801;
            }
            z2 = true;
            round = -1;
            if (z2) {
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
