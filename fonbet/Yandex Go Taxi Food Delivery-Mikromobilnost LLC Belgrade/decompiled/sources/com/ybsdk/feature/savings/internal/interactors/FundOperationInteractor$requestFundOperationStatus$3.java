package com.ybsdk.feature.savings.internal.interactors;

import defpackage.dps;
import defpackage.hps;
import defpackage.iyd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tq11;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Lhps;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.interactors.FundOperationInteractor$requestFundOperationStatus$3", f = "FundOperationInteractor.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FundOperationInteractor$requestFundOperationStatus$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ String $requestId;
    final /* synthetic */ String $type;
    final /* synthetic */ tls $updateProcessingStateCallback;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundOperationInteractor$requestFundOperationStatus$3(b bVar, String str, String str2, String str3, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$type = str;
        this.$agreementId = str2;
        this.$requestId = str3;
        this.$updateProcessingStateCallback = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FundOperationInteractor$requestFundOperationStatus$3 fundOperationInteractor$requestFundOperationStatus$3 = new FundOperationInteractor$requestFundOperationStatus$3(this.this$0, this.$type, this.$agreementId, this.$requestId, this.$updateProcessingStateCallback, continuation);
        fundOperationInteractor$requestFundOperationStatus$3.I$0 = ((tq11) obj).a;
        return fundOperationInteractor$requestFundOperationStatus$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        FundOperationInteractor$requestFundOperationStatus$3 fundOperationInteractor$requestFundOperationStatus$3 = new FundOperationInteractor$requestFundOperationStatus$3(this.this$0, this.$type, this.$agreementId, this.$requestId, this.$updateProcessingStateCallback, (Continuation) obj2);
        fundOperationInteractor$requestFundOperationStatus$3.I$0 = i;
        return fundOperationInteractor$requestFundOperationStatus$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FundOperationInteractor$requestFundOperationStatus$3 fundOperationInteractor$requestFundOperationStatus$3;
        Object h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = this.I$0;
            com.ybsdk.feature.savings.internal.data.b bVar = this.this$0.a;
            String str = this.$type;
            String str2 = this.$agreementId;
            String str3 = this.$requestId;
            this.label = 1;
            fundOperationInteractor$requestFundOperationStatus$3 = this;
            h = bVar.h(str, str2, str3, i2, fundOperationInteractor$requestFundOperationStatus$3);
            if (h == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            h = ((Result) obj).getValue();
            fundOperationInteractor$requestFundOperationStatus$3 = this;
        }
        Result result = new Result(h);
        b bVar2 = fundOperationInteractor$requestFundOperationStatus$3.this$0;
        tls tlsVar = fundOperationInteractor$requestFundOperationStatus$3.$updateProcessingStateCallback;
        Object value = result.getValue();
        if (value instanceof Result.Failure) {
            value = null;
        }
        iyd0 iyd0Var = (iyd0) value;
        bVar2.c = iyd0Var != null ? (hps) iyd0Var.a : null;
        if (bVar2.c instanceof dps) {
            tlsVar.invoke(bVar2.c);
        }
        return result;
    }
}
