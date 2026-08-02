package com.yandex.div.core.view2.errors;

import com.yandex.div.data.Variable;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VariableMonitorView.kt */
/* loaded from: classes7.dex */
public final class VariableMonitorViewKt {
    private static final String getType(Variable variable) {
        if (variable instanceof Variable.ArrayVariable) {
            return "array";
        }
        if (variable instanceof Variable.BooleanVariable) {
            return "boolean";
        }
        if (variable instanceof Variable.ColorVariable) {
            return "color";
        }
        if (variable instanceof Variable.DictVariable) {
            return "dict";
        }
        if (variable instanceof Variable.DoubleVariable) {
            return "number";
        }
        if (variable instanceof Variable.IntegerVariable) {
            return "integer";
        }
        if (variable instanceof Variable.StringVariable) {
            return "string";
        }
        if (variable instanceof Variable.UrlVariable) {
            return "url";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VariableModel toModel(Variable variable, String str) {
        return new VariableModel(variable.getName(), str, getType(variable), variable.getValue().toString());
    }
}
