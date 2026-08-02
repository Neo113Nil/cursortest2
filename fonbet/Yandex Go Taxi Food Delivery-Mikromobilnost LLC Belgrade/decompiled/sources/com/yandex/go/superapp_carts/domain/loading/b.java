package com.yandex.go.superapp_carts.domain.loading;

import defpackage.ffx;
import defpackage.tje;
import defpackage.tse;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes14.dex */
public final class b {
    public final tse a;
    public final n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public b(tse tseVar) {
        this.a = tseVar;
    }

    public final void a(boolean z) {
        tje.N(this.a, null, null, new SuperappCartReloadDocumentRepository$postReloadDocumentAction$1(this, z, null), 3);
    }
}
