package xsna;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class ib01 extends FutureTask implements Comparable {
    public final long b;
    public final boolean c;
    public final String d;
    public final /* synthetic */ kb01 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib01(kb01 kb01Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.e = kb01Var;
        long andIncrement = kb01.n.getAndIncrement();
        this.b = andIncrement;
        this.d = str;
        this.c = z;
        if (andIncrement == Long.MAX_VALUE) {
            k901 k901Var = ((mb01) kb01Var.b).j;
            mb01.k(k901Var);
            k901Var.i.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull Object obj) {
        ib01 ib01Var = (ib01) obj;
        boolean z = ib01Var.c;
        boolean z2 = this.c;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = ib01Var.b;
        long j2 = this.b;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        k901 k901Var = ((mb01) this.e.b).j;
        mb01.k(k901Var);
        k901Var.j.b(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        k901 k901Var = ((mb01) this.e.b).j;
        mb01.k(k901Var);
        k901Var.i.b(th, this.d);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib01(kb01 kb01Var, Callable callable, boolean z) {
        super(callable);
        this.e = kb01Var;
        long andIncrement = kb01.n.getAndIncrement();
        this.b = andIncrement;
        this.d = "Task exception on worker thread";
        this.c = z;
        if (andIncrement == Long.MAX_VALUE) {
            k901 k901Var = ((mb01) kb01Var.b).j;
            mb01.k(k901Var);
            k901Var.i.a("Tasks index overflow");
        }
    }
}
