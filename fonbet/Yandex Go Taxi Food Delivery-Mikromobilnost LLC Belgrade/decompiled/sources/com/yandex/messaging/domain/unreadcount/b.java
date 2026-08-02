package com.yandex.messaging.domain.unreadcount;

import defpackage.k020;
import defpackage.kat;
import defpackage.kse;
import defpackage.mth;
import defpackage.rol0;
import defpackage.sb7;
import defpackage.tpr;
import defpackage.vds0;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class b extends vds0 {
    public final k020 b;
    public final sb7 c;
    public final kse d;

    public b(k020 k020Var, sb7 sb7Var, kse kseVar) {
        super(kseVar.b);
        this.b = k020Var;
        this.c = sb7Var;
        this.d = kseVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return e.t(new mth(new rol0(new GetOrgUnreadChatsInfoUseCase$run$1((kat) obj, this, null)), 6));
    }
}
