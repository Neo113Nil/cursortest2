package xsna;

import java.lang.ref.SoftReference;
import xsna.tqo0;

/* compiled from: BufferRecyclers.java */
/* loaded from: classes12.dex */
public final class jm8 {
    public static final tqo0 a;
    public static final ThreadLocal<SoftReference<im8>> b;

    static {
        boolean z;
        try {
            z = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            z = false;
        }
        a = z ? tqo0.a.a : null;
        b = new ThreadLocal<>();
    }
}
