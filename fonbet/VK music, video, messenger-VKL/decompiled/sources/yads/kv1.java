package yads;

import java.util.List;
import xsna.j5g;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class kv1 {
    public static kv1 b;
    public static final Object c = new Object();
    public final xsna.sk3 a = new xsna.sk3();

    public final void a() {
        synchronized (c) {
            this.a.clear();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final List b() {
        List O0;
        synchronized (c) {
            O0 = j5g.O0(this.a);
        }
        return O0;
    }
}
