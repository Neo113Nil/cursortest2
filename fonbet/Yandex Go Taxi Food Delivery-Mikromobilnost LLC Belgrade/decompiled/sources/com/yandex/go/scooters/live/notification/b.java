package com.yandex.go.scooters.live.notification;

import defpackage.ny61;
import defpackage.sqm0;
import defpackage.uh6;
import defpackage.vpr;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof ScootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) {
            scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 = (ScootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zuo0 zuo0Var = (zuo0) kotlin.collections.a.R(uh6.C((sqm0) obj));
                    if (zuo0Var != null) {
                        scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(zuo0Var, scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 = new ScootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
