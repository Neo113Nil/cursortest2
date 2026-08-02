package com.yandex.go.messenger_native;

import defpackage.c120;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ c120 b;

    public c(tpr tprVar, c120 c120Var) {
        this.a = tprVar;
        this.b = c120Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        NativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$1 nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof NativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$1) {
            nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$1 = (NativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$1) continuation;
            int i2 = nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$1.L$0 = null;
                    nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$1.L$1 = null;
                    nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$1.L$2 = null;
                    nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$1 = new NativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
