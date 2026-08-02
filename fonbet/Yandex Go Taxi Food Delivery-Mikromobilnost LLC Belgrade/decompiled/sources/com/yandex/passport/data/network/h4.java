package com.yandex.passport.data.network;

import com.yandex.passport.data.exceptions.FailedResponseException;
import defpackage.jl40;
import defpackage.w511;

/* loaded from: classes8.dex */
public final class h4 implements com.yandex.passport.data.network.core.e {
    @Override // com.yandex.passport.data.network.core.e
    public final Object a(Object obj, com.yandex.passport.common.network.j jVar) {
        if (jVar instanceof com.yandex.passport.common.network.i) {
            return (g4) ((com.yandex.passport.common.network.i) jVar).a;
        }
        if (!(jVar instanceof com.yandex.passport.common.network.g)) {
            w511.b();
            return null;
        }
        com.yandex.passport.common.network.g0 g0Var = (com.yandex.passport.common.network.g0) ((com.yandex.passport.common.network.g) jVar).a;
        if (jl40.l(g0Var.b(), "forbidden account type")) {
            throw new FailedResponseException("forbidden account type");
        }
        com.yandex.passport.internal.ui.c.z(g0Var.c());
        throw null;
    }
}
