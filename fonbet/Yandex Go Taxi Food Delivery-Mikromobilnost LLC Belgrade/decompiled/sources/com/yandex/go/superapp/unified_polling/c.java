package com.yandex.go.superapp.unified_polling;

import defpackage.h3y;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ h3y b;
    public final /* synthetic */ h3y c;

    public c(tpr tprVar, h3y h3yVar, h3y h3yVar2) {
        this.a = tprVar;
        this.b = h3yVar;
        this.c = h3yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SwitchingUnifiedPollingManager$special$$inlined$map$1$1 switchingUnifiedPollingManager$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof SwitchingUnifiedPollingManager$special$$inlined$map$1$1) {
            switchingUnifiedPollingManager$special$$inlined$map$1$1 = (SwitchingUnifiedPollingManager$special$$inlined$map$1$1) continuation;
            int i2 = switchingUnifiedPollingManager$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                switchingUnifiedPollingManager$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = switchingUnifiedPollingManager$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = switchingUnifiedPollingManager$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b, this.c);
                    switchingUnifiedPollingManager$special$$inlined$map$1$1.L$0 = null;
                    switchingUnifiedPollingManager$special$$inlined$map$1$1.L$1 = null;
                    switchingUnifiedPollingManager$special$$inlined$map$1$1.L$2 = null;
                    switchingUnifiedPollingManager$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, switchingUnifiedPollingManager$special$$inlined$map$1$1) == coroutineSingletons) {
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
        switchingUnifiedPollingManager$special$$inlined$map$1$1 = new SwitchingUnifiedPollingManager$special$$inlined$map$1$1(this, continuation);
        Object obj2 = switchingUnifiedPollingManager$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = switchingUnifiedPollingManager$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
