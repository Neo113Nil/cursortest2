package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
public final class c9x implements iqv {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(c9x.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(c9x.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater w;
    public static final /* synthetic */ long x;
    public static final /* synthetic */ long y;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final de60 a;

    static {
        Unsafe unsafe = wb4.a;
        y = unsafe.objectFieldOffset(c9x.class.getDeclaredField("_rootCause$volatile"));
        w = AtomicReferenceFieldUpdater.newUpdater(c9x.class, Object.class, "_exceptionsHolder$volatile");
        x = unsafe.objectFieldOffset(c9x.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public c9x(de60 de60Var, Throwable th) {
        this.a = de60Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable d = d();
        if (d == null) {
            h(th);
            return;
        }
        if (th == d) {
            return;
        }
        Object c2 = c();
        if (c2 == null) {
            g(th);
            return;
        }
        if (!(c2 instanceof Throwable)) {
            if (c2 instanceof ArrayList) {
                ((ArrayList) c2).add(th);
                return;
            } else {
                ny61.r(b64.i("State is ", c2));
                return;
            }
        }
        if (th == c2) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(c2);
        arrayList.add(th);
        g(arrayList);
    }

    @Override // defpackage.iqv
    public final de60 b() {
        return this.a;
    }

    public final Object c() {
        w.getClass();
        return wb4.a.getObjectVolatile(this, x);
    }

    public final Throwable d() {
        c.getClass();
        return (Throwable) wb4.a.getObjectVolatile(this, y);
    }

    public final boolean e() {
        return d() != null;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        Object c2 = c();
        if (c2 == null) {
            arrayList = new ArrayList(4);
        } else if (c2 instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(c2);
            arrayList = arrayList2;
        } else {
            if (!(c2 instanceof ArrayList)) {
                ny61.r(b64.i("State is ", c2));
                return null;
            }
            arrayList = (ArrayList) c2;
        }
        Throwable d = d();
        if (d != null) {
            arrayList.add(0, d);
        }
        if (th != null && !th.equals(d)) {
            arrayList.add(th);
        }
        g(ffx.f);
        return arrayList;
    }

    public final void g(Object obj) {
        w.getClass();
        wb4.a.putObjectVolatile(this, x, obj);
    }

    public final void h(Throwable th) {
        c.getClass();
        wb4.a.putObjectVolatile(this, y, th);
    }

    @Override // defpackage.iqv
    public final boolean isActive() {
        return d() == null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        sb.append(b.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(d());
        sb.append(", exceptions=");
        sb.append(c());
        sb.append(", list=");
        sb.append(this.a);
        sb.append(']');
        return sb.toString();
    }
}
