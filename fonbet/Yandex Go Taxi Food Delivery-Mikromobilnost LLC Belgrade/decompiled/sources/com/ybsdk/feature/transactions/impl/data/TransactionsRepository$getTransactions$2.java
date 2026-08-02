package com.ybsdk.feature.transactions.impl.data;

import com.ybsdk.feature.transactions.impl.data.network.TransactionsApi;
import com.ybsdk.feature.transactions.impl.data.network.dto.TransactionsListRequestV2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsListResponseV2;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transactions.impl.data.TransactionsRepository$getTransactions$2", f = "TransactionsRepository.kt", l = {142}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransactionsRepository$getTransactions$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ String $cursor;
    final /* synthetic */ int $limit;
    final /* synthetic */ Integer $pendingLimit;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionsRepository$getTransactions$2(c cVar, String str, Integer num, int i, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$agreementId = str;
        this.$pendingLimit = num;
        this.$limit = i;
        this.$cursor = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TransactionsRepository$getTransactions$2(this.this$0, this.$agreementId, this.$pendingLimit, this.$limit, this.$cursor, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TransactionsRepository$getTransactions$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            TransactionsApi transactionsApi = this.this$0.a;
            TransactionsListRequestV2 transactionsListRequestV2 = new TransactionsListRequestV2(this.$agreementId, this.$pendingLimit, this.$limit, this.$cursor);
            this.label = 1;
            b = transactionsApi.b(transactionsListRequestV2, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        return new Result(b);
    }
}
