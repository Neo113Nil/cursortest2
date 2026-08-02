package com.yandex.passport.internal.ui.sloth.ebs;

import com.yandex.passport.common.logger.LogLevel;
import defpackage.hs31;
import defpackage.tig0;
import defpackage.v1m0;
import defpackage.w1m0;
import defpackage.y8f;
import defpackage.yr31;

/* loaded from: classes2.dex */
public final class m0 implements hs31 {
    public final e0 a;
    public final com.yandex.passport.common.ebs.t b;

    public m0(e0 e0Var, com.yandex.passport.common.ebs.t tVar) {
        this.a = e0Var;
        this.b = tVar;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls, y8f y8fVar) {
        v1m0 a = androidx.lifecycle.g0.a(y8fVar);
        w1m0 w1m0Var = a.b;
        BiometricVerificationViewModel$State biometricVerificationViewModel$State = (BiometricVerificationViewModel$State) w1m0Var.a("KEY_EBS_STATE");
        if (biometricVerificationViewModel$State == null) {
            biometricVerificationViewModel$State = new BiometricVerificationViewModel$State(null, 0, null, null, null, false, 63, null);
        }
        boolean z = w1m0Var.a("KEY_EBS_STATE") == null;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, "[EBS]", "BiometricVerificationViewModel::Factory, isInitial = " + z, 8);
        }
        e0 e0Var = this.a;
        com.arkivanov.mvikotlin.main.store.a aVar = e0Var.b;
        return new b1(com.arkivanov.mvikotlin.main.store.a.a(biometricVerificationViewModel$State, new tig0(z ? r.a : n.a), new com.yandex.passport.internal.flags.experiments.h(25, e0Var), d0.a), this.b, a);
    }
}
