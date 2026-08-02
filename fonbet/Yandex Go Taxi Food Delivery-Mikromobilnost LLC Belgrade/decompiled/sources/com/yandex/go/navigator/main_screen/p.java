package com.yandex.go.navigator.main_screen;

import com.yandex.mapkit.location.Location;
import defpackage.l7z;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.vpr;
import defpackage.xk91;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class p implements vpr {
    public final /* synthetic */ vpr a;

    public p(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NavigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1 navigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1;
        int i;
        Location location;
        Double speed;
        Location location2;
        Double speed2;
        if (continuation instanceof NavigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1) {
            navigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1 = (NavigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1) continuation;
            int i2 = navigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = navigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    l7z l7zVar = (l7z) rsnVar.b;
                    boolean z = false;
                    int c = (l7zVar == null || (location2 = l7zVar.a) == null || (speed2 = location2.getSpeed()) == null) ? 0 : xk91.c(speed2.doubleValue());
                    l7z l7zVar2 = (l7z) rsnVar.a;
                    int c2 = (l7zVar2 == null || (location = l7zVar2.a) == null || (speed = location.getSpeed()) == null) ? 0 : xk91.c(speed.doubleValue());
                    if (c > 10 && c2 > 10) {
                        z = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    navigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1.L$0 = null;
                    navigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1.L$1 = null;
                    navigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1.L$2 = null;
                    navigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1.L$3 = null;
                    navigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, navigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        navigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1 = new NavigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = navigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigationModeInteractor$navigationModeFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
