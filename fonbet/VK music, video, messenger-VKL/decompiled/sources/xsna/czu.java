package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.UserManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: HealthConnectClient.kt */
/* loaded from: classes12.dex */
public interface czu {
    public static final b a = b.a;

    /* compiled from: HealthConnectClient.kt */
    public static final class a {
        public static final int a(Context context) {
            return (((UserManager) context.getSystemService("user")).isProfile() || context.getSystemService("healthconnect") == null) ? 1 : 3;
        }
    }

    /* compiled from: HealthConnectClient.kt */
    public static final class b {
        public static final /* synthetic */ b a = new b();
        public static final String b;

        static {
            b = Build.VERSION.SDK_INT >= 34 ? "android.health.connect.action.HEALTH_HOME_SETTINGS" : "androidx.health.ACTION_HEALTH_CONNECT_SETTINGS";
        }

        public static String a() {
            return b;
        }

        public static czu b(b bVar, Context context) {
            bVar.getClass();
            int c = c(context);
            if (c == 1) {
                throw new UnsupportedOperationException("SDK version too low or running in a profile");
            }
            if (c != 2) {
                return Build.VERSION.SDK_INT >= 34 ? new qzu(context) : new nzu(context, "com.google.android.apps.healthdata");
            }
            throw new IllegalStateException("Service not available");
        }

        public static int c(Context context) {
            int i = Build.VERSION.SDK_INT;
            if (34 <= i) {
                return a.a(context);
            }
            if (i >= 34) {
                return 1;
            }
            PackageManager packageManager = context.getPackageManager();
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.apps.healthdata", 0);
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo == null || !applicationInfo.enabled || packageInfo.getLongVersionCode() < 68623) {
                    return 2;
                }
                Intent intent = new Intent();
                intent.setPackage("com.google.android.apps.healthdata");
                intent.setAction("androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE");
                return !packageManager.queryIntentServices(intent, 0).isEmpty() ? 3 : 2;
            } catch (PackageManager.NameNotFoundException unused) {
                return 2;
            }
        }
    }

    Object a(o71 o71Var, ContinuationImpl continuationImpl);

    Object b(j7f0 j7f0Var, ContinuationImpl continuationImpl);

    Object d(t71 t71Var, ContinuationImpl continuationImpl);

    sx90 e();
}
