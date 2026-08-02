package xsna;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.vk.core.ui.themes.NavigationBarStyle;
import kotlin.NoWhenBranchMatchedException;
import xsna.lrv0;

/* compiled from: VkThemeHelperBase.kt */
/* loaded from: classes.dex */
public final class krv0 {
    public static final TypedValue a = new TypedValue();
    public static volatile dhr0 b;

    /* compiled from: VkThemeHelperBase.kt */
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavigationBarStyle.values().length];
            try {
                iArr[NavigationBarStyle.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigationBarStyle.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NavigationBarStyle.DYNAMIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(lrv0.a aVar) {
        dhr0 dhr0Var = b;
        if (dhr0Var != null) {
            dhr0Var.a(aVar);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public static Integer b() {
        if (b != null) {
            return Integer.valueOf(dhr0.C().c);
        }
        return null;
    }

    public static ForegroundColorSpan c(int i, Context context) {
        return new ForegroundColorSpan(m(i, context));
    }

    public static Integer d() {
        dhr0 dhr0Var = b;
        if (dhr0Var != null) {
            return Integer.valueOf(dhr0Var.v());
        }
        return null;
    }

    public static final Drawable e(int i, Context context) {
        Drawable F;
        dhr0 dhr0Var = b;
        return (dhr0Var == null || (F = dhr0Var.F(i)) == null) ? m33.a(i, context) : F;
    }

    public static final baf0 f(int i, int i2, Context context) {
        return new baf0(m33.a(i, context), m(i2, context));
    }

    public static final int g(String str, AttributeSet attributeSet) {
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", str);
        if (attributeValue == null || !brm0.B(attributeValue, "?", false)) {
            return 0;
        }
        return Integer.parseInt(brm0.y(attributeValue, "?", ""));
    }

    public static Boolean h(int i) {
        dhr0 dhr0Var = b;
        if (dhr0Var == null) {
            return null;
        }
        ehr0 ehr0Var = dhr0.e;
        return Boolean.valueOf(i != 0 && (!dhr0Var.O(dhr0.C().c) ? i == dhr0.C().c || i == ehr0Var.a.c : i == dhr0.C().c || i == ehr0Var.b.c));
    }

    public static Boolean i(Context context) {
        dhr0 dhr0Var = b;
        if (dhr0Var != null) {
            return Boolean.valueOf(dhr0Var.c(context));
        }
        return null;
    }

    public static boolean j() {
        if (b != null) {
            return dhr0.L();
        }
        return true;
    }

    public static void k(lrv0.a aVar) {
        dhr0 dhr0Var = b;
        if (dhr0Var != null) {
            dhr0Var.d(aVar);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public static final int l(int i) {
        dhr0 dhr0Var = b;
        if (dhr0Var != null) {
            return dhr0Var.Z(i, null);
        }
        return -16777216;
    }

    public static final int m(int i, Context context) {
        if (b != null) {
            return dhr0.f.a(i, context);
        }
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = a;
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue.data;
        }
        return 0;
    }

    public static final void n(int i, View view) {
        dhr0 dhr0Var = b;
        if (dhr0Var != null) {
            dhr0Var.e0(i, view);
        } else {
            view.setBackgroundColor(m(i, view.getContext()));
        }
    }

    public static void o(ImageView imageView, int i) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        dhr0 dhr0Var = b;
        if (dhr0Var != null) {
            dhr0Var.j0(imageView, i, mode);
        } else {
            imageView.setColorFilter(m(i, imageView.getContext()), mode);
        }
    }

    public static void p(ImageView imageView, int i, int i2) {
        if (b != null) {
            b.l0(imageView, i, i2);
            return;
        }
        Drawable mutate = m33.a(i, imageView.getContext()).mutate();
        mutate.setTint(m(i2, imageView.getContext()));
        imageView.setImageDrawable(mutate);
    }

    public static void q(TextView textView, int i) {
        dhr0 dhr0Var = b;
        if (dhr0Var != null) {
            dhr0Var.m0(textView, i);
        } else {
            textView.setTextColor(m(i, textView.getContext()));
        }
    }

    public static void r(Toolbar toolbar, int i) {
        toolbar.setNavigationIcon(i);
        dhr0 dhr0Var = b;
        if (dhr0Var != null ? dhr0Var.V(toolbar) : false) {
            return;
        }
        Drawable e = e(i, toolbar.getContext());
        TypedArray obtainStyledAttributes = toolbar.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.textColorSecondary});
        try {
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
            if (colorStateList != null && e != null) {
                e = new baf0(e, colorStateList);
            }
            toolbar.setNavigationIcon(e);
            dhr0 dhr0Var2 = b;
            if (dhr0Var2 != null) {
                dhr0Var2.V(toolbar);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static void s(Window window, int i) {
        boolean d;
        if (window == null) {
            return;
        }
        if (!gz80.a(26)) {
            window.setNavigationBarColor(window.getContext().getColor(com.vkontakte.android.R.color.vk_black));
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        window.setNavigationBarColor(i);
        boolean z = i == 0;
        if (z) {
            d = l8g.d(m(com.vkontakte.android.R.attr.vk_ui_background, window.getContext()));
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            d = l8g.d(i);
        }
        if (d) {
            decorView.setSystemUiVisibility(systemUiVisibility | 16);
        } else {
            decorView.setSystemUiVisibility(systemUiVisibility & (-17));
        }
    }

    public static final void t(Window window, NavigationBarStyle navigationBarStyle) {
        Context s;
        Context context = window.getContext();
        if (context == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$0[navigationBarStyle.ordinal()];
        if (i == 1) {
            if (b != null) {
                s = dhr0.s();
                context = s;
            }
            context = null;
        } else if (i == 2) {
            if (b != null) {
                s = dhr0.y();
                context = s;
            }
            context = null;
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (context == null) {
            return;
        }
        s(window, m(com.vkontakte.android.R.attr.vk_ui_background, context));
    }
}
