package com.yandex.div.core.util.inputfilter;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;

/* compiled from: ExpressionInputFilter.kt */
/* loaded from: classes7.dex */
public final class ExpressionInputFilter implements BaseInputFilter {
    private final Expression<Boolean> condition;
    private final ExpressionResolver resolver;

    public ExpressionInputFilter(Expression<Boolean> expression, ExpressionResolver expressionResolver) {
        this.condition = expression;
        this.resolver = expressionResolver;
    }

    @Override // com.yandex.div.core.util.inputfilter.BaseInputFilter
    public boolean checkValue(String str) {
        return this.condition.evaluate(this.resolver).booleanValue();
    }
}
