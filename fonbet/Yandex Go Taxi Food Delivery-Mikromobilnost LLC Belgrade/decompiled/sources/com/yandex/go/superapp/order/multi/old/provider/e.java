package com.yandex.go.superapp.order.multi.old.provider;

import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o2y0 b;

    public e(vpr vprVar, o2y0 o2y0Var) {
        this.a = vprVar;
        this.b = o2y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MultiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1 multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MultiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1) {
            multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1 = (MultiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1) continuation;
            int i2 = multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1.L$0 = null;
                    multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1.L$1 = null;
                    multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1.L$2 = null;
                    multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1.L$3 = null;
                    multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(this.b, multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1 = new MultiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
