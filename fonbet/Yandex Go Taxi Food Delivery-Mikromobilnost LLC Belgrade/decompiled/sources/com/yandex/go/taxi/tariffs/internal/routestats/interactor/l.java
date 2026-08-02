package com.yandex.go.taxi.tariffs.internal.routestats.interactor;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;

/* loaded from: classes8.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;

    public l(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RequirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1 requirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof RequirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1) {
            requirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1 = (RequirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1) continuation;
            int i2 = requirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = requirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    RequirementsChangedNotifier.ChangeType changeType = RequirementsChangedNotifier.ChangeType.CHANGE;
                    requirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1.L$0 = null;
                    requirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1.L$1 = null;
                    requirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1.L$2 = null;
                    requirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1.L$3 = null;
                    requirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(changeType, requirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        requirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1 = new RequirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = requirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsInfoInteractor$requirementsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
