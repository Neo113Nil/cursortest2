package com.yandex.go.summary.interactor.expanded.action;

import defpackage.jl40;
import defpackage.kci;
import defpackage.ny61;
import defpackage.paj0;
import defpackage.saj0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public a(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RequirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1 requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1;
        int i;
        Object obj2;
        kci kciVar;
        if (continuation instanceof RequirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1) {
            requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1 = (RequirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1) continuation;
            int i2 = requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Iterator it = ((paj0) obj).a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((saj0) obj2).d, this.b)) {
                            break;
                        }
                    }
                    saj0 saj0Var = (saj0) obj2;
                    List list = (saj0Var == null || (kciVar = saj0Var.f) == null) ? null : kciVar.d;
                    requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1.L$0 = null;
                    requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1.L$1 = null;
                    requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1.L$2 = null;
                    requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1.L$3 = null;
                    requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(list, requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1 = new RequirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1(this, continuation);
        Object obj32 = requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementUiActionInteractor$handleDeliveryIntervalsClicked$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
