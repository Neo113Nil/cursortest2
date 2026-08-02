package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.KotlinNothingValueException;
import xsna.brm0;
import xsna.c5g;
import xsna.e43;

/* compiled from: StringFunctions.kt */
/* loaded from: classes7.dex */
public final class TestRegex extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final TestRegex INSTANCE = new TestRegex();
    private static final String name = "testRegex";

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        declaredArgs = e43.l(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
        resultType = EvaluableType.BOOLEAN;
        isPure = true;
    }

    private TestRegex() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        try {
            return Boolean.valueOf(Pattern.compile((String) list.get(1)).matcher((String) list.get(0)).find());
        } catch (PatternSyntaxException unused) {
            List<? extends Object> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (Object obj : list2) {
                if (obj instanceof String) {
                    obj = brm0.y((String) obj, "\\", "\\\\");
                }
                arrayList.add(obj);
            }
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), arrayList, "Invalid regular expression.", null, 8, null);
            throw new KotlinNothingValueException();
        }
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
