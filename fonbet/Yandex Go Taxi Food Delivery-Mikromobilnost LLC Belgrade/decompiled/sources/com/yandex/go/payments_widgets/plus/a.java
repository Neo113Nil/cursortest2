package com.yandex.go.payments_widgets.plus;

import defpackage.ny61;
import defpackage.ofa0;
import defpackage.rcc;
import defpackage.rsn;
import defpackage.sb2;
import defpackage.u131;
import defpackage.vpr;
import defpackage.zqd0;
import defpackage.zy11;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ofa0 b;

    public a(vpr vprVar, ofa0 ofa0Var) {
        this.a = vprVar;
        this.b = ofa0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpdatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1 updatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1;
        int i;
        boolean booleanValue;
        if (continuation instanceof UpdatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1) {
            updatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1 = (UpdatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1) continuation;
            int i2 = updatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = updatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    Boolean bool = (Boolean) rsnVar.a;
                    if (bool != null) {
                        booleanValue = bool.booleanValue();
                    } else {
                        Boolean C = sb2.C(((zqd0) this.b.a).a, "payments.plus.enabled");
                        booleanValue = C != null ? C.booleanValue() : false;
                    }
                    boolean booleanValue2 = ((Boolean) rsnVar.b).booleanValue();
                    ListBuilder a = rcc.a();
                    if (booleanValue != booleanValue2) {
                        a.add(new u131("payments.plus.enabled", booleanValue2));
                    }
                    ListBuilder j = a.j();
                    updatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$0 = null;
                    updatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$1 = null;
                    updatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$2 = null;
                    updatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$3 = null;
                    updatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(j, updatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1) == coroutineSingletons) {
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
        updatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1 = new UpdatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1(this, continuation);
        Object obj22 = updatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updatePlusVariablesInteractor$startUpdate$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
