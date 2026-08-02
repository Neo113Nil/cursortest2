package com.ybsdk.feature.savings.internal.data;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.entities.c;
import com.ybsdk.feature.savings.internal.network.dto.FundRequestStatusInProgressDataDto;
import com.ybsdk.feature.savings.internal.network.dto.FundRequestStatusOpenAndTopupDataDto;
import com.ybsdk.feature.savings.internal.network.dto.FundRequestStatusResultDataDto;
import com.ybsdk.feature.savings.internal.network.dto.FundRequestStatusSuccessDataDto;
import com.ybsdk.feature.savings.internal.network.dto.FundRequestStatusSuccessResponseDto;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ups;
import defpackage.vps;
import defpackage.w511;
import defpackage.wls;
import defpackage.wps;
import defpackage.yps;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusSuccessResponseDto;", "response", "Lzps;", "<anonymous>", "(Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusSuccessResponseDto;)Lzps;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.data.SavingsRepository$requestFundStatus$3$1$1", f = "SavingsRepository.kt", l = {320}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsRepository$requestFundStatus$3$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsRepository$requestFundStatus$3$1$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SavingsRepository$requestFundStatus$3$1$1 savingsRepository$requestFundStatus$3$1$1 = new SavingsRepository$requestFundStatus$3$1$1(this.this$0, continuation);
        savingsRepository$requestFundStatus$3$1$1.L$0 = obj;
        return savingsRepository$requestFundStatus$3$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsRepository$requestFundStatus$3$1$1) create((FundRequestStatusSuccessResponseDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        FundRequestStatusSuccessResponseDto fundRequestStatusSuccessResponseDto = (FundRequestStatusSuccessResponseDto) this.L$0;
        c cVar = this.this$0.g;
        this.label = 1;
        cVar.getClass();
        int i2 = ups.a[fundRequestStatusSuccessResponseDto.getStatus().ordinal()];
        if (i2 == 1) {
            FundRequestStatusInProgressDataDto inProgressData = fundRequestStatusSuccessResponseDto.getInProgressData();
            if (inProgressData != null) {
                FundRequestStatusResultDataDto resultStatusData = fundRequestStatusSuccessResponseDto.getResultStatusData();
                Text.Constant i3 = g8e.i(Text.Companion, inProgressData.getTitle());
                String subtitle = inProgressData.getSubtitle();
                obj2 = new vps(i3, subtitle != null ? new Text.Constant(subtitle) : null, resultStatusData != null ? c.a(resultStatusData) : null);
            }
        } else if (i2 == 2) {
            FundRequestStatusOpenAndTopupDataDto openAndTopupData = fundRequestStatusSuccessResponseDto.getOpenAndTopupData();
            if (openAndTopupData != null && (obj2 = cVar.b(openAndTopupData, this)) != coroutineSingletons) {
                obj2 = (wps) obj2;
            }
        } else if (i2 == 3) {
            FundRequestStatusSuccessDataDto successData = fundRequestStatusSuccessResponseDto.getSuccessData();
            if (successData != null) {
                obj2 = new yps(successData.getAction());
            }
        } else {
            if (i2 != 4) {
                w511.b();
                return null;
            }
            FundRequestStatusResultDataDto resultStatusData2 = fundRequestStatusSuccessResponseDto.getResultStatusData();
            if (resultStatusData2 != null) {
                obj2 = c.a(resultStatusData2);
            }
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : obj2;
    }
}
