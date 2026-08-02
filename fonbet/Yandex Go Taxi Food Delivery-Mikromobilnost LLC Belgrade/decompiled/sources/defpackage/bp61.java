package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes7.dex */
public final class bp61 implements zl61 {
    public final long a;
    public final no71 b;
    public final int c;
    public final bh81 d;
    public final ql61 e;
    public volatile Object f;

    public bp61(u871 u871Var, Uri uri, int i, ql61 ql61Var) {
        Map map = Collections.EMPTY_MAP;
        cha1.b(uri, "The uri must be set.");
        no71 no71Var = new no71(uri, 0L, null, map, 0L, -1L, null, 1);
        this.d = new bh81(u871Var);
        this.b = no71Var;
        this.c = i;
        this.e = ql61Var;
        this.a = nl81.a.getAndIncrement();
    }

    @Override // defpackage.zl61
    public final void a() {
        this.d.b = 0L;
        ef71 ef71Var = new ef71(this.d, this.b);
        try {
            ef71Var.a.Q(ef71Var.b);
            ef71Var.w = true;
            Uri d = this.d.a.d();
            d.getClass();
            this.f = this.e.a(d, ef71Var);
        } finally {
            rf71.m(ef71Var);
        }
    }

    @Override // defpackage.zl61
    public final void b() {
    }
}
