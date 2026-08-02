package com.yandex.go.flex.common.descriptors.action;

import androidx.lifecycle.Lifecycle;
import defpackage.dw;
import defpackage.kr;
import defpackage.n6u;
import defpackage.tls;

/* loaded from: classes12.dex */
public final class c implements dw {
    public final Lifecycle a;
    public final tls b;

    public c(Lifecycle lifecycle, tls tlsVar) {
        this.a = lifecycle;
        this.b = tlsVar;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        ru.yandex.taxi.lifecycle.c.d(this.a, Lifecycle.Event.ON_STOP, new GoLoadDocumentActionDescriptorFactoryImpl$ActionHandlerImpl$handle$1(this, n6uVar, null));
    }
}
