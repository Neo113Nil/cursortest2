package com.yandex.messaging.domain.unreadcount;

import defpackage.kat;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t5t;
import defpackage.tpr;
import defpackage.u5t;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.unreadcount.GetCurrentOrgUnreadChatsInfoUseCase$run$$inlined$flatMapLatest$1", f = "GetCurrentOrgUnreadChatsInfoUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetCurrentOrgUnreadChatsInfoUseCase$run$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ t5t $params$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ u5t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCurrentOrgUnreadChatsInfoUseCase$run$$inlined$flatMapLatest$1(Continuation continuation, u5t u5tVar, t5t t5tVar) {
        super(3, continuation);
        this.this$0 = u5tVar;
        this.$params$inlined = t5tVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetCurrentOrgUnreadChatsInfoUseCase$run$$inlined$flatMapLatest$1 getCurrentOrgUnreadChatsInfoUseCase$run$$inlined$flatMapLatest$1 = new GetCurrentOrgUnreadChatsInfoUseCase$run$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$params$inlined);
        getCurrentOrgUnreadChatsInfoUseCase$run$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getCurrentOrgUnreadChatsInfoUseCase$run$$inlined$flatMapLatest$1.L$1 = obj2;
        return getCurrentOrgUnreadChatsInfoUseCase$run$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            long longValue = ((Number) this.L$1).longValue();
            b bVar = this.this$0.c;
            Long l = new Long(longValue);
            boolean z = this.$params$inlined.a;
            bVar.getClass();
            tpr a = bVar.a(new kat(l, z));
            this.label = 1;
            if (e.u(a, vprVar, this) == coroutineSingletons) {
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
