package com.ybsdk.feature.transactions.impl.ui.screens.list;

import com.ybsdk.feature.transactions.api.entities.TransactionsLoadType;
import com.ybsdk.feature.transactions.api.entities.TransactionsState;
import defpackage.cg01;
import defpackage.g8e;
import defpackage.lj91;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppl;
import defpackage.pz40;
import defpackage.tse;
import defpackage.uf01;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transactions.impl.ui.screens.list.TransactionsViewModel$fetchTransactions$2", f = "TransactionsViewModel.kt", l = {HProv.PP_CONTAINER_STATUS}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransactionsViewModel$fetchTransactions$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $agreement;
    final /* synthetic */ TransactionsLoadType $loadType;
    final /* synthetic */ ppl $oldTransactions;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionsViewModel$fetchTransactions$2(a aVar, TransactionsLoadType transactionsLoadType, ppl pplVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$loadType = transactionsLoadType;
        this.$oldTransactions = pplVar;
        this.$agreement = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransactionsViewModel$fetchTransactions$2(this.this$0, this.$loadType, this.$oldTransactions, this.$agreement, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransactionsViewModel$fetchTransactions$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object obj2;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, uf01.a((uf01) value, null, null, null, TransactionsState.LOADING, null, false, 15)));
            this.this$0.Z(new cg01(this.$loadType == TransactionsLoadType.REFRESH));
            String str = this.$loadType == TransactionsLoadType.NEXT_PAGE ? this.$oldTransactions.b : null;
            com.ybsdk.feature.transactions.impl.domain.interactors.b bVar = this.this$0.C;
            String str2 = this.$agreement;
            this.label = 1;
            Object a = bVar.a(str2, str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        a aVar = this.this$0;
        TransactionsLoadType transactionsLoadType = this.$loadType;
        ppl pplVar = this.$oldTransactions;
        if (!(obj2 instanceof Result.Failure)) {
            ppl pplVar2 = (ppl) obj2;
            pz40 Y2 = aVar.Y();
            do {
                r0Var3 = (r0) Y2;
                value3 = r0Var3.getValue();
            } while (!r0Var3.k(value3, uf01.a((uf01) value3, null, null, lj91.b(transactionsLoadType, pplVar, pplVar2), TransactionsState.IDLE, null, false, 103)));
        }
        a aVar2 = this.this$0;
        TransactionsLoadType transactionsLoadType2 = this.$loadType;
        Throwable a2 = Result.a(obj2);
        if (a2 != null) {
            x4c.g("Failed to load more transactions for account with agreement_id", a2, g8e.o("agreement_id=", aVar2.B.getAgreementId()), null, 8);
            boolean z = transactionsLoadType2 == TransactionsLoadType.REFRESH;
            pz40 Y3 = aVar2.Y();
            do {
                r0Var2 = (r0) Y3;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, uf01.a((uf01) value2, null, null, null, TransactionsState.ERROR, z ? a2 : null, z, 15)));
        }
        this.this$0.Z(new cg01(false));
        return zy11.a;
    }
}
