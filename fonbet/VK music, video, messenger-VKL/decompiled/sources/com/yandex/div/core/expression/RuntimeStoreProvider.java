package com.yandex.div.core.expression;

import com.yandex.div.DivDataTag;
import com.yandex.div.core.expression.local.ExpressionsRuntimeProvider;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.local.RuntimeStoreImpl;
import com.yandex.div.core.expression.triggers.TriggersController;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.expression.variables.VariableControllerKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.data.Variable;
import com.yandex.div2.DivTrigger;
import com.yandex.div2.j3;
import com.yandex.div2.md;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.xqm0;

/* compiled from: RuntimeStoreProvider.kt */
/* loaded from: classes7.dex */
public class RuntimeStoreProvider {
    private final ErrorCollectors errorCollectors;
    private final ExpressionsRuntimeProvider runtimeProvider;
    private final Map<String, RuntimeStore> runtimeStores = Collections.synchronizedMap(new LinkedHashMap());
    private final WeakHashMap<Div2View, Set<String>> divDataTags = new WeakHashMap<>();

    public RuntimeStoreProvider(ExpressionsRuntimeProvider expressionsRuntimeProvider, ErrorCollectors errorCollectors) {
        this.runtimeProvider = expressionsRuntimeProvider;
        this.errorCollectors = errorCollectors;
    }

    private void ensureVariablesSynced(ExpressionResolverImpl expressionResolverImpl, j3 j3Var, ErrorCollector errorCollector) {
        boolean z;
        VariableController variableController = expressionResolverImpl.getVariableController();
        List<md> list = j3Var.g;
        if (list != null) {
            for (md mdVar : list) {
                Variable mutableVariable = variableController.getMutableVariable(RuntimeStoreProviderKt.getName(mdVar));
                if (mutableVariable == null) {
                    VariableControllerKt.declare(variableController, mdVar, expressionResolverImpl, errorCollector);
                } else {
                    if (mdVar instanceof md.b) {
                        z = mutableVariable instanceof Variable.BooleanVariable;
                    } else if (mdVar instanceof md.e) {
                        z = mutableVariable instanceof Variable.IntegerVariable;
                    } else if (mdVar instanceof md.f) {
                        z = mutableVariable instanceof Variable.DoubleVariable;
                    } else if (mdVar instanceof md.h) {
                        z = mutableVariable instanceof Variable.StringVariable;
                    } else if (mdVar instanceof md.c) {
                        z = mutableVariable instanceof Variable.ColorVariable;
                    } else if (mdVar instanceof md.i) {
                        z = mutableVariable instanceof Variable.UrlVariable;
                    } else if (mdVar instanceof md.d) {
                        z = mutableVariable instanceof Variable.DictVariable;
                    } else if (mdVar instanceof md.a) {
                        z = mutableVariable instanceof Variable.ArrayVariable;
                    } else {
                        if (!(mdVar instanceof md.g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z = false;
                    }
                    if (!z) {
                        errorCollector.logError(new IllegalArgumentException(xqm0.g("\n                           Variable inconsistency detected!\n                           at DivData: " + RuntimeStoreProviderKt.getName(mdVar) + " (" + mdVar + ")\n                           at VariableController: " + variableController.getMutableVariable(RuntimeStoreProviderKt.getName(mdVar)) + "\n                        ")));
                    }
                }
            }
        }
    }

    public void cleanupRuntime$div_release(Div2View div2View) {
        Set<String> set = this.divDataTags.get(div2View);
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                RuntimeStore runtimeStore = this.runtimeStores.get((String) it.next());
                if (runtimeStore != null) {
                    runtimeStore.cleanupRuntimes(div2View);
                }
            }
        }
        this.divDataTags.remove(div2View);
    }

    public RuntimeStore getOrCreate$div_release(DivDataTag divDataTag, j3 j3Var, Div2View div2View) {
        WeakHashMap<Div2View, Set<String>> weakHashMap = this.divDataTags;
        Set<String> set = weakHashMap.get(div2View);
        if (set == null) {
            set = new LinkedHashSet<>();
            weakHashMap.put(div2View, set);
        }
        set.add(divDataTag.getId());
        RuntimeStore runtimeStore = this.runtimeStores.get(divDataTag.getId());
        if (runtimeStore == null) {
            RuntimeStoreImpl runtimeStoreImpl = new RuntimeStoreImpl(j3Var, this.runtimeProvider, this.errorCollectors.getOrCreate(divDataTag, j3Var));
            this.runtimeStores.put(divDataTag.getId(), runtimeStoreImpl);
            return runtimeStoreImpl;
        }
        ensureVariablesSynced(runtimeStore.getRootRuntime().getExpressionResolver(), j3Var, this.errorCollectors.getOrCreate(divDataTag, j3Var));
        TriggersController triggersController = runtimeStore.getRootRuntime().getTriggersController();
        if (triggersController != null) {
            List<DivTrigger> list = j3Var.f;
            if (list == null) {
                list = EmptyList.b;
            }
            triggersController.ensureTriggersSynced(list);
        }
        return runtimeStore;
    }
}
