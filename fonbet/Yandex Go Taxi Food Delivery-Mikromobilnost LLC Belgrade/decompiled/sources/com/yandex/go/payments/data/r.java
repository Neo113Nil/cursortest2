package com.yandex.go.payments.data;

import com.yandex.go.payments.cards.data.UserCardProfileApiV4;
import com.yandex.go.payments.cards.data.model.UserCardProfileResponse;
import com.yandex.go.payments.cards.domain.model.UserCardProfileParams;
import defpackage.cmt;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.on2;
import defpackage.tq21;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class r {
    public final i3y a;

    public r(on2 on2Var) {
        this.a = kotlin.a.a(new tq21(on2Var, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(UserCardProfileParams userCardProfileParams, ContinuationImpl continuationImpl) {
        UserCardProfileApiRepository$getUserCardProfile$1 userCardProfileApiRepository$getUserCardProfile$1;
        int i;
        if (continuationImpl instanceof UserCardProfileApiRepository$getUserCardProfile$1) {
            userCardProfileApiRepository$getUserCardProfile$1 = (UserCardProfileApiRepository$getUserCardProfile$1) continuationImpl;
            int i2 = userCardProfileApiRepository$getUserCardProfile$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userCardProfileApiRepository$getUserCardProfile$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userCardProfileApiRepository$getUserCardProfile$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userCardProfileApiRepository$getUserCardProfile$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<UserCardProfileResponse> a = ((UserCardProfileApiV4) this.a.getValue()).a(userCardProfileParams);
                    userCardProfileApiRepository$getUserCardProfile$1.L$0 = null;
                    userCardProfileApiRepository$getUserCardProfile$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(a, null, userCardProfileApiRepository$getUserCardProfile$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((UserCardProfileResponse) obj).getA().getA();
            }
        }
        userCardProfileApiRepository$getUserCardProfile$1 = new UserCardProfileApiRepository$getUserCardProfile$1(this, continuationImpl);
        Object obj2 = userCardProfileApiRepository$getUserCardProfile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userCardProfileApiRepository$getUserCardProfile$1.label;
        if (i != 0) {
        }
        return ((UserCardProfileResponse) obj2).getA().getA();
    }
}
