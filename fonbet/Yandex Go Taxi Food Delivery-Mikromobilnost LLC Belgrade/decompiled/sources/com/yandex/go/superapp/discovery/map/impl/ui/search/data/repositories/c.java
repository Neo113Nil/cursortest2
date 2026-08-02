package com.yandex.go.superapp.discovery.map.impl.ui.search.data.repositories;

import defpackage.ffx;
import defpackage.ike;
import defpackage.jqr;
import defpackage.omu0;
import defpackage.stv0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.uxv0;
import defpackage.ywv0;
import java.util.Arrays;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes14.dex */
public final class c {
    public final d a;
    public final stv0 b;
    public boolean c;
    public uxv0 d;
    public ywv0 e;
    public final n0 f = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public c(d dVar, stv0 stv0Var) {
        this.a = dVar;
        this.b = stv0Var;
    }

    public final void a(ike ikeVar, tpr tprVar, tls tlsVar, tls tlsVar2, String str) {
        tje.N(ikeVar, null, null, new SuperAppDiscoveryMapSearchDebounceRepositories$start$$inlined$safeCollectIn$1(e.X(e.K((tpr[]) Arrays.copyOf(new tpr[]{new jqr(e.r(new jqr(new n(new b(tprVar), new SuperAppDiscoveryMapSearchDebounceRepositories$start$userActionFlow$2(this, str, tlsVar, tlsVar2, null)), new SuperAppDiscoveryMapSearchDebounceRepositories$start$userActionFlow$3(tlsVar, this, null), 3), new omu0(28)), new SuperAppDiscoveryMapSearchDebounceRepositories$start$userActionFlow$5(this, null), 3), new jqr(this.f, new SuperAppDiscoveryMapSearchDebounceRepositories$start$repeatLastActionFlow$1(tlsVar, this, null), 3)}, 2)), new SuperAppDiscoveryMapSearchDebounceRepositories$start$$inlined$flatMapLatest$1(tlsVar, this, null)), null), 3);
    }
}
