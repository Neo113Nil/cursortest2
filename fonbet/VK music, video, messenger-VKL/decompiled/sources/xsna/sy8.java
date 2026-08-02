package xsna;

/* compiled from: Caching.kt */
/* loaded from: classes8.dex */
public final class sy8 {
    public static final boolean a;

    static {
        boolean z;
        try {
            Class.forName("java.lang.ClassValue");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        a = z;
    }
}
