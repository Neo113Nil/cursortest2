package com.yandex.go.external_service.delegates;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes12.dex */
public final class b implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ Ref$ObjectRef b;

    public b(jqr jqrVar, Ref$ObjectRef ref$ObjectRef) {
        this.a = jqrVar;
        this.b = ref$ObjectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$filter$1$1 mainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$filter$1$1;
        int i;
        if (continuation instanceof MainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$filter$1$1) {
            mainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$filter$1$1 = (MainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$filter$1$1) continuation;
            int i2 = mainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    mainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$filter$1$1.L$0 = null;
                    mainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$filter$1$1.L$1 = null;
                    mainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$filter$1$1.L$2 = null;
                    mainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(aVar, mainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$filter$1$1) == coroutineSingletons) {
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
        mainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$filter$1$1 = new MainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$filter$1$1(this, continuation);
        Object obj2 = mainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
