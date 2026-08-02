package com.yandex.go.walking.navigation.impl.domain.interactor;

import com.yandex.go.walking.navigation.impl.navigation_core.g;
import defpackage.ny61;
import defpackage.v541;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final g a;
    public final v541 b;

    public a(g gVar, v541 v541Var) {
        this.a = gVar;
        this.b = v541Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        RequestNavigationRouteByUriInteractor$requestRouteByUri$1 requestNavigationRouteByUriInteractor$requestRouteByUri$1;
        int i;
        Object b;
        if (continuationImpl instanceof RequestNavigationRouteByUriInteractor$requestRouteByUri$1) {
            requestNavigationRouteByUriInteractor$requestRouteByUri$1 = (RequestNavigationRouteByUriInteractor$requestRouteByUri$1) continuationImpl;
            int i2 = requestNavigationRouteByUriInteractor$requestRouteByUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requestNavigationRouteByUriInteractor$requestRouteByUri$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requestNavigationRouteByUriInteractor$requestRouteByUri$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requestNavigationRouteByUriInteractor$requestRouteByUri$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    requestNavigationRouteByUriInteractor$requestRouteByUri$1.L$0 = null;
                    requestNavigationRouteByUriInteractor$requestRouteByUri$1.label = 1;
                    b = this.a.b(str, requestNavigationRouteByUriInteractor$requestRouteByUri$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (b instanceof Result.Failure) {
                    return kotlin.collections.a.R(this.b.a());
                }
                return null;
            }
        }
        requestNavigationRouteByUriInteractor$requestRouteByUri$1 = new RequestNavigationRouteByUriInteractor$requestRouteByUri$1(this, continuationImpl);
        Object obj2 = requestNavigationRouteByUriInteractor$requestRouteByUri$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requestNavigationRouteByUriInteractor$requestRouteByUri$1.label;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
    }
}
