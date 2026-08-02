package xsna;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import sun.misc.Unsafe;

/* compiled from: UnsafeUtil.java */
/* loaded from: classes.dex */
public final class v5q0 {
    public static final Unsafe a;
    public static final Class<?> b;
    public static final d c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final long g;
    public static final boolean h;

    /* compiled from: UnsafeUtil.java */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            return a();
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes13.dex */
    public static final class b extends d {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // xsna.v5q0.d
        public final void c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.v5q0.d
        public final void d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.v5q0.d
        public final boolean e(long j, Object obj) {
            return v5q0.h ? v5q0.h(j, obj) != 0 : v5q0.i(j, obj) != 0;
        }

        @Override // xsna.v5q0.d
        public final byte f(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.v5q0.d
        public final double g(long j, Object obj) {
            return Double.longBitsToDouble(j(j, obj));
        }

        @Override // xsna.v5q0.d
        public final float h(long j, Object obj) {
            return Float.intBitsToFloat(i(j, obj));
        }

        @Override // xsna.v5q0.d
        public final void m(long j, Object obj, boolean z) {
            if (v5q0.h) {
                v5q0.m(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                v5q0.n(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // xsna.v5q0.d
        public final void n(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.v5q0.d
        public final void o(Object obj, long j, byte b) {
            if (v5q0.h) {
                v5q0.m(obj, j, b);
            } else {
                v5q0.n(obj, j, b);
            }
        }

        @Override // xsna.v5q0.d
        public final void p(Object obj, long j, double d) {
            s(obj, j, Double.doubleToLongBits(d));
        }

        @Override // xsna.v5q0.d
        public final void q(Object obj, long j, float f) {
            r(Float.floatToIntBits(f), j, obj);
        }

        @Override // xsna.v5q0.d
        public final boolean u() {
            return false;
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class c extends d {
        @Override // xsna.v5q0.d
        public final void c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.v5q0.d
        public final void d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.v5q0.d
        public final boolean e(long j, Object obj) {
            return v5q0.h ? v5q0.h(j, obj) != 0 : v5q0.i(j, obj) != 0;
        }

        @Override // xsna.v5q0.d
        public final byte f(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.v5q0.d
        public final double g(long j, Object obj) {
            return Double.longBitsToDouble(j(j, obj));
        }

        @Override // xsna.v5q0.d
        public final float h(long j, Object obj) {
            return Float.intBitsToFloat(i(j, obj));
        }

        @Override // xsna.v5q0.d
        public final void m(long j, Object obj, boolean z) {
            if (v5q0.h) {
                v5q0.m(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                v5q0.n(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // xsna.v5q0.d
        public final void n(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.v5q0.d
        public final void o(Object obj, long j, byte b) {
            if (v5q0.h) {
                v5q0.m(obj, j, b);
            } else {
                v5q0.n(obj, j, b);
            }
        }

        @Override // xsna.v5q0.d
        public final void p(Object obj, long j, double d) {
            s(obj, j, Double.doubleToLongBits(d));
        }

        @Override // xsna.v5q0.d
        public final void q(Object obj, long j, float f) {
            r(Float.floatToIntBits(f), j, obj);
        }

        @Override // xsna.v5q0.d
        public final boolean u() {
            return false;
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static abstract class d {
        public final Unsafe a;

        public d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.a.arrayIndexScale(cls);
        }

        public abstract void c(long j, byte[] bArr, long j2, long j3);

        public abstract void d(byte[] bArr, long j, long j2, long j3);

        public abstract boolean e(long j, Object obj);

        public abstract byte f(long j);

        public abstract double g(long j, Object obj);

        public abstract float h(long j, Object obj);

        public final int i(long j, Object obj) {
            return this.a.getInt(obj, j);
        }

        public final long j(long j, Object obj) {
            return this.a.getLong(obj, j);
        }

        public final Object k(long j, Object obj) {
            return this.a.getObject(obj, j);
        }

        public final long l(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void m(long j, Object obj, boolean z);

        public abstract void n(long j, byte b);

        public abstract void o(Object obj, long j, byte b);

        public abstract void p(Object obj, long j, double d);

        public abstract void q(Object obj, long j, float f);

        public final void r(int i, long j, Object obj) {
            this.a.putInt(obj, j, i);
        }

        public final void s(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public final void t(long j, Object obj, Object obj2) {
            this.a.putObject(obj, j, obj2);
        }

        public abstract boolean u();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(16:(1:46)(1:(1:48))|4|(1:6)(1:44)|7|(12:38|39|40|10|11|12|(5:14|15|16|(1:20)|21)|(1:33)(1:26)|27|(1:29)|30|31)|9|10|11|12|(0)|(0)|33|27|(0)|30|31)|3|4|(0)(0)|7|(14:36|38|39|40|10|11|12|(0)|(0)|33|27|(0)|30|31)|9|10|11|12|(0)|(0)|33|27|(0)|30|31) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e9, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    static {
        d bVar;
        Unsafe unsafe;
        boolean z;
        Field field;
        Field field2;
        Unsafe j = j();
        a = j;
        b = n12.a;
        Class<?> cls = Long.TYPE;
        boolean g2 = g(cls);
        Class cls2 = Integer.TYPE;
        boolean g3 = g(cls2);
        Field field3 = null;
        if (j != null) {
            if (g2) {
                bVar = new c(j);
            } else if (g3) {
                bVar = new b(j);
            }
            c = bVar;
            d = bVar != null ? false : bVar.u();
            if (bVar != null && (unsafe = bVar.a) != null) {
                try {
                    Class<?> cls3 = unsafe.getClass();
                    cls3.getMethod("objectFieldOffset", Field.class);
                    cls3.getMethod("arrayBaseOffset", Class.class);
                    cls3.getMethod("arrayIndexScale", Class.class);
                    cls3.getMethod("getInt", Object.class, cls);
                    cls3.getMethod("putInt", Object.class, cls, cls2);
                    cls3.getMethod("getLong", Object.class, cls);
                    cls3.getMethod("putLong", Object.class, cls, cls);
                    cls3.getMethod("getObject", Object.class, cls);
                    cls3.getMethod("putObject", Object.class, cls, Object.class);
                    z = true;
                } catch (Throwable th) {
                    a(th);
                }
                e = z;
                f = d(byte[].class);
                d(boolean[].class);
                e(boolean[].class);
                d(int[].class);
                e(int[].class);
                d(long[].class);
                e(long[].class);
                d(float[].class);
                e(float[].class);
                d(double[].class);
                e(double[].class);
                d(Object[].class);
                e(Object[].class);
                Class<?> cls4 = n12.a;
                field = Buffer.class.getDeclaredField("effectiveDirectAddress");
                if (field == null) {
                    try {
                        field2 = Buffer.class.getDeclaredField(RTCStatsConstants.KEY_ADDRESS);
                    } catch (Throwable unused) {
                        field2 = null;
                    }
                    if (field2 != null && field2.getType() == cls) {
                        field3 = field2;
                    }
                    field = field3;
                }
                g = (field != null || bVar == null) ? -1L : bVar.l(field);
                h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
            z = false;
            e = z;
            f = d(byte[].class);
            d(boolean[].class);
            e(boolean[].class);
            d(int[].class);
            e(int[].class);
            d(long[].class);
            e(long[].class);
            d(float[].class);
            e(float[].class);
            d(double[].class);
            e(double[].class);
            d(Object[].class);
            e(Object[].class);
            Class<?> cls42 = n12.a;
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
            if (field == null) {
            }
            g = (field != null || bVar == null) ? -1L : bVar.l(field);
            h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        bVar = null;
        c = bVar;
        d = bVar != null ? false : bVar.u();
        if (bVar != null) {
            Class<?> cls32 = unsafe.getClass();
            cls32.getMethod("objectFieldOffset", Field.class);
            cls32.getMethod("arrayBaseOffset", Class.class);
            cls32.getMethod("arrayIndexScale", Class.class);
            cls32.getMethod("getInt", Object.class, cls);
            cls32.getMethod("putInt", Object.class, cls, cls2);
            cls32.getMethod("getLong", Object.class, cls);
            cls32.getMethod("putLong", Object.class, cls, cls);
            cls32.getMethod("getObject", Object.class, cls);
            cls32.getMethod("putObject", Object.class, cls, Object.class);
            z = true;
            e = z;
            f = d(byte[].class);
            d(boolean[].class);
            e(boolean[].class);
            d(int[].class);
            e(int[].class);
            d(long[].class);
            e(long[].class);
            d(float[].class);
            e(float[].class);
            d(double[].class);
            e(double[].class);
            d(Object[].class);
            e(Object[].class);
            Class<?> cls422 = n12.a;
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
            if (field == null) {
            }
            g = (field != null || bVar == null) ? -1L : bVar.l(field);
            h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        z = false;
        e = z;
        f = d(byte[].class);
        d(boolean[].class);
        e(boolean[].class);
        d(int[].class);
        e(int[].class);
        d(long[].class);
        e(long[].class);
        d(float[].class);
        e(float[].class);
        d(double[].class);
        e(double[].class);
        d(Object[].class);
        e(Object[].class);
        Class<?> cls4222 = n12.a;
        field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        if (field == null) {
        }
        g = (field != null || bVar == null) ? -1L : bVar.l(field);
        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(v5q0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static long b(ByteBuffer byteBuffer) {
        return c.j(g, byteBuffer);
    }

    public static <T> T c(Class<T> cls) {
        try {
            return (T) a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int d(Class<?> cls) {
        if (e) {
            return c.a(cls);
        }
        return -1;
    }

    public static void e(Class cls) {
        if (e) {
            c.b(cls);
        }
    }

    public static void f(long j, byte[] bArr, long j2, long j3) {
        c.c(j, bArr, j2, j3);
    }

    public static boolean g(Class<?> cls) {
        Class<?> cls2 = n12.a;
        try {
            Class<?> cls3 = b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", cls, cls4);
            cls3.getMethod("pokeLong", cls, Long.TYPE, cls4);
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", cls, cls5, cls4);
            cls3.getMethod("peekInt", cls, cls4);
            cls3.getMethod("pokeByte", cls, Byte.TYPE);
            cls3.getMethod("peekByte", cls);
            cls3.getMethod("pokeByteArray", cls, byte[].class, cls5, cls5);
            cls3.getMethod("peekByteArray", cls, byte[].class, cls5, cls5);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte h(long j, Object obj) {
        return (byte) ((c.i((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((c.i((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(long j, byte b2) {
        c.n(j, b2);
    }

    public static void l(byte[] bArr, long j, byte b2) {
        c.o(bArr, f + j, b2);
    }

    public static void m(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = c.i(j2, obj);
        int i2 = ((~((int) j)) & 3) << 3;
        o(((255 & b2) << i2) | (i & (~(255 << i2))), j2, obj);
    }

    public static void n(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        o(((255 & b2) << i) | (c.i(j2, obj) & (~(255 << i))), j2, obj);
    }

    public static void o(int i, long j, Object obj) {
        c.r(i, j, obj);
    }

    public static void p(Object obj, long j, long j2) {
        c.s(obj, j, j2);
    }

    public static void q(long j, Object obj, Object obj2) {
        c.t(j, obj, obj2);
    }
}
