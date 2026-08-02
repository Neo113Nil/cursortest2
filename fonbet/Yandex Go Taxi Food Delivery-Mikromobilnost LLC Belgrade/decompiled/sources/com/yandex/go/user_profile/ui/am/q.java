package com.yandex.go.user_profile.ui.am;

import defpackage.ny61;
import defpackage.sgf0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class q implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ s b;

    public q(vpr vprVar, s sVar) {
        this.a = vprVar;
        this.b = sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AmProfileRouter$content$lambda$0$$inlined$map$1$2$1 amProfileRouter$content$lambda$0$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof AmProfileRouter$content$lambda$0$$inlined$map$1$2$1) {
            amProfileRouter$content$lambda$0$$inlined$map$1$2$1 = (AmProfileRouter$content$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = amProfileRouter$content$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                amProfileRouter$content$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = amProfileRouter$content$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = amProfileRouter$content$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$4 = vprVar2;
                    amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$5 = null;
                    amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$6 = null;
                    amProfileRouter$content$lambda$0$$inlined$map$1$2$1.label = 1;
                    Object U = s.U(this.b, (sgf0) obj, amProfileRouter$content$lambda$0$$inlined$map$1$2$1);
                    if (U != coroutineSingletons) {
                        obj2 = U;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$0 = null;
                amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$1 = null;
                amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$2 = null;
                amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$3 = null;
                amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$4 = null;
                amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$5 = null;
                amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$6 = null;
                amProfileRouter$content$lambda$0$$inlined$map$1$2$1.label = 2;
            }
        }
        amProfileRouter$content$lambda$0$$inlined$map$1$2$1 = new AmProfileRouter$content$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = amProfileRouter$content$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = amProfileRouter$content$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$0 = null;
        amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$1 = null;
        amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$2 = null;
        amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$3 = null;
        amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$4 = null;
        amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$5 = null;
        amProfileRouter$content$lambda$0$$inlined$map$1$2$1.L$6 = null;
        amProfileRouter$content$lambda$0$$inlined$map$1$2$1.label = 2;
    }
}
