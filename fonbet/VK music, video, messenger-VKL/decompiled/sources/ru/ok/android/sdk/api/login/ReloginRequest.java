package ru.ok.android.sdk.api.login;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.ok.android.api.common.ApiParamList;

/* loaded from: classes9.dex */
public class ReloginRequest extends LoginRequest {
    public static final String METHOD_NAME = "auth.loginByToken";

    @NonNull
    private final String token;

    public ReloginRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @NonNull String str4) {
        super(str, str2, str3);
        this.token = str4;
    }

    @Override // ru.ok.android.sdk.api.login.LoginRequest
    @NonNull
    public String getMethodName() {
        return METHOD_NAME;
    }

    @Override // ru.ok.android.sdk.api.login.LoginRequest, ru.ok.android.api.common.AbstractApiRequest
    public void populateParams(@NonNull ApiParamList apiParamList) {
        super.populateParams(apiParamList);
        apiParamList.add("token", this.token);
    }
}
