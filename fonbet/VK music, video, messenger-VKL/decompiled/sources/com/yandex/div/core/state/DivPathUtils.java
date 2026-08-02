package com.yandex.div.core.state;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.local.ChildPathUnitCache;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTabs;
import com.yandex.div2.a;
import com.yandex.div2.j3;
import com.yandex.div2.ma;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.gzs;
import xsna.ikn;
import xsna.izs;
import xsna.j5g;
import xsna.kxt0;
import xsna.s3q0;

/* compiled from: DivPathUtils.kt */
/* loaded from: classes7.dex */
public final class DivPathUtils {
    public static final DivPathUtils INSTANCE = new DivPathUtils();

    private DivPathUtils() {
    }

    private final a findByPath(a aVar, String str, ExpressionResolver expressionResolver) {
        if (aVar instanceof a.m) {
            a.m mVar = (a.m) aVar;
            if (!epx.f(getId$div_release$default(INSTANCE, mVar.c, null, 1, null), str)) {
                aVar = null;
            }
            a.m mVar2 = (a.m) aVar;
            return mVar2 != null ? mVar2 : findRecursively(mVar.c.I, str, expressionResolver, new izs<ma.a, a>() { // from class: com.yandex.div.core.state.DivPathUtils$findByPath$2
                @Override // xsna.izs
                public final a invoke(ma.a aVar2) {
                    return aVar2.c;
                }
            });
        }
        if (aVar instanceof a.o) {
            return findRecursively(((a.o) aVar).c.q, str, expressionResolver, new izs<DivTabs.a, a>() { // from class: com.yandex.div.core.state.DivPathUtils$findByPath$3
                @Override // xsna.izs
                public final a invoke(DivTabs.a aVar2) {
                    return aVar2.a;
                }
            });
        }
        if (aVar instanceof a.C2110a) {
            return findRecursively(DivCollectionExtensionsKt.buildItems(((a.C2110a) aVar).c, expressionResolver), str);
        }
        if (aVar instanceof a.e) {
            return findRecursively$default(this, DivCollectionExtensionsKt.getNonNullItems(((a.e) aVar).c), str, expressionResolver, null, 4, null);
        }
        if (aVar instanceof a.c) {
            return findRecursively(DivCollectionExtensionsKt.buildItems(((a.c) aVar).c, expressionResolver), str);
        }
        if (aVar instanceof a.i) {
            return findRecursively(DivCollectionExtensionsKt.buildItems(((a.i) aVar).c, expressionResolver), str);
        }
        if (aVar instanceof a.b) {
            List<a> list = ((a.b) aVar).c.q;
            if (list != null) {
                return findRecursively$default(this, list, str, expressionResolver, null, 4, null);
            }
            return null;
        }
        if ((aVar instanceof a.p) || (aVar instanceof a.f) || (aVar instanceof a.l) || (aVar instanceof a.h) || (aVar instanceof a.d) || (aVar instanceof a.g) || (aVar instanceof a.k) || (aVar instanceof a.j) || (aVar instanceof a.q) || (aVar instanceof a.n)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final <T> a findRecursively(Iterable<? extends T> iterable, String str, ExpressionResolver expressionResolver, izs<? super T, ? extends a> izsVar) {
        a aVar;
        Iterator<? extends T> it = iterable.iterator();
        do {
            aVar = null;
            if (!it.hasNext()) {
                break;
            }
            a invoke = izsVar.invoke(it.next());
            if (invoke != null) {
                aVar = INSTANCE.findByPath(invoke, str, expressionResolver);
            }
        } while (aVar == null);
        return aVar;
    }

    public static /* synthetic */ a findRecursively$default(DivPathUtils divPathUtils, Iterable iterable, String str, ExpressionResolver expressionResolver, izs izsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            izsVar = new izs() { // from class: com.yandex.div.core.state.DivPathUtils$findRecursively$1
                @Override // xsna.izs
                public final a invoke(Object obj2) {
                    return (a) obj2;
                }
            };
        }
        return divPathUtils.findRecursively(iterable, str, expressionResolver, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String getId$div_release$default(DivPathUtils divPathUtils, ma maVar, gzs gzsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gzsVar = null;
        }
        return divPathUtils.getId$div_release(maVar, gzsVar);
    }

    public static /* synthetic */ List getIds$default(DivPathUtils divPathUtils, List list, izs izsVar, izs izsVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            izsVar2 = new izs() { // from class: com.yandex.div.core.state.DivPathUtils$getIds$2
                @Override // xsna.izs
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        return divPathUtils.getIds(list, izsVar, izsVar2);
    }

    private final boolean lastStateEquals(DivStatePath divStatePath, DivStatePath divStatePath2) {
        DivStatePath parentState;
        if (divStatePath2.getContainsOnlyStates$div_release()) {
            return epx.f(divStatePath != null ? divStatePath.getPathToLastState() : null, divStatePath2.getPathToLastState());
        }
        if (divStatePath != null && (parentState = divStatePath.parentState()) != null) {
            r1 = parentState.getFullPath$div_release();
        }
        return epx.f(r1, divStatePath2.parentState().getFullPath$div_release());
    }

    public final List<DivStatePath> compactPathList$div_release(List<DivStatePath> list) {
        List list2;
        if (list.isEmpty()) {
            return list;
        }
        List D0 = j5g.D0(DivStatePath.Companion.alphabeticalComparator$div_release(), list);
        List<DivStatePath> list3 = D0;
        Object Y = j5g.Y(D0);
        int u = c5g.u(list3, 9);
        if (u == 0) {
            list2 = Collections.singletonList(Y);
        } else {
            ArrayList arrayList = new ArrayList(u + 1);
            arrayList.add(Y);
            Object obj = Y;
            for (DivStatePath divStatePath : list3) {
                DivStatePath divStatePath2 = (DivStatePath) obj;
                if (!divStatePath2.isAncestorOf(divStatePath)) {
                    divStatePath2 = divStatePath;
                }
                arrayList.add(divStatePath2);
                obj = divStatePath2;
            }
            list2 = arrayList;
        }
        return j5g.R(list2);
    }

    public final a findDivState$div_release(a aVar, DivStatePath divStatePath, ExpressionResolver expressionResolver) {
        List<Pair<String, String>> states = divStatePath.getStates();
        if (states.isEmpty()) {
            return null;
        }
        Iterator<T> it = states.iterator();
        while (it.hasNext()) {
            String str = (String) ((Pair) it.next()).d();
            if (aVar == null || (aVar = INSTANCE.findByPath(aVar, str, expressionResolver)) == null) {
                return null;
            }
        }
        return aVar;
    }

    public final DivStateLayout findStateLayout$div_release(View view, DivStatePath divStatePath) throws StateConflictException {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof DivStateLayout) {
            DivStateLayout divStateLayout = (DivStateLayout) view;
            if (lastStateEquals(divStateLayout.getPath(), divStatePath)) {
                return divStateLayout;
            }
        }
        kxt0 kxt0Var = new kxt0((ViewGroup) view);
        DivStateLayout divStateLayout2 = null;
        while (kxt0Var.hasNext()) {
            DivStateLayout findStateLayout$div_release = findStateLayout$div_release(kxt0Var.next(), divStatePath);
            if (findStateLayout$div_release != null) {
                if (String.valueOf(divStateLayout2 != null ? divStateLayout2.getPath() : null).equals(String.valueOf(findStateLayout$div_release.getPath()))) {
                    throw new StateConflictException("Error resolving state for '" + divStatePath + "'. Found multiple elements that respond to path '" + findStateLayout$div_release.getPath() + "'!", null, 2, null);
                }
                divStateLayout2 = findStateLayout$div_release;
            }
        }
        return divStateLayout2;
    }

    public final String getId(a aVar) {
        ikn b = aVar.b();
        return b instanceof ma ? getId$div_release$default(INSTANCE, (ma) b, null, 1, null) : b.getId();
    }

    public final String getId$div_release(ma maVar, gzs<s3q0> gzsVar) {
        String str = maVar.p;
        if (str != null) {
            return str;
        }
        String str2 = maVar.x;
        if (str2 != null) {
            return str2;
        }
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        return "";
    }

    public final List<String> getIds(List<? extends a> list) {
        return getIds$default(this, list, new izs<a, a>() { // from class: com.yandex.div.core.state.DivPathUtils$getIds$1
            @Override // xsna.izs
            public final a invoke(a aVar) {
                return aVar;
            }
        }, null, 2, null);
    }

    public final List<String> getItemIds(List<DivItemBuilderResult> list) {
        return getIds(list, new izs<DivItemBuilderResult, a>() { // from class: com.yandex.div.core.state.DivPathUtils$getItemIds$1
            @Override // xsna.izs
            public final a invoke(DivItemBuilderResult divItemBuilderResult) {
                return divItemBuilderResult.getDiv();
            }
        }, new izs<DivItemBuilderResult, ExpressionResolverImpl>() { // from class: com.yandex.div.core.state.DivPathUtils$getItemIds$2
            @Override // xsna.izs
            public final ExpressionResolverImpl invoke(DivItemBuilderResult divItemBuilderResult) {
                return UtilsKt.getAsImpl(divItemBuilderResult.getExpressionResolver());
            }
        });
    }

    public final Pair<DivStateLayout, a.m> tryFindStateDivAndLayout$div_release(View view, j3.b bVar, DivStatePath divStatePath, ExpressionResolver expressionResolver) throws StateConflictException {
        a.m mVar;
        DivStateLayout findStateLayout$div_release = findStateLayout$div_release(view, divStatePath);
        if (findStateLayout$div_release == null) {
            DivStatePath parentState = divStatePath.parentState();
            if ((parentState.isRootPath() && bVar.b == divStatePath.getTopLevelStateId()) || findStateLayout$div_release(view, parentState) == null) {
                return null;
            }
        }
        if (findStateLayout$div_release == null || (mVar = findStateLayout$div_release.getDiv()) == null) {
            a findDivState$div_release = findDivState$div_release(bVar.a, divStatePath, expressionResolver);
            mVar = findDivState$div_release instanceof a.m ? (a.m) findDivState$div_release : null;
            if (mVar == null) {
                return null;
            }
        }
        return new Pair<>(findStateLayout$div_release, mVar);
    }

    private final a findRecursively(Iterable<DivItemBuilderResult> iterable, String str) {
        for (DivItemBuilderResult divItemBuilderResult : iterable) {
            a findByPath = INSTANCE.findByPath(divItemBuilderResult.component1(), str, divItemBuilderResult.component2());
            if (findByPath != null) {
                return findByPath;
            }
        }
        return null;
    }

    public final <T> List<String> getIds(List<? extends T> list, izs<? super T, ? extends a> izsVar, izs<? super T, ExpressionResolverImpl> izsVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<? extends T> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String id = INSTANCE.getId(izsVar.invoke(it.next()));
            if (id != null) {
                Integer num = (Integer) linkedHashMap.get(id);
                linkedHashMap.put(id, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
        }
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        int i = 0;
        for (T t : list2) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            String id2 = INSTANCE.getId(izsVar.invoke(t));
            if (id2 != null) {
                Integer num2 = (Integer) linkedHashMap.get(id2);
                if ((num2 != null ? num2.intValue() : 0) > 1) {
                    id2 = id2 + '#' + i;
                }
                if (id2 != null) {
                    arrayList.add(id2);
                    i = i2;
                }
            }
            ExpressionResolverImpl invoke = izsVar2.invoke(t);
            String itemBuilderData = invoke != null ? invoke.getItemBuilderData() : null;
            id2 = itemBuilderData == null ? ChildPathUnitCache.INSTANCE.getValue$div_release(i) : itemBuilderData;
            arrayList.add(id2);
            i = i2;
        }
        return arrayList;
    }
}
