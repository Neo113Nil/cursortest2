package com.yandex.mob;

import com.yandex.mob.domain.q;
import com.yandex.mob.reporting.MobTrigger;
import defpackage.ny61;
import defpackage.oo20;
import defpackage.vpr;
import defpackage.xo20;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class h implements vpr {
    public final /* synthetic */ oo20 a;

    public h(oo20 oo20Var) {
        this.a = oo20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        MobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1 mobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1;
        Object obj;
        int i;
        if (continuation instanceof MobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1) {
            mobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1 = (MobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1) continuation;
            int i2 = mobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1.label = i2 - Integer.MIN_VALUE;
                obj = mobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1.label;
                zy11 zy11Var = zy11.a;
                oo20 oo20Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.mob.domain.l lVar = (com.yandex.mob.domain.l) ((xo20) oo20Var).O.getValue();
                    mobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1.L$0 = null;
                    mobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1.label = 1;
                    obj = lVar.h(mobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    q qVar = (q) ((xo20) oo20Var).A.getValue();
                    MobTrigger mobTrigger = MobTrigger.NetworkTypeChanged;
                    mobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1.L$0 = null;
                    mobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1.label = 2;
                    if (qVar.e(mobTrigger, mobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        mobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1 = new MobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1(this, continuation);
        obj = mobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobMainInitializer$subscribeOnNetworkTypeChange$3$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        oo20 oo20Var2 = this.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11Var2;
    }

    @Override // defpackage.vpr
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(continuation);
    }
}
