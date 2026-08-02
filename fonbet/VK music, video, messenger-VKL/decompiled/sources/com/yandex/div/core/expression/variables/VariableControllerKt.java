package com.yandex.div.core.expression.variables;

import android.net.Uri;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.md;

/* compiled from: VariableController.kt */
/* loaded from: classes7.dex */
public final class VariableControllerKt {
    public static final void declare(VariableController variableController, md mdVar, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        try {
            variableController.declare(DivVariablesParserKt.toVariable(mdVar, expressionResolver));
        } catch (VariableDeclarationException e) {
            errorCollector.logError(e);
        }
    }

    public static final Object wrapVariableValue(Object obj) {
        return obj instanceof Uri ? Url.m195boximpl(Url.m196constructorimpl(obj.toString())) : obj;
    }
}
