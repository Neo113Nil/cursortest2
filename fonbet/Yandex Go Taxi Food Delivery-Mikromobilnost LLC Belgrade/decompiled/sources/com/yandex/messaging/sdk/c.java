package com.yandex.messaging.sdk;

import defpackage.m120;
import defpackage.v7p;
import defpackage.xvf0;
import kotlin.jvm.internal.PropertyReference0Impl;

/* loaded from: classes8.dex */
public final class c implements v7p {
    public final xvf0 a;
    public final xvf0 b;

    public c(xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = xvf0Var;
        this.b = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        final m120 m120Var = (m120) this.a.get();
        return new com.yandex.messaging.links.a(new PropertyReference0Impl(m120Var) { // from class: com.yandex.messaging.sdk.SdkModule$provideMessengerLinkParser$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, defpackage.hgx
            public final Object get() {
                return ((m120) this.receiver).a();
            }
        });
    }
}
