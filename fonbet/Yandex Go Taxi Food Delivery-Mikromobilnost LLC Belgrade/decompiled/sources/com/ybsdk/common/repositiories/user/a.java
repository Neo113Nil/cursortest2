package com.ybsdk.common.repositiories.user;

import com.ybsdk.network.Api;
import defpackage.b791;
import defpackage.kn21;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final Api a;
    public final com.ybsdk.core.common.data.a b = new com.ybsdk.core.common.data.a();

    public a(Api api) {
        this.a = api;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        UserInfoRepository$getUserInfo$1 userInfoRepository$getUserInfo$1;
        int i;
        if (continuationImpl instanceof UserInfoRepository$getUserInfo$1) {
            userInfoRepository$getUserInfo$1 = (UserInfoRepository$getUserInfo$1) continuationImpl;
            int i2 = userInfoRepository$getUserInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userInfoRepository$getUserInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userInfoRepository$getUserInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userInfoRepository$getUserInfo$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                UserInfoRepository$getUserInfo$2 userInfoRepository$getUserInfo$2 = new UserInfoRepository$getUserInfo$2(this, null);
                userInfoRepository$getUserInfo$1.label = 1;
                Object a = this.b.a(z, userInfoRepository$getUserInfo$2, userInfoRepository$getUserInfo$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        userInfoRepository$getUserInfo$1 = new UserInfoRepository$getUserInfo$1(this, continuationImpl);
        Object obj2 = userInfoRepository$getUserInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userInfoRepository$getUserInfo$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        UserInfoRepository$isUserRegistered$1 userInfoRepository$isUserRegistered$1;
        int i;
        Object a;
        if (continuationImpl instanceof UserInfoRepository$isUserRegistered$1) {
            userInfoRepository$isUserRegistered$1 = (UserInfoRepository$isUserRegistered$1) continuationImpl;
            int i2 = userInfoRepository$isUserRegistered$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userInfoRepository$isUserRegistered$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userInfoRepository$isUserRegistered$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userInfoRepository$isUserRegistered$1.label;
                if (i != 0) {
                    b.b(obj);
                    userInfoRepository$isUserRegistered$1.label = 1;
                    a = a(true, userInfoRepository$isUserRegistered$1);
                    if (a == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    a = ((Result) obj).getValue();
                }
                kn21 kn21Var = (kn21) (a instanceof Result.Failure ? null : a);
                return Boolean.valueOf(kn21Var == null && b791.d(kn21Var));
            }
        }
        userInfoRepository$isUserRegistered$1 = new UserInfoRepository$isUserRegistered$1(this, continuationImpl);
        Object obj3 = userInfoRepository$isUserRegistered$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userInfoRepository$isUserRegistered$1.label;
        if (i != 0) {
        }
        kn21 kn21Var2 = (kn21) (a instanceof Result.Failure ? null : a);
        return Boolean.valueOf(kn21Var2 == null && b791.d(kn21Var2));
    }
}
