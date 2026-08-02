package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.Collections;
import java.util.List;
import kotlin.text.Regex;
import xsna.izs;
import xsna.zk10;

/* compiled from: StringFunctions.kt */
/* loaded from: classes7.dex */
public final class EncodeRegex extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final EncodeRegex INSTANCE = new EncodeRegex();
    private static final String name = "encodeRegex";

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        declaredArgs = Collections.singletonList(new FunctionArgument(evaluableType, false, 2, null));
        resultType = evaluableType;
        isPure = true;
    }

    private EncodeRegex() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        return new Regex("[.*+?^${}()|\\[\\]\\\\]").h((String) list.get(0), new izs<zk10, CharSequence>() { // from class: com.yandex.div.evaluable.function.EncodeRegex$evaluate$1
            @Override // xsna.izs
            public final CharSequence invoke(zk10 zk10Var) {
                return "\\".concat(zk10Var.getValue());
            }
        });
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
