package com.yandex.div.evaluable;

import defpackage.oyr;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/evaluable/MissingVariableException;", "Lcom/yandex/div/evaluable/EvaluableException;", "", "variableName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MissingVariableException extends EvaluableException {
    private final String variableName;

    public MissingVariableException(String str) {
        super(oyr.p("Variable '", str, "' is missing."), null);
        this.variableName = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getVariableName() {
        return this.variableName;
    }
}
