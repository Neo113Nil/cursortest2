package com.yandex.messaging.isolated;

import defpackage.k0x;
import defpackage.kzw;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ MessengerChatFragment b;

    public e(vpr vprVar, MessengerChatFragment messengerChatFragment) {
        this.a = vprVar;
        this.b = messengerChatFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MessengerChatFragment$componentFlow$$inlined$map$1$2$1 messengerChatFragment$componentFlow$$inlined$map$1$2$1;
        int i;
        k0x createViewComponent;
        if (continuation instanceof MessengerChatFragment$componentFlow$$inlined$map$1$2$1) {
            messengerChatFragment$componentFlow$$inlined$map$1$2$1 = (MessengerChatFragment$componentFlow$$inlined$map$1$2$1) continuation;
            int i2 = messengerChatFragment$componentFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messengerChatFragment$componentFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = messengerChatFragment$componentFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = messengerChatFragment$componentFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    createViewComponent = this.b.createViewComponent((kzw) obj);
                    messengerChatFragment$componentFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(createViewComponent, messengerChatFragment$componentFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        messengerChatFragment$componentFlow$$inlined$map$1$2$1 = new MessengerChatFragment$componentFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = messengerChatFragment$componentFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = messengerChatFragment$componentFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
