package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.Coordinate;
import com.vk.geo.impl.model.Degrees;
import com.vk.geo.impl.model.MutableCameraBounds;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: CameraBoundsPool.kt */
/* loaded from: classes2.dex */
public final class xf9 extends bvb0<MutableCameraBounds> {
    public static final xf9 e = new xf9(100);
    public static final ph50<MutableCameraBounds, fh50<Object>> f = new ph50<>(20);
    public static final ph50<MutableCameraBounds, Object> g = new ph50<>(20);
    public static final fh50<WeakReference<MutableCameraBounds>> h = new fh50<>(10);

    public static void d(xf9 xf9Var, CameraBounds cameraBounds, Object obj) {
        ReentrantLock reentrantLock = xf9Var.c;
        reentrantLock.lock();
        try {
            if ((cameraBounds instanceof MutableCameraBounds) && obj != null) {
                ph50<MutableCameraBounds, fh50<Object>> ph50Var = f;
                fh50<Object> d = ph50Var.d(cameraBounds);
                if (d == null) {
                    d = new fh50<>(4);
                    ph50Var.p(cameraBounds, d);
                }
                fh50<Object> fh50Var = d;
                fh50Var.j(obj);
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"lock " + cameraBounds + " by " + obj + ", locks count=" + fh50Var.b});
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // xsna.bvb0
    public final void b(MutableCameraBounds mutableCameraBounds) {
        MutableCameraBounds mutableCameraBounds2 = mutableCameraBounds;
        L.p(new RuntimeException("its ok! not real exception! clearing " + mutableCameraBounds2));
        mutableCameraBounds2.l = Float.NaN;
        mutableCameraBounds2.o = Float.NaN;
        mutableCameraBounds2.n = Float.NaN;
        mutableCameraBounds2.m = Float.NaN;
        mutableCameraBounds2.r = Coordinate.b;
        mutableCameraBounds2.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        mutableCameraBounds2.q = Float.NaN;
        mutableCameraBounds2.s = System.currentTimeMillis();
    }

    public final void e(MutableCameraBounds mutableCameraBounds) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (!f.a(mutableCameraBounds) && !g.a(mutableCameraBounds)) {
                boolean c = e.c(mutableCameraBounds);
                BoundingBox D0 = mutableCameraBounds.D0();
                if (D0 != mutableCameraBounds) {
                    q7o.k(D0);
                }
                if (c) {
                    fh50<WeakReference<MutableCameraBounds>> fh50Var = h;
                    int i = fh50Var.b;
                    Object[] objArr = fh50Var.a;
                    int i2 = 0;
                    k9x q = swe0.q(0, i);
                    int i3 = q.b;
                    int i4 = q.c;
                    if (i3 <= i4) {
                        while (true) {
                            objArr[i3 - i2] = objArr[i3];
                            WeakReference weakReference = (WeakReference) objArr[i3];
                            if (weakReference.get() == null || weakReference.get() == mutableCameraBounds) {
                                i2++;
                            }
                            if (i3 == i4) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    Arrays.fill(objArr, i - i2, i, (Object) null);
                    fh50Var.b -= i2;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(Object obj) {
        MutableCameraBounds mutableCameraBounds = obj instanceof MutableCameraBounds ? (MutableCameraBounds) obj : null;
        if (mutableCameraBounds != null) {
            e(mutableCameraBounds);
        }
    }

    public final int g(CameraBounds cameraBounds, Object obj) {
        boolean z;
        xf9 xf9Var = e;
        ph50<MutableCameraBounds, fh50<Object>> ph50Var = f;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            int i = 0;
            if (cameraBounds instanceof MutableCameraBounds) {
                ph50<MutableCameraBounds, Object> ph50Var2 = g;
                if (ph50Var2.d(cameraBounds) == obj) {
                    ph50Var2.n(cameraBounds);
                    z = true;
                } else {
                    z = false;
                }
                fh50<Object> d = ph50Var.d(cameraBounds);
                if (z || (d != null && d.g())) {
                    if (Degrees.a(((MutableCameraBounds) cameraBounds).l, Float.NaN)) {
                        StringBuilder sb = new StringBuilder("unlock ");
                        sb.append(cameraBounds);
                        sb.append(" by ");
                        sb.append(obj);
                        sb.append(", locks count = ");
                        sb.append(d != null ? Integer.valueOf(d.b) : null);
                        L.E(new IllegalStateException(sb.toString()), new Object[0]);
                    } else {
                        L.d(new wf9(cameraBounds, obj, d, 0));
                    }
                }
                if (d != null) {
                    xf9Var.getClass();
                    Object[] objArr = d.a;
                    int i2 = d.b;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            i3 = -1;
                            break;
                        }
                        if (objArr[i3] == obj) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 >= 0 && d.o(i3) == obj && d.f()) {
                        ph50Var.n(cameraBounds);
                        xf9Var.e((MutableCameraBounds) cameraBounds);
                    }
                }
                if (d != null) {
                    Object[] objArr2 = d.a;
                    int i4 = d.b;
                    int i5 = 0;
                    while (i < i4) {
                        if (objArr2[i] == obj) {
                            i5++;
                        }
                        i++;
                    }
                    i = i5;
                }
            }
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void h(CameraBounds cameraBounds, Object obj) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            loop0: while (true) {
                if (e.g(cameraBounds, obj) > 0) {
                    ref$IntRef.element++;
                }
                MutableCameraBounds mutableCameraBounds = cameraBounds instanceof MutableCameraBounds ? (MutableCameraBounds) cameraBounds : null;
                fh50<Object> d = mutableCameraBounds != null ? f.d(mutableCameraBounds) : null;
                if (d == null) {
                    break;
                }
                Object[] objArr = d.a;
                int i = d.b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (objArr[i2] == obj) {
                        break;
                    }
                }
                break loop0;
            }
            if (ref$IntRef.element > 1) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"unlocked " + ref$IntRef.element + " for " + cameraBounds});
                }
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final MutableCameraBounds i(float f2, float f3, float f4, float f5, long j, float f6, float f7, int i) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            MutableCameraBounds a = e.a();
            if (a != null) {
                a.H0(j, f2, f5, f4, f3, f6, f7);
            } else {
                a = new MutableCameraBounds(f2, f3, f4, f5, f6, j, f7, i, null);
                h.j(new WeakReference(a));
            }
            reentrantLock.unlock();
            return a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // xsna.bvb0
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(xf9.class.getSimpleName());
        sb.append("(acquireNullCount=");
        sb.append(this.d);
        sb.append(",acquired.size=");
        fh50<WeakReference<MutableCameraBounds>> fh50Var = h;
        Object[] objArr = fh50Var.a;
        int i = fh50Var.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (((WeakReference) objArr[i3]).get() != null) {
                i2++;
            }
        }
        sb.append(i2);
        sb.append(",poolSize=");
        sb.append(this.b.d());
        sb.append(",locks.count=");
        Integer num = 0;
        ph50<MutableCameraBounds, fh50<Object>> ph50Var = f;
        Object[] objArr2 = ph50Var.b;
        Object[] objArr3 = ph50Var.c;
        long[] jArr = ph50Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j = jArr[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j) < 128) {
                            int i7 = (i4 << 3) + i6;
                            num = Integer.valueOf(num.intValue() + ((fh50) objArr3[i7]).b);
                        }
                        j >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        sb.append(num.intValue());
        sb.append(",superlocks.count=");
        return vu5.b(sb, g.e, ')');
    }
}
