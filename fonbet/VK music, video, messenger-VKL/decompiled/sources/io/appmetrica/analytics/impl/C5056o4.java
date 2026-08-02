package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.o4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5056o4 {
    public final C5007m7 a;
    public Eb b;
    public Fb c;
    public C4986lc d;

    public C5056o4(File file) {
        this.a = new C5007m7(file);
    }

    public final synchronized Ta a(Context context) {
        Fb fb;
        fb = this.c;
        if (fb == null) {
            fb = new Fb(c(context));
            this.c = fb;
        }
        return fb;
    }

    public final synchronized Ta b(Context context) {
        return c(context);
    }

    public final Ta c(Context context) {
        C4986lc c4986lc;
        Eb eb = this.b;
        if (eb != null) {
            return eb;
        }
        synchronized (this) {
            c4986lc = this.d;
            if (c4986lc == null) {
                C5007m7 c5007m7 = this.a;
                String a = new C4981l7(c5007m7.a, c5007m7.b, true).a(context, new Z3());
                Y6 y6 = I5.c;
                y6.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("preferences", F5.a);
                C5152rn c5152rn = y6.c;
                C4904i7 c4904i7 = y6.a;
                C4800e7 c4800e7 = c4904i7.c;
                C4826f7 c4826f7 = c4904i7.d;
                Ba ba = new Ba(false);
                ba.a(112, new C4694a4());
                C5230un c5230un = new C5230un("service database", hashMap);
                c5152rn.getClass();
                c4986lc = new C4986lc(context, a, new C4958ka(a), new C5178sn(c4800e7, c4826f7, ba, c5230un));
                this.d = c4986lc;
            }
        }
        Eb eb2 = new Eb(c4986lc);
        this.b = eb2;
        return eb2;
    }
}
