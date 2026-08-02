package com.yandex.go.zone.interactors;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import com.yandex.go.zone.model.Zone;
import defpackage.b2k;
import defpackage.be61;
import defpackage.dvx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p0u;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vng;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.zone.interactors.LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1", f = "LaunchIdChangedZoneLifecycleInteractor.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.zone.interactors.LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1", f = "LaunchIdChangedZoneLifecycleInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.zone.interactors.LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.zone.interactors.LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1", f = "LaunchIdChangedZoneLifecycleInteractor.kt", l = {69}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.zone.interactors.LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00811 extends SuspendLambda implements wls {
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ d this$0;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/zone/model/Zone;", "zone", "Ldvx;", "launchInfo", "Lbe61;", "<anonymous>", "(Lcom/yandex/go/zone/model/Zone;Ldvx;)Lbe61;"}, k = 3, mv = {2, 4, 0})
            @mvg(c = "com.yandex.go.zone.interactors.LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$1", f = "LaunchIdChangedZoneLifecycleInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.yandex.go.zone.interactors.LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$1, reason: invalid class name and collision with other inner class name */
            final class C00821 extends SuspendLambda implements zls {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    C00821 c00821 = new C00821(3, (Continuation) obj3);
                    c00821.L$0 = (Zone) obj;
                    c00821.L$1 = (dvx) obj2;
                    return c00821.invokeSuspend(zy11.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Zone zone = (Zone) this.L$0;
                    dvx dvxVar = (dvx) this.L$1;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label == 0) {
                        kotlin.b.b(obj);
                        return new be61(zone, dvxVar.a);
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00811(d dVar, Continuation continuation) {
                super(2, continuation);
                this.this$0 = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00811(this.this$0, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((C00811) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    b2k l = vng.l(new m0(this.this$0.a.c(), this.this$0.b.b(), new C00821(3, null)), new p0u(12), vng.c);
                    d dVar = this.this$0;
                    o oVar = new o(l, new LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                    c cVar = new c(dVar);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 1;
                    if (oVar.collect(cVar, this) == coroutineSingletons) {
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
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.this$0.c.getClass();
            tje.N(tseVar, uyj.a, null, new C00811(this.this$0, null), 2);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            Lifecycle lifecycle = dVar.e;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar, null);
            this.label = 1;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
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
