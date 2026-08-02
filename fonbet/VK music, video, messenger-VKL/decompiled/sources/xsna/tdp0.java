package xsna;

import androidx.annotation.NonNull;
import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.v1.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: TraceMetricBuilder.java */
/* loaded from: classes13.dex */
public final class tdp0 {
    public final Trace a;

    public tdp0(@NonNull Trace trace) {
        this.a = trace;
    }

    public final com.google.firebase.perf.v1.i a() {
        List unmodifiableList;
        i.b z = com.google.firebase.perf.v1.i.z();
        z.p(this.a.e);
        z.n(this.a.l.b);
        Trace trace = this.a;
        z.o(trace.l.e(trace.m));
        for (Counter counter : this.a.f.values()) {
            z.m(counter.c.get(), counter.b);
        }
        ArrayList arrayList = this.a.i;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z.f(new tdp0((Trace) it.next()).a());
            }
        }
        z.h(this.a.getAttributes());
        Trace trace2 = this.a;
        synchronized (trace2.h) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (PerfSession perfSession : trace2.h) {
                    if (perfSession != null) {
                        arrayList2.add(perfSession);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.firebase.perf.v1.h[] e = PerfSession.e(unmodifiableList);
        if (e != null) {
            z.b(Arrays.asList(e));
        }
        return z.build();
    }
}
