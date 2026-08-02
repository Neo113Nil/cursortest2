package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.common.c;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class fwt {
    public static boolean b;
    public static boolean c;
    public static final AtomicBoolean a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static boolean a(Context context) {
        if (!c) {
            try {
                PackageInfo c2 = nb51.a(context).c(134217792, "com.google.android.gms");
                c.a(context);
                if (c2 == null || c.d(c2, false) || !c.d(c2, true)) {
                    b = false;
                } else {
                    b = true;
                }
                c = true;
            } catch (PackageManager.NameNotFoundException unused) {
                c = true;
            } catch (Throwable th) {
                c = true;
                throw th;
            }
        }
        return b || !"user".equals(Build.TYPE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00db, code lost:
    
        if (com.google.android.gms.common.c.d(r6, true) == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(Context context, int i) {
        boolean z;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        Bundle bundle;
        try {
            context.getResources().getString(hxh0.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !d.get()) {
            synchronized (eja1.d) {
                try {
                    if (!eja1.e) {
                        eja1.e = true;
                        try {
                            bundle = nb51.a(context).b(128, context.getPackageName()).metaData;
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            eja1.f = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i2 = eja1.f;
            if (i2 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i2 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException(i2);
            }
        }
        try {
            if (!s8o.G(context)) {
                if (s8o.f == null) {
                    s8o.f = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
                }
                if (!s8o.f.booleanValue()) {
                    z = true;
                    cvw.e(i < 0);
                    String packageName = context.getPackageName();
                    PackageManager packageManager = context.getPackageManager();
                    if (z) {
                        packageInfo = null;
                    } else {
                        try {
                            packageInfo = packageManager.getPackageInfo("com.android.vending", 134225984);
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                    packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 134217792);
                    c.a(context);
                    if (c.d(packageInfo2, true)) {
                        if (z) {
                            cvw.l(packageInfo);
                        }
                        if (!z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            if (jpa1.f(packageInfo2.versionCode) < jpa1.f(i)) {
                                new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(packageInfo2.versionCode).length());
                                return 2;
                            }
                            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e2) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                                    return 1;
                                }
                            }
                            return !applicationInfo.enabled ? 3 : 0;
                        }
                    }
                    return 9;
                }
            }
            packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 134217792);
            c.a(context);
            if (c.d(packageInfo2, true)) {
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            return 1;
        }
        z = false;
        cvw.e(i < 0);
        String packageName2 = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        if (z) {
        }
    }

    public static boolean c(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
