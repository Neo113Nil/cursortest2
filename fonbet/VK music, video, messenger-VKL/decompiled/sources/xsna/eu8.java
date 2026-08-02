package xsna;

import java.lang.ref.SoftReference;

/* compiled from: ByteBufferWriter.java */
/* loaded from: classes13.dex */
public final class eu8 {
    public static final ThreadLocal<SoftReference<byte[]>> a = new ThreadLocal<>();
    public static final Class<?> b;
    public static final long c;

    static {
        Class<?> cls;
        long l;
        try {
            cls = Class.forName("java.io.FileOutputStream");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        b = cls;
        if (cls != null) {
            if (v5q0.e) {
                l = v5q0.c.l(cls.getDeclaredField("channel"));
                c = l;
            }
        }
        l = -1;
        c = l;
    }
}
