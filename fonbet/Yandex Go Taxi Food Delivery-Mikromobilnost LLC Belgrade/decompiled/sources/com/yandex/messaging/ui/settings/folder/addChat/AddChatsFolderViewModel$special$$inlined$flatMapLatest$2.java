package com.yandex.messaging.ui.settings.folder.addChat;

import defpackage.j7t;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.folder.addChat.AddChatsFolderViewModel$special$$inlined$flatMapLatest$2", f = "AddChatsFolderViewModel.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class AddChatsFolderViewModel$special$$inlined$flatMapLatest$2 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddChatsFolderViewModel$special$$inlined$flatMapLatest$2(i iVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = iVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AddChatsFolderViewModel$special$$inlined$flatMapLatest$2 addChatsFolderViewModel$special$$inlined$flatMapLatest$2 = new AddChatsFolderViewModel$special$$inlined$flatMapLatest$2(this.this$0, (Continuation) obj3);
        addChatsFolderViewModel$special$$inlined$flatMapLatest$2.L$0 = (vpr) obj;
        addChatsFolderViewModel$special$$inlined$flatMapLatest$2.L$1 = obj2;
        return addChatsFolderViewModel$special$$inlined$flatMapLatest$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            String str = (String) this.L$1;
            i iVar = this.this$0;
            tpr a = iVar.x.a(new j7t(str, iVar.w.b));
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(a, vprVar, this) == coroutineSingletons) {
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
