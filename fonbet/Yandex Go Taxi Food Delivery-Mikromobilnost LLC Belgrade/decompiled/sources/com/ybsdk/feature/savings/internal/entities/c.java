package com.ybsdk.feature.savings.internal.entities;

import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.savings.internal.network.dto.FundOpenLimitsDataDto;
import com.ybsdk.feature.savings.internal.network.dto.FundRequestStatusOpenAndTopupDataDto;
import com.ybsdk.feature.savings.internal.network.dto.FundRequestStatusResultDataDto;
import defpackage.aqs;
import defpackage.bob1;
import defpackage.g8e;
import defpackage.h5a0;
import defpackage.j5a0;
import defpackage.ny61;
import defpackage.qgf;
import defpackage.qxy0;
import defpackage.rr51;
import defpackage.uda0;
import defpackage.uos;
import defpackage.w530;
import defpackage.wps;
import defpackage.xps;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class c {
    public final w530 a;

    public c(w530 w530Var) {
        this.a = w530Var;
    }

    public static xps a(FundRequestStatusResultDataDto fundRequestStatusResultDataDto) {
        ThemedImageUrlEntity c = qxy0.c(fundRequestStatusResultDataDto.getImage(), null);
        Text.Constant i = g8e.i(Text.Companion, fundRequestStatusResultDataDto.getTitle());
        String subtitle = fundRequestStatusResultDataDto.getSubtitle();
        return new xps(null, c, i, subtitle != null ? new Text.Constant(subtitle) : null, aqs.a(fundRequestStatusResultDataDto.getButton()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(FundRequestStatusOpenAndTopupDataDto fundRequestStatusOpenAndTopupDataDto, ContinuationImpl continuationImpl) {
        FundRequestStatusMapper$toEntity$2 fundRequestStatusMapper$toEntity$2;
        int i;
        Object b;
        FundRequestStatusOpenAndTopupDataDto fundRequestStatusOpenAndTopupDataDto2;
        rr51 rr51Var;
        if (continuationImpl instanceof FundRequestStatusMapper$toEntity$2) {
            fundRequestStatusMapper$toEntity$2 = (FundRequestStatusMapper$toEntity$2) continuationImpl;
            int i2 = fundRequestStatusMapper$toEntity$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fundRequestStatusMapper$toEntity$2.label = i2 - Integer.MIN_VALUE;
                Object obj = fundRequestStatusMapper$toEntity$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fundRequestStatusMapper$toEntity$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                    DivDataDto bottomDivkitWidget = fundRequestStatusOpenAndTopupDataDto.getBottomDivkitWidget();
                    fundRequestStatusMapper$toEntity$2.L$0 = fundRequestStatusOpenAndTopupDataDto;
                    fundRequestStatusMapper$toEntity$2.label = 1;
                    b = aVar.b(bottomDivkitWidget, fundRequestStatusMapper$toEntity$2);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    fundRequestStatusOpenAndTopupDataDto2 = fundRequestStatusOpenAndTopupDataDto;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fundRequestStatusOpenAndTopupDataDto2 = (FundRequestStatusOpenAndTopupDataDto) fundRequestStatusMapper$toEntity$2.L$0;
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (b instanceof Result.Failure) {
                    b = null;
                }
                rr51Var = (rr51) b;
                if (rr51Var != null) {
                    return null;
                }
                Text.Constant i3 = g8e.i(Text.Companion, fundRequestStatusOpenAndTopupDataDto2.getTitle());
                Text.Constant constant = new Text.Constant(fundRequestStatusOpenAndTopupDataDto2.getSubtitle());
                CurrentPaymentMethodDto currentPaymentMethod = fundRequestStatusOpenAndTopupDataDto2.getCurrentPaymentMethod();
                w530 w530Var = this.a;
                h5a0 a = currentPaymentMethod != null ? qgf.a(currentPaymentMethod, w530Var, false) : null;
                uda0 b2 = j5a0.b(fundRequestStatusOpenAndTopupDataDto2.getPaymentMethodsList(), w530Var, false);
                Money money = fundRequestStatusOpenAndTopupDataDto2.getMoney();
                MoneyEntity g = money != null ? bob1.g(money, w530Var) : null;
                FundOpenLimitsDataDto limitsData = fundRequestStatusOpenAndTopupDataDto2.getLimitsData();
                return new wps(i3, constant, a, b2, g, new uos(limitsData.getMinLimit(), new Text.Constant(limitsData.getMinLimitText()), new Text.Constant(limitsData.getNotEnoughFundsText())), rr51Var, new Text.Constant(fundRequestStatusOpenAndTopupDataDto2.getSaveButtonText()), fundRequestStatusOpenAndTopupDataDto2.getAgreementId());
            }
        }
        fundRequestStatusMapper$toEntity$2 = new FundRequestStatusMapper$toEntity$2(this, continuationImpl);
        Object obj2 = fundRequestStatusMapper$toEntity$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fundRequestStatusMapper$toEntity$2.label;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
        rr51Var = (rr51) b;
        if (rr51Var != null) {
        }
    }
}
