package com.yandex.div.core.util.validator;

/* compiled from: BaseValidator.kt */
/* loaded from: classes7.dex */
public abstract class BaseValidator {
    private final boolean allowEmpty;

    public BaseValidator(boolean z) {
        this.allowEmpty = z;
    }

    public final boolean getAllowEmpty() {
        return this.allowEmpty;
    }

    public abstract boolean validate(String str);
}
