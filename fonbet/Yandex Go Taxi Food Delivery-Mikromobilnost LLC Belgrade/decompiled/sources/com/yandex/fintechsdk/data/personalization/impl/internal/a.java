package com.yandex.fintechsdk.data.personalization.impl.internal;

import defpackage.i8b0;
import defpackage.ny61;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final i8b0 a;
    public final com.yandex.fintechsdk.data.personalization.impl.internal.datasources.network.a b;

    public a(i8b0 i8b0Var, com.yandex.fintechsdk.data.personalization.impl.internal.datasources.network.a aVar) {
        this.a = i8b0Var;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        PersonalizationRepositoryImpl$getPersonalizationToken$1 personalizationRepositoryImpl$getPersonalizationToken$1;
        int i;
        Object a;
        if (continuationImpl instanceof PersonalizationRepositoryImpl$getPersonalizationToken$1) {
            personalizationRepositoryImpl$getPersonalizationToken$1 = (PersonalizationRepositoryImpl$getPersonalizationToken$1) continuationImpl;
            int i2 = personalizationRepositoryImpl$getPersonalizationToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                personalizationRepositoryImpl$getPersonalizationToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = personalizationRepositoryImpl$getPersonalizationToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalizationRepositoryImpl$getPersonalizationToken$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.yandex.fintechsdk.data.personalization.impl.internal.datasources.network.a aVar = this.b;
                    personalizationRepositoryImpl$getPersonalizationToken$1.L$0 = str;
                    personalizationRepositoryImpl$getPersonalizationToken$1.label = 1;
                    a = aVar.a(str, personalizationRepositoryImpl$getPersonalizationToken$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) personalizationRepositoryImpl$getPersonalizationToken$1.L$0;
                    b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    return a;
                }
                String str2 = (String) a;
                i8b0 i8b0Var = this.a;
                synchronized (i8b0Var) {
                    LinkedHashMap linkedHashMap = i8b0Var.a;
                    if (str2 == null) {
                        linkedHashMap.remove(str);
                        return a;
                    }
                    linkedHashMap.put(str, str2);
                    return a;
                }
            }
        }
        personalizationRepositoryImpl$getPersonalizationToken$1 = new PersonalizationRepositoryImpl$getPersonalizationToken$1(this, continuationImpl);
        Object obj2 = personalizationRepositoryImpl$getPersonalizationToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalizationRepositoryImpl$getPersonalizationToken$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
    }
}
