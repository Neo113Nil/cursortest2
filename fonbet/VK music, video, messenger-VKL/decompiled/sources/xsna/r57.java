package xsna;

import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;

/* compiled from: BiometricsHelper.kt */
/* loaded from: classes.dex */
public final class r57 {
    public static final Object a;
    public static final Object b;

    static {
        q57 q57Var = new q57(0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        a = msy.a(lazyThreadSafetyMode, q57Var);
        b = msy.a(lazyThreadSafetyMode, new xu2(2));
    }

    public static long a(int i) {
        return i != 3 ? i != 4 ? i != 5 ? TimeUnit.MINUTES.toMillis(-1L) : TimeUnit.MINUTES.toMillis(60L) : TimeUnit.MINUTES.toMillis(10L) : TimeUnit.MINUTES.toMillis(1L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static n67 b() {
        return (n67) a.getValue();
    }
}
