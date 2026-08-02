package com.yandex.div.core.expression.variables;

import com.yandex.div.evaluable.VariableProvider;
import java.util.Map;

/* compiled from: ConstantsProvider.kt */
/* loaded from: classes7.dex */
public final class ConstantsProvider implements VariableProvider {
    private final Map<String, Object> constants;

    public ConstantsProvider(Map<String, ? extends Object> map) {
        this.constants = map;
    }

    @Override // com.yandex.div.evaluable.VariableProvider
    public Object get(String str) {
        return this.constants.get(str);
    }
}
