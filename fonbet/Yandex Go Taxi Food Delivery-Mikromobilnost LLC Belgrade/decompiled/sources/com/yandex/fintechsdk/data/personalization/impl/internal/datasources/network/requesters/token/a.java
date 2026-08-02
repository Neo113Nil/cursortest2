package com.yandex.fintechsdk.data.personalization.impl.internal.datasources.network.requesters.token;

import defpackage.an11;
import defpackage.jbt;
import defpackage.kt90;
import defpackage.mbt;
import defpackage.ny61;
import defpackage.qoi0;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a extends com.yandex.fintechsdk.core.network.api.request.a {
    public final kt90 b;

    public a(kt90 kt90Var) {
        super(0);
        this.b = kt90Var;
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object a(Object obj) {
        return new jbt((String) obj);
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object d(Object obj) {
        return ((mbt) obj).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.fintechsdk.core.network.api.request.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(jbt jbtVar, ContinuationImpl continuationImpl) {
        GetPersonalizationTokenRequester$executeRequest$1 getPersonalizationTokenRequester$executeRequest$1;
        int i;
        if (continuationImpl instanceof GetPersonalizationTokenRequester$executeRequest$1) {
            getPersonalizationTokenRequester$executeRequest$1 = (GetPersonalizationTokenRequester$executeRequest$1) continuationImpl;
            int i2 = getPersonalizationTokenRequester$executeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getPersonalizationTokenRequester$executeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getPersonalizationTokenRequester$executeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getPersonalizationTokenRequester$executeRequest$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                an11 e = qoi0.e(mbt.class);
                getPersonalizationTokenRequester$executeRequest$1.label = 1;
                kt90 kt90Var = this.b;
                kt90Var.getClass();
                Object d = com.yandex.fintechsdk.core.network.impl.internal.network.a.d(kt90Var, jbtVar, e, getPersonalizationTokenRequester$executeRequest$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        getPersonalizationTokenRequester$executeRequest$1 = new GetPersonalizationTokenRequester$executeRequest$1(this, continuationImpl);
        Object obj2 = getPersonalizationTokenRequester$executeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getPersonalizationTokenRequester$executeRequest$1.label;
        if (i == 0) {
        }
    }
}
