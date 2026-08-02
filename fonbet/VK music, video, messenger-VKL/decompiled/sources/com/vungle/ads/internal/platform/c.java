package com.vungle.ads.internal.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.iab.omid.library.vungle.internal.l;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.executor.j;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.network.w;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import xsna.brm0;
import xsna.c3u;
import xsna.drm0;
import xsna.epx;
import xsna.ja3;
import xsna.msy;
import xsna.o7j;

/* loaded from: classes7.dex */
public final class c implements f {
    public final Context a;
    public final j b;
    public final PowerManager c;
    public final AudioManager d;
    public Long e;
    public String f;
    public Integer g;
    public i0 h;
    public String i;

    public c(Context context, j jVar, PowerManager powerManager, AudioManager audioManager) {
        this.a = context;
        this.b = jVar;
        this.c = powerManager;
        this.d = audioManager;
        q();
    }

    public final void a(w wVar) {
        this.b.execute(new ja3(9, this, wVar));
    }

    public final String b() {
        return this.f;
    }

    public final Integer c() {
        return this.g;
    }

    public final long d() {
        return Build.TIME;
    }

    public final String e() {
        return a.a(this.a);
    }

    public final String f() {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        String str = this.i;
        if (str != null) {
            return str;
        }
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = this.a.getPackageManager();
                of = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo("com.android.vending", of);
            } else {
                packageInfo = this.a.getPackageManager().getPackageInfo("com.android.vending", 0);
            }
            String str2 = packageInfo.versionName;
            this.i = str2;
            return str2;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final long g() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public final long h() {
        Object failure;
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = this.a.getPackageManager();
                of = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo("android", of);
            } else {
                packageInfo = this.a.getPackageManager().getPackageInfo("android", 0);
            }
            failure = Long.valueOf(packageInfo.firstInstallTime);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            if (a instanceof PackageManager.NameNotFoundException) {
                boolean z = u.a;
                StringBuilder a2 = l.a("Error getting OS installation time: ");
                a2.append(((PackageManager.NameNotFoundException) a).getLocalizedMessage());
                t.b("AndroidPlatform", a2.toString());
            }
            failure = -1L;
        }
        return ((Number) failure).longValue();
    }

    public final long i() {
        Lazy a = msy.a(LazyThreadSafetyMode.SYNCHRONIZED, new b(this.a));
        Long l = this.e;
        if (l != null) {
            return l.longValue();
        }
        long a2 = ((FilePreferences) a.getValue()).a("sit", 0L);
        if (a2 == 0) {
            a2 = System.currentTimeMillis();
            ((FilePreferences) a.getValue()).b("sit", a2).b();
        }
        this.e = Long.valueOf(a2);
        return a2;
    }

    public final String j() {
        return System.getProperty("http.agent");
    }

    public final float k() {
        try {
            float streamVolume = this.d.getStreamVolume(3) / this.d.getStreamMaxVolume(3);
            if (!Float.isNaN(streamVolume)) {
                if (!Float.isInfinite(streamVolume) && streamVolume >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (streamVolume > 1.0f) {
                        return 1.0f;
                    }
                    return streamVolume;
                }
            }
        } catch (Exception unused) {
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final boolean l() {
        return this.c.isPowerSaveMode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (xsna.drm0.D(r1, "samsung", true) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m() {
        boolean z;
        String str;
        String str2 = Build.HARDWARE;
        String lowerCase = str2 != null ? str2.toLowerCase(Locale.ROOT) : "";
        if (drm0.D(lowerCase, "exynos", false)) {
            if (Build.VERSION.SDK_INT >= 31) {
                str = Build.SOC_MANUFACTURER;
            }
            z = true;
            boolean z2 = !drm0.D(lowerCase, "mali", false) || z;
            int i = Build.VERSION.SDK_INT;
            return !z2 && (29 > i && i < 34);
        }
        z = false;
        if (drm0.D(lowerCase, "mali", false)) {
        }
        int i2 = Build.VERSION.SDK_INT;
        if (z2) {
        }
    }

    public final boolean n() {
        try {
            return epx.f(Environment.getExternalStorageState(), "mounted");
        } catch (Exception e) {
            boolean z = u.a;
            t.a("AndroidPlatform", "Acquiring external storage state failed", e);
            return false;
        }
    }

    public final boolean o() {
        try {
            if (this.d.getRingerMode() != 0) {
                if (this.d.getRingerMode() != 1) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean p() {
        try {
            return this.d.getStreamVolume(3) > 0;
        } catch (Exception unused) {
            return true;
        }
    }

    public final void q() {
        String str = this.f;
        if (str == null || str.length() == 0) {
            try {
                AppSet.getClient(this.a).getAppSetIdInfo().addOnSuccessListener(new c3u(this, 1));
            } catch (Exception e) {
                boolean z = u.a;
                StringBuilder a = l.a("Error getting AppSetID: ");
                a.append(e.getLocalizedMessage());
                t.b("AndroidPlatform", a.toString());
            } catch (NoClassDefFoundError e2) {
                boolean z2 = u.a;
                StringBuilder a2 = l.a("Required libs to get AppSetID Not available: ");
                a2.append(e2.getLocalizedMessage());
                t.b("AndroidPlatform", a2.toString());
            }
        }
    }

    public static final void a(c cVar, o7j o7jVar) {
        g.a(cVar.a, o7jVar);
    }

    public final i0 a() {
        i0 i0Var;
        String a;
        i0 i0Var2 = this.h;
        if (i0Var2 != null && (a = i0Var2.a()) != null && a.length() != 0) {
            return i0Var2;
        }
        boolean z = true;
        if (brm0.w(Build.MANUFACTURER, "Amazon", true)) {
            i0Var = new i0();
            try {
                ContentResolver contentResolver = this.a.getContentResolver();
                if (Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING) != 1) {
                    z = false;
                }
                i0Var.b = z;
                i0Var.a = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Settings.SettingNotFoundException e) {
                boolean z2 = u.a;
                t.a("AndroidPlatform", "Error getting Amazon advertising info: Setting not found.", e);
            } catch (Exception e2) {
                boolean z3 = u.a;
                t.a("AndroidPlatform", "Error getting Amazon advertising info", e2);
            }
        } else {
            i0 i0Var3 = new i0();
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a);
                i0Var3.a(advertisingIdInfo.getId());
                i0Var3.a(advertisingIdInfo.isLimitAdTrackingEnabled());
            } catch (GooglePlayServicesNotAvailableException e3) {
                boolean z4 = u.a;
                StringBuilder a2 = l.a("Play services Not available: ");
                a2.append(e3.getLocalizedMessage());
                t.b("AndroidPlatform", a2.toString());
            } catch (Exception e4) {
                boolean z5 = u.a;
                StringBuilder a3 = l.a("Error getting Google advertising info: ");
                a3.append(e4.getLocalizedMessage());
                t.b("AndroidPlatform", a3.toString());
            } catch (NoClassDefFoundError e5) {
                boolean z6 = u.a;
                StringBuilder a4 = l.a("Play services Not available: ");
                a4.append(e5.getLocalizedMessage());
                t.b("AndroidPlatform", a4.toString());
                i0Var3.a(Settings.Secure.getString(this.a.getContentResolver(), "advertising_id"));
            }
            i0Var = i0Var3;
        }
        this.h = i0Var;
        return i0Var;
    }

    public /* synthetic */ c(Context context, j jVar) {
        this(context, jVar, (PowerManager) context.getSystemService("power"), (AudioManager) context.getSystemService("audio"));
    }

    public static final void a(c cVar, AppSetIdInfo appSetIdInfo) {
        if (appSetIdInfo != null) {
            cVar.f = appSetIdInfo.getId();
            cVar.g = Integer.valueOf(appSetIdInfo.getScope());
        }
    }
}
