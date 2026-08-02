package com.yandex.messaging.domain.unreadcount;

import com.yandex.messaging.ChatRequest;
import defpackage.k020;
import defpackage.kse;
import defpackage.mth;
import defpackage.rol0;
import defpackage.sb7;
import defpackage.tpr;
import defpackage.vds0;
import defpackage.wet;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class d extends vds0 {
    public final k020 b;
    public final sb7 c;
    public final kse d;

    public d(k020 k020Var, sb7 sb7Var, kse kseVar) {
        super(kseVar.b);
        this.b = k020Var;
        this.c = sb7Var;
        this.d = kseVar;
    }

    public static tpr d(d dVar, Long l, ChatRequest chatRequest, int i) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            chatRequest = null;
        }
        boolean z = (i & 4) != 0;
        dVar.getClass();
        return dVar.a(new wet(l, chatRequest, z));
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return e.t(new mth(new rol0(new GetUnreadCountUseCase$run$1((wet) obj, this, null)), 6));
    }
}
