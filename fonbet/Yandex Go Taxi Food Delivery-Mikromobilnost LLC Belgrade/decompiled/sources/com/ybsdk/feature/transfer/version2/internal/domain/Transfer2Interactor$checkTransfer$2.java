package com.ybsdk.feature.transfer.version2.internal.domain;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferRequest;
import defpackage.gjq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wjq0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Lkotlin/Result;", "Ldqg;", "Lnfb;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/main/domain/entities/CheckTransferEntity;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.domain.Transfer2Interactor$checkTransfer$2", f = "Transfer2Interactor.kt", l = {176, 178}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Transfer2Interactor$checkTransfer$2 extends SuspendLambda implements wls {
    final /* synthetic */ TransferRequest $request;
    final /* synthetic */ wjq0 $subject;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transfer2Interactor$checkTransfer$2(wjq0 wjq0Var, b bVar, TransferRequest transferRequest, Continuation continuation) {
        super(2, continuation);
        this.$subject = wjq0Var;
        this.this$0 = bVar;
        this.$request = transferRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Transfer2Interactor$checkTransfer$2 transfer2Interactor$checkTransfer$2 = new Transfer2Interactor$checkTransfer$2(this.$subject, this.this$0, this.$request, continuation);
        transfer2Interactor$checkTransfer$2.L$0 = obj;
        return transfer2Interactor$checkTransfer$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Transfer2Interactor$checkTransfer$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r5 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r5 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            boolean z = this.$subject instanceof gjq0;
            b bVar = this.this$0;
            if (z) {
                com.ybsdk.feature.transfer.version2.internal.data.helpers.a aVar = bVar.e;
                TransferRequest transferRequest = this.$request;
                this.label = 1;
                c = aVar.d(transferRequest, str, this);
            } else {
                com.ybsdk.feature.transfer.version2.internal.data.helpers.a aVar2 = bVar.e;
                TransferRequest transferRequest2 = this.$request;
                this.label = 2;
                c = aVar2.c(transferRequest2, str, this);
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = ((Result) obj).getValue();
        }
        return new Result(c);
    }
}
