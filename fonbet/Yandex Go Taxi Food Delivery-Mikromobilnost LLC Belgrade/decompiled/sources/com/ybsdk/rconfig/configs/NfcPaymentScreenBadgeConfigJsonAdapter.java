package com.ybsdk.rconfig.configs;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.rconfig.model.ThemedImage;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "themedParameterOfStringAdapter", "Lcom/ybsdk/rconfig/model/ThemedImage;", "nullableThemedImageAdapter", "nullableStringAdapter", "", "booleanAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcPaymentScreenBadgeConfigJsonAdapter extends JsonAdapter<NfcPaymentScreenBadgeConfig> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<ThemedImage> nullableThemedImageAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("text", "text_color", "back_color", "icon", Constants.DEEPLINK, "deeplink_new", BackendConfig.Restrictions.ENABLED);
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;

    public NfcPaymentScreenBadgeConfigJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.themedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "textColor");
        this.nullableThemedImageAdapter = moshi.adapter(ThemedImage.class, emptySet, "icon");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "deeplinkNew");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, BackendConfig.Restrictions.ENABLED);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NfcPaymentScreenBadgeConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        String str = null;
        ThemedParameter<String> themedParameter = null;
        ThemedParameter<String> themedParameter2 = null;
        ThemedImage themedImage = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            Boolean bool2 = bool;
            if (!jsonReader.hasNext()) {
                String str4 = str;
                jsonReader.endObject();
                if (str4 == null) {
                    throw Util.missingProperty("text", "text", jsonReader);
                }
                if (themedParameter == null) {
                    throw Util.missingProperty("textColor", "text_color", jsonReader);
                }
                if (themedParameter2 == null) {
                    throw Util.missingProperty("backColor", "back_color", jsonReader);
                }
                if (str2 == null) {
                    throw Util.missingProperty("deeplinkOld", Constants.DEEPLINK, jsonReader);
                }
                if (bool2 != null) {
                    return new NfcPaymentScreenBadgeConfig(str4, themedParameter, themedParameter2, themedImage, str2, str3, bool2.booleanValue());
                }
                throw Util.missingProperty(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
            }
            String str5 = str;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bool = bool2;
                    str = str5;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("text", "text", jsonReader);
                    }
                    bool = bool2;
                case 1:
                    themedParameter = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter == null) {
                        throw Util.unexpectedNull("textColor", "text_color", jsonReader);
                    }
                    bool = bool2;
                    str = str5;
                case 2:
                    themedParameter2 = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter2 == null) {
                        throw Util.unexpectedNull("backColor", "back_color", jsonReader);
                    }
                    bool = bool2;
                    str = str5;
                case 3:
                    themedImage = this.nullableThemedImageAdapter.fromJson(jsonReader);
                    bool = bool2;
                    str = str5;
                case 4:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("deeplinkOld", Constants.DEEPLINK, jsonReader);
                    }
                    bool = bool2;
                    str = str5;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool2;
                    str = str5;
                case 6:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
                    }
                    str = str5;
                default:
                    bool = bool2;
                    str = str5;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig) {
        NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig2 = nfcPaymentScreenBadgeConfig;
        if (nfcPaymentScreenBadgeConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) nfcPaymentScreenBadgeConfig2.getText());
        jsonWriter.name("text_color");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcPaymentScreenBadgeConfig2.getTextColor());
        jsonWriter.name("back_color");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcPaymentScreenBadgeConfig2.getBackColor());
        jsonWriter.name("icon");
        this.nullableThemedImageAdapter.toJson(jsonWriter, (JsonWriter) nfcPaymentScreenBadgeConfig2.getIcon());
        jsonWriter.name(Constants.DEEPLINK);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) nfcPaymentScreenBadgeConfig2.getDeeplinkOld());
        jsonWriter.name("deeplink_new");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) nfcPaymentScreenBadgeConfig2.getDeeplinkNew());
        jsonWriter.name(BackendConfig.Restrictions.ENABLED);
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(nfcPaymentScreenBadgeConfig2.getEnabled()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(NfcPaymentScreenBadgeConfig)");
    }
}
