package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.core.util.parallelrunner.stat.tacker.RunStep;
import java.util.Iterator;
import java.util.List;

/* compiled from: SequentialParallelTaskExecutor.kt */
/* loaded from: classes17.dex */
public final class vli0 implements lh90 {
    public final nh90 a;

    public vli0(nh90 nh90Var) {
        this.a = nh90Var;
    }

    @Override // xsna.lh90
    public final void a(List<? extends ParallelTaskRunner.f> list, RunStep runStep, boolean z, gzs<s3q0> gzsVar) {
        k5o0 k5o0Var = (k5o0) this.a.invoke(Integer.valueOf(list.size()), Boolean.FALSE);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            k5o0Var.a((ParallelTaskRunner.f) it.next(), runStep);
        }
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }
}
