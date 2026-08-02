package com.ybsdk.core.utils.coroutines;

import defpackage.dke;
import defpackage.k5c;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tls;
import defpackage.wls;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class a {
    public final k5c a;
    public final DebounceRequestRunner$PreviousRequestStrategy b;
    public pzt0 c;
    public final AtomicLong d = new AtomicLong(0);

    public a(k5c k5cVar, DebounceRequestRunner$PreviousRequestStrategy debounceRequestRunner$PreviousRequestStrategy) {
        this.a = k5cVar;
        this.b = debounceRequestRunner$PreviousRequestStrategy;
    }

    public final long a() {
        long incrementAndGet = this.d.incrementAndGet();
        if (this.b == DebounceRequestRunner$PreviousRequestStrategy.CancelPrevious) {
            pzt0 pzt0Var = this.c;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.c = null;
        }
        return incrementAndGet;
    }

    public final void b(long j, tls tlsVar, wls wlsVar) {
        pzt0 N = tje.N(this.a, null, null, new DebounceRequestRunner$submit$newJob$1(j, a(), this, tlsVar, wlsVar, null), 3);
        this.c = N;
        N.w(new dke(16, this, N));
    }
}
