package com.yandex.go.scooters.domain;

import defpackage.dvn0;
import defpackage.tpr;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class h0 {
    public final dvn0 a;
    public final com.yandex.go.scooters.live.domain.b b;

    public h0(dvn0 dvn0Var, com.yandex.go.scooters.live.domain.b bVar) {
        this.a = dvn0Var;
        this.b = bVar;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(new m0(kotlinx.coroutines.flow.e.d((r0) this.a.b), com.yandex.go.coroutines.b.d(this.b.c(), new ScootersUnifiedPollingShouldRunInteractor$listenShouldRunScootersPolling$$inlined$start$1(Boolean.FALSE, null)), new ScootersUnifiedPollingShouldRunInteractor$listenShouldRunScootersPolling$1(3, null)));
    }
}
