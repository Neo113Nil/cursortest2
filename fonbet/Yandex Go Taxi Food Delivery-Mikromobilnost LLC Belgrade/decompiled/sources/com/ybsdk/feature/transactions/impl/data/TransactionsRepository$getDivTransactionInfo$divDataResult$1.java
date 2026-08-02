package com.ybsdk.feature.transactions.impl.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.transactions.impl.data.network.TransactionsApi;
import com.ybsdk.feature.transactions.impl.data.network.dto.TransactionDetailsRequest;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transactions.impl.data.TransactionsRepository$getDivTransactionInfo$divDataResult$1", f = "TransactionsRepository.kt", l = {HProv.PP_HASHOID, HProv.PP_SIGNATUREOID}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransactionsRepository$getDivTransactionInfo$divDataResult$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $transactionId;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionsRepository$getDivTransactionInfo$divDataResult$1(c cVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$transactionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TransactionsRepository$getDivTransactionInfo$divDataResult$1(this.this$0, this.$transactionId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TransactionsRepository$getDivTransactionInfo$divDataResult$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r6 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (r7 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            TransactionsApi transactionsApi = this.this$0.a;
            TransactionDetailsRequest transactionDetailsRequest = new TransactionDetailsRequest(this.$transactionId);
            this.label = 1;
            a = transactionsApi.a(transactionDetailsRequest, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                failure = ((Result) obj).getValue();
                return new Result(failure);
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        Throwable a2 = Result.a(a);
        if (a2 == null) {
            TransactionsRepository$getDivTransactionInfo$divDataResult$1$1$1 transactionsRepository$getDivTransactionInfo$divDataResult$1$1$1 = new TransactionsRepository$getDivTransactionInfo$divDataResult$1$1$1(2, null);
            this.label = 2;
            failure = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) a, transactionsRepository$getDivTransactionInfo$divDataResult$1$1$1, this);
        } else {
            failure = new Result.Failure(a2);
        }
        return new Result(failure);
    }
}
