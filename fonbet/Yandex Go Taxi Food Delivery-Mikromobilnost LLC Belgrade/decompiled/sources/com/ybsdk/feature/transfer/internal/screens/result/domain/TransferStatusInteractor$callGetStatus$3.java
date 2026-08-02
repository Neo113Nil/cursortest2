package com.ybsdk.feature.transfer.internal.screens.result.domain;

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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Let01;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.internal.screens.result.domain.TransferStatusInteractor$callGetStatus$3", f = "TransferStatusInteractor.kt", l = {HProv.PP_FAST_CODE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferStatusInteractor$callGetStatus$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $transferId;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferStatusInteractor$callGetStatus$3(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$transferId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransferStatusInteractor$callGetStatus$3 transferStatusInteractor$callGetStatus$3 = new TransferStatusInteractor$callGetStatus$3(this.this$0, this.$transferId, continuation);
        transferStatusInteractor$callGetStatus$3.I$0 = ((tq11) obj).a;
        return transferStatusInteractor$callGetStatus$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        TransferStatusInteractor$callGetStatus$3 transferStatusInteractor$callGetStatus$3 = new TransferStatusInteractor$callGetStatus$3(this.this$0, this.$transferId, (Continuation) obj2);
        transferStatusInteractor$callGetStatus$3.I$0 = i;
        return transferStatusInteractor$callGetStatus$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = this.I$0;
            com.ybsdk.feature.transfer.internal.data.a aVar = this.this$0.a;
            String str = this.$transferId;
            this.label = 1;
            d = aVar.d(i2, str, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            d = ((Result) obj).getValue();
        }
        return new Result(d);
    }
}
