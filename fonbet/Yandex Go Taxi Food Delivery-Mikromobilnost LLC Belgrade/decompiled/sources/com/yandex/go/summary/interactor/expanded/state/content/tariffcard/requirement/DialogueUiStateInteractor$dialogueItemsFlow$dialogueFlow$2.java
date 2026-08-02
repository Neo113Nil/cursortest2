package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tfj;
import defpackage.ufj;
import defpackage.xfj;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxfj;", "previous", "current", "<anonymous>", "(Lxfj;Lxfj;)Lxfj;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.DialogueUiStateInteractor$dialogueItemsFlow$dialogueFlow$2", f = "DialogueUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DialogueUiStateInteractor$dialogueItemsFlow$dialogueFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DialogueUiStateInteractor$dialogueItemsFlow$dialogueFlow$2 dialogueUiStateInteractor$dialogueItemsFlow$dialogueFlow$2 = new DialogueUiStateInteractor$dialogueItemsFlow$dialogueFlow$2(3, (Continuation) obj3);
        dialogueUiStateInteractor$dialogueItemsFlow$dialogueFlow$2.L$0 = (xfj) obj;
        dialogueUiStateInteractor$dialogueItemsFlow$dialogueFlow$2.L$1 = (xfj) obj2;
        return dialogueUiStateInteractor$dialogueItemsFlow$dialogueFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xfj xfjVar = (xfj) this.L$0;
        xfj xfjVar2 = (xfj) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return ((xfjVar2 instanceof tfj) && (xfjVar instanceof ufj)) ? xfjVar : xfjVar2;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
