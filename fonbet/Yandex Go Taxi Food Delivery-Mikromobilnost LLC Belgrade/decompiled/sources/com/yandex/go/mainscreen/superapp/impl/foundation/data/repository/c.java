package com.yandex.go.mainscreen.superapp.impl.foundation.data.repository;

import defpackage.bvf0;
import defpackage.ezw;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zir;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ezw b;

    public c(vpr vprVar, ezw ezwVar) {
        this.a = vprVar;
        this.b = ezwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1 superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SuperappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1) {
            superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1 = (SuperappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1) continuation;
            int i2 = superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(bvf0.G(this.b, (zir) obj));
                    superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1.L$0 = null;
                    superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1.L$1 = null;
                    superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1.L$2 = null;
                    superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1.L$3 = null;
                    superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1 = new SuperappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
