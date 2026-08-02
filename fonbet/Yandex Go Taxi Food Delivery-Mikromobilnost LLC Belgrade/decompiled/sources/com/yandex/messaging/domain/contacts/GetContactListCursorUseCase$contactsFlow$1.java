package com.yandex.messaging.domain.contacts;

import com.yandex.messaging.internal.storage.h;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.fi9;
import defpackage.h3t0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o4b;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lo4b;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.contacts.GetContactListCursorUseCase$contactsFlow$1", f = "GetContactListCursorUseCase.kt", l = {54, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetContactListCursorUseCase$contactsFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ Long $orgId;
    final /* synthetic */ String $query;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lo4b;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.domain.contacts.GetContactListCursorUseCase$contactsFlow$1$1", f = "GetContactListCursorUseCase.kt", l = {59, 61}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.domain.contacts.GetContactListCursorUseCase$contactsFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Long $orgId;
        final /* synthetic */ String $query;
        final /* synthetic */ Ref$ObjectRef<h3t0> $snapshotPoint;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$ObjectRef ref$ObjectRef, c cVar, Long l, String str, Continuation continuation) {
            super(2, continuation);
            this.$snapshotPoint = ref$ObjectRef;
            this.this$0 = cVar;
            this.$orgId = l;
            this.$query = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$snapshotPoint, this.this$0, this.$orgId, this.$query, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
        
            if (r1.emit(r9, r8) == r0) goto L24;
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
                if (this.$snapshotPoint.element.a()) {
                    o4b d = c.d(this.this$0, this.$orgId, this.$query);
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
            fi9 e = h.e(this.this$0.d);
            c cVar = this.this$0;
            Long l = this.$orgId;
            String str = this.$query;
            this.L$0 = null;
            this.label = 2;
            e.w(vprVar);
            Object collect = e.collect(new b(vprVar, cVar, l, str), this);
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
    public GetContactListCursorUseCase$contactsFlow$1(c cVar, String str, Long l, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$query = str;
        this.$orgId = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetContactListCursorUseCase$contactsFlow$1 getContactListCursorUseCase$contactsFlow$1 = new GetContactListCursorUseCase$contactsFlow$1(this.this$0, this.$query, this.$orgId, continuation);
        getContactListCursorUseCase$contactsFlow$1.L$0 = obj;
        return getContactListCursorUseCase$contactsFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetContactListCursorUseCase$contactsFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008f, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r1, r11, r10) != r0) goto L22;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, g3t0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, h3t0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        Ref$ObjectRef ref$ObjectRef;
        vpr vprVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = h3t0.a;
            if (this.this$0.c.b.T() && this.$query == null) {
                ref$ObjectRef.element = this.this$0.c.b.takeSnapshot();
                o4b d = c.d(this.this$0, this.$orgId, this.$query);
                this.L$0 = vprVar;
                this.L$1 = ref$ObjectRef;
                this.label = 1;
                if (vprVar.emit(d, this) != coroutineSingletons) {
                    vprVar2 = vprVar;
                }
                return coroutineSingletons;
            }
            tpr F = e.F(new rol0(new AnonymousClass1(ref$ObjectRef, this.this$0, this.$orgId, this.$query, null)), this.this$0.e.e);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$1;
            vprVar2 = (vpr) this.L$0;
            kotlin.b.b(obj);
        }
        vprVar = vprVar2;
        tpr F2 = e.F(new rol0(new AnonymousClass1(ref$ObjectRef, this.this$0, this.$orgId, this.$query, null)), this.this$0.e.e);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
