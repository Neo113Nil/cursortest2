package com.yandex.div.core.animation;

import com.yandex.div.data.Variable;

/* compiled from: VariableProperties.kt */
/* loaded from: classes7.dex */
public final class NumberValueProperty extends FloatProperty<Variable.DoubleVariable> {
    public static final NumberValueProperty INSTANCE = new NumberValueProperty();

    private NumberValueProperty() {
        super("value");
    }

    @Override // android.util.Property
    public Float get(Variable.DoubleVariable doubleVariable) {
        return Float.valueOf((float) ((Double) doubleVariable.getValue()).doubleValue());
    }

    @Override // com.yandex.div.core.animation.FloatProperty
    public void setValue(Variable.DoubleVariable doubleVariable, float f) {
        doubleVariable.setValueDirectly(Double.valueOf(f));
    }
}
