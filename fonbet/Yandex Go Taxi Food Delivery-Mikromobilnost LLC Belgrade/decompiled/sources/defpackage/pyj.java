package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
public final class pyj extends qyj implements wse, Continuation {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(pyj.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long B = wb4.a.objectFieldOffset(pyj.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final jse w;
    public final ContinuationImpl x;
    public Object y;
    public final Object z;

    public pyj(jse jseVar, ContinuationImpl continuationImpl) {
        super(-1);
        this.w = jseVar;
        this.x = continuationImpl;
        this.y = bvf0.a;
        this.z = continuationImpl.get_context().fold(0, gwk0.e);
    }

    @Override // defpackage.qyj
    public final Continuation d() {
        return this;
    }

    @Override // defpackage.wse
    public final wse getCallerFrame() {
        ContinuationImpl continuationImpl = this.x;
        if (continuationImpl != null) {
            return continuationImpl;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final fse get_context() {
        return this.x.get_context();
    }

    @Override // defpackage.qyj
    public final Object h() {
        Object obj = this.y;
        this.y = bvf0.a;
        return obj;
    }

    public final void i() {
        do {
            A.getClass();
        } while (wb4.a.getObjectVolatile(this, B) == bvf0.b);
    }

    public final j18 k() {
        pyj pyjVar;
        jb20 jb20Var = bvf0.b;
        while (true) {
            A.getClass();
            Unsafe unsafe = wb4.a;
            long j = B;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, jb20Var);
                return null;
            }
            if (objectVolatile instanceof j18) {
                while (true) {
                    Unsafe unsafe2 = wb4.a;
                    pyj pyjVar2 = this;
                    boolean compareAndSwapObject = unsafe2.compareAndSwapObject(pyjVar2, B, objectVolatile, jb20Var);
                    pyjVar = pyjVar2;
                    if (compareAndSwapObject) {
                        return (j18) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(pyjVar, j) != objectVolatile) {
                        break;
                    }
                    this = pyjVar;
                }
            } else {
                pyjVar = this;
                if (objectVolatile != jb20Var && !(objectVolatile instanceof Throwable)) {
                    ny61.r(b64.i("Inconsistent state ", objectVolatile));
                    return null;
                }
            }
            this = pyjVar;
        }
    }

    public final j18 l() {
        A.getClass();
        Object objectVolatile = wb4.a.getObjectVolatile(this, B);
        if (objectVolatile instanceof j18) {
            return (j18) objectVolatile;
        }
        return null;
    }

    public final boolean n() {
        A.getClass();
        return wb4.a.getObjectVolatile(this, B) != null;
    }

    public final boolean o(Throwable th) {
        pyj pyjVar;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            A.getClass();
            Unsafe unsafe2 = wb4.a;
            long j = B;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            jb20 jb20Var = bvf0.b;
            if (jl40.l(objectVolatile, jb20Var)) {
                while (true) {
                    Unsafe unsafe3 = wb4.a;
                    pyj pyjVar2 = this;
                    th2 = th;
                    pyjVar = pyjVar2;
                    if (unsafe3.compareAndSwapObject(pyjVar2, B, jb20Var, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(pyjVar, j) != jb20Var) {
                        break;
                    }
                    this = pyjVar;
                    th = th2;
                }
            } else {
                pyjVar = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = wb4.a;
                    if (unsafe.compareAndSwapObject(pyjVar, B, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(pyjVar, j) == objectVolatile);
            }
            this = pyjVar;
            th = th2;
        }
    }

    public final Throwable p(j18 j18Var) {
        Unsafe unsafe;
        pyj pyjVar;
        j18 j18Var2;
        while (true) {
            A.getClass();
            Unsafe unsafe2 = wb4.a;
            long j = B;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            jb20 jb20Var = bvf0.b;
            if (objectVolatile != jb20Var) {
                pyj pyjVar2 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    ny61.r(b64.i("Inconsistent state ", objectVolatile));
                    return null;
                }
                do {
                    unsafe = wb4.a;
                    if (unsafe.compareAndSwapObject(pyjVar2, B, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(pyjVar2, j) == objectVolatile);
                ny61.g("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = wb4.a;
                pyjVar = this;
                j18Var2 = j18Var;
                if (unsafe3.compareAndSwapObject(pyjVar, B, jb20Var, j18Var2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(pyjVar, j) != jb20Var) {
                    break;
                }
                this = pyjVar;
                j18Var = j18Var2;
            }
            this = pyjVar;
            j18Var = j18Var2;
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable a = Result.a(obj);
        Object tzcVar = a == null ? obj : new tzc(a, false);
        ContinuationImpl continuationImpl = this.x;
        fse fseVar = continuationImpl.get_context();
        jse jseVar = this.w;
        if (bvf0.R(jseVar, fseVar)) {
            this.y = tzcVar;
            this.c = 0;
            bvf0.Q(continuationImpl.get_context(), jseVar, this);
            return;
        }
        fgo a2 = byy0.a();
        if (a2.b >= 4294967296L) {
            this.y = tzcVar;
            this.c = 0;
            a2.T(this);
            return;
        }
        a2.U(true);
        try {
            fse fseVar2 = continuationImpl.get_context();
            Object H = gwk0.H(fseVar2, this.z);
            try {
                continuationImpl.resumeWith(obj);
                while (a2.Z()) {
                }
            } finally {
                gwk0.x(fseVar2, H);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.w + Extension.FIX_SPACE + wwg.X(this.x) + ']';
    }
}
