package com.yandex.div.core.view2.animations;

import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivContainer;
import com.yandex.div2.a;
import com.yandex.div2.g3;
import com.yandex.div2.j3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ikn;
import xsna.j5g;

/* compiled from: DivComparator.kt */
/* loaded from: classes7.dex */
public final class DivComparator {
    public static final DivComparator INSTANCE = new DivComparator();

    private DivComparator() {
    }

    public static /* synthetic */ boolean areChildrenReplaceable$default(DivComparator divComparator, List list, List list2, DivComparatorReporter divComparatorReporter, int i, Object obj) {
        if ((i & 4) != 0) {
            divComparatorReporter = null;
        }
        return divComparator.areChildrenReplaceable(list, list2, divComparatorReporter);
    }

    public static /* synthetic */ boolean areDivsReplaceable$default(DivComparator divComparator, a aVar, a aVar2, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, DivComparatorReporter divComparatorReporter, int i, Object obj) {
        if ((i & 16) != 0) {
            divComparatorReporter = null;
        }
        return divComparator.areDivsReplaceable(aVar, aVar2, expressionResolver, expressionResolver2, divComparatorReporter);
    }

    public static /* synthetic */ boolean areValuesReplaceable$default(DivComparator divComparator, ikn iknVar, ikn iknVar2, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, DivComparatorReporter divComparatorReporter, int i, Object obj) {
        if ((i & 16) != 0) {
            divComparatorReporter = null;
        }
        return divComparator.areValuesReplaceable(iknVar, iknVar2, expressionResolver, expressionResolver2, divComparatorReporter);
    }

    private final List<DivItemBuilderResult> extractChildren(a aVar, ExpressionResolver expressionResolver) {
        if (aVar instanceof a.C2110a) {
            return DivCollectionExtensionsKt.buildItems(((a.C2110a) aVar).c, expressionResolver);
        }
        if (aVar instanceof a.e) {
            return DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((a.e) aVar).c, expressionResolver);
        }
        if (aVar instanceof a.f) {
            return EmptyList.b;
        }
        if (aVar instanceof a.d) {
            return EmptyList.b;
        }
        if (aVar instanceof a.p) {
            return EmptyList.b;
        }
        if (aVar instanceof a.k) {
            return EmptyList.b;
        }
        if (aVar instanceof a.c) {
            return EmptyList.b;
        }
        if (aVar instanceof a.i) {
            return EmptyList.b;
        }
        if (aVar instanceof a.o) {
            return EmptyList.b;
        }
        if (aVar instanceof a.m) {
            return EmptyList.b;
        }
        if (aVar instanceof a.b) {
            return EmptyList.b;
        }
        if (aVar instanceof a.h) {
            return EmptyList.b;
        }
        if (aVar instanceof a.j) {
            return EmptyList.b;
        }
        if (aVar instanceof a.g) {
            return EmptyList.b;
        }
        if (aVar instanceof a.l) {
            return EmptyList.b;
        }
        if (aVar instanceof a.q) {
            return EmptyList.b;
        }
        if (aVar instanceof a.n) {
            return EmptyList.b;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean hasTransitions(ikn iknVar) {
        return (iknVar.q() == null && iknVar.k() == null && iknVar.t() == null) ? false : true;
    }

    private final boolean isOverlap(DivContainer divContainer, ExpressionResolver expressionResolver) {
        return divContainer.I.evaluate(expressionResolver) == DivContainer.Orientation.OVERLAP;
    }

    public final boolean areChildrenReplaceable(List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2, DivComparatorReporter divComparatorReporter) {
        if (list.size() == list2.size()) {
            ArrayList X0 = j5g.X0(list, list2);
            if (X0.isEmpty()) {
                return true;
            }
            Iterator it = X0.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                DivComparatorReporter divComparatorReporter2 = divComparatorReporter;
                if (INSTANCE.areDivsReplaceable(((DivItemBuilderResult) pair.i()).getDiv(), ((DivItemBuilderResult) pair.j()).getDiv(), ((DivItemBuilderResult) pair.i()).getExpressionResolver(), ((DivItemBuilderResult) pair.j()).getExpressionResolver(), divComparatorReporter2)) {
                    divComparatorReporter = divComparatorReporter2;
                }
            }
            return true;
        }
        if (divComparatorReporter != null) {
            divComparatorReporter.onComparisonDifferentChildCount();
            return false;
        }
        return false;
    }

