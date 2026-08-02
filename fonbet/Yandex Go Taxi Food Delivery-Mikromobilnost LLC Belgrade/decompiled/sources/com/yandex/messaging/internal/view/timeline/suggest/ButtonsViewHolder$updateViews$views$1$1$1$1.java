package com.yandex.messaging.internal.view.timeline.suggest;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import defpackage.e7v0;
import defpackage.j9b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.o4v0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.suggest.ButtonsViewHolder$updateViews$views$1$1$1$1", f = "ButtonsViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ButtonsViewHolder$updateViews$views$1$1$1$1 extends SuspendLambda implements tls {
    final /* synthetic */ o4v0 $button;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonsViewHolder$updateViews$views$1$1$1$1(c cVar, o4v0 o4v0Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$button = o4v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ButtonsViewHolder$updateViews$views$1$1$1$1(this.this$0, this.$button, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ButtonsViewHolder$updateViews$views$1$1$1$1 buttonsViewHolder$updateViews$views$1$1$1$1 = (ButtonsViewHolder$updateViews$views$1$1$1$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        buttonsViewHolder$updateViews$views$1$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        o1b0 h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        Integer num = cVar.P0;
        if (num != null) {
            o4v0 o4v0Var = this.$button;
            int intValue = num.intValue();
            e7v0 e7v0Var = cVar.J0;
            if (e7v0Var != null) {
                int i = o4v0Var.a;
                com.yandex.messaging.internal.authorized.chat.b bVar = e7v0Var.c;
                ChatRequest chatRequest = e7v0Var.a;
                j9b c = bVar.c(chatRequest);
                if (c != null && (h = c.h()) != null) {
                    String str = h.b;
                    Pair pair = new Pair("chat id", chatRequest.uniqueRequestId());
                    String str2 = "thread";
                    if (!ChatId.Companion.f(str)) {
                        if (h.e) {
                            str2 = "saved messages";
                        } else if (h.f) {
                            str2 = "bot";
                        } else if (h.d) {
                            str2 = "personal";
                        } else if (!ChatId.Companion.f(str)) {
                            str2 = ChatNamespaces.b(str) ? "channel" : "group";
                        }
                    }
                    Pair pair2 = new Pair("chat type", str2);
                    String str3 = h.c;
                    if (str3 == null) {
                        str3 = "null";
                    }
                    e7v0Var.b.reportEvent("suggest btn click", kotlin.collections.b.h(pair, pair2, new Pair("addressee id", str3), new Pair("n", Integer.valueOf(intValue)), new Pair("button position", Integer.valueOf(i))));
                }
            }
        }
        this.this$0.e0().f.A(this.$button);
        return zy11.a;
    }
}
