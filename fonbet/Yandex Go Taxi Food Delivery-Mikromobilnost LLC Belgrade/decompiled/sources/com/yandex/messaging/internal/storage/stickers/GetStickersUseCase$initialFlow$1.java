package com.yandex.messaging.internal.storage.stickers;

import defpackage.g6u;
import defpackage.h3t0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.odu0;
import defpackage.scs0;
import defpackage.tje;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xen;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lvcu0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.storage.stickers.GetStickersUseCase$initialFlow$1", f = "GetStickersUseCase.kt", l = {42, 42, 49, 49}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetStickersUseCase$initialFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lvcu0;", "<anonymous>", "(Ltse;)Lvcu0;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.internal.storage.stickers.GetStickersUseCase$initialFlow$1$1", f = "GetStickersUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.internal.storage.stickers.GetStickersUseCase$initialFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Ref$ObjectRef<h3t0> $snapshot;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$snapshot = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation, this.$snapshot);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            odu0 odu0Var = this.this$0.a;
            return odu0Var.a.o0(new scs0(21, new xen(17, this.$snapshot), odu0Var));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lvcu0;", "<anonymous>", "(Ltse;)Lvcu0;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.internal.storage.stickers.GetStickersUseCase$initialFlow$1$2", f = "GetStickersUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.internal.storage.stickers.GetStickersUseCase$initialFlow$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ Ref$ObjectRef<h3t0> $snapshot;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b bVar, Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
            super(2, continuation);
            this.$snapshot = ref$ObjectRef;
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation, this.$snapshot);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            if (this.$snapshot.element.a()) {
                return this.this$0.a.c();
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetStickersUseCase$initialFlow$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetStickersUseCase$initialFlow$1 getStickersUseCase$initialFlow$1 = new GetStickersUseCase$initialFlow$1(this.this$0, continuation);
        getStickersUseCase$initialFlow$1.L$0 = obj;
        return getStickersUseCase$initialFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetStickersUseCase$initialFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        if (r11 != r0) goto L25;
     */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, g3t0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        Ref$ObjectRef ref$ObjectRef;
        vpr vprVar2;
        vpr vprVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = h3t0.a;
            b bVar = this.this$0;
            g6u g6uVar = bVar.b.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bVar, null, ref$ObjectRef2);
            this.L$0 = vprVar;
            this.L$1 = ref$ObjectRef2;
            this.L$2 = vprVar;
            this.label = 1;
            Object k0 = tje.k0(g6uVar, anonymousClass1, this);
            if (k0 != coroutineSingletons) {
                ref$ObjectRef = ref$ObjectRef2;
                obj = k0;
                vprVar2 = vprVar;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            vprVar = (vpr) this.L$2;
            ref$ObjectRef = (Ref$ObjectRef) this.L$1;
            vprVar2 = (vpr) this.L$0;
            kotlin.b.b(obj);
        } else if (i == 2) {
            Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
            vpr vprVar4 = (vpr) this.L$0;
            kotlin.b.b(obj);
            ref$ObjectRef = ref$ObjectRef3;
            vprVar3 = vprVar4;
            b bVar2 = this.this$0;
            g6u g6uVar2 = bVar2.b.e;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(bVar2, null, ref$ObjectRef);
            this.L$0 = vprVar3;
            this.L$1 = null;
            this.label = 3;
            obj = tje.k0(g6uVar2, anonymousClass2, this);
        } else {
            if (i != 3) {
                if (i == 4) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar3 = (vpr) this.L$0;
            kotlin.b.b(obj);
            this.L$0 = null;
            this.label = 4;
        }
        this.L$0 = vprVar2;
        this.L$1 = ref$ObjectRef;
        this.L$2 = null;
        this.label = 2;
        if (vprVar.emit(obj, this) != coroutineSingletons) {
            vprVar3 = vprVar2;
            b bVar22 = this.this$0;
            g6u g6uVar22 = bVar22.b.e;
            AnonymousClass2 anonymousClass22 = new AnonymousClass2(bVar22, null, ref$ObjectRef);
            this.L$0 = vprVar3;
            this.L$1 = null;
            this.label = 3;
            obj = tje.k0(g6uVar22, anonymousClass22, this);
        }
        return coroutineSingletons;
    }
}
