package com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.data;

import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitTransferIdDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pi01;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitTransferIdDto;", "it", "Lpi01;", "<anonymous>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitTransferIdDto;)Lpi01;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.data.Me2meDebitResultRepository$getMe2MeDebitTransferId$3$1", f = "Me2meDebitResultRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Me2meDebitResultRepository$getMe2MeDebitTransferId$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Me2meDebitResultRepository$getMe2MeDebitTransferId$3$1 me2meDebitResultRepository$getMe2MeDebitTransferId$3$1 = new Me2meDebitResultRepository$getMe2MeDebitTransferId$3$1(2, continuation);
        me2meDebitResultRepository$getMe2MeDebitTransferId$3$1.L$0 = obj;
        return me2meDebitResultRepository$getMe2MeDebitTransferId$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Me2meDebitResultRepository$getMe2MeDebitTransferId$3$1) create((Me2MeDebitTransferIdDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new pi01(((Me2MeDebitTransferIdDto) this.L$0).getTransferId());
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
