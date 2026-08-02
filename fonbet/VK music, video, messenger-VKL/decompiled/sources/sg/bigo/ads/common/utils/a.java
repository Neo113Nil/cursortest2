package sg.bigo.ads.common.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import xsna.et;
import xsna.klk0;

/* loaded from: classes9.dex */
public final class a {
    private static Context a = null;
    private static boolean b = true;

    public static Drawable a(Context context, int i) {
        if (context != null) {
            try {
                return d(context, i);
            } catch (Exception unused) {
                a(et.a(i, new StringBuilder("Activity context getDrawable failed. the resId is ")));
                try {
                    return d(b(context), i);
                } catch (Exception unused2) {
                    a(et.a(i, new StringBuilder("Application context getDrawable failed. the resId is ")));
                }
            }
        }
        return null;
    }

    public static int b(@NonNull Context context, int i) {
        try {
            return e(context, i);
        } catch (Exception unused) {
            a(et.a(i, new StringBuilder("Activity context getDimensionPixelSize failed. the resId is ")));
            try {
                return e(b(context), i);
            } catch (Exception unused2) {
                a(et.a(i, new StringBuilder("Application context getDimensionPixelSize failed. the resId is ")));
                return 0;
            }
        }
    }

    public static int c(@NonNull Context context, int i) {
        try {
            return f(context, i);
        } catch (Exception unused) {
            a(et.a(i, new StringBuilder("Activity context getColor failed. the resId is ")));
            try {
                return f(b(context), i);
            } catch (Exception unused2) {
                a(et.a(i, new StringBuilder("Application context getColor failed. the resId is ")));
                return 0;
            }
        }
    }

    private static Drawable d(@NonNull Context context, int i) {
        try {
            return context.getResources().getDrawable(i);
        } catch (Exception unused) {
            c(context);
            return context.getResources().getDrawable(i);
        }
    }

    private static int e(@NonNull Context context, int i) {
        try {
            return context.getResources().getDimensionPixelSize(i);
        } catch (Exception unused) {
            c(context);
            return context.getResources().getDimensionPixelSize(i);
        }
    }

    private static int f(@NonNull Context context, int i) {
        try {
            return context.getResources().getColor(i);
        } catch (Exception unused) {
            c(context);
            return context.getResources().getColor(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static View a(Context context, int i, @Nullable ViewGroup viewGroup, boolean z) {
        View b2;
        if (context != null) {
            try {
                b2 = b(context, i, viewGroup, z);
            } catch (Exception unused) {
                a(et.a(i, new StringBuilder("Self context inflateView failed. the resId is ")));
            }
            if (b2 == null) {
                return b2;
            }
            try {
                return b(b(context), i, viewGroup, z);
            } catch (Exception unused2) {
                a(et.a(i, new StringBuilder("Application context inflateView failed. the resId is ")));
                return b2;
            }
        }
        b2 = null;
        if (b2 == null) {
        }
    }

    private static Context b(@NonNull Context context) {
        a(context);
        Context context2 = a;
        return context2 != null ? context2 : context.getApplicationContext();
    }

    private static void c(Context context) {
        try {
            klk0.d(context, false);
        } catch (Throwable unused) {
            a("SplitCompact not found.");
        }
    }

    private static View b(@NonNull Context context, int i, ViewGroup viewGroup, boolean z) {
        try {
            return LayoutInflater.from(context).inflate(i, viewGroup, z);
        } catch (Exception unused) {
            c(context);
            return LayoutInflater.from(context).inflate(i, viewGroup, z);
        }
    }

    public static CharSequence b(Context context, int i, Locale locale) {
        Resources resources = context != null ? context.getResources() : null;
        if (resources == null) {
            return null;
        }
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration).getResources().getText(i);
    }

    private static String b(@NonNull Context context, int i, Object... objArr) {
        if (objArr != null) {
            try {
                if (objArr.length > 0) {
                    return context.getString(i, objArr);
                }
            } catch (Exception unused) {
                c(context);
                return (objArr == null || objArr.length <= 0) ? context.getString(i) : context.getString(i, objArr);
            }
        }
        return context.getString(i);
    }

    public static String a(@NonNull Context context, int i, Locale locale) {
        CharSequence b2 = b(context, i, locale);
        if (b2 != null) {
            return b2.toString();
        }
        return null;
    }

    public static String a(@NonNull Context context, int i, Object... objArr) {
        try {
            return b(context, i, objArr);
        } catch (Exception unused) {
            a(et.a(i, new StringBuilder("Activity context getString failed. the resId is ")));
            try {
                return b(b(context), i, objArr);
            } catch (Exception unused2) {
                a(et.a(i, new StringBuilder("Application context getString failed. the resId is ")));
                return "";
            }
        }
    }

    private static void a(Context context) {
        if (b) {
            b = false;
            try {
                Context applicationContext = context.getApplicationContext();
                a = applicationContext.createPackageContext(applicationContext.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    private static void a(String str) {
        sg.bigo.ads.bn.a.a(0, "BigoAAB", String.valueOf(str));
    }
}
