package com.yandex.messaging.domain.folders;

import defpackage.evu0;
import defpackage.g92;
import defpackage.l7t;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.folders.GetFolderAllChatsUseCase$readChats$$inlined$flatMapLatest$1", f = "GetFolderAllChatsUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetFolderAllChatsUseCase$readChats$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ Set $includedChatIds$inlined;
    final /* synthetic */ String $query$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ l7t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFolderAllChatsUseCase$readChats$$inlined$flatMapLatest$1(Continuation continuation, String str, Set set, l7t l7tVar) {
        super(3, continuation);
        this.$query$inlined = str;
        this.$includedChatIds$inlined = set;
        this.this$0 = l7tVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetFolderAllChatsUseCase$readChats$$inlined$flatMapLatest$1 getFolderAllChatsUseCase$readChats$$inlined$flatMapLatest$1 = new GetFolderAllChatsUseCase$readChats$$inlined$flatMapLatest$1((Continuation) obj3, this.$query$inlined, this.$includedChatIds$inlined, this.this$0);
        getFolderAllChatsUseCase$readChats$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getFolderAllChatsUseCase$readChats$$inlined$flatMapLatest$1.L$1 = obj2;
        return getFolderAllChatsUseCase$readChats$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            List list = (List) this.L$1;
            if (evu0.J(this.$query$inlined)) {
                list = kotlin.collections.a.I(kotlin.collections.a.m0(this.$includedChatIds$inlined, list));
            }
            tpr a = !list.isEmpty() ? this.this$0.f.a(kotlin.collections.a.N0(list)) : new g92(2, EmptyList.a);
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
