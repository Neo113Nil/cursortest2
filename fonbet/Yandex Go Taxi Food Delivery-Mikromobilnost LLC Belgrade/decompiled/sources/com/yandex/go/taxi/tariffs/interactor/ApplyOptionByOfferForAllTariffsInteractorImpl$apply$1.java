package com.yandex.go.taxi.tariffs.interactor;

import defpackage.dk31;
import defpackage.ex1;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tcc;
import defpackage.tls;
import defpackage.wu1;
import defpackage.za31;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldk31;", "<anonymous>", "()Ldk31;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.interactor.ApplyOptionByOfferForAllTariffsInteractorImpl$apply$1", f = "ApplyOptionByOfferForAllTariffsInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ApplyOptionByOfferForAllTariffsInteractorImpl$apply$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $offer;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplyOptionByOfferForAllTariffsInteractorImpl$apply$1(a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$offer = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ApplyOptionByOfferForAllTariffsInteractorImpl$apply$1(this.this$0, this.$offer, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ApplyOptionByOfferForAllTariffsInteractorImpl$apply$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        dk31 j = this.this$0.a.j();
        a aVar = this.this$0;
        String str = this.$offer;
        aVar.getClass();
        List<za31> list = j.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (za31 za31Var : list) {
            List<mi31> list2 = za31Var.b;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
            for (mi31 mi31Var : list2) {
                pex0 pex0Var = mi31Var.a;
                if (!pex0Var.J0.b.a().equals(str)) {
                    wu1 wu1Var = pex0Var.O;
                    ru.yandex.taxi.tariffs.model.a aVar2 = pex0Var.t0;
                    if (!a.b(wu1Var)) {
                        List list3 = aVar2.a;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                if (a.b(((ex1) it.next()).a().O)) {
                                }
                            }
                        }
                    }
                    pex0 pex0Var2 = pex0Var.M0;
                    if (pex0Var2 == null || !pex0Var2.J0.b.a().equals(str)) {
                        pex0 b = aVar2.b(str);
                        if (b != null) {
                            mi31Var = mi31.a(mi31Var, b, null, 30);
                        }
                    } else {
                        mi31Var = mi31.a(mi31Var, pex0Var2, null, 30);
                    }
                }
                arrayList2.add(mi31Var);
            }
            arrayList.add(za31.a(za31Var, arrayList2, null, 5));
        }
        return dk31.a(j, arrayList);
    }
}
