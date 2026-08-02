package com.yandex.go.chargers.domain;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.domain.ChargersUserStateInteractor$startObserveUserState$1", f = "ChargersUserStateInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersUserStateInteractor$startObserveUserState$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.chargers.domain.ChargersUserStateInteractor$startObserveUserState$1$1", f = "ChargersUserStateInteractor.kt", l = {56}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.chargers.domain.ChargersUserStateInteractor$startObserveUserState$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        int label;
        final /* synthetic */ e this$0;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.chargers.domain.ChargersUserStateInteractor$startObserveUserState$1$1$1", f = "ChargersUserStateInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.chargers.domain.ChargersUserStateInteractor$startObserveUserState$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00441 extends SuspendLambda implements tls {
            int label;
            final /* synthetic */ e this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00441(e eVar, Continuation continuation) {
                super(1, continuation);
                this.this$0 = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C00441(this.this$0, continuation);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return ((C00441) create((Continuation) obj)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    e eVar = this.this$0;
                    this.label = 1;
                    if (e.b(eVar, this) == coroutineSingletons) {
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
        public AnonymousClass1(e eVar, Continuation continuation) {
            super(1, continuation);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e eVar = this.this$0;
            C00441 c00441 = new C00441(eVar, null);
            this.label = 1;
            return kotlinx.coroutines.flow.e.k(com.yandex.go.coroutines.b.d(eVar.f.a, new ChargersUserStateInteractor$onRequestTrigger$$inlined$start$1(zy11Var, null)), new ChargersUserStateInteractor$onRequestTrigger$2(c00441, null), this) == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersUserStateInteractor$startObserveUserState$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersUserStateInteractor$startObserveUserState$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersUserStateInteractor$startObserveUserState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(eVar, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(kotlinx.coroutines.flow.e.t(eVar.e.c()), new ChargersUserStateInteractor$onAuthorized$2(anonymousClass1, null), this) == coroutineSingletons) {
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
