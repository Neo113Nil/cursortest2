package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import xsna.e43;

/* compiled from: ArrayFunctions.kt */
/* loaded from: classes7.dex */
public abstract class ArrayFunction extends Function {
    private final List<FunctionArgument> declaredArgs = e43.l(new FunctionArgument(EvaluableType.ARRAY, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null));
    private final boolean isMethod;
    private final boolean isPure;
    private final EvaluableType resultType;

    public ArrayFunction(EvaluableType evaluableType) {
        this.resultType = evaluableType;
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public final EvaluableType getResultType() {
        return this.resultType;
    }

    public boolean isMethod() {
        return this.isMethod;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
