package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.x2;

/* loaded from: classes8.dex */
public final class m implements w0 {
    public final com.yandex.passport.internal.usecase.vpn.b a;

    public m(com.yandex.passport.internal.usecase.vpn.b bVar) {
        this.a = bVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.g(new ExecuteCheckVpnStatusPerformer$performMethod$1((com.yandex.passport.internal.methods.n0) x2Var, this, null));
    }
}
