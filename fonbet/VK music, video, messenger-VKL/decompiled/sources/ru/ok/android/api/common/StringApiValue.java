package ru.ok.android.api.common;

import ru.ok.android.api.core.ApiParam;

/* compiled from: StringApiValue.kt */
/* loaded from: classes9.dex */
public final class StringApiValue extends StringishApiValue {
    public StringApiValue(String str) {
        super(str);
    }

    @Override // ru.ok.android.api.common.BoxedApiValue
    public ApiParam intoParam(String str) {
        return new StringApiParam(str, getValue());
    }
}
