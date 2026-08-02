package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.accessibility.AccessibilityManager;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.log.L;
import java.util.Locale;

/* compiled from: DeviceState.kt */
@SuppressLint({"MissingPermission", "StaticFieldLeak"})
/* loaded from: classes.dex */
public final class r6m {
    public static final r6m a = new r6m();
    public static volatile boolean b;
    public static os9 c;
    public static final q6m d;
    public static Context e;

    static {
        new bpn0(new q03(5));
        d = new q6m();
    }

    public static int a() {
        try {
            Context context = e;
            if (context == null) {
                context = null;
            }
            return an10.b((Settings.System.getInt(context.getContentResolver(), "screen_brightness", 255) * 100.0f) / 255.0f);
        } catch (Settings.SettingNotFoundException e2) {
            L.G("can't get brightness: " + e2);
            return -1;
        }
    }

    public static long b(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (Exception unused) {
            return -1L;
        }
    }

    public static long c() {
        return b(Environment.getDataDirectory().getAbsolutePath()) / ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
    }

    @ozl
    public static String d() {
        return !com.vk.core.utils.newtork.b.c().d().l() ? "" : com.vk.core.utils.newtork.b.c().d().toString().toLowerCase(Locale.ROOT);
    }

    @ozl
    public static NetworkInfo e() {
        Context context = e;
        if (context == null) {
            context = null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e2) {
            com.vk.metrics.eventtracking.b.a.q(e2);
            return null;
        }
    }

    @ozl
    public static String f() {
        return com.vk.core.utils.newtork.b.c().d().toString().toLowerCase(Locale.ROOT);
    }

    public static TelephonyManager g() {
        Context context = e;
        if (context == null) {
            context = null;
        }
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static boolean h(int i) {
        Context context = e43.a;
        Context context2 = null;
        if (context == null) {
            context = null;
        }
        if (enj.m(context, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                Context context3 = e;
                if (context3 != null) {
                    context2 = context3;
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    return networkCapabilities.hasTransport(i);
                }
            } catch (Throwable th) {
                L.G(ms9.b("can't get network info: ", th));
                return false;
            }
        }
        return false;
    }

    public static final boolean i() {
        a.getClass();
        return h(4);
    }

    @ozl
    public static boolean j() {
        NetworkInfo e2 = e();
        if (e2 != null) {
            return e2.isConnectedOrConnecting();
        }
        return false;
    }

    @ozl
    public static boolean k() {
        return com.vk.core.utils.newtork.b.c().d().k();
    }

    public static boolean l() {
        Context context = e;
        if (context == null) {
            context = null;
        }
        return ((AccessibilityManager) context.getSystemService("accessibility")).isTouchExplorationEnabled();
    }
}
