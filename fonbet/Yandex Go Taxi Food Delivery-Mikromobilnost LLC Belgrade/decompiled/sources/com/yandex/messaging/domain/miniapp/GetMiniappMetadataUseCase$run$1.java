package com.yandex.messaging.domain.miniapp;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.PrivateChatRequest;
import com.yandex.messaging.domain.MetadataInteractor$getChatMetadata$$inlined$flatMapLatest$1;
import com.yandex.messaging.internal.entities.ChatId;
import defpackage.f920;
import defpackage.fzw;
import defpackage.kse;
import defpackage.lqo;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p5b;
import defpackage.pvn;
import defpackage.rol0;
import defpackage.s020;
import defpackage.tpr;
import defpackage.tz10;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Le920;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.miniapp.GetMiniappMetadataUseCase$run$1", f = "GetMiniappMetadataUseCase.kt", l = {30, 33, 35}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetMiniappMetadataUseCase$run$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMiniappMetadataUseCase$run$1(ChatRequest chatRequest, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$chatRequest = chatRequest;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetMiniappMetadataUseCase$run$1 getMiniappMetadataUseCase$run$1 = new GetMiniappMetadataUseCase$run$1(this.$chatRequest, this.this$0, continuation);
        getMiniappMetadataUseCase$run$1.L$0 = obj;
        return getMiniappMetadataUseCase$run$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetMiniappMetadataUseCase$run$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r10 == r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e7 A[RETURN] */
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
            ChatRequest chatRequest = this.$chatRequest;
            if (!(chatRequest instanceof PrivateChatRequest ? true : chatRequest instanceof ExistingChatRequest ? ChatId.Companion.e(((ExistingChatRequest) chatRequest).id()) : false)) {
                lqo lqoVar = this.this$0.d;
                if (lqoVar.a(tz10.o) && lqoVar.a(tz10.z)) {
                    com.yandex.messaging.internal.authorized.chat.b bVar = this.this$0.b;
                    ChatRequest chatRequest2 = this.$chatRequest;
                    this.L$0 = vprVar;
                    this.label = 2;
                    obj = bVar.a(chatRequest2, this);
                }
            }
            f920 f920Var = this.this$0.c;
            tpr t = !f920Var.c.a(tz10.o) ? pvn.a : e.t(new fzw(10, e.F(e.X(f920Var.a.b(this.$chatRequest), new MetadataInteractor$getChatMetadata$$inlined$flatMapLatest$1(3, null)), f920Var.b.e), f920Var));
            this.label = 1;
            return e.u(t, vprVar, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            return zy11Var;
        }
        if (i != 2) {
            if (i == 3) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vprVar = (vpr) this.L$0;
        kotlin.b.b(obj);
        p5b p5bVar = (p5b) ((m8g) ((s020) obj)).G0.get();
        kse.a(p5bVar.d);
        tpr t2 = e.t(new rol0(new ChatMiniappController$miniappDataFlow$1(p5bVar, null)));
        this.L$0 = null;
        this.label = 3;
        e.w(vprVar);
        Object collect = t2.collect(new b(vprVar), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect == coroutineSingletons) {
        }
    }
}
