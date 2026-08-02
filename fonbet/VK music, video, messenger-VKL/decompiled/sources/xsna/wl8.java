package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.em8;

/* compiled from: Buffer.kt */
/* loaded from: classes9.dex */
public final class wl8<T> {
    public final Object a;
    public final sk3<em8> b = new sk3<>();

    public wl8(Object obj) {
        this.a = obj;
    }

    public final void a(em8 em8Var) {
        synchronized (this.a) {
            this.b.addLast(em8Var);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final em8 b() {
        em8 l;
        synchronized (this.a) {
            try {
                l = this.b.l();
                if (!(l instanceof em8.b)) {
                    if (l instanceof em8.c) {
                        l = (em8.c) l;
                    } else if (!epx.f(l, em8.a.a)) {
                        if (l != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        l = null;
                    }
                }
            } finally {
            }
        }
        return l;
    }
}
