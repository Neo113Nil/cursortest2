package com.yandex.div.core.animation;

import com.yandex.div.data.Variable;

/* compiled from: VariableProperties.kt */
/* loaded from: classes7.dex */
public final class IntegerValueProperty extends IntegerProperty<Variable.IntegerVariable> {
    public static final IntegerValueProperty INSTANCE = new IntegerValueProperty();

    private IntegerValueProperty() {
        super("value");
    }

    @Override // android.util.Property
    public Integer get(Variable.IntegerVariable integerVariable) {
        return Integer.valueOf((int) ((Long) integerVariable.getValue()).longValue());
    }

    @Override // com.yandex.div.core.animation.IntegerProperty
    public void setValue(Variable.IntegerVariable integerVariable, int i) {
        integerVariable.setValueDirectly(Long.valueOf(i));
    }
}
