package com.yandex.passport.data.network;

import defpackage.brg;
import defpackage.kvj0;
import defpackage.ooc;
import defpackage.zcx;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class i2 implements com.yandex.passport.data.network.core.d {
    @Override // com.yandex.passport.data.network.core.d
    public final com.yandex.passport.common.network.j e(kvj0 kvj0Var) {
        com.yandex.passport.common.network.j gVar;
        try {
            String a = kvj0Var.y.a("Date");
            Date a2 = a != null ? brg.a(a) : null;
            String valueOf = a2 != null ? String.valueOf(a2.getTime() / 1000) : null;
            String b = com.yandex.passport.internal.util.p.b(kvj0Var);
            zcx zcxVar = com.yandex.passport.data.network.core.m.a;
            zcxVar.getClass();
            com.yandex.passport.common.network.j jVar = (com.yandex.passport.common.network.j) zcxVar.b(com.yandex.passport.common.network.j.Companion.serializer(l2.Companion.serializer(), com.yandex.passport.common.network.x.Companion.serializer()), b);
            if (jVar instanceof com.yandex.passport.common.network.i) {
                gVar = new com.yandex.passport.common.network.i(new com.yandex.passport.data.models.h((l2) ((com.yandex.passport.common.network.i) jVar).a, valueOf));
            } else {
                if (!(jVar instanceof com.yandex.passport.common.network.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar = new com.yandex.passport.common.network.g(((com.yandex.passport.common.network.g) jVar).a);
            }
            kvj0Var.close();
            return gVar;
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
