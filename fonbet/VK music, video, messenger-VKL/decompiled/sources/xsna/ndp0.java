package xsna;

import android.os.Build;
import android.os.Trace;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Trace.java */
/* loaded from: classes.dex */
public final class ndp0 {
    public static long a;
    public static Method b;
    public static Method c;
    public static Method d;

    public static void a(int i, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            odp0.a(i, f(str));
            return;
        }
        String f = f(str);
        try {
            if (c == null) {
                c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            c.invoke(null, Long.valueOf(a), f, Integer.valueOf(i));
        } catch (Exception e) {
            d(e);
        }
    }

    public static void b(@NonNull String str) {
        Trace.beginSection(f(str));
    }

    public static void c(int i, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            odp0.b(i, f(str));
            return;
        }
        String f = f(str);
        try {
            if (d == null) {
                d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            d.invoke(null, Long.valueOf(a), f, Integer.valueOf(i));
        } catch (Exception e) {
            d(e);
        }
    }

    public static void d(@NonNull Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 29) {
            return odp0.c();
        }
        try {
            if (b == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e) {
            d(e);
            return false;
        }
    }

    @NonNull
    public static String f(@NonNull String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
