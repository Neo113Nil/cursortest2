package com.yandex.go.navigator.driving;

import defpackage.b2k;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class n implements tpr {
    public final /* synthetic */ b2k a;

    public n(b2k b2kVar) {
        this.a = b2kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DrivingModalPresenter$renderNotifications$$inlined$map$1$1 drivingModalPresenter$renderNotifications$$inlined$map$1$1;
        int i;
        if (continuation instanceof DrivingModalPresenter$renderNotifications$$inlined$map$1$1) {
            drivingModalPresenter$renderNotifications$$inlined$map$1$1 = (DrivingModalPresenter$renderNotifications$$inlined$map$1$1) continuation;
            int i2 = drivingModalPresenter$renderNotifications$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drivingModalPresenter$renderNotifications$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = drivingModalPresenter$renderNotifications$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = drivingModalPresenter$renderNotifications$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m mVar = new m(vprVar);
                    drivingModalPresenter$renderNotifications$$inlined$map$1$1.L$0 = null;
                    drivingModalPresenter$renderNotifications$$inlined$map$1$1.L$1 = null;
                    drivingModalPresenter$renderNotifications$$inlined$map$1$1.L$2 = null;
                    drivingModalPresenter$renderNotifications$$inlined$map$1$1.label = 1;
                    if (this.a.collect(mVar, drivingModalPresenter$renderNotifications$$inlined$map$1$1) == coroutineSingletons) {
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
        drivingModalPresenter$renderNotifications$$inlined$map$1$1 = new DrivingModalPresenter$renderNotifications$$inlined$map$1$1(this, continuation);
        Object obj2 = drivingModalPresenter$renderNotifications$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = drivingModalPresenter$renderNotifications$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
