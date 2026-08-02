package com.yandex.messaging.data;

import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import defpackage.jo0;
import defpackage.kse;
import defpackage.loe;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ota0;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.data.PendingStarsStorage$getPendingStarFlow$1", f = "PendingStarsStorage.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PendingStarsStorage$getPendingStarFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ MessageRef $messageRef;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingStarsStorage$getPendingStarFlow$1(a aVar, MessageRef messageRef, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$messageRef = messageRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PendingStarsStorage$getPendingStarFlow$1 pendingStarsStorage$getPendingStarFlow$1 = new PendingStarsStorage$getPendingStarFlow$1(this.this$0, this.$messageRef, continuation);
        pendingStarsStorage$getPendingStarFlow$1.L$0 = obj;
        return pendingStarsStorage$getPendingStarFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PendingStarsStorage$getPendingStarFlow$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object putIfAbsent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            kse.b(this.this$0.a);
            ota0 ota0Var = (ota0) this.this$0.d.get(this.$messageRef);
            x6f0 x6f0Var = (x6f0) y6f0Var;
            x6f0Var.d(ota0Var != null ? Boolean.valueOf(ota0Var.b) : null);
            ConcurrentHashMap concurrentHashMap = this.this$0.e;
            MessageRef messageRef = this.$messageRef;
            Object obj2 = concurrentHashMap.get(messageRef);
            if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(messageRef, (obj2 = new CopyOnWriteArraySet()))) != null) {
                obj2 = putIfAbsent;
            }
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) obj2;
            loe loeVar = new loe(x6f0Var, 3);
            copyOnWriteArraySet.add(loeVar);
            jo0 jo0Var = new jo0(this.this$0, copyOnWriteArraySet, loeVar, this.$messageRef, 28);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(x6f0Var, jo0Var, this) == coroutineSingletons) {
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
