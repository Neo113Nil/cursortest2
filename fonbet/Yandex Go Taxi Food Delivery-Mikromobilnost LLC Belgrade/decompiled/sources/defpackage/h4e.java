package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* loaded from: classes9.dex */
public final class h4e extends a {
    public final BufferOverflow K;

    public h4e(int i, BufferOverflow bufferOverflow, tls tlsVar) {
        super(i, tlsVar);
        this.K = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            yci0.x("This implementation does not support suspension for senders, use ", qoi0.a(a.class).d(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        w511.f(oyr.j(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // kotlinx.coroutines.channels.a
    public final boolean F() {
        return this.K == BufferOverflow.DROP_OLDEST;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r0 = defpackage.sub1.b(r0, r17, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object U(Object obj, boolean z) {
        UndeliveredElementException b;
        BufferOverflow bufferOverflow = this.K;
        BufferOverflow bufferOverflow2 = BufferOverflow.DROP_LATEST;
        zy11 zy11Var = zy11.a;
        if (bufferOverflow == bufferOverflow2) {
            Object d = super.d(obj);
            ni9 ni9Var = oi9.b;
            if (!(d instanceof ni9) || (d instanceof mi9)) {
                return d;
            }
            if (!z || (r0 = this.b) == null || b == null) {
                return zy11Var;
            }
            throw b;
        }
        Object obj2 = obj;
        Object obj3 = kq6.d;
        pi9 pi9Var = (pi9) a.A.get(this);
        while (true) {
            long andIncrement = a.w.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean C = C(andIncrement, false);
            int i = kq6.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (pi9Var.x != j3) {
                pi9 t = t(j3, pi9Var);
                if (t != null) {
                    pi9Var = t;
                } else if (C) {
                    ni9 ni9Var2 = oi9.b;
                    return new mi9(w());
                }
            }
            int c = a.c(this, pi9Var, i2, obj2, j, obj3, C);
            if (c == 0) {
                pi9Var.b();
                ni9 ni9Var3 = oi9.b;
                return zy11Var;
            }
            if (c == 1) {
                ni9 ni9Var4 = oi9.b;
                return zy11Var;
            }
            if (c == 2) {
                if (C) {
                    pi9Var.n();
                    ni9 ni9Var5 = oi9.b;
                    return new mi9(w());
                }
                k041 k041Var = obj3 instanceof k041 ? (k041) obj3 : null;
                if (k041Var != null) {
                    k041Var.c(pi9Var, i2 + i);
                }
                p((pi9Var.x * j2) + i2);
                ni9 ni9Var6 = oi9.b;
                return zy11Var;
            }
            if (c == 3) {
                ny61.r("unexpected");
                return null;
            }
            if (c == 4) {
                if (j < a.x.get(this)) {
                    pi9Var.b();
                }
                ni9 ni9Var7 = oi9.b;
                return new mi9(w());
            }
            if (c == 5) {
                pi9Var.b();
            }
            obj2 = obj;
        }
    }

    @Override // kotlinx.coroutines.channels.a, defpackage.ioq0
    public final Object d(Object obj) {
        return U(obj, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        r1 = defpackage.sub1.b(r2, r1, null);
     */
    @Override // kotlinx.coroutines.channels.a, defpackage.ioq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj, Continuation continuation) {
        UndeliveredElementException b;
        if (!(U(obj, true) instanceof mi9)) {
            return zy11.a;
        }
        ni9 ni9Var = oi9.b;
        tls tlsVar = this.b;
        if (tlsVar == null || b == null) {
            throw w();
        }
        ljo.a(b, w());
        throw b;
    }
}
