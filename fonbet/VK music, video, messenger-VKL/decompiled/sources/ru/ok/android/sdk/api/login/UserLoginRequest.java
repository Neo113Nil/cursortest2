package ru.ok.android.sdk.api.login;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.ok.android.api.common.ApiParamList;
import ru.ok.android.api.common.SensitiveApiValue;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;

/* loaded from: classes9.dex */
public class UserLoginRequest extends LoginRequest {

    @NonNull
    private final String password;

    @NonNull
    private final String username;

    public UserLoginRequest(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        super(str5, str4, str3);
        this.username = str;
        this.password = str2;
    }

    @Override // ru.ok.android.sdk.api.login.LoginRequest
    @NonNull
    public String getMethodName() {
        return "auth.login";
    }

    @Override // ru.ok.android.sdk.api.login.LoginRequest, ru.ok.android.api.common.AbstractApiRequest
    public void populateParams(@NonNull ApiParamList apiParamList) {
        super.populateParams(apiParamList);
        apiParamList.add(LoginApiConstants.PARAM_NAME_PASSWORD, new SensitiveApiValue(this.password));
        apiParamList.add(LoginApiConstants.PARAM_NAME_USERNAME, this.username);
    }
}
