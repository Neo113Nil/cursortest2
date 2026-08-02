package sg.bigo.ads.bw;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.UUID;
import ru.ok.tracer.crash.report.BuildConfig;

/* loaded from: classes9.dex */
public final class a {
    private static String a = "";

    public static boolean A() {
        return ((Boolean) b.b("sp_ads_encrypticon_ads_data_request", Boolean.TRUE, 4)).booleanValue();
    }

    public static void B() {
        b.a("sp_ads_encrypticon_ads_data_request", Boolean.FALSE, 4);
    }

    public static boolean C() {
        return ((Boolean) b.b("sp_ads_encryptreport_request", Boolean.TRUE, 4)).booleanValue();
    }

    public static void D() {
        b.a("sp_ads_encryptreport_request", Boolean.FALSE, 4);
    }

    public static boolean E() {
        return ((Boolean) b.b("sp_ads_encryptcallback_request", Boolean.TRUE, 4)).booleanValue();
    }

    public static void F() {
        b.a("sp_ads_encryptcallback_request", Boolean.FALSE, 4);
    }

    public static boolean G() {
        long longValue = ((Long) b.b("sp_gzip_server_fail", 0L, 1)).longValue();
        return 0 != longValue && Math.abs(System.currentTimeMillis() - longValue) < BuildConfig.LIMIT_MAX_CRASH_REPORT_TTL_MILLIS;
    }

    public static long H() {
        return ((Long) b.b("last_delete_res_ts", 0L, 1)).longValue();
    }

    private static synchronized void I() {
        synchronized (a.class) {
            if (TextUtils.isEmpty(a)) {
                a = String.valueOf(UUID.randomUUID());
            }
        }
    }

    public static int a() {
        return ((Integer) b.b("sp_cpu_core_num", 0, 0)).intValue();
    }

    public static long b() {
        return ((Long) b.b("sp_cpu_max_freq", 0L, 1)).longValue();
    }

    public static String c() {
        return (String) b.b("sp_user_agent", "", 3);
    }

    public static long d() {
        return ((Long) b.b("sp_user_agent_last_check_ts", 0L, 1)).longValue();
    }

    public static long e() {
        return ((Long) b.b("sp_fix_ts_diff", 0L, 1)).longValue();
    }

