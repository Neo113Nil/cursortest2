package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyManager;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.epx;
import xsna.fpf0;
import xsna.j8y;
import xsna.m5k;
import xsna.msy;
import xsna.s1v;

/* loaded from: classes7.dex */
public final class ConfigManager {
    public static com.vungle.ads.internal.model.v2 a;
    public static com.vungle.ads.internal.model.h2 b;
    public static List c;
    public static String d;
    public static String f;
    public static final ConfigManager INSTANCE = new ConfigManager();
    public static final Lazy e = msy.a(LazyThreadSafetyMode.SYNCHRONIZED, w0.a);

    private ConfigManager() {
    }

    public static void a(Context context, String str) {
        d = str;
        ((FilePreferences) msy.a(LazyThreadSafetyMode.SYNCHRONIZED, new x0(context)).getValue()).a("config_extension", str).b();
    }

    public static void b(String str) {
        f = str;
    }

    public static String c() {
        com.vungle.ads.internal.model.h2 h2Var = b;
        String str = null;
        String str2 = h2Var != null ? h2Var.e : null;
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        return str == null ? Constants.a : str;
    }

    public static int d() {
        com.vungle.ads.internal.model.a2 a2Var;
        Integer num;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (a2Var = v2Var.a) == null || (num = a2Var.b) == null) {
            return 3;
        }
        return num.intValue();
    }

    public static long e() {
        com.vungle.ads.internal.model.a2 a2Var;
        Long l;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (a2Var = v2Var.a) == null || (l = a2Var.a) == null) {
            return 1048576000L;
        }
        long j = 1024;
        return l.longValue() * j * j;
    }

    public static String f() {
        com.vungle.ads.internal.model.h2 h2Var = b;
        String str = null;
        String str2 = h2Var != null ? h2Var.c : null;
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        return str == null ? Constants.b : str;
    }

    public static String g() {
        com.vungle.ads.internal.model.u2 u2Var;
        com.vungle.ads.internal.model.k2 k2Var;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (u2Var = v2Var.f) == null || (k2Var = u2Var.a) == null) {
            return null;
        }
        return k2Var.e;
    }

    public static String h() {
        com.vungle.ads.internal.model.u2 u2Var;
        com.vungle.ads.internal.model.k2 k2Var;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (u2Var = v2Var.f) == null || (k2Var = u2Var.a) == null) {
            return null;
        }
        return k2Var.f;
    }

    public static String i() {
        com.vungle.ads.internal.model.u2 u2Var;
        com.vungle.ads.internal.model.k2 k2Var;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (u2Var = v2Var.f) == null || (k2Var = u2Var.a) == null) {
            return null;
        }
        return k2Var.c;
    }

    public static String j() {
        com.vungle.ads.internal.model.u2 u2Var;
        com.vungle.ads.internal.model.k2 k2Var;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (u2Var = v2Var.f) == null || (k2Var = u2Var.a) == null) {
            return null;
        }
        return k2Var.b;
    }

    public static boolean k() {
        com.vungle.ads.internal.model.u2 u2Var;
        com.vungle.ads.internal.model.k2 k2Var;
        Boolean bool;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (u2Var = v2Var.f) == null || (k2Var = u2Var.a) == null || (bool = k2Var.a) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static String l() {
        com.vungle.ads.internal.model.h2 h2Var = b;
        String str = null;
        String str2 = h2Var != null ? h2Var.d : null;
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        return str == null ? Constants.c : str;
    }

    public static String m() {
        com.vungle.ads.internal.model.h2 h2Var = b;
        if (h2Var != null) {
            return h2Var.b;
        }
        return null;
    }

    public static com.vungle.ads.internal.model.n2 n() {
        com.vungle.ads.internal.model.u2 u2Var;
        com.vungle.ads.internal.model.o2 o2Var;
        LinkedHashMap linkedHashMap = com.vungle.ads.internal.model.n2.b;
        com.vungle.ads.internal.model.v2 v2Var = a;
        return (com.vungle.ads.internal.model.n2) com.vungle.ads.internal.model.n2.b.get((v2Var == null || (u2Var = v2Var.f) == null || (o2Var = u2Var.b) == null) ? null : o2Var.a);
    }

    public static boolean o() {
        Boolean bool;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (bool = v2Var.i) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean p() {
        Boolean bool;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (bool = v2Var.r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public static boolean q() {
        Boolean bool;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (bool = v2Var.o) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean r() {
        Boolean bool;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (bool = v2Var.m) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String getAdsEndpoint() {
        com.vungle.ads.internal.model.h2 h2Var = b;
        String str = null;
        String str2 = h2Var != null ? h2Var.a : null;
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        return str == null ? Constants.DEFAULT_ADS_ENDPOINT : str;
    }

    public final String getConfigExtension() {
        String str = d;
        return str == null ? "" : str;
    }

    public static boolean b() {
        Boolean bool;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (bool = v2Var.n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public static i3 a(String str) {
        List list = c;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (epx.f(((i3) next).b(), str)) {
                obj = next;
                break;
            }
        }
        return (i3) obj;
    }

    public static long a() {
        Long l;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (l = v2Var.p) == null) {
            return -1L;
        }
        return l.longValue();
    }

    public static com.vungle.ads.internal.model.v2 a(FilePreferences filePreferences, String str) {
        Long a2;
        try {
            String string = filePreferences.getString("config_app_id");
            if (string != null && string.length() != 0 && string.equalsIgnoreCase(str)) {
                String string2 = filePreferences.getString("config_response");
                if (string2 == null) {
                    return null;
                }
                long a3 = filePreferences.a("config_update_time", 0L);
                INSTANCE.getClass();
                j8y j8yVar = (j8y) e.getValue();
                com.vungle.ads.internal.model.v2 v2Var = (com.vungle.ads.internal.model.v2) j8yVar.a(s1v.p(j8yVar.b, fpf0.d(com.vungle.ads.internal.model.v2.class)), string2);
                com.vungle.ads.internal.model.e2 c2 = v2Var.c();
                if (((c2 == null || (a2 = c2.a()) == null) ? -1L : a2.longValue()) + a3 < System.currentTimeMillis()) {
                    boolean z = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.c("ConfigManager", "cache config expired. re-config");
                    return null;
                }
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("ConfigManager", "use cache config.");
                return v2Var;
            }
            boolean z3 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.c("ConfigManager", "app id mismatch, re-config");
            return null;
        } catch (Exception e2) {
            boolean z4 = com.vungle.ads.internal.util.u.a;
            StringBuilder a4 = com.iab.omid.library.vungle.internal.l.a("Error while parsing cached config: ");
            a4.append(e2.getMessage());
            com.vungle.ads.internal.util.t.b("ConfigManager", a4.toString());
            return null;
        }
    }

    public static void a(com.vungle.ads.internal.model.v2 v2Var, FilePreferences filePreferences) {
        try {
            String str = f;
            if (str == null) {
                str = null;
            }
            filePreferences.a("config_app_id", str);
            filePreferences.b("config_update_time", System.currentTimeMillis());
            j8y j8yVar = (j8y) e.getValue();
            filePreferences.a("config_response", j8yVar.b(s1v.p(j8yVar.b, fpf0.d(com.vungle.ads.internal.model.v2.class)), v2Var));
            filePreferences.b();
        } catch (Exception e2) {
            boolean z = com.vungle.ads.internal.util.u.a;
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Exception: ");
            a2.append(e2.getMessage());
            a2.append(" for updating cached config");
            com.vungle.ads.internal.util.t.b("ConfigManager", a2.toString());
        }
    }

    public static void a(Context context, q2 q2Var) {
        try {
            com.vungle.ads.internal.network.m a2 = ((VungleApiClient) msy.a(LazyThreadSafetyMode.SYNCHRONIZED, new q0(context)).getValue()).a();
            if (a2 != null) {
                a2.a(new r0(context, q2Var));
            }
        } catch (Throwable th) {
            if (th instanceof UnknownHostException ? true : th instanceof SecurityException) {
                new NetworkUnreachable(m5k.b(th, com.iab.omid.library.vungle.internal.l.a("Config unknown: "))).logErrorNoReturnValue$vungle_ads_release();
            } else {
                new NetworkUnreachable(m5k.b(th, com.iab.omid.library.vungle.internal.l.a("Config: "))).logErrorNoReturnValue$vungle_ads_release();
            }
            q2Var.invoke(Boolean.FALSE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa A[Catch: all -> 0x0028, Exception -> 0x002b, Merged into TryCatch #1 {all -> 0x0028, Exception -> 0x002b, blocks: (B:4:0x0001, B:10:0x0033, B:12:0x0038, B:13:0x003e, B:15:0x0042, B:16:0x0048, B:18:0x004e, B:20:0x0052, B:22:0x0056, B:23:0x005c, B:25:0x0060, B:27:0x0064, B:29:0x0068, B:30:0x006c, B:33:0x0099, B:35:0x00a8, B:37:0x00b2, B:38:0x00b6, B:40:0x00bc, B:42:0x00c0, B:43:0x00c4, B:52:0x00d0, B:54:0x00d6, B:55:0x00da, B:58:0x00e6, B:60:0x00ea, B:61:0x00df, B:64:0x00fa, B:67:0x0013, B:69:0x0017, B:72:0x0020, B:78:0x0105), top: B:2:0x0001 }, TRY_ENTER, TRY_LEAVE] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(Context context, com.vungle.ads.internal.model.v2 v2Var, boolean z, m2 m2Var) {
        Long l;
        char c2;
        Boolean bool;
        com.vungle.ads.internal.model.r2 r2Var;
        Boolean bool2;
        com.vungle.ads.internal.model.r2 r2Var2;
        Integer num;
        try {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            Lazy a2 = msy.a(lazyThreadSafetyMode, new s0(context));
            boolean z2 = false;
            boolean z3 = true;
            if (v2Var != null && (l = v2Var.p) != null && l.longValue() != -1) {
                c2 = v2Var.c == null ? (char) 1 : (char) 2;
                if (c2 != 0) {
                    boolean z4 = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.b("ConfigManager", "Config is not available.");
                    return;
                }
                if (c2 == 1) {
                    if (!z && v2Var != null) {
                        Long b2 = v2Var.b();
                        long longValue = b2 != null ? b2.longValue() : -1L;
                        com.vungle.ads.internal.model.v2 v2Var2 = a;
                        if (v2Var2 != null) {
                            v2Var2.a(Long.valueOf(longValue));
                        }
                        com.vungle.ads.internal.model.v2 v2Var3 = a;
                        if (v2Var3 != null) {
                            ConfigManager configManager = INSTANCE;
                            FilePreferences filePreferences = (FilePreferences) a2.getValue();
                            configManager.getClass();
                            a(v2Var3, filePreferences);
                        }
                    }
                    return;
                }
                a = v2Var;
                b = v2Var != null ? v2Var.d() : null;
                c = v2Var != null ? v2Var.e() : null;
                com.vungle.ads.internal.model.v2 v2Var4 = a;
                int intValue = (v2Var4 == null || (r2Var2 = v2Var4.d) == null || (num = r2Var2.a) == null) ? 1 : num.intValue();
                com.vungle.ads.internal.model.v2 v2Var5 = a;
                if (v2Var5 != null && (r2Var = v2Var5.d) != null && (bool2 = r2Var.b) != null) {
                    z2 = bool2.booleanValue();
                }
                Lazy a3 = msy.a(lazyThreadSafetyMode, new t0(context));
                Lazy a4 = msy.a(lazyThreadSafetyMode, new u0(context));
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                analyticsClient.a((VungleApiClient) a3.getValue(), ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) a4.getValue())).e(), intValue, z2);
                if (!z && v2Var != null) {
                    a(v2Var, (FilePreferences) a2.getValue());
                    String a5 = v2Var.a();
                    if (a5 != null) {
                        INSTANCE.getClass();
                        a(context, a5);
                    }
                }
                if (m2Var != null) {
                    AnalyticsClient.a(analyticsClient, m2Var, (com.vungle.ads.internal.util.s) null, 6);
                }
                PrivacyManager privacyManager = PrivacyManager.INSTANCE;
                com.vungle.ads.internal.model.v2 v2Var6 = a;
                if (v2Var6 != null && (bool = v2Var6.h) != null) {
                    z3 = bool.booleanValue();
                }
                privacyManager.getClass();
                PrivacyManager.a(z3);
                return;
            }
            c2 = 0;
            if (c2 != 0) {
            }
        } catch (Exception e2) {
            boolean z5 = com.vungle.ads.internal.util.u.a;
            StringBuilder a6 = com.iab.omid.library.vungle.internal.l.a("Error while validating config: ");
            a6.append(e2.getMessage());
            com.vungle.ads.internal.util.t.b("ConfigManager", a6.toString());
        } finally {
        }
    }
}
