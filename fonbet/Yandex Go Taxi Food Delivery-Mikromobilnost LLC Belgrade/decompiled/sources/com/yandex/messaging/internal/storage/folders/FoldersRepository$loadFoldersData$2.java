package com.yandex.messaging.internal.storage.folders;

import defpackage.gxr;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.x400;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lgxr;", "<anonymous>", "(Ltse;)Lgxr;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.storage.folders.FoldersRepository$loadFoldersData$2", f = "FoldersRepository.kt", l = {108, 109}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FoldersRepository$loadFoldersData$2 extends SuspendLambda implements wls {
    final /* synthetic */ long $organizationId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoldersRepository$loadFoldersData$2(d dVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$organizationId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FoldersRepository$loadFoldersData$2 foldersRepository$loadFoldersData$2 = new FoldersRepository$loadFoldersData$2(this.this$0, this.$organizationId, continuation);
        foldersRepository$loadFoldersData$2.L$0 = obj;
        return foldersRepository$loadFoldersData$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FoldersRepository$loadFoldersData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        x400 x400Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar = (tse) this.L$0;
            qoh h = tje.h(tseVar, null, null, new FoldersRepository$loadFoldersData$2$mainFolderDeferred$1(this.this$0, this.$organizationId, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new FoldersRepository$loadFoldersData$2$customFoldersDeferred$1(this.this$0, this.$organizationId, null), 3);
            this.L$0 = h2;
            this.label = 1;
            Object s = h.s(this);
            if (s != coroutineSingletons) {
                nohVar = h2;
                obj = s;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            x400Var = (x400) this.L$0;
            kotlin.b.b(obj);
            return new gxr(x400Var, (List) obj);
        }
        nohVar = (noh) this.L$0;
        kotlin.b.b(obj);
        x400 x400Var2 = (x400) obj;
        this.L$0 = x400Var2;
        this.label = 2;
        Object k = nohVar.k(this);
        if (k != coroutineSingletons) {
            obj = k;
            x400Var = x400Var2;
            return new gxr(x400Var, (List) obj);
        }
        return coroutineSingletons;
    }
}
