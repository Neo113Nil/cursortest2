package com.yandex.fintechsdk.adapters.yb.sdk.impl;

import defpackage.ch51;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        YbAdapterImpl$creditLimitUpgradeParamsFlow$$inlined$map$1$2$1 ybAdapterImpl$creditLimitUpgradeParamsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof YbAdapterImpl$creditLimitUpgradeParamsFlow$$inlined$map$1$2$1) {
            ybAdapterImpl$creditLimitUpgradeParamsFlow$$inlined$map$1$2$1 = (YbAdapterImpl$creditLimitUpgradeParamsFlow$$inlined$map$1$2$1) continuation;
            int i2 = ybAdapterImpl$creditLimitUpgradeParamsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybAdapterImpl$creditLimitUpgradeParamsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ybAdapterImpl$creditLimitUpgradeParamsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybAdapterImpl$creditLimitUpgradeParamsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Map map = ((ch51) obj).c;
                    ybAdapterImpl$creditLimitUpgradeParamsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(map, ybAdapterImpl$creditLimitUpgradeParamsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        ybAdapterImpl$creditLimitUpgradeParamsFlow$$inlined$map$1$2$1 = new YbAdapterImpl$creditLimitUpgradeParamsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = ybAdapterImpl$creditLimitUpgradeParamsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybAdapterImpl$creditLimitUpgradeParamsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
