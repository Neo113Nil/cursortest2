package com.yandex.go.superapp.impl.signals;

import defpackage.gwb0;
import defpackage.h1p;
import defpackage.tx2;
import defpackage.ux2;
import defpackage.vx2;
import defpackage.xx8;
import defpackage.yvf0;

/* loaded from: classes14.dex */
public final class e extends vx2 {
    public final yvf0 b;

    public e(gwb0 gwb0Var) {
        super(0);
        this.b = gwb0Var;
    }

    @Override // defpackage.vx2
    public final tx2 a(h1p h1pVar) {
        return new ux2("getPermissions", new xx8(13, this, GetPermissionsSignalFactory$Params.Companion.serializer(), new GetPermissionsSignalFactory$create$1(2, this, e.class, "handle", "handle(Lcom/yandex/go/superapp/impl/signals/GetPermissionsSignalFactory$Params;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0)));
    }
}
