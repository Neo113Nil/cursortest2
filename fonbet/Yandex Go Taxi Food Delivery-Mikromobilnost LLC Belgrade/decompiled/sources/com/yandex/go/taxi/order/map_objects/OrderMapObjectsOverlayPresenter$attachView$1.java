package com.yandex.go.taxi.order.map_objects;

import defpackage.b080;
import defpackage.e080;
import defpackage.ei70;
import defpackage.f080;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.v41;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map_objects.OrderMapObjectsOverlayPresenter$attachView$1", f = "OrderMapObjectsOverlayPresenter.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderMapObjectsOverlayPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ e080 $mvpView;
    int label;
    final /* synthetic */ f080 this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lei70;", "mapObjects", "", "zoom", "<anonymous>", "(Ljava/util/List;F)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.map_objects.OrderMapObjectsOverlayPresenter$attachView$1$1", f = "OrderMapObjectsOverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.map_objects.OrderMapObjectsOverlayPresenter$attachView$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ float F$0;
        /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            float floatValue = ((Number) obj2).floatValue();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            anonymousClass1.L$0 = (List) obj;
            anonymousClass1.F$0 = floatValue;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            float f = this.F$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                ei70 ei70Var = (ei70) obj2;
                if (ei70Var.c < f && f < ei70Var.d) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMapObjectsOverlayPresenter$attachView$1(f080 f080Var, e080 e080Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = f080Var;
        this.$mvpView = e080Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderMapObjectsOverlayPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderMapObjectsOverlayPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b080 b080Var = this.this$0.x;
            e eVar = new e(kotlinx.coroutines.flow.e.t(new c(b080Var.b.a())), b080Var);
            b080Var.a.getClass();
            sjh sjhVar = uyj.a;
            m0 m0Var = new m0(kotlinx.coroutines.flow.e.F(eVar, mdh.b), this.this$0.D, new AnonymousClass1(3, null));
            v41 v41Var = new v41(14, this.$mvpView);
            this.label = 1;
            if (m0Var.collect(v41Var, this) == coroutineSingletons) {
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
