package com.yandex.go.scooters.offer_on_camera.domain;

import com.yandex.go.scooters.offers.v2.data.ScootersOfferCardHeightRepository$special$$inlined$start$1;
import defpackage.bvf0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o4o0;
import defpackage.opo0;
import defpackage.ppo0;
import defpackage.pz40;
import defpackage.qpo0;
import defpackage.qv10;
import defpackage.s3o0;
import defpackage.t3o0;
import defpackage.tpr;
import defpackage.w2b1;
import defpackage.w511;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Lu3o0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offer_on_camera.domain.ScootersOfferOnCameraInteractor$listenOfferOnCameraAction$1", f = "ScootersOfferOnCameraInteractor.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersOfferOnCameraInteractor$listenOfferOnCameraAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ qpo0 $startWithNumbers;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqpo0;", "it", "Lzy11;", "<anonymous>", "(Lqpo0;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.offer_on_camera.domain.ScootersOfferOnCameraInteractor$listenOfferOnCameraAction$1$1", f = "ScootersOfferOnCameraInteractor.kt", l = {52, 53}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.offer_on_camera.domain.ScootersOfferOnCameraInteractor$listenOfferOnCameraAction$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ y6f0 $$this$channelFlow;
        final /* synthetic */ Ref$ObjectRef<pz40> $currentStateChangeFlow;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$ObjectRef ref$ObjectRef, a aVar, y6f0 y6f0Var, Continuation continuation) {
            super(2, continuation);
            this.$currentStateChangeFlow = ref$ObjectRef;
            this.this$0 = aVar;
            this.$$this$channelFlow = y6f0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentStateChangeFlow, this.this$0, this.$$this$channelFlow, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((qpo0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x00a2, code lost:
        
            if (r11 == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a4, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
        
            if (((defpackage.x6f0) r11).y.o(r0, r10) == r1) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            T t;
            qpo0 qpo0Var = (qpo0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                Ref$ObjectRef<pz40> ref$ObjectRef = this.$currentStateChangeFlow;
                a aVar = this.this$0;
                pz40 pz40Var = ref$ObjectRef.element;
                aVar.getClass();
                if (jl40.l(qpo0Var, opo0.a)) {
                    t = 0;
                } else {
                    if (!(qpo0Var instanceof ppo0)) {
                        w511.b();
                        return null;
                    }
                    if (pz40Var == null) {
                        t = bvf0.c(aVar.c((ppo0) qpo0Var));
                    } else {
                        r0 r0Var = (r0) pz40Var;
                        ppo0 ppo0Var = (ppo0) qpo0Var;
                        t = pz40Var;
                        if (!jl40.l(w2b1.b((o4o0) r0Var.getValue()), ppo0Var.b)) {
                            r0Var.m(null, aVar.c(ppo0Var));
                            t = pz40Var;
                        }
                    }
                }
                ref$ObjectRef.element = t;
                y6f0 y6f0Var = this.$$this$channelFlow;
                a aVar2 = this.this$0;
                pz40 pz40Var2 = this.$currentStateChangeFlow.element;
                aVar2.getClass();
                Object t3o0Var = pz40Var2 == null ? s3o0.a : new t3o0(pz40Var2);
                this.L$0 = null;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11.a;
                }
                b.b(obj);
            }
            pz40 pz40Var3 = this.$currentStateChangeFlow.element;
            if (pz40Var3 != null) {
                a aVar3 = this.this$0;
                this.L$0 = null;
                this.label = 2;
                obj = a.a(aVar3, pz40Var3, this);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOfferOnCameraInteractor$listenOfferOnCameraAction$1(qpo0 qpo0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$startWithNumbers = qpo0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersOfferOnCameraInteractor$listenOfferOnCameraAction$1 scootersOfferOnCameraInteractor$listenOfferOnCameraAction$1 = new ScootersOfferOnCameraInteractor$listenOfferOnCameraAction$1(this.$startWithNumbers, this.this$0, continuation);
        scootersOfferOnCameraInteractor$listenOfferOnCameraAction$1.L$0 = obj;
        return scootersOfferOnCameraInteractor$listenOfferOnCameraAction$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersOfferOnCameraInteractor$listenOfferOnCameraAction$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            Ref$ObjectRef z = qv10.z(obj);
            qpo0 qpo0Var = this.$startWithNumbers;
            if (qpo0Var instanceof ppo0) {
                this.this$0.b.Fg(qpo0Var);
            }
            a aVar = this.this$0;
            tpr t = e.t(e.t(new m0(e.d((r0) aVar.b.b), e.t(com.yandex.go.coroutines.b.d(aVar.d.a, new ScootersOfferCardHeightRepository$special$$inlined$start$1(0, null))), new ScootersOfferOnCameraInteractor$listenQrNumberResult$1(aVar, null))));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(z, this.this$0, y6f0Var, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.k(t, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
