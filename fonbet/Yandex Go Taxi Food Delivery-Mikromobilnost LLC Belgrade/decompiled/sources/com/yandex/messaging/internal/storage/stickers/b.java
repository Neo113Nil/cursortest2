package com.yandex.messaging.internal.storage.stickers;

import com.yandex.messaging.extension.flow.c;
import defpackage.kse;
import defpackage.mth;
import defpackage.n1f;
import defpackage.odu0;
import defpackage.rol0;
import defpackage.tpr;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.h;

/* loaded from: classes15.dex */
public final class b {
    public final odu0 a;
    public final kse b;

    public b(odu0 odu0Var, kse kseVar) {
        this.a = odu0Var;
        this.b = kseVar;
    }

    public final tpr a(Object obj) {
        return c.a(e.D(new h(new tpr[]{new mth(new rol0(new GetStickersUseCase$initialFlow$1(this, null)), 6), e.F(new n1f(22, e.i(new GetStickersUseCase$stickerUpdateFlow$1(this.a, null)), this), this.b.e)})));
    }
}
