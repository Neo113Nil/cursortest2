package com.yandex.go.quark.impl.dependencies;

import defpackage.sxo;
import defpackage.tje;
import defpackage.tse;
import defpackage.v7j0;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class b {
    public final tse a;
    public final v7j0 b;

    public b(tse tseVar, v7j0 v7j0Var) {
        this.a = tseVar;
        this.b = v7j0Var;
    }

    public final void a(ArrayList arrayList, sxo sxoVar) {
        tje.N(this.a, null, null, new QuarkGoPermissionsInteractor$requestPermissionList$1(arrayList, sxoVar, this, null), 3);
    }
}
