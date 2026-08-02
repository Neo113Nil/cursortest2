package com.yandex.messaging.domain.folders;

import com.yandex.messaging.MessengerEnvironment;
import defpackage.kse;
import defpackage.pxr;
import defpackage.tpr;
import defpackage.u4r;
import defpackage.vds0;
import defpackage.w5t;
import defpackage.zy11;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes15.dex */
public final class g extends vds0 {
    public final com.yandex.messaging.internal.backendconfig.a b;
    public final u4r c;
    public final MessengerEnvironment d;
    public final pxr e;
    public final w5t f;

    public g(com.yandex.messaging.internal.backendconfig.a aVar, u4r u4rVar, MessengerEnvironment messengerEnvironment, pxr pxrVar, w5t w5tVar, kse kseVar) {
        super(kseVar.e);
        this.b = aVar;
        this.c = u4rVar;
        this.d = messengerEnvironment;
        this.e = pxrVar;
        this.f = w5tVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return new m0(kotlinx.coroutines.flow.e.d(this.b.b), this.f.a(zy11.a), new GetFolderAllFiltersUseCase$run$1(this, null));
    }
}
