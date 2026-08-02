package com.yandex.messaging.internal;

import defpackage.at2;
import defpackage.g92;
import defpackage.gbb1;
import defpackage.jft;
import defpackage.jqr;
import defpackage.kse;
import defpackage.l7;
import defpackage.mth;
import defpackage.oft;
import defpackage.pvn;
import defpackage.rol0;
import defpackage.sb7;
import defpackage.tpr;
import defpackage.vds0;
import defpackage.zy11;
import java.util.UUID;

/* loaded from: classes15.dex */
public final class a0 extends vds0 {
    public final com.yandex.messaging.internal.authorized.j b;
    public final at2 c;
    public final sb7 d;
    public final kse e;
    public final jft f;

    public a0(com.yandex.messaging.internal.authorized.j jVar, at2 at2Var, sb7 sb7Var, kse kseVar, jft jftVar) {
        super(kseVar.b);
        this.b = jVar;
        this.c = at2Var;
        this.d = sb7Var;
        this.e = kseVar;
        this.f = jftVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        tpr tprVar;
        oft oftVar = (oft) obj;
        String str = oftVar.a;
        boolean z = oftVar.b;
        rol0 rol0Var = new rol0(new GetUserInfoWithErrorUseCase$initialFlow$1(this, str, null));
        kse kseVar = this.e;
        int i = 3;
        try {
            UUID.fromString(str);
            tprVar = kotlinx.coroutines.flow.e.F(new jqr(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(gbb1.d(this.b), new GetUserInfoWithErrorUseCase$networkFlow$$inlined$flatMapLatest$1(null, z, str)), kseVar.f), new GetUserInfoWithErrorUseCase$networkFlow$2(this, str, null), i), kseVar.b);
        } catch (IllegalArgumentException unused) {
            tprVar = pvn.a;
        }
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.D(new kotlinx.coroutines.flow.h(new tpr[]{rol0Var, kotlinx.coroutines.flow.e.K(tprVar, kotlinx.coroutines.flow.e.F(new jqr(kotlinx.coroutines.flow.e.F(new mth(new l7(13, kotlinx.coroutines.flow.e.K(new g92(2, zy11.a), com.yandex.messaging.internal.storage.h.i(this.d, str)), this, str), 6), kseVar.f), new GetUserInfoWithErrorUseCase$dbFlow$2(this, str, null), i), kseVar.b))})));
    }
}
