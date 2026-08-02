package com.yandex.go.taxi.order.map.route;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import defpackage.h8l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.ool0;
import defpackage.plm;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4s0;
import defpackage.yxf0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.route.RouteProgressTracker$startTracking$1", f = "RouteProgressTracker.kt", l = {110}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RouteProgressTracker$startTracking$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh8l0;", "it", "Lzy11;", "<anonymous>", "(Lh8l0;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.map.route.RouteProgressTracker$startTracking$1$1", f = "RouteProgressTracker.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.map.route.RouteProgressTracker$startTracking$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((h8l0) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            h8l0 h8l0Var = (h8l0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            yxf0 yxf0Var = this.this$0.m;
            a aVar = (a) yxf0Var.b;
            if (h8l0Var.b == null) {
                o7r0 o7r0Var = aVar.c;
                o7r0Var.getClass();
                o7r0Var.a.a("TaxiRouteTracker.FailToBuildRoute", new HashMap(), 1, new HashMap());
                zzs zzsVar = (zzs) aVar.o.getValue();
                if (zzsVar != null) {
                    ool0 ool0Var = h8l0Var.a;
                    x4s0 x4s0Var = aVar.d;
                    Polyline geometry = ool0Var.getGeometry();
                    PolylinePosition polylinePosition = (PolylinePosition) yxf0Var.a;
                    x4s0Var.getClass();
                    h8l0Var = new h8l0(ool0Var, x4s0.a(geometry, polylinePosition, zzsVar));
                }
            }
            PolylinePosition polylinePosition2 = h8l0Var.b;
            if (polylinePosition2 != null) {
                yxf0Var.a = polylinePosition2;
            }
            aVar.q = h8l0Var;
            aVar.k.g(h8l0Var);
            aVar.l.g(aVar.w);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteProgressTracker$startTracking$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteProgressTracker$startTracking$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteProgressTracker$startTracking$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            tpr tprVar = ((plm) aVar.b).c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar, null);
            this.label = 1;
            if (e.k(tprVar, anonymousClass1, this) == coroutineSingletons) {
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
