package com.yandex.messaging.internal.storage.folders;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bvf0;
import defpackage.eci0;
import defpackage.h3t0;
import defpackage.ixr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qi1;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lgxr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.storage.folders.FoldersRepository$getFoldersByOrganizationId$1", f = "FoldersRepository.kt", l = {66, 66, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FoldersRepository$getFoldersByOrganizationId$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $organizationId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lgxr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.internal.storage.folders.FoldersRepository$getFoldersByOrganizationId$1$1", f = "FoldersRepository.kt", l = {70, 70, 71}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.internal.storage.folders.FoldersRepository$getFoldersByOrganizationId$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ long $organizationId;
        final /* synthetic */ Ref$ObjectRef<h3t0> $snapshotPoint;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ d this$0;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqi1;", "it", "Lgxr;", "<anonymous>", "(Lqi1;)Lgxr;"}, k = 3, mv = {2, 1, 0})
        @mvg(c = "com.yandex.messaging.internal.storage.folders.FoldersRepository$getFoldersByOrganizationId$1$1$2", f = "FoldersRepository.kt", l = {74}, m = "invokeSuspend")
        /* renamed from: com.yandex.messaging.internal.storage.folders.FoldersRepository$getFoldersByOrganizationId$1$1$2, reason: invalid class name */
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
                long j = this.$organizationId;
                this.label = 1;
                dVar.getClass();
                Object n = bvf0.n(new FoldersRepository$loadFoldersData$2(dVar, j, null), this);
                return n == coroutineSingletons ? coroutineSingletons : n;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$ObjectRef ref$ObjectRef, d dVar, long j, Continuation continuation) {
            super(2, continuation);
            this.$snapshotPoint = ref$ObjectRef;
            this.this$0 = dVar;
            this.$organizationId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$snapshotPoint, this.this$0, this.$organizationId, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
        
            if (kotlinx.coroutines.flow.e.u(r10, r1, r9) == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            vpr vprVar;
            vpr vprVar2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                vprVar = (vpr) this.L$0;
                if (this.$snapshotPoint.element.a()) {
                    d dVar = this.this$0;
                    long j = this.$organizationId;
                    this.L$0 = vprVar;
                    this.L$1 = vprVar;
                    this.label = 1;
                    dVar.getClass();
                    obj = bvf0.n(new FoldersRepository$loadFoldersData$2(dVar, j, null), this);
                    if (obj != coroutineSingletons) {
                        vprVar2 = vprVar;
                        this.L$0 = vprVar2;
                        this.L$1 = null;
                        this.label = 2;
                        if (vprVar.emit(obj, this) != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                d dVar2 = this.this$0;
                eci0 eci0Var = dVar2.c.v;
                long j2 = this.$organizationId;
                g I = e.I(new ixr(eci0Var, j2, 0), new AnonymousClass2(dVar2, j2, null));
                this.L$0 = null;
                this.label = 3;
            } else {
                if (i == 1) {
                    vprVar = (vpr) this.L$1;
                    vprVar2 = (vpr) this.L$0;
                    kotlin.b.b(obj);
                    this.L$0 = vprVar2;
                    this.L$1 = null;
                    this.label = 2;
                    if (vprVar.emit(obj, this) != coroutineSingletons) {
                        vprVar = vprVar2;
                        d dVar22 = this.this$0;
                        eci0 eci0Var2 = dVar22.c.v;
                        long j22 = this.$organizationId;
                        g I2 = e.I(new ixr(eci0Var2, j22, 0), new AnonymousClass2(dVar22, j22, null));
                        this.L$0 = null;
                        this.label = 3;
                    }
                    return coroutineSingletons;
                }
                if (i == 2) {
                    vprVar = (vpr) this.L$0;
                    kotlin.b.b(obj);
                    d dVar222 = this.this$0;
                    eci0 eci0Var22 = dVar222.c.v;
                    long j222 = this.$organizationId;
                    g I22 = e.I(new ixr(eci0Var22, j222, 0), new AnonymousClass2(dVar222, j222, null));
                    this.L$0 = null;
                    this.label = 3;
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoldersRepository$getFoldersByOrganizationId$1(d dVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$organizationId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FoldersRepository$getFoldersByOrganizationId$1 foldersRepository$getFoldersByOrganizationId$1 = new FoldersRepository$getFoldersByOrganizationId$1(this.this$0, this.$organizationId, continuation);
        foldersRepository$getFoldersByOrganizationId$1.L$0 = obj;
        return foldersRepository$getFoldersByOrganizationId$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FoldersRepository$getFoldersByOrganizationId$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b8, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r13, r1, r12) == r0) goto L26;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, g3t0] */
    /* JADX WARN: Type inference failed for: r6v8, types: [T, h3t0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        vpr vprVar2;
        Ref$ObjectRef ref$ObjectRef3;
        vpr vprVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
            ref$ObjectRef4.element = h3t0.a;
            if (this.this$0.a.b.T()) {
                ref$ObjectRef4.element = this.this$0.a.b.takeSnapshot();
                d dVar = this.this$0;
                long j = this.$organizationId;
                this.L$0 = vprVar;
                this.L$1 = ref$ObjectRef4;
                this.L$2 = vprVar;
                this.label = 1;
                dVar.getClass();
                Object n = bvf0.n(new FoldersRepository$loadFoldersData$2(dVar, j, null), this);
                if (n != coroutineSingletons) {
                    ref$ObjectRef2 = ref$ObjectRef4;
                    obj = n;
                    vprVar2 = vprVar;
                }
                return coroutineSingletons;
            }
            ref$ObjectRef = ref$ObjectRef4;
            tpr F = e.F(new rol0(new AnonymousClass1(ref$ObjectRef, this.this$0, this.$organizationId, null)), this.this$0.d.e);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        } else if (i == 1) {
            vprVar = (vpr) this.L$2;
            ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
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
            ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
            vprVar3 = (vpr) this.L$0;
            kotlin.b.b(obj);
            ref$ObjectRef = ref$ObjectRef3;
            vprVar = vprVar3;
            tpr F2 = e.F(new rol0(new AnonymousClass1(ref$ObjectRef, this.this$0, this.$organizationId, null)), this.this$0.d.e);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        this.L$0 = vprVar2;
        this.L$1 = ref$ObjectRef2;
        this.L$2 = null;
        this.label = 2;
        if (vprVar.emit(obj, this) != coroutineSingletons) {
            ref$ObjectRef3 = ref$ObjectRef2;
            vprVar3 = vprVar2;
            ref$ObjectRef = ref$ObjectRef3;
            vprVar = vprVar3;
            tpr F22 = e.F(new rol0(new AnonymousClass1(ref$ObjectRef, this.this$0, this.$organizationId, null)), this.this$0.d.e);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        return coroutineSingletons;
    }
}
