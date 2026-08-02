package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
public abstract class kgo extends lgo implements fph {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A;
    public static final /* synthetic */ long B;
    public static final /* synthetic */ long C;
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(kgo.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater z;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = wb4.a;
        C = unsafe.objectFieldOffset(kgo.class.getDeclaredField("_queue$volatile"));
        z = AtomicReferenceFieldUpdater.newUpdater(kgo.class, Object.class, "_delayed$volatile");
        B = unsafe.objectFieldOffset(kgo.class.getDeclaredField("_delayed$volatile"));
        A = AtomicIntegerFieldUpdater.newUpdater(kgo.class, "_isCompleted$volatile");
    }

    public final void A0() {
        y.getClass();
        Unsafe unsafe = wb4.a;
        unsafe.putObjectVolatile(this, C, (Object) null);
        z.getClass();
        unsafe.putObjectVolatile(this, B, (Object) null);
    }

    public final void D0(long j, igo igoVar) {
        Thread a0;
        int F0 = F0(j, igoVar);
        if (F0 == 0) {
            if (!L0(igoVar) || Thread.currentThread() == (a0 = a0())) {
                return;
            }
            LockSupport.unpark(a0);
            return;
        }
        if (F0 == 1) {
            e0(j, igoVar);
        } else {
            if (F0 == 2) {
                return;
            }
            ny61.r("unexpected result");
        }
    }

    public final int F0(long j, igo igoVar) {
        kgo kgoVar;
        Unsafe unsafe;
        if (A.get(this) == 1) {
            return 1;
        }
        z.getClass();
        Unsafe unsafe2 = wb4.a;
        long j2 = B;
        jgo jgoVar = (jgo) unsafe2.getObjectVolatile(this, j2);
        if (jgoVar == null) {
            jgo jgoVar2 = new jgo();
            jgoVar2.c = j;
            while (true) {
                unsafe = wb4.a;
                kgoVar = this;
                if (!unsafe.compareAndSwapObject(kgoVar, B, (Object) null, jgoVar2) && unsafe.getObjectVolatile(kgoVar, j2) == null) {
                    this = kgoVar;
                }
            }
            jgoVar = (jgo) unsafe.getObjectVolatile(kgoVar, j2);
        } else {
            kgoVar = this;
        }
        return igoVar.b(j, jgoVar, kgoVar);
    }

    public final boolean L0(igo igoVar) {
        z.getClass();
        jgo jgoVar = (jgo) wb4.a.getObjectVolatile(this, B);
        if (jgoVar != null) {
            synchronized (jgoVar) {
                igo[] igoVarArr = jgoVar.a;
                r0 = igoVarArr != null ? igoVarArr[0] : null;
            }
        }
        return r0 == igoVar;
    }

    @Override // defpackage.fgo
    public final long W() {
        if (Z()) {
            return 0L;
        }
        q0();
        Runnable g0 = g0();
        if (g0 == null) {
            return w0();
        }
        g0.run();
        return 0L;
    }

