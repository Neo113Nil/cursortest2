package com.yandex.go.scooters.insurance.suggest.v2;

import defpackage.c6z;
import defpackage.f9s;
import defpackage.fef;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.xdf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

/* loaded from: classes13.dex */
public final class g {
    public final xdf a;
    public final ru.yandex.taxi.widget.c b;
    public final com.yandex.go.scooters.insurance.data.b c;

    public g(xdf xdfVar, ru.yandex.taxi.widget.c cVar, com.yandex.go.scooters.insurance.data.b bVar) {
        this.a = xdfVar;
        this.b = cVar;
        this.c = bVar;
    }

    public static final Object a(g gVar, FormattedText formattedText, c6z c6zVar, fef fefVar, SuspendLambda suspendLambda) {
        return ru.yandex.taxi.widget.c.e(gVar.b, f9s.c(gVar.a, fefVar, f9s.e(formattedText, c6zVar)), null, false, suspendLambda, 30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00db -> B:10:0x00df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(g gVar, tse tseVar, ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow upsaleWindow, c6z c6zVar, fef fefVar, ContinuationImpl continuationImpl) {
        ScootersInsuranceSuggestV2UiStateMapper$mapToGroups$1 scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1;
        g gVar2;
        int i;
        c6z c6zVar2;
        fef fefVar2;
        Iterator it;
        ArrayList arrayList;
        tse tseVar2;
        gVar.getClass();
        if (continuationImpl instanceof ScootersInsuranceSuggestV2UiStateMapper$mapToGroups$1) {
            scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1 = (ScootersInsuranceSuggestV2UiStateMapper$mapToGroups$1) continuationImpl;
            int i2 = scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.label = i2 - Integer.MIN_VALUE;
                gVar2 = gVar;
                Object obj = scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = upsaleWindow.d;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                    c6zVar2 = c6zVar;
                    fefVar2 = fefVar;
                    it = list.iterator();
                    arrayList = arrayList2;
                    tseVar2 = tseVar;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Collection collection = (Collection) scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.L$10;
                    Iterator it2 = (Iterator) scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.L$7;
                    ?? r5 = (Collection) scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.L$6;
                    fefVar2 = (fef) scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.L$3;
                    c6z c6zVar3 = (c6z) scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.L$2;
                    tse tseVar3 = (tse) scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.L$0;
                    kotlin.b.b(obj);
                    it = it2;
                    ArrayList arrayList3 = r5;
                    c6zVar2 = c6zVar3;
                    collection.add((List) obj);
                    tseVar2 = tseVar3;
                    arrayList = arrayList3;
                    gVar2 = gVar;
                    if (it.hasNext()) {
                        List list2 = (List) it.next();
                        ArrayList arrayList4 = new ArrayList(tcc.n(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(tje.h(tseVar2, null, null, new ScootersInsuranceSuggestV2UiStateMapper$mapToGroups$2$1$1(gVar2, (ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item) it3.next(), c6zVar2, fefVar2, null), 3));
                            gVar2 = gVar;
                        }
                        scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.L$0 = tseVar2;
                        scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.L$1 = null;
                        scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.L$2 = c6zVar2;
                        scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.L$3 = fefVar2;
                        scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.L$4 = null;
                        scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.L$5 = null;
                        scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.L$6 = arrayList;
                        scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.L$7 = it;
                        scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.L$8 = null;
                        scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.L$9 = null;
                        scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.L$10 = arrayList;
                        scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.label = 1;
                        Object b = kotlinx.coroutines.a.b(arrayList4, scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        arrayList3 = arrayList;
                        tseVar3 = tseVar2;
                        obj = b;
                        collection = arrayList3;
                        collection.add((List) obj);
                        tseVar2 = tseVar3;
                        arrayList = arrayList3;
                        gVar2 = gVar;
                        if (it.hasNext()) {
                            return arrayList;
                        }
                    }
                }
            }
        }
        gVar2 = gVar;
        scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1 = new ScootersInsuranceSuggestV2UiStateMapper$mapToGroups$1(gVar2, continuationImpl);
        Object obj2 = scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceSuggestV2UiStateMapper$mapToGroups$1.label;
        if (i != 0) {
        }
    }
}
