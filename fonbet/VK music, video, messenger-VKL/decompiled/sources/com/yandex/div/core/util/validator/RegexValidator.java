package com.yandex.div.core.util.validator;

import kotlin.text.Regex;

/* compiled from: RegexValidator.kt */
/* loaded from: classes7.dex */
public final class RegexValidator extends BaseValidator {
    private final Regex regex;

    public RegexValidator(Regex regex, boolean z) {
        super(z);
        this.regex = regex;
    }

    @Override // com.yandex.div.core.util.validator.BaseValidator
    public boolean validate(String str) {
        return (getAllowEmpty() && str.length() == 0) || this.regex.f(str);
    }
}
