package com.yandex.plus.core.network.okhttp.call;

import defpackage.ah7;
import defpackage.d5j0;
import defpackage.hw60;
import defpackage.wls;
import defpackage.yf7;

/* loaded from: classes2.dex */
public final class b implements ah7 {
    public final ah7 a;
    public final hw60 b;

    public b(ah7 ah7Var, hw60 hw60Var) {
        this.a = ah7Var;
        this.b = hw60Var;
    }

    @Override // defpackage.ah7
    public final Object a(Object obj, wls wlsVar) {
        return this.a.a(this.b, new OkHttpNetworkCall$CallFactoryWithNetworkContext$withContext$1(wlsVar, null));
    }

    @Override // defpackage.xf7
    public final yf7 newCall(d5j0 d5j0Var) {
        return this.a.newCall(d5j0Var);
    }
}
