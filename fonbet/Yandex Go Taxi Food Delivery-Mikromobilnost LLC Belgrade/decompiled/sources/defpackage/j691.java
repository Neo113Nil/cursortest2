package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.zzji;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class j691 extends r8 {
    public Boolean c;
    public String w;
    public e691 x;
    public Boolean y;

    public final boolean Hg(String str) {
        return "1".equals(this.x.a7(str, "gaia_collection_enabled"));
    }

    public final boolean Ig(String str) {
        return "1".equals(this.x.a7(str, "measurement.event_sampling_enabled"));
    }

    public final boolean Jg() {
        if (this.c == null) {
            Boolean Sg = Sg("app_measurement_lite");
            this.c = Sg;
            if (Sg == null) {
                this.c = Boolean.FALSE;
            }
        }
        return this.c.booleanValue() || !((g) this.b).b;
    }

    public final String Kg(String str) {
        g gVar = (g) this.b;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            cvw.l(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.b(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.z.b(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            y1a1 y1a1Var3 = gVar.y;
            g.g(y1a1Var3);
            y1a1Var3.z.b(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            y1a1 y1a1Var4 = gVar.y;
            g.g(y1a1Var4);
            y1a1Var4.z.b(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final void Lg() {
        ((g) this.b).getClass();
    }

    public final String Mg(String str, gw91 gw91Var) {
        return TextUtils.isEmpty(str) ? (String) gw91Var.a(null) : (String) gw91Var.a(this.x.a7(str, gw91Var.a));
    }

    public final long Ng(String str, gw91 gw91Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) gw91Var.a(null)).longValue();
        }
        String a7 = this.x.a7(str, gw91Var.a);
        if (TextUtils.isEmpty(a7)) {
            return ((Long) gw91Var.a(null)).longValue();
        }
        try {
            return ((Long) gw91Var.a(Long.valueOf(Long.parseLong(a7)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) gw91Var.a(null)).longValue();
        }
    }

    public final int Og(String str, gw91 gw91Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) gw91Var.a(null)).intValue();
        }
        String a7 = this.x.a7(str, gw91Var.a);
        if (TextUtils.isEmpty(a7)) {
            return ((Integer) gw91Var.a(null)).intValue();
        }
        try {
            return ((Integer) gw91Var.a(Integer.valueOf(Integer.parseInt(a7)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) gw91Var.a(null)).intValue();
        }
    }

    public final double Pg(String str, gw91 gw91Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) gw91Var.a(null)).doubleValue();
        }
        String a7 = this.x.a7(str, gw91Var.a);
        if (TextUtils.isEmpty(a7)) {
            return ((Double) gw91Var.a(null)).doubleValue();
        }
        try {
            return ((Double) gw91Var.a(Double.valueOf(Double.parseDouble(a7)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) gw91Var.a(null)).doubleValue();
        }
    }

    public final boolean Qg(String str, gw91 gw91Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) gw91Var.a(null)).booleanValue();
        }
        String a7 = this.x.a7(str, gw91Var.a);
        return TextUtils.isEmpty(a7) ? ((Boolean) gw91Var.a(null)).booleanValue() : ((Boolean) gw91Var.a(Boolean.valueOf("1".equals(a7)))).booleanValue();
    }

    public final Bundle Rg() {
        g gVar = (g) this.b;
        try {
            Context context = gVar.a;
            Context context2 = gVar.a;
            y1a1 y1a1Var = gVar.y;
            if (context.getPackageManager() == null) {
                g.g(y1a1Var);
                y1a1Var.z.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo b = nb51.a(context2).b(128, context2.getPackageName());
            if (b != null) {
                return b.metaData;
            }
            g.g(y1a1Var);
            y1a1Var.z.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.z.b(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean Sg(String str) {
        cvw.i(str);
        Bundle Rg = Rg();
        if (Rg != null) {
            if (Rg.containsKey(str)) {
                return Boolean.valueOf(Rg.getBoolean(str));
            }
            return null;
        }
        y1a1 y1a1Var = ((g) this.b).y;
        g.g(y1a1Var);
        y1a1Var.z.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean Tg() {
        ((g) this.b).getClass();
        Boolean Sg = Sg("firebase_analytics_collection_deactivated");
        return Sg != null && Sg.booleanValue();
    }

    public final boolean Ug() {
        Boolean Sg = Sg("google_analytics_automatic_screen_reporting_enabled");
        return Sg == null || Sg.booleanValue();
    }

    public final zzji Vg(String str, boolean z) {
        Object obj;
        cvw.i(str);
        g gVar = (g) this.b;
        Bundle Rg = Rg();
        if (Rg == null) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = Rg.get(str);
        }
        if (obj == null) {
            return zzji.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return zzji.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return zzji.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return zzji.POLICY;
        }
        y1a1 y1a1Var2 = gVar.y;
        g.g(y1a1Var2);
        y1a1Var2.C.b(str, "Invalid manifest metadata for");
        return zzji.UNINITIALIZED;
    }
}
