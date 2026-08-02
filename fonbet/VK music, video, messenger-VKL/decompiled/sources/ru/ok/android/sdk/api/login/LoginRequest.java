package ru.ok.android.sdk.api.login;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.ok.android.api.common.AbstractApiRequest;
import ru.ok.android.api.common.ApiParamList;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes9.dex */
public abstract class LoginRequest extends AbstractApiRequest {
    public static final String CLIENT_NAME = "test";
    public static final String CURRENT_VERIFICATION_VER = "1";

    @Nullable
    protected final String deviceId;

    @Nullable
    protected final String referrer;

    @Nullable
    protected final String verificationToken;

    public LoginRequest(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.deviceId = str;
        this.referrer = str2;
        this.verificationToken = str3;
    }

    @NonNull
    public abstract String getMethodName();

    @Override // ru.ok.android.api.core.ApiRequest
    @NonNull
    public ApiScope getScope() {
        return ApiScope.APPLICATION;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    @NonNull
    public final Uri getUri() {
        return ApiUris.methodUri(getMethodName());
    }

    @Override // ru.ok.android.api.common.AbstractApiRequest
    public void populateParams(@NonNull ApiParamList apiParamList) {
        apiParamList.add("referrer", this.referrer);
        apiParamList.add(ApiProtocol.PARAM_DEVICE_ID, this.deviceId);
        apiParamList.add("verification_supported", true);
        apiParamList.add("verification_token", this.verificationToken);
        apiParamList.add("verification_supported_v", "1");
        apiParamList.add("client", CLIENT_NAME);
        apiParamList.add("gen_token", true);
    }
}
