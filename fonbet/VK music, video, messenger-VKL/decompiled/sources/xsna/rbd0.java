package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.core.util.parallelrunner.stat.tacker.RunStep;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: PrioritizedParallelTaskExecutor.kt */
/* loaded from: classes.dex */
public final class rbd0 implements lh90 {
    public final nh90 a;
    public final ExecutorService b;

    public rbd0(nh90 nh90Var, ExecutorService executorService) {
        this.a = nh90Var;
        this.b = executorService;
    }

    @Override // xsna.lh90
    public final void a(List<? extends ParallelTaskRunner.f> list, RunStep runStep, boolean z, gzs<s3q0> gzsVar) {
        k5o0 k5o0Var = (k5o0) this.a.invoke(Integer.valueOf(list.size()), Boolean.TRUE);
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        long currentTimeMillis = System.currentTimeMillis();
        List<ParallelTaskRunner.f> invoke = new oh90().invoke(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : invoke) {
            if (((ParallelTaskRunner.f) obj).canBeExecuted()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ParallelTaskRunner.f fVar = (ParallelTaskRunner.f) it.next();
            RunStep runStep2 = runStep;
            this.b.execute(new ecd0(fVar.getPriority(), new qbd0(fVar, k5o0Var, runStep2, countDownLatch, this, gzsVar)));
            runStep = runStep2;
        }
        if (z) {
            countDownLatch.await();
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.i, new Object[]{"TaskExecutionMetricsLogger", String.valueOf(System.currentTimeMillis() - currentTimeMillis)});
    }
}
