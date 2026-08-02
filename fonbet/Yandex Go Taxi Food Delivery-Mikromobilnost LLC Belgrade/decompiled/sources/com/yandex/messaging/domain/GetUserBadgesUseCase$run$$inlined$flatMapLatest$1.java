package com.yandex.messaging.domain;

import com.yandex.messaging.internal.PrivateChat;
import defpackage.a7t;
import defpackage.cl21;
import defpackage.dft;
import defpackage.gbb1;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.GetUserBadgesUseCase$run$$inlined$flatMapLatest$1", f = "GetUserBadgesUseCase.kt", l = {194, 189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetUserBadgesUseCase$run$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ dft $params$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserBadgesUseCase$run$$inlined$flatMapLatest$1(Continuation continuation, dft dftVar, g gVar) {
        super(3, continuation);
        this.$params$inlined = dftVar;
        this.this$0 = gVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetUserBadgesUseCase$run$$inlined$flatMapLatest$1 getUserBadgesUseCase$run$$inlined$flatMapLatest$1 = new GetUserBadgesUseCase$run$$inlined$flatMapLatest$1((Continuation) obj3, this.$params$inlined, this.this$0);
        getUserBadgesUseCase$run$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getUserBadgesUseCase$run$$inlined$flatMapLatest$1.L$1 = obj2;
        return getUserBadgesUseCase$run$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0086, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r9, r1, r8) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0088, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r9 == r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 2;
        String str = null;
        Object[] objArr = 0;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            if (jl40.l((String) this.L$1, this.$params$inlined.a)) {
                this.$params$inlined.getClass();
            }
            com.yandex.messaging.internal.authorized.j jVar = this.this$0.e;
            this.L$0 = vprVar;
            this.label = 1;
            obj = gbb1.c(jVar, this);
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
        tpr t = kotlinx.coroutines.flow.e.t(new m0(this.this$0.f.a(new PrivateChat(this.$params$inlined.a, str, i2, objArr == true ? 1 : 0)), this.this$0.c.a(new a7t(this.$params$inlined.a)), new GetUserBadgesUseCase$run$2$1((cl21) obj, this.$params$inlined, null)));
        this.L$0 = null;
        this.label = 2;
    }
}
