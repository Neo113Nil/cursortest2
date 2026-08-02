package com.yandex.div.core.expression.local;

import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.state.DivStateCache;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivTabs;
import com.yandex.div2.a;
import com.yandex.div2.ma;
import com.yandex.div2.o2;
import java.util.List;
import xsna.e43;
import xsna.epx;
import xsna.izs;
import xsna.j5g;
import xsna.mq;
import xsna.s3q0;

/* compiled from: DivRuntimeVisitor.kt */
/* loaded from: classes7.dex */
public class DivRuntimeVisitor {
    private final DivStateCache divStateCache;
    private final TabsStateCache tabsCache;
    private final TemporaryDivStateCache temporaryStateCache;

    public DivRuntimeVisitor(DivStateCache divStateCache, TemporaryDivStateCache temporaryDivStateCache, TabsStateCache tabsStateCache) {
        this.divStateCache = divStateCache;
        this.temporaryStateCache = temporaryDivStateCache;
        this.tabsCache = tabsStateCache;
    }

    private ExpressionsRuntime defaultVisit(a aVar, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        ExpressionsRuntime orCreateRuntime = div2View.getRuntimeStore$div_release().getOrCreateRuntime(divStatePath, aVar, expressionsRuntime.getExpressionResolver());
        orCreateRuntime.onAttachedToWindow(div2View);
        return orCreateRuntime;
    }

    private String getActiveStateId(ma maVar, Div2View div2View, DivStatePath divStatePath, ExpressionResolverImpl expressionResolverImpl) {
        String str = divStatePath.getStatesString$div_release() + '/' + divStatePath.getLastDivId$div_release();
        String id = div2View.getDivTag().getId();
        String state = this.temporaryStateCache.getState(id, str);
        if (state != null) {
            return state;
        }
        String state2 = this.divStateCache.getState(id, str);
        if (state2 == null) {
            String str2 = maVar.H;
            if (str2 != null) {
                Variable mutableVariable = expressionResolverImpl.getVariableController().getMutableVariable(str2);
                state2 = String.valueOf(mutableVariable != null ? mutableVariable.getValue() : null);
            } else {
                state2 = null;
            }
            if (state2 == null) {
                Expression<String> expression = maVar.n;
                state2 = expression != null ? expression.evaluate(expressionResolverImpl) : null;
                if (state2 == null) {
                    ma.a aVar = (ma.a) j5g.a0(maVar.I);
                    if (aVar != null) {
                        return aVar.d;
                    }
                    return null;
                }
            }
        }
        return state2;
    }

