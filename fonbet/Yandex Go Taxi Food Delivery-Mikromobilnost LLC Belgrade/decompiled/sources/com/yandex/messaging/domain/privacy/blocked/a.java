package com.yandex.messaging.domain.privacy.blocked;

import defpackage.eyj0;
import defpackage.kse;
import defpackage.tpr;
import defpackage.vds0;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class a extends vds0 {
    public final eyj0 b;

    public a(kse kseVar, eyj0 eyj0Var) {
        super(kseVar.b);
        this.b = eyj0Var;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return e.I(e.i(new GetRestrictionUserIdsUseCase$run$$inlined$disposableFlowWrapper$1(null, this)), new GetRestrictionUserIdsUseCase$run$2(2, null));
    }
}
