package com.yandex.go.call_order_fallback.domain;

import defpackage.b2t;
import defpackage.f2t;
import defpackage.g6u;
import defpackage.gtq0;
import defpackage.hxx;
import defpackage.jj7;
import defpackage.lj7;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pep0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.j0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.call_order_fallback.domain.CallOrderFallbackListener$onAttach$1", f = "CallOrderFallbackListener.kt", l = {26, 27}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CallOrderFallbackListener$onAttach$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llj7;", "payload", "Lzy11;", "<anonymous>", "(Llj7;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.call_order_fallback.domain.CallOrderFallbackListener$onAttach$1$1", f = "CallOrderFallbackListener.kt", l = {28}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.call_order_fallback.domain.CallOrderFallbackListener$onAttach$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.call_order_fallback.domain.CallOrderFallbackListener$onAttach$1$1$1", f = "CallOrderFallbackListener.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.call_order_fallback.domain.CallOrderFallbackListener$onAttach$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00421 extends SuspendLambda implements wls {
            final /* synthetic */ lj7 $payload;
            int label;
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00421(d dVar, lj7 lj7Var, Continuation continuation) {
                super(2, continuation);
                this.this$0 = dVar;
                this.$payload = lj7Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00421(this.this$0, this.$payload, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                C00421 c00421 = (C00421) create((tse) obj, (Continuation) obj2);
                zy11 zy11Var = zy11.a;
                c00421.invokeSuspend(zy11Var);
                return zy11Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (!gtq0.u((com.yandex.go.call_order_fallback.c) this.this$0.d.getValue())) {
                    d dVar = this.this$0;
                    ((pep0) dVar.c).f((com.yandex.go.call_order_fallback.c) dVar.d.getValue(), this.$payload, hxx.a);
                }
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((lj7) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            lj7 lj7Var = (lj7) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                this.this$0.a.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                C00421 c00421 = new C00421(this.this$0, lj7Var, null);
                this.L$0 = null;
                this.label = 1;
                if (tje.k0(g6uVar, c00421, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallOrderFallbackListener$onAttach$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CallOrderFallbackListener$onAttach$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CallOrderFallbackListener$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0085, code lost:
    
        if (kotlinx.coroutines.flow.e.k(r8, r1, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r8 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0.b;
            this.label = 1;
            obj = cVar.a.b(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            c cVar2 = this.this$0.b;
            mth mthVar = new mth(new b(kotlinx.coroutines.flow.e.X(new mth(new j0(new jj7(b2t.a, null, null), ((f2t) cVar2.b.a).g, new CallOrderFallbackInteractor$showScreenTriggerFlow$1(cVar2, null)), 4), new CallOrderFallbackInteractor$showScreenTriggerFlow$2(cVar2, null)), cVar2), 6);
            cVar2.c.getClass();
            tpr F = kotlinx.coroutines.flow.e.F(mthVar, uyj.a);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 2;
        }
        return zy11.a;
    }
}
