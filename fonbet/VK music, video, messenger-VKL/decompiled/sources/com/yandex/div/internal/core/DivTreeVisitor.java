package com.yandex.div.internal.core;

import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivTabs;
import com.yandex.div2.a;
import com.yandex.div2.ma;
import com.yandex.div2.o2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.c5g;
import xsna.e43;
import xsna.izs;
import xsna.zcl;

/* compiled from: DivTreeVisitor.kt */
/* loaded from: classes7.dex */
public abstract class DivTreeVisitor<T> {
    private final izs<T, Boolean> returnCondition;

    /* JADX WARN: Multi-variable type inference failed */
    public DivTreeVisitor(izs<? super T, Boolean> izsVar) {
        this.returnCondition = izsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object defaultVisitCollection$default(DivTreeVisitor divTreeVisitor, a aVar, BindingContext bindingContext, DivStatePath divStatePath, List list, o2 o2Var, List list2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultVisitCollection");
        }
        if ((i & 16) != 0) {
            o2Var = null;
        }
        if ((i & 32) != 0) {
            list2 = null;
        }
        return divTreeVisitor.defaultVisitCollection(aVar, bindingContext, divStatePath, list, o2Var, list2);
    }

    public abstract T defaultVisit(a aVar, BindingContext bindingContext, DivStatePath divStatePath);

