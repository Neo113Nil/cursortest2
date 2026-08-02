package com.yandex.plus.pay.internal.feature.offers;

import com.yandex.plus.pay.api.analytics.PlusPayAnalyticsParams;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rqd;
import defpackage.tls;
import defpackage.zdd0;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llqd;", "<anonymous>", "()Llqd;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.offers.CompositeOffersInteractorImpl$getCompositeOffers$2$2", f = "CompositeOffersInteractorImpl.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CompositeOffersInteractorImpl$getCompositeOffers$2$2 extends SuspendLambda implements tls {
    final /* synthetic */ PlusPayAnalyticsParams $analyticsParams;
    final /* synthetic */ rqd $arguments;
    final /* synthetic */ b $this_runSuspendCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeOffersInteractorImpl$getCompositeOffers$2$2(b bVar, PlusPayAnalyticsParams plusPayAnalyticsParams, rqd rqdVar, Continuation continuation) {
        super(1, continuation);
        this.$this_runSuspendCatching = bVar;
        this.$analyticsParams = plusPayAnalyticsParams;
        this.$arguments = rqdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CompositeOffersInteractorImpl$getCompositeOffers$2$2(this.$this_runSuspendCatching, this.$analyticsParams, this.$arguments, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CompositeOffersInteractorImpl$getCompositeOffers$2$2) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        com.yandex.plus.pay.graphql.offers.a aVar = this.$this_runSuspendCatching.a;
        String sessionId = this.$analyticsParams.getSessionId();
        String meaning = PlusPayLoadOffersReason.DEFAULT.getMeaning();
        rqd rqdVar = this.$arguments;
        String str = rqdVar.a;
        zdd0 zdd0Var = rqdVar.b;
        String str2 = zdd0Var.a;
        Set set = zdd0Var.b;
        Set set2 = zdd0Var.c;
        this.label = 1;
        Object b = aVar.b(sessionId, meaning, str, str2, set, set2, false, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
