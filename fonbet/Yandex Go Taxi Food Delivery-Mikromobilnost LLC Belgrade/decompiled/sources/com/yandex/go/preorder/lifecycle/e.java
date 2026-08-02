package com.yandex.go.preorder.lifecycle;

import defpackage.f3g0;
import defpackage.g3g0;
import defpackage.i3y;
import defpackage.pft0;
import defpackage.q3g0;
import defpackage.tse;

/* loaded from: classes13.dex */
public final class e implements pft0 {
    public final com.yandex.go.zone.repository.o a;
    public final q3g0 b;
    public final i3y c;

    public e(com.yandex.go.zone.repository.o oVar, g3g0 g3g0Var, q3g0 q3g0Var) {
        this.a = oVar;
        this.b = q3g0Var;
        this.c = kotlin.a.a(new f3g0(g3g0Var, 1));
    }

    @Override // defpackage.pft0
    public final void d(tse tseVar) {
        com.yandex.go.coroutines.b.g(tseVar, null, null, new PushSettingsFetchByZoneLifecycleListener$onResume$1(this, null), 3);
    }
}
