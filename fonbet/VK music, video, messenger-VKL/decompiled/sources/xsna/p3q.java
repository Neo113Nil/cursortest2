package xsna;

import java.util.ArrayList;
import java.util.Collection;
import xsna.n3q;

/* compiled from: ExecutorServiceWatchdogExt.kt */
/* loaded from: classes17.dex */
public final class p3q implements n3q.b {
    public final long a;
    public final /* synthetic */ xru0 b;

    public p3q(long j, qb qbVar, xru0 xru0Var) {
        this.b = xru0Var;
        this.a = j;
    }

    @Override // xsna.n3q.b
    public final void a(Collection<adx0> collection) {
        this.b.invoke(collection);
    }

    @Override // xsna.n3q.b
    public final long b() {
        return 5000L;
    }

    @Override // xsna.n3q.b
    public final long c() {
        return this.a;
    }

    @Override // xsna.n3q.b
    public final void d(ArrayList arrayList) {
        s3q0 s3q0Var = s3q0.a;
    }
}
