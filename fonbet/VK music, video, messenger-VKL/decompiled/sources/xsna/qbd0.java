package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.core.util.parallelrunner.stat.tacker.RunStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qbd0 implements Runnable {
    public final /* synthetic */ ParallelTaskRunner.f b;
    public final /* synthetic */ k5o0 c;
    public final /* synthetic */ RunStep d;
    public final /* synthetic */ CountDownLatch e;
    public final /* synthetic */ rbd0 f;
    public final /* synthetic */ gzs g;

    public /* synthetic */ qbd0(ParallelTaskRunner.f fVar, k5o0 k5o0Var, RunStep runStep, CountDownLatch countDownLatch, rbd0 rbd0Var, gzs gzsVar) {
        this.b = fVar;
        this.c = k5o0Var;
        this.d = runStep;
        this.e = countDownLatch;
        this.f = rbd0Var;
        this.g = gzsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rbd0 rbd0Var = this.f;
        ExecutorService executorService = rbd0Var.b;
        ParallelTaskRunner.f fVar = this.b;
        fVar.getClass();
        k5o0 k5o0Var = this.c;
        RunStep runStep = this.d;
        k5o0Var.a(fVar, runStep);
        CountDownLatch countDownLatch = this.e;
        countDownLatch.countDown();
        long count = countDownLatch.getCount();
        gzs gzsVar = this.g;
        if (count == 0) {
            executorService.shutdown();
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
        List<ParallelTaskRunner.f> O2 = fVar.O2();
        ArrayList arrayList = new ArrayList();
        for (Object obj : O2) {
            if (((ParallelTaskRunner.f) obj).canBeExecuted()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ParallelTaskRunner.f fVar2 = (ParallelTaskRunner.f) it.next();
            executorService.execute(new ecd0(fVar2.getPriority(), new qbd0(fVar2, k5o0Var, runStep, countDownLatch, rbd0Var, gzsVar)));
        }
    }
}
