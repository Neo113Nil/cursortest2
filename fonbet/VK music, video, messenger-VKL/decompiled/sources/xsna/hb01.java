package xsna;

import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class hb01 implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ kb01 b;

    public hb01(kb01 kb01Var, String str) {
        this.b = kb01Var;
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        k901 k901Var = ((mb01) this.b.b).j;
        mb01.k(k901Var);
        k901Var.i.b(th, this.a);
    }
}
