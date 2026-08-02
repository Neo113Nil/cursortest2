package com.yandex.plus.domain.auth.api;

import defpackage.hj;
import defpackage.ny61;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public static final /* synthetic */ a a = new a();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.plus.domain.auth.impl.a aVar, ContinuationImpl continuationImpl) {
        AuthSession$Companion$isAuthorized$1 authSession$Companion$isAuthorized$1;
        int i;
        if (continuationImpl instanceof AuthSession$Companion$isAuthorized$1) {
            authSession$Companion$isAuthorized$1 = (AuthSession$Companion$isAuthorized$1) continuationImpl;
            int i2 = authSession$Companion$isAuthorized$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authSession$Companion$isAuthorized$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authSession$Companion$isAuthorized$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authSession$Companion$isAuthorized$1.label;
                if (i != 0) {
                    b.b(obj);
                    authSession$Companion$isAuthorized$1.L$0 = null;
                    authSession$Companion$isAuthorized$1.label = 1;
                    obj = aVar.e(authSession$Companion$isAuthorized$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return Boolean.valueOf(obj instanceof hj);
            }
        }
        authSession$Companion$isAuthorized$1 = new AuthSession$Companion$isAuthorized$1(this, continuationImpl);
        Object obj3 = authSession$Companion$isAuthorized$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authSession$Companion$isAuthorized$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(obj3 instanceof hj);
    }
}
