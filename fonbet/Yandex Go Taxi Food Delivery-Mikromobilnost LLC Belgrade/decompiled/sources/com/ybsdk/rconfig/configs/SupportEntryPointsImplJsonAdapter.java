package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/rconfig/configs/SupportEntryPointsImplJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/SupportEntryPointsImpl;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SupportEntryPointsImplJsonAdapter extends JsonAdapter<SupportEntryPointsImpl> {
    private final JsonReader.Options options = JsonReader.Options.of("negative-app-feedback", "change-phone_processing", "change-phone_confirmation", "change-phone_failed-error", "simplified-identification_widget", "account-authorization_confirmation", "change-phone_confirmation-no-attempts-left", "change-phone_network-error");
    private final JsonAdapter<String> stringAdapter;

    public SupportEntryPointsImplJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, EmptySet.a, "negativeAppFeedback");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SupportEntryPointsImpl fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (true) {
            String str9 = str;
            String str10 = str2;
            String str11 = str3;
            String str12 = str4;
            String str13 = str5;
            String str14 = str6;
            String str15 = str7;
            String str16 = str8;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (str9 == null) {
                    throw Util.missingProperty("negativeAppFeedback", "negative-app-feedback", jsonReader);
                }
                if (str10 == null) {
                    throw Util.missingProperty("changePhoneProcessing", "change-phone_processing", jsonReader);
                }
                if (str11 == null) {
                    throw Util.missingProperty("changePhoneConfirmation", "change-phone_confirmation", jsonReader);
                }
                if (str12 == null) {
                    throw Util.missingProperty("changePhoneFailed", "change-phone_failed-error", jsonReader);
                }
                if (str13 == null) {
                    throw Util.missingProperty("simplifiedIdentificationWidget", "simplified-identification_widget", jsonReader);
                }
                if (str14 == null) {
                    throw Util.missingProperty("accountAuthorizationConfirmation", "account-authorization_confirmation", jsonReader);
                }
                if (str15 == null) {
                    throw Util.missingProperty("changePhoneConfirmationNoAttemptsLeft", "change-phone_confirmation-no-attempts-left", jsonReader);
                }
                if (str16 != null) {
                    return new SupportEntryPointsImpl(str9, str10, str11, str12, str13, str14, str15, str16);
                }
                throw Util.missingProperty("changePhoneNetworkError", "change-phone_network-error", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("negativeAppFeedback", "negative-app-feedback", jsonReader);
                    }
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("changePhoneProcessing", "change-phone_processing", jsonReader);
                    }
                    str = str9;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("changePhoneConfirmation", "change-phone_confirmation", jsonReader);
                    }
                    str = str9;
                    str2 = str10;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 3:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("changePhoneFailed", "change-phone_failed-error", jsonReader);
                    }
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 4:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("simplifiedIdentificationWidget", "simplified-identification_widget", jsonReader);
                    }
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 5:
                    String fromJson = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("accountAuthorizationConfirmation", "account-authorization_confirmation", jsonReader);
                    }
                    str6 = fromJson;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str7 = str15;
                    str8 = str16;
                case 6:
                    String fromJson2 = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson2 == null) {
                        throw Util.unexpectedNull("changePhoneConfirmationNoAttemptsLeft", "change-phone_confirmation-no-attempts-left", jsonReader);
                    }
                    str7 = fromJson2;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str8 = str16;
                case 7:
                    str8 = this.stringAdapter.fromJson(jsonReader);
                    if (str8 == null) {
                        throw Util.unexpectedNull("changePhoneNetworkError", "change-phone_network-error", jsonReader);
                    }
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                default:
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SupportEntryPointsImpl supportEntryPointsImpl) {
        SupportEntryPointsImpl supportEntryPointsImpl2 = supportEntryPointsImpl;
        if (supportEntryPointsImpl2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("negative-app-feedback");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) supportEntryPointsImpl2.getNegativeAppFeedback());
        jsonWriter.name("change-phone_processing");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) supportEntryPointsImpl2.getChangePhoneProcessing());
        jsonWriter.name("change-phone_confirmation");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) supportEntryPointsImpl2.getChangePhoneConfirmation());
        jsonWriter.name("change-phone_failed-error");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) supportEntryPointsImpl2.getChangePhoneFailed());
        jsonWriter.name("simplified-identification_widget");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) supportEntryPointsImpl2.getSimplifiedIdentificationWidget());
        jsonWriter.name("account-authorization_confirmation");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) supportEntryPointsImpl2.getAccountAuthorizationConfirmation());
        jsonWriter.name("change-phone_confirmation-no-attempts-left");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) supportEntryPointsImpl2.getChangePhoneConfirmationNoAttemptsLeft());
        jsonWriter.name("change-phone_network-error");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) supportEntryPointsImpl2.getChangePhoneNetworkError());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(SupportEntryPointsImpl)");
    }
}
