package com.yandex.go.payments.shared;

import androidx.lifecycle.Lifecycle;
import defpackage.gci0;
import defpackage.h3y;
import defpackage.lz60;
import defpackage.mhf;
import defpackage.mth;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes8.dex */
public final class w implements lz60 {
    public final h3y a;
    public final h3y b;
    public final mhf c;
    public final ru.yandex.taxi.zalogin.k d;
    public final tse e;
    public final Lifecycle f;

    public w(h3y h3yVar, h3y h3yVar2, mhf mhfVar, ru.yandex.taxi.zalogin.k kVar, tse tseVar, Lifecycle lifecycle) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = mhfVar;
        this.d = kVar;
        this.e = tseVar;
        this.f = lifecycle;
    }

    @Override // defpackage.lz60
    public final void g() {
        gci0 c = this.f.c();
        mhf mhfVar = this.c;
        tje.N(this.e, null, null, new SharedPaymentInvitationControllerStateUpdater$onLargestContentfulPaint$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.m(c, new mth(mhfVar.b, 6), mhfVar.a.c(), this.d.j, new SharedPaymentInvitationControllerStateUpdater$canShowNotificationFlow$1(this, null)), null, this), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "SharedPaymentInvitationControllerStateUpdater";
    }
}
