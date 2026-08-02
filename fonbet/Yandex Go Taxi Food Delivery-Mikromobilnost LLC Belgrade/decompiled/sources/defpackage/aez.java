package defpackage;

import android.os.Environment;
import android.util.Log;
import java.io.File;

/* loaded from: classes9.dex */
public class aez {
    public static boolean a;
    public static boolean b;

    public static void a(String str, String str2, Throwable th) {
        if (c()) {
            Log.e(str, str2, th);
        }
    }

    public static void b(String str, String str2) {
        if (c()) {
            Log.i(str, str2);
        }
    }

    public static boolean c() {
        if (b) {
            return a;
        }
        try {
            if (Environment.getExternalStorageState().equals("mounted") && new File(Environment.getExternalStorageDirectory(), "enable_logging").exists()) {
                a = true;
            }
        } catch (RuntimeException unused) {
            a = false;
        }
        b = true;
        return a;
    }
}
