package com.ybsdk.utils.poller;

import defpackage.bvf0;
import defpackage.tje;
import defpackage.wls;
import defpackage.yyd0;
import kotlin.coroutines.Continuation;

/* loaded from: classes9.dex */
public final class f implements yyd0 {
    @Override // defpackage.yyd0
    public final int a() {
        return 1;
    }

    @Override // defpackage.yyd0
    public final Object b(PollerScopeType pollerScopeType, wls wlsVar, Continuation continuation) {
        return tje.N(bvf0.a(continuation.get_context()), null, null, new SimplePollerLauncher$launch$2(wlsVar, null), 3);
    }
}
