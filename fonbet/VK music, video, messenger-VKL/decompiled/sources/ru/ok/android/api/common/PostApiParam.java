package ru.ok.android.api.common;

/* compiled from: PostApiParam.kt */
/* loaded from: classes9.dex */
public final class PostApiParam extends StringishApiParam {
    public PostApiParam(String str, String str2) {
        super(str, str2);
    }

    @Override // ru.ok.android.api.core.ApiParam
    public boolean shouldPost() {
        return true;
    }
}
