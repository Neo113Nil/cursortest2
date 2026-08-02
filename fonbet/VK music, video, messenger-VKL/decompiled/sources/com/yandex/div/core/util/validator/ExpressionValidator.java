package com.yandex.div.core.util.validator;

import xsna.gzs;

/* compiled from: ExpressionValidator.kt */
/* loaded from: classes7.dex */
public final class ExpressionValidator extends BaseValidator {
    private final gzs<Boolean> calculateExpression;

    public ExpressionValidator(boolean z, gzs<Boolean> gzsVar) {
        super(z);
        this.calculateExpression = gzsVar;
    }

    @Override // com.yandex.div.core.util.validator.BaseValidator
    public boolean validate(String str) {
        return (getAllowEmpty() && str.length() == 0) || this.calculateExpression.invoke().booleanValue();
    }
}
