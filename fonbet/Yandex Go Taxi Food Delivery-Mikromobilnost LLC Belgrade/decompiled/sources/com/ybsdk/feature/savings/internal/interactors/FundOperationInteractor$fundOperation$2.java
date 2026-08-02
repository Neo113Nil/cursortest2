package com.ybsdk.feature.savings.internal.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lsk11;", "Lyos;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.interactors.FundOperationInteractor$fundOperation$2", f = "FundOperationInteractor.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FundOperationInteractor$fundOperation$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ boolean $confirmation;
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $type;
    final /* synthetic */ String $verificationToken;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundOperationInteractor$fundOperation$2(b bVar, String str, String str2, String str3, String str4, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$verificationToken = str;
        this.$operationId = str2;
        this.$type = str3;
        this.$agreementId = str4;
        this.$confirmation = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FundOperationInteractor$fundOperation$2 fundOperationInteractor$fundOperation$2 = new FundOperationInteractor$fundOperation$2(this.this$0, this.$verificationToken, this.$operationId, this.$type, this.$agreementId, this.$confirmation, continuation);
        fundOperationInteractor$fundOperation$2.L$0 = obj;
        return fundOperationInteractor$fundOperation$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FundOperationInteractor$fundOperation$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            com.ybsdk.feature.savings.internal.data.b bVar = this.this$0.a;
            String str2 = this.$verificationToken;
            String str3 = this.$operationId;
            String str4 = this.$type;
            String str5 = this.$agreementId;
            boolean z = this.$confirmation;
            this.label = 1;
            b = bVar.b(str, str2, str3, str4, str5, z, this);
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
