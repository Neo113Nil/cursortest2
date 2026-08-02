package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.DateTime;
import io.jsonwebtoken.JwtParser;
import java.util.Calendar;
import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.e43;

/* compiled from: DateTimeFunctions.kt */
/* loaded from: classes7.dex */
public final class SetDay extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final SetDay INSTANCE = new SetDay();
    private static final String name = "setDay";

    static {
        EvaluableType evaluableType = EvaluableType.DATETIME;
        declaredArgs = e43.l(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null));
        resultType = evaluableType;
        isPure = true;
    }

    private SetDay() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) throws EvaluableException {
        DateTime dateTime = (DateTime) list.get(0);
        long longValue = ((Long) list.get(1)).longValue();
        Calendar calendar = DateTimeFunctionsKt.toCalendar(dateTime);
        int actualMaximum = calendar.getActualMaximum(5);
        if (1 <= longValue && longValue <= actualMaximum) {
            calendar.set(5, (int) longValue);
        } else {
            if (longValue != -1) {
                EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, "Unable to set day " + longValue + " for date " + dateTime + JwtParser.SEPARATOR_CHAR, null, 8, null);
                throw new KotlinNothingValueException();
            }
            calendar.set(5, 0);
        }
        return new DateTime(calendar.getTimeInMillis(), dateTime.getTimezone$div_evaluable());
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return isPure;
    }
}
