package com.yandex.go.walking.navigation.impl.ui.overlay;

import com.yandex.mapkit.location.Location;
import defpackage.g241;
import defpackage.g541;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class d implements vpr {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WalkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1 walkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1;
        int i;
        Location location;
        if (continuation instanceof WalkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1) {
            walkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1 = (WalkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1) continuation;
            int i2 = walkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = walkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1.label;
                e eVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    location = (Location) obj;
                    if (location != null) {
                        boolean z = eVar.P;
                        g241 g241Var = eVar.J;
                        if (!z && !((Boolean) g241Var.b.a.getValue()).booleanValue()) {
                            r0 r0Var = g241Var.a;
                            Boolean bool = Boolean.TRUE;
                            r0Var.getClass();
                            r0Var.m(null, bool);
                        }
                        walkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1.L$0 = null;
                        walkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1.L$1 = null;
                        walkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1.L$2 = null;
                        walkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1.L$3 = location;
                        walkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1.label = 1;
                        if (e.Mg(eVar, location, walkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                location = (Location) walkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1.L$3;
                kotlin.b.b(obj2);
                ((g541) eVar.Dg()).P0(location);
                return zy11.a;
            }
        }
        walkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1 = new WalkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1(this, continuation);
        Object obj22 = walkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1.label;
        e eVar2 = this.a;
        if (i != 0) {
        }
        ((g541) eVar2.Dg()).P0(location);
        return zy11.a;
    }
}
