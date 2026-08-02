package com.yandex.go.taxi.order.recalculation.ui;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.recalculation.model.response.NewRoutePrice;
import defpackage.c0f0;
import defpackage.d0l0;
import defpackage.f0f0;
import defpackage.k0f0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vld0;
import defpackage.vye0;
import defpackage.wls;
import defpackage.yze0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.recalculation.ui.PriceRecalculationPresenter$getNewRoutePrice$1", f = "PriceRecalculationPresenter.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class PriceRecalculationPresenter$getNewRoutePrice$1 extends SuspendLambda implements wls {
    final /* synthetic */ Address $finalDestination;
    final /* synthetic */ d0l0 $route;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceRecalculationPresenter$getNewRoutePrice$1(b bVar, Address address, d0l0 d0l0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$finalDestination = address;
        this.$route = d0l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PriceRecalculationPresenter$getNewRoutePrice$1(this.this$0, this.$finalDestination, this.$route, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PriceRecalculationPresenter$getNewRoutePrice$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        b bVar2;
        Object k0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar3 = this.this$0;
                yze0 yze0Var = bVar3.A;
                ((c0f0) bVar3.Dg()).i1(new k0f0(yze0Var.e(((f0f0) bVar3.z.b).c), yze0Var.c(), yze0Var.a(), yze0Var.b(), kotlin.collections.a.X(bVar3.y, " ➞\n", null, null, new vld0(24), 30)));
                bVar = this.this$0;
                Address address = this.$finalDestination;
                d0l0 d0l0Var = this.$route;
                try {
                    bVar.D.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    PriceRecalculationPresenter$getNewRoutePrice$1$1$response$1 priceRecalculationPresenter$getNewRoutePrice$1$1$response$1 = new PriceRecalculationPresenter$getNewRoutePrice$1$1$response$1(bVar, address, d0l0Var, null);
                    this.L$0 = bVar;
                    this.L$1 = bVar;
                    this.label = 1;
                    k0 = tje.k0(mdhVar, priceRecalculationPresenter$getNewRoutePrice$1$1$response$1, this);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bVar2 = bVar;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    bVar2.L.b("getNewRoutePrice", th, new vye0(7));
                    b.Lg(bVar2);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar2 = (b) this.L$1;
                b bVar4 = (b) this.L$0;
                try {
                    kotlin.b.b(obj);
                    bVar = bVar4;
                    k0 = obj;
                } catch (Throwable th2) {
                    th = th2;
                    bVar2.L.b("getNewRoutePrice", th, new vye0(7));
                    b.Lg(bVar2);
                    return zy11.a;
                }
            }
            b.Kg(bVar, (NewRoutePrice) k0);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
