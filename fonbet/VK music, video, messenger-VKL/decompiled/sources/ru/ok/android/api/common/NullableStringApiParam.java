package ru.ok.android.api.common;

/* compiled from: NullableStringApiParam.kt */
/* loaded from: classes9.dex */
public final class NullableStringApiParam extends StringishApiParam {
    public NullableStringApiParam(String str, String str2) {
        super(str, str2);
    }

    @Override // ru.ok.android.api.common.StringishApiParam, ru.ok.android.api.common.RefApiParam
    public boolean shouldSkip() {
        return false;
    }
}
