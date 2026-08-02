package com.yandex.go.walking.navigation.impl.overview.interactor;

import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.ny61;
import defpackage.t741;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ j b;
    public final /* synthetic */ List c;

    public f(vpr vprVar, j jVar, List list) {
        this.a = vprVar;
        this.b = jVar;
        this.c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WalkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof WalkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) {
            walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = (WalkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    t741 o = this.b.a.o((Route) obj, this.c, 0.0d);
                    walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(o, walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = new WalkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
