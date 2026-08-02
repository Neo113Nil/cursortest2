package com.yandex.go.mainscreen.superapp.impl.foundation.domain;

import com.yandex.go.address.models.Address;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/zone/model/Zone;", "srcAddress", "Lcom/yandex/go/address/models/Address;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.domain.EnsureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$3", f = "EnsureZoneInSourceAddressInteractor.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class EnsureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnsureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$3(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EnsureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$3 ensureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$3 = new EnsureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$3(this.this$0, continuation);
        ensureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$3.L$0 = obj;
        return ensureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EnsureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$3) create((Address) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Address address = (Address) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        hst hstVar = jst.e;
        address.d();
        Objects.toString(address.B());
        hstVar.getClass();
        com.yandex.go.zone.interactors.b bVar = this.this$0.b;
        String zoneName = address.getZoneName();
        zzs B = address.B();
        this.L$0 = null;
        this.label = 1;
        Object d = bVar.d(zoneName, B, this);
        return d == coroutineSingletons ? coroutineSingletons : d;
    }
}
