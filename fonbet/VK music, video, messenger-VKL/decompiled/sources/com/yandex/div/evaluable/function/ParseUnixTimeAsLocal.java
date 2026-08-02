package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.DateTime;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import xsna.j5g;

/* compiled from: DateTimeFunctions.kt */
/* loaded from: classes7.dex */
public final class ParseUnixTimeAsLocal extends Function {
    public static final ParseUnixTimeAsLocal INSTANCE = new ParseUnixTimeAsLocal();
    private static final String name = "parseUnixTimeAsLocal";
    private static final List<FunctionArgument> declaredArgs = Collections.singletonList(new FunctionArgument(EvaluableType.INTEGER, false, 2, null));
    private static final EvaluableType resultType = EvaluableType.DATETIME;
    private static final boolean isPure = true;

    private ParseUnixTimeAsLocal() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        return new DateTime(((Long) j5g.Y(list)).longValue() * 1000, TimeZone.getDefault());
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
