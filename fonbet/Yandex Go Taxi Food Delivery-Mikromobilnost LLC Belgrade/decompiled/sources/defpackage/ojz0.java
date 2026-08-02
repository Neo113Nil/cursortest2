package defpackage;

import java.util.concurrent.ExecutionException;
import kotlin.Result;

/* loaded from: classes.dex */
public final class ojz0 implements Runnable {
    public final /* synthetic */ int a;
    public final euy b;
    public final j18 c;

    public /* synthetic */ ojz0(euy euyVar, j18 j18Var, int i) {
        this.a = i;
        this.b = euyVar;
        this.c = j18Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        j18 j18Var = this.c;
        euy euyVar = this.b;
        switch (i) {
            case 0:
                if (euyVar.isCancelled()) {
                    j18Var.b(null);
                    return;
                }
                boolean z = false;
                while (true) {
                    try {
                        try {
                            Object obj = euyVar.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            j18Var.resumeWith(obj);
                            return;
                        } catch (ExecutionException e) {
                            j18Var.resumeWith(new Result.Failure(e.getCause()));
                            return;
                        }
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
            default:
                if (euyVar.isCancelled()) {
                    j18Var.b(null);
                    return;
                }
                try {
                    j18Var.resumeWith(ga.h(euyVar));
                    return;
                } catch (ExecutionException e2) {
                    j18Var.resumeWith(new Result.Failure(e2.getCause()));
                    return;
                }
        }
    }
}
