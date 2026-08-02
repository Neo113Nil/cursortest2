package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.Collections;
import java.util.List;
import xsna.izs;
import xsna.j5g;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes7.dex */
public abstract class ColorComponentGetter extends Function {
    private final izs<Color, Integer> componentGetter;
    private final List<FunctionArgument> declaredArgs = Collections.singletonList(new FunctionArgument(EvaluableType.COLOR, false, 2, null));
    private final EvaluableType resultType = EvaluableType.NUMBER;
    private final boolean isPure = true;

    /* JADX WARN: Multi-variable type inference failed */
    public ColorComponentGetter(izs<? super Color, Integer> izsVar) {
        this.componentGetter = izsVar;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        return Double.valueOf(ColorFunctionsKt.toColorFloatComponentValue(this.componentGetter.invoke((Color) j5g.Y(list)).intValue()));
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return this.resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
