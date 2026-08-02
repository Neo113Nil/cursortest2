package sg.bigo.ads.bg;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public final class b {
    private static String a = "";
    private static int b = 0;
    private static String c = "";
    private static String d = "";
    private static String e = "";
    private static boolean f = true;
    private static SharedPreferences.OnSharedPreferenceChangeListener g = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: sg.bigo.ads.bg.b.1
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (r.a((CharSequence) str)) {
                return;
            }
            str.getClass();
            switch (str) {
                case "IABTCF_PurposeConsents":
                    b.a(sharedPreferences);
                    break;
                case "IABTCF_PurposeLegitimateInterests":
                    b.c(sharedPreferences);
                    break;
                case "IABTCF_gdprApplies":
                    b.b(sharedPreferences);
                    break;
                case "IABTCF_TCString":
                    b.e(sharedPreferences);
                    break;
                case "IABTCF_VendorConsents":
                    b.d(sharedPreferences);
                    break;
                default:
                    return;
            }
            b.j();
        }
    };
    private static Context h;

    public static void a(@NonNull Context context) {
        h = context;
        sg.bigo.ads.bw.a.a(context.getPackageName(), g);
    }

    public static String b() {
        if (r.a((CharSequence) a) && a()) {
            a = sg.bigo.ads.bw.a.f(h.getPackageName());
        }
        return a;
    }

    public static int c(Context context) {
        return (context == null || !sg.bigo.ads.bw.b.a()) ? b : sg.bigo.ads.bw.a.h(context.getPackageName());
    }

    public static int d() {
        if (h == null || !sg.bigo.ads.bw.b.a()) {
            return b;
        }
        b = e(h) ? sg.bigo.ads.bw.a.h(h.getPackageName()) : -1;
        return b;
    }

    public static String e() {
        if (r.a((CharSequence) c) && a()) {
            c = sg.bigo.ads.bw.a.i(h.getPackageName());
        }
        return c;
    }

    public static String f() {
        if (r.a((CharSequence) e) && a()) {
            e = sg.bigo.ads.bw.a.g(h.getPackageName());
        }
        return e;
    }

    public static boolean g() {
        return f;
    }

    public static void h() {
        f = false;
    }

    public static boolean i() {
        return e(h);
    }

    public static /* synthetic */ boolean j() {
        f = true;
        return true;
    }

    public static void a(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            a = sharedPreferences.getString("IABTCF_PurposeConsents", "");
        } catch (Exception unused) {
            a = "";
        }
    }

    public static String b(Context context) {
        return (context == null || !sg.bigo.ads.bw.b.a()) ? a : sg.bigo.ads.bw.a.f(context.getPackageName());
    }

    public static String c() {
        if (r.a((CharSequence) d) && a()) {
            d = sg.bigo.ads.bw.a.j(h.getPackageName());
        }
        return d;
    }

    public static String d(Context context) {
        return (context == null || !sg.bigo.ads.bw.b.a()) ? c : sg.bigo.ads.bw.a.i(context.getPackageName());
    }

    public static void e(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            e = sharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, "");
        } catch (Exception unused) {
            e = "";
        }
    }

    public static boolean a() {
        return h != null;
    }

    public static void b(SharedPreferences sharedPreferences) {
        int i;
        if (sharedPreferences == null || sharedPreferences.getAll() == null) {
            return;
        }
        Object obj = sharedPreferences.getAll().get("IABTCF_gdprApplies");
        if (obj instanceof Integer) {
            i = ((Integer) obj).intValue();
        } else {
            if (!(obj instanceof String)) {
                return;
            }
            try {
                b = Integer.parseInt((String) obj);
                return;
            } catch (Exception unused) {
                i = 0;
            }
        }
        b = i;
    }

    public static void c(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            c = sharedPreferences.getString("IABTCF_PurposeLegitimateInterests", "");
        } catch (Exception unused) {
            c = "";
        }
    }

    public static void d(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            d = sharedPreferences.getString("IABTCF_VendorConsents", "");
        } catch (Exception unused) {
            d = "";
        }
    }

    public static boolean e(Context context) {
        if (context == null || !sg.bigo.ads.bw.b.a()) {
            return false;
        }
        return sg.bigo.ads.bw.a.a(context.getPackageName() + "_preferences", "IABTCF_gdprApplies");
    }
}
