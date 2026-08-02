package com.yandex.div.core.expression.variables;

import com.yandex.div.core.view2.errors.ErrorCollectors;

/* compiled from: TwoWayVariableBinder.kt */
/* loaded from: classes7.dex */
public class TwoWayStringVariableBinder extends TwoWayVariableBinder<String> {
    public TwoWayStringVariableBinder(ErrorCollectors errorCollectors) {
        super(errorCollectors);
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder
    public String toStringValue(String str) {
        return str;
    }
}
