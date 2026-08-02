package com.yandex.go.navigator.domain;

import com.yandex.mapkit.location.Location;
import defpackage.l7z;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c0 implements vpr {
    public final /* synthetic */ vpr a;

    public c0(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UserSpeedCollector$attach$$inlined$mapNotNull$1$2$1 userSpeedCollector$attach$$inlined$mapNotNull$1$2$1;
        int i;
        Location location;
        if (continuation instanceof UserSpeedCollector$attach$$inlined$mapNotNull$1$2$1) {
            userSpeedCollector$attach$$inlined$mapNotNull$1$2$1 = (UserSpeedCollector$attach$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = userSpeedCollector$attach$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userSpeedCollector$attach$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = userSpeedCollector$attach$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userSpeedCollector$attach$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    l7z l7zVar = (l7z) obj;
                    Double speed = (l7zVar == null || (location = l7zVar.a) == null) ? null : location.getSpeed();
                    if (speed != null) {
                        userSpeedCollector$attach$$inlined$mapNotNull$1$2$1.L$0 = null;
                        userSpeedCollector$attach$$inlined$mapNotNull$1$2$1.L$1 = null;
                        userSpeedCollector$attach$$inlined$mapNotNull$1$2$1.L$2 = null;
                        userSpeedCollector$attach$$inlined$mapNotNull$1$2$1.L$3 = null;
                        userSpeedCollector$attach$$inlined$mapNotNull$1$2$1.L$4 = null;
                        userSpeedCollector$attach$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(speed, userSpeedCollector$attach$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        userSpeedCollector$attach$$inlined$mapNotNull$1$2$1 = new UserSpeedCollector$attach$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = userSpeedCollector$attach$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userSpeedCollector$attach$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
