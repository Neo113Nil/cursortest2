package com.yandex.go.payments_widgets.saver;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.pu51;
import defpackage.qu51;
import defpackage.ru51;
import defpackage.vpr;
import defpackage.w511;
import defpackage.yu51;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;

    public g(vpr vprVar, k kVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpdateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1 updateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1;
        int i;
        yu51 yu51Var;
        if (continuation instanceof UpdateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1) {
            updateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1 = (UpdateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1) continuation;
            int i2 = updateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = updateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ru51 ru51Var = (ru51) obj;
                    if (ru51Var instanceof pu51) {
                        pu51 pu51Var = (pu51) ru51Var;
                        boolean z = pu51Var.a;
                        String str = pu51Var.b;
                        if (str == null) {
                            str = "";
                        }
                        yu51Var = new yu51(z, str, pu51Var.c);
                    } else {
                        if (!jl40.l(ru51Var, qu51.a)) {
                            w511.b();
                            return null;
                        }
                        yu51Var = yu51.d;
                    }
                    updateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$0 = null;
                    updateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$1 = null;
                    updateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$2 = null;
                    updateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$3 = null;
                    updateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(yu51Var, updateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1) == coroutineSingletons) {
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
        updateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1 = new UpdateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1(this, continuation);
        Object obj22 = updateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateSaverVariablesInteractor$startUpdate$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
