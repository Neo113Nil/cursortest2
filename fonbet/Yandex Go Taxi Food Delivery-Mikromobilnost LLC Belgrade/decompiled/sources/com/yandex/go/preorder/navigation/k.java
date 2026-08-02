package com.yandex.go.preorder.navigation;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class k implements tpr {
    public final /* synthetic */ tpr a;

    public k(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$filterIsInstance$1$1 sourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$filterIsInstance$1$1;
        int i;
        if (continuation instanceof SourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$filterIsInstance$1$1) {
            sourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$filterIsInstance$1$1 = (SourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$filterIsInstance$1$1) continuation;
            int i2 = sourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$filterIsInstance$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$filterIsInstance$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$filterIsInstance$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$filterIsInstance$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar);
                    sourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$filterIsInstance$1$1.L$0 = null;
                    sourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$filterIsInstance$1$1.L$1 = null;
                    sourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$filterIsInstance$1$1.L$2 = null;
                    sourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$filterIsInstance$1$1.label = 1;
                    if (this.a.collect(jVar, sourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$filterIsInstance$1$1) == coroutineSingletons) {
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
        sourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$filterIsInstance$1$1 = new SourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$filterIsInstance$1$1(this, continuation);
        Object obj2 = sourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$filterIsInstance$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$filterIsInstance$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
