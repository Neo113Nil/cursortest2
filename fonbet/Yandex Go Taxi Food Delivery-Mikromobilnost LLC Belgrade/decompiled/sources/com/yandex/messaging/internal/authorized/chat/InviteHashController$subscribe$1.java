package com.yandex.messaging.internal.authorized.chat;

import defpackage.fi9;
import defpackage.h3t0;
import defpackage.hww;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sb7;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lhww;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.InviteHashController$subscribe$1", f = "InviteHashController.kt", l = {27, 29}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class InviteHashController$subscribe$1 extends SuspendLambda implements wls {
    final /* synthetic */ h3t0 $snapshot;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteHashController$subscribe$1(h3t0 h3t0Var, i iVar, Continuation continuation) {
        super(2, continuation);
        this.$snapshot = h3t0Var;
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InviteHashController$subscribe$1 inviteHashController$subscribe$1 = new InviteHashController$subscribe$1(this.$snapshot, this.this$0, continuation);
        inviteHashController$subscribe$1.L$0 = obj;
        return inviteHashController$subscribe$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InviteHashController$subscribe$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L31;
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
            if (this.$snapshot.a()) {
                hww i2 = this.this$0.c.i();
                this.L$0 = vprVar;
                this.label = 1;
            }
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
        i iVar = this.this$0;
        sb7 sb7Var = iVar.b;
        String str = iVar.a.b;
        fi9 d = com.yandex.messaging.internal.storage.h.d(sb7Var);
        i iVar2 = this.this$0;
        this.L$0 = null;
        this.label = 2;
        kotlinx.coroutines.flow.e.w(vprVar);
        Object collect = d.collect(new com.yandex.messaging.internal.storage.a(new com.yandex.messaging.internal.storage.b(new h(vprVar, iVar2)), str), this);
        if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
            collect = zy11Var;
        }
        if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
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
