package xsna;

import android.util.Log;

/* compiled from: Logging.java */
/* loaded from: classes.dex */
public final class b200 {
    public static void a(Object obj, String str, String str2) {
        if (Log.isLoggable("TRuntime.".concat(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void b(String str, String str2, Exception exc) {
        String concat = "TRuntime.".concat(str);
        if (Log.isLoggable(concat, 6)) {
            Log.e(concat, str2, exc);
        }
    }
}
