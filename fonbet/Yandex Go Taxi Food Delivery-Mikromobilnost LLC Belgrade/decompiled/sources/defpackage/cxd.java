package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
public abstract class cxd {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(cxd.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long w;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = wb4.a;
        c = unsafe.objectFieldOffset(cxd.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(cxd.class, Object.class, "_prev$volatile");
        w = unsafe.objectFieldOffset(cxd.class.getDeclaredField("_prev$volatile"));
    }

    public cxd(s7q0 s7q0Var) {
        this._prev$volatile = s7q0Var;
    }

    public final void b() {
        b.getClass();
        wb4.a.putObjectVolatile(this, w, (Object) null);
    }

    public final cxd c() {
        cxd f = f();
        while (f != null && f.g()) {
            b.getClass();
            f = (cxd) wb4.a.getObjectVolatile(f, w);
        }
        return f;
    }

    public final cxd d() {
        Object e = e();
        if (e == rzo.a) {
            return null;
        }
        return (cxd) e;
    }

    public final Object e() {
        a.getClass();
        return wb4.a.getObjectVolatile(this, c);
    }

    public final cxd f() {
        b.getClass();
        return (cxd) wb4.a.getObjectVolatile(this, w);
    }

    public abstract boolean g();

    public final boolean h() {
        jb20 jb20Var = rzo.a;
        while (true) {
            a.getClass();
            Unsafe unsafe = wb4.a;
            long j = c;
            cxd cxdVar = this;
            if (unsafe.compareAndSwapObject(cxdVar, j, (Object) null, jb20Var)) {
                return true;
            }
            if (unsafe.getObjectVolatile(cxdVar, j) != null) {
                return false;
            }
            this = cxdVar;
        }
    }

    public final void i() {
        cxd cxdVar;
        Unsafe unsafe;
        if (d() == null) {
            return;
        }
        while (true) {
            cxd c2 = c();
            cxd d = d();
            do {
                cxdVar = d;
                if (!cxdVar.g()) {
                    break;
                } else {
                    d = cxdVar.d();
                }
            } while (d != null);
            while (true) {
                b.getClass();
                Unsafe unsafe2 = wb4.a;
                long j = w;
                Object objectVolatile = unsafe2.getObjectVolatile(cxdVar, j);
                cxd cxdVar2 = ((cxd) objectVolatile) == null ? null : c2;
                do {
                    unsafe = wb4.a;
                    if (unsafe.compareAndSwapObject(cxdVar, w, objectVolatile, cxdVar2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(cxdVar, j) == objectVolatile);
            }
            if (c2 != null) {
                a.getClass();
                unsafe.putObjectVolatile(c2, c, cxdVar);
            }
            if (!cxdVar.g() || cxdVar.d() == null) {
                if (c2 == null || !c2.g()) {
                    return;
                }
            }
        }
    }

    public final boolean j(s7q0 s7q0Var) {
        while (true) {
            a.getClass();
            Unsafe unsafe = wb4.a;
            long j = c;
            cxd cxdVar = this;
            s7q0 s7q0Var2 = s7q0Var;
            if (unsafe.compareAndSwapObject(cxdVar, j, (Object) null, s7q0Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(cxdVar, j) != null) {
                return false;
            }
            this = cxdVar;
            s7q0Var = s7q0Var2;
        }
    }
}
