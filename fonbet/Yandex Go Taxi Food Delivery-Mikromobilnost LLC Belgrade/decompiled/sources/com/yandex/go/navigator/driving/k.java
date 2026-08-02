package com.yandex.go.navigator.driving;

import defpackage.ny61;
import defpackage.pm6;
import defpackage.tjm;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;

    public k(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DrivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1 drivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DrivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1) {
            drivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1 = (DrivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1) continuation;
            int i2 = drivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = drivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = drivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pm6 pm6Var = new pm6(((tjm) obj).a);
                    drivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1.L$0 = null;
                    drivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1.L$1 = null;
                    drivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1.L$2 = null;
                    drivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1.L$3 = null;
                    drivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pm6Var, drivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1) == coroutineSingletons) {
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
        drivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1 = new DrivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1(this, continuation);
        Object obj22 = drivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = drivingModalPresenter$renderDrivingBubble$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
