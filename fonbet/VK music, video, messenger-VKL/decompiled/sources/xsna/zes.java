package xsna;

import xsna.bfs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class zes implements izs {
    public final /* synthetic */ bfs.a b;
    public final /* synthetic */ long c;

    public /* synthetic */ zes(bfs.a aVar, long j) {
        this.b = aVar;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        this.b.c.put(Long.valueOf(this.c), new bfs.d((Throwable) obj));
        return s3q0.a;
    }
}
