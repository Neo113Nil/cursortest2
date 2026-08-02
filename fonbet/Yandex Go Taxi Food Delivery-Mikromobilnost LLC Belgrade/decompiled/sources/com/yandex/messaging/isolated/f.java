package com.yandex.messaging.isolated;

import defpackage.kzw;
import defpackage.ny61;
import defpackage.szw;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ MessengerChatListFragment b;

    public f(vpr vprVar, MessengerChatListFragment messengerChatListFragment) {
        this.a = vprVar;
        this.b = messengerChatListFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MessengerChatListFragment$componentFlow$$inlined$map$1$2$1 messengerChatListFragment$componentFlow$$inlined$map$1$2$1;
        int i;
        szw createViewComponent;
        if (continuation instanceof MessengerChatListFragment$componentFlow$$inlined$map$1$2$1) {
            messengerChatListFragment$componentFlow$$inlined$map$1$2$1 = (MessengerChatListFragment$componentFlow$$inlined$map$1$2$1) continuation;
            int i2 = messengerChatListFragment$componentFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messengerChatListFragment$componentFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = messengerChatListFragment$componentFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = messengerChatListFragment$componentFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    createViewComponent = this.b.createViewComponent((kzw) obj);
                    messengerChatListFragment$componentFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(createViewComponent, messengerChatListFragment$componentFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        messengerChatListFragment$componentFlow$$inlined$map$1$2$1 = new MessengerChatListFragment$componentFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = messengerChatListFragment$componentFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = messengerChatListFragment$componentFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
