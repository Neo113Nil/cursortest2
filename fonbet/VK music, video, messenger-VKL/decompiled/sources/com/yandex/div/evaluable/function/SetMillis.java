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
import xsna.q9k;

/* compiled from: DateTimeFunctions.kt */
/* loaded from: classes7.dex */
public final class SetMillis extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final SetMillis INSTANCE = new SetMillis();
    private static final String name = "setMillis";

    static {
        EvaluableType evaluableType = EvaluableType.DATETIME;
        declaredArgs = e43.l(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null));
        resultType = evaluableType;
        isPure = true;
    }

    private SetMillis() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) throws EvaluableException {
        DateTime dateTime = (DateTime) list.get(0);
        long longValue = ((Long) list.get(1)).longValue();
        if (longValue > 999 || longValue < 0) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, q9k.d("Expecting millis in [0..999], instead got ", longValue, JwtParser.SEPARATOR_CHAR), null, 8, null);
            throw new KotlinNothingValueException();
        }
        Calendar calendar = DateTimeFunctionsKt.toCalendar(dateTime);
        calendar.set(14, (int) longValue);
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
