package com.yandex.go.summary.interactor.common.state;

import defpackage.arm0;
import defpackage.bpl0;
import defpackage.elx0;
import defpackage.mex0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.vnx0;
import defpackage.wls;
import defpackage.zvd;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lvnx0;", "<anonymous>", "(Ltse;)Lvnx0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.common.state.SelectorUiStateInteractor$getTariffSelectorUiState$2", f = "SelectorUiStateInteractor.kt", l = {199}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SelectorUiStateInteractor$getTariffSelectorUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<elx0> $tariffs;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorUiStateInteractor$getTariffSelectorUiState$2(List list, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$tariffs = list;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectorUiStateInteractor$getTariffSelectorUiState$2 selectorUiStateInteractor$getTariffSelectorUiState$2 = new SelectorUiStateInteractor$getTariffSelectorUiState$2(this.$tariffs, this.this$0, continuation);
        selectorUiStateInteractor$getTariffSelectorUiState$2.L$0 = obj;
        return selectorUiStateInteractor$getTariffSelectorUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectorUiStateInteractor$getTariffSelectorUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mex0 mex0Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<elx0> list = this.$tariffs;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : list) {
                elx0 elx0Var = (elx0) obj2;
                Pair pair = new Pair(elx0Var.a, elx0Var.b);
                Object obj3 = linkedHashMap.get(pair);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap.put(pair, obj3);
                }
                ((List) obj3).add(obj2);
            }
            c cVar = this.this$0;
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(tje.h(tseVar, null, null, new SelectorUiStateInteractor$getTariffSelectorUiState$2$compoundTariffCellsUiState$2$1((List) ((Map.Entry) it.next()).getValue(), cVar, null), 3));
            }
            this.L$0 = null;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        bpl0 b = com.yandex.go.design.compose.list.a.b(kotlin.collections.a.M((Iterable) obj), new arm0(24));
        Iterator it2 = b.a.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            zvd zvdVar = (zvd) it2.next();
            if (zvdVar.b.a.c || ((mex0Var = zvdVar.a) != null && mex0Var.a.c)) {
                break;
            }
            i2++;
        }
        return new vnx0(i2, b);
    }
}
