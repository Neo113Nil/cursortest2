package xsna;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public class fau {
    public static boolean b = false;
    public static boolean c = false;

    @Deprecated
    public static final AtomicBoolean a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static boolean a(@NonNull Context context) {
        if (!c) {
            try {
                PackageInfo b2 = xzx0.a(context).b("com.google.android.gms", 134217792);
                jau.a(context);
                if (b2 == null || jau.c(b2, false) || !jau.c(b2, true)) {
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

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a2  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(@NonNull Context context, int i) {
        boolean z;
        String packageName;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        Bundle bundle;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !d.get()) {
            synchronized (nvz0.a) {
                try {
                    if (!nvz0.b) {
                        nvz0.b = true;
                        try {
                            bundle = xzx0.a(context).a(128, context.getPackageName()).metaData;
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            nvz0.c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i2 = nvz0.c;
            if (i2 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i2 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException(i2);
            }
        }
        try {
            if (!e43.j(context)) {
                if (e43.d == null) {
                    e43.d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
                }
                if (!e43.d.booleanValue()) {
                    z = true;
                    exc0.b(i < 0);
                    packageName = context.getPackageName();
                    PackageManager packageManager = context.getPackageManager();
                    if (z) {
                        packageInfo = null;
                    } else {
                        try {
                            packageInfo = packageManager.getPackageInfo("com.android.vending", 134225984);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
                        }
                    }
                    packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 134217792);
                    jau.a(context);
                    if (jau.c(packageInfo2, true)) {
                        String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid.");
                    } else {
                        if (z) {
                            exc0.i(packageInfo);
                            if (!jau.c(packageInfo, true)) {
                                String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                            }
                        }
                        if (!z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            int i3 = packageInfo2.versionCode;
                            if ((i3 == -1 ? -1 : i3 / 1000) < (i != -1 ? i / 1000 : -1)) {
                                new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i3).length());
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
                        String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services.");
                    }
                    return 9;
                }
            }
            packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 134217792);
            jau.a(context);
            if (jau.c(packageInfo2, true)) {
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
            return 1;
        }
        z = false;
        exc0.b(i < 0);
        packageName = context.getPackageName();
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

    @Deprecated
    public static int isGooglePlayServicesAvailable(@NonNull Context context) {
        return b(context, 12451000);
    }
}
