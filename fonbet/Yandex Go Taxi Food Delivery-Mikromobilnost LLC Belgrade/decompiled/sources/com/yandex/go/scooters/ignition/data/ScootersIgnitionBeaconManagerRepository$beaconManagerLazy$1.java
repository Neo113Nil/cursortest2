package com.yandex.go.scooters.ignition.data;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.brn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.xgz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.utils.ChangeAwareCopyOnWriteArrayList;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/altbeacon/beacon/b;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "()Lorg/altbeacon/beacon/b;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.data.ScootersIgnitionBeaconManagerRepository$beaconManagerLazy$1", f = "ScootersIgnitionBeaconManagerRepository.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ScootersIgnitionBeaconManagerRepository$beaconManagerLazy$1 extends SuspendLambda implements tls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionBeaconManagerRepository$beaconManagerLazy$1(a aVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersIgnitionBeaconManagerRepository$beaconManagerLazy$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersIgnitionBeaconManagerRepository$beaconManagerLazy$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        org.altbeacon.beacon.b bVar;
        org.altbeacon.beacon.b bVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            org.altbeacon.beacon.b.v();
            int i2 = xgz.a;
            org.altbeacon.beacon.b j = org.altbeacon.beacon.b.j(this.this$0.a);
            a aVar = this.this$0;
            j.y();
            j.h().clear();
            ChangeAwareCopyOnWriteArrayList h = j.h();
            BeaconParser beaconParser = new BeaconParser();
            beaconParser.p("m:2-3=0215,i:4-19,i:20-21,i:22-23,p:24-24");
            h.add(beaconParser);
            brn0 brn0Var = aVar.b;
            this.L$0 = j;
            this.L$1 = j;
            this.label = 1;
            Object b = brn0Var.a.b(this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            bVar = j;
            obj = b;
            bVar2 = bVar;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = (org.altbeacon.beacon.b) this.L$1;
            bVar2 = (org.altbeacon.beacon.b) this.L$0;
            kotlin.b.b(obj);
        }
        ScootersIgnitionExperiment scootersIgnitionExperiment = (ScootersIgnitionExperiment) obj;
        long j2 = scootersIgnitionExperiment.j;
        long j3 = scootersIgnitionExperiment.k;
        bVar.x(j2);
        bVar.w(j3);
        bVar.u(scootersIgnitionExperiment.j);
        bVar.s(j3);
        bVar.F();
        return bVar2;
    }
}
