package com.yandex.passport.data.network;

import defpackage.kvj0;
import defpackage.ooc;
import defpackage.zcx;

/* loaded from: classes8.dex */
public final class x2 implements com.yandex.passport.data.network.core.d {
    @Override // com.yandex.passport.data.network.core.d
    public final com.yandex.passport.common.network.j e(kvj0 kvj0Var) {
        try {
            String b = com.yandex.passport.internal.util.p.b(kvj0Var);
            zcx zcxVar = com.yandex.passport.data.network.core.m.a;
            zcxVar.getClass();
            com.yandex.passport.common.network.i iVar = new com.yandex.passport.common.network.i(new com.yandex.passport.data.models.d(b));
            kvj0Var.close();
            return iVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(kvj0Var, th);
                throw th2;
            }
        }
    }
}
