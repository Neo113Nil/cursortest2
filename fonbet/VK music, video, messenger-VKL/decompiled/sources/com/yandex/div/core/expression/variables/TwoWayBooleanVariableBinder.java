package com.yandex.div.core.expression.variables;

import com.yandex.div.core.view2.errors.ErrorCollectors;

/* compiled from: TwoWayVariableBinder.kt */
/* loaded from: classes7.dex */
public class TwoWayBooleanVariableBinder extends TwoWayVariableBinder<Boolean> {
    public TwoWayBooleanVariableBinder(ErrorCollectors errorCollectors) {
        super(errorCollectors);
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder
    public /* bridge */ /* synthetic */ String toStringValue(Boolean bool) {
        return toStringValue(bool.booleanValue());
    }

    public String toStringValue(boolean z) {
        return String.valueOf(z);
    }
}
