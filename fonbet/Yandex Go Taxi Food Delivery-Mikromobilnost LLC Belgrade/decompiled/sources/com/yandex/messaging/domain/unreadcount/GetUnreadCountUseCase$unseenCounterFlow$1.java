package com.yandex.messaging.domain.unreadcount;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.storage.h;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.fi9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.x221;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lx221;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.unreadcount.GetUnreadCountUseCase$unseenCounterFlow$1", f = "GetUnreadCountUseCase.kt", l = {54, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetUnreadCountUseCase$unseenCounterFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    final /* synthetic */ Long $orgId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUnreadCountUseCase$unseenCounterFlow$1(d dVar, Long l, ChatRequest chatRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$orgId = l;
        this.$chatRequest = chatRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetUnreadCountUseCase$unseenCounterFlow$1 getUnreadCountUseCase$unseenCounterFlow$1 = new GetUnreadCountUseCase$unseenCounterFlow$1(this.this$0, this.$orgId, this.$chatRequest, continuation);
        getUnreadCountUseCase$unseenCounterFlow$1.L$0 = obj;
        return getUnreadCountUseCase$unseenCounterFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetUnreadCountUseCase$unseenCounterFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L22;
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
            x221 g = this.this$0.b.g(this.$orgId, this.$chatRequest);
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
        fi9 h = h.h(this.this$0.c);
        d dVar = this.this$0;
        Long l = this.$orgId;
        ChatRequest chatRequest = this.$chatRequest;
        this.L$0 = null;
        this.label = 2;
        e.w(vprVar);
        Object collect = h.collect(new c(vprVar, dVar, l, chatRequest), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
