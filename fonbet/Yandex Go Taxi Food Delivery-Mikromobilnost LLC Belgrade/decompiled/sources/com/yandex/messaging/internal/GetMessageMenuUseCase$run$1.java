package com.yandex.messaging.internal;

import defpackage.d9t;
import defpackage.j9b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ru10;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lru10;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetMessageMenuUseCase$run$1", f = "GetMessageMenuUseCase.kt", l = {39, 41}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetMessageMenuUseCase$run$1 extends SuspendLambda implements wls {
    final /* synthetic */ d9t $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMessageMenuUseCase$run$1(d9t d9tVar, r rVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rVar;
        this.$params = d9tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetMessageMenuUseCase$run$1 getMessageMenuUseCase$run$1 = new GetMessageMenuUseCase$run$1(this.$params, this.this$0, continuation);
        getMessageMenuUseCase$run$1.L$0 = obj;
        return getMessageMenuUseCase$run$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetMessageMenuUseCase$run$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r8, r1, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            j9b c = this.this$0.b.c(this.$params.a);
            if (c != null) {
                ru10 a = c.a().a(this.$params.b);
                this.L$0 = vprVar;
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$0;
            kotlin.b.b(obj);
        }
        tpr F = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(this.this$0.b.b(this.$params.a), new GetMessageMenuUseCase$run$1$invokeSuspend$$inlined$flatMapLatest$1(this.$params, this.this$0, null)), this.this$0.c.e);
        this.L$0 = null;
        this.label = 2;
    }
}
