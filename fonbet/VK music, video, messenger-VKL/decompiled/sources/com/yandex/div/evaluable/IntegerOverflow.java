package com.yandex.div.evaluable;

import xsna.zcl;
import xsna.zr;

/* compiled from: EvaluableException.kt */
/* loaded from: classes7.dex */
public final class IntegerOverflow extends EvaluableException {
    private final String expression;

    public /* synthetic */ IntegerOverflow(String str, Exception exc, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : exc);
    }

    public IntegerOverflow(String str, Exception exc) {
        super(zr.a("Failed to evaluate [", str, "]. Integer overflow."), exc);
        this.expression = str;
    }
}
