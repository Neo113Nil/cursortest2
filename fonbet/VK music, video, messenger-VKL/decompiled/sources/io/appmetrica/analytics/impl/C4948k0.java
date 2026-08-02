package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4948k0 {
    public final HashMap a = new HashMap();

    public final synchronized C4922j0 a(C4747c5 c4747c5, PublicLogger publicLogger, C4860gf c4860gf) {
        C4922j0 c4922j0;
        c4922j0 = (C4922j0) this.a.get(c4747c5.toString());
        if (c4922j0 == null) {
            C4897i0 d = c4860gf.d();
            c4922j0 = new C4922j0(d.a, d.b, new Bl(publicLogger, "[App Environment]"));
            this.a.put(c4747c5.toString(), c4922j0);
        }
        return c4922j0;
    }

    public final synchronized void a(C4897i0 c4897i0, C4860gf c4860gf) {
        c4860gf.a(c4897i0).b();
    }
}
