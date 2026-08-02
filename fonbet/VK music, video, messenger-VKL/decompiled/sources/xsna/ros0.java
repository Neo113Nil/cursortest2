package xsna;

import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VideoGrowthPopupControllerImpl.kt */
/* loaded from: classes6.dex */
public final class ros0 {
    public static final long j;
    public static final long k;
    public final hos0 a;
    public final hit0 b;
    public final bos0 c;
    public final sos0 d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final long h;
    public final long i;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        j = timeUnit.toMillis(30L);
        k = timeUnit.toMillis(30L);
    }

    public ros0(hos0 hos0Var, hit0 hit0Var, bos0 bos0Var, sos0 sos0Var) {
        this.a = hos0Var;
        this.b = hit0Var;
        this.c = bos0Var;
        this.d = sos0Var;
        zo80 zo80Var = new zo80(9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, zo80Var);
        Lazy a = msy.a(lazyThreadSafetyMode, new ap80(14));
        this.f = a;
        this.g = msy.a(lazyThreadSafetyMode, new akd0(this, 20));
        kos0 kos0Var = (kos0) a.getValue();
        this.h = kos0Var != null ? kos0Var.a.longValue() : j;
        kos0 kos0Var2 = (kos0) a.getValue();
        this.i = kos0Var2 != null ? kos0Var2.b.longValue() : k;
    }
}
