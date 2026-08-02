package defpackage;

/* loaded from: classes9.dex */
public abstract class igo implements Runnable, Comparable, m1k {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public igo(long j) {
        this.a = j;
    }

    public final int b(long j, jgo jgoVar, kgo kgoVar) {
        synchronized (this) {
            if (this._heap == qke.o) {
                return 2;
            }
            synchronized (jgoVar) {
                try {
                    igo[] igoVarArr = jgoVar.a;
                    igo igoVar = igoVarArr != null ? igoVarArr[0] : null;
                    if (kgo.A.get(kgoVar) == 1) {
                        return 1;
                    }
                    if (igoVar == null) {
                        jgoVar.c = j;
                    } else {
                        long j2 = igoVar.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - jgoVar.c > 0) {
                            jgoVar.c = j;
                        }
                    }
                    long j3 = this.a;
                    long j4 = jgoVar.c;
                    if (j3 - j4 < 0) {
                        this.a = j4;
                    }
                    jgoVar.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(jgo jgoVar) {
        if (this._heap != qke.o) {
            this._heap = jgoVar;
        } else {
            ny61.g("Failed requirement.");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((igo) obj).a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // defpackage.m1k
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                jb20 jb20Var = qke.o;
                if (obj == jb20Var) {
                    return;
                }
                jgo jgoVar = obj instanceof jgo ? (jgo) obj : null;
                if (jgoVar != null) {
                    synchronized (jgoVar) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof iyy0 ? (iyy0) obj2 : null) != null) {
                            jgoVar.b(this.b);
                        }
                    }
                }
                this._heap = jb20Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return b64.o(new StringBuilder("Delayed[nanos="), this.a, ']');
    }
}
