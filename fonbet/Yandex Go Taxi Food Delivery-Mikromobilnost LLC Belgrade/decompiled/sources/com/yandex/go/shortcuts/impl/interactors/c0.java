package com.yandex.go.shortcuts.impl.interactors;

import defpackage.fnx0;
import defpackage.ggx0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c0 implements vpr {
    public final /* synthetic */ vpr a;

    public c0(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1 tariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1) {
            tariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1 = (TariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1) continuation;
            int i2 = tariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pex0 pex0Var = ((fnx0) obj).c;
                    String str = pex0Var.k;
                    if (str == null && (str = pex0Var.j) == null) {
                        str = "";
                    }
                    String str2 = pex0Var.l;
                    if (str2 == null) {
                        str2 = pex0Var.b;
                    }
                    ggx0 ggx0Var = new ggx0(str, str2);
                    tariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1.L$0 = null;
                    tariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1.L$1 = null;
                    tariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1.L$2 = null;
                    tariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1.L$3 = null;
                    tariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(ggx0Var, tariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        tariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1 = new TariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = tariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffInfoModelUpdater$updatesFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
