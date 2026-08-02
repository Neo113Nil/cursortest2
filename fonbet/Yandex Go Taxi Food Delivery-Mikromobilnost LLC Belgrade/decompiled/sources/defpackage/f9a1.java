package defpackage;

import com.google.android.gms.measurement.internal.g;
import java.lang.Thread;

/* loaded from: classes.dex */
public final class f9a1 implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ aaa1 b;

    public f9a1(aaa1 aaa1Var, String str) {
        this.b = aaa1Var;
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        y1a1 y1a1Var = ((g) this.b.b).y;
        g.g(y1a1Var);
        y1a1Var.z.b(th, this.a);
    }
}
