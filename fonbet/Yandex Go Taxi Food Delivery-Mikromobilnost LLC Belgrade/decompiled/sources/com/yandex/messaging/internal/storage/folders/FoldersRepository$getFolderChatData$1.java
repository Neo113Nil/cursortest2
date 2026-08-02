package com.yandex.messaging.internal.storage.folders;

import defpackage.bvf0;
import defpackage.eci0;
import defpackage.hxr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qi1;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lxvr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.storage.folders.FoldersRepository$getFolderChatData$1", f = "FoldersRepository.kt", l = {91, 91, HProv.PP_HASHOID}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FoldersRepository$getFolderChatData$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $folderId;
    final /* synthetic */ long $organizationId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqi1;", "it", "Lxvr;", "<anonymous>", "(Lqi1;)Lxvr;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.internal.storage.folders.FoldersRepository$getFolderChatData$1$2", f = "FoldersRepository.kt", l = {HProv.PP_DHOID}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.internal.storage.folders.FoldersRepository$getFolderChatData$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ String $folderId;
        final /* synthetic */ long $organizationId;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(d dVar, String str, long j, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$folderId = str;
            this.$organizationId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$folderId, this.$organizationId, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((qi1) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            d dVar = this.this$0;
            String str = this.$folderId;
            long j = this.$organizationId;
            this.label = 1;
            dVar.getClass();
            Object n = bvf0.n(new FoldersRepository$loadFolderChatData$2(dVar, str, j, null), this);
            return n == coroutineSingletons ? coroutineSingletons : n;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoldersRepository$getFolderChatData$1(d dVar, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$folderId = str;
        this.$organizationId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FoldersRepository$getFolderChatData$1 foldersRepository$getFolderChatData$1 = new FoldersRepository$getFolderChatData$1(this.this$0, this.$folderId, this.$organizationId, continuation);
        foldersRepository$getFolderChatData$1.L$0 = obj;
        return foldersRepository$getFolderChatData$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FoldersRepository$getFolderChatData$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0087, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r13, r1, r12) != r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        vpr vprVar2;
        vpr vprVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            d dVar = this.this$0;
            String str = this.$folderId;
            long j = this.$organizationId;
            this.L$0 = vprVar;
            this.L$1 = vprVar;
            this.label = 1;
            dVar.getClass();
            obj = bvf0.n(new FoldersRepository$loadFolderChatData$2(dVar, str, j, null), this);
            if (obj != coroutineSingletons) {
                vprVar2 = vprVar;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            vprVar = (vpr) this.L$1;
            vprVar2 = (vpr) this.L$0;
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar3 = (vpr) this.L$0;
            kotlin.b.b(obj);
            d dVar2 = this.this$0;
            eci0 eci0Var = dVar2.c.v;
            String str2 = this.$folderId;
            long j2 = this.$organizationId;
            g I = e.I(new hxr(j2, str2, eci0Var, 0), new AnonymousClass2(dVar2, str2, j2, null));
            this.L$0 = null;
            this.label = 3;
        }
        this.L$0 = vprVar2;
        this.L$1 = null;
        this.label = 2;
        if (vprVar.emit(obj, this) != coroutineSingletons) {
            vprVar3 = vprVar2;
            d dVar22 = this.this$0;
            eci0 eci0Var2 = dVar22.c.v;
            String str22 = this.$folderId;
            long j22 = this.$organizationId;
            g I2 = e.I(new hxr(j22, str22, eci0Var2, 0), new AnonymousClass2(dVar22, str22, j22, null));
            this.L$0 = null;
            this.label = 3;
        }
        return coroutineSingletons;
    }
}
