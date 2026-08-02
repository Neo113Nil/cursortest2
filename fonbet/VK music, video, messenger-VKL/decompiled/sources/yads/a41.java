package yads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class a41 {
    public final n41 a;
    public final Set b;
    public final g51 c;
    public final Handler d;
    public final AtomicInteger e;
    public final kt1 f;

    public a41(h13 h13Var, Set set, g51 g51Var, Handler handler, AtomicInteger atomicInteger, kt1 kt1Var) {
        this.a = h13Var;
        this.b = set;
        this.c = g51Var;
        this.d = handler;
        this.e = atomicInteger;
        this.f = kt1Var;
    }

    public final void a(Map map) {
        if (this.e.decrementAndGet() == 0) {
            this.c.a(map);
        }
    }

    public final boolean a(x41 x41Var) {
        int a = x41Var.a();
        int b = x41Var.b();
        this.f.getClass();
        return ((float) kt1.a()) >= ((float) ((a * b) * 4)) + 1048576.0f;
    }

    public final void a() {
        final HashMap hashMap = new HashMap();
        for (final x41 x41Var : this.b) {
            final String str = x41Var.c;
            final int i = x41Var.b;
            final int i2 = x41Var.a;
            if (a(x41Var)) {
                this.d.post(new Runnable() { // from class: xsna.fay0
                    @Override // java.lang.Runnable
                    public final void run() {
                        yads.a41.a(yads.a41.this, str, i2, i, hashMap, x41Var);
                    }
                });
            } else {
                a(hashMap);
            }
        }
    }

    public static final void a(a41 a41Var, String str, int i, int i2, Map map, x41 x41Var) {
        a41Var.a.a(str, new z31(a41Var, map, x41Var), i, i2);
    }
}
