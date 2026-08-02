package com.yandex.messaging.internal.storage.folders;

import defpackage.eci0;
import defpackage.ixr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qi1;
import defpackage.vpr;
import defpackage.wls;
import defpackage.x400;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lx400;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.storage.folders.FoldersRepository$getMainChatData$1", f = "FoldersRepository.kt", l = {82, 83}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FoldersRepository$getMainChatData$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $organizationId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqi1;", "it", "Lx400;", "<anonymous>", "(Lqi1;)Lx400;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.internal.storage.folders.FoldersRepository$getMainChatData$1$2", f = "FoldersRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.internal.storage.folders.FoldersRepository$getMainChatData$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ long $organizationId;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(d dVar, long j, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$organizationId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$organizationId, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((qi1) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoldersRepository$getMainChatData$1(d dVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$organizationId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FoldersRepository$getMainChatData$1 foldersRepository$getMainChatData$1 = new FoldersRepository$getMainChatData$1(this.this$0, this.$organizationId, continuation);
        foldersRepository$getMainChatData$1.L$0 = obj;
        return foldersRepository$getMainChatData$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FoldersRepository$getMainChatData$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r10, r1, r9) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r1.emit(r10, r9) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            x400 w = this.this$0.a.w(this.$organizationId);
            this.L$0 = vprVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$0;
            kotlin.b.b(obj);
        }
        d dVar = this.this$0;
        eci0 eci0Var = dVar.c.v;
        long j = this.$organizationId;
        g I = e.I(new ixr(eci0Var, j, i2), new AnonymousClass2(dVar, j, null));
        this.L$0 = null;
        this.label = 2;
    }
}