    private void visit(a aVar, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        if (aVar instanceof a.C2110a) {
            DivContainer divContainer = ((a.C2110a) aVar).c;
            visitContainer(aVar, div2View, divContainer.B, divContainer.z, divStatePath, expressionsRuntime);
            return;
        }
        if (aVar instanceof a.e) {
            visitContainer(aVar, div2View, ((a.e) aVar).c.y, null, divStatePath, expressionsRuntime);
            return;
        }
        if (aVar instanceof a.c) {
            DivGallery divGallery = ((a.c) aVar).c;
            visitContainer(aVar, div2View, divGallery.u, divGallery.s, divStatePath, expressionsRuntime);
            return;
        }
        if (aVar instanceof a.i) {
            DivPager divPager = ((a.i) aVar).c;
            visitContainer(aVar, div2View, divPager.t, divPager.r, divStatePath, expressionsRuntime);
            return;
        }
        if (aVar instanceof a.m) {
            visitState((a.m) aVar, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (aVar instanceof a.o) {
            visitTabs((a.o) aVar, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (aVar instanceof a.b) {
            defaultVisit(aVar, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (aVar instanceof a.d) {
            defaultVisit(aVar, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (aVar instanceof a.f) {
            defaultVisit(aVar, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (aVar instanceof a.g) {
            defaultVisit(aVar, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (aVar instanceof a.h) {
            defaultVisit(aVar, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (aVar instanceof a.j) {
            defaultVisit(aVar, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (aVar instanceof a.k) {
            defaultVisit(aVar, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (aVar instanceof a.l) {
            defaultVisit(aVar, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (aVar instanceof a.p) {
            defaultVisit(aVar, div2View, divStatePath, expressionsRuntime);
        } else if (aVar instanceof a.q) {
            defaultVisit(aVar, div2View, divStatePath, expressionsRuntime);
        } else if (aVar instanceof a.n) {
            defaultVisit(aVar, div2View, divStatePath, expressionsRuntime);
        }
    }

    private void visitChild(a aVar, final Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime, boolean z) {
        if (z) {
            visit(aVar, div2View, divStatePath, expressionsRuntime);
        } else {
            div2View.getRuntimeStore$div_release().traverseFrom(div2View.getRuntimeStore$div_release().getOrCreateRuntime(divStatePath, aVar, expressionsRuntime.getExpressionResolver()), divStatePath, new izs<ExpressionsRuntime, s3q0>() { // from class: com.yandex.div.core.expression.local.DivRuntimeVisitor$visitChild$1
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(ExpressionsRuntime expressionsRuntime2) {
                    invoke2(expressionsRuntime2);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpressionsRuntime expressionsRuntime2) {
                    expressionsRuntime2.clearBinding(Div2View.this);
                }
            });
        }
    }

    private void visitContainer(a aVar, Div2View div2View, List<? extends a> list, o2 o2Var, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        List<String> ids;
        ExpressionsRuntime defaultVisit = defaultVisit(aVar, div2View, divStatePath, expressionsRuntime);
        if (o2Var != null) {
            visit(o2Var, div2View, divStatePath, defaultVisit);
            return;
        }
        if (list == null || (ids = DivPathUtils.INSTANCE.getIds(list)) == null) {
            return;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            visit((a) obj, div2View, divStatePath.appendDiv(ids.get(i)), defaultVisit);
            i = i2;
        }
    }

    private void visitState(a.m mVar, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        visitStates(mVar.c, div2View, divStatePath, defaultVisit(mVar, div2View, divStatePath, expressionsRuntime));
    }

    private void visitStates(ma maVar, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        Div2View div2View2;
        ExpressionsRuntime expressionsRuntime2;
        String activeStateId = getActiveStateId(maVar, div2View, divStatePath, expressionsRuntime.getExpressionResolver());
        for (ma.a aVar : maVar.I) {
            a aVar2 = aVar.c;
            String str = aVar.d;
            if (aVar2 == null) {
                div2View2 = div2View;
                expressionsRuntime2 = expressionsRuntime;
            } else {
                div2View2 = div2View;
                expressionsRuntime2 = expressionsRuntime;
                visitChild(aVar2, div2View2, divStatePath.append$div_release(divStatePath.getLastDivId$div_release(), aVar, str), expressionsRuntime2, epx.f(str, activeStateId));
            }
            div2View = div2View2;
            expressionsRuntime = expressionsRuntime2;
        }
    }

    private void visitTabs(a.o oVar, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        visitTabs(oVar.c, div2View, divStatePath, defaultVisit(oVar, div2View, divStatePath, expressionsRuntime));
    }

    public void createAndAttachRuntimes(a aVar, DivStatePath divStatePath, Div2View div2View) {
        ExpressionsRuntime rootRuntime = div2View.getRuntimeStore$div_release().getRootRuntime();
        rootRuntime.onAttachedToWindow(div2View);
        visit(aVar, div2View, divStatePath, rootRuntime);
    }

    public void createAndAttachRuntimesToState(Div2View div2View, ma maVar, DivStatePath divStatePath, ExpressionResolver expressionResolver) {
        ExpressionsRuntime runtimeWithOrNull = div2View.getRuntimeStore$div_release().getRuntimeWithOrNull(expressionResolver);
        if (runtimeWithOrNull == null) {
            return;
        }
        visitStates(maVar, div2View, divStatePath, runtimeWithOrNull);
    }

    public void createAndAttachRuntimesToTabs(Div2View div2View, DivTabs divTabs, DivStatePath divStatePath, ExpressionResolver expressionResolver) {
        ExpressionsRuntime runtimeWithOrNull = div2View.getRuntimeStore$div_release().getRuntimeWithOrNull(expressionResolver);
        if (runtimeWithOrNull == null) {
            return;
        }
        visitTabs(divTabs, div2View, divStatePath, runtimeWithOrNull);
    }

    private void visitTabs(DivTabs divTabs, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        int i;
        Integer selectedTab = this.tabsCache.getSelectedTab(div2View.getDataTag().getId(), divStatePath.getFullPath$div_release());
        if (selectedTab != null) {
            i = selectedTab.intValue();
        } else {
            long longValue = divTabs.y.evaluate(expressionsRuntime.getExpressionResolver()).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    mq.a(longValue, "Unable convert '", "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        List ids$default = DivPathUtils.getIds$default(DivPathUtils.INSTANCE, divTabs.q, new izs<DivTabs.a, a>() { // from class: com.yandex.div.core.expression.local.DivRuntimeVisitor$visitTabs$ids$1
            @Override // xsna.izs
            public final a invoke(DivTabs.a aVar) {
                return aVar.a;
            }
        }, null, 2, null);
        int i2 = 0;
        for (Object obj : divTabs.q) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                visitChild(((DivTabs.a) obj).a, div2View, divStatePath.appendDiv((String) ids$default.get(i2)), expressionsRuntime, i == i2);
                i2 = i3;
            } else {
                e43.t();
                throw null;
            }
        }
    }

    private void visit(o2 o2Var, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        List<DivItemBuilderResult> build = DivCollectionExtensionsKt.build(o2Var, expressionsRuntime.getExpressionResolver());
        List<String> itemIds = DivPathUtils.INSTANCE.getItemIds(build);
        int i = 0;
        for (Object obj : build) {
            int i2 = i + 1;
            if (i >= 0) {
                DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
                DivStatePath appendDiv = divStatePath.appendDiv(itemIds.get(i));
                Div2View div2View2 = div2View;
                ExpressionsRuntime resolveRuntimeWith = div2View.getRuntimeStore$div_release().resolveRuntimeWith(div2View2, appendDiv, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver(), expressionsRuntime.getExpressionResolver());
                a div = divItemBuilderResult.getDiv();
                if (resolveRuntimeWith == null) {
                    resolveRuntimeWith = expressionsRuntime;
                }
                visit(div, div2View2, appendDiv, resolveRuntimeWith);
                i = i2;
                div2View = div2View2;
            } else {
                e43.t();
                throw null;
            }
        }
    }
}
