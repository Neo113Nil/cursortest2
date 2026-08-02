package ru.ok.android.api.common;

/* compiled from: StringApiName.kt */
/* loaded from: classes9.dex */
public final class StringApiName extends BoxedApiName {
    public StringApiName(String str) {
        super(str);
    }

    @Override // ru.ok.android.api.common.BoxedApiName
    public StringApiParam intoParam(String str) {
        return new StringApiParam(getCanonicalName$odnoklassniki_android_api_release(), str);
    }
}
