package com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network;

import com.yandex.fintechsdk.data.payment.method.api.model.TokenizeMethod;
import defpackage.ft5;
import defpackage.nnz0;
import defpackage.ny61;
import defpackage.rnz0;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.requesters.bininfo.a a;
    public final com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.requesters.tokenize.a b;

    public a(com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.requesters.bininfo.a aVar, com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.requesters.tokenize.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        CardBindingNetworkDataSource$getBinInfo$1 cardBindingNetworkDataSource$getBinInfo$1;
        int i;
        if (continuationImpl instanceof CardBindingNetworkDataSource$getBinInfo$1) {
            cardBindingNetworkDataSource$getBinInfo$1 = (CardBindingNetworkDataSource$getBinInfo$1) continuationImpl;
            int i2 = cardBindingNetworkDataSource$getBinInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardBindingNetworkDataSource$getBinInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardBindingNetworkDataSource$getBinInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardBindingNetworkDataSource$getBinInfo$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                ft5 ft5Var = new ft5(str, str2);
                cardBindingNetworkDataSource$getBinInfo$1.label = 1;
                Object b = this.a.b(ft5Var, cardBindingNetworkDataSource$getBinInfo$1);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        cardBindingNetworkDataSource$getBinInfo$1 = new CardBindingNetworkDataSource$getBinInfo$1(this, continuationImpl);
        Object obj2 = cardBindingNetworkDataSource$getBinInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardBindingNetworkDataSource$getBinInfo$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, c cVar, nnz0 nnz0Var, boolean z, TokenizeMethod tokenizeMethod, ContinuationImpl continuationImpl) {
        CardBindingNetworkDataSource$tokenize$1 cardBindingNetworkDataSource$tokenize$1;
        int i;
        if (continuationImpl instanceof CardBindingNetworkDataSource$tokenize$1) {
            cardBindingNetworkDataSource$tokenize$1 = (CardBindingNetworkDataSource$tokenize$1) continuationImpl;
            int i2 = cardBindingNetworkDataSource$tokenize$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardBindingNetworkDataSource$tokenize$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardBindingNetworkDataSource$tokenize$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardBindingNetworkDataSource$tokenize$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                rnz0 rnz0Var = new rnz0(str, cVar, nnz0Var, z, tokenizeMethod);
                cardBindingNetworkDataSource$tokenize$1.label = 1;
                Object b = this.b.b(rnz0Var, cardBindingNetworkDataSource$tokenize$1);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        cardBindingNetworkDataSource$tokenize$1 = new CardBindingNetworkDataSource$tokenize$1(this, continuationImpl);
        Object obj2 = cardBindingNetworkDataSource$tokenize$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardBindingNetworkDataSource$tokenize$1.label;
        if (i == 0) {
        }
    }
}
