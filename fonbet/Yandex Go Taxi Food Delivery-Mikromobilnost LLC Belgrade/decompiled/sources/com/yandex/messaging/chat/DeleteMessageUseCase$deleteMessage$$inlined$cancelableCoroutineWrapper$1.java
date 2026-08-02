package com.yandex.messaging.chat;

import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.ServerMessageRef;
import defpackage.cn2;
import defpackage.dvw;
import defpackage.hmn;
import defpackage.j18;
import defpackage.kmn;
import defpackage.lc3;
import defpackage.mc3;
import defpackage.mmn;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q0b;
import defpackage.r3z;
import defpackage.tse;
import defpackage.wls;
import defpackage.x08;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.chat.DeleteMessageUseCase$deleteMessage$$inlined$cancelableCoroutineWrapper$1", f = "DeleteMessageUseCase.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class DeleteMessageUseCase$deleteMessage$$inlined$cancelableCoroutineWrapper$1 extends SuspendLambda implements wls {
    final /* synthetic */ ServerMessageRef $deleteMessageRef$inlined;
    final /* synthetic */ mmn $this_deleteMessage$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteMessageUseCase$deleteMessage$$inlined$cancelableCoroutineWrapper$1(Continuation continuation, mmn mmnVar, ServerMessageRef serverMessageRef) {
        super(2, continuation);
        this.$this_deleteMessage$inlined = mmnVar;
        this.$deleteMessageRef$inlined = serverMessageRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeleteMessageUseCase$deleteMessage$$inlined$cancelableCoroutineWrapper$1 deleteMessageUseCase$deleteMessage$$inlined$cancelableCoroutineWrapper$1 = new DeleteMessageUseCase$deleteMessage$$inlined$cancelableCoroutineWrapper$1(continuation, this.$this_deleteMessage$inlined, this.$deleteMessageRef$inlined);
        deleteMessageUseCase$deleteMessage$$inlined$cancelableCoroutineWrapper$1.L$0 = obj;
        return deleteMessageUseCase$deleteMessage$$inlined$cancelableCoroutineWrapper$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeleteMessageUseCase$deleteMessage$$inlined$cancelableCoroutineWrapper$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        tse tseVar = (tse) this.L$0;
        this.L$0 = tseVar;
        this.label = 1;
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        mmn mmnVar = this.$this_deleteMessage$inlined;
        ServerMessageRef serverMessageRef = this.$deleteMessageRef$inlined;
        mc3 mc3Var = new mc3(j18Var, 2);
        r3z c = mmnVar.b.c(serverMessageRef);
        if (c == null) {
            ny61.g("Required value was null.");
            return null;
        }
        x08 f = ((Boolean) c.a(new kmn())).booleanValue() ? null : mmnVar.c.f(new q0b(i2, new PlainMessage(null, null, null, null, null, null, null, null, mmnVar.a.a.b, serverMessageRef.getTimestamp(), null, null, null, (String) c.b(new hmn()), false, null, false, null, null, null, 1039615, null), mc3Var));
        if (f == null) {
            j18Var.resumeWith(Boolean.TRUE);
        }
        j18Var.w(new lc3(tseVar, f != null ? new cn2(f, 1) : null, i2));
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
