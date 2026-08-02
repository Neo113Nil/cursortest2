package com.ybsdk.feature.transfer.version2.internal.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Ldqg;", "Lyr01;", "Lcom/ybsdk/feature/transfer/version2/internal/entities/TransferGetResultEntity;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.domain.Transfer2Interactor$callGetResult$3", f = "Transfer2Interactor.kt", l = {255}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Transfer2Interactor$callGetResult$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $referrer;
    final /* synthetic */ String $transferId;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transfer2Interactor$callGetResult$3(b bVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$transferId = str;
        this.$referrer = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Transfer2Interactor$callGetResult$3 transfer2Interactor$callGetResult$3 = new Transfer2Interactor$callGetResult$3(this.this$0, this.$transferId, this.$referrer, continuation);
        transfer2Interactor$callGetResult$3.I$0 = ((tq11) obj).a;
        return transfer2Interactor$callGetResult$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        Transfer2Interactor$callGetResult$3 transfer2Interactor$callGetResult$3 = new Transfer2Interactor$callGetResult$3(this.this$0, this.$transferId, this.$referrer, (Continuation) obj2);
        transfer2Interactor$callGetResult$3.I$0 = i;
        return transfer2Interactor$callGetResult$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = this.I$0;
            com.ybsdk.feature.transfer.version2.internal.data.helpers.a aVar = this.this$0.e;
            String str = this.$transferId;
            String str2 = this.$referrer;
            this.label = 1;
            h = aVar.h(i2, str, str2, this);
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
        }
        return new Result(h);
    }
}
