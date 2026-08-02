package com.yandex.div.core.expression.variables;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.expression.variables.VariableControllerImpl;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.izs;
import xsna.j5g;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: VariableControllerImpl.kt */
/* loaded from: classes7.dex */
public class VariableControllerImpl implements VariableController {
    private final VariableControllerImpl$declarationObserver$1 declarationObserver;
    private final VariableController delegate;
    private final List<VariableSource> extraVariablesSources;
    private final izs<Variable, s3q0> notifyVariableChangedCallback;
    private final Map<ExpressionResolver, izs<Variable, s3q0>> onAnyVariableChangeObservers;
    private final Map<String, ObserverList<izs<Variable, s3q0>>> onChangeObservers;
    private final Map<String, ObserverList<izs<Variable, s3q0>>> onRemoveObservers;
    private final Map<String, Variable> variables;

    /* JADX WARN: Type inference failed for: r1v7, types: [com.yandex.div.core.expression.variables.VariableControllerImpl$declarationObserver$1] */
    public VariableControllerImpl(VariableController variableController) {
        this.delegate = variableController;
        this.variables = new LinkedHashMap();
        this.extraVariablesSources = new ArrayList();
        this.onChangeObservers = new LinkedHashMap();
        this.onRemoveObservers = new LinkedHashMap();
        this.onAnyVariableChangeObservers = new LinkedHashMap();
        this.notifyVariableChangedCallback = new izs<Variable, s3q0>() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl$notifyVariableChangedCallback$1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Variable variable) {
                invoke2(variable);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Variable variable) {
                VariableControllerImpl.this.notifyVariableChanged(variable);
            }
        };
        this.declarationObserver = new DeclarationObserver() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl$declarationObserver$1
        };
    }

    private void addObserver(String str, izs<? super Variable, s3q0> izsVar) {
        Map<String, ObserverList<izs<Variable, s3q0>>> map = this.onChangeObservers;
        ObserverList<izs<Variable, s3q0>> observerList = map.get(str);
        if (observerList == null) {
            observerList = new ObserverList<>();
            map.put(str, observerList);
        }
        observerList.addObserver(izsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyVariableChanged(Variable variable) {
        Assert.assertMainThread();
        Iterator it = j5g.O0(this.onAnyVariableChangeObservers.values()).iterator();
        while (it.hasNext()) {
            ((izs) it.next()).invoke(variable);
        }
        ObserverList<izs<Variable, s3q0>> observerList = this.onChangeObservers.get(variable.getName());
        if (observerList != null) {
            Iterator<izs<Variable, s3q0>> it2 = observerList.iterator();
            while (it2.hasNext()) {
                it2.next().invoke(variable);
            }
        }
    }

    private void onVariableDeclared(Variable variable) {
        variable.addObserver(this.notifyVariableChangedCallback);
        notifyVariableChanged(variable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeChangeObserver(String str, izs<? super Variable, s3q0> izsVar) {
        ObserverList<izs<Variable, s3q0>> observerList = this.onChangeObservers.get(str);
        if (observerList != null) {
            observerList.removeObserver(izsVar);
        }
    }

    private void subscribeToVariableChangeImpl(String str, ErrorCollector errorCollector, boolean z, izs<? super Variable, s3q0> izsVar) {
        Variable mutableVariable = getMutableVariable(str);
        if (mutableVariable == null) {
            if (errorCollector != null) {
                errorCollector.logError(ParsingExceptionKt.missingVariable$default(str, null, 2, null));
            }
            addObserver(str, izsVar);
        } else {
            if (z) {
                Assert.assertMainThread();
                izsVar.invoke(mutableVariable);
            }
            addObserver(str, izsVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToVariablesChange$lambda$5(List list, List list2, VariableControllerImpl variableControllerImpl, izs izsVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            variableControllerImpl.removeChangeObserver((String) it.next(), izsVar);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((Disposable) it2.next()).close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToVariablesUndeclared$lambda$10(List list, VariableControllerImpl variableControllerImpl, izs izsVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ObserverList<izs<Variable, s3q0>> observerList = variableControllerImpl.onRemoveObservers.get((String) it.next());
            if (observerList != null) {
                observerList.removeObserver(izsVar);
            }
        }
    }

    public void addSource(VariableSource variableSource) {
        variableSource.observeVariables(this.notifyVariableChangedCallback);
        variableSource.observeDeclaration(this.declarationObserver);
        this.extraVariablesSources.add(variableSource);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public List<Variable> captureAll() {
        return j5g.O0(this.variables.values());
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void cleanupSubscriptions() {
        for (VariableSource variableSource : this.extraVariablesSources) {
            variableSource.removeVariablesObserver(this.notifyVariableChangedCallback);
            variableSource.removeDeclarationObserver(this.declarationObserver);
        }
        this.onAnyVariableChangeObservers.clear();
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void declare(Variable variable) throws VariableDeclarationException {
        Variable put = this.variables.put(variable.getName(), variable);
        if (put == null) {
            onVariableDeclared(variable);
            return;
        }
        this.variables.put(variable.getName(), put);
        throw new VariableDeclarationException("Variable '" + variable.getName() + "' already declared!", null, 2, null);
    }

    @Override // com.yandex.div.evaluable.VariableProvider
    public Object get(String str) {
        Variable mutableVariable = getMutableVariable(str);
        Object wrapVariableValue = VariableControllerKt.wrapVariableValue(mutableVariable != null ? mutableVariable.getValue() : null);
        if (wrapVariableValue != null) {
            return wrapVariableValue;
        }
        VariableController variableController = this.delegate;
        if (variableController != null) {
            return variableController.get(str);
        }
        return null;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public Variable getMutableVariable(String str) {
        Variable mutableVariable;
        Variable variable = this.variables.get(str);
        if (variable != null) {
            return variable;
        }
        VariableController variableController = this.delegate;
        if (variableController != null && (mutableVariable = variableController.getMutableVariable(str)) != null) {
            return mutableVariable;
        }
        Iterator<T> it = this.extraVariablesSources.iterator();
        while (it.hasNext()) {
            Variable mutableVariable2 = ((VariableSource) it.next()).getMutableVariable(str);
            if (mutableVariable2 != null) {
                return mutableVariable2;
            }
        }
        return null;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void restoreSubscriptions() {
        for (VariableSource variableSource : this.extraVariablesSources) {
            variableSource.observeVariables(this.notifyVariableChangedCallback);
            variableSource.receiveVariablesUpdates(this.notifyVariableChangedCallback);
            variableSource.observeDeclaration(this.declarationObserver);
        }
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void setOnAnyVariableChangeCallback(ExpressionResolver expressionResolver, final izs<? super Variable, s3q0> izsVar) {
        this.onAnyVariableChangeObservers.put(expressionResolver, izsVar);
        VariableController variableController = this.delegate;
        if (variableController != null) {
            variableController.setOnAnyVariableChangeCallback(expressionResolver, new izs<Variable, s3q0>() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl$setOnAnyVariableChangeCallback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(Variable variable) {
                    invoke2(variable);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Variable variable) {
                    Map map;
                    map = VariableControllerImpl.this.variables;
                    if (map.get(variable.getName()) == null) {
                        izsVar.invoke(variable);
                    }
                }
            });
        }
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public Disposable subscribeToVariableChange(final String str, ErrorCollector errorCollector, boolean z, final izs<? super Variable, s3q0> izsVar) {
        if (!this.variables.containsKey(str)) {
            VariableController variableController = this.delegate;
            if ((variableController != null ? variableController.getMutableVariable(str) : null) != null) {
                return this.delegate.subscribeToVariableChange(str, errorCollector, z, izsVar);
            }
        }
        subscribeToVariableChangeImpl(str, errorCollector, z, izsVar);
        return new Disposable() { // from class: xsna.ekr0
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                VariableControllerImpl.this.removeChangeObserver(str, izsVar);
            }
        };
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public Disposable subscribeToVariablesChange(final List<String> list, boolean z, final izs<? super Variable, s3q0> izsVar) {
        final ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!this.variables.containsKey(str)) {
                VariableController variableController = this.delegate;
                if ((variableController != null ? variableController.getMutableVariable(str) : null) != null) {
                    arrayList.add(this.delegate.subscribeToVariableChange(str, null, z, izsVar));
                }
            }
            subscribeToVariableChangeImpl(str, null, z, izsVar);
        }
        return new Disposable() { // from class: xsna.gkr0
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                VariableControllerImpl.subscribeToVariablesChange$lambda$5(list, arrayList, this, izsVar);
            }
        };
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public Disposable subscribeToVariablesUndeclared(final List<String> list, final izs<? super Variable, s3q0> izsVar) {
        for (String str : list) {
            Map<String, ObserverList<izs<Variable, s3q0>>> map = this.onRemoveObservers;
            ObserverList<izs<Variable, s3q0>> observerList = map.get(str);
            if (observerList == null) {
                observerList = new ObserverList<>();
                map.put(str, observerList);
            }
            observerList.addObserver(izsVar);
        }
        return new Disposable() { // from class: xsna.fkr0
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                VariableControllerImpl.subscribeToVariablesUndeclared$lambda$10(list, this, izsVar);
            }
        };
    }

    public /* synthetic */ VariableControllerImpl(VariableController variableController, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : variableController);
    }
}
