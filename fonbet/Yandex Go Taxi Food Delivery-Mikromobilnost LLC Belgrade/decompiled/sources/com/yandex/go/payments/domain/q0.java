package com.yandex.go.payments.domain;

import com.yandex.go.payments.cards.domain.model.UserCardProfileParams;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class q0 {
    public final com.yandex.go.payments.data.u a;

    public q0(com.yandex.go.payments.data.u uVar) {
        this.a = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(UserCardProfileParams userCardProfileParams, ContinuationImpl continuationImpl) {
        UserCardProfileInteractor$getUserCardProfile$1 userCardProfileInteractor$getUserCardProfile$1;
        int i;
        if (continuationImpl instanceof UserCardProfileInteractor$getUserCardProfile$1) {
            userCardProfileInteractor$getUserCardProfile$1 = (UserCardProfileInteractor$getUserCardProfile$1) continuationImpl;
            int i2 = userCardProfileInteractor$getUserCardProfile$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userCardProfileInteractor$getUserCardProfile$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userCardProfileInteractor$getUserCardProfile$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userCardProfileInteractor$getUserCardProfile$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    userCardProfileInteractor$getUserCardProfile$1.L$0 = null;
                    userCardProfileInteractor$getUserCardProfile$1.label = 1;
                    Object a = this.a.a(userCardProfileParams, userCardProfileInteractor$getUserCardProfile$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        userCardProfileInteractor$getUserCardProfile$1 = new UserCardProfileInteractor$getUserCardProfile$1(this, continuationImpl);
        Object obj2 = userCardProfileInteractor$getUserCardProfile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userCardProfileInteractor$getUserCardProfile$1.label;
        if (i != 0) {
        }
    }
}
