package defpackage;

import com.google.android.gms.measurement.internal.g;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes.dex */
public final class n9a1 extends FutureTask implements Comparable {
    public final long a;
    public final boolean b;
    public final String c;
    public final /* synthetic */ aaa1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9a1(aaa1 aaa1Var, Callable callable, boolean z) {
        super(callable);
        this.w = aaa1Var;
        long andIncrement = aaa1.E.getAndIncrement();
        this.a = andIncrement;
        this.c = "Task exception on worker thread";
        this.b = z;
        if (andIncrement == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            y1a1 y1a1Var = ((g) aaa1Var.b).y;
            g.g(y1a1Var);
            y1a1Var.z.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n9a1 n9a1Var = (n9a1) obj;
        boolean z = n9a1Var.b;
        boolean z2 = this.b;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = n9a1Var.a;
        long j2 = this.a;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        y1a1 y1a1Var = ((g) this.w.b).y;
        g.g(y1a1Var);
        y1a1Var.A.b(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        y1a1 y1a1Var = ((g) this.w.b).y;
        g.g(y1a1Var);
        y1a1Var.z.b(th, this.c);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9a1(aaa1 aaa1Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.w = aaa1Var;
        long andIncrement = aaa1.E.getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.b = z;
        if (andIncrement == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            y1a1 y1a1Var = ((g) aaa1Var.b).y;
            g.g(y1a1Var);
            y1a1Var.z.a("Tasks index overflow");
        }
    }
}
