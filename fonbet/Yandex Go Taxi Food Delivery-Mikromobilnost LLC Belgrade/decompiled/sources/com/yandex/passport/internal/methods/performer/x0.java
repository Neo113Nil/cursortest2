package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.methods.z1;

/* loaded from: classes8.dex */
public final class x0 implements w0 {
    public final com.yandex.passport.internal.upgrader.d a;

    public x0(com.yandex.passport.internal.upgrader.d dVar) {
        this.a = dVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.h(new OnAccountUpgradeDeclinedPerformer$performMethod$1((z1) x2Var, this, null));
    }
}
