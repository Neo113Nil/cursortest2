package com.yandex.go.environment;

import defpackage.ny61;
import defpackage.pv0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public g(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1 switchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1) {
            switchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1 = (SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
            int i2 = switchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                switchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = switchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = switchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pv0 pv0Var = (pv0) ((Pair) obj).getFirst();
                    i iVar = this.b;
                    if (!iVar.j.a().a.equals(i.d(iVar, pv0Var))) {
                        switchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1.L$0 = null;
                        switchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1.L$1 = null;
                        switchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1.L$2 = null;
                        switchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1.L$3 = null;
                        switchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, switchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        switchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1 = new SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = switchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = switchNetworkEnvironmentListener$onFirstContentfulPaint$1$invokeSuspend$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
