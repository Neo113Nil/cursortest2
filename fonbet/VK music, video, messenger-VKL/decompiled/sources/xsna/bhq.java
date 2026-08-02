package xsna;

import android.util.Log;

/* compiled from: FLogDefaultLoggingDelegate.java */
/* loaded from: classes.dex */
public final class bhq {
    public static final bhq b;
    public int a;

    static {
        bhq bhqVar = new bhq();
        bhqVar.a = 5;
        b = bhqVar;
    }

    public static void b(int i, String str, String str2) {
        Log.println(i, "unknown:".concat(str), str2);
    }

    public static void c(int i, String str, String str2, Throwable th) {
        String concat = "unknown:".concat(str);
        StringBuilder b2 = v1v.b(str2, '\n');
        b2.append(Log.getStackTraceString(th));
        Log.println(i, concat, b2.toString());
    }

    public final boolean a(int i) {
        return this.a <= i;
    }
}
