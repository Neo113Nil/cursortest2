package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_auth_onboarding;

import defpackage.kp30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.op30;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.ye;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_auth_onboarding.MtMosMetroAuthOnboardingLifecycleInteractor$onAttach$$inlined$safeCollectIn$1", f = "MtMosMetroAuthOnboardingLifecycleInteractor.kt", l = {HProv.PP_SIGNATUREOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class MtMosMetroAuthOnboardingLifecycleInteractor$onAttach$$inlined$safeCollectIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ kp30 $mtMosMetroAuthOnboardingActionInteractor$inlined;
    final /* synthetic */ op30 $navigator$inlined;
    final /* synthetic */ tpr $this_safeCollectIn;
    final /* synthetic */ b $uiStateRepository$inlined;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lvpr;", "", "cause", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_auth_onboarding.MtMosMetroAuthOnboardingLifecycleInteractor$onAttach$$inlined$safeCollectIn$1$1", f = "MtMosMetroAuthOnboardingLifecycleInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_auth_onboarding.MtMosMetroAuthOnboardingLifecycleInteractor$onAttach$$inlined$safeCollectIn$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            anonymousClass1.L$0 = (Throwable) obj2;
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtMosMetroAuthOnboardingLifecycleInteractor$onAttach$$inlined$safeCollectIn$1(tpr tprVar, Continuation continuation, kp30 kp30Var, b bVar, op30 op30Var) {
        super(2, continuation);
        this.$this_safeCollectIn = tprVar;
        this.$mtMosMetroAuthOnboardingActionInteractor$inlined = kp30Var;
        this.$uiStateRepository$inlined = bVar;
        this.$navigator$inlined = op30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtMosMetroAuthOnboardingLifecycleInteractor$onAttach$$inlined$safeCollectIn$1(this.$this_safeCollectIn, continuation, this.$mtMosMetroAuthOnboardingActionInteractor$inlined, this.$uiStateRepository$inlined, this.$navigator$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtMosMetroAuthOnboardingLifecycleInteractor$onAttach$$inlined$safeCollectIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o oVar = new o(this.$this_safeCollectIn, new AnonymousClass1(3, null));
            ye yeVar = new ye(15, this.$mtMosMetroAuthOnboardingActionInteractor$inlined, this.$uiStateRepository$inlined, this.$navigator$inlined);
            this.L$0 = null;
            this.label = 1;
            if (oVar.collect(yeVar, this) == coroutineSingletons) {
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
