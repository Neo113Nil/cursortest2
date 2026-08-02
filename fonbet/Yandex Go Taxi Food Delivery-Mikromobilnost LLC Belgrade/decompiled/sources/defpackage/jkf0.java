package defpackage;

import androidx.media3.common.PriorityTaskManager;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class jkf0 implements u7m {
    public final Executor a;
    public final npg b;
    public final eb7 c;
    public final yc7 d;
    public final PriorityTaskManager e;
    public t7m f;
    public volatile ikf0 g;
    public volatile boolean h;

    public jkf0(fe10 fe10Var, db7 db7Var, Executor executor) {
        executor.getClass();
        this.a = executor;
        zd10 zd10Var = fe10Var.b;
        zd10Var.getClass();
        mpg mpgVar = new mpg();
        mpgVar.a = zd10Var.a;
        mpgVar.h = zd10Var.d;
        mpgVar.i = 4;
        npg a = mpgVar.a();
        this.b = a;
        eb7 b = db7Var.b();
        this.c = b;
        this.d = new yc7(b, a, (byte[]) null, new vfc0(7, this));
        this.e = db7Var.z;
    }

    @Override // defpackage.u7m
    public final void a(t7m t7mVar) {
        this.f = t7mVar;
        PriorityTaskManager priorityTaskManager = this.e;
        if (priorityTaskManager != null) {
            priorityTaskManager.a(-4000);
        }
        boolean z = false;
        while (!z) {
            try {
                if (this.h) {
                    break;
                }
                this.g = new ikf0(this);
                PriorityTaskManager priorityTaskManager2 = this.e;
                if (priorityTaskManager2 != null) {
                    priorityTaskManager2.b();
                }
                this.a.execute(this.g);
                try {
                    this.g.get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (!(cause instanceof PriorityTaskManager.PriorityTooLowException)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        int i = tw21.a;
                        throw cause;
                    }
                }
            } catch (Throwable th) {
                ikf0 ikf0Var = this.g;
                ikf0Var.getClass();
                ikf0Var.blockUntilFinished();
                PriorityTaskManager priorityTaskManager3 = this.e;
                if (priorityTaskManager3 != null) {
                    priorityTaskManager3.d(-4000);
                }
                throw th;
            }
        }
        ikf0 ikf0Var2 = this.g;
        ikf0Var2.getClass();
        ikf0Var2.blockUntilFinished();
        PriorityTaskManager priorityTaskManager4 = this.e;
        if (priorityTaskManager4 != null) {
            priorityTaskManager4.d(-4000);
        }
    }

    @Override // defpackage.u7m
    public final void cancel() {
        this.h = true;
        ikf0 ikf0Var = this.g;
        if (ikf0Var != null) {
            ikf0Var.cancel(true);
        }
    }

    @Override // defpackage.u7m
    public final void remove() {
        eb7 eb7Var = this.c;
        eb7Var.a.removeResource(eb7Var.x.buildCacheKey(this.b));
    }
}
