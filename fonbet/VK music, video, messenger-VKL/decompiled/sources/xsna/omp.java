package xsna;

import androidx.work.Data;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: EnqueueUtils.kt */
/* loaded from: classes.dex */
public final class omp {
    public static final void a(WorkDatabase workDatabase, androidx.work.a aVar, xux0 xux0Var) {
        int i;
        ArrayList o = e43.o(xux0Var);
        int i2 = 0;
        while (!o.isEmpty()) {
            List<? extends androidx.work.e> list = ((xux0) g5g.I(o)).d;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((androidx.work.e) it.next()).b.j.b() && (i = i + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
            i2 += i;
        }
        if (i2 == 0) {
            return;
        }
        int s = workDatabase.D().s();
        int i3 = aVar.j;
        if (s + i2 > i3) {
            throw new IllegalArgumentException(h5s.c(i2, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", odj.a(i3, s, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: ")));
        }
    }

    public static final fxx0 b(fxx0 fxx0Var) {
        boolean f = fxx0Var.e.f("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean f2 = fxx0Var.e.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean f3 = fxx0Var.e.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (f || !f2 || !f3) {
            return fxx0Var;
        }
        String str = fxx0Var.c;
        Data.a aVar = new Data.a();
        aVar.c(fxx0Var.e.a);
        aVar.a.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
        return fxx0.b(fxx0Var, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", aVar.a(), 0, 0L, 0, 0, 0L, 0, 16777195);
    }
}
