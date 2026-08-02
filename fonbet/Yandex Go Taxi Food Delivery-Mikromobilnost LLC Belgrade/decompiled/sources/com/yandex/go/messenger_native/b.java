package com.yandex.go.messenger_native;

import com.yandex.go.messenger_native.api.NativeMessengerConnectionStatus;
import defpackage.a120;
import defpackage.b120;
import defpackage.c120;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.y020;
import defpackage.z020;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c120 b;

    public b(vpr vprVar, c120 c120Var) {
        this.a = vprVar;
        this.b = c120Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1 nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        NativeMessengerConnectionStatus nativeMessengerConnectionStatus;
        if (continuation instanceof NativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1) {
            nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1 = (NativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    b120 b120Var = (b120) obj;
                    this.b.getClass();
                    if (b120Var instanceof y020) {
                        nativeMessengerConnectionStatus = NativeMessengerConnectionStatus.CONNECTED;
                    } else if (b120Var instanceof z020) {
                        nativeMessengerConnectionStatus = NativeMessengerConnectionStatus.FAILED;
                    } else {
                        if (!(b120Var instanceof a120)) {
                            w511.b();
                            return null;
                        }
                        nativeMessengerConnectionStatus = NativeMessengerConnectionStatus.IN_PROGRESS;
                    }
                    nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(nativeMessengerConnectionStatus, nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1 = new NativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nativeMessengerDelegateImpl$connectionStatusFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
