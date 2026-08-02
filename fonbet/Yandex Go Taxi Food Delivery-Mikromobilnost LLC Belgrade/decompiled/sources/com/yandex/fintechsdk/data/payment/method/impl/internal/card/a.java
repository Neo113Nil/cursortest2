package com.yandex.fintechsdk.data.payment.method.impl.internal.card;

import com.yandex.fintechsdk.data.payment.method.api.model.TokenizeMethod;
import defpackage.et5;
import defpackage.nnz0;
import defpackage.ny61;
import defpackage.tb8;
import defpackage.xb8;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final class a implements xb8 {
    public final tb8 a;
    public final com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.a b;

    public a(tb8 tb8Var, com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.a aVar) {
        this.a = tb8Var;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        CardBindingRepositoryImpl$getBinInfo$1 cardBindingRepositoryImpl$getBinInfo$1;
        int i;
        Object a;
        if (continuationImpl instanceof CardBindingRepositoryImpl$getBinInfo$1) {
            cardBindingRepositoryImpl$getBinInfo$1 = (CardBindingRepositoryImpl$getBinInfo$1) continuationImpl;
            int i2 = cardBindingRepositoryImpl$getBinInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardBindingRepositoryImpl$getBinInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardBindingRepositoryImpl$getBinInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardBindingRepositoryImpl$getBinInfo$1.label;
                tb8 tb8Var = this.a;
                if (i != 0) {
                    b.b(obj);
                    et5 et5Var = (et5) tb8Var.a.get(str2);
                    if (et5Var != null) {
                        return et5Var;
                    }
                    cardBindingRepositoryImpl$getBinInfo$1.L$0 = str2;
                    cardBindingRepositoryImpl$getBinInfo$1.label = 1;
                    a = this.b.a(str, str2, cardBindingRepositoryImpl$getBinInfo$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) cardBindingRepositoryImpl$getBinInfo$1.L$0;
                    b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    tb8Var.a.put(str2, (et5) a);
                }
                return a;
            }
        }
        cardBindingRepositoryImpl$getBinInfo$1 = new CardBindingRepositoryImpl$getBinInfo$1(this, continuationImpl);
        Object obj2 = cardBindingRepositoryImpl$getBinInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardBindingRepositoryImpl$getBinInfo$1.label;
        tb8 tb8Var2 = this.a;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, c cVar, nnz0 nnz0Var, boolean z, TokenizeMethod tokenizeMethod, ContinuationImpl continuationImpl) {
        CardBindingRepositoryImpl$tokenize$1 cardBindingRepositoryImpl$tokenize$1;
        int i;
        if (continuationImpl instanceof CardBindingRepositoryImpl$tokenize$1) {
            cardBindingRepositoryImpl$tokenize$1 = (CardBindingRepositoryImpl$tokenize$1) continuationImpl;
            int i2 = cardBindingRepositoryImpl$tokenize$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardBindingRepositoryImpl$tokenize$1.label = i2 - Integer.MIN_VALUE;
                CardBindingRepositoryImpl$tokenize$1 cardBindingRepositoryImpl$tokenize$12 = cardBindingRepositoryImpl$tokenize$1;
                Object obj = cardBindingRepositoryImpl$tokenize$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardBindingRepositoryImpl$tokenize$12.label;
                if (i != 0) {
                    b.b(obj);
                    cardBindingRepositoryImpl$tokenize$12.label = 1;
                    Object b = this.b.b(str, cVar, nnz0Var, z, tokenizeMethod, cardBindingRepositoryImpl$tokenize$12);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        cardBindingRepositoryImpl$tokenize$1 = new CardBindingRepositoryImpl$tokenize$1(this, continuationImpl);
        CardBindingRepositoryImpl$tokenize$1 cardBindingRepositoryImpl$tokenize$122 = cardBindingRepositoryImpl$tokenize$1;
        Object obj2 = cardBindingRepositoryImpl$tokenize$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardBindingRepositoryImpl$tokenize$122.label;
        if (i != 0) {
        }
    }
}
