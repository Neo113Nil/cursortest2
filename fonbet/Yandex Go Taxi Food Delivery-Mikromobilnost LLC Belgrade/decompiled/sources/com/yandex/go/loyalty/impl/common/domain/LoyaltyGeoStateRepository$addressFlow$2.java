package com.yandex.go.loyalty.impl.common.domain;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.d0l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zuz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ld0l0;", "route", "", "zoneName", "Lzuz;", "<anonymous>", "(Ld0l0;Ljava/lang/String;)Lzuz;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.loyalty.impl.common.domain.LoyaltyGeoStateRepository$addressFlow$2", f = "LoyaltyGeoStateRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class LoyaltyGeoStateRepository$addressFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyGeoStateRepository$addressFlow$2(h hVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = hVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LoyaltyGeoStateRepository$addressFlow$2 loyaltyGeoStateRepository$addressFlow$2 = new LoyaltyGeoStateRepository$addressFlow$2(this.this$0, (Continuation) obj3);
        loyaltyGeoStateRepository$addressFlow$2.L$0 = (d0l0) obj;
        loyaltyGeoStateRepository$addressFlow$2.L$1 = (String) obj2;
        return loyaltyGeoStateRepository$addressFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ZoneAddress zoneAddress;
        ZoneAddress zoneAddress2;
        Zone zone;
        String str;
        d0l0 d0l0Var = (d0l0) this.L$0;
        String str2 = (String) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (d0l0Var != null && (zoneAddress2 = d0l0Var.a) != null && (zone = zoneAddress2.b) != null && (str = zone.a) != null) {
            str2 = str;
        }
        this.this$0.getClass();
        if (d0l0Var == null || (zoneAddress = d0l0Var.a) == null) {
            return null;
        }
        return new zuz(zoneAddress.a.B(), str2);
    }
}
