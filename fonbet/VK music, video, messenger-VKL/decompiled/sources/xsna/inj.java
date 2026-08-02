package xsna;

import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;

/* compiled from: ContextExt.kt */
/* loaded from: classes9.dex */
public final class inj {
    public static final boolean a(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static final void b(Context context, ServiceConnection serviceConnection) {
        if (serviceConnection != null) {
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable th) {
                Log.e("ServiceExt", "unbindServiceSafely", th);
            }
        }
    }
}
