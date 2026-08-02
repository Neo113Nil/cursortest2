package com.yandex.div.evaluable;

import com.yandex.div.evaluable.Function;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.izs;

/* compiled from: LocalFunctionProvider.kt */
/* loaded from: classes7.dex */
public final class LocalFunctionProvider implements FunctionProvider {
    private final List<Function> functions;

    /* JADX WARN: Multi-variable type inference failed */
    public LocalFunctionProvider(List<? extends Function> list) {
        this.functions = list;
    }

    private final Function findFunction(String str, izs<? super Function, ? extends Function.MatchResult> izsVar) {
        List<Function> list = this.functions;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Function function = (Function) obj;
            if (epx.f(function.getName(), str) && epx.f(izsVar.invoke(function), Function.MatchResult.Ok.INSTANCE)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (Function) arrayList.get(0);
        }
        throw new EvaluableException("Function " + arrayList.get(0) + " declared multiple times.", null, 2, null);
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    public Function get(String str, final List<? extends EvaluableType> list) {
        Function findFunction = findFunction(str, new izs<Function, Function.MatchResult>() { // from class: com.yandex.div.evaluable.LocalFunctionProvider$get$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // xsna.izs
            public final Function.MatchResult invoke(Function function) {
                return function.matchesArguments$div_evaluable(list);
            }
        });
        if (findFunction != null) {
            return findFunction;
        }
        Function findFunction2 = findFunction(str, new izs<Function, Function.MatchResult>() { // from class: com.yandex.div.evaluable.LocalFunctionProvider$get$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // xsna.izs
            public final Function.MatchResult invoke(Function function) {
                return function.matchesArgumentsWithCast$div_evaluable(list);
            }
        });
        if (findFunction2 != null) {
            return findFunction2;
        }
        throw new MissingLocalFunctionException(str, list);
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    public Function getMethod(String str, final List<? extends EvaluableType> list) {
        Function findFunction = findFunction(str, new izs<Function, Function.MatchResult>() { // from class: com.yandex.div.evaluable.LocalFunctionProvider$getMethod$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // xsna.izs
            public final Function.MatchResult invoke(Function function) {
                return function.matchesArguments$div_evaluable(list);
            }
        });
        if (findFunction != null) {
            return findFunction;
        }
        Function findFunction2 = findFunction(str, new izs<Function, Function.MatchResult>() { // from class: com.yandex.div.evaluable.LocalFunctionProvider$getMethod$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // xsna.izs
            public final Function.MatchResult invoke(Function function) {
                return function.matchesArgumentsWithCast$div_evaluable(list);
            }
        });
        if (findFunction2 != null) {
            return findFunction2;
        }
        throw new MissingLocalFunctionException(str, list);
    }
}
