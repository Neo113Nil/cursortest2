package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.DateTime;
import java.util.List;
import java.util.TimeZone;
import kotlin.collections.EmptyList;

/* compiled from: DateTimeFunctions.kt */
/* loaded from: classes7.dex */
public final class NowLocal extends Function {
    private static final boolean isPure = false;
    public static final NowLocal INSTANCE = new NowLocal();
    private static final String name = "nowLocal";
    private static final List<FunctionArgument> declaredArgs = EmptyList.b;
    private static final EvaluableType resultType = EvaluableType.DATETIME;

    private NowLocal() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        return new DateTime(System.currentTimeMillis(), TimeZone.getDefault());
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