    public static String f(String str) {
        try {
            return (String) b.b(str + "_preferences", "IABTCF_PurposeConsents", "", 3);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String g() {
        return (String) b.b("sp_omid_service_downloaded_url", "", 3);
    }

    public static int h(String str) {
        try {
            return ((Integer) b.b(str + "_preferences", "IABTCF_gdprApplies", 0, 0)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String i() {
        return (String) b.b("sp_banner_js_downloaded_url", "", 3);
    }

    public static long j() {
        return ((Long) b.b("last_stat_init_time", 0, 1)).longValue();
    }

    public static int k(@NonNull String str) {
        return ((Integer) b.b("impression_num_".concat(String.valueOf(str)), 0, 0)).intValue();
    }

    public static String l() {
        return (String) b.b("cb_event_count", "", 3);
    }

    public static int m() {
        return ((Integer) b.b("gdpr_check_by_server", 0, 0)).intValue();
    }

    public static int n() {
        return ((Integer) b.b("user_consent_gdpr", 0, 0)).intValue();
    }

    public static int o() {
        return ((Integer) b.b("consent_gdpr", 0, 0)).intValue();
    }

    public static int p() {
        return ((Integer) b.b("consent_ccpa", 0, 0)).intValue();
    }

    public static int q() {
        return ((Integer) b.b("consent_lgpd", 0, 0)).intValue();
    }

    public static int r() {
        return ((Integer) b.b("consent_coppa", 0, 0)).intValue();
    }

    public static boolean s() {
        return (p() == 2 || q() == 2 || r() == 2) || (m() == 0 && (o() == 2));
    }

    public static String t() {
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String str = (String) b.b("sp_ads_tiny", "sp_ads_uuid", "", 3);
        a = str;
        if (TextUtils.isEmpty(str)) {
            try {
                I();
                if (!TextUtils.isEmpty(a)) {
                    b.a("sp_ads_tiny", "sp_ads_uuid", a, 3);
                }
            } catch (Throwable unused) {
            }
        }
        return a;
    }

    public static boolean u() {
        return ((Boolean) b.b("sp_ads_encryptpost_request", Boolean.TRUE, 4)).booleanValue();
    }

    public static void v() {
        b.a("sp_ads_encryptpost_request", Boolean.FALSE, 4);
    }

    public static boolean w() {
        return ((Boolean) b.b("sp_ads_encryptsdkconfig_request", Boolean.TRUE, 4)).booleanValue();
    }

    public static void x() {
        b.a("sp_ads_encryptsdkconfig_request", Boolean.FALSE, 4);
    }

    public static boolean y() {
        return ((Boolean) b.b("sp_ads_encryptaddata_request", Boolean.TRUE, 4)).booleanValue();
    }

    public static void z() {
        b.a("sp_ads_encryptaddata_request", Boolean.FALSE, 4);
    }

    public static void a(int i) {
        b.a("sp_cpu_core_num", Integer.valueOf(i), 0);
    }

    public static void b(int i) {
        b.a("gdpr_check_by_server", Integer.valueOf(i), 0);
    }

    public static void c(int i) {
        b.a("user_consent_gdpr", Integer.valueOf(i), 0);
    }

    public static void d(int i) {
        b.a("consent_gdpr", Integer.valueOf(i), 0);
    }

    public static void e(int i) {
        b.a("consent_ccpa", Integer.valueOf(i), 0);
    }

    public static void f() {
        b.a("sp_fix_ts_diff", 0L, 1);
    }

    public static String g(String str) {
        try {
            return (String) b.b(str + "_preferences", AndroidTcfDataSource.TCF_TCSTRING_KEY, "", 3);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String h() {
        return (String) b.b("sp_omsdk_cached_version", "", 3);
    }

    public static String i(String str) {
        try {
            return (String) b.b(str + "_preferences", "IABTCF_PurposeLegitimateInterests", "", 3);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String j(String str) {
        try {
            return (String) b.b(str + "_preferences", "IABTCF_VendorConsents", "", 3);
        } catch (Exception unused) {
            return "";
        }
    }

    public static long k() {
        return ((Long) b.b("last_stat_cb_events_time", 0, 1)).longValue();
    }

    public static void l(@NonNull String str) {
        long longValue = ((Long) b.b("last_impression_ts_".concat(String.valueOf(str)), 0, 1)).longValue();
        if (longValue <= 0 || DateUtils.isToday(longValue)) {
            return;
        }
        a(str, 0);
        a(str, 0L);
    }

    public static void a(long j) {
        b.a("sp_cpu_max_freq", Long.valueOf(j), 1);
    }

    public static void b(long j) {
        b.a("sp_user_agent_last_check_ts", Long.valueOf(j), 1);
    }

    public static void c(long j) {
        b.a("last_stat_init_time", Long.valueOf(j), 1);
    }

    public static void d(long j) {
        b.a("last_stat_cb_events_time", Long.valueOf(j), 1);
    }

    public static void e(long j) {
        b.a("sp_gzip_server_fail", Long.valueOf(j), 1);
    }

    public static void f(int i) {
        b.a("consent_lgpd", Integer.valueOf(i), 0);
    }

    public static void g(int i) {
        b.a("consent_coppa", Integer.valueOf(i), 0);
    }

    public static void a(String str) {
        b.a("sp_user_agent", str, 3);
    }

    public static void b(String str) {
        b.a("sp_omid_service_downloaded_url", str, 3);
    }

    public static void c(String str) {
        b.a("sp_omsdk_cached_version", str, 3);
    }

    public static void d(String str) {
        b.a("sp_banner_js_downloaded_url", str, 3);
    }

    public static void e(String str) {
        b.a("cb_event_count", str, 3);
    }

    public static void f(long j) {
        b.a("last_delete_res_ts", Long.valueOf(j), 1);
    }

    public static void a(@NonNull String str, int i) {
        b.a("impression_num_".concat(String.valueOf(str)), Integer.valueOf(i), 0);
    }

    public static void a(@NonNull String str, long j) {
        b.a("last_impression_ts_".concat(String.valueOf(str)), Long.valueOf(j), 1);
    }

    public static void a(String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        SharedPreferences a2 = b.a(str + "_preferences");
        if (a2 != null) {
            a2.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }

    public static void a(boolean z) {
        c(z ? 1 : 2);
    }

    public static boolean a(String str, String str2) {
        SharedPreferences a2 = b.a(str);
        if (a2 != null) {
            return a2.contains(str2);
        }
        return false;
    }
}
