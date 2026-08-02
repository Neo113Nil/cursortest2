package com.yandex.messaging.domain.miniapp;

import defpackage.b5a;
import defpackage.ny61;
import defpackage.p5b;
import defpackage.r5b;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ p5b b;

    public a(vpr vprVar, p5b p5bVar) {
        this.a = vprVar;
        this.b = p5bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChatMiniappController$miniappDataFlow$1$invokeSuspend$$inlined$map$1$2$1 chatMiniappController$miniappDataFlow$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChatMiniappController$miniappDataFlow$1$invokeSuspend$$inlined$map$1$2$1) {
            chatMiniappController$miniappDataFlow$1$invokeSuspend$$inlined$map$1$2$1 = (ChatMiniappController$miniappDataFlow$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = chatMiniappController$miniappDataFlow$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatMiniappController$miniappDataFlow$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chatMiniappController$miniappDataFlow$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatMiniappController$miniappDataFlow$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    r5b r5bVar = (r5b) androidx.room.util.a.b(this.b.b.b.K().a, true, false, new b5a((String) obj, 7));
                    chatMiniappController$miniappDataFlow$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(r5bVar, chatMiniappController$miniappDataFlow$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        chatMiniappController$miniappDataFlow$1$invokeSuspend$$inlined$map$1$2$1 = new ChatMiniappController$miniappDataFlow$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chatMiniappController$miniappDataFlow$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatMiniappController$miniappDataFlow$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
