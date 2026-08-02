package com.yandex.div.evaluable;

import xsna.zcl;
import xsna.zr;

/* compiled from: EvaluableException.kt */
/* loaded from: classes7.dex */
public final class MissingVariableException extends EvaluableException {
    private final String variableName;

    public /* synthetic */ MissingVariableException(String str, Exception exc, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : exc);
    }

    public final String getVariableName() {
        return this.variableName;
    }

    public MissingVariableException(String str, Exception exc) {
        super(zr.a("Variable '", str, "' is missing."), exc);
        this.variableName = str;
    }
}
