package com.ybsdk.feature.transactions.impl.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.transactions.api.entities.TransactionsFeedFilterEntity;
import com.ybsdk.feature.transactions.impl.data.network.TransactionsApi;
import com.ybsdk.feature.transactions.impl.data.network.dto.feed.TransactionsFeedListRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lppl;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transactions.impl.data.TransactionsFeedRepository$getTransactionsFeedList$2", f = "TransactionsFeedRepository.kt", l = {54, 67}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransactionsFeedRepository$getTransactionsFeedList$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $cursor;
    final /* synthetic */ TransactionsFeedFilterEntity $filter;
    final /* synthetic */ boolean $hideFilters;
    final /* synthetic */ int $pendingLimit;
    final /* synthetic */ int $regularLimit;
    final /* synthetic */ boolean $showTabbar;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionsFeedRepository$getTransactionsFeedList$2(b bVar, int i, TransactionsFeedFilterEntity transactionsFeedFilterEntity, int i2, String str, boolean z, boolean z2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$regularLimit = i;
        this.$filter = transactionsFeedFilterEntity;
        this.$pendingLimit = i2;
        this.$cursor = str;
        this.$showTabbar = z;
        this.$hideFilters = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TransactionsFeedRepository$getTransactionsFeedList$2(this.this$0, this.$regularLimit, this.$filter, this.$pendingLimit, this.$cursor, this.$showTabbar, this.$hideFilters, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TransactionsFeedRepository$getTransactionsFeedList$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
    
        if (r0 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r2 == r1) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            TransactionsApi transactionsApi = this.this$0.a;
            int i2 = this.$regularLimit;
            TransactionsFeedFilterEntity transactionsFeedFilterEntity = this.$filter;
            String product = transactionsFeedFilterEntity != null ? transactionsFeedFilterEntity.getProduct() : null;
            TransactionsFeedFilterEntity transactionsFeedFilterEntity2 = this.$filter;
            String agreementId = transactionsFeedFilterEntity2 != null ? transactionsFeedFilterEntity2.getAgreementId() : null;
            Integer num = new Integer(this.$pendingLimit);
            String str = this.$cursor;
            Boolean valueOf = Boolean.valueOf(this.$showTabbar);
            Boolean valueOf2 = Boolean.valueOf(this.$hideFilters);
            TransactionsFeedFilterEntity transactionsFeedFilterEntity3 = this.$filter;
            String headerStyle = transactionsFeedFilterEntity3 != null ? transactionsFeedFilterEntity3.getHeaderStyle() : null;
            TransactionsFeedFilterEntity transactionsFeedFilterEntity4 = this.$filter;
            TransactionsFeedListRequest transactionsFeedListRequest = new TransactionsFeedListRequest(i2, product, agreementId, num, str, valueOf, valueOf2, headerStyle, transactionsFeedFilterEntity4 != null ? transactionsFeedFilterEntity4.getFiltersStyle() : null);
            this.label = 1;
            c = transactionsApi.c(transactionsFeedListRequest, this);
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
            c = ((Result) obj).getValue();
        }
        Throwable a = Result.a(c);
        if (a == null) {
            TransactionsFeedRepository$getTransactionsFeedList$2$1$1 transactionsFeedRepository$getTransactionsFeedList$2$1$1 = new TransactionsFeedRepository$getTransactionsFeedList$2$1$1(2, null);
            this.label = 2;
            failure = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, transactionsFeedRepository$getTransactionsFeedList$2$1$1, this);
        } else {
            failure = new Result.Failure(a);
        }
        return new Result(failure);
    }
}
