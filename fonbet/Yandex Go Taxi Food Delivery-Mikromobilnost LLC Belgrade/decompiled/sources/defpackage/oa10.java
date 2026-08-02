package defpackage;

import com.yandex.pulse.processcpu.MeasurementTask;
import com.yandex.pulse.utils.RunnableScheduler;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.b;

/* loaded from: classes8.dex */
public final class oa10 {
    public final ArrayList a = new ArrayList();
    public final RunnableScheduler b = new RunnableScheduler(new ssu(9, this));
    public long c;

    public final void a() {
        RunnableScheduler runnableScheduler = this.b;
        if (runnableScheduler.getIsRunning()) {
            runnableScheduler.stop();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                k5f0 k5f0Var = (k5f0) it.next();
                switch (k5f0Var.a) {
                    case 0:
                        l5f0 l5f0Var = (l5f0) k5f0Var.b;
                        MeasurementTask measurementTask = l5f0Var.k;
                        if (measurementTask != null) {
                            measurementTask.h.set(true);
                            l5f0Var.k = null;
                        }
                        l5f0Var.o = -1L;
                        l5f0Var.n = b.f();
                        break;
                }
            }
        }
    }
}
