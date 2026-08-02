package com.yandex.go.payments.data;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class t implements tpr {
    public final /* synthetic */ tpr a;

    public t(r0 r0Var) {
        this.a = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UserCardProfileRepository$fetchAndAwaitgIAlus$$inlined$mapNotNull$1$1 userCardProfileRepository$fetchAndAwaitgIAlus$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof UserCardProfileRepository$fetchAndAwaitgIAlus$$inlined$mapNotNull$1$1) {
            userCardProfileRepository$fetchAndAwaitgIAlus$$inlined$mapNotNull$1$1 = (UserCardProfileRepository$fetchAndAwaitgIAlus$$inlined$mapNotNull$1$1) continuation;
            int i2 = userCardProfileRepository$fetchAndAwaitgIAlus$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userCardProfileRepository$fetchAndAwaitgIAlus$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userCardProfileRepository$fetchAndAwaitgIAlus$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userCardProfileRepository$fetchAndAwaitgIAlus$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    s sVar = new s(vprVar);
                    userCardProfileRepository$fetchAndAwaitgIAlus$$inlined$mapNotNull$1$1.L$0 = null;
                    userCardProfileRepository$fetchAndAwaitgIAlus$$inlined$mapNotNull$1$1.L$1 = null;
                    userCardProfileRepository$fetchAndAwaitgIAlus$$inlined$mapNotNull$1$1.L$2 = null;
                    userCardProfileRepository$fetchAndAwaitgIAlus$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(sVar, userCardProfileRepository$fetchAndAwaitgIAlus$$inlined$mapNotNull$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        userCardProfileRepository$fetchAndAwaitgIAlus$$inlined$mapNotNull$1$1 = new UserCardProfileRepository$fetchAndAwaitgIAlus$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = userCardProfileRepository$fetchAndAwaitgIAlus$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userCardProfileRepository$fetchAndAwaitgIAlus$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
