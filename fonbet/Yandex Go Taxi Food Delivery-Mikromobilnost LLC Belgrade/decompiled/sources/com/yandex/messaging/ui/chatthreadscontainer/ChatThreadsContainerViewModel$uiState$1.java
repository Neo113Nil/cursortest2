package com.yandex.messaging.ui.chatthreadscontainer;

import defpackage.cab;
import defpackage.eab;
import defpackage.ems;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.y400;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/yandex/messaging/ui/chatthreadscontainer/ChatThreadsContainerTabs;", "tab", "", "isVisible", "Leab;", "chatsTabItem", "threadsTabItem", "Ly400;", "currentFolder", "Lcab;", "<anonymous>", "(Lcom/yandex/messaging/ui/chatthreadscontainer/ChatThreadsContainerTabs;ZLeab;Leab;Ly400;)Lcab;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerViewModel$uiState$1", f = "ChatThreadsContainerViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatThreadsContainerViewModel$uiState$1 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ boolean Z$0;
    int label;

    public ChatThreadsContainerViewModel$uiState$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ChatThreadsContainerViewModel$uiState$1 chatThreadsContainerViewModel$uiState$1 = new ChatThreadsContainerViewModel$uiState$1((Continuation) obj6);
        chatThreadsContainerViewModel$uiState$1.L$0 = (ChatThreadsContainerTabs) obj;
        chatThreadsContainerViewModel$uiState$1.Z$0 = booleanValue;
        chatThreadsContainerViewModel$uiState$1.L$1 = (eab) obj3;
        chatThreadsContainerViewModel$uiState$1.L$2 = (eab) obj4;
        chatThreadsContainerViewModel$uiState$1.L$3 = (y400) obj5;
        return chatThreadsContainerViewModel$uiState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return new cab((ChatThreadsContainerTabs) this.L$0, scc.g((eab) this.L$1, (eab) this.L$2), this.Z$0, !(((y400) this.L$3) instanceof y400));
    }
}
