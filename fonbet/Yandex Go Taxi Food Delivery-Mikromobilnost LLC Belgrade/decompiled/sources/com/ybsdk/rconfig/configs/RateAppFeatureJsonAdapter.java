package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.utils.text.Text;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/rconfig/configs/RateAppFeatureJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/RateAppFeature;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lcom/ybsdk/core/utils/text/Text;", "textAdapter", "", "", "nullableListOfStringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RateAppFeatureJsonAdapter extends JsonAdapter<RateAppFeature> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_enabled", "showing_count", "transaction_count", "show_period_in_days", "rate_title_text", "rate_description_text", "rate_positive_text", "rate_negative_text", "negative_title_text", "negative_description_text", "negative_support_button_text", "negative_close_button_text", "supported_stores");
    private final JsonAdapter<Text> textAdapter;

    public RateAppFeatureJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "isEnabled");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "showingCount");
        this.textAdapter = moshi.adapter(Text.class, emptySet, "rateTitleText");
        this.nullableListOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "supportedStores");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RateAppFeature fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Text text = null;
        Text text2 = null;
        Text text3 = null;
        Text text4 = null;
        Text text5 = null;
        Text text6 = null;
        Text text7 = null;
        Text text8 = null;
        List<String> list = null;
        while (true) {
            Boolean bool2 = bool;
            Integer num4 = num;
            Integer num5 = num2;
            Integer num6 = num3;
            Text text9 = text;
            Text text10 = text2;
            Text text11 = text3;
            Text text12 = text4;
            Text text13 = text5;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (bool2 == null) {
                    throw Util.missingProperty("isEnabled", "is_enabled", jsonReader);
                }
                boolean booleanValue = bool2.booleanValue();
                if (num4 == null) {
                    throw Util.missingProperty("showingCount", "showing_count", jsonReader);
                }
                int intValue = num4.intValue();
                if (num5 == null) {
                    throw Util.missingProperty("transactionCount", "transaction_count", jsonReader);
                }
                int intValue2 = num5.intValue();
                if (num6 == null) {
                    throw Util.missingProperty("showPeriodInDays", "show_period_in_days", jsonReader);
                }
                int intValue3 = num6.intValue();
                if (text9 == null) {
                    throw Util.missingProperty("rateTitleText", "rate_title_text", jsonReader);
                }
                if (text10 == null) {
                    throw Util.missingProperty("rateDescriptionText", "rate_description_text", jsonReader);
                }
                if (text11 == null) {
                    throw Util.missingProperty("ratePositiveText", "rate_positive_text", jsonReader);
                }
                if (text12 == null) {
                    throw Util.missingProperty("rateNegativeText", "rate_negative_text", jsonReader);
                }
                if (text13 == null) {
                    throw Util.missingProperty("negativeTitleText", "negative_title_text", jsonReader);
                }
                if (text6 == null) {
                    throw Util.missingProperty("negativeDescriptionText", "negative_description_text", jsonReader);
                }
                if (text7 == null) {
                    throw Util.missingProperty("negativeSupportButtonText", "negative_support_button_text", jsonReader);
                }
                if (text8 != null) {
                    return new RateAppFeature(booleanValue, intValue, intValue2, intValue3, text9, text10, text11, text12, text13, text6, text7, text8, list);
                }
                throw Util.missingProperty("negativeCloseButtonText", "negative_close_button_text", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bool = bool2;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    text = text9;
                    text2 = text10;
                    text3 = text11;
                    text4 = text12;
                    text5 = text13;
                case 0:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("isEnabled", "is_enabled", jsonReader);
                    }
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    text = text9;
                    text2 = text10;
                    text3 = text11;
                    text4 = text12;
                    text5 = text13;
                case 1:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("showingCount", "showing_count", jsonReader);
                    }
                    bool = bool2;
                    num2 = num5;
                    num3 = num6;
                    text = text9;
                    text2 = text10;
                    text3 = text11;
                    text4 = text12;
                    text5 = text13;
                case 2:
                    num2 = this.intAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        throw Util.unexpectedNull("transactionCount", "transaction_count", jsonReader);
                    }
                    bool = bool2;
                    num = num4;
                    num3 = num6;
                    text = text9;
                    text2 = text10;
                    text3 = text11;
                    text4 = text12;
                    text5 = text13;
                case 3:
                    num3 = this.intAdapter.fromJson(jsonReader);
                    if (num3 == null) {
                        throw Util.unexpectedNull("showPeriodInDays", "show_period_in_days", jsonReader);
                    }
                    bool = bool2;
                    num = num4;
                    num2 = num5;
                    text = text9;
                    text2 = text10;
                    text3 = text11;
                    text4 = text12;
                    text5 = text13;
                case 4:
                    text = this.textAdapter.fromJson(jsonReader);
                    if (text == null) {
                        throw Util.unexpectedNull("rateTitleText", "rate_title_text", jsonReader);
                    }
                    bool = bool2;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    text2 = text10;
                    text3 = text11;
                    text4 = text12;
                    text5 = text13;
                case 5:
                    text2 = this.textAdapter.fromJson(jsonReader);
                    if (text2 == null) {
                        throw Util.unexpectedNull("rateDescriptionText", "rate_description_text", jsonReader);
                    }
                    bool = bool2;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    text = text9;
                    text3 = text11;
                    text4 = text12;
                    text5 = text13;
                case 6:
                    text3 = this.textAdapter.fromJson(jsonReader);
                    if (text3 == null) {
                        throw Util.unexpectedNull("ratePositiveText", "rate_positive_text", jsonReader);
                    }
                    bool = bool2;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    text = text9;
                    text2 = text10;
                    text4 = text12;
                    text5 = text13;
                case 7:
                    text4 = this.textAdapter.fromJson(jsonReader);
                    if (text4 == null) {
                        throw Util.unexpectedNull("rateNegativeText", "rate_negative_text", jsonReader);
                    }
                    bool = bool2;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    text = text9;
                    text2 = text10;
                    text3 = text11;
                    text5 = text13;
                case 8:
                    text5 = this.textAdapter.fromJson(jsonReader);
                    if (text5 == null) {
                        throw Util.unexpectedNull("negativeTitleText", "negative_title_text", jsonReader);
                    }
                    bool = bool2;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    text = text9;
                    text2 = text10;
                    text3 = text11;
                    text4 = text12;
                case 9:
                    text6 = this.textAdapter.fromJson(jsonReader);
                    if (text6 == null) {
                        throw Util.unexpectedNull("negativeDescriptionText", "negative_description_text", jsonReader);
                    }
                    bool = bool2;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    text = text9;
                    text2 = text10;
                    text3 = text11;
                    text4 = text12;
                    text5 = text13;
                case 10:
                    text7 = this.textAdapter.fromJson(jsonReader);
                    if (text7 == null) {
                        throw Util.unexpectedNull("negativeSupportButtonText", "negative_support_button_text", jsonReader);
                    }
                    bool = bool2;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    text = text9;
                    text2 = text10;
                    text3 = text11;
                    text4 = text12;
                    text5 = text13;
                case 11:
                    text8 = this.textAdapter.fromJson(jsonReader);
                    if (text8 == null) {
                        throw Util.unexpectedNull("negativeCloseButtonText", "negative_close_button_text", jsonReader);
                    }
                    bool = bool2;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    text = text9;
                    text2 = text10;
                    text3 = text11;
                    text4 = text12;
                    text5 = text13;
                case 12:
                    list = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    bool = bool2;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    text = text9;
                    text2 = text10;
                    text3 = text11;
                    text4 = text12;
                    text5 = text13;
                default:
                    bool = bool2;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    text = text9;
                    text2 = text10;
                    text3 = text11;
                    text4 = text12;
                    text5 = text13;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RateAppFeature rateAppFeature) {
        RateAppFeature rateAppFeature2 = rateAppFeature;
        if (rateAppFeature2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(rateAppFeature2.isEnabled()));
        jsonWriter.name("showing_count");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(rateAppFeature2.getShowingCount()));
        jsonWriter.name("transaction_count");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(rateAppFeature2.getTransactionCount()));
        jsonWriter.name("show_period_in_days");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(rateAppFeature2.getShowPeriodInDays()));
        jsonWriter.name("rate_title_text");
        this.textAdapter.toJson(jsonWriter, (JsonWriter) rateAppFeature2.getRateTitleText());
        jsonWriter.name("rate_description_text");
        this.textAdapter.toJson(jsonWriter, (JsonWriter) rateAppFeature2.getRateDescriptionText());
        jsonWriter.name("rate_positive_text");
        this.textAdapter.toJson(jsonWriter, (JsonWriter) rateAppFeature2.getRatePositiveText());
        jsonWriter.name("rate_negative_text");
        this.textAdapter.toJson(jsonWriter, (JsonWriter) rateAppFeature2.getRateNegativeText());
        jsonWriter.name("negative_title_text");
        this.textAdapter.toJson(jsonWriter, (JsonWriter) rateAppFeature2.getNegativeTitleText());
        jsonWriter.name("negative_description_text");
        this.textAdapter.toJson(jsonWriter, (JsonWriter) rateAppFeature2.getNegativeDescriptionText());
        jsonWriter.name("negative_support_button_text");
        this.textAdapter.toJson(jsonWriter, (JsonWriter) rateAppFeature2.getNegativeSupportButtonText());
        jsonWriter.name("negative_close_button_text");
        this.textAdapter.toJson(jsonWriter, (JsonWriter) rateAppFeature2.getNegativeCloseButtonText());
        jsonWriter.name("supported_stores");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) rateAppFeature2.getSupportedStores());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(RateAppFeature)");
    }
}
