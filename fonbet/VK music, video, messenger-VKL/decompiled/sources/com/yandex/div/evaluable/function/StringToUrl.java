package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Url;
import java.util.Collections;
import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.j5g;

/* compiled from: ToUrl.kt */
/* loaded from: classes7.dex */
public final class StringToUrl extends Function {
    public static final StringToUrl INSTANCE = new StringToUrl();
    private static final String name = "toUrl";
    private static final List<FunctionArgument> declaredArgs = Collections.singletonList(new FunctionArgument(EvaluableType.STRING, false, 2, null));
    private static final EvaluableType resultType = EvaluableType.URL;
    private static final boolean isPure = true;

    private StringToUrl() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        try {
            return Url.m195boximpl(Url.Companion.m202fromVcSV9u8((String) j5g.Y(list)));
        } catch (IllegalArgumentException e) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed(getName(), list, "Unable to convert value to Url.", e);
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
