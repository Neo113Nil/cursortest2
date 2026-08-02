package com.ybsdk.feature.cashback.impl.repositiories;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.cashback.impl.dto.requests.MakePromoDecisionResponse;
import com.ybsdk.feature.cashback.impl.entities.SelectedCodeStatus;
import com.ybsdk.feature.cashback.impl.network.CashbackApi;
import defpackage.c49;
import defpackage.jl40;
import defpackage.ny61;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final CashbackApi a;
    public final AppAnalyticsReporter b;
    public final c49 c;
    public final com.ybsdk.core.common.data.a d = new com.ybsdk.core.common.data.a();

    public a(CashbackApi cashbackApi, AppAnalyticsReporter appAnalyticsReporter, c49 c49Var) {
        this.a = cashbackApi;
        this.b = appAnalyticsReporter;
        this.c = c49Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        CashbackRepository$getPromos$1 cashbackRepository$getPromos$1;
        int i;
        if (continuationImpl instanceof CashbackRepository$getPromos$1) {
            cashbackRepository$getPromos$1 = (CashbackRepository$getPromos$1) continuationImpl;
            int i2 = cashbackRepository$getPromos$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cashbackRepository$getPromos$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cashbackRepository$getPromos$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashbackRepository$getPromos$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                CashbackRepository$getPromos$promo$1 cashbackRepository$getPromos$promo$1 = new CashbackRepository$getPromos$promo$1(this, str, null);
                cashbackRepository$getPromos$1.label = 1;
                Object a = this.d.a(true, cashbackRepository$getPromos$promo$1, cashbackRepository$getPromos$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        cashbackRepository$getPromos$1 = new CashbackRepository$getPromos$1(this, continuationImpl);
        Object obj2 = cashbackRepository$getPromos$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashbackRepository$getPromos$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, List list, String str3, String str4, ContinuationImpl continuationImpl) {
        CashbackRepository$submitCategories$1 cashbackRepository$submitCategories$1;
        int i;
        Object c;
        if (continuationImpl instanceof CashbackRepository$submitCategories$1) {
            cashbackRepository$submitCategories$1 = (CashbackRepository$submitCategories$1) continuationImpl;
            int i2 = cashbackRepository$submitCategories$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cashbackRepository$submitCategories$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cashbackRepository$submitCategories$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashbackRepository$submitCategories$1.label;
                if (i != 0) {
                    b.b(obj);
                    CashbackRepository$submitCategories$2 cashbackRepository$submitCategories$2 = new CashbackRepository$submitCategories$2(this, str4, str, str2, list, str3, null);
                    cashbackRepository$submitCategories$1.label = 1;
                    c = c.c(cashbackRepository$submitCategories$2, cashbackRepository$submitCategories$1);
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
                String code = ((MakePromoDecisionResponse) c).getCode();
                return jl40.l(code, "OK") ? SelectedCodeStatus.OK : jl40.l(code, "DATA_OUTDATED") ? SelectedCodeStatus.DATA_OUTDATED : SelectedCodeStatus.UNKNOWN;
            }
        }
        cashbackRepository$submitCategories$1 = new CashbackRepository$submitCategories$1(this, continuationImpl);
        Object obj2 = cashbackRepository$submitCategories$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashbackRepository$submitCategories$1.label;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }
}
