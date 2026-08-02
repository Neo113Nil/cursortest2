package defpackage;

import com.google.android.gms.internal.play_billing.m;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes11.dex */
public final class k2a1 {
    public static volatile k2a1 b;
    public static final k2a1 c = new k2a1();
    public final Map a = Collections.EMPTY_MAP;

    public static k2a1 a() {
        k2a1 k2a1Var = b;
        if (k2a1Var != null) {
            return k2a1Var;
        }
        synchronized (k2a1.class) {
            try {
                k2a1 k2a1Var2 = b;
                if (k2a1Var2 != null) {
                    return k2a1Var2;
                }
                xea1 xea1Var = xea1.c;
                k2a1 b2 = t4a1.b();
                b = b2;
                return b2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(m mVar, int i) {
        if (this.a.get(new d2a1(mVar, i)) == null) {
            return;
        }
        ny61.u();
    }
}
