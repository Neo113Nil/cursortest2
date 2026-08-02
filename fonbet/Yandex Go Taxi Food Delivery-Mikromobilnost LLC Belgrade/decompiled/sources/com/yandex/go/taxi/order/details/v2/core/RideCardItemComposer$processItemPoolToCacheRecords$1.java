package com.yandex.go.taxi.order.details.v2.core;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.models.api.response.a7;
import defpackage.a3y0;
import defpackage.g050;
import defpackage.gci0;
import defpackage.hst;
import defpackage.jkk0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.tse;
import defpackage.vfk0;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.core.RideCardItemComposer$processItemPoolToCacheRecords$1", f = "RideCardItemComposer.kt", l = {363}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardItemComposer$processItemPoolToCacheRecords$1 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardPresentationType $presentationType;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "itemPool", "Lzy11;", "<anonymous>", "(Ljava/util/Map;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.details.v2.core.RideCardItemComposer$processItemPoolToCacheRecords$1$1", f = "RideCardItemComposer.kt", l = {367}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.details.v2.core.RideCardItemComposer$processItemPoolToCacheRecords$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ RideCardPresentationType $presentationType;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, RideCardPresentationType rideCardPresentationType, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$presentationType = rideCardPresentationType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$presentationType, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((Map) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10, types: [g050] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c cVar;
            kotlinx.coroutines.sync.a aVar;
            RideCardPresentationType rideCardPresentationType;
            a7 a7Var;
            a7 a7Var2;
            Map map = (Map) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            a7 a7Var3 = null;
            if (i == 0) {
                kotlin.b.b(obj);
                cVar = this.this$0;
                kotlinx.coroutines.sync.a aVar2 = cVar.j;
                RideCardPresentationType rideCardPresentationType2 = this.$presentationType;
                this.L$0 = map;
                this.L$1 = aVar2;
                this.L$2 = cVar;
                this.L$3 = rideCardPresentationType2;
                this.label = 1;
                if (aVar2.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar = aVar2;
                rideCardPresentationType = rideCardPresentationType2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                RideCardPresentationType rideCardPresentationType3 = (RideCardPresentationType) this.L$3;
                cVar = (c) this.L$2;
                ?? r0 = (g050) this.L$1;
                kotlin.b.b(obj);
                rideCardPresentationType = rideCardPresentationType3;
                aVar = r0;
            }
            c cVar2 = cVar;
            try {
                jkk0 jkk0Var = cVar2.c;
                a3y0 a3y0Var = cVar2.g;
                pwy0 pwy0Var = cVar2.f;
                LinkedHashMap linkedHashMap = new LinkedHashMap((Map) jkk0Var.d.a.getValue());
                vfk0 vfk0Var = jkk0Var.k;
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    a7 a7Var4 = (a7) entry.getValue();
                    Pair pair = (Pair) linkedHashMap.get(str);
                    if (pair != null) {
                        try {
                            a7Var2 = (a7) pair.c();
                        } catch (Throwable th) {
                            th = th;
                            a7Var = a7Var3;
                            aVar.d(a7Var);
                            throw th;
                        }
                    } else {
                        a7Var2 = a7Var3;
                    }
                    if (pair == null) {
                        linkedHashMap.put(str, new Pair(a7Var4, e.X(pwy0Var.a(), new RideCardItemComposer$processItemPoolToCacheRecords$1$1$invokeSuspend$lambda$0$0$$inlined$flatMapLatest$1(null, cVar2, a7Var4, map, rideCardPresentationType, vfk0Var))));
                        a3y0Var.getClass();
                        a3y0.h(new String[]{"processItemPoolToCacheRecords"});
                        hst hstVar = jst.e;
                    } else if (a7Var2 != null) {
                        linkedHashMap.put(str, new Pair(a7Var4, e.X(pwy0Var.a(), new RideCardItemComposer$processItemPoolToCacheRecords$1$1$invokeSuspend$lambda$0$0$$inlined$flatMapLatest$2(null, cVar2, a7Var4, map, rideCardPresentationType, vfk0Var))));
                        a3y0.a(a3y0Var, new String[]{"processItemPoolToCacheRecords", "reconfigure: " + str}, null, 6);
                    }
                    a7Var3 = null;
                }
                r0 r0Var = jkk0Var.c;
                r0Var.getClass();
                r0Var.m(null, linkedHashMap);
                aVar.d(null);
                return zy11.a;
            } catch (Throwable th2) {
                th = th2;
                a7Var = null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardItemComposer$processItemPoolToCacheRecords$1(c cVar, RideCardPresentationType rideCardPresentationType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$presentationType = rideCardPresentationType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardItemComposer$processItemPoolToCacheRecords$1(this.this$0, this.$presentationType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardItemComposer$processItemPoolToCacheRecords$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            gci0 gci0Var = cVar.c.h;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar, this.$presentationType, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.k(gci0Var, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ny61.r("SharedFlow never completes, this call should never return.");
        return null;
    }
}
