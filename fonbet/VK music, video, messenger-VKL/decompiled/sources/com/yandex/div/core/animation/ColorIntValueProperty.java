package com.yandex.div.core.animation;

import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.types.Color;

/* compiled from: VariableProperties.kt */
/* loaded from: classes7.dex */
public final class ColorIntValueProperty extends IntegerProperty<Variable.ColorVariable> {
    public static final ColorIntValueProperty INSTANCE = new ColorIntValueProperty();

    private ColorIntValueProperty() {
        super("value");
    }

    @Override // android.util.Property
    public Integer get(Variable.ColorVariable colorVariable) {
        return Integer.valueOf(((Color) colorVariable.getValue()).m192unboximpl());
    }

    @Override // com.yandex.div.core.animation.IntegerProperty
    public void setValue(Variable.ColorVariable colorVariable, int i) {
        colorVariable.setValueDirectly(Color.m184boximpl(Color.m185constructorimpl(i)));
    }
}
