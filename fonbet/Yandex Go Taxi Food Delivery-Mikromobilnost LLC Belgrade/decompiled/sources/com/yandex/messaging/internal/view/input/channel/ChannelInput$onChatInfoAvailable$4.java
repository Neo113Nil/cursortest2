package com.yandex.messaging.internal.view.input.channel;

import com.yandex.messaging.internal.auth.AuthorizationObservable$AuthState;
import defpackage.ak3;
import defpackage.g191;
import defpackage.jn3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.input.channel.ChannelInput$onChatInfoAvailable$4", f = "ChannelInput.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChannelInput$onChatInfoAvailable$4 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelInput$onChatInfoAvailable$4(a aVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ChannelInput$onChatInfoAvailable$4(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ChannelInput$onChatInfoAvailable$4 channelInput$onChatInfoAvailable$4 = (ChannelInput$onChatInfoAvailable$4) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        channelInput$onChatInfoAvailable$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        jn3 jn3Var = aVar.y.a;
        ak3 ak3Var = new ak3(aVar, true, 1);
        jn3Var.getClass();
        tje.e();
        AuthorizationObservable$AuthState authorizationObservable$AuthState = jn3Var.i;
        if (authorizationObservable$AuthState == null) {
            authorizationObservable$AuthState = jn3Var.a();
            jn3Var.i = authorizationObservable$AuthState;
        }
        jn3Var.b(authorizationObservable$AuthState, new g191(ak3Var));
        return zy11.a;
    }
}
