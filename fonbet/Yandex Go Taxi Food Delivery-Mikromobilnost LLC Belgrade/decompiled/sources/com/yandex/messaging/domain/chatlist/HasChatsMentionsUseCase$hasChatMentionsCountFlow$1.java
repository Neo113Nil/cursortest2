package com.yandex.messaging.domain.chatlist;

import com.yandex.messaging.internal.storage.h;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.fi9;
import defpackage.g6u;
import defpackage.h3t0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.chatlist.HasChatsMentionsUseCase$hasChatMentionsCountFlow$1", f = "HasChatsMentionsUseCase.kt", l = {56, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 66}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class HasChatsMentionsUseCase$hasChatMentionsCountFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ Long $orgId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)I"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.domain.chatlist.HasChatsMentionsUseCase$hasChatMentionsCountFlow$1$1", f = "HasChatsMentionsUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.domain.chatlist.HasChatsMentionsUseCase$hasChatMentionsCountFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Long $orgId;
        final /* synthetic */ Ref$ObjectRef<h3t0> $snapshot;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, Long l, Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$snapshot = ref$ObjectRef;
            this.$orgId = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$orgId, continuation, this.$snapshot);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, h3t0] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            if (!this.this$0.d.T()) {
                return null;
            }
            this.$snapshot.element = this.this$0.d.takeSnapshot();
            return new Integer(c.d(this.this$0, this.$orgId));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.domain.chatlist.HasChatsMentionsUseCase$hasChatMentionsCountFlow$1$2", f = "HasChatsMentionsUseCase.kt", l = {69, 71}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.domain.chatlist.HasChatsMentionsUseCase$hasChatMentionsCountFlow$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ Long $orgId;
        final /* synthetic */ Ref$ObjectRef<h3t0> $snapshot;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c cVar, Long l, Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
            super(2, continuation);
            this.$snapshot = ref$ObjectRef;
            this.this$0 = cVar;
            this.$orgId = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$orgId, continuation, this.$snapshot);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        
            if (r1.emit(r6, r7) == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            vpr vprVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i == 0) {
                kotlin.b.b(obj);
                vprVar = (vpr) this.L$0;
                if (this.$snapshot.element.a()) {
                    Integer num = new Integer(c.d(this.this$0, this.$orgId));
                    this.L$0 = vprVar;
                    this.label = 1;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vprVar = (vpr) this.L$0;
                kotlin.b.b(obj);
            }
            fi9 a = h.a(this.this$0.e);
            c cVar = this.this$0;
            Long l = this.$orgId;
            this.L$0 = null;
            this.label = 2;
            e.w(vprVar);
            Object collect = a.collect(new b(vprVar, cVar, l), this);
            if (collect != coroutineSingletons) {
                collect = zy11Var;
            }
            if (collect != coroutineSingletons) {
                collect = zy11Var;
            }
            return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HasChatsMentionsUseCase$hasChatMentionsCountFlow$1(c cVar, Long l, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$orgId = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HasChatsMentionsUseCase$hasChatMentionsCountFlow$1 hasChatsMentionsUseCase$hasChatMentionsCountFlow$1 = new HasChatsMentionsUseCase$hasChatMentionsCountFlow$1(this.this$0, this.$orgId, continuation);
        hasChatsMentionsUseCase$hasChatMentionsCountFlow$1.L$0 = obj;
        return hasChatsMentionsUseCase$hasChatMentionsCountFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HasChatsMentionsUseCase$hasChatMentionsCountFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x009b, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r11, r3, r10) != r0) goto L23;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, g3t0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        Ref$ObjectRef ref$ObjectRef;
        vpr vprVar2;
        Ref$ObjectRef ref$ObjectRef2;
        vpr vprVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
            ref$ObjectRef3.element = h3t0.a;
            c cVar = this.this$0;
            g6u g6uVar = cVar.c.g;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar, this.$orgId, null, ref$ObjectRef3);
            this.L$0 = vprVar;
            this.L$1 = ref$ObjectRef3;
            this.L$2 = vprVar;
            this.label = 1;
            Object k0 = tje.k0(g6uVar, anonymousClass1, this);
            if (k0 != coroutineSingletons) {
                ref$ObjectRef = ref$ObjectRef3;
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
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
            vprVar3 = (vpr) this.L$0;
            kotlin.b.b(obj);
            tpr F = e.F(new rol0(new AnonymousClass2(this.this$0, this.$orgId, null, ref$ObjectRef2)), this.this$0.c.e);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        this.L$0 = vprVar2;
        this.L$1 = ref$ObjectRef;
        this.L$2 = null;
        this.label = 2;
        if (vprVar.emit(obj, this) != coroutineSingletons) {
            ref$ObjectRef2 = ref$ObjectRef;
            vprVar3 = vprVar2;
            tpr F2 = e.F(new rol0(new AnonymousClass2(this.this$0, this.$orgId, null, ref$ObjectRef2)), this.this$0.c.e);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        return coroutineSingletons;
    }
}
