package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.SetPushTokenParams;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/SetPushTokenParamsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/SetPushTokenParams;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/SetPushTokenParams$Environment;", "environmentAdapter", "", "booleanAdapter", "nullableStringAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SetPushTokenParamsJsonAdapter extends JsonAdapter<SetPushTokenParams> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<SetPushTokenParams.Environment> environmentAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("package_name", WebViewActivity.KEY_ENVIRONMENT, AuthSdkActivity.RESPONSE_TYPE_TOKEN, "token_type", MetaDataField.DEVICE_ID_FIELD, ClidProvider.APP_ACTIVE, "encryption_public_key", "encryption_auth_secret", "language_code");
    private final JsonAdapter<String> stringAdapter;

    public SetPushTokenParamsJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "packageName");
        this.environmentAdapter = moshi.adapter(SetPushTokenParams.Environment.class, emptySet, WebViewActivity.KEY_ENVIRONMENT);
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, ClidProvider.APP_ACTIVE);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "encryptionPublicKey");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SetPushTokenParams fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        String str = null;
        SetPushTokenParams.Environment environment = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (true) {
            Boolean bool2 = bool;
            String str8 = str;
            SetPushTokenParams.Environment environment2 = environment;
            String str9 = str2;
            if (!jsonReader.hasNext()) {
                String str10 = str3;
                jsonReader.endObject();
                if (str8 == null) {
                    throw Util.missingProperty("packageName", "package_name", jsonReader);
                }
                if (environment2 == null) {
                    throw Util.missingProperty(WebViewActivity.KEY_ENVIRONMENT, WebViewActivity.KEY_ENVIRONMENT, jsonReader);
                }
                if (str9 == null) {
                    throw Util.missingProperty(AuthSdkActivity.RESPONSE_TYPE_TOKEN, AuthSdkActivity.RESPONSE_TYPE_TOKEN, jsonReader);
                }
                if (str10 == null) {
                    throw Util.missingProperty("tokenType", "token_type", jsonReader);
                }
                if (str4 == null) {
                    throw Util.missingProperty("deviceId", MetaDataField.DEVICE_ID_FIELD, jsonReader);
                }
                if (bool2 != null) {
                    return new SetPushTokenParams(str8, environment2, str9, str10, str4, bool2.booleanValue(), str5, str6, str7);
                }
                throw Util.missingProperty(ClidProvider.APP_ACTIVE, ClidProvider.APP_ACTIVE, jsonReader);
            }
            String str11 = str3;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bool = bool2;
                    str3 = str11;
                    str = str8;
                    environment = environment2;
                    str2 = str9;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("packageName", "package_name", jsonReader);
                    }
                    bool = bool2;
                    str3 = str11;
                    environment = environment2;
                    str2 = str9;
                case 1:
                    environment = this.environmentAdapter.fromJson(jsonReader);
                    if (environment == null) {
                        throw Util.unexpectedNull(WebViewActivity.KEY_ENVIRONMENT, WebViewActivity.KEY_ENVIRONMENT, jsonReader);
                    }
                    bool = bool2;
                    str3 = str11;
                    str = str8;
                    str2 = str9;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull(AuthSdkActivity.RESPONSE_TYPE_TOKEN, AuthSdkActivity.RESPONSE_TYPE_TOKEN, jsonReader);
                    }
                    bool = bool2;
                    str3 = str11;
                    str = str8;
                    environment = environment2;
                case 3:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("tokenType", "token_type", jsonReader);
                    }
                    bool = bool2;
                    str = str8;
                    environment = environment2;
                    str2 = str9;
                case 4:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("deviceId", MetaDataField.DEVICE_ID_FIELD, jsonReader);
                    }
                    bool = bool2;
                    str3 = str11;
                    str = str8;
                    environment = environment2;
                    str2 = str9;
                case 5:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull(ClidProvider.APP_ACTIVE, ClidProvider.APP_ACTIVE, jsonReader);
                    }
                    str3 = str11;
                    str = str8;
                    environment = environment2;
                    str2 = str9;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool2;
                    str3 = str11;
                    str = str8;
                    environment = environment2;
                    str2 = str9;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool2;
                    str3 = str11;
                    str = str8;
                    environment = environment2;
                    str2 = str9;
                case 8:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool2;
                    str3 = str11;
                    str = str8;
                    environment = environment2;
                    str2 = str9;
                default:
                    bool = bool2;
                    str3 = str11;
                    str = str8;
                    environment = environment2;
                    str2 = str9;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SetPushTokenParams setPushTokenParams) {
        SetPushTokenParams setPushTokenParams2 = setPushTokenParams;
        if (setPushTokenParams2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("package_name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) setPushTokenParams2.getPackageName());
        jsonWriter.name(WebViewActivity.KEY_ENVIRONMENT);
        this.environmentAdapter.toJson(jsonWriter, (JsonWriter) setPushTokenParams2.getEnvironment());
        jsonWriter.name(AuthSdkActivity.RESPONSE_TYPE_TOKEN);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) setPushTokenParams2.getToken());
        jsonWriter.name("token_type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) setPushTokenParams2.getTokenType());
        jsonWriter.name(MetaDataField.DEVICE_ID_FIELD);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) setPushTokenParams2.getDeviceId());
        jsonWriter.name(ClidProvider.APP_ACTIVE);
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(setPushTokenParams2.getActive()));
        jsonWriter.name("encryption_public_key");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) setPushTokenParams2.getEncryptionPublicKey());
        jsonWriter.name("encryption_auth_secret");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) setPushTokenParams2.getEncryptionAuthSecret());
        jsonWriter.name("language_code");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) setPushTokenParams2.getLanguageCode());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(SetPushTokenParams)");
    }
}
