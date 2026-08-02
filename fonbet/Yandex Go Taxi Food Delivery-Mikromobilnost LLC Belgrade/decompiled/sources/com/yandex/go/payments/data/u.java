package com.yandex.go.payments.data;

import com.yandex.go.payments.cards.domain.model.UserCardProfileParams;
import defpackage.bvf0;
import defpackage.hit;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qk21;
import defpackage.tje;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class u {
    public final r a;
    public final hit b;
    public final r0 c = bvf0.c(null);
    public pzt0 d;

    public u(r rVar, hit hitVar) {
        this.a = rVar;
        this.b = hitVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(UserCardProfileParams userCardProfileParams, ContinuationImpl continuationImpl) {
        UserCardProfileRepository$fetchAndAwait$1 userCardProfileRepository$fetchAndAwait$1;
        int i;
        r0 r0Var;
        Object value;
        qk21 qk21Var;
        if (continuationImpl instanceof UserCardProfileRepository$fetchAndAwait$1) {
            userCardProfileRepository$fetchAndAwait$1 = (UserCardProfileRepository$fetchAndAwait$1) continuationImpl;
            int i2 = userCardProfileRepository$fetchAndAwait$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userCardProfileRepository$fetchAndAwait$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userCardProfileRepository$fetchAndAwait$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userCardProfileRepository$fetchAndAwait$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    do {
                        r0Var = this.c;
                        value = r0Var.getValue();
                        qk21Var = (qk21) value;
                        if (!jl40.l(qk21Var != null ? qk21Var.a() : null, userCardProfileParams)) {
                            qk21Var = new qk21(userCardProfileParams, null);
                            b(userCardProfileParams);
                        }
                    } while (!r0Var.k(value, qk21Var));
                    t tVar = new t(r0Var);
                    userCardProfileRepository$fetchAndAwait$1.L$0 = null;
                    userCardProfileRepository$fetchAndAwait$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(tVar, userCardProfileRepository$fetchAndAwait$1);
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
                return ((Result) obj).getValue();
            }
        }
        userCardProfileRepository$fetchAndAwait$1 = new UserCardProfileRepository$fetchAndAwait$1(this, continuationImpl);
        Object obj2 = userCardProfileRepository$fetchAndAwait$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userCardProfileRepository$fetchAndAwait$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public final void b(UserCardProfileParams userCardProfileParams) {
        pzt0 pzt0Var = this.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.d = tje.N(this.b.a, null, null, new UserCardProfileRepository$fetchInternal$1(this, userCardProfileParams, null), 3);
    }
}
