package xsna;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;

/* compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* loaded from: classes.dex */
public final class l8h0 implements xhq<dxx0> {
    public final e9e0<Context> b;
    public final e9e0<n0q> c;
    public final k8h0 d;

    public l8h0(e9e0 e9e0Var, e9e0 e9e0Var2, k8h0 k8h0Var) {
        this.b = e9e0Var;
        this.c = e9e0Var2;
        this.d = k8h0Var;
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new hyx(this.b.get(), this.c.get(), (SchedulerConfig) this.d.get());
    }
}
