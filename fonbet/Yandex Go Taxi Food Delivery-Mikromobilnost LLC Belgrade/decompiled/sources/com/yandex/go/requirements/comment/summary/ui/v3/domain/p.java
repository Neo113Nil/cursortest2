package com.yandex.go.requirements.comment.summary.ui.v3.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class p implements tpr {
    public final /* synthetic */ n a;

    public p(n nVar) {
        this.a = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AIRequirementsDataFactory$zoneFlow$$inlined$map$1$1 aIRequirementsDataFactory$zoneFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof AIRequirementsDataFactory$zoneFlow$$inlined$map$1$1) {
            aIRequirementsDataFactory$zoneFlow$$inlined$map$1$1 = (AIRequirementsDataFactory$zoneFlow$$inlined$map$1$1) continuation;
            int i2 = aIRequirementsDataFactory$zoneFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aIRequirementsDataFactory$zoneFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = aIRequirementsDataFactory$zoneFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aIRequirementsDataFactory$zoneFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o oVar = new o(vprVar);
                    aIRequirementsDataFactory$zoneFlow$$inlined$map$1$1.L$0 = null;
                    aIRequirementsDataFactory$zoneFlow$$inlined$map$1$1.L$1 = null;
                    aIRequirementsDataFactory$zoneFlow$$inlined$map$1$1.L$2 = null;
                    aIRequirementsDataFactory$zoneFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(oVar, aIRequirementsDataFactory$zoneFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        aIRequirementsDataFactory$zoneFlow$$inlined$map$1$1 = new AIRequirementsDataFactory$zoneFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = aIRequirementsDataFactory$zoneFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aIRequirementsDataFactory$zoneFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
