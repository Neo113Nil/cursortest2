package com.yandex.go.taxi.tariffs.internal.routestats.interactor;

import defpackage.ny61;
import defpackage.qoj0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class q implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.k a;
    public final /* synthetic */ qoj0 b;

    public q(kotlinx.coroutines.flow.internal.k kVar, qoj0 qoj0Var) {
        this.a = kVar;
        this.b = qoj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RequirementsInfoInteractor$requirementsFlow$$inlined$map$3$1 requirementsInfoInteractor$requirementsFlow$$inlined$map$3$1;
        int i;
        if (continuation instanceof RequirementsInfoInteractor$requirementsFlow$$inlined$map$3$1) {
            requirementsInfoInteractor$requirementsFlow$$inlined$map$3$1 = (RequirementsInfoInteractor$requirementsFlow$$inlined$map$3$1) continuation;
            int i2 = requirementsInfoInteractor$requirementsFlow$$inlined$map$3$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsInfoInteractor$requirementsFlow$$inlined$map$3$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementsInfoInteractor$requirementsFlow$$inlined$map$3$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsInfoInteractor$requirementsFlow$$inlined$map$3$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p pVar = new p(vprVar, this.b);
                    requirementsInfoInteractor$requirementsFlow$$inlined$map$3$1.L$0 = null;
                    requirementsInfoInteractor$requirementsFlow$$inlined$map$3$1.L$1 = null;
                    requirementsInfoInteractor$requirementsFlow$$inlined$map$3$1.L$2 = null;
                    requirementsInfoInteractor$requirementsFlow$$inlined$map$3$1.label = 1;
                    if (this.a.collect(pVar, requirementsInfoInteractor$requirementsFlow$$inlined$map$3$1) == coroutineSingletons) {
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
        requirementsInfoInteractor$requirementsFlow$$inlined$map$3$1 = new RequirementsInfoInteractor$requirementsFlow$$inlined$map$3$1(this, continuation);
        Object obj2 = requirementsInfoInteractor$requirementsFlow$$inlined$map$3$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsInfoInteractor$requirementsFlow$$inlined$map$3$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
