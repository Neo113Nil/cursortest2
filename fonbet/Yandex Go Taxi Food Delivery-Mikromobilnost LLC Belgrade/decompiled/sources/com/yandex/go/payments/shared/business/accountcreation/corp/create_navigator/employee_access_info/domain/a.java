package com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.employee_access_info.domain;

import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
import defpackage.bvf0;
import defpackage.mth;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.wte;
import defpackage.yt11;
import defpackage.yte;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final class a implements yt11 {
    public final c a;
    public final r0 b;
    public final mth c;

    public a(c cVar) {
        this.a = cVar;
        r0 c = bvf0.c(null);
        this.b = c;
        this.c = new mth(c, 6);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(wte wteVar, ContinuationImpl continuationImpl) {
        CorpAccountEmployeeAccessInfoUiStateInteractor$acceptData$1 corpAccountEmployeeAccessInfoUiStateInteractor$acceptData$1;
        int i;
        pz40 pz40Var;
        if (continuationImpl instanceof CorpAccountEmployeeAccessInfoUiStateInteractor$acceptData$1) {
            corpAccountEmployeeAccessInfoUiStateInteractor$acceptData$1 = (CorpAccountEmployeeAccessInfoUiStateInteractor$acceptData$1) continuationImpl;
            int i2 = corpAccountEmployeeAccessInfoUiStateInteractor$acceptData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                corpAccountEmployeeAccessInfoUiStateInteractor$acceptData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = corpAccountEmployeeAccessInfoUiStateInteractor$acceptData$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = corpAccountEmployeeAccessInfoUiStateInteractor$acceptData$1.label;
                if (i != 0) {
                    b.b(obj);
                    corpAccountEmployeeAccessInfoUiStateInteractor$acceptData$1.L$0 = null;
                    r0 r0Var = this.b;
                    corpAccountEmployeeAccessInfoUiStateInteractor$acceptData$1.L$1 = r0Var;
                    corpAccountEmployeeAccessInfoUiStateInteractor$acceptData$1.label = 1;
                    Object c = c(wteVar, corpAccountEmployeeAccessInfoUiStateInteractor$acceptData$1);
                    if (c == obj2) {
                        return obj2;
                    }
                    obj = c;
                    pz40Var = r0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pz40Var = (pz40) corpAccountEmployeeAccessInfoUiStateInteractor$acceptData$1.L$1;
                    b.b(obj);
                }
                ((r0) pz40Var).l(obj);
                return zy11.a;
            }
        }
        corpAccountEmployeeAccessInfoUiStateInteractor$acceptData$1 = new CorpAccountEmployeeAccessInfoUiStateInteractor$acceptData$1(this, continuationImpl);
        Object obj3 = corpAccountEmployeeAccessInfoUiStateInteractor$acceptData$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = corpAccountEmployeeAccessInfoUiStateInteractor$acceptData$1.label;
        if (i != 0) {
        }
        ((r0) pz40Var).l(obj3);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00a2 -> B:10:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(wte wteVar, ContinuationImpl continuationImpl) {
        CorpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1 corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1;
        int i;
        Collection arrayList;
        Iterator it;
        Map map;
        CorpAccountFlowExperiment.CorpCreationNavigatorModalDto.EmployeeAccessInfoModalDto employeeAccessInfoModalDto;
        if (continuationImpl instanceof CorpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1) {
            corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1 = (CorpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1) continuationImpl;
            int i2 = corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.label;
                if (i != 0) {
                    b.b(obj);
                    CorpAccountFlowExperiment.CorpCreationNavigatorModalDto.EmployeeAccessInfoModalDto employeeAccessInfoModalDto2 = wteVar.a;
                    Map map2 = wteVar.b;
                    List list = employeeAccessInfoModalDto2.c;
                    arrayList = new ArrayList(tcc.n(list, 10));
                    it = list.iterator();
                    map = map2;
                    employeeAccessInfoModalDto = employeeAccessInfoModalDto2;
                    r1 = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Collection collection = (Collection) corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.L$9;
                    it = (Iterator) corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.L$6;
                    arrayList = (Collection) corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.L$5;
                    map = (Map) corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.L$2;
                    employeeAccessInfoModalDto = (CorpAccountFlowExperiment.CorpCreationNavigatorModalDto.EmployeeAccessInfoModalDto) corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.L$1;
                    b.b(obj);
                    collection.add((CharSequence) obj);
                    collection = arrayList;
                    if (it.hasNext()) {
                        FormattedText formattedText = (FormattedText) it.next();
                        corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.L$0 = null;
                        corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.L$1 = employeeAccessInfoModalDto;
                        corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.L$2 = map;
                        corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.L$3 = null;
                        corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.L$4 = null;
                        corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.L$5 = collection;
                        corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.L$6 = it;
                        corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.L$7 = null;
                        corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.L$8 = null;
                        corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.L$9 = collection;
                        corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.label = 1;
                        obj = c.i(this.a, formattedText, map, corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1, 28);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        arrayList = collection;
                        collection.add((CharSequence) obj);
                        collection = arrayList;
                        if (it.hasNext()) {
                            return new yte((String) map.get(employeeAccessInfoModalDto.a), (String) map.get(employeeAccessInfoModalDto.b), (String) map.get(employeeAccessInfoModalDto.d), (String) map.get(employeeAccessInfoModalDto.e), (List) collection);
                        }
                    }
                }
            }
        }
        corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1 = new CorpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1(this, continuationImpl);
        Object obj2 = corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = corpAccountEmployeeAccessInfoUiStateInteractor$createUiState$1.label;
        if (i != 0) {
        }
    }
}
