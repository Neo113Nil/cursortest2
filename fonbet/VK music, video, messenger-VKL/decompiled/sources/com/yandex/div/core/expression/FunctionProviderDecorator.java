package com.yandex.div.core.expression;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionProvider;
import com.yandex.div.evaluable.LocalFunctionProvider;
import com.yandex.div.evaluable.MissingLocalFunctionException;
import java.util.List;

/* compiled from: FunctionProviderDecorator.kt */
/* loaded from: classes7.dex */
public final class FunctionProviderDecorator implements FunctionProvider {
    private final FunctionProvider provider;

    public FunctionProviderDecorator(FunctionProvider functionProvider) {
        this.provider = functionProvider;
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    public Function get(String str, List<? extends EvaluableType> list) {
        return this.provider.get(str, list);
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    public Function getMethod(String str, List<? extends EvaluableType> list) {
        return this.provider.getMethod(str, list);
    }

    public final FunctionProviderDecorator plus(List<? extends Function> list) {
        final LocalFunctionProvider localFunctionProvider = new LocalFunctionProvider(list);
        return new FunctionProviderDecorator(new FunctionProvider() { // from class: com.yandex.div.core.expression.FunctionProviderDecorator$plus$1
            @Override // com.yandex.div.evaluable.FunctionProvider
            public Function get(String str, List<? extends EvaluableType> list2) {
                FunctionProvider functionProvider;
                try {
                    return LocalFunctionProvider.this.get(str, list2);
                } catch (MissingLocalFunctionException unused) {
                    functionProvider = this.provider;
                    return functionProvider.get(str, list2);
                }
            }

            @Override // com.yandex.div.evaluable.FunctionProvider
            public Function getMethod(String str, List<? extends EvaluableType> list2) {
                FunctionProvider functionProvider;
                try {
                    return LocalFunctionProvider.this.getMethod(str, list2);
                } catch (MissingLocalFunctionException unused) {
                    functionProvider = this.provider;
                    return functionProvider.getMethod(str, list2);
                }
            }
        });
    }
}
