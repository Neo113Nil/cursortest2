package com.yandex.go.scooters.passes.active.domain;

import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import defpackage.cjm0;
import defpackage.wqm0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class f {
    public final e a;
    public final cjm0 b;

    public f(e eVar, cjm0 cjm0Var) {
        this.a = eVar;
        this.b = cjm0Var;
    }

    public final Object a(ScootersPassesFromScreen scootersPassesFromScreen, String str, boolean z, wqm0 wqm0Var, ContinuationImpl continuationImpl) {
        return this.a.a(scootersPassesFromScreen, new ScootersRenewPassInteractor$updateRenew$2(this, str, z, wqm0Var, null), continuationImpl);
    }
}
