package com.yandex.go.walking.navigation.impl.navigation_core;

import defpackage.bvf0;
import defpackage.gtq0;
import defpackage.ist;
import defpackage.jst;
import defpackage.ke31;
import defpackage.lv21;
import defpackage.ngl0;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.s541;
import defpackage.tt2;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class g {
    public final b a;
    public final s541 b;
    public final ngl0 c;
    public final tt2 d;
    public qoh f;
    public final kotlinx.coroutines.sync.a e = gtq0.a();
    public final ist g = jst.e.A("WALKING_NAVIGATION:ROUTES_REQUEST_INTERACTOR").m("WALKING_NAVIGATION:ROUTES_REQUEST_INTERACTOR");

    public g(b bVar, s541 s541Var, ngl0 ngl0Var, tt2 tt2Var) {
        this.a = bVar;
        this.b = s541Var;
        this.c = ngl0Var;
        this.d = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(lv21 lv21Var, ke31 ke31Var, ContinuationImpl continuationImpl) {
        WalkNavigationRoutesRequestInteractor$performRoutesRequest$1 walkNavigationRoutesRequestInteractor$performRoutesRequest$1;
        int i;
        if (continuationImpl instanceof WalkNavigationRoutesRequestInteractor$performRoutesRequest$1) {
            walkNavigationRoutesRequestInteractor$performRoutesRequest$1 = (WalkNavigationRoutesRequestInteractor$performRoutesRequest$1) continuationImpl;
            int i2 = walkNavigationRoutesRequestInteractor$performRoutesRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavigationRoutesRequestInteractor$performRoutesRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkNavigationRoutesRequestInteractor$performRoutesRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavigationRoutesRequestInteractor$performRoutesRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    WalkNavigationRoutesRequestInteractor$performRoutesRequest$2 walkNavigationRoutesRequestInteractor$performRoutesRequest$2 = new WalkNavigationRoutesRequestInteractor$performRoutesRequest$2(this, ke31Var, lv21Var, null);
                    walkNavigationRoutesRequestInteractor$performRoutesRequest$1.L$0 = null;
                    walkNavigationRoutesRequestInteractor$performRoutesRequest$1.L$1 = null;
                    walkNavigationRoutesRequestInteractor$performRoutesRequest$1.label = 1;
                    obj = bvf0.n(walkNavigationRoutesRequestInteractor$performRoutesRequest$2, walkNavigationRoutesRequestInteractor$performRoutesRequest$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        walkNavigationRoutesRequestInteractor$performRoutesRequest$1 = new WalkNavigationRoutesRequestInteractor$performRoutesRequest$1(this, continuationImpl);
        Object obj2 = walkNavigationRoutesRequestInteractor$performRoutesRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavigationRoutesRequestInteractor$performRoutesRequest$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        WalkNavigationRoutesRequestInteractor$resolveRouteUri$1 walkNavigationRoutesRequestInteractor$resolveRouteUri$1;
        int i;
        if (continuationImpl instanceof WalkNavigationRoutesRequestInteractor$resolveRouteUri$1) {
            walkNavigationRoutesRequestInteractor$resolveRouteUri$1 = (WalkNavigationRoutesRequestInteractor$resolveRouteUri$1) continuationImpl;
            int i2 = walkNavigationRoutesRequestInteractor$resolveRouteUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavigationRoutesRequestInteractor$resolveRouteUri$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkNavigationRoutesRequestInteractor$resolveRouteUri$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavigationRoutesRequestInteractor$resolveRouteUri$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                kotlin.b.b(obj);
                lv21 lv21Var = new lv21(str, 4);
                ke31 ke31Var = new ke31(29);
                walkNavigationRoutesRequestInteractor$resolveRouteUri$1.L$0 = null;
                walkNavigationRoutesRequestInteractor$resolveRouteUri$1.label = 1;
                Object a = a(lv21Var, ke31Var, walkNavigationRoutesRequestInteractor$resolveRouteUri$1);
                return a == obj2 ? obj2 : a;
            }
        }
        walkNavigationRoutesRequestInteractor$resolveRouteUri$1 = new WalkNavigationRoutesRequestInteractor$resolveRouteUri$1(this, continuationImpl);
        Object obj3 = walkNavigationRoutesRequestInteractor$resolveRouteUri$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavigationRoutesRequestInteractor$resolveRouteUri$1.label;
        if (i == 0) {
        }
    }
}
