package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.NonNull;
import com.vkontakte.android.R;

/* compiled from: AppCompatDrawableManager.java */
/* loaded from: classes.dex */
public final class d33 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static d33 c;
    public xag0 a;

    /* compiled from: AppCompatDrawableManager.java */
    public class a {
        public final int[] a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        public final int[] b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        public final int[] d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        public final int[] e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        public final int[] f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int i, int[] iArr) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(int i, @NonNull Context context) {
            int c = qpo0.c(R.attr.colorControlHighlight, context);
            int b = qpo0.b(R.attr.colorButtonNormal, context);
            int[] iArr = qpo0.b;
            int[] iArr2 = qpo0.d;
            int i2 = n8g.i(c, i);
            return new ColorStateList(new int[][]{iArr, iArr2, qpo0.c, qpo0.f}, new int[]{b, i2, n8g.i(c, i), i});
        }

        public static LayerDrawable c(@NonNull xag0 xag0Var, @NonNull Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable c = xag0Var.c(R.drawable.abc_star_black_48dp, context);
            Drawable c2 = xag0Var.c(R.drawable.abc_star_half_black_48dp, context);
            if ((c instanceof BitmapDrawable) && c.getIntrinsicWidth() == dimensionPixelSize && c.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) c;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                c.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((c2 instanceof BitmapDrawable) && c2.getIntrinsicWidth() == dimensionPixelSize && c2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) c2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                c2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = d33.b;
            }
            mutate.setColorFilter(d33.c(i, mode));
        }

        public final ColorStateList d(int i, @NonNull Context context) {
            if (i == R.drawable.abc_edit_text_material) {
                return anj.b(R.color.abc_tint_edittext, context);
            }
            if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                return anj.b(R.color.abc_tint_switch_track, context);
            }
            if (i != R.drawable.abc_switch_thumb_material) {
                if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    return b(qpo0.c(R.attr.colorButtonNormal, context), context);
                }
                if (i == R.drawable.abc_btn_borderless_material) {
                    return b(0, context);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return b(qpo0.c(R.attr.colorAccent, context), context);
                }
                if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                    return anj.b(R.color.abc_tint_spinner, context);
                }
                if (a(i, this.b)) {
                    return qpo0.d(R.attr.colorControlNormal, context);
                }
                if (a(i, this.e)) {
                    return anj.b(R.color.abc_tint_default, context);
                }
                if (a(i, this.f)) {
                    return anj.b(R.color.abc_tint_btn_checkable, context);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return anj.b(R.color.abc_tint_seek_thumb, context);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d = qpo0.d(R.attr.colorSwitchThumbNormal, context);
            if (d == null || !d.isStateful()) {
                iArr[0] = qpo0.b;
                iArr2[0] = qpo0.b(R.attr.colorSwitchThumbNormal, context);
                iArr[1] = qpo0.e;
                iArr2[1] = qpo0.c(R.attr.colorControlActivated, context);
                iArr[2] = qpo0.f;
                iArr2[2] = qpo0.c(R.attr.colorSwitchThumbNormal, context);
            } else {
                int[] iArr3 = qpo0.b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = qpo0.e;
                iArr2[1] = qpo0.c(R.attr.colorControlActivated, context);
                iArr[2] = qpo0.f;
                iArr2[2] = d.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    public static synchronized d33 a() {
        d33 d33Var;
        synchronized (d33.class) {
            try {
                if (c == null) {
                    d();
                }
                d33Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d33Var;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e;
        synchronized (d33.class) {
            e = xag0.e(i, mode);
        }
        return e;
    }

    public static synchronized void d() {
        synchronized (d33.class) {
            if (c == null) {
                d33 d33Var = new d33();
                c = d33Var;
                d33Var.a = xag0.b();
                xag0 xag0Var = c.a;
                a aVar = new a();
                synchronized (xag0Var) {
                    xag0Var.e = aVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, vyo0 vyo0Var, int[] iArr) {
        PorterDuff.Mode mode = xag0.f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = vyo0Var.d;
            if (!z && !vyo0Var.c) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z ? vyo0Var.a : null;
            PorterDuff.Mode mode2 = vyo0Var.c ? vyo0Var.b : xag0.f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = xag0.e(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
    }

    public final synchronized Drawable b(int i, @NonNull Context context) {
        return this.a.c(i, context);
    }
}
