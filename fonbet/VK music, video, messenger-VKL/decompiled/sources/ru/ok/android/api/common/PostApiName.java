package ru.ok.android.api.common;

/* compiled from: PostApiName.kt */
/* loaded from: classes9.dex */
public final class PostApiName extends BoxedApiName {
    public PostApiName(String str) {
        super(str);
    }

    @Override // ru.ok.android.api.common.BoxedApiName
    public boolean shouldPost() {
        return true;
    }

    @Override // ru.ok.android.api.common.BoxedApiName
    public PostApiParam intoParam(String str) {
        return new PostApiParam(getCanonicalName$odnoklassniki_android_api_release(), str);
    }
}
