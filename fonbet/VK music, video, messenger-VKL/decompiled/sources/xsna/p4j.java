package xsna;

import java.util.Iterator;

/* compiled from: ConnectionPoolImpl.kt */
/* loaded from: classes12.dex */
public final class p4j implements hyg0, ui50 {
    public final hyg0 b;
    public final wi50 c;
    public kotlin.coroutines.d d;
    public Throwable e;

    public p4j(hyg0 hyg0Var) {
        wi50 a = bay.a();
        this.b = hyg0Var;
        this.c = a;
    }

    @Override // xsna.hyg0
    public final qyg0 V0(String str) {
        return this.b.V0(str);
    }

    @Override // xsna.ui50
    public final Object b(spj spjVar) {
        return this.c.b(spjVar);
    }

    @Override // xsna.ui50
    public final void c(Object obj) {
        this.c.c(null);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    public final void h(StringBuilder sb) {
        if (this.d == null && this.e == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        kotlin.coroutines.d dVar = this.d;
        if (dVar != null) {
            sb.append("\t\tCoroutine: " + dVar);
            sb.append('\n');
        }
        Throwable th = this.e;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            Iterator it = j5g.S(drm0.Q(mnh0.A(th)), 1).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
