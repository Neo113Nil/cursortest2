package sg.bigo.ads.a;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import org.json.JSONObject;
import sg.bigo.ads.b.c;
import sg.bigo.ads.b.d;
import sg.bigo.ads.b.h;
import sg.bigo.ads.b.i;
import sg.bigo.ads.b.j;
import sg.bigo.ads.b.k;
import sg.bigo.ads.c.e;
import sg.bigo.ads.c.f;
import sg.bigo.ads.c.g;

/* loaded from: classes9.dex */
public final class b {
    public static JSONObject a(Context context) {
        Pair pair;
        JSONObject jSONObject = new JSONObject();
        g.a(jSONObject, a.b, Integer.valueOf(a.a));
        g.a(jSONObject, a.f, Build.BRAND);
        g.a(jSONObject, a.g, Build.MODEL);
        g.a(jSONObject, a.h, Build.FINGERPRINT);
        String str = a.d;
        int i = Build.VERSION.SDK_INT;
        g.a(jSONObject, str, Integer.valueOf(Settings.Global.getInt(context.getContentResolver(), "boot_count", 0)));
        g.a(jSONObject, a.e, Long.valueOf(SystemClock.elapsedRealtime() / 1000));
        Signature a = f.a(context, a.M);
        String str2 = "";
        if (a != null) {
            byte[] byteArray = a.toByteArray();
            pair = new Pair(byteArray != null ? g.a(byteArray) : "", f.a(byteArray));
        } else {
            pair = null;
        }
        if (pair != null) {
            g.a(jSONObject, a.i, pair.first);
            g.a(jSONObject, a.j, pair.second);
        }
        g.a(jSONObject, a.c, Integer.valueOf(i));
        String str3 = a.k;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        g.a(jSONObject, str3, Boolean.valueOf(keyguardManager != null && keyguardManager.isKeyguardSecure()));
        g.a(jSONObject, a.l, Integer.valueOf(Settings.System.getInt(context.getContentResolver(), "screen_off_timeout", -1)));
        try {
            String packageName = context.getPackageName();
            String installerPackageName = context.getPackageManager().getInstallerPackageName(packageName);
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            g.a(jSONObject, a.A, packageName);
            g.a(jSONObject, a.G, Integer.valueOf(packageInfo.versionCode));
            String str4 = a.H;
            if (!TextUtils.isEmpty(installerPackageName)) {
                str2 = installerPackageName;
            }
            g.a(jSONObject, str4, str2);
            g.a(jSONObject, a.I, Long.valueOf(packageInfo.firstInstallTime));
            g.a(jSONObject, a.J, Long.valueOf(packageInfo.lastUpdateTime));
        } catch (Exception unused) {
        }
        g.a(jSONObject, a.m, Resources.getSystem().getConfiguration().getLocales().get(0).toLanguageTag());
        g.a(jSONObject, a.n, e.a(a.X));
        g.a(jSONObject, a.o, sg.bigo.ads.c.b.a(context));
        g.a(jSONObject, a.aa, sg.bigo.ads.c.b.b(context));
        g.a(jSONObject, a.ab, e.a(a.Z));
        sg.bigo.ads.b.g[] gVarArr = {new sg.bigo.ads.b.a(), new sg.bigo.ads.b.b(), new c(), new d(), new sg.bigo.ads.b.e(), new sg.bigo.ads.b.f(), new h(), new i(), new j(), new k()};
        JSONObject jSONObject2 = new JSONObject();
        for (int i2 = 0; i2 < 10; i2++) {
            sg.bigo.ads.b.g gVar = gVarArr[i2];
            try {
                Object a2 = gVar.a(context);
                if (a2 != null) {
                    jSONObject2.put(gVar.a(), a2);
                }
            } catch (Throwable unused2) {
            }
        }
        g.a(jSONObject, a.F, jSONObject2);
        return jSONObject;
    }
}
