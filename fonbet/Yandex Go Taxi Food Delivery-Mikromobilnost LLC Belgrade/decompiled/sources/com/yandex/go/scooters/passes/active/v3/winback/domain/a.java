package com.yandex.go.scooters.passes.active.v3.winback.domain;

import com.yandex.go.scooters.passes.active.domain.e;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import defpackage.yfo0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final yfo0 a;
    public final e b;

    public a(yfo0 yfo0Var, e eVar) {
        this.a = yfo0Var;
        this.b = eVar;
    }

    public final Object a(ScootersPassesFromScreen scootersPassesFromScreen, String str, Continuation continuation) {
        return this.b.a(scootersPassesFromScreen, new ScootersApplyWinbackInteractor$applyWinback$2(this, str, null), (ContinuationImpl) continuation);
    }
}
