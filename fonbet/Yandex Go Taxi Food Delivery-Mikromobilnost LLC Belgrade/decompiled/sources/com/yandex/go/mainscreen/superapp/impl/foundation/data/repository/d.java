package com.yandex.go.mainscreen.superapp.impl.foundation.data.repository;

import defpackage.ezw;
import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ ezw b;

    public d(mth mthVar, ezw ezwVar) {
        this.a = mthVar;
        this.b = ezwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuperappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$1 superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof SuperappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$1) {
            superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$1 = (SuperappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$1) continuation;
            int i2 = superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$1.L$0 = null;
                    superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$1.L$1 = null;
                    superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$1.L$2 = null;
                    superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$1 = new SuperappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
