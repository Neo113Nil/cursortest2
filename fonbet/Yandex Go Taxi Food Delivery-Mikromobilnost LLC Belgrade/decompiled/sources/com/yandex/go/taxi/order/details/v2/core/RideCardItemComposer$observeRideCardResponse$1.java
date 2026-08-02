package com.yandex.go.taxi.order.details.v2.core;

import com.yandex.go.slot.dto.d0;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.models.api.response.RideCardInfoResponse;
import com.yandex.go.taxi.order.models.api.response.a7;
import defpackage.g050;
import defpackage.h73;
import defpackage.hjk0;
import defpackage.jkk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.vfk0;
import defpackage.w511;
import defpackage.wf00;
import defpackage.wls;
import defpackage.z8s;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.core.RideCardItemComposer$observeRideCardResponse$1", f = "RideCardItemComposer.kt", l = {143}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardItemComposer$observeRideCardResponse$1 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardPresentationType $presentationType;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lcom/yandex/go/taxi/order/models/api/response/RideCardInfoResponse;", "Lvfk0;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.details.v2.core.RideCardItemComposer$observeRideCardResponse$1$2", f = "RideCardItemComposer.kt", l = {375}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.details.v2.core.RideCardItemComposer$observeRideCardResponse$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ RideCardPresentationType $presentationType;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c cVar, RideCardPresentationType rideCardPresentationType, Continuation continuation) {
            super(2, continuation);
            this.$presentationType = rideCardPresentationType;
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$presentationType, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            vfk0 vfk0Var;
            Map j;
            Collection collection;
            Map r;
            c cVar;
            List list;
            g050 g050Var;
            List<d0> list2;
            List<a7> list3;
            Pair pair = (Pair) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                RideCardInfoResponse rideCardInfoResponse = (RideCardInfoResponse) pair.getFirst();
                vfk0Var = (vfk0) pair.getSecond();
                MapBuilder mapBuilder = new MapBuilder();
                if (rideCardInfoResponse != null && (list3 = rideCardInfoResponse.a) != null) {
                    for (a7 a7Var : list3) {
                        String a = a7Var.getA();
                        if (a.length() <= 0) {
                            a = null;
                        }
                        if (a != null) {
                            mapBuilder.put(a, a7Var);
                        }
                    }
                }
                MapBuilder j2 = mapBuilder.j();
                MapBuilder mapBuilder2 = new MapBuilder();
                if (rideCardInfoResponse != null && (list2 = rideCardInfoResponse.b) != null) {
                    for (d0 d0Var : list2) {
                        String a2 = d0Var.getA();
                        if (a2.length() <= 0) {
                            a2 = null;
                        }
                        if (a2 != null) {
                            mapBuilder2.put(a2, d0Var);
                        }
                    }
                }
                j = mapBuilder2.j();
                Collection collection2 = EmptyList.a;
                if (rideCardInfoResponse != null) {
                    RideCardInfoResponse.PresentationsDto presentationsDto = rideCardInfoResponse.c;
                    int i2 = hjk0.a[this.$presentationType.ordinal()];
                    if (i2 == 1) {
                        collection = presentationsDto.a.a;
                    } else if (i2 == 2) {
                        collection = presentationsDto.b.a;
                    } else if (i2 == 3) {
                        collection = presentationsDto.c.a;
                    } else {
                        if (i2 != 4) {
                            w511.b();
                            return null;
                        }
                        collection = collection2;
                    }
                } else {
                    collection = null;
                }
                if (collection != null) {
                    collection2 = collection;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : collection2) {
                    String str = (String) obj2;
                    if (((wf00) j2.keySet()).a.containsKey(str) || ((wf00) j.keySet()).a.containsKey(str)) {
                        arrayList.add(obj2);
                    }
                }
                this.this$0.getClass();
                r = kotlin.collections.b.r(kotlin.sequences.b.o(kotlin.sequences.b.l(new h73(1, arrayList), new z8s(j2, 1)), new z8s(j2, 2)));
                cVar = this.this$0;
                kotlinx.coroutines.sync.a aVar = cVar.j;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vfk0Var;
                this.L$3 = null;
                this.L$4 = j;
                this.L$5 = arrayList;
                this.L$6 = r;
                this.L$7 = aVar;
                this.L$8 = cVar;
                this.label = 1;
                if (aVar.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list = arrayList;
                g050Var = aVar;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = (c) this.L$8;
                g050Var = (g050) this.L$7;
                r = (Map) this.L$6;
                list = (List) this.L$5;
                j = (Map) this.L$4;
                vfk0Var = (vfk0) this.L$2;
                kotlin.b.b(obj);
            }
            try {
                jkk0 jkk0Var = cVar.c;
                jkk0Var.k = vfk0Var;
                c.a(cVar, v4r0.g(((Map) jkk0Var.h.a.getValue()).keySet(), r.keySet()));
                jkk0 jkk0Var2 = cVar.c;
                r0 r0Var = jkk0Var2.g;
                r0Var.getClass();
                r0Var.m(null, r);
                jkk0Var2.i.l(j);
                List list4 = list;
                ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList2.add((String) it.next());
                }
                r0 r0Var2 = jkk0Var2.e;
                r0Var2.getClass();
                r0Var2.m(null, arrayList2);
                g050Var.d(null);
                return zy11.a;
            } catch (Throwable th) {
                g050Var.d(null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardItemComposer$observeRideCardResponse$1(c cVar, RideCardPresentationType rideCardPresentationType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$presentationType = rideCardPresentationType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardItemComposer$observeRideCardResponse$1(this.this$0, this.$presentationType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardItemComposer$observeRideCardResponse$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g a = this.this$0.a.a();
            c cVar = this.this$0;
            RideCardPresentationType rideCardPresentationType = this.$presentationType;
            b bVar = new b(a, cVar, rideCardPresentationType);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar, rideCardPresentationType, null);
            this.label = 1;
            if (e.k(bVar, anonymousClass2, this) == coroutineSingletons) {
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
