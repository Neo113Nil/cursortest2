package com.yandex.go.taxi.tariffs.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.bms;
import defpackage.ce61;
import defpackage.d0l0;
import defpackage.dk31;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/yandex/go/zone/model/Zone;", "zone", "Ldk31;", "verticalsInfo", "Ld0l0;", "route", "Lce61;", "<anonymous>", "(Lcom/yandex/go/zone/model/Zone;Ldk31;Ld0l0;)Lce61;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.interactor.RefreshTariffsInfoInteractor$getZoneWithUpdateTariffsFlow$1", f = "RefreshTariffsInfoInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class RefreshTariffsInfoInteractor$getZoneWithUpdateTariffsFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RefreshTariffsInfoInteractor$getZoneWithUpdateTariffsFlow$1 refreshTariffsInfoInteractor$getZoneWithUpdateTariffsFlow$1 = new RefreshTariffsInfoInteractor$getZoneWithUpdateTariffsFlow$1(4, (Continuation) obj4);
        refreshTariffsInfoInteractor$getZoneWithUpdateTariffsFlow$1.L$0 = (Zone) obj;
        refreshTariffsInfoInteractor$getZoneWithUpdateTariffsFlow$1.L$1 = (dk31) obj2;
        refreshTariffsInfoInteractor$getZoneWithUpdateTariffsFlow$1.L$2 = (d0l0) obj3;
        return refreshTariffsInfoInteractor$getZoneWithUpdateTariffsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Address address;
        Zone zone = (Zone) this.L$0;
        dk31 dk31Var = (dk31) this.L$1;
        d0l0 d0l0Var = (d0l0) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ZoneAddress zoneAddress = d0l0Var.a;
        Zone zone2 = zoneAddress != null ? zoneAddress.b : null;
        if (zoneAddress != null && (address = zoneAddress.a) != null) {
            str = address.getZoneName();
        }
        if (!d0l0Var.c() && zone2 != null && zone2.a.length() != 0 && !jl40.l(str, zone.a)) {
            zone = zone2;
        }
        return new ce61(zone, !zone.i(dk31Var.c));
    }
}
