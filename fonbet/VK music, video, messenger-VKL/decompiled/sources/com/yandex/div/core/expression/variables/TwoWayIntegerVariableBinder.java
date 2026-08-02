package com.yandex.div.core.expression.variables;

import com.yandex.div.core.view2.errors.ErrorCollectors;

/* compiled from: TwoWayVariableBinder.kt */
/* loaded from: classes7.dex */
public class TwoWayIntegerVariableBinder extends TwoWayVariableBinder<Long> {
    public TwoWayIntegerVariableBinder(ErrorCollectors errorCollectors) {
        super(errorCollectors);
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder
    public /* bridge */ /* synthetic */ String toStringValue(Long l) {
        return toStringValue(l.longValue());
    }

    public String toStringValue(long j) {
        return String.valueOf(j);
    }
}
