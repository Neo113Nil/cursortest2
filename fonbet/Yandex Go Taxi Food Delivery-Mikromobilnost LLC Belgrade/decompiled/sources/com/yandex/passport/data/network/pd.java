package com.yandex.passport.data.network;

import com.yandex.passport.common.network.BackendError;
import defpackage.jl40;
import defpackage.w511;

/* loaded from: classes8.dex */
public final class pd implements com.yandex.passport.data.network.core.e {
    @Override // com.yandex.passport.data.network.core.e
    public final Object a(Object obj, com.yandex.passport.common.network.j jVar) {
        if (jVar instanceof com.yandex.passport.common.network.i) {
            nd ndVar = (nd) ((com.yandex.passport.common.network.i) jVar).a;
            return new id(jl40.l(ndVar.b(), "available"), String.valueOf(ndVar.a()));
        }
        if (!(jVar instanceof com.yandex.passport.common.network.g)) {
            w511.b();
            return null;
        }
        com.yandex.passport.common.network.g0 g0Var = (com.yandex.passport.common.network.g0) ((com.yandex.passport.common.network.g) jVar).a;
        if (g0Var.c() == BackendError.DEVICE_MAX_COUNT) {
            return new id(false, String.valueOf(g0Var.d()));
        }
        com.yandex.passport.internal.ui.c.z(g0Var.c());
        throw null;
    }
}
