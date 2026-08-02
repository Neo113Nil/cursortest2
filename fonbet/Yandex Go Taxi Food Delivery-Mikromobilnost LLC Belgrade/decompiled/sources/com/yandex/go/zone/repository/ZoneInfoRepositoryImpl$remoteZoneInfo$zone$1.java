package com.yandex.go.zone.repository;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/go/zone/model/Zone;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.zone.repository.ZoneInfoRepositoryImpl$remoteZoneInfo$zone$1", f = "ZoneInfoRepositoryImpl.kt", l = {143}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ZoneInfoRepositoryImpl$remoteZoneInfo$zone$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $userId;
    final /* synthetic */ String $zoneName;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneInfoRepositoryImpl$remoteZoneInfo$zone$1(o oVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
        this.$userId = str;
        this.$zoneName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZoneInfoRepositoryImpl$remoteZoneInfo$zone$1(this.this$0, this.$userId, this.$zoneName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoneInfoRepositoryImpl$remoteZoneInfo$zone$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o oVar = this.this$0;
            String str = this.$userId;
            String str2 = this.$zoneName;
            this.label = 1;
            a = o.a(oVar, str, str2, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
