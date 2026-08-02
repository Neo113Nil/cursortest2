package com.yandex.passport.data.network;

import defpackage.w511;

/* loaded from: classes8.dex */
public final class f7 implements com.yandex.passport.data.network.core.e {
    @Override // com.yandex.passport.data.network.core.e
    public final Object a(Object obj, com.yandex.passport.common.network.j jVar) {
        if (jVar instanceof com.yandex.passport.common.network.i) {
            return (e7) ((com.yandex.passport.common.network.i) jVar).a;
        }
        if (jVar instanceof com.yandex.passport.common.network.g) {
            com.yandex.passport.internal.ui.c.z(((y6) ((com.yandex.passport.common.network.g) jVar).a).b());
            throw null;
        }
        w511.b();
        return null;
    }
}
