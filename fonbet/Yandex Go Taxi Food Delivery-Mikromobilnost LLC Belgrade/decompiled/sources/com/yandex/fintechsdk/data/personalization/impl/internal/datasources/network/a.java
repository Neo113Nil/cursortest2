package com.yandex.fintechsdk.data.personalization.impl.internal.datasources.network;

import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.fintechsdk.data.personalization.impl.internal.datasources.network.requesters.token.a a;

    public a(com.yandex.fintechsdk.data.personalization.impl.internal.datasources.network.requesters.token.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        PersonalizationNetworkDataSource$getPersonalizationToken$1 personalizationNetworkDataSource$getPersonalizationToken$1;
        int i;
        if (continuationImpl instanceof PersonalizationNetworkDataSource$getPersonalizationToken$1) {
            personalizationNetworkDataSource$getPersonalizationToken$1 = (PersonalizationNetworkDataSource$getPersonalizationToken$1) continuationImpl;
            int i2 = personalizationNetworkDataSource$getPersonalizationToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                personalizationNetworkDataSource$getPersonalizationToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = personalizationNetworkDataSource$getPersonalizationToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalizationNetworkDataSource$getPersonalizationToken$1.label;
                if (i != 0) {
                    b.b(obj);
                    personalizationNetworkDataSource$getPersonalizationToken$1.label = 1;
                    Object b = this.a.b(str, personalizationNetworkDataSource$getPersonalizationToken$1);
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
        personalizationNetworkDataSource$getPersonalizationToken$1 = new PersonalizationNetworkDataSource$getPersonalizationToken$1(this, continuationImpl);
        Object obj2 = personalizationNetworkDataSource$getPersonalizationToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalizationNetworkDataSource$getPersonalizationToken$1.label;
        if (i != 0) {
        }
    }
}
