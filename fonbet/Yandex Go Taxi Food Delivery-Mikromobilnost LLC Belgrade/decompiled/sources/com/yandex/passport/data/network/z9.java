package com.yandex.passport.data.network;

import com.yandex.passport.data.exceptions.NotModifiedException;
import defpackage.kvj0;
import defpackage.w511;
import defpackage.zcx;

/* loaded from: classes8.dex */
public final class z9 implements com.yandex.passport.data.network.core.d {
    public final com.yandex.passport.common.a a;

    public z9(com.yandex.passport.common.a aVar) {
        this.a = aVar;
    }

    @Override // com.yandex.passport.data.network.core.d
    public final com.yandex.passport.common.network.j e(kvj0 kvj0Var) {
        if (kvj0Var.w == 304) {
            throw NotModifiedException.a;
        }
        String b = com.yandex.passport.internal.util.p.b(kvj0Var);
        zcx zcxVar = com.yandex.passport.data.network.core.m.a;
        zcxVar.getClass();
        com.yandex.passport.common.network.j jVar = (com.yandex.passport.common.network.j) zcxVar.b(com.yandex.passport.common.network.j.Companion.serializer(GetUserInfoRequest$Response.Companion.serializer(), com.yandex.passport.common.network.x.Companion.serializer()), b);
        if (!(jVar instanceof com.yandex.passport.common.network.i)) {
            if (jVar instanceof com.yandex.passport.common.network.g) {
                return new com.yandex.passport.common.network.g(((com.yandex.passport.common.network.g) jVar).a);
            }
            w511.b();
            return null;
        }
        GetUserInfoRequest$Response getUserInfoRequest$Response = (GetUserInfoRequest$Response) ((com.yandex.passport.common.network.i) jVar).a;
        String str = null;
        String a = kvj0Var.y.a("ETag");
        if (a != null) {
            str = a;
        }
        this.a.getClass();
        return new com.yandex.passport.common.network.i(new aa(b, str, com.yandex.passport.common.a.a(), getUserInfoRequest$Response));
    }
}
