package com.yandex.go.taxi.summary.shared.requirement;

import defpackage.dk60;
import defpackage.f1h0;
import defpackage.gsc;
import defpackage.kb5;
import defpackage.ny61;
import defpackage.qd6;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ kb5 b;
    public final /* synthetic */ e c;

    public c(vpr vprVar, kb5 kb5Var, e eVar) {
        this.a = vprVar;
        this.b = kb5Var;
        this.c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RequirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1 requirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1;
        int i;
        qd6 qd6Var;
        if (continuation instanceof RequirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1) {
            requirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1 = (RequirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1) continuation;
            int i2 = requirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = requirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = (String) obj;
                    if (str != null) {
                        e eVar = this.c;
                        qd6Var = new qd6(null, null, null, str, null, new dk60(tje.y(f1h0.cross_in_circle, eVar.a.a), f1h0.cross_in_circle), new RequirementsNotificationInteractor$notificationFlow$2$result$1$1(0, eVar, e.class, "changeRequirementsNotificationShown", "changeRequirementsNotificationShown()V", 0), null, 0L, new RequirementsNotificationInteractor$notificationFlow$2$result$1$2(0, eVar, e.class, "removeUnsupportedRequirements", "removeUnsupportedRequirements()V", 0), null, null, 6967);
                    } else {
                        qd6Var = null;
                    }
                    gsc gscVar = new gsc(this.b, qd6Var);
                    requirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1.L$0 = null;
                    requirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1.L$1 = null;
                    requirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1.L$2 = null;
                    requirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1.L$3 = null;
                    requirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(gscVar, requirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        requirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1 = new RequirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = requirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsNotificationInteractor$notificationFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
