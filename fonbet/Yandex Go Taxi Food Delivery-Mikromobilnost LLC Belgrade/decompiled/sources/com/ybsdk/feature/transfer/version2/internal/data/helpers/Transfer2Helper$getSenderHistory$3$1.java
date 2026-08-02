package com.ybsdk.feature.transfer.version2.internal.data.helpers;

import com.ybsdk.feature.transfer.version2.internal.network.dto.SenderHistoryDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.SenderTransferDto;
import defpackage.kqq0;
import defpackage.lqq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SenderHistoryDto;", "dto", "Llqq0;", "<anonymous>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SenderHistoryDto;)Llqq0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.data.helpers.Transfer2Helper$getSenderHistory$3$1", f = "Transfer2Helper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Transfer2Helper$getSenderHistory$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Transfer2Helper$getSenderHistory$3$1 transfer2Helper$getSenderHistory$3$1 = new Transfer2Helper$getSenderHistory$3$1(2, continuation);
        transfer2Helper$getSenderHistory$3$1.L$0 = obj;
        return transfer2Helper$getSenderHistory$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Transfer2Helper$getSenderHistory$3$1) create((SenderHistoryDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List<SenderTransferDto> transfers = ((SenderHistoryDto) this.L$0).getTransfers();
        ArrayList arrayList = new ArrayList(tcc.n(transfers, 10));
        for (SenderTransferDto senderTransferDto : transfers) {
            arrayList.add(new kqq0(senderTransferDto.getPhone(), senderTransferDto.getTitle()));
        }
        return new lqq0(arrayList);
    }
}
