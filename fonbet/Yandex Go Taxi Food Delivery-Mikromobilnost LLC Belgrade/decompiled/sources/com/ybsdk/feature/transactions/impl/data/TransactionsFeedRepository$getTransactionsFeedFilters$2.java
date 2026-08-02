package com.ybsdk.feature.transactions.impl.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.transactions.api.entities.TransactionsFeedFilterEntity;
import com.ybsdk.feature.transactions.impl.data.network.TransactionsApi;
import com.ybsdk.feature.transactions.impl.data.network.dto.feed.TransactionsFeedFiltersRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.we01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lwe01;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transactions.impl.data.TransactionsFeedRepository$getTransactionsFeedFilters$2", f = "TransactionsFeedRepository.kt", l = {27, 37}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransactionsFeedRepository$getTransactionsFeedFilters$2 extends SuspendLambda implements tls {
    final /* synthetic */ TransactionsFeedFilterEntity $filter;
    final /* synthetic */ boolean $hideFilters;
    final /* synthetic */ boolean $showTabbar;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionsFeedRepository$getTransactionsFeedFilters$2(b bVar, TransactionsFeedFilterEntity transactionsFeedFilterEntity, boolean z, boolean z2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$filter = transactionsFeedFilterEntity;
        this.$showTabbar = z;
        this.$hideFilters = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TransactionsFeedRepository$getTransactionsFeedFilters$2(this.this$0, this.$filter, this.$showTabbar, this.$hideFilters, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TransactionsFeedRepository$getTransactionsFeedFilters$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r12 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006a, code lost:
    
        if (r13 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
        Object failure;
        Throwable a;
        Object failure2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            TransactionsApi transactionsApi = this.this$0.a;
            TransactionsFeedFilterEntity transactionsFeedFilterEntity = this.$filter;
            String product = transactionsFeedFilterEntity != null ? transactionsFeedFilterEntity.getProduct() : null;
            TransactionsFeedFilterEntity transactionsFeedFilterEntity2 = this.$filter;
            String agreementId = transactionsFeedFilterEntity2 != null ? transactionsFeedFilterEntity2.getAgreementId() : null;
            TransactionsFeedFilterEntity transactionsFeedFilterEntity3 = this.$filter;
            String filtersStyle = transactionsFeedFilterEntity3 != null ? transactionsFeedFilterEntity3.getFiltersStyle() : null;
            TransactionsFeedFilterEntity transactionsFeedFilterEntity4 = this.$filter;
            TransactionsFeedFiltersRequest transactionsFeedFiltersRequest = new TransactionsFeedFiltersRequest(product, agreementId, this.$showTabbar, this.$hideFilters, transactionsFeedFilterEntity4 != null ? transactionsFeedFilterEntity4.getHeaderStyle() : null, filtersStyle);
            this.label = 1;
            d = transactionsApi.d(transactionsFeedFiltersRequest, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                failure = ((Result) obj).getValue();
                a = Result.a(failure);
                if (a != null) {
                    failure2 = (we01) failure;
                    if (failure2 == null) {
                        failure2 = new Result.Failure(new IllegalArgumentException("Invalid transactions feed filters response"));
                    }
                } else {
                    failure2 = new Result.Failure(a);
                }
                return new Result(failure2);
            }
            kotlin.b.b(obj);
            d = ((Result) obj).getValue();
        }
        Throwable a2 = Result.a(d);
        if (a2 == null) {
            TransactionsFeedRepository$getTransactionsFeedFilters$2$1$1 transactionsFeedRepository$getTransactionsFeedFilters$2$1$1 = new TransactionsFeedRepository$getTransactionsFeedFilters$2$1$1(2, null);
            this.label = 2;
            failure = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) d, transactionsFeedRepository$getTransactionsFeedFilters$2$1$1, this);
        } else {
            failure = new Result.Failure(a2);
        }
        a = Result.a(failure);
        if (a != null) {
        }
        return new Result(failure2);
    }
}
