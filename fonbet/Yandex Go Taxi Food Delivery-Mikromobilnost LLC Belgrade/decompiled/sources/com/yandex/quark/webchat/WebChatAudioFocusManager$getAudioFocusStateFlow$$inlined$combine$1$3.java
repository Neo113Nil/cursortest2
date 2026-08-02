package com.yandex.quark.webchat;

import defpackage.j73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sc41;
import defpackage.uo41;
import defpackage.vo41;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wo41;
import defpackage.xo41;
import defpackage.yo41;
import defpackage.zls;
import defpackage.zo41;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.WebChatAudioFocusManager$getAudioFocusStateFlow$$inlined$combine$1$3", f = "WebChatAudioFocusManager.kt", l = {292}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class WebChatAudioFocusManager$getAudioFocusStateFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ sc41 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatAudioFocusManager$getAudioFocusStateFlow$$inlined$combine$1$3(Continuation continuation, sc41 sc41Var) {
        super(3, continuation);
        this.this$0 = sc41Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WebChatAudioFocusManager$getAudioFocusStateFlow$$inlined$combine$1$3 webChatAudioFocusManager$getAudioFocusStateFlow$$inlined$combine$1$3 = new WebChatAudioFocusManager$getAudioFocusStateFlow$$inlined$combine$1$3((Continuation) obj3, this.this$0);
        webChatAudioFocusManager$getAudioFocusStateFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        webChatAudioFocusManager$getAudioFocusStateFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return webChatAudioFocusManager$getAudioFocusStateFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            List A = j73.A((zo41[]) ((Object[]) this.L$1));
            boolean z = false;
            if (!A.isEmpty()) {
                Iterator it = A.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    zo41 zo41Var = (zo41) it.next();
                    this.this$0.getClass();
                    if (!(zo41Var instanceof uo41) && !(zo41Var instanceof vo41) && !(zo41Var instanceof xo41)) {
                        if (!(zo41Var instanceof yo41) && !(zo41Var instanceof wo41)) {
                            w511.b();
                            return null;
                        }
                        z = true;
                    }
                }
            }
            Boolean valueOf = Boolean.valueOf(z);
            this.label = 1;
            if (vprVar.emit(valueOf, this) == coroutineSingletons) {
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
