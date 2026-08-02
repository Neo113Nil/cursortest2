package com.yandex.mob;

import defpackage.kl20;
import defpackage.sls;

/* loaded from: classes8.dex */
public final class c implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl20 b;

    public /* synthetic */ c(kl20 kl20Var, int i) {
        this.a = i;
        this.b = kl20Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        kl20 kl20Var = this.b;
        switch (i) {
            case 0:
                d dVar = (d) kl20Var;
                return new com.yandex.mob.domain.n((com.yandex.mob.datastore.d) dVar.G.getValue(), new MobAndroidMainProcess$mobIdProvider$2$1(dVar, null), false);
            case 1:
                return new com.yandex.mob.domain.o(new com.yandex.mob.domain.n((com.yandex.mob.datastore.d) ((d) kl20Var).G.getValue(), new MobAndroidMainProcess$headersComposer$2$1(1, null), true));
            default:
                return new com.yandex.mob.domain.o(new com.yandex.mob.domain.n((com.yandex.mob.datastore.d) ((b) kl20Var).g.getValue(), new MobAndroidChildProcess$headersComposer$2$1(1, null), true));
        }
    }
}
