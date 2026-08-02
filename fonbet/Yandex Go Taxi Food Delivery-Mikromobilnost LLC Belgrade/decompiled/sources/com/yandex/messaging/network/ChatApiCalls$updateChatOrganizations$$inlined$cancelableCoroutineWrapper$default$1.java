package com.yandex.messaging.network;

import com.yandex.messaging.core.net.entities.UpdateChatOrganizationsParams;
import defpackage.cn2;
import defpackage.dvw;
import defpackage.j18;
import defpackage.mvg;
import defpackage.n0b;
import defpackage.ny61;
import defpackage.o0b;
import defpackage.tse;
import defpackage.uo3;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.network.ChatApiCalls$updateChatOrganizations$$inlined$cancelableCoroutineWrapper$default$1", f = "ChatApiCalls.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class ChatApiCalls$updateChatOrganizations$$inlined$cancelableCoroutineWrapper$default$1 extends SuspendLambda implements wls {
    final /* synthetic */ UpdateChatOrganizationsParams $params$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ o0b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatApiCalls$updateChatOrganizations$$inlined$cancelableCoroutineWrapper$default$1(Continuation continuation, o0b o0bVar, UpdateChatOrganizationsParams updateChatOrganizationsParams) {
        super(2, continuation);
        this.this$0 = o0bVar;
        this.$params$inlined = updateChatOrganizationsParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatApiCalls$updateChatOrganizations$$inlined$cancelableCoroutineWrapper$default$1 chatApiCalls$updateChatOrganizations$$inlined$cancelableCoroutineWrapper$default$1 = new ChatApiCalls$updateChatOrganizations$$inlined$cancelableCoroutineWrapper$default$1(continuation, this.this$0, this.$params$inlined);
        chatApiCalls$updateChatOrganizations$$inlined$cancelableCoroutineWrapper$default$1.L$0 = obj;
        return chatApiCalls$updateChatOrganizations$$inlined$cancelableCoroutineWrapper$default$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatApiCalls$updateChatOrganizations$$inlined$cancelableCoroutineWrapper$default$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        tse tseVar = (tse) this.L$0;
        this.L$0 = tseVar;
        this.label = 1;
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        o0b o0bVar = this.this$0;
        j18Var.w(new uo3(tseVar, new cn2(o0bVar.b.a(new n0b(o0bVar, this.$params$inlined, j18Var)), 1), 17));
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
