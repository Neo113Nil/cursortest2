package com.yandex.go.places.impl.ui.search.data.repositories;

import defpackage.ffx;
import defpackage.ike;
import defpackage.jqr;
import defpackage.nwp0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tyo0;
import defpackage.wtp0;
import java.util.Arrays;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class c {
    public final d a;
    public final com.yandex.go.places.impl.analytics.a b;
    public boolean c;
    public nwp0 d;
    public wtp0 e;
    public final n0 f = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public c(d dVar, com.yandex.go.places.impl.analytics.a aVar) {
        this.a = dVar;
        this.b = aVar;
    }

    public final void a(ike ikeVar, tpr tprVar, tls tlsVar, tls tlsVar2, String str) {
        tje.N(ikeVar, null, null, new SearchDebounceRepositories$start$$inlined$safeCollectIn$1(e.X(e.K((tpr[]) Arrays.copyOf(new tpr[]{new jqr(e.r(new jqr(new n(new b(tprVar), new SearchDebounceRepositories$start$userActionFlow$2(this, str, tlsVar, tlsVar2, null)), new SearchDebounceRepositories$start$userActionFlow$3(tlsVar, this, null), 3), new tyo0(12)), new SearchDebounceRepositories$start$userActionFlow$5(this, null), 3), new jqr(this.f, new SearchDebounceRepositories$start$repeatLastActionFlow$1(tlsVar, this, null), 3)}, 2)), new SearchDebounceRepositories$start$$inlined$flatMapLatest$1(tlsVar, this, null)), null), 3);
    }
}
