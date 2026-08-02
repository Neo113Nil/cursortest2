package com.yandex.messaging.internal;

import defpackage.j9b;
import defpackage.m150;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.v4t;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lm150;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetChatNameUseCase$run$1", f = "GetChatNameUseCase.kt", l = {41, 44}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetChatNameUseCase$run$1 extends SuspendLambda implements wls {
    final /* synthetic */ v4t $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatNameUseCase$run$1(v4t v4tVar, g gVar, Continuation continuation) {
        super(2, continuation);
        this.$params = v4tVar;
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetChatNameUseCase$run$1 getChatNameUseCase$run$1 = new GetChatNameUseCase$run$1(this.$params, this.this$0, continuation);
        getChatNameUseCase$run$1.L$0 = obj;
        return getChatNameUseCase$run$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetChatNameUseCase$run$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008e, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r1, r8, r7) != r0) goto L22;
     */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, h3t0] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, h3t0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        Ref$ObjectRef ref$ObjectRef;
        j9b c;
        vpr vprVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            ref$ObjectRef = new Ref$ObjectRef();
            ?? r5 = this.$params.b;
            ref$ObjectRef.element = r5;
            if (r5.a() && (c = this.this$0.b.c(this.$params.a)) != null) {
                m150 i2 = c.c().i();
                ref$ObjectRef.element = i2.a;
                this.L$0 = vprVar;
                this.L$1 = ref$ObjectRef;
                this.label = 1;
                if (vprVar.emit(i2, this) != coroutineSingletons) {
                    vprVar2 = vprVar;
                }
                return coroutineSingletons;
            }
            tpr F = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(this.this$0.b.b(this.$params.a), new GetChatNameUseCase$run$1$invokeSuspend$$inlined$flatMapLatest$1(null, ref$ObjectRef)), this.this$0.c.e);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$1;
            vprVar2 = (vpr) this.L$0;
            kotlin.b.b(obj);
        }
        vprVar = vprVar2;
        tpr F2 = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(this.this$0.b.b(this.$params.a), new GetChatNameUseCase$run$1$invokeSuspend$$inlined$flatMapLatest$1(null, ref$ObjectRef)), this.this$0.c.e);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
