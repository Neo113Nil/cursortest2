package com.yandex.messaging.internal.storage.folders;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lx400;", "<anonymous>", "(Ltse;)Lx400;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.storage.folders.FoldersRepository$loadFoldersData$2$mainFolderDeferred$1", f = "FoldersRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FoldersRepository$loadFoldersData$2$mainFolderDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $organizationId;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoldersRepository$loadFoldersData$2$mainFolderDeferred$1(d dVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$organizationId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FoldersRepository$loadFoldersData$2$mainFolderDeferred$1(this.this$0, this.$organizationId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FoldersRepository$loadFoldersData$2$mainFolderDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.this$0.a.w(this.$organizationId);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
