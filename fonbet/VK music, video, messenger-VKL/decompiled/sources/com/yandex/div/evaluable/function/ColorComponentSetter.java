package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.e43;
import xsna.wzs;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes7.dex */
public abstract class ColorComponentSetter extends Function {
    private final wzs<Color, Double, Color> componentSetter;
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;
    private final EvaluableType resultType;

    /* JADX WARN: Multi-variable type inference failed */
    public ColorComponentSetter(wzs<? super Color, ? super Double, Color> wzsVar) {
        this.componentSetter = wzsVar;
        EvaluableType evaluableType = EvaluableType.COLOR;
        this.declaredArgs = e43.l(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.NUMBER, false, 2, null));
        this.resultType = evaluableType;
        this.isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        int m192unboximpl = ((Color) list.get(0)).m192unboximpl();
        Double d = (Double) list.get(1);
        d.doubleValue();
        try {
            return Color.m184boximpl(this.componentSetter.invoke(Color.m184boximpl(m192unboximpl), d).m192unboximpl());
        } catch (IllegalArgumentException unused) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), e43.l(Color.m191toStringimpl(m192unboximpl), d), "Value out of range 0..1.", null, 8, null);
            throw new KotlinNothingValueException();
        }
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
