package com.yandex.messaging.domain.miniapp;

import defpackage.b5a;
import defpackage.eci0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p5b;
import defpackage.r5b;
import defpackage.sb7;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lr5b;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.miniapp.ChatMiniappController$miniappDataFlow$1", f = "ChatMiniappController.kt", l = {31, 32}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatMiniappController$miniappDataFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ p5b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMiniappController$miniappDataFlow$1(p5b p5bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = p5bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatMiniappController$miniappDataFlow$1 chatMiniappController$miniappDataFlow$1 = new ChatMiniappController$miniappDataFlow$1(this.this$0, continuation);
        chatMiniappController$miniappDataFlow$1.L$0 = obj;
        return chatMiniappController$miniappDataFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatMiniappController$miniappDataFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r1.emit(r10, r9) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            p5b p5bVar = this.this$0;
            r5b r5bVar = (r5b) androidx.room.util.a.b(p5bVar.b.b.K().a, true, false, new b5a(p5bVar.c.b, 7));
            this.L$0 = vprVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$0;
            kotlin.b.b(obj);
        }
        p5b p5bVar2 = this.this$0;
        sb7 sb7Var = p5bVar2.a;
        String str = p5bVar2.c.b;
        eci0 eci0Var = sb7Var.p;
        this.L$0 = null;
        this.label = 2;
        e.w(vprVar);
        Object collect = eci0Var.a.collect(new com.yandex.messaging.internal.storage.c(new a(vprVar, p5bVar2), str), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
