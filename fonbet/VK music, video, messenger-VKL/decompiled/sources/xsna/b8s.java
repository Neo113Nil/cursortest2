package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.core.util.parallelrunner.stat.tacker.RunStep;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

/* compiled from: ForkJoinPrioritizedParallelTaskExecutor.kt */
/* loaded from: classes17.dex */
public final class b8s implements lh90 {
    public final nh90 a;
    public final ForkJoinPool b;

    /* compiled from: ForkJoinPrioritizedParallelTaskExecutor.kt */
    public static final class a extends RecursiveAction {
        private final RunStep runStep;
        private final ParallelTaskRunner.f taskFuture;
        private final k5o0 tracker;

        public a(ParallelTaskRunner.f fVar, k5o0 k5o0Var, RunStep runStep) {
            this.taskFuture = fVar;
            this.tracker = k5o0Var;
            this.runStep = runStep;
        }

        @Override // java.util.concurrent.RecursiveAction
        public final void compute() {
            this.tracker.a(this.taskFuture, this.runStep);
            List<ParallelTaskRunner.f> O2 = this.taskFuture.O2();
            ArrayList arrayList = new ArrayList();
            for (Object obj : O2) {
                if (((ParallelTaskRunner.f) obj).canBeExecuted()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new a((ParallelTaskRunner.f) it.next(), this.tracker, this.runStep));
            }
            ForkJoinTask.invokeAll(arrayList2);
        }
    }

    /* compiled from: ForkJoinPrioritizedParallelTaskExecutor.kt */
    public static final class b extends RecursiveAction {
        private final gzs<s3q0> completion;
        private final ForkJoinPool forkJoinPool;
        private final RunStep runStep;
        private final List<ParallelTaskRunner.f> tasks;
        private final k5o0 tracker;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends ParallelTaskRunner.f> list, k5o0 k5o0Var, RunStep runStep, ForkJoinPool forkJoinPool, gzs<s3q0> gzsVar) {
            this.tasks = list;
            this.tracker = k5o0Var;
            this.runStep = runStep;
            this.forkJoinPool = forkJoinPool;
            this.completion = gzsVar;
        }

        @Override // java.util.concurrent.RecursiveAction
        public final void compute() {
            List<ParallelTaskRunner.f> list = this.tasks;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ParallelTaskRunner.f) obj).canBeExecuted()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new a((ParallelTaskRunner.f) it.next(), this.tracker, this.runStep));
            }
            ForkJoinTask.invokeAll(arrayList2);
            this.forkJoinPool.shutdown();
            gzs<s3q0> gzsVar = this.completion;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    public b8s(nh90 nh90Var, ForkJoinPool forkJoinPool) {
        this.a = nh90Var;
        this.b = forkJoinPool;
    }

    @Override // xsna.lh90
    public final void a(List<? extends ParallelTaskRunner.f> list, RunStep runStep, boolean z, gzs<s3q0> gzsVar) {
        b bVar = new b(j5g.y0(new oh90().invoke(list)), (k5o0) this.a.invoke(Integer.valueOf(list.size()), Boolean.TRUE), runStep, this.b, gzsVar);
        long currentTimeMillis = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = this.b;
        if (z) {
            forkJoinPool.invoke(bVar);
        } else {
            forkJoinPool.execute(bVar);
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.i, new Object[]{"TaskExecutionMetricsLogger", String.valueOf(System.currentTimeMillis() - currentTimeMillis)});
    }
}
