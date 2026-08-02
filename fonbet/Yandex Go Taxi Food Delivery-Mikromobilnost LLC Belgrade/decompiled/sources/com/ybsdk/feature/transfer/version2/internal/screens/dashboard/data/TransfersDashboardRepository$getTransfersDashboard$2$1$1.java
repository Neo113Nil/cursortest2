package com.ybsdk.feature.transfer.version2.internal.screens.dashboard.data;

import com.ybsdk.feature.transfer.version2.internal.network.dto.dashboard.TransfersDashboardResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "it", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/dashboard/TransfersDashboardResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.dashboard.data.TransfersDashboardRepository$getTransfersDashboard$2$1$1", f = "TransfersDashboardRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransfersDashboardRepository$getTransfersDashboard$2$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransfersDashboardRepository$getTransfersDashboard$2$1$1 transfersDashboardRepository$getTransfersDashboard$2$1$1 = new TransfersDashboardRepository$getTransfersDashboard$2$1$1(2, continuation);
        transfersDashboardRepository$getTransfersDashboard$2$1$1.L$0 = obj;
        return transfersDashboardRepository$getTransfersDashboard$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransfersDashboardRepository$getTransfersDashboard$2$1$1) create((TransfersDashboardResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return ((TransfersDashboardResponse) this.L$0).getDivData();
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
