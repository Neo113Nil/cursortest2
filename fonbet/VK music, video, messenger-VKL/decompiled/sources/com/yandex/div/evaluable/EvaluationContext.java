package com.yandex.div.evaluable;

/* compiled from: EvaluationContext.kt */
/* loaded from: classes7.dex */
public final class EvaluationContext {
    private final FunctionProvider functionProvider;
    private final StoredValueProvider storedValueProvider;
    private final VariableProvider variableProvider;
    private final WarningSender warningSender;

    public EvaluationContext(VariableProvider variableProvider, StoredValueProvider storedValueProvider, FunctionProvider functionProvider, WarningSender warningSender) {
        this.variableProvider = variableProvider;
        this.storedValueProvider = storedValueProvider;
        this.functionProvider = functionProvider;
        this.warningSender = warningSender;
    }

    public final FunctionProvider getFunctionProvider() {
        return this.functionProvider;
    }

    public final StoredValueProvider getStoredValueProvider() {
        return this.storedValueProvider;
    }

    public final VariableProvider getVariableProvider() {
        return this.variableProvider;
    }

    public final WarningSender getWarningSender() {
        return this.warningSender;
    }
}
