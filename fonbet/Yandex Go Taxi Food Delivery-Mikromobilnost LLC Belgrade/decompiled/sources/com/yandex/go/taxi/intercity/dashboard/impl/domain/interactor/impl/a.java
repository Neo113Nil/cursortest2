package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl;

import com.yandex.go.address.models.ZoneAddress;
import defpackage.ftx;
import defpackage.gtc;
import defpackage.ike;
import defpackage.rqt;
import defpackage.tje;
import kotlinx.coroutines.flow.o;

/* loaded from: classes14.dex */
public final class a {
    public final gtc a;
    public final ftx b;
    public final com.yandex.go.route.interactor.b c;
    public final rqt d;

    public a(gtc gtcVar, ftx ftxVar, com.yandex.go.route.interactor.b bVar, rqt rqtVar) {
        this.a = gtcVar;
        this.b = ftxVar;
        this.c = bVar;
        this.d = rqtVar;
    }

    public final void a(ike ikeVar, com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.c cVar) {
        ZoneAddress zoneAddress = this.c.c().a;
        if ((zoneAddress != null ? zoneAddress.b : null) != null) {
            cVar.invoke();
        } else {
            tje.N(ikeVar, null, null, new EnsureUserHasSourceAddressInteractor$ensureUserHasAddressAndZone$1(this, com.yandex.go.coroutines.b.h(ikeVar, new o(ru.yandex.taxi.preorder.source.domain.h.a((ru.yandex.taxi.preorder.source.domain.h) this.d.get()), com.yandex.go.coroutines.b.b())), tje.N(ikeVar, null, null, new EnsureUserHasSourceAddressInteractor$ensureUserHasAddressAndZone$listenToAddressJob$1(this, null), 3), cVar, null), 3);
        }
    }
}
