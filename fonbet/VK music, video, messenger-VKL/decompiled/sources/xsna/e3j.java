package xsna;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.UndeliveredElementException;
import xsna.kbb;

/* compiled from: ConflatedBufferedChannel.kt */
/* loaded from: classes11.dex */
public final class e3j<E> extends nm8<E> {
    public final BufferOverflow n;

    public e3j(int i, BufferOverflow bufferOverflow, izs<? super E, s3q0> izsVar) {
        super(i, izsVar);
        this.n = bufferOverflow;
        if (bufferOverflow != BufferOverflow.SUSPEND) {
            if (i < 1) {
                throw new IllegalArgumentException(tgw.b(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + fpf0.a(nm8.class).l() + " instead").toString());
        }
    }

    @Override // xsna.nm8
    public final boolean C() {
        return this.n == BufferOverflow.DROP_OLDEST;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        r14 = xsna.fvr.i(r15, r14, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(E e, boolean z) {
        qbb qbbVar;
        e3j<E> e3jVar;
        E e2;
        UndeliveredElementException i;
        if (this.n == BufferOverflow.DROP_LATEST) {
            Object f = super.f(e);
            if (!(f instanceof kbb.b) || (f instanceof kbb.a)) {
                return f;
            }
            if (!z || (r15 = this.c) == null || i == null) {
                return s3q0.a;
            }
            throw i;
        }
        Object obj = tm8.d;
        qbb qbbVar2 = (qbb) nm8.i.get(this);
        while (true) {
            long andIncrement = nm8.e.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean z2 = z(andIncrement, false);
            int i2 = tm8.b;
            long j2 = i2;
            long j3 = j / j2;
            int i3 = (int) (j % j2);
            if (qbbVar2.d != j3) {
                qbb c = nm8.c(this, j3, qbbVar2);
                if (c != null) {
                    qbbVar = c;
                    e2 = e;
                    e3jVar = this;
                } else if (z2) {
                    return new kbb.a(w());
                }
            } else {
                qbbVar = qbbVar2;
                e3jVar = this;
                e2 = e;
            }
            int j4 = nm8.j(e3jVar, qbbVar, i3, e2, j, obj, z2);
            qbbVar2 = qbbVar;
            if (j4 == 0) {
                qbbVar2.b();
                return s3q0.a;
            }
            if (j4 == 1) {
                return s3q0.a;
            }
            if (j4 == 2) {
                if (z2) {
                    qbbVar2.i();
                    return new kbb.a(w());
                }
                a8x0 a8x0Var = obj instanceof a8x0 ? (a8x0) obj : null;
                if (a8x0Var != null) {
                    a8x0Var.d(qbbVar2, i3 + i2);
                }
                o((qbbVar2.d * j2) + i3);
                return s3q0.a;
            }
            if (j4 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (j4 == 4) {
                if (j < nm8.f.get(this)) {
                    qbbVar2.b();
                }
                return new kbb.a(w());
            }
            if (j4 == 5) {
                qbbVar2.b();
            }
            e = e2;
        }
    }

    @Override // xsna.nm8, xsna.ohi0
    public final Object f(E e) {
        return O(e, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        r1 = xsna.fvr.i(r2, r1, null);
     */
    @Override // xsna.nm8, xsna.ohi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(E e, spj<? super s3q0> spjVar) {
        UndeliveredElementException i;
        if (!(O(e, true) instanceof kbb.a)) {
            return s3q0.a;
        }
        izs<E, s3q0> izsVar = this.c;
        if (izsVar == null || i == null) {
            throw w();
        }
        mnh0.d(i, w());
        throw i;
    }
}
