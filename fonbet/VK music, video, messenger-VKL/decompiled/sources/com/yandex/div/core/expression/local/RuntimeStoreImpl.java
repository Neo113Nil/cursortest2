package com.yandex.div.core.expression.local;

import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.RuntimeTree;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTrigger;
import com.yandex.div2.a;
import com.yandex.div2.j3;
import com.yandex.div2.md;
import com.yandex.div2.t4;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.gzs;
import xsna.ikn;
import xsna.izs;
import xsna.s3q0;

/* compiled from: RuntimeStoreImpl.kt */
/* loaded from: classes7.dex */
public final class RuntimeStoreImpl implements RuntimeStore {
    private final ErrorCollector errorCollector;
    private final ExpressionsRuntime rootRuntime;
    private final ExpressionsRuntimeProvider runtimeProvider;
    private boolean warningShown;
    private final Map<ExpressionResolver, ExpressionsRuntime> resolverToRuntime = new LinkedHashMap();
    private final Map<String, ExpressionsRuntime> pathToRuntime = new LinkedHashMap();
    private final ObserverList<ExpressionsRuntime> allRuntimes = new ObserverList<>();
    private final RuntimeTree tree = new RuntimeTree();
    private final Map<String, ExpressionResolver> itemBuilderResolvers = new LinkedHashMap();

    public RuntimeStoreImpl(j3 j3Var, ExpressionsRuntimeProvider expressionsRuntimeProvider, ErrorCollector errorCollector) {
        this.runtimeProvider = expressionsRuntimeProvider;
        this.errorCollector = errorCollector;
        ExpressionsRuntime createRootRuntime = expressionsRuntimeProvider.createRootRuntime(j3Var, errorCollector, this);
        putRuntime$div_release(createRootRuntime, "", null);
        this.rootRuntime = createRootRuntime;
    }

    private final boolean getNeedLocalRuntime(a aVar) {
        List<DivTrigger> p;
        List<t4> A;
        ikn b = aVar.b();
        List<md> f = b.f();
        return !((f == null || f.isEmpty()) && ((p = b.p()) == null || p.isEmpty()) && ((A = b.A()) == null || A.isEmpty()));
    }

