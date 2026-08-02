package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.concurrent.ExecutorService;
import xsna.b0g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a0g implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a0g(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((b0g.a) this.c).a();
                break;
            case 1:
                n3w n3wVar = (n3w) this.c;
                n3wVar.h = new eil0(n3wVar.g);
                break;
            default:
                j5o0 j5o0Var = ((ParallelTaskRunner) this.c).k;
                for (i5o0 i5o0Var : j5o0Var.b.values()) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.i, new Object[]{"TaskExecutionMetricsLogger", i5o0Var.c + ' ' + i5o0Var.a});
                    }
                }
                ((ExecutorService) j5o0Var.a.invoke()).execute(new qp50(j5o0Var, 1));
                break;
        }
    }
}
