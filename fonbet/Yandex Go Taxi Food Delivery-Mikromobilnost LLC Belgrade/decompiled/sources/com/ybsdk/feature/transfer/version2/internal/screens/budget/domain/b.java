package com.ybsdk.feature.transfer.version2.internal.screens.budget.domain;

import com.ybsdk.core.utils.d;
import com.ybsdk.utils.poller.c;
import defpackage.cd0;
import defpackage.d6v;
import defpackage.kzd0;
import defpackage.ny61;
import defpackage.tpr;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final com.ybsdk.feature.transfer.version2.internal.screens.budget.data.a a;
    public final com.ybsdk.utils.poller.b b;

    public b(com.ybsdk.feature.transfer.version2.internal.screens.budget.data.a aVar, com.ybsdk.utils.poller.b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        BudgetChargesInteractor$getCharges$1 budgetChargesInteractor$getCharges$1;
        int i;
        if (continuationImpl instanceof BudgetChargesInteractor$getCharges$1) {
            budgetChargesInteractor$getCharges$1 = (BudgetChargesInteractor$getCharges$1) continuationImpl;
            int i2 = budgetChargesInteractor$getCharges$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                budgetChargesInteractor$getCharges$1.label = i2 - Integer.MIN_VALUE;
                Object obj = budgetChargesInteractor$getCharges$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = budgetChargesInteractor$getCharges$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    budgetChargesInteractor$getCharges$1.label = 1;
                    Object b = this.a.b(budgetChargesInteractor$getCharges$1);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        budgetChargesInteractor$getCharges$1 = new BudgetChargesInteractor$getCharges$1(this, continuationImpl);
        Object obj2 = budgetChargesInteractor$getCharges$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = budgetChargesInteractor$getCharges$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        BudgetChargesInteractor$getRequisites$1 budgetChargesInteractor$getRequisites$1;
        int i;
        if (continuationImpl instanceof BudgetChargesInteractor$getRequisites$1) {
            budgetChargesInteractor$getRequisites$1 = (BudgetChargesInteractor$getRequisites$1) continuationImpl;
            int i2 = budgetChargesInteractor$getRequisites$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                budgetChargesInteractor$getRequisites$1.label = i2 - Integer.MIN_VALUE;
                Object obj = budgetChargesInteractor$getRequisites$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = budgetChargesInteractor$getRequisites$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    budgetChargesInteractor$getRequisites$1.label = 1;
                    Object c = this.a.c(str, budgetChargesInteractor$getRequisites$1);
                    return c == coroutineSingletons ? coroutineSingletons : c;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        budgetChargesInteractor$getRequisites$1 = new BudgetChargesInteractor$getRequisites$1(this, continuationImpl);
        Object obj2 = budgetChargesInteractor$getRequisites$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = budgetChargesInteractor$getRequisites$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        BudgetChargesInteractor$getStatusChargeSearch$1 budgetChargesInteractor$getStatusChargeSearch$1;
        int i;
        if (continuationImpl instanceof BudgetChargesInteractor$getStatusChargeSearch$1) {
            budgetChargesInteractor$getStatusChargeSearch$1 = (BudgetChargesInteractor$getStatusChargeSearch$1) continuationImpl;
            int i2 = budgetChargesInteractor$getStatusChargeSearch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                budgetChargesInteractor$getStatusChargeSearch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = budgetChargesInteractor$getStatusChargeSearch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = budgetChargesInteractor$getStatusChargeSearch$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c c = this.b.c(kzd0.b, new BudgetChargesInteractor$getStatusChargeSearch$2(2, null), new BudgetChargesInteractor$getStatusChargeSearch$3(this, str, null));
                    budgetChargesInteractor$getStatusChargeSearch$1.label = 1;
                    obj = c.d(null, budgetChargesInteractor$getStatusChargeSearch$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new cd0(9, (tpr) obj, this);
            }
        }
        budgetChargesInteractor$getStatusChargeSearch$1 = new BudgetChargesInteractor$getStatusChargeSearch$1(this, continuationImpl);
        Object obj2 = budgetChargesInteractor$getStatusChargeSearch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = budgetChargesInteractor$getStatusChargeSearch$1.label;
        if (i != 0) {
        }
        return new cd0(9, (tpr) obj2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(d6v d6vVar, String str, String str2, ContinuationImpl continuationImpl) {
        BudgetChargesInteractor$startChargeSearch$1 budgetChargesInteractor$startChargeSearch$1;
        int i;
        if (continuationImpl instanceof BudgetChargesInteractor$startChargeSearch$1) {
            budgetChargesInteractor$startChargeSearch$1 = (BudgetChargesInteractor$startChargeSearch$1) continuationImpl;
            int i2 = budgetChargesInteractor$startChargeSearch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                budgetChargesInteractor$startChargeSearch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = budgetChargesInteractor$startChargeSearch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = budgetChargesInteractor$startChargeSearch$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                BudgetChargesInteractor$startChargeSearch$2 budgetChargesInteractor$startChargeSearch$2 = new BudgetChargesInteractor$startChargeSearch$2(this, str, str2, null);
                budgetChargesInteractor$startChargeSearch$1.label = 1;
                Object a = d.a(d6vVar, budgetChargesInteractor$startChargeSearch$2, budgetChargesInteractor$startChargeSearch$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        budgetChargesInteractor$startChargeSearch$1 = new BudgetChargesInteractor$startChargeSearch$1(this, continuationImpl);
        Object obj2 = budgetChargesInteractor$startChargeSearch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = budgetChargesInteractor$startChargeSearch$1.label;
        if (i == 0) {
        }
    }
}
