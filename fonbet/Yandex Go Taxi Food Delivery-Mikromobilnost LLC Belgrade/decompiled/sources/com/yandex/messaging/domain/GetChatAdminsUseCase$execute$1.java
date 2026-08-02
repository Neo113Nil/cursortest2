package com.yandex.messaging.domain;

import com.yandex.messaging.ChatRequest;
import defpackage.j9b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.y9n;
import defpackage.zy11;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.GetChatAdminsUseCase$execute$1", f = "GetChatAdminsUseCase.kt", l = {26, 29}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetChatAdminsUseCase$execute$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chat;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatAdminsUseCase$execute$1(d dVar, ChatRequest chatRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$chat = chatRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetChatAdminsUseCase$execute$1 getChatAdminsUseCase$execute$1 = new GetChatAdminsUseCase$execute$1(this.this$0, this.$chat, continuation);
        getChatAdminsUseCase$execute$1.L$0 = obj;
        return getChatAdminsUseCase$execute$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetChatAdminsUseCase$execute$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r7, r1, r6) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0083, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r1.emit(r5, r6) == r0) goto L19;
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
            j9b c = this.this$0.a.c(this.$chat);
            if (c != null && !c.h().d) {
                HashSet hashSet = new HashSet(c.g().o());
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
        tpr F = kotlinx.coroutines.flow.e.F(new y9n(kotlinx.coroutines.flow.e.X(this.this$0.a.b(this.$chat), new GetChatAdminsUseCase$execute$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0)), 2), this.this$0.b.e);
        this.L$0 = null;
        this.label = 2;
    }
}
