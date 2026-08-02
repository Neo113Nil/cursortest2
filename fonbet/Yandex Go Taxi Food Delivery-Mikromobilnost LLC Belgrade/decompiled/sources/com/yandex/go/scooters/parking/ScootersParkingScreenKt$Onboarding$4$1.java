package com.yandex.go.scooters.parking;

import defpackage.aco0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.parking.ScootersParkingScreenKt$Onboarding$4$1", f = "ScootersParkingScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersParkingScreenKt$Onboarding$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.animation.core.a $alpha;
    final /* synthetic */ aco0 $onboarding;
    final /* synthetic */ pz40 $visibilityStateFlow;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.parking.ScootersParkingScreenKt$Onboarding$4$1$1", f = "ScootersParkingScreen.kt", l = {130, HProv.PP_FAST_CODE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.parking.ScootersParkingScreenKt$Onboarding$4$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ androidx.compose.animation.core.a $alpha;
        final /* synthetic */ pz40 $visibilityStateFlow;
        int label;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 4, 0}, xi = 48)
        @mvg(c = "com.yandex.go.scooters.parking.ScootersParkingScreenKt$Onboarding$4$1$1$1", f = "ScootersParkingScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.scooters.parking.ScootersParkingScreenKt$Onboarding$4$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00691 extends SuspendLambda implements wls {
            /* synthetic */ boolean Z$0;
            int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C00691 c00691 = new C00691(2, continuation);
                c00691.Z$0 = ((Boolean) obj).booleanValue();
                return c00691;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((C00691) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label == 0) {
                    kotlin.b.b(obj);
                    return Boolean.valueOf(!z);
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(pz40 pz40Var, androidx.compose.animation.core.a aVar, Continuation continuation) {
            super(2, continuation);
            this.$visibilityStateFlow = pz40Var;
            this.$alpha = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$visibilityStateFlow, this.$alpha, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            if (androidx.compose.animation.core.a.d(r5, r6, null, null, null, r12, 14) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        
            if (kotlinx.coroutines.flow.e.x(r13, r1, r12) == r0) goto L15;
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
                pz40 pz40Var = this.$visibilityStateFlow;
                C00691 c00691 = new C00691(2, null);
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
                kotlin.b.b(obj);
            }
            androidx.compose.animation.core.a aVar = this.$alpha;
            Float f = new Float(0.0f);
            this.label = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.parking.ScootersParkingScreenKt$Onboarding$4$1$2", f = "ScootersParkingScreen.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.parking.ScootersParkingScreenKt$Onboarding$4$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ aco0 $onboarding;
        final /* synthetic */ pz40 $visibilityStateFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(aco0 aco0Var, pz40 pz40Var, Continuation continuation) {
            super(2, continuation);
            this.$onboarding = aco0Var;
            this.$visibilityStateFlow = pz40Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$onboarding, this.$visibilityStateFlow, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                long j = this.$onboarding.b;
                this.label = 1;
                if (kotlinx.coroutines.a.i(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            pz40 pz40Var = this.$visibilityStateFlow;
            Boolean bool = Boolean.FALSE;
            r0 r0Var = (r0) pz40Var;
            r0Var.getClass();
            r0Var.m(null, bool);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersParkingScreenKt$Onboarding$4$1(pz40 pz40Var, androidx.compose.animation.core.a aVar, aco0 aco0Var, Continuation continuation) {
        super(2, continuation);
        this.$visibilityStateFlow = pz40Var;
        this.$alpha = aVar;
        this.$onboarding = aco0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersParkingScreenKt$Onboarding$4$1 scootersParkingScreenKt$Onboarding$4$1 = new ScootersParkingScreenKt$Onboarding$4$1(this.$visibilityStateFlow, this.$alpha, this.$onboarding, continuation);
        scootersParkingScreenKt$Onboarding$4$1.L$0 = obj;
        return scootersParkingScreenKt$Onboarding$4$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersParkingScreenKt$Onboarding$4$1 scootersParkingScreenKt$Onboarding$4$1 = (ScootersParkingScreenKt$Onboarding$4$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersParkingScreenKt$Onboarding$4$1.invokeSuspend(zy11Var);
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
        tje.N(tseVar, null, null, new AnonymousClass1(this.$visibilityStateFlow, this.$alpha, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass2(this.$onboarding, this.$visibilityStateFlow, null), 3);
        return zy11.a;
    }
}
