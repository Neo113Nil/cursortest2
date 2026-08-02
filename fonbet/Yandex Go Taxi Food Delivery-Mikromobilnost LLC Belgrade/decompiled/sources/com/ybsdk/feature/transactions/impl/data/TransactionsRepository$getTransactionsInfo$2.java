package com.ybsdk.feature.transactions.impl.data;

import com.ybsdk.feature.transactions.impl.data.network.TransactionsApi;
import com.ybsdk.feature.transactions.impl.data.network.dto.TransactionsInfoRequestV2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsInfoResponseV2;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transactions.impl.data.TransactionsRepository$getTransactionsInfo$2", f = "TransactionsRepository.kt", l = {HProv.PP_DELETE_KEYSET}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransactionsRepository$getTransactionsInfo$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ int $limit;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionsRepository$getTransactionsInfo$2(c cVar, String str, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$agreementId = str;
        this.$limit = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TransactionsRepository$getTransactionsInfo$2(this.this$0, this.$agreementId, this.$limit, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TransactionsRepository$getTransactionsInfo$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            TransactionsApi transactionsApi = this.this$0.a;
            TransactionsInfoRequestV2 transactionsInfoRequestV2 = new TransactionsInfoRequestV2(this.$agreementId, this.$limit, null, null);
            this.label = 1;
            e = transactionsApi.e(transactionsInfoRequestV2, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e = ((Result) obj).getValue();
        }
        return new Result(e);
    }
}
