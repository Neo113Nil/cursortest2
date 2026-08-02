package com.yandex.passport.data.network;

import defpackage.tls;
import kotlin.Result;

/* loaded from: classes15.dex */
public final /* synthetic */ class s0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.yandex.passport.data.network.core.a b;
    public final /* synthetic */ com.yandex.passport.data.network.core.q c;

    public /* synthetic */ s0(com.yandex.passport.data.network.core.a aVar, com.yandex.passport.data.network.core.q qVar, int i) {
        this.a = i;
        this.b = aVar;
        this.c = qVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        com.yandex.passport.data.network.core.q qVar = this.c;
        com.yandex.passport.data.network.core.a aVar = this.b;
        switch (i) {
            case 0:
                return new Result(com.yandex.passport.common.util.a.h(new CompleteStatusRequest$run$2$1((y0) aVar, (t0) qVar, null)));
            case 1:
                return new Result(com.yandex.passport.common.util.a.h(new GetUserInfoRequest$run$2$1((da) aVar, (v9) qVar, null)));
            case 2:
                return new Result(com.yandex.passport.common.util.a.h(new SendAuthToTrackRequest$run$2$1((wb) aVar, (rb) qVar, null)));
            default:
                return new Result(com.yandex.passport.common.util.a.h(new TryAddPlusDeviceRequest$run$2$1((qd) aVar, (jd) qVar, null)));
        }
    }
}
