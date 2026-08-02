package xsna;

import java.util.ArrayList;
import java.util.Collection;
import xsna.n3q;

/* compiled from: ExecutorServiceWatchdogExt.kt */
/* loaded from: classes17.dex */
public final class o3q implements n3q.b {
    public final long a;
    public final long b;
    public final /* synthetic */ izs<Collection<adx0>, s3q0> c;
    public final /* synthetic */ izs<Collection<adx0>, s3q0> d;

    /* JADX WARN: Multi-variable type inference failed */
    public o3q(long j, long j2, izs<? super Collection<adx0>, s3q0> izsVar, izs<? super Collection<adx0>, s3q0> izsVar2) {
        this.c = izsVar;
        this.d = izsVar2;
        this.a = j;
        this.b = j2;
    }

    @Override // xsna.n3q.b
    public final void a(Collection<adx0> collection) {
        this.d.invoke(collection);
    }

    @Override // xsna.n3q.b
    public final long b() {
        return this.a;
    }

    @Override // xsna.n3q.b
    public final long c() {
        return this.b;
    }

    @Override // xsna.n3q.b
    public final void d(ArrayList arrayList) {
        this.c.invoke(arrayList);
    }
}
