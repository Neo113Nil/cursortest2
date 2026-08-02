package yads;

import java.lang.Thread;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class kb3 implements Thread.UncaughtExceptionHandler {
    public final jp2 a;
    public final Thread.UncaughtExceptionHandler b;
    public final qu2 c;

    public kb3(bu1 bu1Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, qu2 qu2Var) {
        this.a = bu1Var;
        this.b = uncaughtExceptionHandler;
        this.c = qu2Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            Set set = this.c.q0;
            if (set == null) {
                set = EmptySet.b;
            }
            Set set2 = l43.a;
            if (l43.a(th.getStackTrace(), set)) {
                this.a.reportUnhandledException(th);
            }
            if (this.c.p0 || (uncaughtExceptionHandler = this.b) == null) {
                return;
            }
        } catch (Throwable th2) {
            try {
                this.a.reportError("Failed to report uncaught exception", th2);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable unused) {
            }
            if (this.c.p0 || (uncaughtExceptionHandler = this.b) == null) {
                return;
            }
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
