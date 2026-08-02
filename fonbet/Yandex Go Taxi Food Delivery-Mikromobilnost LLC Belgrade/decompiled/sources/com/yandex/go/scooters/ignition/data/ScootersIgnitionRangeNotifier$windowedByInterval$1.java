package com.yandex.go.scooters.ignition.data;

import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p9g0;
import defpackage.qv10;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.k;
import org.altbeacon.beacon.Beacon;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "Lorg/altbeacon/beacon/Beacon;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.data.ScootersIgnitionRangeNotifier$windowedByInterval$1", f = "ScootersIgnitionRangeNotifier.kt", l = {114}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionRangeNotifier$windowedByInterval$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $intervalMs;
    final /* synthetic */ tpr $this_windowedByInterval;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lorg/altbeacon/beacon/Beacon;", "it", "Lzy11;", "<anonymous>", "(Ljava/util/Collection;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.ignition.data.ScootersIgnitionRangeNotifier$windowedByInterval$1$1", f = "ScootersIgnitionRangeNotifier.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.ignition.data.ScootersIgnitionRangeNotifier$windowedByInterval$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Ref$ObjectRef<List<Beacon>> $batch;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
            super(2, continuation);
            this.$batch = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.$batch);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((Collection) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [T, java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Collection<? extends Beacon> collection = (Collection) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            Ref$ObjectRef<List<Beacon>> ref$ObjectRef = this.$batch;
            if (ref$ObjectRef.element == null) {
                ref$ObjectRef.element = new ArrayList();
            }
            List<Beacon> list = this.$batch.element;
            if (list != null) {
                list.addAll(collection);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionRangeNotifier$windowedByInterval$1(tpr tprVar, long j, Continuation continuation) {
        super(2, continuation);
        this.$this_windowedByInterval = tprVar;
        this.$intervalMs = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersIgnitionRangeNotifier$windowedByInterval$1 scootersIgnitionRangeNotifier$windowedByInterval$1 = new ScootersIgnitionRangeNotifier$windowedByInterval$1(this.$this_windowedByInterval, this.$intervalMs, continuation);
        scootersIgnitionRangeNotifier$windowedByInterval$1.L$0 = obj;
        return scootersIgnitionRangeNotifier$windowedByInterval$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionRangeNotifier$windowedByInterval$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        Ref$ObjectRef z = qv10.z(obj);
        k N = kotlinx.coroutines.flow.e.N(new jqr(this.$this_windowedByInterval, new AnonymousClass1(null, z), 3), this.$intervalMs);
        p9g0 p9g0Var = new p9g0(8, z, vprVar);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object collect = N.collect(p9g0Var, this);
        return collect == coroutineSingletons ? coroutineSingletons : collect;
    }
}
