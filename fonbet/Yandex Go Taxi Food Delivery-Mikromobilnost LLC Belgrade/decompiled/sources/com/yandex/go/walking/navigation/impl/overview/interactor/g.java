package com.yandex.go.walking.navigation.impl.overview.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class g implements tpr {
    public final /* synthetic */ i a;
    public final /* synthetic */ j b;
    public final /* synthetic */ List c;

    public g(i iVar, j jVar, List list) {
        this.a = iVar;
        this.b = jVar;
        this.c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        WalkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$1 walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof WalkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$1) {
            walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$1 = (WalkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$1) continuation;
            int i2 = walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar, this.b, this.c);
                    walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$0 = null;
                    walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$1 = null;
                    walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$2 = null;
                    walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(fVar, walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$1 = new WalkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavOverviewUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
