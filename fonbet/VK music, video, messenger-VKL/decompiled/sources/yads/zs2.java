package yads;

import android.os.Build;
import java.io.File;

/* loaded from: classes10.dex */
public final class zs2 {
    public static final String[] a = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};

    public static boolean a() {
        try {
            if (new File("/system/app/Superuser/Superuser.apk").exists()) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            String[] strArr = a;
            boolean z = false;
            for (int i = 0; i < 8; i++) {
                z = z || (Build.VERSION.SDK_INT < 31 && new File(strArr[i]).exists());
            }
            if (z) {
                return true;
            }
        } catch (Throwable unused2) {
        }
        return false;
    }
}
