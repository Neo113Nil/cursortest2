package defpackage;

import java.lang.Thread;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes7.dex */
public final class mi71 implements Thread.UncaughtExceptionHandler {
    public final ge71 a;
    public final Thread.UncaughtExceptionHandler b;
    public final gg81 c;

    public mi71(ge71 ge71Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, gg81 gg81Var) {
        this.a = ge71Var;
        this.b = uncaughtExceptionHandler;
        this.c = gg81Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        ge71 ge71Var = this.a;
        gg81 gg81Var = this.c;
        boolean z = gg81Var.p0;
        try {
            Set set = gg81Var.q0;
            if (set == null) {
                set = EmptySet.a;
            }
            Set set2 = kl71.a;
            if (kl71.b(th.getStackTrace(), set) && ge71Var.a != null) {
                ge71Var.c.execute(new fe71(0, ge71Var, th));
            }
            if (z || uncaughtExceptionHandler == null) {
                return;
            }
        } catch (Throwable th2) {
            try {
                ge71Var.d("Failed to report uncaught exception", th2);
            } catch (Throwable unused) {
            }
            if (z || uncaughtExceptionHandler == null) {
                return;
            }
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
