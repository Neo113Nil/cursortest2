package com.yandex.div.core.expression.local;

import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.json.expressions.ExpressionResolver;

/* compiled from: utils.kt */
/* loaded from: classes7.dex */
public final class UtilsKt {
    public static final ExpressionResolverImpl getAsImpl(ExpressionResolver expressionResolver) {
        if (expressionResolver instanceof ExpressionResolverImpl) {
            return (ExpressionResolverImpl) expressionResolver;
        }
        return null;
    }

    public static final VariableController getVariableController(ExpressionResolver expressionResolver) {
        ExpressionResolverImpl asImpl = getAsImpl(expressionResolver);
        if (asImpl != null) {
            return asImpl.getVariableController();
        }
        return null;
    }
}
