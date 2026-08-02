package xsna;

import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CompletionHandlerException;
import xsna.eyx;
import xsna.mp9;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes11.dex */
public class lq9<T> extends ocn<T> implements kq9<T>, awj, a8x0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(lq9.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(lq9.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(lq9.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final spj<T> e;
    public final kotlin.coroutines.d f;

    public lq9(int i2, spj spjVar) {
        super(i2);
        this.e = spjVar;
        this.f = spjVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = e80.b;
    }

    public static Object B(z670 z670Var, Object obj, int i2, yzs yzsVar) {
        if (obj instanceof d8i) {
            return obj;
        }
        if (i2 != 1 && i2 != 2) {
            return obj;
        }
        if (yzsVar != null || (z670Var instanceof mp9)) {
            return new b8i(obj, z670Var instanceof mp9 ? (mp9) z670Var : null, yzsVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void v(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A(ovj ovjVar, T t) {
        spj<T> spjVar = this.e;
        mcn mcnVar = spjVar instanceof mcn ? (mcn) spjVar : null;
        y(t, (mcnVar != null ? mcnVar.e : null) == ovjVar ? 4 : this.d, null);
    }

    public final con0 C(Object obj, yzs yzsVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof z670)) {
                return null;
            }
            Object B = B((z670) obj2, obj, this.d, yzsVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, B)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            boolean u = u();
            con0 con0Var = mq9.a;
            if (!u) {
                k();
            }
            return con0Var;
        }
    }

    @Override // xsna.kq9
    public final void D(Object obj) {
        l(this.d);
    }

    @Override // xsna.kq9
    public final <R extends T> void F(R r, yzs<? super Throwable, ? super R, ? super kotlin.coroutines.d, s3q0> yzsVar) {
        y(r, this.d, yzsVar);
    }

    @Override // xsna.kq9
    public final con0 K(Object obj, yzs yzsVar) {
        return C(obj, yzsVar);
    }

    @Override // xsna.ocn
    public final void a(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof z670) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof d8i) {
                return;
            }
            if (obj instanceof b8i) {
                b8i b8iVar = (b8i) obj;
                if (b8iVar.e != null) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (gr.a(atomicReferenceFieldUpdater, this, (b8i) obj, b8i.a(b8iVar, null, cancellationException, 15))) {
                    mp9 mp9Var = b8iVar.b;
                    if (mp9Var != null) {
                        h(mp9Var, cancellationException);
                    }
                    yzs<Throwable, R, kotlin.coroutines.d, s3q0> yzsVar = b8iVar.c;
                    if (yzsVar != 0) {
                        i(yzsVar, cancellationException, b8iVar.a);
                        return;
                    }
                    return;
                }
                cancellationException2 = cancellationException;
            } else {
                cancellationException2 = cancellationException;
                if (dn.i(atomicReferenceFieldUpdater, this, obj, new b8i(obj, (mp9) null, (yzs) null, cancellationException2, 14))) {
                    return;
                }
            }
            cancellationException = cancellationException2;
        }
    }

    @Override // xsna.ocn
    public final spj<T> b() {
        return this.e;
    }

    @Override // xsna.ocn
    public final Throwable c(Object obj) {
        Throwable c = super.c(obj);
        if (c != null) {
            return c;
        }
        return null;
    }

    @Override // xsna.a8x0
    public final void d(n4i0<?> n4i0Var, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = g;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        s(n4i0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ocn
    public final <T> T e(Object obj) {
        return obj instanceof b8i ? (T) ((b8i) obj).a : obj;
    }

    @Override // xsna.ocn
    public final Object g() {
        return h.get(this);
    }

    @Override // xsna.awj
    public final awj getCallerFrame() {
        spj<T> spjVar = this.e;
        if (spjVar instanceof awj) {
            return (awj) spjVar;
        }
        return null;
    }

    @Override // xsna.spj
    public final kotlin.coroutines.d getContext() {
        return this.f;
    }

    public final void h(mp9 mp9Var, Throwable th) {
        try {
            mp9Var.a(th);
        } catch (Throwable th2) {
            rvj.a(this.f, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void i(yzs<? super Throwable, ? super R, ? super kotlin.coroutines.d, s3q0> yzsVar, Throwable th, R r) {
        kotlin.coroutines.d dVar = this.f;
        try {
            yzsVar.invoke(th, r, dVar);
        } catch (Throwable th2) {
            rvj.a(dVar, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // xsna.kq9
    public final boolean isActive() {
        return h.get(this) instanceof z670;
    }

    public final void j(n4i0<?> n4i0Var, Throwable th) {
        kotlin.coroutines.d dVar = this.f;
        int i2 = g.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            n4i0Var.h(i2, dVar);
        } catch (Throwable th2) {
            rvj.a(dVar, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        ogn ognVar = (ogn) atomicReferenceFieldUpdater.get(this);
        if (ognVar == null) {
            return;
        }
        ognVar.dispose();
        atomicReferenceFieldUpdater.set(this, t570.b);
    }

    public final void l(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = g;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i2 == 4;
                spj<T> spjVar = this.e;
                if (!z && (spjVar instanceof mcn)) {
                    boolean z2 = i2 == 1 || i2 == 2;
                    int i5 = this.d;
                    if (z2 == (i5 == 1 || i5 == 2)) {
                        mcn mcnVar = (mcn) spjVar;
                        ovj ovjVar = mcnVar.e;
                        kotlin.coroutines.d context = mcnVar.f.getContext();
                        if (upj.d(ovjVar, context)) {
                            upj.c(ovjVar, context, this);
                            return;
                        }
                        c0q a = bro0.a();
                        if (a.c >= 4294967296L) {
                            a.V(this);
                            return;
                        }
                        a.X(true);
                        try {
                            prw.g(this, spjVar, true);
                            do {
                            } while (a.a0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                prw.g(this, spjVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public Throwable m(pyx pyxVar) {
        return pyxVar.I();
    }

    public final Object n() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        eyx eyxVar;
        boolean u = u();
        do {
            atomicIntegerFieldUpdater = g;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (u) {
                    x();
                }
                Object obj = h.get(this);
                if (obj instanceof d8i) {
                    throw ((d8i) obj).a;
                }
                int i4 = this.d;
                if ((i4 != 1 && i4 != 2) || (eyxVar = (eyx) this.f.get(eyx.a.b)) == null || eyxVar.isActive()) {
                    return e(obj);
                }
                CancellationException I = eyxVar.I();
                a(I);
                throw I;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING + (536870911 & i2)));
        if (((ogn) i.get(this)) == null) {
            q();
        }
        if (u) {
            x();
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    public final void o() {
        ogn q = q();
        if (q != null && t()) {
            q.dispose();
            i.set(this, t570.b);
        }
    }

    @Override // xsna.kq9
    public final void p(T t, izs<? super Throwable, s3q0> izsVar) {
        y(t, this.d, izsVar != null ? new gd3(izsVar, 1) : null);
    }

    public final ogn q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        eyx eyxVar = (eyx) this.f.get(eyx.a.b);
        if (eyxVar == null) {
            return null;
        }
        ogn g2 = iyx.g(eyxVar, new q9c(this));
        do {
            atomicReferenceFieldUpdater = i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, g2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return g2;
    }

    public final void r(izs<? super Throwable, s3q0> izsVar) {
        s(new mp9.a(izsVar));
    }

    @Override // xsna.spj
    public final void resumeWith(Object obj) {
        Throwable a = Result.a(obj);
        if (a != null) {
            obj = new d8i(a, false);
        }
        y(obj, this.d, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00aa, code lost:
    
        v(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ad, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(z670 z670Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof e80) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, z670Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof mp9) || (obj instanceof n4i0)) {
                break;
            }
            if (obj instanceof d8i) {
                d8i d8iVar = (d8i) obj;
                d8iVar.getClass();
                if (!d8i.b.compareAndSet(d8iVar, 0, 1)) {
                    v(z670Var, obj);
                    throw null;
                }
                if (obj instanceof wq9) {
                    if (obj == null) {
                        d8iVar = null;
                    }
                    Throwable th = d8iVar != null ? d8iVar.a : null;
                    if (z670Var instanceof mp9) {
                        h((mp9) z670Var, th);
                        return;
                    } else {
                        j((n4i0) z670Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof b8i)) {
                if (z670Var instanceof n4i0) {
                    return;
                }
                b8i b8iVar = new b8i(obj, (mp9) z670Var, (yzs) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, b8iVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            b8i b8iVar2 = (b8i) obj;
            if (b8iVar2.b != null) {
                v(z670Var, obj);
                throw null;
            }
            if (z670Var instanceof n4i0) {
                return;
            }
            mp9 mp9Var = (mp9) z670Var;
            Throwable th2 = b8iVar2.e;
            if (th2 != null) {
                h(mp9Var, th2);
                return;
            }
            b8i a = b8i.a(b8iVar2, mp9Var, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean t() {
        return !(h.get(this) instanceof z670);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(w());
        sb.append('(');
        sb.append(y6l.c(this.e));
        sb.append("){");
        Object obj = h.get(this);
        sb.append(obj instanceof z670 ? "Active" : obj instanceof wq9 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(y6l.a(this));
        return sb.toString();
    }

    public final boolean u() {
        if (this.d != 2) {
            return false;
        }
        mcn mcnVar = (mcn) this.e;
        mcnVar.getClass();
        return mcn.i.get(mcnVar) != null;
    }

    public String w() {
        return "CancellableContinuation";
    }

    public final void x() {
        spj<T> spjVar = this.e;
        Throwable th = null;
        mcn mcnVar = spjVar instanceof mcn ? (mcn) spjVar : null;
        if (mcnVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mcn.i;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(mcnVar);
                con0 con0Var = upj.b;
                if (obj == con0Var) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(mcnVar, con0Var, this)) {
                        if (atomicReferenceFieldUpdater.get(mcnVar) != con0Var) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(rqi.c(obj, "Inconsistent state "));
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(mcnVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(mcnVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            k();
            z(th);
        }
    }

    public final <R> void y(R r, int i2, yzs<? super Throwable, ? super R, ? super kotlin.coroutines.d, s3q0> yzsVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof z670) {
                Object B = B((z670) obj, r, i2, yzsVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, B)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (!u()) {
                    k();
                }
                l(i2);
                return;
            }
            if (obj instanceof wq9) {
                wq9 wq9Var = (wq9) obj;
                if (wq9Var.a()) {
                    if (yzsVar != null) {
                        i(yzsVar, wq9Var.a, r);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(rqi.c(r, "Already resumed, but proposed with update "));
        }
    }

    @Override // xsna.kq9
    public final boolean z(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        do {
            atomicReferenceFieldUpdater = h;
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof z670)) {
                return false;
            }
        } while (!en.h(atomicReferenceFieldUpdater, this, (z670) obj, new wq9(this, th, (obj instanceof mp9) || (obj instanceof n4i0))));
        z670 z670Var = (z670) obj;
        if (z670Var instanceof mp9) {
            h((mp9) obj, th);
        } else if (z670Var instanceof n4i0) {
            j((n4i0) obj, th);
        }
        if (!u()) {
            k();
        }
        l(this.d);
        return true;
    }
}
