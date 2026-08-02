package com.yandex.go.superapp.order.multi.old.provider;

import defpackage.ab00;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes14.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr[] a;

    public d(tpr[] tprVarArr) {
        this.a = tprVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MultiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$1 multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$1;
        int i;
        if (continuation instanceof MultiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$1) {
            multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$1 = (MultiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$1) continuation;
            int i2 = multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    ab00 ab00Var = new ab00(tprVarArr, 3);
                    MultiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$3 multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$3 = new MultiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$3(3, null);
                    multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$1.L$0 = null;
                    multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$1.L$1 = null;
                    multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$1.L$2 = null;
                    multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, ab00Var, multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$3, multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$1 = new MultiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$1(this, continuation);
        Object obj2 = multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multiOrderProvider$trackActiveOrdersWithStatusChanges$lambda$0$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
