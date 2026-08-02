package com.yandex.plus.pay.internal.feature.closing;

import com.yandex.plus.home.common.network.NetworkResponse;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import defpackage.bns;
import defpackage.e7c;
import defpackage.eja1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lmwj0;", "Lr6c;", "<anonymous>", "(Ltse;)Lmwj0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.closing.MediaBillingClosingOfferRepository$getClosingOffer$response$1", f = "MediaBillingClosingOfferRepository.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MediaBillingClosingOfferRepository$getClosingOffer$response$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $eventSessionId;
    final /* synthetic */ List<String> $offersIds;
    final /* synthetic */ String $target;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaBillingClosingOfferRepository$getClosingOffer$response$1(b bVar, List list, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$offersIds = list;
        this.$target = str;
        this.$eventSessionId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MediaBillingClosingOfferRepository$getClosingOffer$response$1(this.this$0, this.$offersIds, this.$target, this.$eventSessionId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MediaBillingClosingOfferRepository$getClosingOffer$response$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ExternalMediaBillingApi externalMediaBillingApi = this.this$0.a;
            e7c e7cVar = new e7c(this.$offersIds, this.$target, this.$eventSessionId, q5z.v(this.this$0.b));
            this.label = 1;
            obj = externalMediaBillingApi.h(e7cVar, this);
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
        return eja1.t((NetworkResponse) obj, new bns(24, this.this$0));
    }
}
