package com.yandex.go.taxi.cars.preorder.source;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.bms;
import defpackage.fnx0;
import defpackage.hk50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.rfa0;
import defpackage.rpj0;
import defpackage.tcc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lpex0;", "selectedTariff", "Ldbl0;", "routeStats", "", "isMainScreen", "Lhk50;", "<anonymous>", "(Lpex0;Ldbl0;Z)Lhk50;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.cars.preorder.source.PreorderCarsOnMapPresenter$subscribeToTariffChanges$4", f = "PreorderCarsOnMapPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class PreorderCarsOnMapPresenter$subscribeToTariffChanges$4 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreorderCarsOnMapPresenter$subscribeToTariffChanges$4(j jVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = jVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        PreorderCarsOnMapPresenter$subscribeToTariffChanges$4 preorderCarsOnMapPresenter$subscribeToTariffChanges$4 = new PreorderCarsOnMapPresenter$subscribeToTariffChanges$4(this.this$0, (Continuation) obj4);
        preorderCarsOnMapPresenter$subscribeToTariffChanges$4.L$0 = (pex0) obj;
        preorderCarsOnMapPresenter$subscribeToTariffChanges$4.Z$0 = booleanValue;
        return preorderCarsOnMapPresenter$subscribeToTariffChanges$4.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fnx0 l;
        pex0 pex0Var = (pex0) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        j jVar = this.this$0;
        if (jVar.P == Screen.MAIN && !((List) jVar.H.a.getValue()).isEmpty() && (l = ((k) jVar.D).l()) != null) {
            pex0 pex0Var2 = l.c;
            if (!pex0Var2.K0) {
                pex0Var = pex0Var2;
            }
        }
        rpj0 rpj0Var = RequirementsParam.Companion;
        List list = jVar.E.a.x;
        rpj0Var.getClass();
        RequirementsParam a = rpj0.a(null, list);
        rfa0 a2 = jVar.J.a(jVar.E.a.c(), jVar.E.a.e());
        List list2 = pex0Var.U;
        if (!pex0Var.K0 || list2 == null) {
            return new hk50(Collections.singleton(pex0Var.b), pex0Var.G, a, a2, z);
        }
        List list3 = list2;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((pex0) it.next()).b);
        }
        return new hk50(kotlin.collections.a.N0(arrayList), pex0Var.G, a, a2, z);
    }
}
