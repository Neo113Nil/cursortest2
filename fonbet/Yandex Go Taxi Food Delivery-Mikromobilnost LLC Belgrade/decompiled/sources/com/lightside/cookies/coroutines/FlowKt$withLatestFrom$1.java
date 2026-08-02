package com.lightside.cookies.coroutines;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uui;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.lightside.cookies.coroutines.FlowKt$withLatestFrom$1", f = "flow.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class FlowKt$withLatestFrom$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $other;
    final /* synthetic */ tpr $this_withLatestFrom;
    final /* synthetic */ zls $transform;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.lightside.cookies.coroutines.FlowKt$withLatestFrom$1$1", f = "flow.kt", l = {80}, m = "invokeSuspend")
    /* renamed from: com.lightside.cookies.coroutines.FlowKt$withLatestFrom$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ vpr $$this$flow;
        final /* synthetic */ tpr $other;
        final /* synthetic */ tpr $this_withLatestFrom;
        final /* synthetic */ zls $transform;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
        @mvg(c = "com.lightside.cookies.coroutines.FlowKt$withLatestFrom$1$1$1", f = "flow.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend")
        /* renamed from: com.lightside.cookies.coroutines.FlowKt$withLatestFrom$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00321 extends SuspendLambda implements wls {
            final /* synthetic */ AtomicReference<Object> $latestB;
            final /* synthetic */ tpr $other;
            final /* synthetic */ tse $outerScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00321(tpr tprVar, tse tseVar, AtomicReference atomicReference, Continuation continuation) {
                super(2, continuation);
                this.$other = tprVar;
                this.$outerScope = tseVar;
                this.$latestB = atomicReference;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00321(this.$other, this.$outerScope, this.$latestB, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((C00321) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v7 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                try {
                    if (i == 0) {
                        kotlin.b.b(obj);
                        tpr tprVar = this.$other;
                        uui uuiVar = new uui(21, this.$latestB);
                        this.label = 1;
                        Object collect = tprVar.collect(uuiVar, this);
                        this = collect;
                        if (collect == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        this = this;
                    }
                } catch (CancellationException e) {
                    bvf0.j(this.$outerScope, e);
                }
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tpr tprVar, tpr tprVar2, vpr vprVar, zls zlsVar, Continuation continuation) {
            super(2, continuation);
            this.$this_withLatestFrom = tprVar;
            this.$other = tprVar2;
            this.$$this$flow = vprVar;
            this.$transform = zlsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_withLatestFrom, this.$other, this.$$this$flow, this.$transform, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                tse tseVar = (tse) this.L$0;
                AtomicReference atomicReference = new AtomicReference();
                tje.N(tseVar, null, null, new C00321(this.$other, tseVar, atomicReference, null), 3);
                tpr tprVar = this.$this_withLatestFrom;
                a aVar = new a(atomicReference, this.$$this$flow, this.$transform);
                this.label = 1;
                if (tprVar.collect(aVar, this) == coroutineSingletons) {
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
    public FlowKt$withLatestFrom$1(tpr tprVar, tpr tprVar2, zls zlsVar, Continuation continuation) {
        super(2, continuation);
        this.$this_withLatestFrom = tprVar;
        this.$other = tprVar2;
        this.$transform = zlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt$withLatestFrom$1 flowKt$withLatestFrom$1 = new FlowKt$withLatestFrom$1(this.$this_withLatestFrom, this.$other, this.$transform, continuation);
        flowKt$withLatestFrom$1.L$0 = obj;
        return flowKt$withLatestFrom$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt$withLatestFrom$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_withLatestFrom, this.$other, (vpr) this.L$0, this.$transform, null);
            this.label = 1;
            if (bvf0.n(anonymousClass1, this) == coroutineSingletons) {
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
