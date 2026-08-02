package com.yandex.go.scooters.domain;

import defpackage.ah00;
import defpackage.bh00;
import defpackage.gh00;
import defpackage.jbh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t1b0;
import defpackage.tje;
import defpackage.tse;
import defpackage.v7n0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.ScootersCommonMapSetupLifecycleInteractor$onLaunch$1$2", f = "ScootersCommonMapSetupLifecycleInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersCommonMapSetupLifecycleInteractor$onLaunch$1$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ v7n0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.domain.ScootersCommonMapSetupLifecycleInteractor$onLaunch$1$2$1", f = "ScootersCommonMapSetupLifecycleInteractor.kt", l = {38}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.domain.ScootersCommonMapSetupLifecycleInteractor$onLaunch$1$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ v7n0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(v7n0 v7n0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = v7n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                t1b0 f = ((jbh) this.this$0.c).f(SimplePersistentBooleanExperiment.SCOOTERS_CLIENT_MAP_ROTATABLE);
                this.label = 1;
                obj = f.b(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                ((gh00) this.this$0.a).I(true);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCommonMapSetupLifecycleInteractor$onLaunch$1$2(v7n0 v7n0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = v7n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersCommonMapSetupLifecycleInteractor$onLaunch$1$2 scootersCommonMapSetupLifecycleInteractor$onLaunch$1$2 = new ScootersCommonMapSetupLifecycleInteractor$onLaunch$1$2(this.this$0, continuation);
        scootersCommonMapSetupLifecycleInteractor$onLaunch$1$2.L$0 = obj;
        return scootersCommonMapSetupLifecycleInteractor$onLaunch$1$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersCommonMapSetupLifecycleInteractor$onLaunch$1$2 scootersCommonMapSetupLifecycleInteractor$onLaunch$1$2 = (ScootersCommonMapSetupLifecycleInteractor$onLaunch$1$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersCommonMapSetupLifecycleInteractor$onLaunch$1$2.invokeSuspend(zy11Var);
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
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
        ah00 ah00Var = this.this$0.a;
        kotlinx.coroutines.flow.e.H(tseVar, com.yandex.go.scooters.utils.b.b(ah00Var, new bh00(ah00Var, 1)));
        return zy11.a;
    }
}
