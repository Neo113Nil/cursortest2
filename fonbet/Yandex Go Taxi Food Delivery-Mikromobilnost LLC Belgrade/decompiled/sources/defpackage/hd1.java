package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class hd1 {
    public final String a;
    public final zq31 b;
    public final eq31 c;
    public final ArrayBlockingQueue d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final boolean f;

    public hd1(String str, zq31 zq31Var, eq31 eq31Var, int i) {
        this.a = str;
        this.b = zq31Var;
        this.c = eq31Var;
        this.d = new ArrayBlockingQueue(i, false);
        this.f = !r2.isEmpty();
        for (int i2 = 0; i2 < i; i2++) {
            this.c.a.a.offer(new aq31(this, 0));
        }
    }
}
