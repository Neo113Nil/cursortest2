package xsna;

import java.util.Iterator;

/* compiled from: RealConnectionPool.kt */
/* loaded from: classes11.dex */
public final class k8f0 extends c5o0 {
    public final /* synthetic */ l8f0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8f0(l8f0 l8f0Var, String str) {
        super(str, true);
        this.e = l8f0Var;
    }

    @Override // xsna.c5o0
    public final long a() {
        l8f0 l8f0Var = this.e;
        long nanoTime = System.nanoTime();
        Iterator<g8f0> it = l8f0Var.d.iterator();
        int i = 0;
        long j = Long.MIN_VALUE;
        g8f0 g8f0Var = null;
        int i2 = 0;
        while (it.hasNext()) {
            g8f0 next = it.next();
            synchronized (next) {
                if (l8f0Var.b(next, nanoTime) > 0) {
                    i2++;
                } else {
                    i++;
                    long j2 = nanoTime - next.q;
                    if (j2 > j) {
                        g8f0Var = next;
                        j = j2;
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
            }
        }
        long j3 = l8f0Var.a;
        if (j < j3 && i <= 5) {
            if (i > 0) {
                return j3 - j;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        synchronized (g8f0Var) {
            if (!g8f0Var.p.isEmpty()) {
                return 0L;
            }
            if (g8f0Var.q + j != nanoTime) {
                return 0L;
            }
            g8f0Var.j = true;
            l8f0Var.d.remove(g8f0Var);
            x2r0.d(g8f0Var.d);
            if (l8f0Var.d.isEmpty()) {
                l8f0Var.b.a();
            }
            return 0L;
        }
    }
}
