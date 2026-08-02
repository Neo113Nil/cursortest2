package com.yandex.messaging.internal.view.chat;

import android.view.View;
import android.widget.TextView;
import com.yandex.messaging.core.net.entities.Metadata;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/messaging/core/net/entities/Metadata;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/messaging/core/net/entities/Metadata;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.chat.ChatMetadataBrick$onBrickAttach$1", f = "ChatMetadataBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatMetadataBrick$onBrickAttach$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMetadataBrick$onBrickAttach$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatMetadataBrick$onBrickAttach$1 chatMetadataBrick$onBrickAttach$1 = new ChatMetadataBrick$onBrickAttach$1(this.this$0, continuation);
        chatMetadataBrick$onBrickAttach$1.L$0 = obj;
        return chatMetadataBrick$onBrickAttach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChatMetadataBrick$onBrickAttach$1 chatMetadataBrick$onBrickAttach$1 = (ChatMetadataBrick$onBrickAttach$1) create((com.yandex.messaging.core.net.entities.Metadata) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chatMetadataBrick$onBrickAttach$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.messaging.core.net.entities.Metadata metadata = (com.yandex.messaging.core.net.entities.Metadata) this.L$0;
        b bVar = this.this$0;
        View view = bVar.B;
        TextView textView = bVar.E;
        TextView textView2 = bVar.D;
        Metadata.Chatbar chatbar = metadata != null ? metadata.chatbar : null;
        Metadata.Text text = chatbar != null ? chatbar.title : null;
        Metadata.Text text2 = chatbar != null ? chatbar.subtitle : null;
        if (text == null) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            try {
                bVar.s(textView2, text);
                bVar.s(textView, text2);
                if (textView2.getVisibility() != 8 && textView.getVisibility() != 8) {
                    textView2.setMaxLines(1);
                    textView.setMaxLines(1);
                    bVar.r(chatbar.img);
                    bVar.q(chatbar.button);
                }
                textView2.setMaxLines(2);
                textView.setMaxLines(2);
                bVar.r(chatbar.img);
                bVar.q(chatbar.button);
            } catch (RuntimeException e) {
                view.setVisibility(8);
                bVar.x.reportError("Chat metadata is invalid", e);
            }
        }
        return zy11.a;
    }
}
