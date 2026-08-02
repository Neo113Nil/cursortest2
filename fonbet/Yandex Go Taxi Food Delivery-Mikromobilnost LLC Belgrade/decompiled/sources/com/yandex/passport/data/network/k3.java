package com.yandex.passport.data.network;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.social.esia.EsiaBindViewModel$InternalState;
import com.yandex.passport.internal.ui.sloth.ebs.BiometricVerificationViewModel$State;
import com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity;
import defpackage.sls;
import defpackage.zcx;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class k3 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public k3(com.yandex.passport.internal.network.l lVar, Environment environment, Long l) {
        this.a = 1;
        this.b = environment;
        this.c = l;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zcx zcxVar = (zcx) ((com.yandex.passport.common.network.u) obj2).b;
                zcxVar.getClass();
                return zcxVar.c(obj, j3.Companion.serializer());
            case 1:
                return new com.yandex.passport.common.url.b(com.yandex.passport.internal.network.l.n((Environment) obj2, (Long) obj, "/am"));
            case 2:
                EsiaBindViewModel$InternalState esiaBindViewModel$InternalState = (EsiaBindViewModel$InternalState) ((com.arkivanov.mvikotlin.extensions.coroutines.a) obj2).getValue();
                ((com.yandex.passport.internal.social.esia.i0) obj).c.a("KEY_STATE", esiaBindViewModel$InternalState);
                return esiaBindViewModel$InternalState.getUiState();
            case 3:
                BiometricVerificationViewModel$State biometricVerificationViewModel$State = (BiometricVerificationViewModel$State) ((com.arkivanov.mvikotlin.extensions.coroutines.a) obj2).getValue();
                ((com.yandex.passport.internal.ui.sloth.ebs.b1) obj).w.a("KEY_EBS_STATE", biometricVerificationViewModel$State);
                return biometricVerificationViewModel$State;
            default:
                ((UserMenuActivity) obj2).processError((com.yandex.passport.sloth.m) ((com.yandex.passport.sloth.a1) obj));
                return zy11.a;
        }
    }

    public /* synthetic */ k3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