    public final boolean areDivsReplaceable(a aVar, a aVar2, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, DivComparatorReporter divComparatorReporter) {
        if (!epx.f(aVar != null ? aVar.getClass() : null, aVar2 != null ? aVar2.getClass() : null)) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonDifferentClasses();
            }
            return false;
        }
        if (aVar == null || aVar2 == null || aVar == aVar2) {
            return true;
        }
        return areValuesReplaceable(aVar.b(), aVar2.b(), expressionResolver, expressionResolver2, divComparatorReporter) && areChildrenReplaceable(extractChildren(aVar, expressionResolver), extractChildren(aVar2, expressionResolver2), divComparatorReporter);
    }

    public final boolean areValuesReplaceable(ikn iknVar, ikn iknVar2, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, DivComparatorReporter divComparatorReporter) {
        if (iknVar.getId() == null || iknVar2.getId() == null || epx.f(iknVar.getId(), iknVar2.getId()) || !(hasTransitions(iknVar) || hasTransitions(iknVar2))) {
            if ((iknVar instanceof g3) && (iknVar2 instanceof g3) && !epx.f(((g3) iknVar).j, ((g3) iknVar2).j)) {
                if (divComparatorReporter != null) {
                    divComparatorReporter.onComparisonDifferentCustomTypes();
                    return false;
                }
            } else {
                if (!(iknVar instanceof DivContainer) || !(iknVar2 instanceof DivContainer)) {
                    return true;
                }
                DivContainer divContainer = (DivContainer) iknVar;
                DivContainer divContainer2 = (DivContainer) iknVar2;
                if (isOverlap(divContainer, expressionResolver) != isOverlap(divContainer2, expressionResolver2)) {
                    if (divComparatorReporter != null) {
                        divComparatorReporter.onComparisonDifferentOverlap();
                        return false;
                    }
                } else {
                    if (DivUtilKt.isWrapContainer(divContainer, expressionResolver) == DivUtilKt.isWrapContainer(divContainer2, expressionResolver2)) {
                        return true;
                    }
                    if (divComparatorReporter != null) {
                        divComparatorReporter.onComparisonDifferentWrap();
                    }
                }
            }
        } else if (divComparatorReporter != null) {
            divComparatorReporter.onComparisonDifferentIdsWithTransition();
            return false;
        }
        return false;
    }

    public final boolean isDivDataReplaceable(j3 j3Var, j3 j3Var2, long j, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, DivComparatorReporter divComparatorReporter) {
        Object obj;
        Object obj2;
        if (j3Var == null) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonNoOldData();
            }
            return false;
        }
        Iterator<T> it = j3Var.c.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((j3.b) obj2).b == j) {
                break;
            }
        }
        j3.b bVar = (j3.b) obj2;
        Iterator<T> it2 = j3Var2.c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((j3.b) next).b == j) {
                obj = next;
                break;
            }
        }
        j3.b bVar2 = (j3.b) obj;
        if (bVar == null || bVar2 == null) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonNoState();
            }
            return false;
        }
        boolean areDivsReplaceable = areDivsReplaceable(bVar.a, bVar2.a, expressionResolver, expressionResolver2, divComparatorReporter);
        if (areDivsReplaceable && divComparatorReporter != null) {
            divComparatorReporter.onComparisonSuccess();
        }
        return areDivsReplaceable;
    }
}
