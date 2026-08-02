package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.g5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4850g5 extends AbstractC4824f5 {
    public C4850g5(C4927j5 c4927j5) {
        super(c4927j5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4824f5
    public final boolean b(int i) {
        return i < 113;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4824f5
    public final void c() {
        C4860gf c4860gf = this.a.c;
        try {
            C4814el c4814el = new C4814el(c4860gf, L2.g);
            Long a = c4814el.c.a(C4814el.d);
            if (a != null) {
                c4814el.a(C4814el.d, Long.valueOf(TimeUnit.SECONDS.toMillis(a.longValue())));
            }
            Long a2 = c4814el.c.a(C4814el.e);
            if (a2 != null) {
                c4814el.a(C4814el.e, Long.valueOf(TimeUnit.SECONDS.toMillis(a2.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            C4814el c4814el2 = new C4814el(c4860gf, "foreground");
            Long a3 = c4814el2.c.a(C4814el.d);
            if (a3 != null) {
                c4814el2.a(C4814el.d, Long.valueOf(TimeUnit.SECONDS.toMillis(a3.longValue())));
            }
            Long a4 = c4814el2.c.a(C4814el.e);
            if (a4 != null) {
                c4814el2.a(C4814el.e, Long.valueOf(TimeUnit.SECONDS.toMillis(a4.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
