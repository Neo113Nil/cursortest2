package com.yandex.messaging.internal.authorized.chat;

import defpackage.h5b;
import defpackage.i5b;
import defpackage.j5b;
import defpackage.l5b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.ChatMetadataController$chatFlow$$inlined$disposableFlowWrapper$1", f = "ChatMetadataController.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class ChatMetadataController$chatFlow$$inlined$disposableFlowWrapper$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l5b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMetadataController$chatFlow$$inlined$disposableFlowWrapper$1(Continuation continuation, l5b l5bVar) {
        super(2, continuation);
        this.this$0 = l5bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatMetadataController$chatFlow$$inlined$disposableFlowWrapper$1 chatMetadataController$chatFlow$$inlined$disposableFlowWrapper$1 = new ChatMetadataController$chatFlow$$inlined$disposableFlowWrapper$1(continuation, this.this$0);
        chatMetadataController$chatFlow$$inlined$disposableFlowWrapper$1.L$0 = obj;
        return chatMetadataController$chatFlow$$inlined$disposableFlowWrapper$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatMetadataController$chatFlow$$inlined$disposableFlowWrapper$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            l5b l5bVar = this.this$0;
            j5b j5bVar = new j5b(y6f0Var);
            o1b0 o1b0Var = l5bVar.c.a;
            i5b i5bVar = new i5b(new h5b(l5bVar, j5bVar, o1b0Var.a, o1b0Var.b, 8), 0);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, i5bVar, this) == coroutineSingletons) {
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
