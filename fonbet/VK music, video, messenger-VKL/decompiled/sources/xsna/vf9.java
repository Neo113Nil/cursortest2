package xsna;

import android.os.Parcelable;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.Coordinate;
import com.vk.geo.impl.model.MutableCameraBounds;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: CameraBoundsObserver.kt */
/* loaded from: classes2.dex */
public final class vf9 {
    public l2l<CameraBounds> a;
    public nv2 b;
    public sf9 c;
    public final AtomicReference<CameraBounds> d = new AtomicReference<>(null);
    public hl1 e;
    public final ScheduledExecutorService f;
    public final int g;
    public final AtomicReference<CameraBounds> h;

    /* compiled from: CameraBoundsObserver.kt */
    public static final class a implements Runnable {
        public static final C3886a h = new C3886a(10);
        public AtomicReference<CameraBounds> b;
        public CameraBounds c;
        public hl1 d;
        public l2l<CameraBounds> e;
        public sf9 f;
        public vf9 g;

        /* compiled from: CameraBoundsObserver.kt */
        /* renamed from: xsna.vf9$a$a, reason: collision with other inner class name */
        public static final class C3886a extends bvb0<a> {
            @Override // xsna.bvb0
            public final void b(a aVar) {
                aVar.b();
            }
        }

        public static String a() {
            return "pool.size = " + h.b.d();
        }

        public final void b() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
        
            r0 = r6.j;
            r1 = r0.a;
            r0 = r0.b;
            r3 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
        
            if (r3 >= r0) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
        
            if (r1[r3] != r8) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
        
            r3 = r3 + 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c(CameraBounds cameraBounds, vf9 vf9Var, CameraBounds cameraBounds2, AtomicReference atomicReference) {
            boolean z;
            xf9 xf9Var = xf9.e;
            ReentrantLock reentrantLock = xf9Var.c;
            reentrantLock.lock();
            try {
                if (cameraBounds instanceof MutableCameraBounds) {
                    ph50<MutableCameraBounds, Object> ph50Var = xf9.g;
                    if (!ph50Var.b(cameraBounds)) {
                        ph50Var.p(cameraBounds, vf9Var);
                    }
                }
                xf9.d(xf9Var, cameraBounds, vf9Var);
                reentrantLock.unlock();
                atomicReference.set(cameraBounds);
                if (cameraBounds2 == null) {
                    hl1 hl1Var = this.d;
                    if (hl1Var != null) {
                        hl1Var.invoke(cameraBounds);
                    }
                    this.d = null;
                }
                L.d(new com.vk.movika.sdk.android.defaultplayer.interactive.a(cameraBounds, 10));
                l2l<CameraBounds> l2lVar = this.e;
                if (l2lVar != null) {
                    xf9.d(xf9Var, cameraBounds, l2lVar);
                    l2lVar.a(cameraBounds);
                }
                sf9 sf9Var = this.f;
                if (sf9Var != null) {
                    sf9Var.invoke(cameraBounds2, cameraBounds);
                }
                if (cameraBounds2 != null) {
                    l2l<CameraBounds> l2lVar2 = this.e;
                    if (l2lVar2 != null) {
                        ReentrantLock reentrantLock2 = l2lVar2.k;
                        reentrantLock2.lock();
                        try {
                            if (l2lVar2.l != cameraBounds2) {
                                fh50<CameraBounds> fh50Var = l2lVar2.i;
                                Object[] objArr = fh50Var.a;
                                int i = fh50Var.b;
                                z = false;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= i) {
                                        break;
                                    } else if (objArr[i2] == cameraBounds2) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            z = true;
                            reentrantLock2.unlock();
                            if (!z) {
                                xf9.e.g(cameraBounds2, l2lVar2);
                            }
                        } catch (Throwable th) {
                            reentrantLock2.unlock();
                            throw th;
                        }
                    }
                    xf9 xf9Var2 = xf9.e;
                    xf9Var2.g(cameraBounds2, vf9Var);
                    xf9Var2.f(cameraBounds2);
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            C3886a c3886a = h;
            try {
                CameraBounds cameraBounds = this.c;
                vf9 vf9Var = this.g;
                AtomicReference<CameraBounds> atomicReference = this.b;
                if (atomicReference == null) {
                    return;
                }
                CameraBounds cameraBounds2 = atomicReference.get();
                if (vf9Var != null && cameraBounds != null && !epx.f(cameraBounds2, cameraBounds)) {
                    c(cameraBounds, vf9Var, cameraBounds2, atomicReference);
                    b();
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{a()});
                    }
                    c3886a.c(this);
                    return;
                }
                b();
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{a()});
                }
                c3886a.c(this);
            } catch (Throwable th) {
                try {
                    L.i(th);
                    b();
                    L l3 = L.a;
                    l3.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l3, L.LogType.d, new Object[]{a()});
                    }
                    c3886a.c(this);
                } finally {
                    b();
                    L l4 = L.a;
                    l4.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l4, L.LogType.d, new Object[]{a()});
                    }
                    c3886a.c(this);
                }
            }
        }
    }

    public vf9() {
        asu0.a.getClass();
        this.f = asu0.v();
        this.g = cn70.b(30);
        this.h = new AtomicReference<>(null);
    }

    public final boolean a(final CameraBounds cameraBounds, final CameraBounds cameraBounds2, float f, omf omfVar, boolean z) {
        if (Math.abs(cameraBounds2.F0() - cameraBounds.F0()) > f) {
            return true;
        }
        float f2 = this.g;
        final float floatValue = ((((Number) omfVar.invoke(cameraBounds2)).floatValue() * f2) + (((Number) omfVar.invoke(cameraBounds)).floatValue() * f2)) * 0.5f;
        final float d = Coordinate.d(cameraBounds2.C(), cameraBounds.C());
        if (d > floatValue) {
            return true;
        }
        final float d2 = Coordinate.d(cameraBounds2.D0().C(), cameraBounds.D0().C());
        if (z) {
            L.d(new gzs() { // from class: xsna.uf9
                @Override // xsna.gzs
                public final Object invoke() {
                    StringBuilder sb = new StringBuilder("old=");
                    Parcelable.Creator<BoundingBox> creator = BoundingBox.CREATOR;
                    sb.append(CameraBounds.this.geoJsonString(true));
                    sb.append(",\tnew=");
                    sb.append(cameraBounds.geoJsonString(true));
                    sb.append(",\tmaxDistance=");
                    sb.append(floatValue);
                    sb.append(", distanceBetweenCenters=");
                    sb.append(d);
                    sb.append(", distanceBetweenVisibleCenters=");
                    sb.append(d2);
                    return sb.toString();
                }
            });
        }
        return d2 > floatValue;
    }

    public final void b(CameraBounds cameraBounds) {
        a.C3886a c3886a = a.h;
        AtomicReference<CameraBounds> atomicReference = this.d;
        hl1 hl1Var = this.e;
        l2l<CameraBounds> l2lVar = this.a;
        sf9 sf9Var = this.c;
        ReentrantLock reentrantLock = c3886a.c;
        reentrantLock.lock();
        try {
            a a2 = c3886a.a();
            if (a2 == null) {
                a2 = new a();
            }
            a2.g = this;
            a2.b = atomicReference;
            a2.c = cameraBounds;
            a2.d = hl1Var;
            a2.e = l2lVar;
            a2.f = sf9Var;
            reentrantLock.unlock();
            this.f.execute(a2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
