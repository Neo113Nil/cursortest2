package com.ybsdk.feature.savings.internal.interactors;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.poller.PollerTimeoutException;
import com.ybsdk.feature.savings.internal.entities.SavingsAccountCreationStatusEntity$Status;
import defpackage.a1e0;
import defpackage.d6v;
import defpackage.ny61;
import defpackage.tls;
import defpackage.u4m0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class c {
    public final com.ybsdk.feature.savings.internal.data.b a;
    public final com.ybsdk.utils.poller.b b;
    public volatile u4m0 c;

    public c(com.ybsdk.feature.savings.internal.data.b bVar, com.ybsdk.utils.poller.b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, MoneyEntity moneyEntity, d6v d6vVar, ContinuationImpl continuationImpl) {
        SavingsAccountCreationInteractor$create$1 savingsAccountCreationInteractor$create$1;
        int i;
        if (continuationImpl instanceof SavingsAccountCreationInteractor$create$1) {
            savingsAccountCreationInteractor$create$1 = (SavingsAccountCreationInteractor$create$1) continuationImpl;
            int i2 = savingsAccountCreationInteractor$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsAccountCreationInteractor$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsAccountCreationInteractor$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsAccountCreationInteractor$create$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                SavingsAccountCreationInteractor$create$2 savingsAccountCreationInteractor$create$2 = new SavingsAccountCreationInteractor$create$2(this, str, str2, moneyEntity, null);
                savingsAccountCreationInteractor$create$1.label = 1;
                Object a = com.ybsdk.core.utils.d.a(d6vVar, savingsAccountCreationInteractor$create$2, savingsAccountCreationInteractor$create$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        savingsAccountCreationInteractor$create$1 = new SavingsAccountCreationInteractor$create$1(this, continuationImpl);
        Object obj2 = savingsAccountCreationInteractor$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsAccountCreationInteractor$create$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, tls tlsVar, ContinuationImpl continuationImpl) {
        SavingsAccountCreationInteractor$pollStatus$1 savingsAccountCreationInteractor$pollStatus$1;
        int i;
        Object e;
        Throwable a;
        String str2;
        String str3;
        String str4 = str;
        if (continuationImpl instanceof SavingsAccountCreationInteractor$pollStatus$1) {
            savingsAccountCreationInteractor$pollStatus$1 = (SavingsAccountCreationInteractor$pollStatus$1) continuationImpl;
            int i2 = savingsAccountCreationInteractor$pollStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsAccountCreationInteractor$pollStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsAccountCreationInteractor$pollStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsAccountCreationInteractor$pollStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.utils.poller.c c = this.b.c(a1e0.b, new SavingsAccountCreationInteractor$pollStatus$2(2, null), new SavingsAccountCreationInteractor$pollStatus$3(this, str4, tlsVar, null));
                    savingsAccountCreationInteractor$pollStatus$1.L$0 = str4;
                    savingsAccountCreationInteractor$pollStatus$1.label = 1;
                    e = c.e(savingsAccountCreationInteractor$pollStatus$1);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str4 = (String) savingsAccountCreationInteractor$pollStatus$1.L$0;
                    kotlin.b.b(obj);
                    e = ((Result) obj).getValue();
                }
                a = Result.a(e);
                if (!(a instanceof FailDataException)) {
                    u4m0 u4m0Var = this.c;
                    FailDataException failDataException = (FailDataException) a;
                    return new u4m0((u4m0Var == null || (str3 = u4m0Var.a) == null) ? str4 : str3, SavingsAccountCreationStatusEntity$Status.FAIL, failDataException.getError(), failDataException.getDescription(), null, null, null, failDataException.getSupportUrl(), null);
                }
                if (!(a instanceof PollerTimeoutException)) {
                    return e;
                }
                u4m0 u4m0Var2 = this.c;
                String str5 = (u4m0Var2 == null || (str2 = u4m0Var2.a) == null) ? str4 : str2;
                SavingsAccountCreationStatusEntity$Status savingsAccountCreationStatusEntity$Status = SavingsAccountCreationStatusEntity$Status.TIMEOUT;
                u4m0 u4m0Var3 = this.c;
                String str6 = u4m0Var3 != null ? u4m0Var3.c : null;
                u4m0 u4m0Var4 = this.c;
                String str7 = u4m0Var4 != null ? u4m0Var4.d : null;
                u4m0 u4m0Var5 = this.c;
                return new u4m0(str5, savingsAccountCreationStatusEntity$Status, str6, str7, u4m0Var5 != null ? u4m0Var5.e : null, null, null, null, null);
            }
        }
        savingsAccountCreationInteractor$pollStatus$1 = new SavingsAccountCreationInteractor$pollStatus$1(this, continuationImpl);
        Object obj2 = savingsAccountCreationInteractor$pollStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsAccountCreationInteractor$pollStatus$1.label;
        if (i != 0) {
        }
        a = Result.a(e);
        if (!(a instanceof FailDataException)) {
        }
    }
}
