package com.yandex.passport.internal.methods.requester;

import com.yandex.passport.api.impl.UserIdProperties;
import com.yandex.passport.internal.methods.u1;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class e extends h {
    @Override // com.yandex.passport.internal.methods.requester.h
    public final Object b(Object obj) {
        return new u1((UserIdProperties) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(UserIdProperties userIdProperties, ContinuationImpl continuationImpl) {
        GetUserIdUrlRequesterImpl$getUserIdUrl$1 getUserIdUrlRequesterImpl$getUserIdUrl$1;
        int i;
        if (continuationImpl instanceof GetUserIdUrlRequesterImpl$getUserIdUrl$1) {
            getUserIdUrlRequesterImpl$getUserIdUrl$1 = (GetUserIdUrlRequesterImpl$getUserIdUrl$1) continuationImpl;
            int i2 = getUserIdUrlRequesterImpl$getUserIdUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getUserIdUrlRequesterImpl$getUserIdUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getUserIdUrlRequesterImpl$getUserIdUrl$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getUserIdUrlRequesterImpl$getUserIdUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    getUserIdUrlRequesterImpl$getUserIdUrl$1.label = 1;
                    Object a = a(userIdProperties, getUserIdUrlRequesterImpl$getUserIdUrl$1);
                    return a == obj2 ? obj2 : a;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        getUserIdUrlRequesterImpl$getUserIdUrl$1 = new GetUserIdUrlRequesterImpl$getUserIdUrl$1(this, continuationImpl);
        Object obj3 = getUserIdUrlRequesterImpl$getUserIdUrl$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getUserIdUrlRequesterImpl$getUserIdUrl$1.label;
        if (i != 0) {
        }
    }
}
