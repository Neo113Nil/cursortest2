package com.yandex.div.evaluable.function;

import androidx.credentials.provider.CredentialEntry;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.Collections;
import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.epx;
import xsna.j5g;

/* compiled from: ToBoolean.kt */
/* loaded from: classes7.dex */
public final class StringToBoolean extends Function {
    public static final StringToBoolean INSTANCE = new StringToBoolean();
    private static final String name = "toBoolean";
    private static final List<FunctionArgument> declaredArgs = Collections.singletonList(new FunctionArgument(EvaluableType.STRING, false, 2, null));
    private static final EvaluableType resultType = EvaluableType.BOOLEAN;
    private static final boolean isPure = true;

    private StringToBoolean() {
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        boolean z;
        String str = (String) j5g.Y(list);
        if (epx.f(str, "true")) {
            z = true;
        } else {
            if (!epx.f(str, CredentialEntry.FALSE_STRING)) {
                EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, "Unable to convert value to Boolean.", null, 8, null);
                throw new KotlinNothingValueException();
            }
            z = false;
        }
        return Boolean.valueOf(z);
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
