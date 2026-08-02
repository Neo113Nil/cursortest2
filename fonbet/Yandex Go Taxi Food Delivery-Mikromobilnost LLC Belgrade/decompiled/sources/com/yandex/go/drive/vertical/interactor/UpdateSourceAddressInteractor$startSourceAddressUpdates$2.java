package com.yandex.go.drive.vertical.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv0;", "addressInfo", "Lcom/yandex/go/zone/model/Zone;", "currentZone", "Lcom/yandex/go/address/models/ZoneAddress;", "<anonymous>", "(Lpv0;Lcom/yandex/go/zone/model/Zone;)Lcom/yandex/go/address/models/ZoneAddress;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.vertical.interactor.UpdateSourceAddressInteractor$startSourceAddressUpdates$2", f = "UpdateSourceAddressInteractor.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class UpdateSourceAddressInteractor$startSourceAddressUpdates$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateSourceAddressInteractor$startSourceAddressUpdates$2(k kVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = kVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UpdateSourceAddressInteractor$startSourceAddressUpdates$2 updateSourceAddressInteractor$startSourceAddressUpdates$2 = new UpdateSourceAddressInteractor$startSourceAddressUpdates$2(this.this$0, (Continuation) obj3);
        updateSourceAddressInteractor$startSourceAddressUpdates$2.L$0 = (pv0) obj;
        updateSourceAddressInteractor$startSourceAddressUpdates$2.L$1 = (Zone) obj2;
        return updateSourceAddressInteractor$startSourceAddressUpdates$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pv0 pv0Var = (pv0) this.L$0;
        Zone zone = (Zone) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Address address = pv0Var.a;
            if (!jl40.l(address.getZoneName(), zone != null ? zone.a : null)) {
                k kVar = this.this$0;
                this.L$0 = pv0Var;
                this.L$1 = null;
                this.label = 1;
                obj = kVar.d.d(address.getZoneName(), address.B(), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return new ZoneAddress(pv0Var.a, zone);
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        zone = (Zone) obj;
        return new ZoneAddress(pv0Var.a, zone);
    }
}
