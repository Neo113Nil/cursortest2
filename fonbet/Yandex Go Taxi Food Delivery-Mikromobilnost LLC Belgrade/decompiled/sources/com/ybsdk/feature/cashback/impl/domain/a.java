package com.ybsdk.feature.cashback.impl.domain;

import com.ybsdk.feature.cashback.impl.entities.types.PromoID;
import defpackage.d6v;
import defpackage.ny61;
import defpackage.wls;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.feature.cashback.impl.repositiories.a a;

    public a(com.ybsdk.feature.cashback.impl.repositiories.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        CashbackInteractor$getPromos$1 cashbackInteractor$getPromos$1;
        int i;
        if (continuationImpl instanceof CashbackInteractor$getPromos$1) {
            cashbackInteractor$getPromos$1 = (CashbackInteractor$getPromos$1) continuationImpl;
            int i2 = cashbackInteractor$getPromos$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cashbackInteractor$getPromos$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cashbackInteractor$getPromos$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashbackInteractor$getPromos$1.label;
                if (i != 0) {
                    b.b(obj);
                    cashbackInteractor$getPromos$1.label = 1;
                    Object a = this.a.a(str, cashbackInteractor$getPromos$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        cashbackInteractor$getPromos$1 = new CashbackInteractor$getPromos$1(this, continuationImpl);
        Object obj2 = cashbackInteractor$getPromos$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashbackInteractor$getPromos$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, List list, String str3, d6v d6vVar, ContinuationImpl continuationImpl) {
        CashbackInteractor$submitCategories$1 cashbackInteractor$submitCategories$1;
        int i;
        if (continuationImpl instanceof CashbackInteractor$submitCategories$1) {
            cashbackInteractor$submitCategories$1 = (CashbackInteractor$submitCategories$1) continuationImpl;
            int i2 = cashbackInteractor$submitCategories$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cashbackInteractor$submitCategories$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cashbackInteractor$submitCategories$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashbackInteractor$submitCategories$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                Object m407boximpl = PromoID.m407boximpl(str);
                wls cashbackInteractor$submitCategories$2 = new CashbackInteractor$submitCategories$2(this, str, str2, list, str3, null);
                cashbackInteractor$submitCategories$1.label = 1;
                Object O = d6vVar.O(cashbackInteractor$submitCategories$2, m407boximpl, cashbackInteractor$submitCategories$1);
                return O == obj2 ? obj2 : O;
            }
        }
        cashbackInteractor$submitCategories$1 = new CashbackInteractor$submitCategories$1(this, continuationImpl);
        Object obj3 = cashbackInteractor$submitCategories$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashbackInteractor$submitCategories$1.label;
        if (i == 0) {
        }
    }
}