    private final void reportParentRuntimeError(String str) {
        String format = String.format("Parent runtime for path '%s' is not stored.", Arrays.copyOf(new Object[]{str}, 1));
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail(format);
        }
        this.errorCollector.logError(new AssertionError(format));
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void cleanupRuntimes(DivViewFacade divViewFacade) {
        this.warningShown = false;
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().cleanup$div_release(divViewFacade);
        }
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void clearBindings(DivViewFacade divViewFacade) {
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().clearBinding(divViewFacade);
        }
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public ExpressionsRuntime getOrCreateRuntime(DivStatePath divStatePath, a aVar, ExpressionResolver expressionResolver) {
        String fullPath$div_release = divStatePath.getFullPath$div_release();
        ExpressionsRuntime expressionsRuntime = this.pathToRuntime.get(fullPath$div_release);
        if (expressionsRuntime != null) {
            return expressionsRuntime;
        }
        if (!(expressionResolver instanceof ExpressionResolverImpl)) {
            return getRootRuntime();
        }
        ExpressionsRuntime runtimeWithOrNull = getRuntimeWithOrNull(expressionResolver);
        if (runtimeWithOrNull == null) {
            reportParentRuntimeError(fullPath$div_release);
            return getRootRuntime();
        }
        if (!getNeedLocalRuntime(aVar)) {
            this.pathToRuntime.put(fullPath$div_release, runtimeWithOrNull);
            return runtimeWithOrNull;
        }
        ExpressionsRuntime createChildRuntime = this.runtimeProvider.createChildRuntime(divStatePath, aVar.b(), (ExpressionResolverImpl) expressionResolver, this.errorCollector);
        putRuntime$div_release(createChildRuntime, fullPath$div_release, runtimeWithOrNull);
        return createChildRuntime;
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public ExpressionResolver getOrPutItemBuilderResolver(String str, ExpressionResolver expressionResolver, gzs<? extends ExpressionResolver> gzsVar) {
        Map<String, ExpressionResolver> map = this.itemBuilderResolvers;
        ExpressionResolver expressionResolver2 = map.get(str);
        if (expressionResolver2 == null) {
            expressionResolver2 = gzsVar.invoke();
            ExpressionsRuntime runtimeWithOrNull = getRuntimeWithOrNull(expressionResolver);
            if (runtimeWithOrNull != null) {
                this.resolverToRuntime.put(expressionResolver2, runtimeWithOrNull);
            }
            map.put(str, expressionResolver2);
        }
        return expressionResolver2;
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public ExpressionsRuntime getRootRuntime() {
        return this.rootRuntime;
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public ExpressionsRuntime getRuntimeWithOrNull(ExpressionResolver expressionResolver) {
        return this.resolverToRuntime.get(expressionResolver);
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public Map<String, ExpressionsRuntime> getUniquePathsAndRuntimes() {
        return this.tree.getPathToRuntimes();
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void onDetachedFromWindow(DivViewFacade divViewFacade) {
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().onDetachedFromWindow(divViewFacade);
        }
    }

    public final void putRuntime$div_release(ExpressionsRuntime expressionsRuntime, String str, ExpressionsRuntime expressionsRuntime2) {
        this.pathToRuntime.put(str, expressionsRuntime);
        this.resolverToRuntime.put(expressionsRuntime.getExpressionResolver(), expressionsRuntime);
        this.allRuntimes.addObserver(expressionsRuntime);
        this.tree.storeRuntime(expressionsRuntime, expressionsRuntime2, str);
        expressionsRuntime.updateSubscriptions();
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public ExpressionsRuntime resolveRuntimeWith(DivViewFacade divViewFacade, DivStatePath divStatePath, a aVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        String fullPath$div_release = divStatePath.getFullPath$div_release();
        ExpressionsRuntime expressionsRuntime = this.pathToRuntime.get(fullPath$div_release);
        if (expressionsRuntime != null) {
            return expressionsRuntime;
        }
        if (!(expressionResolver instanceof ExpressionResolverImpl)) {
            return null;
        }
        ExpressionsRuntime runtimeWithOrNull = getRuntimeWithOrNull(expressionResolver2);
        if (runtimeWithOrNull == null) {
            reportParentRuntimeError(fullPath$div_release);
            return null;
        }
        if (getNeedLocalRuntime(aVar)) {
            ExpressionsRuntime createChildRuntime = this.runtimeProvider.createChildRuntime(divStatePath, aVar.b(), (ExpressionResolverImpl) expressionResolver, this.errorCollector);
            putRuntime$div_release(createChildRuntime, fullPath$div_release, runtimeWithOrNull);
            return createChildRuntime;
        }
        if (epx.f(expressionResolver, expressionResolver2)) {
            this.pathToRuntime.put(fullPath$div_release, runtimeWithOrNull);
            return runtimeWithOrNull;
        }
        ExpressionsRuntime expressionsRuntime2 = new ExpressionsRuntime((ExpressionResolverImpl) expressionResolver, null);
        putRuntime$div_release(expressionsRuntime2, fullPath$div_release, runtimeWithOrNull);
        return expressionsRuntime2;
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void showWarningIfNeeded(ikn iknVar) {
        if (this.warningShown || iknVar.f() == null) {
            return;
        }
        this.warningShown = true;
        this.errorCollector.logWarning(new Throwable("You are using local variables. Please ensure that all elements that use local variables and all of their parents recursively have an 'id' attribute."));
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void traverseFrom(ExpressionsRuntime expressionsRuntime, DivStatePath divStatePath, final izs<? super ExpressionsRuntime, s3q0> izsVar) {
        this.tree.invokeRecursively(expressionsRuntime, divStatePath.getFullPath$div_release(), new izs<RuntimeTree.RuntimeNode, s3q0>() { // from class: com.yandex.div.core.expression.local.RuntimeStoreImpl$traverseFrom$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(RuntimeTree.RuntimeNode runtimeNode) {
                invoke2(runtimeNode);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RuntimeTree.RuntimeNode runtimeNode) {
                izsVar.invoke(runtimeNode.getRuntime());
            }
        });
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void updateSubscriptions() {
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().updateSubscriptions();
        }
    }
}
