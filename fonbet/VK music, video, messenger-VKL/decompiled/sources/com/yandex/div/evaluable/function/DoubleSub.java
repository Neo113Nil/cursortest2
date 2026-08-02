package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.internal.Token;
import io.jsonwebtoken.Claims;
import java.util.Collections;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.e43;

/* compiled from: NumberArithmeticFunctions.kt */
/* loaded from: classes7.dex */
public final class DoubleSub extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final DoubleSub INSTANCE = new DoubleSub();
    private static final String name = Claims.SUBJECT;

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        declaredArgs = Collections.singletonList(new FunctionArgument(evaluableType, true));
        resultType = evaluableType;
        isPure = true;
    }

    private DoubleSub() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.yandex.div.evaluable.Evaluator$Companion] */
    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Double valueOf = Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        int i = 0;
        for (Double d : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            double doubleValue = valueOf.doubleValue();
            if (i != 0) {
                d = Evaluator.Companion.evalSum$div_evaluable(Token.Operator.Binary.Sum.Minus.INSTANCE, Double.valueOf(doubleValue), d);
            }
            valueOf = d;
            valueOf.doubleValue();
            i = i2;
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
