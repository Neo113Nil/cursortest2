package com.yandex.messaging.internal.storage.folders;

import defpackage.bwr;
import defpackage.gwr;
import defpackage.k020;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lhwr;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.storage.folders.FoldersRepository$loadFoldersData$2$customFoldersDeferred$1", f = "FoldersRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FoldersRepository$loadFoldersData$2$customFoldersDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $organizationId;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoldersRepository$loadFoldersData$2$customFoldersDeferred$1(d dVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$organizationId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FoldersRepository$loadFoldersData$2$customFoldersDeferred$1(this.this$0, this.$organizationId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FoldersRepository$loadFoldersData$2$customFoldersDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        k020 k020Var = this.this$0.a;
        long j = this.$organizationId;
        gwr l = k020Var.b.l();
        return (List) androidx.room.util.a.b(l.a, true, false, new bwr(j, l, 0));
    }
}
