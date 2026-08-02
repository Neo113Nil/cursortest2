package com.yandex.messaging.internal;

import defpackage.k020;
import defpackage.kse;
import defpackage.mth;
import defpackage.n1f;
import defpackage.rol0;
import defpackage.sb7;
import defpackage.tpr;
import defpackage.vds0;

/* loaded from: classes15.dex */
public final class v extends vds0 {
    public final k020 b;
    public final sb7 c;
    public final kse d;

    public v(k020 k020Var, sb7 sb7Var, kse kseVar) {
        super(kseVar.b);
        this.b = k020Var;
        this.c = sb7Var;
        this.d = kseVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return new mth(kotlinx.coroutines.flow.e.D(new kotlinx.coroutines.flow.h(new tpr[]{new rol0(new GetPersonalInfoUseCase$initialFlow$1(this, null)), kotlinx.coroutines.flow.e.F(new n1f(20, com.yandex.messaging.internal.storage.h.f(this.c), this), this.d.e)})), 6);
    }
}