    @Override // defpackage.fph
    public final void d(long j, j18 j18Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            ggo ggoVar = new ggo(this, j2 + nanoTime, j18Var);
            D0(nanoTime, ggoVar);
            j18Var.x(new qv7(1, ggoVar));
        }
    }

    public final void f0() {
        kgo kgoVar;
        Unsafe unsafe;
        jb20 jb20Var = qke.p;
        while (true) {
            y.getClass();
            Unsafe unsafe2 = wb4.a;
            long j = C;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = wb4.a;
                    kgoVar = this;
                    if (unsafe3.compareAndSwapObject(kgoVar, C, (Object) null, jb20Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(kgoVar, j) != null) {
                        break;
                    } else {
                        this = kgoVar;
                    }
                }
            } else {
                kgoVar = this;
                if (objectVolatile instanceof udz) {
                    ((udz) objectVolatile).c();
                    return;
                }
                if (objectVolatile == jb20Var) {
                    return;
                }
                udz udzVar = new udz(8, true);
                udzVar.a((Runnable) objectVolatile);
                do {
                    unsafe = wb4.a;
                    if (unsafe.compareAndSwapObject(kgoVar, C, objectVolatile, udzVar)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(kgoVar, j) == objectVolatile);
            }
            this = kgoVar;
        }
    }

    public final Runnable g0() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
            atomicReferenceFieldUpdater.getClass();
            Object objectVolatile = wb4.a.getObjectVolatile(this, C);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof udz) {
                udz udzVar = (udz) objectVolatile;
                Object e = udzVar.e();
                if (e != udz.g) {
                    return (Runnable) e;
                }
                nnm.y(atomicReferenceFieldUpdater, this, objectVolatile, udzVar.d());
            } else {
                if (objectVolatile == qke.p) {
                    return null;
                }
                if (nnm.z(atomicReferenceFieldUpdater, this, objectVolatile)) {
                    return (Runnable) objectVolatile;
                }
            }
        }
    }

    public void n0(Runnable runnable) {
        q0();
        if (!v0(runnable)) {
            dbh.D.n0(runnable);
            return;
        }
        Thread a0 = a0();
        if (Thread.currentThread() != a0) {
            LockSupport.unpark(a0);
        }
    }

    @Override // defpackage.jse
    public final void o(fse fseVar, Runnable runnable) {
        n0(runnable);
    }

    public final void q0() {
        igo igoVar;
        z.getClass();
        jgo jgoVar = (jgo) wb4.a.getObjectVolatile(this, B);
        if (jgoVar == null || iyy0.b.get(jgoVar) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (jgoVar) {
                try {
                    igo[] igoVarArr = jgoVar.a;
                    igoVar = null;
                    igo igoVar2 = igoVarArr != null ? igoVarArr[0] : null;
                    if (igoVar2 != null) {
                        if (nanoTime - igoVar2.a >= 0 ? v0(igoVar2) : false) {
                            igoVar = jgoVar.b(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (igoVar != null);
    }

    @Override // defpackage.fgo
    public void shutdown() {
        byy0.a.set(null);
        A.set(this, 1);
        f0();
        while (W() <= 0) {
        }
        z0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
            atomicReferenceFieldUpdater.getClass();
            Object objectVolatile = wb4.a.getObjectVolatile(this, C);
            if (A.get(this) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                if (nnm.B(atomicReferenceFieldUpdater, this, runnable)) {
                    break;
                }
            } else if (objectVolatile instanceof udz) {
                udz udzVar = (udz) objectVolatile;
                int a = udzVar.a(runnable);
                if (a == 0) {
                    break;
                }
                if (a == 1) {
                    nnm.y(atomicReferenceFieldUpdater, this, objectVolatile, udzVar.d());
                } else if (a == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == qke.p) {
                    return false;
                }
                udz udzVar2 = new udz(8, true);
                udzVar2.a((Runnable) objectVolatile);
                udzVar2.a(runnable);
                if (nnm.A(atomicReferenceFieldUpdater, this, objectVolatile, udzVar2)) {
                    break;
                }
            }
        }
    }

    public final long w0() {
        igo igoVar;
        x43 x43Var = this.w;
        if (((x43Var == null || x43Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            y.getClass();
            Unsafe unsafe = wb4.a;
            Object objectVolatile = unsafe.getObjectVolatile(this, C);
            if (objectVolatile != null) {
                if (objectVolatile instanceof udz) {
                    long j = udz.f.get((udz) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == qke.p) {
                    return ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                }
            }
            z.getClass();
            jgo jgoVar = (jgo) unsafe.getObjectVolatile(this, B);
            if (jgoVar != null) {
                synchronized (jgoVar) {
                    igo[] igoVarArr = jgoVar.a;
                    igoVar = igoVarArr != null ? igoVarArr[0] : null;
                }
                if (igoVar != null) {
                    long nanoTime = igoVar.a - System.nanoTime();
                    if (nanoTime >= 0) {
                        return nanoTime;
                    }
                }
            }
            return ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        }
        return 0L;
    }

    public final boolean x0() {
        x43 x43Var = this.w;
        if (x43Var != null ? x43Var.isEmpty() : true) {
            z.getClass();
            Unsafe unsafe = wb4.a;
            jgo jgoVar = (jgo) unsafe.getObjectVolatile(this, B);
            if (jgoVar != null && iyy0.b.get(jgoVar) != 0) {
                return false;
            }
            y.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, C);
            if (objectVolatile != null) {
                if (objectVolatile instanceof udz) {
                    long j = udz.f.get((udz) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == qke.p) {
                }
            }
            return true;
        }
        return false;
    }

    public final void z0() {
        igo b;
        long nanoTime = System.nanoTime();
        while (true) {
            z.getClass();
            jgo jgoVar = (jgo) wb4.a.getObjectVolatile(this, B);
            if (jgoVar == null) {
                return;
            }
            synchronized (jgoVar) {
                b = iyy0.b.get(jgoVar) > 0 ? jgoVar.b(0) : null;
            }
            if (b == null) {
                return;
            } else {
                e0(nanoTime, b);
            }
        }
    }
}
