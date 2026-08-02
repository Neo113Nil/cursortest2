package com.yandex.go.tariffcard.interactor;

import com.yandex.go.tariffcard.experiment.EtaMulticlassHighlightingExperiment;
import defpackage.evu0;
import defpackage.fnx0;
import defpackage.gw00;
import defpackage.iq40;
import defpackage.is60;
import defpackage.m1b1;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qqo;
import defpackage.tcc;
import defpackage.zls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfnx0;", "selectedTariff", "", "Lcom/yandex/go/tariffcard/repository/Offer;", "showHighlightingEtaOffer", "", "Lnco;", "<anonymous>", "(Lfnx0;Ljava/lang/String;)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.interactor.MulticlassTariffsEtaUiStateInteractor$getEtaUiStatesFlow$1", f = "MulticlassTariffsEtaUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MulticlassTariffsEtaUiStateInteractor$getEtaUiStatesFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticlassTariffsEtaUiStateInteractor$getEtaUiStatesFlow$1(g gVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MulticlassTariffsEtaUiStateInteractor$getEtaUiStatesFlow$1 multiclassTariffsEtaUiStateInteractor$getEtaUiStatesFlow$1 = new MulticlassTariffsEtaUiStateInteractor$getEtaUiStatesFlow$1(this.this$0, (Continuation) obj3);
        multiclassTariffsEtaUiStateInteractor$getEtaUiStatesFlow$1.L$0 = (fnx0) obj;
        multiclassTariffsEtaUiStateInteractor$getEtaUiStatesFlow$1.L$1 = (String) obj2;
        return multiclassTariffsEtaUiStateInteractor$getEtaUiStatesFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fnx0 fnx0Var = (fnx0) this.L$0;
        String str = (String) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!fnx0Var.c.K0 || !((Boolean) ((qqo) this.this$0.e.getValue()).b()).booleanValue()) {
            return kotlin.collections.b.f();
        }
        pex0 pex0Var = fnx0Var.c;
        is60 is60Var = pex0Var.J0.b;
        List<pex0> list = pex0Var.U;
        if (list == null) {
            list = EmptyList.a;
        }
        boolean z = false;
        boolean z2 = is60Var.b && str != null && !evu0.J(str) && str.equals(is60Var.a());
        EtaMulticlassHighlightingExperiment etaMulticlassHighlightingExperiment = (EtaMulticlassHighlightingExperiment) this.this$0.b.a.b();
        if (etaMulticlassHighlightingExperiment.b && z2) {
            z = true;
        }
        Set a = this.this$0.c.a(fnx0Var.d);
        if (z) {
            iq40 iq40Var = this.this$0.d;
            mi31 mi31Var = fnx0Var.a;
            iq40Var.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (pex0 pex0Var2 : list) {
                String str3 = iq40Var.a(mi31Var, pex0Var2).a ? pex0Var2.b : null;
                if (str3 != null) {
                    linkedHashSet.add(str3);
                }
            }
            str2 = m1b1.c(list, linkedHashSet, a, etaMulticlassHighlightingExperiment.c);
        }
        List<pex0> list2 = list;
        int d = gw00.d(tcc.n(list2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (pex0 pex0Var3 : list2) {
            Pair pair = new Pair(pex0Var3.b, m1b1.b(pex0Var3, true, etaMulticlassHighlightingExperiment.b, str2));
            linkedHashMap.put(pair.c(), pair.f());
        }
        return linkedHashMap;
    }
}
