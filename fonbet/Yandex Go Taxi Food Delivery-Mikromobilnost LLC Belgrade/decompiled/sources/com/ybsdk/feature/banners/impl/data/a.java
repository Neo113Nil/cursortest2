package com.ybsdk.feature.banners.impl.data;

import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.feature.banners.api.interactors.a a;

    public a(com.ybsdk.feature.banners.api.interactors.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        BannersRepositoryImpl$markAsRead$1 bannersRepositoryImpl$markAsRead$1;
        int i;
        if (continuationImpl instanceof BannersRepositoryImpl$markAsRead$1) {
            bannersRepositoryImpl$markAsRead$1 = (BannersRepositoryImpl$markAsRead$1) continuationImpl;
            int i2 = bannersRepositoryImpl$markAsRead$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersRepositoryImpl$markAsRead$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bannersRepositoryImpl$markAsRead$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersRepositoryImpl$markAsRead$1.label;
                if (i != 0) {
                    b.b(obj);
                    bannersRepositoryImpl$markAsRead$1.label = 1;
                    Object a = this.a.a(str, str2, bannersRepositoryImpl$markAsRead$1);
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
        bannersRepositoryImpl$markAsRead$1 = new BannersRepositoryImpl$markAsRead$1(this, continuationImpl);
        Object obj2 = bannersRepositoryImpl$markAsRead$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersRepositoryImpl$markAsRead$1.label;
        if (i != 0) {
        }
    }
}
