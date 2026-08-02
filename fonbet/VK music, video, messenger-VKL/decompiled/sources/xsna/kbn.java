package xsna;

import xsna.jbn;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes8.dex */
public final class kbn extends cas {
    public boolean b;
    public final /* synthetic */ jbn c;
    public final /* synthetic */ jbn.b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbn(agk0 agk0Var, jbn jbnVar, jbn.b bVar) {
        super(agk0Var);
        this.c = jbnVar;
        this.d = bVar;
    }

    @Override // xsna.cas, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.b) {
            return;
        }
        this.b = true;
        jbn jbnVar = this.c;
        jbn.b bVar = this.d;
        synchronized (jbnVar) {
            try {
                int i = bVar.h - 1;
                bVar.h = i;
                if (i == 0 && bVar.f) {
                    jbnVar.x(bVar);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
