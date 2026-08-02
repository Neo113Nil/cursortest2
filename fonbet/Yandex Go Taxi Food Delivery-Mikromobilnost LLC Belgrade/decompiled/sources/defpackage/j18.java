package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.a;
import kotlinx.coroutines.c;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
public class j18 extends qyj implements i18, wse, k041 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A;
    public static final /* synthetic */ long B;
    public static final /* synthetic */ long C;
    public static final /* synthetic */ AtomicIntegerFieldUpdater y = AtomicIntegerFieldUpdater.newUpdater(j18.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater z = AtomicReferenceFieldUpdater.newUpdater(j18.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final Continuation w;
    public final fse x;

    static {
        Unsafe unsafe = wb4.a;
        C = unsafe.objectFieldOffset(j18.class.getDeclaredField("_state$volatile"));
        A = AtomicReferenceFieldUpdater.newUpdater(j18.class, Object.class, "_parentHandle$volatile");
        B = unsafe.objectFieldOffset(j18.class.getDeclaredField("_parentHandle$volatile"));
    }

    public j18(int i, Continuation continuation) {
        super(i);
        this.w = continuation;
        this.x = continuation.get_context();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = t00.a;
    }

    public static void A(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object H(mf60 mf60Var, Object obj, int i, zls zlsVar) {
        if (obj instanceof tzc) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (zlsVar != null || (mf60Var instanceof rv7)) {
            return new rzc(obj, mf60Var instanceof rv7 ? (rv7) mf60Var : null, zlsVar, (Throwable) null, 16);
        }
        return obj;
    }

    public String B() {
        return "CancellableContinuation";
    }

    public final void C() {
        Throwable p;
        Continuation continuation = this.w;
        pyj pyjVar = continuation instanceof pyj ? (pyj) continuation : null;
        if (pyjVar == null || (p = pyjVar.p(this)) == null) {
            return;
        }
        n();
        b(p);
    }

    public final boolean D() {
        z.getClass();
        Unsafe unsafe = wb4.a;
        long j = C;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof rzc) && ((rzc) objectVolatile).d != null) {
            n();
            return false;
        }
        y.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, t00.a);
        return true;
    }

    public final void E(tls tlsVar, Object obj) {
        F(obj, this.c, tlsVar != null ? new iq6(1, tlsVar) : null);
    }

    public final void F(Object obj, int i, zls zlsVar) {
        j18 j18Var;
        while (true) {
            z.getClass();
            Unsafe unsafe = wb4.a;
            long j = C;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof mf60)) {
                j18 j18Var2 = this;
                if (objectVolatile instanceof a28) {
                    a28 a28Var = (a28) objectVolatile;
                    if (a28.c.compareAndSet(a28Var, 0, 1)) {
                        if (zlsVar != null) {
                            j18Var2.k(zlsVar, a28Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                ny61.r(b64.i("Already resumed, but proposed with update ", obj));
                return;
            }
            Object H = H((mf60) objectVolatile, obj, i, zlsVar);
            while (true) {
                Unsafe unsafe2 = wb4.a;
                j18Var = this;
                if (unsafe2.compareAndSwapObject(j18Var, C, objectVolatile, H)) {
                    if (!j18Var.z()) {
                        j18Var.n();
                    }
                    j18Var.o(i);
                    return;
                } else if (unsafe2.getObjectVolatile(j18Var, j) != objectVolatile) {
                    break;
                } else {
                    this = j18Var;
                }
            }
            this = j18Var;
        }
    }

    public final void G(jse jseVar, Object obj) {
        Continuation continuation = this.w;
        pyj pyjVar = continuation instanceof pyj ? (pyj) continuation : null;
        F(obj, (pyjVar != null ? pyjVar.w : null) == jseVar ? 4 : this.c, null);
    }

    public final jb20 I(Object obj, zls zlsVar) {
        j18 j18Var;
        jb20 jb20Var = tje.a;
        while (true) {
            z.getClass();
            Unsafe unsafe = wb4.a;
            long j = C;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof mf60)) {
                return null;
            }
            Object H = H((mf60) objectVolatile, obj, this.c, zlsVar);
            while (true) {
                Unsafe unsafe2 = wb4.a;
                j18Var = this;
                if (unsafe2.compareAndSwapObject(j18Var, C, objectVolatile, H)) {
                    if (!j18Var.z()) {
                        j18Var.n();
                    }
                    return jb20Var;
                }
                if (unsafe2.getObjectVolatile(j18Var, j) != objectVolatile) {
                    break;
                }
                this = j18Var;
            }
            this = j18Var;
        }
    }

    @Override // defpackage.qyj
    public final void a(CancellationException cancellationException) {
        CancellationException cancellationException2;
        j18 j18Var;
        while (true) {
            z.getClass();
            Unsafe unsafe = wb4.a;
            long j = C;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof mf60) {
                ny61.r("Not completed");
                return;
            }
            if (objectVolatile instanceof tzc) {
                return;
            }
            if (objectVolatile instanceof rzc) {
                rzc rzcVar = (rzc) objectVolatile;
                if (rzcVar.e != null) {
                    ny61.r("Must be called at most once");
                    return;
                }
                rzc a = rzc.a(rzcVar, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = wb4.a;
                    j18 j18Var2 = this;
                    if (unsafe2.compareAndSwapObject(j18Var2, C, objectVolatile, a)) {
                        rv7 rv7Var = rzcVar.b;
                        if (rv7Var != null) {
                            j18Var2.i(rv7Var, cancellationException);
                        }
                        zls zlsVar = rzcVar.c;
                        if (zlsVar != null) {
                            j18Var2.k(zlsVar, cancellationException, rzcVar.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(j18Var2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        j18Var = j18Var2;
                        break;
                    }
                    this = j18Var2;
                }
            } else {
                j18 j18Var3 = this;
                CancellationException cancellationException3 = cancellationException;
                rzc rzcVar2 = new rzc(objectVolatile, (rv7) null, (zls) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    rzc rzcVar3 = rzcVar2;
                    Unsafe unsafe3 = wb4.a;
                    j18Var = j18Var3;
                    boolean compareAndSwapObject = unsafe3.compareAndSwapObject(j18Var, C, objectVolatile, rzcVar3);
                    rzcVar2 = rzcVar3;
                    if (compareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(j18Var, j) != objectVolatile) {
                        break;
                    } else {
                        j18Var3 = j18Var;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = j18Var;
        }
    }

    @Override // defpackage.i18
    public final boolean b(Throwable th) {
        Throwable th2;
        j18 j18Var;
        while (true) {
            z.getClass();
            Unsafe unsafe = wb4.a;
            long j = C;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof mf60)) {
                return false;
            }
            boolean z2 = (objectVolatile instanceof rv7) || (objectVolatile instanceof s7q0);
            if (th == null) {
                th2 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th2 = th;
            }
            a28 a28Var = new a28(th2, z2);
            while (true) {
                Unsafe unsafe2 = wb4.a;
                j18Var = this;
                if (unsafe2.compareAndSwapObject(j18Var, C, objectVolatile, a28Var)) {
                    mf60 mf60Var = (mf60) objectVolatile;
                    if (mf60Var instanceof rv7) {
                        j18Var.i((rv7) objectVolatile, th);
                    } else if (mf60Var instanceof s7q0) {
                        j18Var.l((s7q0) objectVolatile, th);
                    }
                    if (!j18Var.z()) {
                        j18Var.n();
                    }
                    j18Var.o(j18Var.c);
                    return true;
                }
                if (unsafe2.getObjectVolatile(j18Var, j) != objectVolatile) {
                    break;
                }
                this = j18Var;
            }
            this = j18Var;
        }
    }

    @Override // defpackage.k041
    public final void c(s7q0 s7q0Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = y;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                ny61.r("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        x(s7q0Var);
    }

    @Override // defpackage.qyj
    public final Continuation d() {
        return this.w;
    }

    @Override // defpackage.qyj
    public final Throwable e(Object obj) {
        Throwable e = super.e(obj);
        if (e != null) {
            return e;
        }
        return null;
    }

    @Override // defpackage.qyj
    public final Object f(Object obj) {
        return obj instanceof rzc ? ((rzc) obj).a : obj;
    }

    @Override // defpackage.wse
    public final wse getCallerFrame() {
        Continuation continuation = this.w;
        if (continuation instanceof wse) {
            return (wse) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final fse get_context() {
        return this.x;
    }

    @Override // defpackage.qyj
    public final Object h() {
        return t();
    }

    public final void i(rv7 rv7Var, Throwable th) {
        try {
            rv7Var.a(th);
        } catch (Throwable th2) {
            d6z.I(this.x, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.i18
    public final boolean isActive() {
        return t() instanceof mf60;
    }

    @Override // defpackage.i18
    public final void j(Object obj) {
        o(this.c);
    }

    public final void k(zls zlsVar, Throwable th, Object obj) {
        fse fseVar = this.x;
        try {
            zlsVar.invoke(th, obj, fseVar);
        } catch (Throwable th2) {
            d6z.I(fseVar, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(s7q0 s7q0Var, Throwable th) {
        fse fseVar = this.x;
        int i = y.get(this) & 536870911;
        if (i == 536870911) {
            ny61.r("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            s7q0Var.m(i, fseVar);
        } catch (Throwable th2) {
            d6z.I(fseVar, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.i18
    public final jb20 m(Object obj, zls zlsVar) {
        return I(obj, zlsVar);
    }

    public final void n() {
        m1k r = r();
        if (r == null) {
            return;
        }
        r.dispose();
        A.getClass();
        wb4.a.putObjectVolatile(this, B, ke60.a);
    }

    public final void o(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = y;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    ny61.r("Already resumed");
                    return;
                }
                boolean z2 = i == 4;
                Continuation continuation = this.w;
                if (!z2 && (continuation instanceof pyj)) {
                    boolean z3 = i == 1 || i == 2;
                    int i4 = this.c;
                    if (z3 == (i4 == 1 || i4 == 2)) {
                        pyj pyjVar = (pyj) continuation;
                        jse jseVar = pyjVar.w;
                        fse fseVar = pyjVar.x.get_context();
                        if (bvf0.R(jseVar, fseVar)) {
                            bvf0.Q(fseVar, jseVar, this);
                            return;
                        }
                        fgo a = byy0.a();
                        if (a.b >= 4294967296L) {
                            a.T(this);
                            return;
                        }
                        a.U(true);
                        try {
                            q5z.X(this, continuation, true);
                            do {
                            } while (a.Z());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                q5z.X(this, continuation, z2);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable p(c cVar) {
        return cVar.I();
    }

    @Override // defpackage.i18
    public final void q(Object obj, zls zlsVar) {
        F(obj, this.c, zlsVar);
    }

    public final m1k r() {
        A.getClass();
        return (m1k) wb4.a.getObjectVolatile(this, B);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable a = Result.a(obj);
        if (a != null) {
            obj = new tzc(a, false);
        }
        F(obj, this.c, null);
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        l8x l8xVar;
        boolean z2 = z();
        do {
            atomicIntegerFieldUpdater = y;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    ny61.r("Already suspended");
                    return null;
                }
                if (z2) {
                    C();
                }
                Object t = t();
                if (t instanceof tzc) {
                    throw ((tzc) t).a;
                }
                int i3 = this.c;
                if ((i3 != 1 && i3 != 2) || (l8xVar = (l8x) this.x.get(seu.C)) == null || l8xVar.isActive()) {
                    return f(t);
                }
                CancellationException I = l8xVar.I();
                a(I);
                throw I;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (r() == null) {
            v();
        }
        if (z2) {
            C();
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    public final Object t() {
        z.getClass();
        return wb4.a.getObjectVolatile(this, C);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(B());
        sb.append('(');
        sb.append(wwg.X(this.w));
        sb.append("){");
        Object t = t();
        sb.append(t instanceof mf60 ? CA20Status.STATUS_USER_DESCRIPTION_A : t instanceof a28 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(wwg.s(this));
        return sb.toString();
    }

    public final void u() {
        m1k v = v();
        if (v != null && y()) {
            v.dispose();
            A.getClass();
            wb4.a.putObjectVolatile(this, B, ke60.a);
        }
    }

    public final m1k v() {
        l8x l8xVar = (l8x) this.x.get(seu.C);
        if (l8xVar == null) {
            return null;
        }
        m1k o = a.o(l8xVar, true, new cpb(this));
        while (true) {
            A.getClass();
            Unsafe unsafe = wb4.a;
            long j = B;
            j18 j18Var = this;
            if (!unsafe.compareAndSwapObject(j18Var, j, (Object) null, o) && unsafe.getObjectVolatile(j18Var, j) == null) {
                this = j18Var;
            }
        }
        return o;
    }

    public final void w(tls tlsVar) {
        x(new qv7(0, tlsVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c5, code lost:
    
        A(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c8, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(mf60 mf60Var) {
        j18 j18Var;
        Unsafe unsafe;
        j18 j18Var2;
        while (true) {
            z.getClass();
            Unsafe unsafe2 = wb4.a;
            long j = C;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof t00) {
                while (true) {
                    Unsafe unsafe3 = wb4.a;
                    j18Var = this;
                    if (unsafe3.compareAndSwapObject(j18Var, C, objectVolatile, mf60Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(j18Var, j) != objectVolatile) {
                        break;
                    } else {
                        this = j18Var;
                    }
                }
            } else {
                j18Var = this;
                if ((objectVolatile instanceof rv7) || (objectVolatile instanceof s7q0)) {
                    break;
                }
                if (objectVolatile instanceof tzc) {
                    tzc tzcVar = (tzc) objectVolatile;
                    if (!tzc.b.compareAndSet(tzcVar, 0, 1)) {
                        A(mf60Var, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof a28) {
                        Throwable th = tzcVar.a;
                        if (mf60Var instanceof rv7) {
                            j18Var.i((rv7) mf60Var, th);
                            return;
                        } else {
                            j18Var.l((s7q0) mf60Var, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof rzc) {
                    rzc rzcVar = (rzc) objectVolatile;
                    if (rzcVar.b != null) {
                        A(mf60Var, objectVolatile);
                        throw null;
                    }
                    if (mf60Var instanceof s7q0) {
                        return;
                    }
                    rv7 rv7Var = (rv7) mf60Var;
                    Throwable th2 = rzcVar.e;
                    if (th2 != null) {
                        j18Var.i(rv7Var, th2);
                        return;
                    }
                    rzc a = rzc.a(rzcVar, rv7Var, null, 29);
                    do {
                        unsafe = wb4.a;
                        j18Var2 = j18Var;
                        if (unsafe.compareAndSwapObject(j18Var, C, objectVolatile, a)) {
                            return;
                        } else {
                            j18Var = j18Var2;
                        }
                    } while (unsafe.getObjectVolatile(j18Var2, j) == objectVolatile);
                } else {
                    j18 j18Var3 = j18Var;
                    if (mf60Var instanceof s7q0) {
                        return;
                    }
                    rzc rzcVar2 = new rzc(objectVolatile, (rv7) mf60Var, (zls) null, (Throwable) null, 28);
                    while (true) {
                        rzc rzcVar3 = rzcVar2;
                        Unsafe unsafe4 = wb4.a;
                        j18Var = j18Var3;
                        boolean compareAndSwapObject = unsafe4.compareAndSwapObject(j18Var, C, objectVolatile, rzcVar3);
                        rzcVar2 = rzcVar3;
                        if (compareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(j18Var, j) != objectVolatile) {
                            break;
                        } else {
                            j18Var3 = j18Var;
                        }
                    }
                }
            }
            this = j18Var;
        }
    }

    public final boolean y() {
        return !(t() instanceof mf60);
    }

    public final boolean z() {
        return this.c == 2 && ((pyj) this.w).n();
    }
}
