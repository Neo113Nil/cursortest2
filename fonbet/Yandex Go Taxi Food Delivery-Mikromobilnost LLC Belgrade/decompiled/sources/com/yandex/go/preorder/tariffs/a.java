package com.yandex.go.preorder.tariffs;

import com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.zone.model.Zone;
import defpackage.c4r0;
import defpackage.ck31;
import defpackage.dqe0;
import defpackage.h3y;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.am.g;

/* loaded from: classes13.dex */
public final class a {
    public final dqe0 a;
    public final h3y b;
    public final c4r0 c;
    public final com.yandex.go.taxi.tariffs.interactor.b d;
    public final ck31 e;
    public final g f;
    public final c g;
    public final tt2 h;

    public a(dqe0 dqe0Var, h3y h3yVar, c4r0 c4r0Var, com.yandex.go.taxi.tariffs.interactor.b bVar, ck31 ck31Var, g gVar, c cVar, tt2 tt2Var) {
        this.a = dqe0Var;
        this.b = h3yVar;
        this.c = c4r0Var;
        this.d = bVar;
        this.e = ck31Var;
        this.f = gVar;
        this.g = cVar;
        this.h = tt2Var;
    }

    public final Object a(Zone zone, SuspendLambda suspendLambda) {
        this.h.getClass();
        Object k0 = tje.k0(uyj.a, new CompoundTariffsInfoInteractor$actualizePromoCode$2(this, zone, null), suspendLambda);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object b(Zone zone, Continuation continuation) {
        zy11 zy11Var = zy11.a;
        if (zone != null && zone.h()) {
            Preorder preorder = this.a.a;
            this.h.getClass();
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(mdh.b, new CompoundTariffsInfoInteractor$updateCompoundTariffsInfo$2(this, zone, preorder, null), continuation);
            if (k0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return k0;
            }
        }
        return zy11Var;
    }
}
