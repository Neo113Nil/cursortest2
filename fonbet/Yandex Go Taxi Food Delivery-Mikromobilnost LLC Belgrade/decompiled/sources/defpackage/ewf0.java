package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.b;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public class ewf0 {
    public static final b a = b.b;
    public static final Object b = new Object();
    public static Method c;
    public static boolean d;

    public static void a(Context context) {
        Context context2;
        Context context3;
        cvw.m(context, "Context must not be null");
        a.getClass();
        AtomicBoolean atomicBoolean = fwt.a;
        b bVar = b.b;
        int d2 = bVar.d(context, 11925000);
        if (d2 != 0) {
            Intent b2 = bVar.b(context, d2, "e");
            StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 46);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(d2);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (b2 != null) {
                throw new GooglePlayServicesRepairableException(d2, b2);
            }
            throw new GooglePlayServicesNotAvailableException(d2);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (b) {
            Context context4 = null;
            if (!d) {
                try {
                    context2 = gan.c(context, gan.e, "com.google.android.gms.providerinstaller.dynamite").a;
                } catch (DynamiteModule$LoadingException unused) {
                    context2 = null;
                }
                if (context2 != null) {
                    b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                    return;
                }
            }
            boolean z = d;
            try {
                context3 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused2) {
                context3 = null;
            }
            if (context3 != null) {
                d = true;
                if (!z) {
                    try {
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        ClassLoader classLoader = context3.getClassLoader();
                        int i = 10;
                        gr81 gr81Var = new gr81(i, Context.class, context);
                        Class cls = Long.TYPE;
                        exa1.f(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", gr81Var, new k3a1(i, cls, Long.valueOf(uptimeMillis)), new k3a1(i, cls, Long.valueOf(uptimeMillis2)));
                    } catch (Exception e) {
                        e.toString();
                    }
                }
                context4 = context3;
            }
            if (context4 != null) {
                b(context4, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new GooglePlayServicesNotAvailableException(8);
            }
        }
    }

    public static void b(Context context, String str) {
        try {
            if (c == null) {
                c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            c.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
