package com.yandex.go.taxi.order.map;

import com.yandex.go.taxi.order.map.overlay.traffic.TrafficLightWithSignal$Signal;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.RoadObjectSettingsExperiment;
import defpackage.a901;
import defpackage.e901;
import defpackage.ftk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u001e\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Triple;", "", "La901;", "Le901;", "", "<destruct>", "Litk0;", "<anonymous>", "(Lkotlin/Triple;)Litk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.RoadObjectsInteractor$trafficLightsUiStateFlow$2", f = "RoadObjectsInteractor.kt", l = {81}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RoadObjectsInteractor$trafficLightsUiStateFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ n this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La901;", "trafficLight", "Landroid/graphics/Bitmap;", "<anonymous>", "(La901;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.map.RoadObjectsInteractor$trafficLightsUiStateFlow$2$2", f = "RoadObjectsInteractor.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.map.RoadObjectsInteractor$trafficLightsUiStateFlow$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ n this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(n nVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((a901) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a901 a901Var = (a901) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            com.yandex.go.taxi.order.map.overlay.traffic.a aVar = this.this$0.h;
            TrafficLightWithSignal$Signal trafficLightWithSignal$Signal = a901Var.a;
            Integer num = a901Var.c;
            this.L$0 = null;
            this.label = 1;
            Object b = aVar.b(trafficLightWithSignal$Signal, num, this);
            return b == coroutineSingletons ? coroutineSingletons : b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoadObjectsInteractor$trafficLightsUiStateFlow$2(n nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RoadObjectsInteractor$trafficLightsUiStateFlow$2 roadObjectsInteractor$trafficLightsUiStateFlow$2 = new RoadObjectsInteractor$trafficLightsUiStateFlow$2(this.this$0, continuation);
        roadObjectsInteractor$trafficLightsUiStateFlow$2.L$0 = obj;
        return roadObjectsInteractor$trafficLightsUiStateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RoadObjectsInteractor$trafficLightsUiStateFlow$2) create((Triple) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Triple triple = (Triple) this.L$0;
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
        kotlin.b.b(obj);
        List list = (List) triple.getFirst();
        e901 e901Var = (e901) triple.getSecond();
        boolean booleanValue = ((Boolean) triple.getThird()).booleanValue();
        RoadObjectSettingsExperiment.TrafficLight trafficLight = e901Var.d;
        RoadObjectSettingsExperiment.TrafficLight trafficLight2 = e901Var.d;
        if (trafficLight == null) {
            return ftk0.a;
        }
        g gVar = this.this$0.e;
        List list2 = e901Var.a;
        List list3 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((a901) it.next()).b);
        }
        List A0 = kotlin.collections.a.A0(list3, trafficLight2.c);
        int i2 = trafficLight2.c;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.Z$0 = booleanValue;
        this.label = 1;
        Object b = gVar.b(list2, arrayList, trafficLight2, A0, booleanValue, i2, anonymousClass2, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
