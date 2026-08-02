package xsna;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import sun.misc.Unsafe;

/* compiled from: UnsafeUtil.java */
/* loaded from: classes12.dex */
public final class t5q0 {
    public static final Unsafe a;
    public static final Class<?> b;
    public static final e c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

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
    public static final class b extends e {
        @Override // xsna.t5q0.e
        public final boolean c(long j, Object obj) {
            return t5q0.g ? t5q0.h(j, obj) != 0 : t5q0.i(j, obj) != 0;
        }

        @Override // xsna.t5q0.e
        public final byte d(long j, Object obj) {
            return t5q0.g ? t5q0.h(j, obj) : t5q0.i(j, obj);
        }

        @Override // xsna.t5q0.e
        public final double e(long j, Object obj) {
            return Double.longBitsToDouble(h(j, obj));
        }

        @Override // xsna.t5q0.e
        public final float f(long j, Object obj) {
            return Float.intBitsToFloat(g(j, obj));
        }

        @Override // xsna.t5q0.e
        public final void k(long j, Object obj, boolean z) {
            if (t5q0.g) {
                t5q0.l(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                t5q0.m(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // xsna.t5q0.e
        public final void l(Object obj, long j, byte b) {
            if (t5q0.g) {
                t5q0.l(obj, j, b);
            } else {
                t5q0.m(obj, j, b);
            }
        }

        @Override // xsna.t5q0.e
        public final void m(Object obj, long j, double d) {
            p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // xsna.t5q0.e
        public final void n(Object obj, long j, float f) {
            o(Float.floatToIntBits(f), j, obj);
        }

        @Override // xsna.t5q0.e
        public final boolean s() {
            return false;
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class c extends e {
        @Override // xsna.t5q0.e
        public final boolean c(long j, Object obj) {
            return t5q0.g ? t5q0.h(j, obj) != 0 : t5q0.i(j, obj) != 0;
        }

        @Override // xsna.t5q0.e
        public final byte d(long j, Object obj) {
            return t5q0.g ? t5q0.h(j, obj) : t5q0.i(j, obj);
        }

        @Override // xsna.t5q0.e
        public final double e(long j, Object obj) {
            return Double.longBitsToDouble(h(j, obj));
        }

        @Override // xsna.t5q0.e
        public final float f(long j, Object obj) {
            return Float.intBitsToFloat(g(j, obj));
        }

        @Override // xsna.t5q0.e
        public final void k(long j, Object obj, boolean z) {
            if (t5q0.g) {
                t5q0.l(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                t5q0.m(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // xsna.t5q0.e
        public final void l(Object obj, long j, byte b) {
            if (t5q0.g) {
                t5q0.l(obj, j, b);
            } else {
                t5q0.m(obj, j, b);
            }
        }

        @Override // xsna.t5q0.e
        public final void m(Object obj, long j, double d) {
            p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // xsna.t5q0.e
        public final void n(Object obj, long j, float f) {
            o(Float.floatToIntBits(f), j, obj);
        }

        @Override // xsna.t5q0.e
        public final boolean s() {
            return false;
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class d extends e {
        @Override // xsna.t5q0.e
        public final boolean c(long j, Object obj) {
            return this.a.getBoolean(obj, j);
        }

        @Override // xsna.t5q0.e
        public final byte d(long j, Object obj) {
            return this.a.getByte(obj, j);
        }

        @Override // xsna.t5q0.e
        public final double e(long j, Object obj) {
            return this.a.getDouble(obj, j);
        }

        @Override // xsna.t5q0.e
        public final float f(long j, Object obj) {
            return this.a.getFloat(obj, j);
        }

        @Override // xsna.t5q0.e
        public final void k(long j, Object obj, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // xsna.t5q0.e
        public final void l(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // xsna.t5q0.e
        public final void m(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // xsna.t5q0.e
        public final void n(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // xsna.t5q0.e
        public final boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                t5q0.a(th);
                return false;
            }
        }

        @Override // xsna.t5q0.e
        public final boolean s() {
            Unsafe unsafe = this.a;
            if (unsafe != null) {
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (t5q0.e() != null) {
                        try {
                            Class<?> cls3 = this.a.getClass();
                            cls3.getMethod("getByte", cls2);
                            cls3.getMethod("putByte", cls2, Byte.TYPE);
                            cls3.getMethod("getInt", cls2);
                            cls3.getMethod("putInt", cls2, Integer.TYPE);
                            cls3.getMethod("getLong", cls2);
                            cls3.getMethod("putLong", cls2, cls2);
                            cls3.getMethod("copyMemory", cls2, cls2, cls2);
                            cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                            return true;
                        } catch (Throwable th) {
                            t5q0.a(th);
                            return false;
                        }
                    }
                } catch (Throwable th2) {
                    t5q0.a(th2);
                }
            }
            return false;
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static abstract class e {
        public final Unsafe a;

        public e(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.a.arrayIndexScale(cls);
        }

        public abstract boolean c(long j, Object obj);

        public abstract byte d(long j, Object obj);

        public abstract double e(long j, Object obj);

        public abstract float f(long j, Object obj);

        public final int g(long j, Object obj) {
            return this.a.getInt(obj, j);
        }

        public final long h(long j, Object obj) {
            return this.a.getLong(obj, j);
        }

        public final Object i(long j, Object obj) {
            return this.a.getObject(obj, j);
        }

        public final long j(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void k(long j, Object obj, boolean z);

        public abstract void l(Object obj, long j, byte b);

        public abstract void m(Object obj, long j, double d);

        public abstract void n(Object obj, long j, float f);

        public final void o(int i, long j, Object obj) {
            this.a.putInt(obj, j, i);
        }

        public final void p(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public final void q(long j, Object obj, Object obj2) {
            this.a.putObject(obj, j, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                t5q0.a(th);
                return false;
            }
        }

        public abstract boolean s();
    }

    static {
        Unsafe j = j();
        a = j;
        b = l12.a;
        boolean f2 = f(Long.TYPE);
        boolean f3 = f(Integer.TYPE);
        e eVar = null;
        if (j != null) {
            if (!l12.a()) {
                eVar = new d(j);
            } else if (f2) {
                eVar = new c(j);
            } else if (f3) {
                eVar = new b(j);
            }
        }
        c = eVar;
        d = eVar == null ? false : eVar.s();
        e = eVar == null ? false : eVar.r();
        f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field e2 = e();
        if (e2 != null && eVar != null) {
            eVar.j(e2);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(t5q0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static <T> T b(Class<T> cls) {
        try {
            return (T) a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int c(Class<?> cls) {
        if (e) {
            return c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (e) {
            c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (l12.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField(RTCStatsConstants.KEY_ADDRESS);
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean f(Class<?> cls) {
        if (!l12.a()) {
            return false;
        }
        try {
            Class<?> cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(long j, byte[] bArr) {
        return c.d(f + j, bArr);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((c.g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((c.g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j, byte b2) {
        c.l(bArr, f + j, b2);
    }

    public static void l(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int g2 = c.g(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        n(((255 & b2) << i) | (g2 & (~(255 << i))), j2, obj);
    }

    public static void m(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        n(((255 & b2) << i) | (c.g(j2, obj) & (~(255 << i))), j2, obj);
    }

    public static void n(int i, long j, Object obj) {
        c.o(i, j, obj);
    }

    public static void o(Object obj, long j, long j2) {
        c.p(obj, j, j2);
    }

    public static void p(long j, Object obj, Object obj2) {
        c.q(j, obj, obj2);
    }
}
