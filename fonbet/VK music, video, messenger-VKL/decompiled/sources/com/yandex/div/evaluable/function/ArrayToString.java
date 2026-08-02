package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import xsna.j5g;

/* compiled from: ToString.kt */
/* loaded from: classes7.dex */
public final class ArrayToString extends Function {
    private static final boolean isPure = false;
    public static final ArrayToString INSTANCE = new ArrayToString();
    private static final String name = "toString";
    private static final List<FunctionArgument> declaredArgs = Collections.singletonList(new FunctionArgument(EvaluableType.ARRAY, false, 2, null));
    private static final EvaluableType resultType = EvaluableType.STRING;

    private ArrayToString() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        return ((JSONArray) j5g.Y(list)).toString();
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
