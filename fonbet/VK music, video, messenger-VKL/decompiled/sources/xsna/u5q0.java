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
public final class u5q0 {
    public static final Logger a = Logger.getLogger(u5q0.class.getName());
    public static final Unsafe b;
    public static final Class<?> c;
    public static final e d;
    public static final boolean e;
    public static final boolean f;
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
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // xsna.u5q0.e
        public final boolean c(long j, Object obj) {
            return u5q0.h ? u5q0.g(j, obj) != 0 : u5q0.h(j, obj) != 0;
        }

        @Override // xsna.u5q0.e
        public final byte d(long j, Object obj) {
            return u5q0.h ? u5q0.g(j, obj) : u5q0.h(j, obj);
        }

        @Override // xsna.u5q0.e
        public final double e(long j, Object obj) {
            return Double.longBitsToDouble(h(j, obj));
        }

        @Override // xsna.u5q0.e
        public final float f(long j, Object obj) {
            return Float.intBitsToFloat(g(j, obj));
        }

        @Override // xsna.u5q0.e
        public final void k(long j, Object obj, boolean z) {
            if (u5q0.h) {
                u5q0.k(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                u5q0.l(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // xsna.u5q0.e
        public final void l(Object obj, long j, byte b) {
            if (u5q0.h) {
                u5q0.k(obj, j, b);
            } else {
                u5q0.l(obj, j, b);
            }
        }

        @Override // xsna.u5q0.e
        public final void m(Object obj, long j, double d) {
            p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // xsna.u5q0.e
        public final void n(Object obj, long j, float f) {
            o(Float.floatToIntBits(f), j, obj);
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class c extends e {
        @Override // xsna.u5q0.e
        public final boolean c(long j, Object obj) {
            return u5q0.h ? u5q0.g(j, obj) != 0 : u5q0.h(j, obj) != 0;
        }

        @Override // xsna.u5q0.e
        public final byte d(long j, Object obj) {
            return u5q0.h ? u5q0.g(j, obj) : u5q0.h(j, obj);
        }

        @Override // xsna.u5q0.e
        public final double e(long j, Object obj) {
            return Double.longBitsToDouble(h(j, obj));
        }

        @Override // xsna.u5q0.e
        public final float f(long j, Object obj) {
            return Float.intBitsToFloat(g(j, obj));
        }

        @Override // xsna.u5q0.e
        public final void k(long j, Object obj, boolean z) {
            if (u5q0.h) {
                u5q0.k(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                u5q0.l(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // xsna.u5q0.e
        public final void l(Object obj, long j, byte b) {
            if (u5q0.h) {
                u5q0.k(obj, j, b);
            } else {
                u5q0.l(obj, j, b);
            }
        }

        @Override // xsna.u5q0.e
        public final void m(Object obj, long j, double d) {
            p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // xsna.u5q0.e
        public final void n(Object obj, long j, float f) {
            o(Float.floatToIntBits(f), j, obj);
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes13.dex */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // xsna.u5q0.e
        public final boolean c(long j, Object obj) {
            return this.a.getBoolean(obj, j);
        }

        @Override // xsna.u5q0.e
        public final byte d(long j, Object obj) {
            return this.a.getByte(obj, j);
        }

        @Override // xsna.u5q0.e
        public final double e(long j, Object obj) {
            return this.a.getDouble(obj, j);
        }

        @Override // xsna.u5q0.e
        public final float f(long j, Object obj) {
            return this.a.getFloat(obj, j);
        }

        @Override // xsna.u5q0.e
        public final void k(long j, Object obj, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // xsna.u5q0.e
        public final void l(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // xsna.u5q0.e
        public final void m(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // xsna.u5q0.e
        public final void n(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
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
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class cls;
        Class<?> cls2;
        boolean z;
        Unsafe unsafe;
        boolean z2;
        Field d2;
        e eVar;
        Unsafe i = i();
        b = i;
        c = m12.a;
        Class cls3 = Long.TYPE;
        boolean e2 = e(cls3);
        Class cls4 = Integer.TYPE;
        boolean e3 = e(cls4);
        e eVar2 = null;
        if (i != null) {
            if (!m12.a()) {
                eVar2 = new d(i);
            } else if (e2) {
                eVar2 = new c(i);
            } else if (e3) {
                eVar2 = new b(i);
            }
        }
        d = eVar2;
        Class cls5 = Byte.TYPE;
        if (i != null) {
            try {
                cls2 = i.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls3);
            } catch (Throwable th) {
                cls = Field.class;
                a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            }
            if (d() != null) {
                if (!m12.a()) {
                    cls2.getMethod("getByte", cls3);
                    cls2.getMethod("putByte", cls3, cls5);
                    cls2.getMethod("getInt", cls3);
                    cls2.getMethod("putInt", cls3, cls4);
                    cls2.getMethod("getLong", cls3);
                    cls2.getMethod("putLong", cls3, cls3);
                    cls2.getMethod("copyMemory", cls3, cls3, cls3);
                    cls2.getMethod("copyMemory", Object.class, cls3, Object.class, cls3, cls3);
                }
                cls = Field.class;
                z = true;
                e = z;
                unsafe = b;
                if (unsafe != null) {
                    try {
                        Class<?> cls6 = unsafe.getClass();
                        cls6.getMethod("objectFieldOffset", cls);
                        cls6.getMethod("arrayBaseOffset", Class.class);
                        cls6.getMethod("arrayIndexScale", Class.class);
                        cls6.getMethod("getInt", Object.class, cls3);
                        cls6.getMethod("putInt", Object.class, cls3, cls4);
                        cls6.getMethod("getLong", Object.class, cls3);
                        cls6.getMethod("putLong", Object.class, cls3, cls3);
                        cls6.getMethod("getObject", Object.class, cls3);
                        cls6.getMethod("putObject", Object.class, cls3, Object.class);
                        if (!m12.a()) {
                            cls6.getMethod("getByte", Object.class, cls3);
                            cls6.getMethod("putByte", Object.class, cls3, cls5);
                            cls6.getMethod("getBoolean", Object.class, cls3);
                            cls6.getMethod("putBoolean", Object.class, cls3, Boolean.TYPE);
                            cls6.getMethod("getFloat", Object.class, cls3);
                            cls6.getMethod("putFloat", Object.class, cls3, Float.TYPE);
                            cls6.getMethod("getDouble", Object.class, cls3);
                            cls6.getMethod("putDouble", Object.class, cls3, Double.TYPE);
                        }
                        z2 = true;
                    } catch (Throwable th2) {
                        a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
                    }
                    f = z2;
                    g = b(byte[].class);
                    b(boolean[].class);
                    c(boolean[].class);
                    b(int[].class);
                    c(int[].class);
                    b(long[].class);
                    c(long[].class);
                    b(float[].class);
                    c(float[].class);
                    b(double[].class);
                    c(double[].class);
                    b(Object[].class);
                    c(Object[].class);
                    d2 = d();
                    if (d2 != null && (eVar = d) != null) {
                        eVar.j(d2);
                    }
                    h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z2 = false;
                f = z2;
                g = b(byte[].class);
                b(boolean[].class);
                c(boolean[].class);
                b(int[].class);
                c(int[].class);
                b(long[].class);
                c(long[].class);
                b(float[].class);
                c(float[].class);
                b(double[].class);
                c(double[].class);
                b(Object[].class);
                c(Object[].class);
                d2 = d();
                if (d2 != null) {
                    eVar.j(d2);
                }
                h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        cls = Field.class;
        z = false;
        e = z;
        unsafe = b;
        if (unsafe != null) {
        }
        z2 = false;
        f = z2;
        g = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        d2 = d();
        if (d2 != null) {
        }
        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static <T> T a(Class<T> cls) {
        try {
            return (T) b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int b(Class<?> cls) {
        if (f) {
            return d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f) {
            d.b(cls);
        }
    }

    public static Field d() {
        Field field;
        Field field2;
        if (m12.a()) {
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

    public static boolean e(Class<?> cls) {
        if (!m12.a()) {
            return false;
        }
        try {
            Class<?> cls2 = c;
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

    public static byte f(long j, byte[] bArr) {
        return d.d(g + j, bArr);
    }

    public static byte g(long j, Object obj) {
        return (byte) ((d.g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((d.g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j, byte b2) {
        d.l(bArr, g + j, b2);
    }

    public static void k(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int g2 = d.g(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m(((255 & b2) << i) | (g2 & (~(255 << i))), j2, obj);
    }

    public static void l(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m(((255 & b2) << i) | (d.g(j2, obj) & (~(255 << i))), j2, obj);
    }

    public static void m(int i, long j, Object obj) {
        d.o(i, j, obj);
    }

    public static void n(Object obj, long j, long j2) {
        d.p(obj, j, j2);
    }

    public static void o(long j, Object obj, Object obj2) {
        d.q(j, obj, obj2);
    }
}
