package com.yandex.go.inapp_calls.repository.defaultoutgoingcall;

import defpackage.kw;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ kw b;
    public final /* synthetic */ g c;

    public f(r0 r0Var, kw kwVar, g gVar) {
        this.a = r0Var;
        this.b = kwVar;
        this.c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SetDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$1 setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$1;
        int i;
        if (continuation instanceof SetDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$1) {
            setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$1 = (SetDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$1) continuation;
            int i2 = setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b, this.c);
                    setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$1.L$0 = null;
                    setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$1.L$1 = null;
                    setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$1.L$2 = null;
                    setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$1) == coroutineSingletons) {
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
        setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$1 = new SetDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$1(this, continuation);
        Object obj2 = setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
