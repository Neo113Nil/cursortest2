package com.ybsdk.feature.transfer.version2.internal.screens.requisites.data;

import com.ybsdk.feature.transfer.version2.internal.network.dto.GetPartnersByBicDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferBankByBicDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qxy0;
import defpackage.qz51;
import defpackage.tcc;
import defpackage.wls;
import defpackage.yg90;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/GetPartnersByBicDto;", "dto", "Lqz51;", "<anonymous>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/GetPartnersByBicDto;)Lqz51;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.requisites.data.Transfer2RequisitesRepository$getPartnersByBic$3$1", f = "Transfer2RequisitesRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Transfer2RequisitesRepository$getPartnersByBic$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Transfer2RequisitesRepository$getPartnersByBic$3$1 transfer2RequisitesRepository$getPartnersByBic$3$1 = new Transfer2RequisitesRepository$getPartnersByBic$3$1(2, continuation);
        transfer2RequisitesRepository$getPartnersByBic$3$1.L$0 = obj;
        return transfer2RequisitesRepository$getPartnersByBic$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Transfer2RequisitesRepository$getPartnersByBic$3$1) create((GetPartnersByBicDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ArrayList arrayList = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        GetPartnersByBicDto getPartnersByBicDto = (GetPartnersByBicDto) this.L$0;
        String errorHint = getPartnersByBicDto.getErrorHint();
        List<TransferBankByBicDto> ybs = getPartnersByBicDto.getYbs();
        if (ybs != null) {
            List<TransferBankByBicDto> list = ybs;
            ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
            for (TransferBankByBicDto transferBankByBicDto : list) {
                arrayList2.add(new yg90(transferBankByBicDto.getTitle(), qxy0.c(transferBankByBicDto.getThemedImage(), null)));
            }
            arrayList = arrayList2;
        }
        return new qz51(errorHint, arrayList);
    }
}
