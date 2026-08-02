package com.yandex.messaging.internal;

import com.yandex.messaging.ChatRequest;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.j9b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p8t;
import defpackage.r3z;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lp8t;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetLastMessageUseCase$lastMessageFlow$1", f = "GetLastMessageUseCase.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 58, 60}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetLastMessageUseCase$lastMessageFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLastMessageUseCase$lastMessageFlow$1(n nVar, ChatRequest chatRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$chatRequest = chatRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetLastMessageUseCase$lastMessageFlow$1 getLastMessageUseCase$lastMessageFlow$1 = new GetLastMessageUseCase$lastMessageFlow$1(this.this$0, this.$chatRequest, continuation);
        getLastMessageUseCase$lastMessageFlow$1.L$0 = obj;
        return getLastMessageUseCase$lastMessageFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetLastMessageUseCase$lastMessageFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a5, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r1, r10, r9) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r1.emit(r6, r9) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        vpr vprVar2;
        j9b j9bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            j9b c = this.this$0.b.c(this.$chatRequest);
            if (c != null) {
                sjh sjhVar = this.this$0.c.c;
                GetLastMessageUseCase$lastMessageFlow$1$1$message$1 getLastMessageUseCase$lastMessageFlow$1$1$message$1 = new GetLastMessageUseCase$lastMessageFlow$1$1$message$1(c, null);
                this.L$0 = vprVar;
                this.L$1 = c;
                this.label = 1;
                Object k0 = tje.k0(sjhVar, getLastMessageUseCase$lastMessageFlow$1$1$message$1, this);
                if (k0 != coroutineSingletons) {
                    vprVar2 = vprVar;
                    obj = k0;
                    j9bVar = c;
                }
                return coroutineSingletons;
            }
            tpr F = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(this.this$0.b.b(this.$chatRequest), new GetLastMessageUseCase$lastMessageFlow$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0)), this.this$0.c.e);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        } else if (i == 1) {
            j9b j9bVar2 = (j9b) this.L$1;
            vpr vprVar3 = (vpr) this.L$0;
            kotlin.b.b(obj);
            j9bVar = j9bVar2;
            vprVar2 = vprVar3;
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar2 = (vpr) this.L$0;
            kotlin.b.b(obj);
            vprVar = vprVar2;
            tpr F2 = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(this.this$0.b.b(this.$chatRequest), new GetLastMessageUseCase$lastMessageFlow$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0)), this.this$0.c.e);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        r3z r3zVar = (r3z) obj;
        if (r3zVar != null) {
            p8t p8tVar = new p8t(j9bVar.h(), r3zVar);
            this.L$0 = vprVar2;
            this.L$1 = null;
            this.label = 2;
        }
        vprVar = vprVar2;
        tpr F22 = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(this.this$0.b.b(this.$chatRequest), new GetLastMessageUseCase$lastMessageFlow$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0)), this.this$0.c.e);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
    }
}
