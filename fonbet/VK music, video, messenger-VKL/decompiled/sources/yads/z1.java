package yads;

import java.util.HashMap;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class z1 {
    public static final Object b = new Object();
    public static volatile z1 c;
    public final HashMap a = new HashMap();

    public final x1 a(long j) {
        x1 x1Var;
        synchronized (b) {
            x1Var = (x1) this.a.remove(Long.valueOf(j));
        }
        return x1Var;
    }

    public final void a(long j, x1 x1Var) {
        synchronized (b) {
            this.a.put(Long.valueOf(j), x1Var);
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
