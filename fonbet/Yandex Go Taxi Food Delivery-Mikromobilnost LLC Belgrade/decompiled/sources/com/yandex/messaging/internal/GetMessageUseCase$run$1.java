package com.yandex.messaging.internal;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.g6u;
import defpackage.g9t;
import defpackage.h9t;
import defpackage.j9b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r3z;
import defpackage.tje;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lh9t;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetMessageUseCase$run$1", f = "GetMessageUseCase.kt", l = {46, 49, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetMessageUseCase$run$1 extends SuspendLambda implements wls {
    final /* synthetic */ g9t $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMessageUseCase$run$1(g9t g9tVar, t tVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tVar;
        this.$params = g9tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetMessageUseCase$run$1 getMessageUseCase$run$1 = new GetMessageUseCase$run$1(this.$params, this.this$0, continuation);
        getMessageUseCase$run$1.L$0 = obj;
        return getMessageUseCase$run$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetMessageUseCase$run$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ad, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r1, r11, r10) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r1.emit(r6, r10) == r0) goto L26;
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
            j9b c = this.this$0.b.c(this.$params.a);
            if (c != null) {
                t tVar = this.this$0;
                g9t g9tVar = this.$params;
                g6u g6uVar = tVar.c.b;
                GetMessageUseCase$run$1$1$message$1 getMessageUseCase$run$1$1$message$1 = new GetMessageUseCase$run$1$1$message$1(c, g9tVar, null);
                this.L$0 = vprVar;
                this.L$1 = c;
                this.label = 1;
                Object k0 = tje.k0(g6uVar, getMessageUseCase$run$1$1$message$1, this);
                if (k0 != coroutineSingletons) {
                    vprVar2 = vprVar;
                    obj = k0;
                    j9bVar = c;
                }
                return coroutineSingletons;
            }
            tpr F = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(this.this$0.b.b(this.$params.a), new GetMessageUseCase$run$1$invokeSuspend$$inlined$flatMapLatest$1(this.$params, this.this$0, null)), this.this$0.c.e);
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
            tpr F2 = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(this.this$0.b.b(this.$params.a), new GetMessageUseCase$run$1$invokeSuspend$$inlined$flatMapLatest$1(this.$params, this.this$0, null)), this.this$0.c.e);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        r3z r3zVar = (r3z) obj;
        if (r3zVar != null) {
            h9t h9tVar = new h9t(j9bVar.h(), r3zVar);
            this.L$0 = vprVar2;
            this.L$1 = null;
            this.label = 2;
        }
        vprVar = vprVar2;
        tpr F22 = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(this.this$0.b.b(this.$params.a), new GetMessageUseCase$run$1$invokeSuspend$$inlined$flatMapLatest$1(this.$params, this.this$0, null)), this.this$0.c.e);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
    }
}
