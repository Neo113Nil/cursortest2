package com.yandex.go.drive.vertical.interactor;

import com.yandex.go.zone.repository.o;
import defpackage.jqr;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes12.dex */
public final class k {
    public final ru.yandex.taxi.search.suggest.i a;
    public final o b;
    public final com.yandex.go.route.interactor.b c;
    public final com.yandex.go.zone.interactors.b d;
    public final tt2 e;

    public k(tt2 tt2Var, com.yandex.go.route.interactor.b bVar, com.yandex.go.zone.interactors.b bVar2, o oVar, ru.yandex.taxi.search.suggest.i iVar) {
        this.a = iVar;
        this.b = oVar;
        this.c = bVar;
        this.d = bVar2;
        this.e = tt2Var;
    }

    public final Object a(Continuation continuation) {
        tpr k;
        k = this.a.k(RoutePointType.POINT_A, false);
        kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(new jqr(new m0(new j(k), com.yandex.go.coroutines.b.d(this.b.c(), new UpdateSourceAddressInteractor$zoneInfoFlow$$inlined$start$1(this, null)), new UpdateSourceAddressInteractor$startSourceAddressUpdates$2(this, null)), new UpdateSourceAddressInteractor$startSourceAddressUpdates$3(2, this, k.class, "setSourceAddress", "setSourceAddress(Lcom/yandex/go/address/models/ZoneAddress;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), 3), new UpdateSourceAddressInteractor$startSourceAddressUpdates$4(3, null));
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.F(oVar, mdh.b), continuation);
    }
}
