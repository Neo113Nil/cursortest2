package xsna;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import ru.ok.android.utils.Logger;
import xsna.c1z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class uvy0 extends oi6 {
    public volatile String a;
    public zty0 b;
    public HashMap c;

    public static void i(Context context, HashMap hashMap) {
        List<InputMethodInfo> enabledInputMethodList;
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null || (enabledInputMethodList = inputMethodManager.getEnabledInputMethodList()) == null) {
            return;
        }
        Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
            if (enabledInputMethodSubtypeList != null) {
                for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                        String locale = inputMethodSubtype.getLocale();
                        if (!TextUtils.isEmpty(locale)) {
                            if (hashSet == null) {
                                hashSet = new HashSet();
                            }
                            hashSet.add(locale.split(BundleUtil.UNDERLINE_TAG, 2)[0]);
                        }
                    }
                }
            }
        }
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        String join = TextUtils.join(StringUtils.COMMA, hashSet);
        if (TextUtils.isEmpty(join)) {
            return;
        }
        hashMap.put("kb_lang", join);
    }

    public final String g(Context context) {
        if (o8z0.b()) {
            gu8.c(null, "DeviceParamsDataProvider: You must not call getInstanceId method from main thread");
            return "";
        }
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        String e = b7z0.b(context).e("instanceId");
                        if (TextUtils.isEmpty(e)) {
                            e = UUID.randomUUID().toString();
                            b7z0.b(context).d("instanceId", e);
                        }
                        this.a = e;
                    }
                } finally {
                }
            }
        }
        String str = this.a;
        return str == null ? "" : str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:10|(5:11|12|13|14|15)|16|17|(6:18|19|20|21|22|(1:24))|(2:25|26)|(32:107|108|109|110|(1:112)(1:115)|113|30|(5:32|(1:34)|35|(2:37|(1:39))(1:105)|104)(1:106)|40|(1:103)(1:44)|45|(1:47)(1:102)|48|(1:50)(1:101)|51|(7:87|88|(1:90)(1:99)|91|92|93|(1:95))|53|54|56|57|(1:59)(1:83)|60|61|(3:76|(1:78)(1:81)|79)(1:63)|64|65|66|(2:69|67)|70|71|72|73)|28|29|30|(0)(0)|40|(1:42)|103|45|(0)(0)|48|(0)(0)|51|(0)|53|54|56|57|(0)(0)|60|61|(0)(0)|64|65|66|(1:67)|70|71|72|73) */
    /* JADX WARN: Can't wrap try/catch for region: R(46:10|11|12|13|14|15|16|17|18|19|20|21|22|(1:24)|25|26|(32:107|108|109|110|(1:112)(1:115)|113|30|(5:32|(1:34)|35|(2:37|(1:39))(1:105)|104)(1:106)|40|(1:103)(1:44)|45|(1:47)(1:102)|48|(1:50)(1:101)|51|(7:87|88|(1:90)(1:99)|91|92|93|(1:95))|53|54|56|57|(1:59)(1:83)|60|61|(3:76|(1:78)(1:81)|79)(1:63)|64|65|66|(2:69|67)|70|71|72|73)|28|29|30|(0)(0)|40|(1:42)|103|45|(0)(0)|48|(0)(0)|51|(0)|53|54|56|57|(0)(0)|60|61|(0)(0)|64|65|66|(1:67)|70|71|72|73) */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1 A[Catch: all -> 0x0014, TryCatch #4 {, blocks: (B:4:0x0007, B:6:0x000b, B:10:0x0017, B:17:0x0098, B:30:0x00dd, B:32:0x00f1, B:34:0x0100, B:35:0x0104, B:37:0x010e, B:39:0x0117, B:40:0x0135, B:42:0x013f, B:45:0x0146, B:51:0x0166, B:66:0x01e2, B:67:0x027c, B:69:0x0282, B:71:0x02b2, B:128:0x0083), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013f A[Catch: all -> 0x0014, TryCatch #4 {, blocks: (B:4:0x0007, B:6:0x000b, B:10:0x0017, B:17:0x0098, B:30:0x00dd, B:32:0x00f1, B:34:0x0100, B:35:0x0104, B:37:0x010e, B:39:0x0117, B:40:0x0135, B:42:0x013f, B:45:0x0146, B:51:0x0166, B:66:0x01e2, B:67:0x027c, B:69:0x0282, B:71:0x02b2, B:128:0x0083), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0282 A[Catch: all -> 0x0014, LOOP:0: B:67:0x027c->B:69:0x0282, LOOP_END, TryCatch #4 {, blocks: (B:4:0x0007, B:6:0x000b, B:10:0x0017, B:17:0x0098, B:30:0x00dd, B:32:0x00f1, B:34:0x0100, B:35:0x0104, B:37:0x010e, B:39:0x0117, B:40:0x0135, B:42:0x013f, B:45:0x0146, B:51:0x0166, B:66:0x01e2, B:67:0x027c, B:69:0x0282, B:71:0x02b2, B:128:0x0083), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ce A[Catch: all -> 0x01df, TryCatch #13 {all -> 0x01df, blocks: (B:61:0x01c3, B:76:0x01ce, B:79:0x01dc), top: B:60:0x01c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a9 A[Catch: all -> 0x01c3, TRY_LEAVE, TryCatch #2 {all -> 0x01c3, blocks: (B:57:0x01a2, B:83:0x01a9), top: B:56:0x01a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Map h(Context context) {
        String str;
        String str2;
        String str3;
        PackageManager packageManager;
        String str4;
        String str5;
        String installerPackageName;
        String str6;
        InstallSourceInfo installSourceInfo;
        String str7;
        TelephonyManager telephonyManager;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i;
        AudioManager audioManager;
        File filesDir;
        if (this.c != null) {
            return new HashMap(this.c);
        }
        final HashMap hashMap = new HashMap();
        gu8.c(null, "DeviceParamsDataProvider: Collect application info...");
        String str13 = Build.DEVICE;
        String str14 = Build.MANUFACTURER;
        String str15 = Build.MODEL;
        String str16 = Build.VERSION.RELEASE;
        String packageName = context.getPackageName();
        String language = Locale.getDefault().getLanguage();
        String language2 = context.getResources().getConfiguration().locale.getLanguage();
        int i2 = c1z0.a.b;
        float f = c1z0.a.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TimeZone timeZone = TimeZone.getDefault();
        String str17 = "";
        try {
            StringBuilder sb = new StringBuilder();
            str = "";
            str2 = "";
            try {
                sb.append(timeZone.getDisplayName(false, 0));
                sb.append(" ");
                sb.append(timeZone.getID());
                str17 = sb.toString();
            } catch (Throwable th) {
                th = th;
                gu8.e(null, "DeviceParamsDataProvider: Timezone name error - " + th.getMessage());
                String str18 = str17;
                o8z0.c(new Runnable() { // from class: xsna.tvy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z;
                        Process exec;
                        BufferedReader bufferedReader;
                        uvy0 uvy0Var = uvy0.this;
                        HashMap hashMap2 = hashMap;
                        uvy0Var.getClass();
                        String str19 = Build.TAGS;
                        boolean z2 = str19 != null && str19.contains("test-keys");
                        if (!z2) {
                            String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
                            int i3 = 0;
                            while (true) {
                                if (i3 >= 10) {
                                    break;
                                }
                                if (bd3.d(strArr[i3])) {
                                    z2 = true;
                                    break;
                                }
                                i3++;
                            }
                        }
                        if (!z2) {
                            Runtime runtime = Runtime.getRuntime();
                            String[] strArr2 = {"/system/xbin/which su", "/system/bin/which su", "which su"};
                            z = z2;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= 3) {
                                    break;
                                }
                                try {
                                    exec = runtime.exec(strArr2[i4]);
                                    try {
                                        bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                                    } catch (Throwable unused) {
                                    }
                                } catch (Throwable unused2) {
                                }
                                try {
                                    StringBuilder sb2 = new StringBuilder();
                                    while (true) {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine == null) {
                                            break;
                                        } else {
                                            sb2.append(readLine);
                                        }
                                    }
                                    exec.destroy();
                                    if (TextUtils.isEmpty(sb2.toString())) {
                                        bufferedReader.close();
                                    } else {
                                        try {
                                            bufferedReader.close();
                                            try {
                                                exec.destroy();
                                            } catch (Throwable unused3) {
                                            }
                                            z = true;
                                            break;
                                        } catch (Throwable unused4) {
                                            z = true;
                                        }
                                    }
                                    if (exec != null) {
                                        exec.destroy();
                                    }
                                    i4++;
                                } catch (Throwable th2) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            }
                        } else {
                            z = z2;
                        }
                        if (!z) {
                            Locale locale = Locale.US;
                            try {
                                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(tgw.b(Process.myPid(), "/proc/", "/mounts"))));
                                try {
                                    String[] strArr3 = {"/sbin/.magisk/", "/sbin/.core/mirror", "/sbin/.core/img", "/sbin/.core/db-0/magisk.db"};
                                    while (true) {
                                        String readLine2 = bufferedReader2.readLine();
                                        if (readLine2 == null) {
                                            break;
                                        }
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= 4) {
                                                break;
                                            }
                                            if (readLine2.contains(strArr3[i5])) {
                                                z = true;
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                    bufferedReader2.close();
                                } finally {
                                }
                            } catch (Throwable unused5) {
                            }
                        }
                        synchronized (uvy0Var) {
                            try {
                                hashMap2.put("rooted", z ? "1" : "0");
                            } finally {
                            }
                        }
                    }
                });
                packageManager = context.getPackageManager();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                    str3 = packageInfo.versionName;
                    if (str3 == null) {
                    }
                    str4 = Long.toString(packageInfo.getLongVersionCode());
                } catch (Throwable unused) {
                    str3 = str;
                }
                if (packageManager != null) {
                }
                str5 = "";
                str6 = str5;
                str7 = "";
                telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                }
                DisplayMetrics f2 = c1z0.f(context);
                String str19 = str10;
                i = f2.widthPixels;
                if (i > 0) {
                }
                int i3 = 0;
                i = 0;
                int i4 = i3;
                int i5 = i;
                hashMap.put("dkm", !((context.getResources().getConfiguration().uiMode & 48) != 32) ? "1" : "0");
                if (packageManager != null) {
                }
                hashMap.put("uimd", String.valueOf(((UiModeManager) context.getSystemService("uimode")).getCurrentModeType()));
                filesDir = context.getFilesDir();
                if (filesDir == null) {
                }
                audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager != null) {
                }
                i(context, hashMap);
                String g = g(context);
                hashMap.put("device", str13);
                hashMap.put(O6.F, X3.d);
                hashMap.put("manufacture", str14);
                hashMap.put("osver", str16);
                hashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, packageName);
                hashMap.put("appver", str3);
                hashMap.put("appbuild", str4);
                hashMap.put("lang", language);
                hashMap.put("app_lang", language2);
                hashMap.put("sim_loc", str11);
                hashMap.put("euname", str15);
                hashMap.put(Logger.METHOD_W, String.valueOf(i5));
                hashMap.put("h", String.valueOf(i4));
                hashMap.put("dpi", String.valueOf(i2));
                hashMap.put("density", String.valueOf(f));
                hashMap.put("operator_id", str19);
                hashMap.put("operator_name", str12);
                hashMap.put("sim_operator_id", str7);
                hashMap.put(AnalyticsBaseParamsConstantsKt.TIMEZONE, str8);
                hashMap.put("instance_id", g);
                hashMap.put("btms", String.valueOf(elapsedRealtime));
                hashMap.put("ains", str9);
                while (r0.hasNext()) {
                }
                String str20 = gt50.a;
                this.b = new zty0(g, packageName, str3, str4);
                this.c = hashMap;
                gu8.c(null, "DeviceParamsDataProvider: Collected");
                return new HashMap(this.c);
            }
        } catch (Throwable th2) {
            th = th2;
            str = "";
            str2 = "";
        }
        String str182 = str17;
        o8z0.c(new Runnable() { // from class: xsna.tvy0
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                Process exec;
                BufferedReader bufferedReader;
                uvy0 uvy0Var = uvy0.this;
                HashMap hashMap2 = hashMap;
                uvy0Var.getClass();
                String str192 = Build.TAGS;
                boolean z2 = str192 != null && str192.contains("test-keys");
                if (!z2) {
                    String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
                    int i32 = 0;
                    while (true) {
                        if (i32 >= 10) {
                            break;
                        }
                        if (bd3.d(strArr[i32])) {
                            z2 = true;
                            break;
                        }
                        i32++;
                    }
                }
                if (!z2) {
                    Runtime runtime = Runtime.getRuntime();
                    String[] strArr2 = {"/system/xbin/which su", "/system/bin/which su", "which su"};
                    z = z2;
                    int i42 = 0;
                    while (true) {
                        if (i42 >= 3) {
                            break;
                        }
                        try {
                            exec = runtime.exec(strArr2[i42]);
                            try {
                                bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable unused22) {
                        }
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                } else {
                                    sb2.append(readLine);
                                }
                            }
                            exec.destroy();
                            if (TextUtils.isEmpty(sb2.toString())) {
                                bufferedReader.close();
                            } else {
                                try {
                                    bufferedReader.close();
                                    try {
                                        exec.destroy();
                                    } catch (Throwable unused3) {
                                    }
                                    z = true;
                                    break;
                                } catch (Throwable unused4) {
                                    z = true;
                                }
                            }
                            if (exec != null) {
                                exec.destroy();
                            }
                            i42++;
                        } catch (Throwable th22) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th3) {
                                th22.addSuppressed(th3);
                            }
                            throw th22;
                        }
                    }
                } else {
                    z = z2;
                }
                if (!z) {
                    Locale locale = Locale.US;
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(tgw.b(Process.myPid(), "/proc/", "/mounts"))));
                        try {
                            String[] strArr3 = {"/sbin/.magisk/", "/sbin/.core/mirror", "/sbin/.core/img", "/sbin/.core/db-0/magisk.db"};
                            while (true) {
                                String readLine2 = bufferedReader2.readLine();
                                if (readLine2 == null) {
                                    break;
                                }
                                int i52 = 0;
                                while (true) {
                                    if (i52 >= 4) {
                                        break;
                                    }
                                    if (readLine2.contains(strArr3[i52])) {
                                        z = true;
                                        break;
                                    }
                                    i52++;
                                }
                            }
                            bufferedReader2.close();
                        } finally {
                        }
                    } catch (Throwable unused5) {
                    }
                }
                synchronized (uvy0Var) {
                    try {
                        hashMap2.put("rooted", z ? "1" : "0");
                    } finally {
                    }
                }
            }
        });
        try {
            packageManager = context.getPackageManager();
            PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, 0);
            str3 = packageInfo2.versionName;
            if (str3 == null) {
                str3 = "null";
            }
        } catch (Throwable unused2) {
            str3 = str;
            packageManager = null;
        }
        try {
            str4 = Long.toString(packageInfo2.getLongVersionCode());
        } catch (Throwable unused3) {
            str4 = str2;
            if (packageManager != null) {
            }
            str5 = "";
            str6 = str5;
            str7 = "";
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
            }
            DisplayMetrics f22 = c1z0.f(context);
            String str192 = str10;
            i = f22.widthPixels;
            if (i > 0) {
            }
            int i32 = 0;
            i = 0;
            int i42 = i32;
            int i52 = i;
            hashMap.put("dkm", !((context.getResources().getConfiguration().uiMode & 48) != 32) ? "1" : "0");
            if (packageManager != null) {
            }
            hashMap.put("uimd", String.valueOf(((UiModeManager) context.getSystemService("uimode")).getCurrentModeType()));
            filesDir = context.getFilesDir();
            if (filesDir == null) {
            }
            audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
            }
            i(context, hashMap);
            String g2 = g(context);
            hashMap.put("device", str13);
            hashMap.put(O6.F, X3.d);
            hashMap.put("manufacture", str14);
            hashMap.put("osver", str16);
            hashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, packageName);
            hashMap.put("appver", str3);
            hashMap.put("appbuild", str4);
            hashMap.put("lang", language);
            hashMap.put("app_lang", language2);
            hashMap.put("sim_loc", str11);
            hashMap.put("euname", str15);
            hashMap.put(Logger.METHOD_W, String.valueOf(i52));
            hashMap.put("h", String.valueOf(i42));
            hashMap.put("dpi", String.valueOf(i2));
            hashMap.put("density", String.valueOf(f));
            hashMap.put("operator_id", str192);
            hashMap.put("operator_name", str12);
            hashMap.put("sim_operator_id", str7);
            hashMap.put(AnalyticsBaseParamsConstantsKt.TIMEZONE, str8);
            hashMap.put("instance_id", g2);
            hashMap.put("btms", String.valueOf(elapsedRealtime));
            hashMap.put("ains", str9);
            while (r0.hasNext()) {
            }
            String str202 = gt50.a;
            this.b = new zty0(g2, packageName, str3, str4);
            this.c = hashMap;
            gu8.c(null, "DeviceParamsDataProvider: Collected");
            return new HashMap(this.c);
        }
        if (packageManager != null) {
            try {
                str5 = "";
                try {
                    if (Build.VERSION.SDK_INT >= 30) {
                        installSourceInfo = packageManager.getInstallSourceInfo(packageName);
                        installerPackageName = installSourceInfo.getInstallingPackageName();
                    } else {
                        installerPackageName = packageManager.getInstallerPackageName(packageName);
                    }
                    str6 = installerPackageName;
                } catch (Throwable unused4) {
                }
            } catch (Throwable unused5) {
            }
            str7 = "";
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                str12 = telephonyManager.getNetworkOperatorName();
                str9 = str6;
                str7 = telephonyManager.getSimState() == 5 ? telephonyManager.getSimOperator() : "";
                String networkOperator = telephonyManager.getNetworkOperator();
                if (TextUtils.isEmpty(networkOperator)) {
                    str8 = str182;
                } else {
                    str8 = str182;
                    if (networkOperator.length() > 3) {
                        String substring = networkOperator.substring(3);
                        str11 = networkOperator.substring(0, 3);
                        str10 = substring;
                    }
                }
                str10 = networkOperator;
                str11 = "";
            } else {
                str8 = str182;
                str9 = str6;
                str10 = "";
                str11 = "";
                str12 = "";
            }
            DisplayMetrics f222 = c1z0.f(context);
            String str1922 = str10;
            i = f222.widthPixels;
            if (i > 0 || (i32 = f222.heightPixels) <= 0) {
                int i322 = 0;
                i = 0;
            }
            int i422 = i322;
            int i522 = i;
            hashMap.put("dkm", !((context.getResources().getConfiguration().uiMode & 48) != 32) ? "1" : "0");
            if (packageManager != null) {
                try {
                    hashMap.put("tscr", packageManager.hasSystemFeature("android.hardware.touchscreen") ? "1" : "0");
                } catch (Throwable unused6) {
                }
                try {
                    PackageInfo packageInfo3 = packageManager.getPackageInfo("com.google.android.webview", 0);
                    if (packageInfo3 != null) {
                        hashMap.put("swvv", packageInfo3.versionName);
                    }
                } catch (Throwable unused7) {
                }
            }
            hashMap.put("uimd", String.valueOf(((UiModeManager) context.getSystemService("uimode")).getCurrentModeType()));
            filesDir = context.getFilesDir();
            if (filesDir == null) {
                long totalSpace = filesDir.getTotalSpace();
                long freeSpace = filesDir.getFreeSpace();
                hashMap.put("mm_tt", String.valueOf(totalSpace));
                hashMap.put("mm_av", String.valueOf(freeSpace));
            }
            audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                hashMap.put("rs", audioManager.getRingerMode() == 2 ? "1" : "0");
            }
            i(context, hashMap);
            String g22 = g(context);
            hashMap.put("device", str13);
            hashMap.put(O6.F, X3.d);
            hashMap.put("manufacture", str14);
            hashMap.put("osver", str16);
            hashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, packageName);
            hashMap.put("appver", str3);
            hashMap.put("appbuild", str4);
            hashMap.put("lang", language);
            hashMap.put("app_lang", language2);
            hashMap.put("sim_loc", str11);
            hashMap.put("euname", str15);
            hashMap.put(Logger.METHOD_W, String.valueOf(i522));
            hashMap.put("h", String.valueOf(i422));
            hashMap.put("dpi", String.valueOf(i2));
            hashMap.put("density", String.valueOf(f));
            hashMap.put("operator_id", str1922);
            hashMap.put("operator_name", str12);
            hashMap.put("sim_operator_id", str7);
            hashMap.put(AnalyticsBaseParamsConstantsKt.TIMEZONE, str8);
            hashMap.put("instance_id", g22);
            hashMap.put("btms", String.valueOf(elapsedRealtime));
            hashMap.put("ains", str9);
            for (Map.Entry entry : hashMap.entrySet()) {
                gu8.c(null, "DeviceParamsDataProvider: " + ((String) entry.getKey()) + " = " + ((String) entry.getValue()));
            }
            String str2022 = gt50.a;
            this.b = new zty0(g22, packageName, str3, str4);
            this.c = hashMap;
            gu8.c(null, "DeviceParamsDataProvider: Collected");
            return new HashMap(this.c);
        }
        str5 = "";
        str6 = str5;
        str7 = "";
        telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
        }
        DisplayMetrics f2222 = c1z0.f(context);
        String str19222 = str10;
        i = f2222.widthPixels;
        if (i > 0) {
        }
        int i3222 = 0;
        i = 0;
        int i4222 = i3222;
        int i5222 = i;
        hashMap.put("dkm", !((context.getResources().getConfiguration().uiMode & 48) != 32) ? "1" : "0");
        if (packageManager != null) {
        }
        hashMap.put("uimd", String.valueOf(((UiModeManager) context.getSystemService("uimode")).getCurrentModeType()));
        filesDir = context.getFilesDir();
        if (filesDir == null) {
        }
        audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
        }
        i(context, hashMap);
        String g222 = g(context);
        hashMap.put("device", str13);
        hashMap.put(O6.F, X3.d);
        hashMap.put("manufacture", str14);
        hashMap.put("osver", str16);
        hashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, packageName);
        hashMap.put("appver", str3);
        hashMap.put("appbuild", str4);
        hashMap.put("lang", language);
        hashMap.put("app_lang", language2);
        hashMap.put("sim_loc", str11);
        hashMap.put("euname", str15);
        hashMap.put(Logger.METHOD_W, String.valueOf(i5222));
        hashMap.put("h", String.valueOf(i4222));
        hashMap.put("dpi", String.valueOf(i2));
        hashMap.put("density", String.valueOf(f));
        hashMap.put("operator_id", str19222);
        hashMap.put("operator_name", str12);
        hashMap.put("sim_operator_id", str7);
        hashMap.put(AnalyticsBaseParamsConstantsKt.TIMEZONE, str8);
        hashMap.put("instance_id", g222);
        hashMap.put("btms", String.valueOf(elapsedRealtime));
        hashMap.put("ains", str9);
        while (r0.hasNext()) {
        }
        String str20222 = gt50.a;
        this.b = new zty0(g222, packageName, str3, str4);
        this.c = hashMap;
        gu8.c(null, "DeviceParamsDataProvider: Collected");
        return new HashMap(this.c);
    }
}
