package com.yandex.messaging.ui.about;

import defpackage.kse;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vds0;
import defpackage.zs20;

/* loaded from: classes15.dex */
public final class b extends vds0 {
    public final zs20 b;

    public b(zs20 zs20Var, kse kseVar) {
        super(kseVar.d);
        this.b = zs20Var;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return new rol0(new DownloadLogsUseCase$run$1(this, null));
    }
}
