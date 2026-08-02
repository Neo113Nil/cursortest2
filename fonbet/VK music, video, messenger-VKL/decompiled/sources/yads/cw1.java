package yads;

import java.util.List;
import xsna.j5g;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class cw1 {
    public static cw1 b;
    public static final Object c = new Object();
    public final xsna.sk3 a = new xsna.sk3();

    public final void a(ev1 ev1Var, String str, String str2) {
        if (fv1.a.a()) {
            aw1 aw1Var = new aw1(System.currentTimeMillis(), ev1Var.name(), str, str2);
            synchronized (c) {
                try {
                    if (this.a.size() > 5000) {
                        this.a.removeFirst();
                    }
                    this.a.addLast(aw1Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final List b() {
        List O0;
        synchronized (c) {
            O0 = j5g.O0(this.a);
        }
        return O0;
    }

    public final void a() {
        synchronized (c) {
            this.a.clear();
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
