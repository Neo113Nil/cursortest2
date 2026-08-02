package com.yandex.go.transfer_requirement.transferapi;

import com.yandex.go.transfer_requirement.transferapi.draft.TransferDraftResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.transferapi.TransferApiInteractor$callTransferDraft$2", f = "TransferApiInteractor.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TransferApiInteractor$callTransferDraft$2 extends SuspendLambda implements tls {
    final /* synthetic */ tls $onResponse;
    final /* synthetic */ TransferParam $param;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferApiInteractor$callTransferDraft$2(a aVar, TransferParam transferParam, tls tlsVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$param = transferParam;
        this.$onResponse = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TransferApiInteractor$callTransferDraft$2(this.this$0, this.$param, this.$onResponse, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TransferApiInteractor$callTransferDraft$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            TransferParam transferParam = this.$param;
            this.label = 1;
            obj = a.b(aVar, transferParam, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$onResponse.invoke((TransferDraftResponse) obj);
        return zy11.a;
    }
}
