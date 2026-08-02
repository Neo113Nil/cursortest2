package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.h9;
import com.yandex.passport.data.network.o9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/passport/data/network/m9;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.GetTrackPayloadPerformer$performMethod$1$response$1", f = "GetTrackPayloadPerformer.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetTrackPayloadPerformer$performMethod$1$response$1 extends SuspendLambda implements wls {
    final /* synthetic */ Environment $environment;
    final /* synthetic */ long $locationId;
    final /* synthetic */ MasterToken $masterToken;
    final /* synthetic */ String $processTag;
    final /* synthetic */ o0 $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTrackPayloadPerformer$performMethod$1$response$1(o0 o0Var, Environment environment, long j, String str, MasterToken masterToken, Continuation continuation) {
        super(2, continuation);
        this.$this_runCatching = o0Var;
        this.$environment = environment;
        this.$locationId = j;
        this.$processTag = str;
        this.$masterToken = masterToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetTrackPayloadPerformer$performMethod$1$response$1(this.$this_runCatching, this.$environment, this.$locationId, this.$processTag, this.$masterToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetTrackPayloadPerformer$performMethod$1$response$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        o0 o0Var = this.$this_runCatching;
        o9 o9Var = o0Var.b;
        com.yandex.passport.internal.network.mappers.b bVar = o0Var.w;
        Environment environment = this.$environment;
        bVar.getClass();
        h9 h9Var = new h9(this.$locationId, this.$masterToken, com.yandex.passport.internal.network.mappers.b.a(environment), this.$processTag);
        this.label = 1;
        Object a = o9Var.a(h9Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
