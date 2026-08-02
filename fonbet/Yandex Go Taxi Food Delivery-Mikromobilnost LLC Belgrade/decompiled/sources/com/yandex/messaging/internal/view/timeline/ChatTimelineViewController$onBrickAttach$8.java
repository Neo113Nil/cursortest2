package com.yandex.messaging.internal.view.timeline;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.h9z0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lzy11;", "<anonymous>", "(Ljava/util/Set;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.ChatTimelineViewController$onBrickAttach$8", f = "ChatTimelineViewController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatTimelineViewController$onBrickAttach$8 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTimelineViewController$onBrickAttach$8(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatTimelineViewController$onBrickAttach$8 chatTimelineViewController$onBrickAttach$8 = new ChatTimelineViewController$onBrickAttach$8(this.this$0, continuation);
        chatTimelineViewController$onBrickAttach$8.L$0 = obj;
        return chatTimelineViewController$onBrickAttach$8;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChatTimelineViewController$onBrickAttach$8 chatTimelineViewController$onBrickAttach$8 = (ChatTimelineViewController$onBrickAttach$8) create((Set) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chatTimelineViewController$onBrickAttach$8.invokeSuspend(zy11Var);
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
        Set set = (Set) this.L$0;
        h9z0 h9z0Var = this.this$0.B.z;
        h9z0Var.p = set;
        RecyclerView recyclerView = h9z0Var.b.a;
        if (recyclerView != null) {
            recyclerView.invalidate();
        }
        return zy11.a;
    }
}
