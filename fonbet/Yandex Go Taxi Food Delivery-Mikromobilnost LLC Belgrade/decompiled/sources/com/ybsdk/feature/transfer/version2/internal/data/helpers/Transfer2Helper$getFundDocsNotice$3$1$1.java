package com.ybsdk.feature.transfer.version2.internal.data.helpers;

import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;
import com.ybsdk.feature.transfer.version2.internal.network.dto.fund.FundDocsNoticeResult;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qg01;
import defpackage.rr51;
import defpackage.w511;
import defpackage.wls;
import defpackage.xns;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fund/FundDocsNoticeResult;", "noticeResult", "Lkotlin/Result;", "Lxns;", "<anonymous>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fund/FundDocsNoticeResult;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.data.helpers.Transfer2Helper$getFundDocsNotice$3$1$1", f = "Transfer2Helper.kt", l = {273}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Transfer2Helper$getFundDocsNotice$3$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Transfer2Helper$getFundDocsNotice$3$1$1 transfer2Helper$getFundDocsNotice$3$1$1 = new Transfer2Helper$getFundDocsNotice$3$1$1(2, continuation);
        transfer2Helper$getFundDocsNotice$3$1$1.L$0 = obj;
        return transfer2Helper$getFundDocsNotice$3$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Transfer2Helper$getFundDocsNotice$3$1$1) create((FundDocsNoticeResult) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FundDocsNoticeResult fundDocsNoticeResult;
        rr51 rr51Var;
        Object a;
        int i;
        ResultStatus resultStatus;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            FundDocsNoticeResult fundDocsNoticeResult2 = (FundDocsNoticeResult) this.L$0;
            DivDataDto divkitData = fundDocsNoticeResult2.getDivkitData();
            if (divkitData == null) {
                fundDocsNoticeResult = fundDocsNoticeResult2;
                rr51Var = null;
                i = qg01.a[fundDocsNoticeResult.getStatus().ordinal()];
                if (i != 1) {
                    resultStatus = ResultStatus.SUCCESS;
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    resultStatus = ResultStatus.PROCESSING;
                }
                return new Result(new xns(resultStatus, rr51Var));
            }
            this.L$0 = fundDocsNoticeResult2;
            this.label = 1;
            a = com.ybsdk.feature.divkit.internal.a.a(divkitData, new com.ybsdk.feature.divkit.api.domain.a(null), this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = a;
            fundDocsNoticeResult = fundDocsNoticeResult2;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fundDocsNoticeResult = (FundDocsNoticeResult) this.L$0;
            kotlin.b.b(obj);
        }
        rr51Var = (rr51) obj;
        i = qg01.a[fundDocsNoticeResult.getStatus().ordinal()];
        if (i != 1) {
        }
        return new Result(new xns(resultStatus, rr51Var));
    }
}
