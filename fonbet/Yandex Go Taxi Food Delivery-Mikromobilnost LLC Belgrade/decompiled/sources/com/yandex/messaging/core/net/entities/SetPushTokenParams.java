package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eBU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fBY\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/SetPushTokenParams;", "", "packageName", "", WebViewActivity.KEY_ENVIRONMENT, "Lcom/yandex/messaging/core/net/entities/SetPushTokenParams$Environment;", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "tokenType", "deviceId", ClidProvider.APP_ACTIVE, "", "encryptionPublicKey", "encryptionAuthSecret", "languageCode", "<init>", "(Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/SetPushTokenParams$Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "deviceModel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "getEnvironment", "()Lcom/yandex/messaging/core/net/entities/SetPushTokenParams$Environment;", "getToken", "getTokenType", "getDeviceId", "getActive", "()Z", "getEncryptionPublicKey", "getEncryptionAuthSecret", "getLanguageCode", "Environment", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SetPushTokenParams {

    @Json(name = ClidProvider.APP_ACTIVE)
    private final boolean active;

    @Json(name = MetaDataField.DEVICE_ID_FIELD)
    private final String deviceId;

    @Json(name = "encryption_auth_secret")
    private final String encryptionAuthSecret;

    @Json(name = "encryption_public_key")
    private final String encryptionPublicKey;

    @Json(name = WebViewActivity.KEY_ENVIRONMENT)
    private final Environment environment;

    @Json(name = "language_code")
    private final String languageCode;

    @Json(name = "package_name")
    private final String packageName;

    @Json(name = AuthSdkActivity.RESPONSE_TYPE_TOKEN)
    private final String token;

    @Json(name = "token_type")
    private final String tokenType;

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/messaging/core/net/entities/SetPushTokenParams$Environment;", "", "deviceModel", "", "<init>", "(Ljava/lang/String;)V", "getDeviceModel", "()Ljava/lang/String;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Environment {

        @Json(name = MetaDataField.DEVICE_MODEL_FIELD)
        private final String deviceModel;

        public Environment(String str) {
            this.deviceModel = str;
        }

        public final String getDeviceModel() {
            return this.deviceModel;
        }
    }

    public SetPushTokenParams(String str, Environment environment, String str2, String str3, String str4, boolean z, String str5, String str6, String str7) {
        this.packageName = str;
        this.environment = environment;
        this.token = str2;
        this.tokenType = str3;
        this.deviceId = str4;
        this.active = z;
        this.encryptionPublicKey = str5;
        this.encryptionAuthSecret = str6;
        this.languageCode = str7;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getEncryptionAuthSecret() {
        return this.encryptionAuthSecret;
    }

    public final String getEncryptionPublicKey() {
        return this.encryptionPublicKey;
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public SetPushTokenParams(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8) {
        this(str, new Environment(str2), str3, str4, str5, z, str6, str7, str8);
    }
}
