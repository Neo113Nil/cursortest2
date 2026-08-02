package com.ybsdk.feature.savings.internal.data;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.network.dto.FundNeedConfirmationDataDto;
import com.ybsdk.feature.savings.internal.network.dto.FundOperationInProgressDataDto;
import com.ybsdk.feature.savings.internal.network.dto.FundOperationRequestStatusSuccessResponseDto;
import com.ybsdk.feature.savings.internal.network.dto.FundOperationSuccessDataDto;
import com.ybsdk.feature.savings.internal.network.dto.FundResultDataDto;
import defpackage.dps;
import defpackage.eps;
import defpackage.g8e;
import defpackage.gps;
import defpackage.ips;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationRequestStatusSuccessResponseDto;", "response", "Lhps;", "<anonymous>", "(Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationRequestStatusSuccessResponseDto;)Lhps;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.data.SavingsRepository$requestFundOperationStatus$3$1$1", f = "SavingsRepository.kt", l = {373}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsRepository$requestFundOperationStatus$3$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SavingsRepository$requestFundOperationStatus$3$1$1 savingsRepository$requestFundOperationStatus$3$1$1 = new SavingsRepository$requestFundOperationStatus$3$1$1(2, continuation);
        savingsRepository$requestFundOperationStatus$3$1$1.L$0 = obj;
        return savingsRepository$requestFundOperationStatus$3$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsRepository$requestFundOperationStatus$3$1$1) create((FundOperationRequestStatusSuccessResponseDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = null;
        obj2 = null;
        obj2 = null;
        obj2 = null;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        FundOperationRequestStatusSuccessResponseDto fundOperationRequestStatusSuccessResponseDto = (FundOperationRequestStatusSuccessResponseDto) this.L$0;
        this.label = 1;
        int i2 = ips.a[fundOperationRequestStatusSuccessResponseDto.getStatus().ordinal()];
        if (i2 == 1) {
            FundOperationInProgressDataDto inProgressData = fundOperationRequestStatusSuccessResponseDto.getInProgressData();
            if (inProgressData != null) {
                FundResultDataDto resultStatusData = fundOperationRequestStatusSuccessResponseDto.getResultStatusData();
                Text.Constant i3 = g8e.i(Text.Companion, inProgressData.getTitle());
                String subtitle = inProgressData.getSubtitle();
                obj2 = new dps(i3, subtitle != null ? new Text.Constant(subtitle) : null, resultStatusData != null ? com.ybsdk.feature.savings.internal.entities.b.a(resultStatusData) : null);
            }
        } else if (i2 == 2) {
            FundNeedConfirmationDataDto needConfirmationData = fundOperationRequestStatusSuccessResponseDto.getNeedConfirmationData();
            if (needConfirmationData != null && (obj2 = com.ybsdk.feature.savings.internal.entities.b.b(needConfirmationData, this)) != coroutineSingletons) {
                obj2 = (eps) obj2;
            }
        } else if (i2 == 3) {
            FundOperationSuccessDataDto successData = fundOperationRequestStatusSuccessResponseDto.getSuccessData();
            if (successData != null) {
                obj2 = new gps(successData.getAction());
            }
        } else {
            if (i2 != 4) {
                w511.b();
                return null;
            }
            FundResultDataDto resultStatusData2 = fundOperationRequestStatusSuccessResponseDto.getResultStatusData();
            if (resultStatusData2 != null) {
                obj2 = com.ybsdk.feature.savings.internal.entities.b.a(resultStatusData2);
            }
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : obj2;
    }
}
