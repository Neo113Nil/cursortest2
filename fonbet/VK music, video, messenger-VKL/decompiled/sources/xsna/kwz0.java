package xsna;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class kwz0 extends q1t {
    public Boolean e;
    public bwz0 f;
    public Boolean g;

    public final String l(String str) {
        mb01 mb01Var = (mb01) this.b;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            exc0.i(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.i.b(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.i.b(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            k901 k901Var3 = mb01Var.j;
            mb01.k(k901Var3);
            k901Var3.i.b(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            k901 k901Var4 = mb01Var.j;
            mb01.k(k901Var4);
            k901Var4.i.b(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final double m(String str, r701 r701Var) {
        if (str == null) {
            return ((Double) r701Var.a(null)).doubleValue();
        }
        String b = this.f.b(str, r701Var.a);
        if (TextUtils.isEmpty(b)) {
            return ((Double) r701Var.a(null)).doubleValue();
        }
        try {
            return ((Double) r701Var.a(Double.valueOf(Double.parseDouble(b)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) r701Var.a(null)).doubleValue();
        }
    }

    public final int n() {
        sk01 sk01Var = ((mb01) this.b).m;
        mb01.i(sk01Var);
        Boolean bool = ((mb01) sk01Var.b).s().h;
        if (sk01Var.h0() < 201500) {
            return (bool == null || bool.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int o(String str, r701 r701Var) {
        if (str == null) {
            return ((Integer) r701Var.a(null)).intValue();
        }
        String b = this.f.b(str, r701Var.a);
        if (TextUtils.isEmpty(b)) {
            return ((Integer) r701Var.a(null)).intValue();
        }
        try {
            return ((Integer) r701Var.a(Integer.valueOf(Integer.parseInt(b)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) r701Var.a(null)).intValue();
        }
    }

    public final void p() {
        ((mb01) this.b).getClass();
    }

    public final long q(String str, r701 r701Var) {
        if (str == null) {
            return ((Long) r701Var.a(null)).longValue();
        }
        String b = this.f.b(str, r701Var.a);
        if (TextUtils.isEmpty(b)) {
            return ((Long) r701Var.a(null)).longValue();
        }
        try {
            return ((Long) r701Var.a(Long.valueOf(Long.parseLong(b)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) r701Var.a(null)).longValue();
        }
    }

    @VisibleForTesting
    public final Bundle r() {
        mb01 mb01Var = (mb01) this.b;
        try {
            if (mb01Var.b.getPackageManager() == null) {
                k901 k901Var = mb01Var.j;
                mb01.k(k901Var);
                k901Var.i.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = xzx0.a(mb01Var.b).a(128, mb01Var.b.getPackageName());
            if (a != null) {
                return a.metaData;
            }
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.i.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            k901 k901Var3 = mb01Var.j;
            mb01.k(k901Var3);
            k901Var3.i.b(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    @VisibleForTesting
    public final Boolean s(String str) {
        exc0.f(str);
        Bundle r = r();
        if (r != null) {
            if (r.containsKey(str)) {
                return Boolean.valueOf(r.getBoolean(str));
            }
            return null;
        }
        k901 k901Var = ((mb01) this.b).j;
        mb01.k(k901Var);
        k901Var.i.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean t(String str, r701 r701Var) {
        if (str == null) {
            return ((Boolean) r701Var.a(null)).booleanValue();
        }
        String b = this.f.b(str, r701Var.a);
        return TextUtils.isEmpty(b) ? ((Boolean) r701Var.a(null)).booleanValue() : ((Boolean) r701Var.a(Boolean.valueOf("1".equals(b)))).booleanValue();
    }

    public final boolean u(String str) {
        return "1".equals(this.f.b(str, "gaia_collection_enabled"));
    }

    public final boolean v() {
        Boolean s = s("google_analytics_automatic_screen_reporting_enabled");
        return s == null || s.booleanValue();
    }

    public final boolean w() {
        ((mb01) this.b).getClass();
        Boolean s = s("firebase_analytics_collection_deactivated");
        return s != null && s.booleanValue();
    }

    public final boolean x(String str) {
        return "1".equals(this.f.b(str, "measurement.event_sampling_enabled"));
    }

    public final boolean y() {
        if (this.e == null) {
            Boolean s = s("app_measurement_lite");
            this.e = s;
            if (s == null) {
                this.e = Boolean.FALSE;
            }
        }
        return this.e.booleanValue() || !((mb01) this.b).f;
    }
}
