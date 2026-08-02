package com.yandex.go.chargers.data;

import com.google.android.gms.location.DeviceOrientationRequest;
import defpackage.eci0;
import defpackage.ffx;
import defpackage.ny61;
import defpackage.rl9;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes.dex */
public final class a {
    public final e a;
    public final n0 b;
    public final eci0 c;

    public a(e eVar) {
        this.a = eVar;
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.b = b;
        this.c = kotlinx.coroutines.flow.e.c(b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r7.b.emit(defpackage.zy11.a, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ChargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1 chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1;
        int i;
        rl9 rl9Var;
        if (continuationImpl instanceof ChargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1) {
            chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1 = (ChargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1) continuationImpl;
            int i2 = chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1.label;
                e eVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rl9Var = (rl9) kotlinx.coroutines.flow.e.d(eVar.d).a.getValue();
                    chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1.L$0 = rl9Var;
                    chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        rl9 rl9Var2 = (rl9) obj;
                        return rl9Var2 == null ? (rl9) kotlinx.coroutines.flow.e.d(eVar.d).a.getValue() : rl9Var2;
                    }
                    rl9Var = (rl9) chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                ChargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$2 chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$2 = new ChargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$2(this, rl9Var, null);
                chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1.L$0 = null;
                chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1.label = 2;
                obj = kotlinx.coroutines.a.w(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$2, chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1);
            }
        }
        chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1 = new ChargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1(this, continuationImpl);
        Object obj2 = chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1.label;
        e eVar2 = this.a;
        if (i != 0) {
        }
        ChargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$2 chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$22 = new ChargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$2(this, rl9Var, null);
        chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1.L$0 = null;
        chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1.label = 2;
        obj2 = kotlinx.coroutines.a.w(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$22, chargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$1);
    }
}
