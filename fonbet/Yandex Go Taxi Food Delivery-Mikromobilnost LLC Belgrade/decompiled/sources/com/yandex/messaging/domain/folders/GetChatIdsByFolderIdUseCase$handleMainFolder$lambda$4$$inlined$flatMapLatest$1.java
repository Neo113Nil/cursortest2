package com.yandex.messaging.domain.folders;

import defpackage.g92;
import defpackage.ixr;
import defpackage.m4t;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o4t;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.x400;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.folders.GetChatIdsByFolderIdUseCase$handleMainFolder$lambda$4$$inlined$flatMapLatest$1", f = "GetChatIdsByFolderIdUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetChatIdsByFolderIdUseCase$handleMainFolder$lambda$4$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ long $organizationId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ o4t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatIdsByFolderIdUseCase$handleMainFolder$lambda$4$$inlined$flatMapLatest$1(Continuation continuation, long j, o4t o4tVar) {
        super(3, continuation);
        this.$organizationId$inlined = j;
        this.this$0 = o4tVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetChatIdsByFolderIdUseCase$handleMainFolder$lambda$4$$inlined$flatMapLatest$1 getChatIdsByFolderIdUseCase$handleMainFolder$lambda$4$$inlined$flatMapLatest$1 = new GetChatIdsByFolderIdUseCase$handleMainFolder$lambda$4$$inlined$flatMapLatest$1((Continuation) obj3, this.$organizationId$inlined, this.this$0);
        getChatIdsByFolderIdUseCase$handleMainFolder$lambda$4$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getChatIdsByFolderIdUseCase$handleMainFolder$lambda$4$$inlined$flatMapLatest$1.L$1 = obj2;
        return getChatIdsByFolderIdUseCase$handleMainFolder$lambda$4$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr ixrVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            x400 x400Var = (x400) this.L$1;
            Set set = x400Var != null ? x400Var.b : null;
            if (set == null) {
                set = EmptySet.a;
            }
            if (set.isEmpty()) {
                ixrVar = new g92(2, new m4t());
            } else {
                Set set2 = set;
                ArrayList arrayList = new ArrayList(tcc.n(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.this$0.b.a(this.$organizationId$inlined, (String) it.next()));
                }
                ixrVar = new ixr((tpr[]) kotlin.collections.a.J0(arrayList).toArray(new tpr[0]), this.$organizationId$inlined, 3);
            }
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(ixrVar, vprVar, this) == coroutineSingletons) {
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
