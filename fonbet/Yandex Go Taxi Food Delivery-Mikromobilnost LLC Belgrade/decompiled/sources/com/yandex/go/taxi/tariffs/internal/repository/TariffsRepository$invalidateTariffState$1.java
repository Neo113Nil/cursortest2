package com.yandex.go.taxi.tariffs.internal.repository;

import com.yandex.go.taxi.tariffs.models.TariffChangeReason;
import defpackage.dk31;
import defpackage.ex1;
import defpackage.is60;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.rg70;
import defpackage.rrx0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.za31;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.internal.repository.TariffsRepository$invalidateTariffState$1", f = "TariffsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class TariffsRepository$invalidateTariffState$1 extends SuspendLambda implements wls {
    final /* synthetic */ PriceUpdate$PriceLoadingState $priceLoadingState;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffsRepository$invalidateTariffState$1(k kVar, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$priceLoadingState = priceUpdate$PriceLoadingState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffsRepository$invalidateTariffState$1(this.this$0, this.$priceLoadingState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TariffsRepository$invalidateTariffState$1 tariffsRepository$invalidateTariffState$1 = (TariffsRepository$invalidateTariffState$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        tariffsRepository$invalidateTariffState$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pex0 b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.j.c.l(this.$priceLoadingState);
        int i = rrx0.a[this.$priceLoadingState.ordinal()];
        if (i == 1 || i == 2) {
            k kVar = this.this$0;
            rg70 rg70Var = kVar.e;
            dk31 j = kVar.j();
            rg70Var.getClass();
            List<za31> list = j.a;
            ArrayList arrayList = new ArrayList();
            for (za31 za31Var : list) {
                List<mi31> list2 = za31Var.b;
                ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                for (mi31 mi31Var : list2) {
                    pex0 pex0Var = mi31Var.a;
                    pex0 pex0Var2 = (pex0Var.g() || (b = pex0Var.b()) == null) ? pex0Var : b;
                    List list3 = pex0Var2.t0.a;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list3) {
                        if (((ex1) obj2).b()) {
                            arrayList3.add(obj2);
                        }
                    }
                    arrayList2.add(mi31.a(mi31Var, pex0.a(pex0Var2, null, null, is60.c, null, null, null, null, null, 0, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, new ru.yandex.taxi.tariffs.model.a(arrayList3), null, -65, -769, 8388479), null, 30));
                }
                arrayList.add(za31.a(za31Var, arrayList2, null, 5));
            }
            kVar.q(dk31.a(j, arrayList), TariffChangeReason.DEFAULT);
        } else if (i != 3 && i != 4) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
