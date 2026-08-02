package com.yandex.messaging.internal.storage.folders;

import defpackage.cwr;
import defpackage.gwr;
import defpackage.hwr;
import defpackage.k020;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lhwr;", "<anonymous>", "(Ltse;)Lhwr;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.storage.folders.FoldersRepository$loadFolderChatData$2$folderDeferred$1", f = "FoldersRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FoldersRepository$loadFolderChatData$2$folderDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $folderId;
    final /* synthetic */ long $organizationId;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoldersRepository$loadFolderChatData$2$folderDeferred$1(d dVar, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$folderId = str;
        this.$organizationId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FoldersRepository$loadFolderChatData$2$folderDeferred$1(this.this$0, this.$folderId, this.$organizationId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FoldersRepository$loadFolderChatData$2$folderDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        String str = this.$folderId;
        long j = this.$organizationId;
        gwr l = k020Var.b.l();
        return (hwr) androidx.room.util.a.b(l.a, true, false, new cwr(str, j, l));
    }
}
