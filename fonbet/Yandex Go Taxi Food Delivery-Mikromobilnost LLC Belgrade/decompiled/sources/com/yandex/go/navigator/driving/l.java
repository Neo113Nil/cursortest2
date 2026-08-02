package com.yandex.go.navigator.driving;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class l implements tpr {
    public final /* synthetic */ tpr a;

    public l(kotlinx.coroutines.flow.m0 m0Var) {
        this.a = m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DrivingModalPresenter$renderDrivingBubble$$inlined$map$1$1 drivingModalPresenter$renderDrivingBubble$$inlined$map$1$1;
        int i;
        if (continuation instanceof DrivingModalPresenter$renderDrivingBubble$$inlined$map$1$1) {
            drivingModalPresenter$renderDrivingBubble$$inlined$map$1$1 = (DrivingModalPresenter$renderDrivingBubble$$inlined$map$1$1) continuation;
            int i2 = drivingModalPresenter$renderDrivingBubble$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drivingModalPresenter$renderDrivingBubble$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = drivingModalPresenter$renderDrivingBubble$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = drivingModalPresenter$renderDrivingBubble$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k kVar = new k(vprVar);
                    drivingModalPresenter$renderDrivingBubble$$inlined$map$1$1.L$0 = null;
                    drivingModalPresenter$renderDrivingBubble$$inlined$map$1$1.L$1 = null;
                    drivingModalPresenter$renderDrivingBubble$$inlined$map$1$1.L$2 = null;
                    drivingModalPresenter$renderDrivingBubble$$inlined$map$1$1.label = 1;
                    if (this.a.collect(kVar, drivingModalPresenter$renderDrivingBubble$$inlined$map$1$1) == coroutineSingletons) {
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
        drivingModalPresenter$renderDrivingBubble$$inlined$map$1$1 = new DrivingModalPresenter$renderDrivingBubble$$inlined$map$1$1(this, continuation);
        Object obj2 = drivingModalPresenter$renderDrivingBubble$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = drivingModalPresenter$renderDrivingBubble$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
