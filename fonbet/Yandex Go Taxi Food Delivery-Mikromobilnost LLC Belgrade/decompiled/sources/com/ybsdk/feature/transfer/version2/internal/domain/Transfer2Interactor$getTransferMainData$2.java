package com.ybsdk.feature.transfer.version2.internal.domain;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.feature.transfer.version2.api.TransferMainScreenArguments;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Lkotlin/Result;", "Ldqg;", "Ltm01;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/main/domain/entities/TransferEntity;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.domain.Transfer2Interactor$getTransferMainData$2", f = "Transfer2Interactor.kt", l = {HProv.PP_INFO}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Transfer2Interactor$getTransferMainData$2 extends SuspendLambda implements wls {
    final /* synthetic */ TransferMainScreenArguments $arguments;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transfer2Interactor$getTransferMainData$2(b bVar, TransferMainScreenArguments transferMainScreenArguments, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$arguments = transferMainScreenArguments;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Transfer2Interactor$getTransferMainData$2 transfer2Interactor$getTransferMainData$2 = new Transfer2Interactor$getTransferMainData$2(this.this$0, this.$arguments, continuation);
        transfer2Interactor$getTransferMainData$2.L$0 = obj;
        return transfer2Interactor$getTransferMainData$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Transfer2Interactor$getTransferMainData$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object k;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            com.ybsdk.feature.transfer.version2.internal.data.helpers.a aVar = this.this$0.e;
            TransferMainScreenArguments transferMainScreenArguments = this.$arguments;
            this.label = 1;
            k = aVar.k(transferMainScreenArguments, str, this);
            if (k == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            k = ((Result) obj).getValue();
        }
        return new Result(k);
    }
}
