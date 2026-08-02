package com.yandex.go.preorder.zone;

import com.yandex.go.zone.repository.o;
import defpackage.bk1;
import defpackage.jd;
import defpackage.tt2;
import defpackage.znj;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.e;

/* loaded from: classes13.dex */
public final class d {
    public final o a;
    public final com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c b;
    public final znj c;
    public final bk1 d;
    public final ru.yandex.taxi.launch.c e;
    public final com.yandex.go.route.interactor.c f;
    public final com.yandex.go.zone.interactors.b g;
    public final com.yandex.go.route.interactor.b h;
    public final jd i;
    public final tt2 j;

    public d(o oVar, com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c cVar, znj znjVar, bk1 bk1Var, ru.yandex.taxi.launch.c cVar2, com.yandex.go.route.interactor.c cVar3, com.yandex.go.zone.interactors.b bVar, com.yandex.go.route.interactor.b bVar2, jd jdVar, tt2 tt2Var) {
        this.a = oVar;
        this.b = cVar;
        this.c = znjVar;
        this.d = bk1Var;
        this.e = cVar2;
        this.f = cVar3;
        this.g = bVar;
        this.h = bVar2;
        this.i = jdVar;
        this.j = tt2Var;
    }

    public final Object a(Continuation continuation) {
        return new kotlinx.coroutines.flow.o(new b(e.Y(e.t(this.e.b()), new PreorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$2(this, null)), this), new PreorderZoneChangesInteractor$updateZoneOnLaunchInfoChanges$$inlined$safeCollect$1(3, null)).collect(new c(this), continuation);
    }
}
