package com.yandex.quark.webchat;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lzo41;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.WebChatAudioFocusManager$getAudioFocusStateFlow$1$1", f = "WebChatAudioFocusManager.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebChatAudioFocusManager$getAudioFocusStateFlow$1$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    public WebChatAudioFocusManager$getAudioFocusStateFlow$1$1() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebChatAudioFocusManager$getAudioFocusStateFlow$1$1 webChatAudioFocusManager$getAudioFocusStateFlow$1$1 = new WebChatAudioFocusManager$getAudioFocusStateFlow$1$1(2, continuation);
        webChatAudioFocusManager$getAudioFocusStateFlow$1$1.L$0 = obj;
        return webChatAudioFocusManager$getAudioFocusStateFlow$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebChatAudioFocusManager$getAudioFocusStateFlow$1$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            this.label = 1;
            if (vprVar.emit(null, this) == coroutineSingletons) {
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
