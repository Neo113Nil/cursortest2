package com.yandex.go.taxi.order.details.v2.core;

import com.yandex.go.taxi.order.models.api.response.a7;
import defpackage.a3y0;
import defpackage.gci0;
import defpackage.hst;
import defpackage.jl40;
import defpackage.jst;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.core.RideCardItemComposer$observeCacheRecords$1", f = "RideCardItemComposer.kt", l = {363}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardItemComposer$observeCacheRecords$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2(\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002j\u0002`\u00060\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "", "Lkotlin/Pair;", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Ltpr;", "Lzjk0;", "Lcom/yandex/go/taxi/order/details/v2/core/CacheRecord;", "cacheRecords", "Lzy11;", "<anonymous>", "(Ljava/util/Map;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.details.v2.core.RideCardItemComposer$observeCacheRecords$1$1", f = "RideCardItemComposer.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.details.v2.core.RideCardItemComposer$observeCacheRecords$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ tse $$this$launch;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, tse tseVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$$this$launch = tseVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$launch, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((Map) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a7 a7Var;
            Map map = (Map) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) this.this$0.i.getValue());
            c cVar = this.this$0;
            tse tseVar = this.$$this$launch;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Pair pair = (Pair) entry.getValue();
                Pair pair2 = (Pair) linkedHashMap.get(str);
                a7 a7Var2 = pair2 != null ? (a7) pair2.c() : null;
                Pair pair3 = (Pair) map.get(str);
                if (pair3 != null && (a7Var = (a7) pair3.c()) != null) {
                    if (pair2 != null && !jl40.l(a7Var2, a7Var)) {
                        ((l8x) pair2.f()).a(null);
                        linkedHashMap.remove(str);
                        tpr tprVar = (tpr) pair.f();
                        cVar.getClass();
                        c.b(cVar, str, a7Var, tje.N(tseVar, null, null, new RideCardItemComposer$collectItemStateJob$1(tprVar, cVar, null), 3));
                        cVar.g.getClass();
                        a3y0.h(new String[]{"observeCacheRecords"});
                        hst hstVar = jst.e;
                    } else if (pair2 == null) {
                        linkedHashMap.remove(str);
                        tpr tprVar2 = (tpr) pair.f();
                        cVar.getClass();
                        c.b(cVar, str, a7Var, tje.N(tseVar, null, null, new RideCardItemComposer$collectItemStateJob$1(tprVar2, cVar, null), 3));
                        cVar.g.getClass();
                        a3y0.h(new String[]{"observeCacheRecords"});
                        hst hstVar2 = jst.e;
                    }
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardItemComposer$observeCacheRecords$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardItemComposer$observeCacheRecords$1 rideCardItemComposer$observeCacheRecords$1 = new RideCardItemComposer$observeCacheRecords$1(this.this$0, continuation);
        rideCardItemComposer$observeCacheRecords$1.L$0 = obj;
        return rideCardItemComposer$observeCacheRecords$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardItemComposer$observeCacheRecords$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            gci0 gci0Var = cVar.c.d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar, tseVar, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
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
