package com.yandex.go.payments.domain;

import com.yandex.go.payments.api.interactor.BankPaymentsDepositType;
import com.yandex.go.payments.paymentlist.experiments.YbWalletTopUpRuleExperiment;
import defpackage.az51;
import defpackage.bz51;
import defpackage.ny61;
import defpackage.sjp;
import defpackage.w511;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class r0 {
    public final sjp a;

    public r0(sjp sjpVar) {
        this.a = sjpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(BigDecimal bigDecimal, String str, ContinuationImpl continuationImpl) {
        YbWalletTopUpAmountExperimentInteractor$getTopUpAmount$1 ybWalletTopUpAmountExperimentInteractor$getTopUpAmount$1;
        int i;
        boolean z;
        BankPaymentsDepositType bankPaymentsDepositType;
        BigDecimal multiply;
        if (continuationImpl instanceof YbWalletTopUpAmountExperimentInteractor$getTopUpAmount$1) {
            ybWalletTopUpAmountExperimentInteractor$getTopUpAmount$1 = (YbWalletTopUpAmountExperimentInteractor$getTopUpAmount$1) continuationImpl;
            int i2 = ybWalletTopUpAmountExperimentInteractor$getTopUpAmount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybWalletTopUpAmountExperimentInteractor$getTopUpAmount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybWalletTopUpAmountExperimentInteractor$getTopUpAmount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybWalletTopUpAmountExperimentInteractor$getTopUpAmount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ybWalletTopUpAmountExperimentInteractor$getTopUpAmount$1.L$0 = bigDecimal;
                    ybWalletTopUpAmountExperimentInteractor$getTopUpAmount$1.L$1 = str;
                    ybWalletTopUpAmountExperimentInteractor$getTopUpAmount$1.label = 1;
                    obj = this.a.b.b(ybWalletTopUpAmountExperimentInteractor$getTopUpAmount$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) ybWalletTopUpAmountExperimentInteractor$getTopUpAmount$1.L$1;
                    bigDecimal = (BigDecimal) ybWalletTopUpAmountExperimentInteractor$getTopUpAmount$1.L$0;
                    kotlin.b.b(obj);
                }
                YbWalletTopUpRuleExperiment ybWalletTopUpRuleExperiment = (YbWalletTopUpRuleExperiment) obj;
                z = ybWalletTopUpRuleExperiment.b;
                YbWalletTopUpRuleExperiment.TopUpRule topUpRule = ybWalletTopUpRuleExperiment.c;
                if (z) {
                    int[] iArr = bz51.a;
                    int i3 = iArr[topUpRule.ordinal()];
                    if (i3 == 1) {
                        bankPaymentsDepositType = BankPaymentsDepositType.ORDER_AMOUNT;
                    } else if (i3 == 2 || i3 == 3) {
                        bankPaymentsDepositType = BankPaymentsDepositType.EXACT_AMOUNT;
                    } else if (i3 != 4) {
                        w511.b();
                        return null;
                    }
                    int i4 = iArr[topUpRule.ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2) {
                            if (bigDecimal.signum() < 1) {
                                multiply = BigDecimal.ZERO;
                            } else {
                                BigDecimal pow = BigDecimal.TEN.pow((int) Math.floor(Math.log10(bigDecimal.doubleValue())));
                                multiply = bigDecimal.divide(pow, 0, RoundingMode.CEILING).multiply(pow);
                            }
                            bigDecimal = multiply;
                        } else if (i4 != 3) {
                            if (i4 != 4) {
                                w511.b();
                                return null;
                            }
                        }
                    }
                    return new az51(bigDecimal, str, bankPaymentsDepositType);
                }
                return null;
            }
        }
        ybWalletTopUpAmountExperimentInteractor$getTopUpAmount$1 = new YbWalletTopUpAmountExperimentInteractor$getTopUpAmount$1(this, continuationImpl);
        Object obj2 = ybWalletTopUpAmountExperimentInteractor$getTopUpAmount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybWalletTopUpAmountExperimentInteractor$getTopUpAmount$1.label;
        if (i != 0) {
        }
        YbWalletTopUpRuleExperiment ybWalletTopUpRuleExperiment2 = (YbWalletTopUpRuleExperiment) obj2;
        z = ybWalletTopUpRuleExperiment2.b;
        YbWalletTopUpRuleExperiment.TopUpRule topUpRule2 = ybWalletTopUpRuleExperiment2.c;
        if (z) {
        }
        return null;
    }
}
