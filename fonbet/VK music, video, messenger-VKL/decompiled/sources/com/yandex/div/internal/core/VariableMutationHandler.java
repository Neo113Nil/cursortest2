package com.yandex.div.internal.core;

import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Result;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;
import xsna.zr;

/* compiled from: VariableMutationHandler.kt */
/* loaded from: classes7.dex */
public final class VariableMutationHandler {
    public static final Companion Companion = new Companion(null);

    /* compiled from: VariableMutationHandler.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private final VariableMutationException createAndReportError(Throwable th, Div2View div2View, String str) {
            VariableMutationException variableMutationException = new VariableMutationException(str, th);
            DivActionTypedUtilsKt.logError(div2View, variableMutationException);
            return variableMutationException;
        }

        private final Variable findVariable(String str, ExpressionResolver expressionResolver) {
            VariableController variableController = UtilsKt.getVariableController(expressionResolver);
            if (variableController != null) {
                return variableController.getMutableVariable(str);
            }
            return null;
        }

        public final VariableMutationException setVariable(Div2View div2View, String str, String str2, ExpressionResolver expressionResolver) {
            Object failure;
            Variable findVariable = findVariable(str, expressionResolver);
            if (findVariable == null) {
                return createAndReportError(null, div2View, zr.a("Variable '", str, "' not defined!"));
            }
            try {
                findVariable.set(str2);
                failure = s3q0.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a == null) {
                return null;
            }
            return VariableMutationHandler.Companion.createAndReportError(a, div2View, zr.a("Variable '", str, "' mutation failed!"));
        }

        private Companion() {
        }

        public final <T extends Variable> VariableMutationException setVariable(Div2View div2View, String str, ExpressionResolver expressionResolver, izs<? super T, ? extends T> izsVar) {
            Object failure;
            Variable findVariable = findVariable(str, expressionResolver);
            if (findVariable == null) {
                return createAndReportError(null, div2View, zr.a("Variable '", str, "' not defined!"));
            }
            try {
                findVariable.setValue(izsVar.invoke(findVariable));
                failure = s3q0.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a == null) {
                return null;
            }
            return VariableMutationHandler.Companion.createAndReportError(a, div2View, zr.a("Variable '", str, "' mutation failed!"));
        }
    }

    public static final VariableMutationException setVariable(Div2View div2View, String str, String str2, ExpressionResolver expressionResolver) {
        return Companion.setVariable(div2View, str, str2, expressionResolver);
    }
}
