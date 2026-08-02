package com.yandex.div.evaluable;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import defpackage.oyr;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/evaluable/IntegerOverflow;", "Lcom/yandex/div/evaluable/EvaluableException;", "", BduiExpressionResolverImpl.EXPRESSION_KEY, "Ljava/lang/String;", "getExpression", "()Ljava/lang/String;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntegerOverflow extends EvaluableException {
    private final String expression;

    public IntegerOverflow(String str) {
        super(oyr.p("Failed to evaluate [", str, "]. Integer overflow."), null);
        this.expression = str;
    }
}
