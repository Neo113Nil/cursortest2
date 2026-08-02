package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class bm71 {
    public static volatile boolean a;
    public static final Object b = new Object();

    public static void a(Context context, ge71 ge71Var) {
        gg81 a2;
        if (a) {
            return;
        }
        synchronized (b) {
            if (!a && (a2 = dha1.f().a(context)) != null && a2.g0) {
                Thread.setDefaultUncaughtExceptionHandler(new mi71(ge71Var, Thread.getDefaultUncaughtExceptionHandler(), a2));
                a = true;
            }
        }
    }
}
