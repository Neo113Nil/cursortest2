package com.yandex.messaging.domain;

import defpackage.jl40;
import defpackage.k5e;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ClientIsConnectedUseCase$run$$inlined$map$1$2$1 clientIsConnectedUseCase$run$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ClientIsConnectedUseCase$run$$inlined$map$1$2$1) {
            clientIsConnectedUseCase$run$$inlined$map$1$2$1 = (ClientIsConnectedUseCase$run$$inlined$map$1$2$1) continuation;
            int i2 = clientIsConnectedUseCase$run$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                clientIsConnectedUseCase$run$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = clientIsConnectedUseCase$run$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = clientIsConnectedUseCase$run$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    k5e k5eVar = (k5e) obj;
                    Boolean valueOf = Boolean.valueOf(jl40.l(k5eVar, k5e.c) || jl40.l(k5eVar, k5e.i));
                    clientIsConnectedUseCase$run$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, clientIsConnectedUseCase$run$$inlined$map$1$2$1) == coroutineSingletons) {
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
        clientIsConnectedUseCase$run$$inlined$map$1$2$1 = new ClientIsConnectedUseCase$run$$inlined$map$1$2$1(this, continuation);
        Object obj22 = clientIsConnectedUseCase$run$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = clientIsConnectedUseCase$run$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
