package ru.ok.android.sdk.api.login;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.ok.android.api.common.ApiParamList;
import ru.ok.android.sdk.api.ApiRequestLoggable;
import xsna.h5s;
import xsna.zr;

/* loaded from: classes9.dex */
public class AuthTokenLoginRequest extends LoginRequest implements ApiRequestLoggable {
    public static final String METHOD_NAME = "auth.anonymLogin";

    @Nullable
    private final String authToken;

    public AuthTokenLoginRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        super(str2, str3, str4);
        this.authToken = str;
    }

    private String buildSessionData() {
        String str = this.deviceId;
        if (str == null) {
            str = LoginRequest.CLIENT_NAME;
        }
        return this.authToken != null ? h5s.d(new StringBuilder("{\"auth_token\": \""), this.authToken, "\", \"version\": 3, \"device_id\": \"", str, "\", \"client_version\": \"1.0.1\"}") : zr.a("{\"version\": 2, \"device_id\": \"", str, "\", \"client_version\": \"1.0.1\"}");
    }

    @Override // ru.ok.android.sdk.api.login.LoginRequest
    @NonNull
    public String getMethodName() {
        return "auth.anonymLogin";
    }

    @Override // ru.ok.android.sdk.api.login.LoginRequest, ru.ok.android.api.common.AbstractApiRequest
    public void populateParams(@NonNull ApiParamList apiParamList) {
        super.populateParams(apiParamList);
        apiParamList.add("session_data", buildSessionData());
    }
}
