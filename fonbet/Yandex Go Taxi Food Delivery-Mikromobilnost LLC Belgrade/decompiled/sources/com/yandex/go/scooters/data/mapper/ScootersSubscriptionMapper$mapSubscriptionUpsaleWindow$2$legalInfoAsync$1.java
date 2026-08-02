package com.yandex.go.scooters.data.mapper;

import com.yandex.go.scooters.data.model.ScootersSubscriptionLegalInfoDto;
import com.yandex.go.scooters.data.model.ScootersSubscriptionUpsaleWindowDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzo0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzzo0;", "<anonymous>", "(Ltse;)Lzzo0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2$legalInfoAsync$1", f = "ScootersSubscriptionMapper.kt", l = {160}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2$legalInfoAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersSubscriptionUpsaleWindowDto $this_mapSubscriptionUpsaleWindow;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2$legalInfoAsync$1(ScootersSubscriptionUpsaleWindowDto scootersSubscriptionUpsaleWindowDto, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$this_mapSubscriptionUpsaleWindow = scootersSubscriptionUpsaleWindowDto;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2$legalInfoAsync$1(this.$this_mapSubscriptionUpsaleWindow, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2$legalInfoAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ScootersSubscriptionLegalInfoDto scootersSubscriptionLegalInfoDto = this.$this_mapSubscriptionUpsaleWindow.h;
            if (scootersSubscriptionLegalInfoDto == null) {
                return null;
            }
            e eVar = this.this$0;
            this.label = 1;
            obj = e.e(eVar, scootersSubscriptionLegalInfoDto, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return (zzo0) obj;
    }
}
