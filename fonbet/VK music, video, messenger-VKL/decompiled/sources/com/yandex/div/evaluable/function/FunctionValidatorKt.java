package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import io.jsonwebtoken.JwtParser;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;

/* compiled from: FunctionValidator.kt */
/* loaded from: classes7.dex */
public final class FunctionValidatorKt {
    public static final Exception getFunctionArgumentsException(String str, List<? extends EvaluableType> list, boolean z) {
        if (z) {
            return getMethodArgumentsException(str, list);
        }
        if (list.isEmpty()) {
            return new EvaluableException("Function requires non empty argument list.", null, 2, null);
        }
        return new EvaluableException("Function has no matching overload for given argument types: " + EvaluableExceptionKt.toMessageFormat((List<? extends Object>) list) + JwtParser.SEPARATOR_CHAR, null, 2, null);
    }

    public static /* synthetic */ Exception getFunctionArgumentsException$default(String str, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return getFunctionArgumentsException(str, list, z);
    }

    public static final Exception getMethodArgumentsException(String str, List<? extends EvaluableType> list) {
        if (list.size() == 1) {
            return new EvaluableException("Method requires non empty argument list.", null, 2, null);
        }
        return new EvaluableException("Method has no matching overload for given argument types: " + EvaluableExceptionKt.toMessageFormat((List<? extends Object>) list.subList(1, list.size())) + JwtParser.SEPARATOR_CHAR, null, 2, null);
    }

    public static final Function withArgumentsValidation(Function function, List<? extends EvaluableType> list) {
        Function.MatchResult matchesArguments$div_evaluable = function.matchesArguments$div_evaluable(list);
        if (!(matchesArguments$div_evaluable instanceof Function.MatchResult.Ok)) {
            if (matchesArguments$div_evaluable instanceof Function.MatchResult.ArgCountMismatch) {
                StringBuilder sb = new StringBuilder();
                sb.append(function.getHasVarArg$div_evaluable() ? "At least" : "Exactly");
                sb.append(' ');
                sb.append(((Function.MatchResult.ArgCountMismatch) matchesArguments$div_evaluable).getExpected());
                sb.append(" argument(s) expected.");
                throw new EvaluableException(sb.toString(), null, 2, null);
            }
            if (!(matchesArguments$div_evaluable instanceof Function.MatchResult.ArgTypeMismatch)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!epx.f(function.matchesArgumentsWithCast$div_evaluable(list), Function.MatchResult.Ok.INSTANCE)) {
                StringBuilder sb2 = new StringBuilder("Invalid argument type: expected ");
                Function.MatchResult.ArgTypeMismatch argTypeMismatch = (Function.MatchResult.ArgTypeMismatch) matchesArguments$div_evaluable;
                sb2.append(argTypeMismatch.getExpected());
                sb2.append(", got ");
                sb2.append(argTypeMismatch.getActual());
                sb2.append(JwtParser.SEPARATOR_CHAR);
                throw new EvaluableException(sb2.toString(), null, 2, null);
            }
        }
        return function;
    }
}
