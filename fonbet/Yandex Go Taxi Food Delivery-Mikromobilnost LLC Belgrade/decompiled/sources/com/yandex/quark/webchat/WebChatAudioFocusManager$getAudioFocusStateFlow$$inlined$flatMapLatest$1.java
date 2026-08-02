package com.yandex.quark.webchat;

import defpackage.ag3;
import defpackage.g92;
import defpackage.gci0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sc41;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.WebChatAudioFocusManager$getAudioFocusStateFlow$$inlined$flatMapLatest$1", f = "WebChatAudioFocusManager.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class WebChatAudioFocusManager$getAudioFocusStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ sc41 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatAudioFocusManager$getAudioFocusStateFlow$$inlined$flatMapLatest$1(Continuation continuation, sc41 sc41Var) {
        super(3, continuation);
        this.this$0 = sc41Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WebChatAudioFocusManager$getAudioFocusStateFlow$$inlined$flatMapLatest$1 webChatAudioFocusManager$getAudioFocusStateFlow$$inlined$flatMapLatest$1 = new WebChatAudioFocusManager$getAudioFocusStateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        webChatAudioFocusManager$getAudioFocusStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        webChatAudioFocusManager$getAudioFocusStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return webChatAudioFocusManager$getAudioFocusStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            tpr g92Var = ((Boolean) this.L$1).booleanValue() ? (gci0) this.this$0.a.a : new g92(2, ag3.a);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
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
