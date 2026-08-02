package com.yandex.go.user_profile.ui.am;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class r implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ s b;

    public r(jqr jqrVar, s sVar) {
        this.a = jqrVar;
        this.b = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AmProfileRouter$content$lambda$0$$inlined$map$1$1 amProfileRouter$content$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof AmProfileRouter$content$lambda$0$$inlined$map$1$1) {
            amProfileRouter$content$lambda$0$$inlined$map$1$1 = (AmProfileRouter$content$lambda$0$$inlined$map$1$1) continuation;
            int i2 = amProfileRouter$content$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                amProfileRouter$content$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = amProfileRouter$content$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = amProfileRouter$content$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    q qVar = new q(vprVar, this.b);
                    amProfileRouter$content$lambda$0$$inlined$map$1$1.L$0 = null;
                    amProfileRouter$content$lambda$0$$inlined$map$1$1.L$1 = null;
                    amProfileRouter$content$lambda$0$$inlined$map$1$1.L$2 = null;
                    amProfileRouter$content$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(qVar, amProfileRouter$content$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        amProfileRouter$content$lambda$0$$inlined$map$1$1 = new AmProfileRouter$content$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = amProfileRouter$content$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = amProfileRouter$content$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
