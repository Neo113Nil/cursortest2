package com.ybsdk.feature.transactions.impl.ui.screens.feed;

import com.ybsdk.feature.transactions.api.entities.TransactionsFeedFilterEntity;
import com.ybsdk.feature.transactions.api.entities.TransactionsLoadType;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transactions.impl.ui.screens.feed.TransactionsFeedViewModel$4$1", f = "TransactionsFeedViewModel.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransactionsFeedViewModel$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ TransactionsFeedFilterEntity $filter;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionsFeedViewModel$4$1(c cVar, TransactionsFeedFilterEntity transactionsFeedFilterEntity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$filter = transactionsFeedFilterEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransactionsFeedViewModel$4$1(this.this$0, this.$filter, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransactionsFeedViewModel$4$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            TransactionsLoadType transactionsLoadType = TransactionsLoadType.INITIAL;
            TransactionsFeedFilterEntity transactionsFeedFilterEntity = this.$filter;
            this.label = 1;
            if (cVar.c0(transactionsLoadType, transactionsFeedFilterEntity, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
