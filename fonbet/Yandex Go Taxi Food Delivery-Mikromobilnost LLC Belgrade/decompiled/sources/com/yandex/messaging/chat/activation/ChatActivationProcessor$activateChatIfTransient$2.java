package com.yandex.messaging.chat.activation;

import com.yandex.messaging.core.net.entities.ActivateChatRequestParams;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$activateChat$$inlined$makeCall$1;
import defpackage.fse;
import defpackage.hcb;
import defpackage.k020;
import defpackage.l020;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.oyj0;
import defpackage.qn2;
import defpackage.tje;
import defpackage.to3;
import defpackage.tse;
import defpackage.wls;
import defpackage.ydz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.chat.activation.ChatActivationProcessor$activateChatIfTransient$2", f = "ChatActivationProcessor.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatActivationProcessor$activateChatIfTransient$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatActivationProcessor$activateChatIfTransient$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatActivationProcessor$activateChatIfTransient$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatActivationProcessor$activateChatIfTransient$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            k020 k020Var = aVar.b;
            o1b0 o1b0Var = aVar.a;
            if (((Boolean) androidx.room.util.a.b(k020Var.b.Y().a, true, false, new hcb(o1b0Var.a, 19))).booleanValue()) {
                a.a(this.this$0, false);
                to3 to3Var = (to3) this.this$0.d.getValue();
                ActivateChatRequestParams activateChatRequestParams = new ActivateChatRequestParams(this.this$0.a.b);
                this.label = 1;
                fse fseVar = get_context();
                if (fseVar == null) {
                    fseVar = get_context();
                }
                obj = tje.k0(fseVar, new AuthorizedApiCallsExtensionsKt$activateChat$$inlined$makeCall$1(null, to3Var, activateChatRequestParams), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        qn2 qn2Var = (qn2) ((oyj0) obj).a();
        if (qn2Var != null) {
            boolean z = qn2Var.b;
            a aVar2 = this.this$0;
            if (ydz.a.a()) {
                ydz.b("ChatActivationHelper", qn2Var.toString());
            }
            if (z) {
                a.a(aVar2, true);
                l020 C = aVar2.b.C();
                try {
                    C.d(aVar2.a.b, true);
                    C.s();
                    C.close();
                } finally {
                }
            }
            throw new ChatActivationException(z);
        }
        return zy11.a;
    }
}
