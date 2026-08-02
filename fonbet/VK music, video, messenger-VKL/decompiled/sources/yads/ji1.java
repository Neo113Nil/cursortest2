package yads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import xsna.ho8;

/* loaded from: classes10.dex */
public abstract class ji1 {
    public static final Object a = new Object();

    public static String a(String str, Throwable th) {
        String replace;
        synchronized (a) {
            try {
                if (th != null) {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 == null) {
                            replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
                        }
                    }
                } else {
                    replace = null;
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        StringBuilder b = ho8.b(str, "\n  ");
        b.append(replace.replace("\n", "\n  "));
        b.append('\n');
        return b.toString();
    }

    public static void b(String str, String str2) {
        synchronized (a) {
            Log.e(str, str2);
        }
    }

    public static void c(String str, String str2) {
        synchronized (a) {
        }
    }

    public static void d(String str, String str2) {
        synchronized (a) {
        }
    }

    public static void a(String str, String str2, IllegalArgumentException illegalArgumentException) {
        b(str, a(str2, illegalArgumentException));
    }

    public static void a(String str, String str2) {
        synchronized (a) {
        }
    }

    public static void a(RuntimeException runtimeException) {
        d("StreamVolumeManager", a("Error registering stream volume receiver", runtimeException));
    }
}
