package com.yandex.passport.internal.ui.challenge;

import com.yandex.passport.internal.ui.challenge.delete.h0;
import defpackage.jqr;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class c implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr b;

    public /* synthetic */ c(tpr tprVar, int i) {
        this.a = i;
        this.b = tprVar;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tpr tprVar = this.b;
        switch (i) {
            case 0:
                Object collect = ((jqr) tprVar).collect(new b(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = ((jqr) tprVar).collect(new h0(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            default:
                Object collect3 = ((com.yandex.passport.common.mvi.c) tprVar).collect(new com.yandex.passport.internal.upgrader.r(vprVar), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
        }
    }
}
