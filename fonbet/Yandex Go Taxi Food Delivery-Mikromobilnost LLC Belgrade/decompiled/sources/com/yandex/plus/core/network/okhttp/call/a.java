package com.yandex.plus.core.network.okhttp.call;

import defpackage.ah7;
import defpackage.dt50;
import defpackage.gt50;
import defpackage.j73;
import defpackage.kjz;
import defpackage.qc20;
import defpackage.sls;
import defpackage.v0k0;
import defpackage.zls;
import java.util.Arrays;
import kotlin.Pair;

/* loaded from: classes2.dex */
public interface a {
    default c o(zls zlsVar) {
        NetworkCallWithContextProvider$Simple$getCallWithContext$1 networkCallWithContextProvider$Simple$getCallWithContext$1 = new NetworkCallWithContextProvider$Simple$getCallWithContext$1(3, null);
        NetworkCallWithContextProvider$getCallWithContext$call$1 networkCallWithContextProvider$getCallWithContext$call$1 = new NetworkCallWithContextProvider$getCallWithContext$call$1(zlsVar, null);
        kjz kjzVar = (kjz) ((qc20) this).a;
        com.yandex.plus.core.network.client.a aVar = new com.yandex.plus.core.network.client.a(gt50.a, networkCallWithContextProvider$getCallWithContext$call$1);
        com.yandex.plus.core.network.client.a aVar2 = new com.yandex.plus.core.network.client.a(dt50.a, networkCallWithContextProvider$Simple$getCallWithContext$1);
        v0k0 v0k0Var = (v0k0) kjzVar.b;
        sls[] slsVarArr = (sls[]) kjzVar.c;
        return new c(new Pair(v0k0Var.e.getValue(), (ah7) v0k0Var.d.getValue()), aVar, aVar2, j73.d0((sls[]) Arrays.copyOf(slsVarArr, slsVarArr.length)), v0k0Var.a, v0k0Var.b);
    }
}
