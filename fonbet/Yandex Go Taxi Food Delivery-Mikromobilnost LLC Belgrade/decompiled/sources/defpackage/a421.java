package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class a421 {
    public static final Unsafe a;
    public static final Class b;
    public static final x321 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    static {
        Unsafe i = i();
        a = i;
        b = h72.a;
        boolean h = h(Long.TYPE);
        boolean h2 = h(Integer.TYPE);
        x321 x321Var = null;
        if (i != null) {
            if (!h72.a()) {
                x321Var = new u321(i);
            } else if (h) {
                x321Var = new r321(i);
            } else if (h2) {
                x321Var = new o321(i);
            }
        }
        c = x321Var;
        d = x321Var == null ? false : x321Var.r();
        e = x321Var == null ? false : x321Var.q();
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
        if (g2 != null && x321Var != null) {
            x321Var.i(g2);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(a421.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j, Object obj) {
        return ((byte) ((c.f((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j, Object obj) {
        return ((byte) ((c.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            ny61.o(e2);
            return null;
        }
    }

    public static int e(Class cls) {
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
        if (h72.a()) {
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
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean h(Class cls) {
        if (!h72.a()) {
            return false;
        }
        try {
            Class cls2 = b;
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
            return (Unsafe) AccessController.doPrivileged(new l321());
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
        m(j2, obj, ((255 & b2) << i) | (f2 & (~(255 << i))));
    }

    public static void l(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m(j2, obj, ((255 & b2) << i) | (c.f(j2, obj) & (~(255 << i))));
    }

    public static void m(long j, Object obj, int i) {
        c.n(j, obj, i);
    }

    public static void n(Object obj, long j, long j2) {
        c.o(obj, j, j2);
    }

    public static void o(long j, Object obj, Object obj2) {
        c.p(j, obj, obj2);
    }
}
