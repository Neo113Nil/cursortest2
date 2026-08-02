package com.yandex.messaging.internal.authorized.chat;

import com.yandex.messaging.ChatRequest;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.g6u;
import defpackage.j9b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w4t;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.GetChatOrganizationsCountUseCase$run$2$1", f = "GetChatOrganizationsCountUseCase.kt", l = {50, 50, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetChatOrganizationsCountUseCase$run$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ w4t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatOrganizationsCountUseCase$run$2$1(w4t w4tVar, ChatRequest chatRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = w4tVar;
        this.$params = chatRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetChatOrganizationsCountUseCase$run$2$1 getChatOrganizationsCountUseCase$run$2$1 = new GetChatOrganizationsCountUseCase$run$2$1(this.this$0, this.$params, continuation);
        getChatOrganizationsCountUseCase$run$2$1.L$0 = obj;
        return getChatOrganizationsCountUseCase$run$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetChatOrganizationsCountUseCase$run$2$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0091, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r10, r1, r9) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        vpr vprVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            j9b c = this.this$0.b.c(this.$params);
            if (c != null) {
                w4t w4tVar = this.this$0;
                g6u g6uVar = w4tVar.d.e;
                GetChatOrganizationsCountUseCase$run$2$1$1$1 getChatOrganizationsCountUseCase$run$2$1$1$1 = new GetChatOrganizationsCountUseCase$run$2$1$1$1(w4tVar, c, null);
                this.L$0 = vprVar;
                this.L$1 = vprVar;
                this.label = 1;
                obj = tje.k0(g6uVar, getChatOrganizationsCountUseCase$run$2$1$1$1, this);
                if (obj != coroutineSingletons) {
                    vprVar2 = vprVar;
                    this.L$0 = vprVar2;
                    this.L$1 = null;
                    this.label = 2;
                    if (vprVar.emit(obj, this) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            tpr F = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(this.this$0.b.b(this.$params), new GetChatOrganizationsCountUseCase$run$2$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0)), this.this$0.d.e);
            this.L$0 = null;
            this.label = 3;
        } else {
            if (i == 1) {
                vprVar = (vpr) this.L$1;
                vprVar2 = (vpr) this.L$0;
                kotlin.b.b(obj);
                this.L$0 = vprVar2;
                this.L$1 = null;
                this.label = 2;
                if (vprVar.emit(obj, this) != coroutineSingletons) {
                    vprVar = vprVar2;
                    tpr F2 = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(this.this$0.b.b(this.$params), new GetChatOrganizationsCountUseCase$run$2$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0)), this.this$0.d.e);
                    this.L$0 = null;
                    this.label = 3;
                }
                return coroutineSingletons;
            }
            if (i == 2) {
                vprVar = (vpr) this.L$0;
                kotlin.b.b(obj);
                tpr F22 = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(this.this$0.b.b(this.$params), new GetChatOrganizationsCountUseCase$run$2$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0)), this.this$0.d.e);
                this.L$0 = null;
                this.label = 3;
            } else {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
        }
        return zy11.a;
    }
}
