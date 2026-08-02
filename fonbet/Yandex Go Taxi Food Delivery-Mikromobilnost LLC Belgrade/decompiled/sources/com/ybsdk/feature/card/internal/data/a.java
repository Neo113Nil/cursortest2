package com.ybsdk.feature.card.internal.data;

import com.ybsdk.core.common.data.network.dto.LimitHintDto;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import com.ybsdk.core.utils.dto.SecondAuthorizationResponse;
import com.ybsdk.core.utils.dto.e;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.card.internal.network.CardApi;
import com.ybsdk.feature.card.internal.network.dto.CardPeriodLimitDto;
import com.ybsdk.feature.card.internal.network.dto.GetPeriodLimitsResponse;
import defpackage.bob1;
import defpackage.evu0;
import defpackage.il8;
import defpackage.iyd0;
import defpackage.nfy;
import defpackage.ny61;
import defpackage.ofy;
import defpackage.qi8;
import defpackage.ri8;
import defpackage.sd8;
import defpackage.tcc;
import defpackage.w530;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final CardApi a;
    public final ri8 b;

    public a(CardApi cardApi, ri8 ri8Var) {
        this.a = cardApi;
        this.b = ri8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        if (r6 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        CardLimitsRepository$getPeriodLimitsInfo$1 cardLimitsRepository$getPeriodLimitsInfo$1;
        int i;
        Object c;
        ri8 ri8Var;
        ?? r12;
        if (continuationImpl instanceof CardLimitsRepository$getPeriodLimitsInfo$1) {
            cardLimitsRepository$getPeriodLimitsInfo$1 = (CardLimitsRepository$getPeriodLimitsInfo$1) continuationImpl;
            int i2 = cardLimitsRepository$getPeriodLimitsInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardLimitsRepository$getPeriodLimitsInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardLimitsRepository$getPeriodLimitsInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardLimitsRepository$getPeriodLimitsInfo$1.label;
                String str2 = null;
                if (i != 0) {
                    b.b(obj);
                    CardLimitsRepository$getPeriodLimitsInfo$2 cardLimitsRepository$getPeriodLimitsInfo$2 = new CardLimitsRepository$getPeriodLimitsInfo$2(this, str, null);
                    cardLimitsRepository$getPeriodLimitsInfo$1.label = 1;
                    c = c.c(cardLimitsRepository$getPeriodLimitsInfo$2, cardLimitsRepository$getPeriodLimitsInfo$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                if (!(c instanceof Result.Failure)) {
                    return c;
                }
                ri8 ri8Var2 = this.b;
                ri8Var2.getClass();
                List<CardPeriodLimitDto> limits = ((GetPeriodLimitsResponse) c).getLimits();
                int i3 = 10;
                ArrayList arrayList = new ArrayList(tcc.n(limits, 10));
                for (CardPeriodLimitDto cardPeriodLimitDto : limits) {
                    String settingKey = cardPeriodLimitDto.getSettingKey();
                    String periodTitle = cardPeriodLimitDto.getPeriodTitle();
                    String inputTitle = cardPeriodLimitDto.getInputTitle();
                    BigDecimal defaultValue = cardPeriodLimitDto.getDefaultValue();
                    String currency = cardPeriodLimitDto.getCurrency();
                    if (currency != null) {
                        if (evu0.J(currency)) {
                            currency = str2;
                        }
                    }
                    currency = NumberFormatUtils$Currencies.RUB.getIso();
                    String str3 = currency;
                    List<LimitHintDto> limitHints = cardPeriodLimitDto.getLimitHints();
                    if (limitHints != null) {
                        List<LimitHintDto> list = limitHints;
                        r12 = new ArrayList(tcc.n(list, i3));
                        for (LimitHintDto limitHintDto : list) {
                            Money lowerLimit = limitHintDto.getCondition().getLowerLimit();
                            w530 w530Var = ri8Var2.a;
                            MoneyEntity g = bob1.g(lowerLimit, w530Var);
                            ri8 ri8Var3 = ri8Var2;
                            Money upperLimit = limitHintDto.getCondition().getUpperLimit();
                            r12.add(new ofy(new nfy(g, upperLimit != null ? bob1.g(upperLimit, w530Var) : null), limitHintDto.getHint()));
                            ri8Var2 = ri8Var3;
                        }
                        ri8Var = ri8Var2;
                    } else {
                        ri8Var = ri8Var2;
                        r12 = EmptyList.a;
                    }
                    arrayList.add(new il8(settingKey, periodTitle, inputTitle, defaultValue, str3, r12, cardPeriodLimitDto.getSelected()));
                    ri8Var2 = ri8Var;
                    i3 = 10;
                    str2 = null;
                }
                return new qi8(arrayList);
            }
        }
        cardLimitsRepository$getPeriodLimitsInfo$1 = new CardLimitsRepository$getPeriodLimitsInfo$1(this, continuationImpl);
        Object obj2 = cardLimitsRepository$getPeriodLimitsInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardLimitsRepository$getPeriodLimitsInfo$1.label;
        String str22 = null;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, BigDecimal bigDecimal, String str3, String str4, int i, ContinuationImpl continuationImpl) {
        CardLimitsRepository$setPeriodLimits$1 cardLimitsRepository$setPeriodLimits$1;
        int i2;
        Object c;
        Throwable a;
        if (continuationImpl instanceof CardLimitsRepository$setPeriodLimits$1) {
            cardLimitsRepository$setPeriodLimits$1 = (CardLimitsRepository$setPeriodLimits$1) continuationImpl;
            int i3 = cardLimitsRepository$setPeriodLimits$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cardLimitsRepository$setPeriodLimits$1.label = i3 - Integer.MIN_VALUE;
                Object obj = cardLimitsRepository$setPeriodLimits$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = cardLimitsRepository$setPeriodLimits$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    CardLimitsRepository$setPeriodLimits$2 cardLimitsRepository$setPeriodLimits$2 = new CardLimitsRepository$setPeriodLimits$2(this, str, str2, bigDecimal, str3, str4, i, null);
                    cardLimitsRepository$setPeriodLimits$1.label = 1;
                    c = c.c(cardLimitsRepository$setPeriodLimits$2, cardLimitsRepository$setPeriodLimits$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                iyd0 iyd0Var = (iyd0) c;
                Object a2 = e.a((SecondAuthorizationResponse) iyd0Var.a, new sd8(12));
                return !(a2 instanceof Result.Failure) ? new iyd0(iyd0Var.b, a2) : a2;
            }
        }
        cardLimitsRepository$setPeriodLimits$1 = new CardLimitsRepository$setPeriodLimits$1(this, continuationImpl);
        Object obj2 = cardLimitsRepository$setPeriodLimits$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = cardLimitsRepository$setPeriodLimits$1.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
