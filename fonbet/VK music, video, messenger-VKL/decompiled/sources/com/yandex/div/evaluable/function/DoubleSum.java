package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.internal.Token;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: NumberArithmeticFunctions.kt */
/* loaded from: classes7.dex */
public final class DoubleSum extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final DoubleSum INSTANCE = new DoubleSum();
    private static final String name = "sum";

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        declaredArgs = Collections.singletonList(new FunctionArgument(evaluableType, true));
        resultType = evaluableType;
        isPure = true;
    }

    private DoubleSum() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Double valueOf = Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            valueOf = (Double) Evaluator.Companion.evalSum$div_evaluable(Token.Operator.Binary.Sum.Plus.INSTANCE, Double.valueOf(valueOf.doubleValue()), it.next());
            valueOf.doubleValue();
        }
        return valueOf;
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
