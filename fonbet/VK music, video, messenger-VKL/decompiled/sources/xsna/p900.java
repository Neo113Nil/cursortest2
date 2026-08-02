package xsna;

import xsna.qyj;

/* compiled from: LruCountingMemoryCache.java */
/* loaded from: classes12.dex */
public final class p900 implements zag0<Object> {
    public final /* synthetic */ qyj.a b;
    public final /* synthetic */ q900 c;

    public p900(q900 q900Var, qyj.a aVar) {
        this.c = q900Var;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    @Override // xsna.zag0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean z;
        Object obj2;
        q900 q900Var = this.c;
        qyj.a aVar = this.b;
        synchronized (q900Var) {
            synchronized (q900Var) {
                z = false;
                sex0.f(aVar.c > 0);
                aVar.c--;
            }
            uvf.q(q900Var.q(aVar));
            if (!z) {
                aVar = null;
            }
            if (aVar != null && (obj2 = aVar.e) != null) {
                ((rj2) obj2).a(aVar.a, true);
            }
            q900Var.o();
            q900Var.l();
        }
        synchronized (q900Var) {
            try {
                if (!aVar.d && aVar.c == 0) {
                    q900Var.c.d(aVar.a, aVar);
                    z = true;
                }
            } finally {
            }
        }
        uvf.q(q900Var.q(aVar));
        if (!z) {
        }
        if (aVar != null) {
            ((rj2) obj2).a(aVar.a, true);
        }
        q900Var.o();
        q900Var.l();
    }
}
