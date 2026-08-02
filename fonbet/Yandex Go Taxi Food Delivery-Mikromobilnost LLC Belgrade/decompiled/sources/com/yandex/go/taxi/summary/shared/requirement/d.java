package com.yandex.go.taxi.summary.shared.requirement;

import defpackage.kb5;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ kb5 b;
    public final /* synthetic */ e c;

    public d(tpr tprVar, kb5 kb5Var, e eVar) {
        this.a = tprVar;
        this.b = kb5Var;
        this.c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RequirementsNotificationInteractor$notificationFlow$$inlined$map$1$1 requirementsNotificationInteractor$notificationFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof RequirementsNotificationInteractor$notificationFlow$$inlined$map$1$1) {
            requirementsNotificationInteractor$notificationFlow$$inlined$map$1$1 = (RequirementsNotificationInteractor$notificationFlow$$inlined$map$1$1) continuation;
            int i2 = requirementsNotificationInteractor$notificationFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsNotificationInteractor$notificationFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementsNotificationInteractor$notificationFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsNotificationInteractor$notificationFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b, this.c);
                    requirementsNotificationInteractor$notificationFlow$$inlined$map$1$1.L$0 = null;
                    requirementsNotificationInteractor$notificationFlow$$inlined$map$1$1.L$1 = null;
                    requirementsNotificationInteractor$notificationFlow$$inlined$map$1$1.L$2 = null;
                    requirementsNotificationInteractor$notificationFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, requirementsNotificationInteractor$notificationFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        requirementsNotificationInteractor$notificationFlow$$inlined$map$1$1 = new RequirementsNotificationInteractor$notificationFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = requirementsNotificationInteractor$notificationFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsNotificationInteractor$notificationFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
