package com.yandex.go.walking.navigation.impl.navigation_core;

import com.yandex.runtime.Error;
import defpackage.ny61;
import defpackage.tls;
import defpackage.vpr;
import defpackage.zy11;
import java.io.IOException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ g c;

    public e(vpr vprVar, tls tlsVar, g gVar) {
        this.a = vprVar;
        this.b = tlsVar;
        this.c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WalkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1 walkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof WalkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1) {
            walkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1 = (WalkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1) continuation;
            int i2 = walkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = walkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    IOException iOException = new IOException((String) this.b.invoke((Error) obj));
                    this.c.g.j(iOException);
                    Result result = new Result(new Result.Failure(iOException));
                    walkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1.L$0 = null;
                    walkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1.L$1 = null;
                    walkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1.L$2 = null;
                    walkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1.L$3 = null;
                    walkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(result, walkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1) == coroutineSingletons) {
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
        walkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1 = new WalkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1(this, continuation);
        Object obj22 = walkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$invokeSuspend$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
