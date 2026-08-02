package com.ybsdk.feature.credit.deposit.internal.domain;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.d;
import com.ybsdk.feature.boostdeposit.internal.network.dto.BoostDepositAmountCheckRequest;
import com.ybsdk.feature.boostdeposit.internal.network.dto.BoostDepositPageRequest;
import com.ybsdk.feature.boostdeposit.internal.network.dto.BoostDepositTransactionStatusRequest;
import com.ybsdk.feature.credit.deposit.api.BoostDepositScreenParams;
import com.ybsdk.feature.credit.deposit.api.CreditDepositScreenParams;
import com.ybsdk.feature.credit.deposit.api.CreditLimitDepositScreenParams;
import com.ybsdk.feature.credit.deposit.api.CreditScreenParams;
import com.ybsdk.feature.credit.deposit.api.MkkDepositScreenParams;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditDepositAmountCheckRequest;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditDepositPageRequest;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditDepositTransactionStatusRequest;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CurrentPaymentMethodInfo;
import com.ybsdk.feature.credit.limitdeposit.internal.network.dto.CreditLimitDepositAmountCheckRequest;
import com.ybsdk.feature.credit.limitdeposit.internal.network.dto.CreditLimitDepositPageRequest;
import com.ybsdk.feature.credit.limitdeposit.internal.network.dto.CreditLimitDepositTransactionStatusRequest;
import com.ybsdk.feature.mkkdeposit.internal.network.dto.MkkDepositAmountCheckRequest;
import com.ybsdk.feature.mkkdeposit.internal.network.dto.MkkDepositPageRequest;
import com.ybsdk.feature.mkkdeposit.internal.network.dto.MkkDepositTransactionStatusRequest;
import com.ybsdk.utils.poller.b;
import com.ybsdk.utils.poller.c;
import defpackage.bob1;
import defpackage.d6v;
import defpackage.i0e0;
import defpackage.jzd0;
import defpackage.ny61;
import defpackage.qaf;
import defpackage.raf;
import defpackage.saf;
import defpackage.w511;
import defpackage.wzd0;
import defpackage.yzd0;
import java.math.BigDecimal;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.feature.credit.deposit.internal.data.a a;
    public final b b;

    public a(com.ybsdk.feature.credit.deposit.internal.data.a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(CreditScreenParams creditScreenParams, BigDecimal bigDecimal, String str, String str2, ContinuationImpl continuationImpl) {
        CreditDepositInteractor$checkAmount$1 creditDepositInteractor$checkAmount$1;
        int i;
        if (continuationImpl instanceof CreditDepositInteractor$checkAmount$1) {
            creditDepositInteractor$checkAmount$1 = (CreditDepositInteractor$checkAmount$1) continuationImpl;
            int i2 = creditDepositInteractor$checkAmount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                creditDepositInteractor$checkAmount$1.label = i2 - Integer.MIN_VALUE;
                CreditDepositInteractor$checkAmount$1 creditDepositInteractor$checkAmount$12 = creditDepositInteractor$checkAmount$1;
                Object obj = creditDepositInteractor$checkAmount$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditDepositInteractor$checkAmount$12.label;
                if (i == 0) {
                    if (i == 1 || i == 2 || i == 3 || i == 4) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                boolean z = creditScreenParams instanceof CreditDepositScreenParams;
                com.ybsdk.feature.credit.deposit.internal.data.a aVar = this.a;
                if (z) {
                    CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) creditScreenParams;
                    CreditDepositAmountCheckRequest creditDepositAmountCheckRequest = new CreditDepositAmountCheckRequest(creditDepositScreenParams.getAgreementId(), creditDepositScreenParams.getCreditType(), creditDepositScreenParams.getScenario(), new Money(bigDecimal, str), str2);
                    creditDepositInteractor$checkAmount$12.label = 1;
                    Object b = aVar.b(creditDepositAmountCheckRequest, creditDepositInteractor$checkAmount$12);
                    if (b != coroutineSingletons) {
                        return b;
                    }
                } else if (creditScreenParams instanceof CreditLimitDepositScreenParams) {
                    CreditLimitDepositScreenParams creditLimitDepositScreenParams = (CreditLimitDepositScreenParams) creditScreenParams;
                    CreditLimitDepositAmountCheckRequest creditLimitDepositAmountCheckRequest = new CreditLimitDepositAmountCheckRequest(creditLimitDepositScreenParams.getAgreementId(), new Money(bigDecimal, str), str2, creditLimitDepositScreenParams.getScenario());
                    creditDepositInteractor$checkAmount$12.label = 2;
                    Object c = aVar.c(creditLimitDepositAmountCheckRequest, creditDepositInteractor$checkAmount$12);
                    if (c != coroutineSingletons) {
                        return c;
                    }
                } else if (creditScreenParams instanceof MkkDepositScreenParams) {
                    MkkDepositScreenParams mkkDepositScreenParams = (MkkDepositScreenParams) creditScreenParams;
                    MkkDepositAmountCheckRequest mkkDepositAmountCheckRequest = new MkkDepositAmountCheckRequest(mkkDepositScreenParams.getAgreementId(), mkkDepositScreenParams.getScenario(), new Money(bigDecimal, str), str2);
                    creditDepositInteractor$checkAmount$12.label = 3;
                    Object d = aVar.d(mkkDepositAmountCheckRequest, creditDepositInteractor$checkAmount$12);
                    if (d != coroutineSingletons) {
                        return d;
                    }
                } else {
                    if (!(creditScreenParams instanceof BoostDepositScreenParams)) {
                        w511.b();
                        return null;
                    }
                    BoostDepositScreenParams boostDepositScreenParams = (BoostDepositScreenParams) creditScreenParams;
                    BoostDepositAmountCheckRequest boostDepositAmountCheckRequest = new BoostDepositAmountCheckRequest(boostDepositScreenParams.getAgreementId(), boostDepositScreenParams.getScenario(), new Money(bigDecimal, str));
                    creditDepositInteractor$checkAmount$12.label = 4;
                    Object a = aVar.a(boostDepositAmountCheckRequest, creditDepositInteractor$checkAmount$12);
                    if (a != coroutineSingletons) {
                        return a;
                    }
                }
                return coroutineSingletons;
            }
        }
        creditDepositInteractor$checkAmount$1 = new CreditDepositInteractor$checkAmount$1(this, continuationImpl);
        CreditDepositInteractor$checkAmount$1 creditDepositInteractor$checkAmount$122 = creditDepositInteractor$checkAmount$1;
        Object obj2 = creditDepositInteractor$checkAmount$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditDepositInteractor$checkAmount$122.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(CreditScreenParams creditScreenParams, BigDecimal bigDecimal, String str, String str2, String str3, d6v d6vVar, ContinuationImpl continuationImpl) {
        CreditDepositInteractor$createTransaction$1 creditDepositInteractor$createTransaction$1;
        int i;
        if (continuationImpl instanceof CreditDepositInteractor$createTransaction$1) {
            creditDepositInteractor$createTransaction$1 = (CreditDepositInteractor$createTransaction$1) continuationImpl;
            int i2 = creditDepositInteractor$createTransaction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                creditDepositInteractor$createTransaction$1.label = i2 - Integer.MIN_VALUE;
                CreditDepositInteractor$createTransaction$1 creditDepositInteractor$createTransaction$12 = creditDepositInteractor$createTransaction$1;
                Object obj = creditDepositInteractor$createTransaction$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditDepositInteractor$createTransaction$12.label;
                if (i == 0) {
                    if (i == 1 || i == 2 || i == 3 || i == 4) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (creditScreenParams instanceof CreditDepositScreenParams) {
                    CreditDepositInteractor$createTransaction$2 creditDepositInteractor$createTransaction$2 = new CreditDepositInteractor$createTransaction$2(creditScreenParams, bigDecimal, str, str2, str3, this, null);
                    creditDepositInteractor$createTransaction$12.label = 1;
                    Object a = d.a(d6vVar, creditDepositInteractor$createTransaction$2, creditDepositInteractor$createTransaction$12);
                    if (a != coroutineSingletons) {
                        return a;
                    }
                } else if (creditScreenParams instanceof CreditLimitDepositScreenParams) {
                    CreditDepositInteractor$createTransaction$3 creditDepositInteractor$createTransaction$3 = new CreditDepositInteractor$createTransaction$3(creditScreenParams, bigDecimal, str, str2, str3, this, null);
                    creditDepositInteractor$createTransaction$12.label = 2;
                    Object a2 = d.a(d6vVar, creditDepositInteractor$createTransaction$3, creditDepositInteractor$createTransaction$12);
                    if (a2 != coroutineSingletons) {
                        return a2;
                    }
                } else if (creditScreenParams instanceof MkkDepositScreenParams) {
                    CreditDepositInteractor$createTransaction$4 creditDepositInteractor$createTransaction$4 = new CreditDepositInteractor$createTransaction$4(creditScreenParams, bigDecimal, str, str2, str3, this, null);
                    creditDepositInteractor$createTransaction$12.label = 3;
                    Object a3 = d.a(d6vVar, creditDepositInteractor$createTransaction$4, creditDepositInteractor$createTransaction$12);
                    if (a3 != coroutineSingletons) {
                        return a3;
                    }
                } else {
                    if (!(creditScreenParams instanceof BoostDepositScreenParams)) {
                        w511.b();
                        return null;
                    }
                    CreditDepositInteractor$createTransaction$5 creditDepositInteractor$createTransaction$5 = new CreditDepositInteractor$createTransaction$5(creditScreenParams, bigDecimal, str, str2, str3, this, null);
                    creditDepositInteractor$createTransaction$12.label = 4;
                    Object a4 = d.a(d6vVar, creditDepositInteractor$createTransaction$5, creditDepositInteractor$createTransaction$12);
                    if (a4 != coroutineSingletons) {
                        return a4;
                    }
                }
                return coroutineSingletons;
            }
        }
        creditDepositInteractor$createTransaction$1 = new CreditDepositInteractor$createTransaction$1(this, continuationImpl);
        CreditDepositInteractor$createTransaction$1 creditDepositInteractor$createTransaction$122 = creditDepositInteractor$createTransaction$1;
        Object obj2 = creditDepositInteractor$createTransaction$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditDepositInteractor$createTransaction$122.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(CreditScreenParams creditScreenParams, MoneyEntity moneyEntity, saf safVar, String str, ContinuationImpl continuationImpl) {
        CreditDepositInteractor$getDepositPage$1 creditDepositInteractor$getDepositPage$1;
        int i;
        CurrentPaymentMethodInfo currentPaymentMethodInfo;
        if (continuationImpl instanceof CreditDepositInteractor$getDepositPage$1) {
            creditDepositInteractor$getDepositPage$1 = (CreditDepositInteractor$getDepositPage$1) continuationImpl;
            int i2 = creditDepositInteractor$getDepositPage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                creditDepositInteractor$getDepositPage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = creditDepositInteractor$getDepositPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditDepositInteractor$getDepositPage$1.label;
                if (i == 0) {
                    if (i == 1 || i == 2 || i == 3 || i == 4) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (str != null) {
                    currentPaymentMethodInfo = new CurrentPaymentMethodInfo(null, str);
                } else {
                    if (safVar != null) {
                        raf rafVar = safVar.i;
                        qaf qafVar = safVar.h;
                        if (qafVar != null || rafVar != null) {
                            currentPaymentMethodInfo = new CurrentPaymentMethodInfo(rafVar != null ? rafVar.a : null, qafVar != null ? qafVar.a : null);
                        }
                    }
                    currentPaymentMethodInfo = null;
                }
                boolean z = creditScreenParams instanceof CreditDepositScreenParams;
                com.ybsdk.feature.credit.deposit.internal.data.a aVar = this.a;
                if (z) {
                    CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) creditScreenParams;
                    CreditDepositPageRequest creditDepositPageRequest = new CreditDepositPageRequest(creditDepositScreenParams.getAgreementId(), creditDepositScreenParams.getCreditType(), creditDepositScreenParams.getScenario(), moneyEntity != null ? bob1.f(moneyEntity) : null, currentPaymentMethodInfo);
                    creditDepositInteractor$getDepositPage$1.label = 1;
                    Object k = aVar.k(creditDepositPageRequest, creditDepositInteractor$getDepositPage$1);
                    if (k != coroutineSingletons) {
                        return k;
                    }
                } else if (creditScreenParams instanceof CreditLimitDepositScreenParams) {
                    CreditLimitDepositScreenParams creditLimitDepositScreenParams = (CreditLimitDepositScreenParams) creditScreenParams;
                    CreditLimitDepositPageRequest creditLimitDepositPageRequest = new CreditLimitDepositPageRequest(creditLimitDepositScreenParams.getAgreementId(), moneyEntity != null ? bob1.f(moneyEntity) : null, currentPaymentMethodInfo, creditLimitDepositScreenParams.getScenario());
                    creditDepositInteractor$getDepositPage$1.label = 2;
                    Object l = aVar.l(creditLimitDepositPageRequest, creditDepositInteractor$getDepositPage$1);
                    if (l != coroutineSingletons) {
                        return l;
                    }
                } else if (creditScreenParams instanceof MkkDepositScreenParams) {
                    MkkDepositScreenParams mkkDepositScreenParams = (MkkDepositScreenParams) creditScreenParams;
                    MkkDepositPageRequest mkkDepositPageRequest = new MkkDepositPageRequest(mkkDepositScreenParams.getAgreementId(), mkkDepositScreenParams.getScenario(), moneyEntity != null ? bob1.f(moneyEntity) : null, currentPaymentMethodInfo);
                    creditDepositInteractor$getDepositPage$1.label = 3;
                    Object o = aVar.o(mkkDepositPageRequest, creditDepositInteractor$getDepositPage$1);
                    if (o != coroutineSingletons) {
                        return o;
                    }
                } else {
                    if (!(creditScreenParams instanceof BoostDepositScreenParams)) {
                        w511.b();
                        return null;
                    }
                    BoostDepositScreenParams boostDepositScreenParams = (BoostDepositScreenParams) creditScreenParams;
                    BoostDepositPageRequest boostDepositPageRequest = new BoostDepositPageRequest(boostDepositScreenParams.getAgreementId(), boostDepositScreenParams.getScenario(), moneyEntity != null ? bob1.f(moneyEntity) : null, currentPaymentMethodInfo);
                    creditDepositInteractor$getDepositPage$1.label = 4;
                    Object i3 = aVar.i(boostDepositPageRequest, creditDepositInteractor$getDepositPage$1);
                    if (i3 != coroutineSingletons) {
                        return i3;
                    }
                }
                return coroutineSingletons;
            }
        }
        creditDepositInteractor$getDepositPage$1 = new CreditDepositInteractor$getDepositPage$1(this, continuationImpl);
        Object obj2 = creditDepositInteractor$getDepositPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditDepositInteractor$getDepositPage$1.label;
        if (i == 0) {
        }
    }

    public final Object d(String str, CreditScreenParams creditScreenParams, Continuation continuation) {
        c c;
        boolean z = creditScreenParams instanceof CreditDepositScreenParams;
        b bVar = this.b;
        if (z) {
            CreditDepositScreenParams creditDepositScreenParams = (CreditDepositScreenParams) creditScreenParams;
            c = bVar.c(yzd0.b, new CreditDepositInteractor$getTransactionStatusFlow$2(2, null), new CreditDepositInteractor$getTransactionStatusFlow$3(this, new CreditDepositTransactionStatusRequest(str, creditDepositScreenParams.getCreditType(), creditDepositScreenParams.getScenario()), null));
        } else if (creditScreenParams instanceof CreditLimitDepositScreenParams) {
            c = bVar.c(wzd0.b, new CreditDepositInteractor$getTransactionStatusFlow$4(2, null), new CreditDepositInteractor$getTransactionStatusFlow$5(this, new CreditLimitDepositTransactionStatusRequest(str, ((CreditLimitDepositScreenParams) creditScreenParams).getScenario()), null));
        } else if (creditScreenParams instanceof MkkDepositScreenParams) {
            c = bVar.c(i0e0.b, new CreditDepositInteractor$getTransactionStatusFlow$6(2, null), new CreditDepositInteractor$getTransactionStatusFlow$7(this, new MkkDepositTransactionStatusRequest(str, ((MkkDepositScreenParams) creditScreenParams).getScenario()), null));
        } else {
            if (!(creditScreenParams instanceof BoostDepositScreenParams)) {
                w511.b();
                return null;
            }
            c = bVar.c(jzd0.b, new CreditDepositInteractor$getTransactionStatusFlow$8(2, null), new CreditDepositInteractor$getTransactionStatusFlow$9(this, new BoostDepositTransactionStatusRequest(str, ((BoostDepositScreenParams) creditScreenParams).getScenario()), null));
        }
        return c.d(null, (ContinuationImpl) continuation);
    }
}
