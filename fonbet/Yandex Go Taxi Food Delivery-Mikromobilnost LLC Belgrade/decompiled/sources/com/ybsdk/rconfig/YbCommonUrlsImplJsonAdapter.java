package com.ybsdk.rconfig;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/rconfig/YbCommonUrlsImplJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/YbCommonUrlsImpl;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YbCommonUrlsImplJsonAdapter extends JsonAdapter<YbCommonUrlsImpl> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("account_status", "account_tariff", "faq", "federal_tax_service", "bank", "documents", "mir_pay_manual", "bank_frontend_url", "help_center", "help_center-plus_card", "app_legal", "simplified_identification_info");
    private final JsonAdapter<String> stringAdapter;

    public YbCommonUrlsImplJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "accountStatusUrl");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "simplifiedIdentificationInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final YbCommonUrlsImpl fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        while (true) {
            String str13 = str;
            String str14 = str2;
            String str15 = str3;
            String str16 = str4;
            String str17 = str5;
            String str18 = str6;
            String str19 = str7;
            String str20 = str8;
            String str21 = str9;
            String str22 = str10;
            String str23 = str11;
            String str24 = str12;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (str13 == null) {
                    throw Util.missingProperty("accountStatusUrl", "account_status", jsonReader);
                }
                if (str14 == null) {
                    throw Util.missingProperty("accountTariffUrl", "account_tariff", jsonReader);
                }
                if (str15 == null) {
                    throw Util.missingProperty("faqUrl", "faq", jsonReader);
                }
                if (str16 == null) {
                    throw Util.missingProperty("taxServiceUrl", "federal_tax_service", jsonReader);
                }
                if (str17 == null) {
                    throw Util.missingProperty("ybUrl", "bank", jsonReader);
                }
                if (str18 == null) {
                    throw Util.missingProperty("documentsUrl", "documents", jsonReader);
                }
                if (str19 == null) {
                    throw Util.missingProperty("mirPayManual", "mir_pay_manual", jsonReader);
                }
                if (str20 == null) {
                    throw Util.missingProperty("ybFrontendUrl", "bank_frontend_url", jsonReader);
                }
                if (str21 == null) {
                    throw Util.missingProperty("helpCenter", "help_center", jsonReader);
                }
                if (str22 == null) {
                    throw Util.missingProperty("helpCenterPlusCard", "help_center-plus_card", jsonReader);
                }
                if (str23 != null) {
                    return new YbCommonUrlsImpl(str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24);
                }
                throw Util.missingProperty("agreementUrl", "app_legal", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                    str12 = str24;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("accountStatusUrl", "account_status", jsonReader);
                    }
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                    str12 = str24;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("accountTariffUrl", "account_tariff", jsonReader);
                    }
                    str = str13;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                    str12 = str24;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("faqUrl", "faq", jsonReader);
                    }
                    str = str13;
                    str2 = str14;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                    str12 = str24;
                case 3:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("taxServiceUrl", "federal_tax_service", jsonReader);
                    }
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                    str12 = str24;
                case 4:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("ybUrl", "bank", jsonReader);
                    }
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                    str12 = str24;
                case 5:
                    str6 = this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        throw Util.unexpectedNull("documentsUrl", "documents", jsonReader);
                    }
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                    str12 = str24;
                case 6:
                    str7 = this.stringAdapter.fromJson(jsonReader);
                    if (str7 == null) {
                        throw Util.unexpectedNull("mirPayManual", "mir_pay_manual", jsonReader);
                    }
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                    str12 = str24;
                case 7:
                    str8 = this.stringAdapter.fromJson(jsonReader);
                    if (str8 == null) {
                        throw Util.unexpectedNull("ybFrontendUrl", "bank_frontend_url", jsonReader);
                    }
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                    str12 = str24;
                case 8:
                    str9 = this.stringAdapter.fromJson(jsonReader);
                    if (str9 == null) {
                        throw Util.unexpectedNull("helpCenter", "help_center", jsonReader);
                    }
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str10 = str22;
                    str11 = str23;
                    str12 = str24;
                case 9:
                    str10 = this.stringAdapter.fromJson(jsonReader);
                    if (str10 == null) {
                        throw Util.unexpectedNull("helpCenterPlusCard", "help_center-plus_card", jsonReader);
                    }
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str11 = str23;
                    str12 = str24;
                case 10:
                    str11 = this.stringAdapter.fromJson(jsonReader);
                    if (str11 == null) {
                        throw Util.unexpectedNull("agreementUrl", "app_legal", jsonReader);
                    }
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str12 = str24;
                case 11:
                    str12 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                default:
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                    str12 = str24;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, YbCommonUrlsImpl ybCommonUrlsImpl) {
        YbCommonUrlsImpl ybCommonUrlsImpl2 = ybCommonUrlsImpl;
        if (ybCommonUrlsImpl2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("account_status");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybCommonUrlsImpl2.getAccountStatusUrl());
        jsonWriter.name("account_tariff");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybCommonUrlsImpl2.getAccountTariffUrl());
        jsonWriter.name("faq");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybCommonUrlsImpl2.getFaqUrl());
        jsonWriter.name("federal_tax_service");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybCommonUrlsImpl2.getTaxServiceUrl());
        jsonWriter.name("bank");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybCommonUrlsImpl2.getYbUrl());
        jsonWriter.name("documents");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybCommonUrlsImpl2.getDocumentsUrl());
        jsonWriter.name("mir_pay_manual");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybCommonUrlsImpl2.getMirPayManual());
        jsonWriter.name("bank_frontend_url");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybCommonUrlsImpl2.getYbFrontendUrl());
        jsonWriter.name("help_center");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybCommonUrlsImpl2.getHelpCenter());
        jsonWriter.name("help_center-plus_card");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybCommonUrlsImpl2.getHelpCenterPlusCard());
        jsonWriter.name("app_legal");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybCommonUrlsImpl2.getAgreementUrl());
        jsonWriter.name("simplified_identification_info");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) ybCommonUrlsImpl2.getSimplifiedIdentificationInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(YbCommonUrlsImpl)");
    }
}
