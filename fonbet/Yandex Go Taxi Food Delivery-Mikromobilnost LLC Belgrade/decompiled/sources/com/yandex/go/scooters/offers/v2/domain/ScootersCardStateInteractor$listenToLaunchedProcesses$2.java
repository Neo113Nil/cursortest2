package com.yandex.go.scooters.offers.v2.domain;

import defpackage.a6n0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersCardStateInteractor$listenToLaunchedProcesses$2", f = "ScootersCardStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersCardStateInteractor$listenToLaunchedProcesses$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersCardStateInteractor$listenToLaunchedProcesses$2$1", f = "ScootersCardStateInteractor.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.offers.v2.domain.ScootersCardStateInteractor$listenToLaunchedProcesses$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e eVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
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
            int i2 = 1;
            if (i == 0) {
                kotlin.b.b(obj);
                tpr t = kotlinx.coroutines.flow.e.t(new d(this.this$0.b.f("photocontrol")));
                a6n0 a6n0Var = new a6n0(this.this$0, i2);
                this.label = 1;
                if (t.collect(a6n0Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersCardStateInteractor$listenToLaunchedProcesses$2$2", f = "ScootersCardStateInteractor.kt", l = {HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.offers.v2.domain.ScootersCardStateInteractor$listenToLaunchedProcesses$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(e eVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
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
                com.yandex.go.scooters.passes.domain.g gVar = this.this$0.j;
                tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{new com.yandex.go.scooters.passes.domain.b(gVar.a.f("package")), new com.yandex.go.scooters.passes.domain.d(gVar.a.f("superpass"))}, 2)));
                a6n0 a6n0Var = new a6n0(this.this$0, 2);
                this.label = 1;
                if (t.collect(a6n0Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersCardStateInteractor$listenToLaunchedProcesses$2$3", f = "ScootersCardStateInteractor.kt", l = {HProv.PP_CONTAINER_DEFAULT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.offers.v2.domain.ScootersCardStateInteractor$listenToLaunchedProcesses$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(e eVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.d(((com.yandex.go.scooters.subscription.data.b) this.this$0.k).b));
                a6n0 a6n0Var = new a6n0(this.this$0, 3);
                this.label = 1;
                if (t.collect(a6n0Var, this) == coroutineSingletons) {
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
    public ScootersCardStateInteractor$listenToLaunchedProcesses$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersCardStateInteractor$listenToLaunchedProcesses$2 scootersCardStateInteractor$listenToLaunchedProcesses$2 = new ScootersCardStateInteractor$listenToLaunchedProcesses$2(this.this$0, continuation);
        scootersCardStateInteractor$listenToLaunchedProcesses$2.L$0 = obj;
        return scootersCardStateInteractor$listenToLaunchedProcesses$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCardStateInteractor$listenToLaunchedProcesses$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
        return tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, null), 3);
    }
}
