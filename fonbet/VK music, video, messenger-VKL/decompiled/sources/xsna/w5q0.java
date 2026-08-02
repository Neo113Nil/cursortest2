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
/* loaded from: classes.dex */
public final class w5q0 {
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
    /* loaded from: classes12.dex */
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // xsna.w5q0.e
        public final boolean c(long j, Object obj) {
            return w5q0.g ? w5q0.b(j, obj) : w5q0.c(j, obj);
        }

        @Override // xsna.w5q0.e
        public final double d(long j, Object obj) {
            return Double.longBitsToDouble(g(j, obj));
        }

        @Override // xsna.w5q0.e
        public final float e(long j, Object obj) {
            return Float.intBitsToFloat(f(j, obj));
        }

        @Override // xsna.w5q0.e
        public final void j(long j, Object obj, boolean z) {
            if (w5q0.g) {
                w5q0.k(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                w5q0.l(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // xsna.w5q0.e
        public final void k(Object obj, long j, byte b) {
            if (w5q0.g) {
                w5q0.k(obj, j, b);
            } else {
                w5q0.l(obj, j, b);
            }
        }

        @Override // xsna.w5q0.e
        public final void l(Object obj, long j, double d) {
            o(obj, j, Double.doubleToLongBits(d));
        }

        @Override // xsna.w5q0.e
        public final void m(Object obj, long j, float f) {
            n(Float.floatToIntBits(f), j, obj);
        }

        @Override // xsna.w5q0.e
        public final boolean r() {
            return false;
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class c extends e {
        @Override // xsna.w5q0.e
        public final boolean c(long j, Object obj) {
            return w5q0.g ? w5q0.b(j, obj) : w5q0.c(j, obj);
        }

        @Override // xsna.w5q0.e
        public final double d(long j, Object obj) {
            return Double.longBitsToDouble(g(j, obj));
        }

        @Override // xsna.w5q0.e
        public final float e(long j, Object obj) {
            return Float.intBitsToFloat(f(j, obj));
        }

        @Override // xsna.w5q0.e
        public final void j(long j, Object obj, boolean z) {
            if (w5q0.g) {
                w5q0.k(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                w5q0.l(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // xsna.w5q0.e
        public final void k(Object obj, long j, byte b) {
            if (w5q0.g) {
                w5q0.k(obj, j, b);
            } else {
                w5q0.l(obj, j, b);
            }
        }

        @Override // xsna.w5q0.e
        public final void l(Object obj, long j, double d) {
            o(obj, j, Double.doubleToLongBits(d));
        }

        @Override // xsna.w5q0.e
        public final void m(Object obj, long j, float f) {
            n(Float.floatToIntBits(f), j, obj);
        }

        @Override // xsna.w5q0.e
        public final boolean r() {
            return false;
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes12.dex */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // xsna.w5q0.e
        public final boolean c(long j, Object obj) {
            return this.a.getBoolean(obj, j);
        }

        @Override // xsna.w5q0.e
        public final double d(long j, Object obj) {
            return this.a.getDouble(obj, j);
        }

        @Override // xsna.w5q0.e
        public final float e(long j, Object obj) {
            return this.a.getFloat(obj, j);
        }

        @Override // xsna.w5q0.e
        public final void j(long j, Object obj, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // xsna.w5q0.e
        public final void k(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // xsna.w5q0.e
        public final void l(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // xsna.w5q0.e
        public final void m(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // xsna.w5q0.e
        public final boolean q() {
            if (!super.q()) {
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
                w5q0.a(th);
                return false;
            }
        }

        @Override // xsna.w5q0.e
        public final boolean r() {
            Unsafe unsafe = this.a;
            if (unsafe != null) {
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (w5q0.g() != null) {
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
                            w5q0.a(th);
                            return false;
                        }
                    }
                } catch (Throwable th2) {
                    w5q0.a(th2);
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

        public abstract double d(long j, Object obj);

        public abstract float e(long j, Object obj);

        public final int f(long j, Object obj) {
            return this.a.getInt(obj, j);
        }

        public final long g(long j, Object obj) {
            return this.a.getLong(obj, j);
        }

        public final Object h(long j, Object obj) {
            return this.a.getObject(obj, j);
        }

        public final long i(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void j(long j, Object obj, boolean z);

        public abstract void k(Object obj, long j, byte b);

        public abstract void l(Object obj, long j, double d);

        public abstract void m(Object obj, long j, float f);

        public final void n(int i, long j, Object obj) {
            this.a.putInt(obj, j, i);
        }

        public final void o(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public final void p(long j, Object obj, Object obj2) {
            this.a.putObject(obj, j, obj2);
        }

        public boolean q() {
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
                w5q0.a(th);
                return false;
            }
        }

        public abstract boolean r();
    }

    static {
        Unsafe i = i();
        a = i;
        b = o12.a;
        boolean h = h(Long.TYPE);
        boolean h2 = h(Integer.TYPE);
        e eVar = null;
        if (i != null) {
            if (!o12.a()) {
                eVar = new d(i);
            } else if (h) {
                eVar = new c(i);
            } else if (h2) {
                eVar = new b(i);
            }
        }
        c = eVar;
        d = eVar == null ? false : eVar.r();
        e = eVar == null ? false : eVar.q();
        f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field g2 = g();
        if (g2 != null && eVar != null) {
            eVar.i(g2);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(w5q0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j, Object obj) {
        return ((byte) ((c.f((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j, Object obj) {
        return ((byte) ((c.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static <T> T d(Class<T> cls) {
        try {
            return (T) a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int e(Class<?> cls) {
        if (e) {
            return c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (e) {
            c.b(cls);
        }
    }

    public static Field g() {
        Field field;
        Field field2;
        if (o12.a()) {
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

    public static boolean h(Class<?> cls) {
        if (!o12.a()) {
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

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j, byte b2) {
        c.k(bArr, f + j, b2);
    }

    public static void k(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int f2 = c.f(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m(((255 & b2) << i) | (f2 & (~(255 << i))), j2, obj);
    }

    public static void l(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m(((255 & b2) << i) | (c.f(j2, obj) & (~(255 << i))), j2, obj);
    }

    public static void m(int i, long j, Object obj) {
        c.n(i, j, obj);
    }

    public static void n(Object obj, long j, long j2) {
        c.o(obj, j, j2);
    }

    public static void o(long j, Object obj, Object obj2) {
        c.p(j, obj, obj2);
    }
}