    public T defaultVisitCollection(a aVar, BindingContext bindingContext, DivStatePath divStatePath, List<? extends a> list, o2 o2Var, List<DivStatePath> list2) {
        List<String> ids;
        DivStatePath appendDiv;
        T defaultVisit = defaultVisit(aVar, bindingContext, divStatePath);
        izs<T, Boolean> izsVar = this.returnCondition;
        if (izsVar != null && izsVar.invoke(defaultVisit).booleanValue()) {
            return defaultVisit;
        }
        if (o2Var != null) {
            return visit(o2Var, bindingContext, divStatePath, defaultVisit);
        }
        if (list != null && (ids = DivPathUtils.INSTANCE.getIds(list)) != null) {
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                a aVar2 = (a) t;
                if (list2 == null || (appendDiv = list2.get(i)) == null) {
                    appendDiv = divStatePath.appendDiv(ids.get(i));
                }
                T visitCollectionChild = visitCollectionChild(aVar2, bindingContext, appendDiv, defaultVisit);
                izs<T, Boolean> izsVar2 = this.returnCondition;
                if (izsVar2 != null && izsVar2.invoke(visitCollectionChild).booleanValue()) {
                    return visitCollectionChild;
                }
                i = i2;
            }
        }
        return defaultVisit;
    }

    public final T visit(a aVar, BindingContext bindingContext, DivStatePath divStatePath) {
        BindingContext childContext = DivTreeVisitorKt.getChildContext(bindingContext, aVar, divStatePath);
        if (aVar instanceof a.p) {
            return visit((a.p) aVar, childContext, divStatePath);
        }
        if (aVar instanceof a.f) {
            return visit((a.f) aVar, childContext, divStatePath);
        }
        if (aVar instanceof a.d) {
            return visit((a.d) aVar, childContext, divStatePath);
        }
        if (aVar instanceof a.k) {
            return visit((a.k) aVar, childContext, divStatePath);
        }
        if (aVar instanceof a.C2110a) {
            return visit((a.C2110a) aVar, childContext, divStatePath);
        }
        if (aVar instanceof a.e) {
            return visit((a.e) aVar, childContext, divStatePath);
        }
        if (aVar instanceof a.c) {
            return visit((a.c) aVar, childContext, divStatePath);
        }
        if (aVar instanceof a.i) {
            return visit((a.i) aVar, childContext, divStatePath);
        }
        if (aVar instanceof a.o) {
            return visit((a.o) aVar, childContext, divStatePath);
        }
        if (aVar instanceof a.m) {
            return visit((a.m) aVar, childContext, divStatePath);
        }
        if (aVar instanceof a.b) {
            return visit((a.b) aVar, childContext, divStatePath);
        }
        if (aVar instanceof a.g) {
            return visit((a.g) aVar, childContext, divStatePath);
        }
        if (aVar instanceof a.l) {
            return visit((a.l) aVar, childContext, divStatePath);
        }
        if (aVar instanceof a.h) {
            return visit((a.h) aVar, childContext, divStatePath);
        }
        if (aVar instanceof a.j) {
            return visit((a.j) aVar, childContext, divStatePath);
        }
        if (aVar instanceof a.q) {
            return visit((a.q) aVar, childContext, divStatePath);
        }
        if (aVar instanceof a.n) {
            return visit((a.n) aVar, childContext, divStatePath);
        }
        throw new NoWhenBranchMatchedException();
    }

    public T visitCollectionChild(a aVar, BindingContext bindingContext, DivStatePath divStatePath, T t) {
        return visit(aVar, bindingContext, divStatePath);
    }

    public /* synthetic */ DivTreeVisitor(izs izsVar, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : izsVar);
    }

    public T visit(a.C2110a c2110a, BindingContext bindingContext, DivStatePath divStatePath) {
        DivContainer divContainer = c2110a.c;
        return (T) defaultVisitCollection$default(this, c2110a, bindingContext, divStatePath, divContainer.B, divContainer.z, null, 32, null);
    }

    public T visit(a.e eVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return (T) defaultVisitCollection$default(this, eVar, bindingContext, divStatePath, eVar.c.y, null, null, 48, null);
    }

    public T visit(a.c cVar, BindingContext bindingContext, DivStatePath divStatePath) {
        DivGallery divGallery = cVar.c;
        return (T) defaultVisitCollection$default(this, cVar, bindingContext, divStatePath, divGallery.u, divGallery.s, null, 32, null);
    }

    public T visit(a.i iVar, BindingContext bindingContext, DivStatePath divStatePath) {
        DivPager divPager = iVar.c;
        return (T) defaultVisitCollection$default(this, iVar, bindingContext, divStatePath, divPager.t, divPager.r, null, 32, null);
    }

    public T visit(a.o oVar, BindingContext bindingContext, DivStatePath divStatePath) {
        List<DivTabs.a> list = oVar.c.q;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DivTabs.a) it.next()).a);
        }
        return (T) defaultVisitCollection$default(this, oVar, bindingContext, divStatePath, arrayList, null, null, 48, null);
    }

    public T visit(a.b bVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return (T) defaultVisitCollection$default(this, bVar, bindingContext, divStatePath, bVar.c.q, null, null, 48, null);
    }

    private final T visit(o2 o2Var, BindingContext bindingContext, DivStatePath divStatePath, T t) {
        ExpressionResolver expressionResolver;
        List<DivItemBuilderResult> build = DivCollectionExtensionsKt.build(o2Var, bindingContext.getExpressionResolver());
        List<String> itemIds = DivPathUtils.INSTANCE.getItemIds(build);
        int i = 0;
        for (T t2 : build) {
            int i2 = i + 1;
            if (i >= 0) {
                DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) t2;
                DivStatePath appendDiv = divStatePath.appendDiv(itemIds.get(i));
                ExpressionsRuntime resolveRuntimeWith = bindingContext.getDivView().getRuntimeStore$div_release().resolveRuntimeWith(bindingContext.getDivView(), appendDiv, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver(), bindingContext.getExpressionResolver());
                if (resolveRuntimeWith == null || (expressionResolver = resolveRuntimeWith.getExpressionResolver()) == null) {
                    expressionResolver = divItemBuilderResult.getExpressionResolver();
                }
                T visitCollectionChild = visitCollectionChild(divItemBuilderResult.getDiv(), new BindingContext(bindingContext.getDivView(), expressionResolver), appendDiv, t);
                izs<T, Boolean> izsVar = this.returnCondition;
                if (izsVar != null && izsVar.invoke(visitCollectionChild).booleanValue()) {
                    return visitCollectionChild;
                }
                i = i2;
            } else {
                e43.t();
                throw null;
            }
        }
        return t;
    }

    public T visit(a.m mVar, BindingContext bindingContext, DivStatePath divStatePath) {
        String id$div_release$default = DivPathUtils.getId$div_release$default(DivPathUtils.INSTANCE, mVar.c, null, 1, null);
        ma maVar = mVar.c;
        List<ma.a> list = maVar.I;
        ArrayList arrayList = new ArrayList();
        for (ma.a aVar : list) {
            DivStatePath append$div_release = aVar.c == null ? null : divStatePath.append$div_release(id$div_release$default, aVar, aVar.d);
            if (append$div_release != null) {
                arrayList.add(append$div_release);
            }
        }
        List<ma.a> list2 = maVar.I;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            a aVar2 = ((ma.a) it.next()).c;
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        return defaultVisitCollection(mVar, bindingContext, divStatePath, arrayList2, null, arrayList);
    }

    public T visit(a.p pVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(pVar, bindingContext, divStatePath);
    }

    public T visit(a.f fVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(fVar, bindingContext, divStatePath);
    }

    public T visit(a.d dVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(dVar, bindingContext, divStatePath);
    }

    public T visit(a.k kVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(kVar, bindingContext, divStatePath);
    }

    public T visit(a.g gVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(gVar, bindingContext, divStatePath);
    }

    public T visit(a.l lVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(lVar, bindingContext, divStatePath);
    }

    public T visit(a.h hVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(hVar, bindingContext, divStatePath);
    }

    public T visit(a.j jVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(jVar, bindingContext, divStatePath);
    }

    public T visit(a.q qVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(qVar, bindingContext, divStatePath);
    }

    public T visit(a.n nVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(nVar, bindingContext, divStatePath);
    }
}
