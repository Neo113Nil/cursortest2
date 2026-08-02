package com.ybsdk.feature.savings.internal.interactors;

import defpackage.iyd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tq11;
import defpackage.vps;
import defpackage.wls;
import defpackage.zps;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Lzps;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.interactors.FundCreationInteractor$requestFundCreationStatus$3", f = "FundCreationInteractor.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FundCreationInteractor$requestFundCreationStatus$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $preselectedAgreementId;
    final /* synthetic */ String $requestId;
    final /* synthetic */ tls $updateProcessingStateCallback;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundCreationInteractor$requestFundCreationStatus$3(a aVar, String str, String str2, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$requestId = str;
        this.$preselectedAgreementId = str2;
        this.$updateProcessingStateCallback = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FundCreationInteractor$requestFundCreationStatus$3 fundCreationInteractor$requestFundCreationStatus$3 = new FundCreationInteractor$requestFundCreationStatus$3(this.this$0, this.$requestId, this.$preselectedAgreementId, this.$updateProcessingStateCallback, continuation);
        fundCreationInteractor$requestFundCreationStatus$3.I$0 = ((tq11) obj).a;
        return fundCreationInteractor$requestFundCreationStatus$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        FundCreationInteractor$requestFundCreationStatus$3 fundCreationInteractor$requestFundCreationStatus$3 = new FundCreationInteractor$requestFundCreationStatus$3(this.this$0, this.$requestId, this.$preselectedAgreementId, this.$updateProcessingStateCallback, (Continuation) obj2);
        fundCreationInteractor$requestFundCreationStatus$3.I$0 = i;
        return fundCreationInteractor$requestFundCreationStatus$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            int i3 = this.I$0;
            com.ybsdk.feature.savings.internal.data.b bVar = this.this$0.a;
            String str = this.$requestId;
            String str2 = this.$preselectedAgreementId;
            this.label = 1;
            i = bVar.i(i3, str, str2, this);
            if (i == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            i = ((Result) obj).getValue();
        }
        Result result = new Result(i);
        a aVar = this.this$0;
        tls tlsVar = this.$updateProcessingStateCallback;
        Object value = result.getValue();
        if (value instanceof Result.Failure) {
            value = null;
        }
        iyd0 iyd0Var = (iyd0) value;
        aVar.e = iyd0Var != null ? (zps) iyd0Var.a : null;
        if (aVar.e instanceof vps) {
            tlsVar.invoke(aVar.e);
        }
        return result;
    }
}
