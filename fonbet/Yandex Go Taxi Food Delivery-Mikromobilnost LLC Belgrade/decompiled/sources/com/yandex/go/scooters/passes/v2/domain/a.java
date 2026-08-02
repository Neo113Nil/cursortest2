package com.yandex.go.scooters.passes.v2.domain;

import com.yandex.go.scooters.passes.data.b;
import com.yandex.go.scooters.passes.v2.e;
import defpackage.g92;
import defpackage.qco0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.tuo0;
import defpackage.ufo0;
import defpackage.uyj;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class a {
    public final tt2 a;
    public final e b;
    public final tuo0 c;
    public final ufo0 d;

    static {
        int i = e.d;
    }

    public a(tt2 tt2Var, e eVar, tuo0 tuo0Var, ufo0 ufo0Var) {
        this.a = tt2Var;
        this.b = eVar;
        this.c = tuo0Var;
        this.d = ufo0Var;
    }

    public final tpr a(qco0 qco0Var) {
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(new g92(2, qco0Var), kotlinx.coroutines.flow.e.d((r0) this.c.b), kotlinx.coroutines.flow.e.d(((b) this.d).b), new ScootersPassesUiStateInteractor$listenToPassesUiState$1(4, this.b, e.class, "mapToPassesUiState", "mapToPassesUiState(Lru/yandex/taxi/scooters/domain/model/ScootersPasses$Packages;Lru/yandex/taxi/scooters/domain/model/Pass;Lcom/yandex/go/scooters/passes/model/ScootersPassesPendingPurchaseStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0)));
        this.a.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }
}
