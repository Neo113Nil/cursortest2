package com.yandex.go.preorder.lifecycle;

import defpackage.cyx;
import defpackage.pft0;
import defpackage.tse;

/* loaded from: classes13.dex */
public final class c implements pft0 {
    public final com.yandex.go.navigation.screen.c a;
    public final cyx b;

    public c(com.yandex.go.navigation.screen.c cVar, cyx cyxVar) {
        this.a = cVar;
        this.b = cyxVar;
    }

    @Override // defpackage.pft0
    public final void d(tse tseVar) {
        com.yandex.go.coroutines.b.g(tseVar, null, null, new CurrentScreenRepositoryLifecycleListener$onResume$1(this, null), 3);
    }
}
