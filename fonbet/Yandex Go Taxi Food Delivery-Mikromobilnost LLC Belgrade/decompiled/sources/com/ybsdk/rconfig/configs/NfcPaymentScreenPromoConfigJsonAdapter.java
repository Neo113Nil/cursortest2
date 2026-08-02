package com.ybsdk.rconfig.configs;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.rconfig.model.ThemedImage;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcPaymentScreenPromoConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NfcPaymentScreenPromoConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/rconfig/model/ThemedImage;", "themedImageAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableStringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcPaymentScreenPromoConfigJsonAdapter extends JsonAdapter<NfcPaymentScreenPromoConfig> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("icon", "title", "subtitle", "button", Constants.DEEPLINK, "deeplink_new");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<ThemedImage> themedImageAdapter;

    public NfcPaymentScreenPromoConfigJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.themedImageAdapter = moshi.adapter(ThemedImage.class, emptySet, "icon");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "deeplinkNew");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NfcPaymentScreenPromoConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ThemedImage themedImage = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    themedImage = this.themedImageAdapter.fromJson(jsonReader);
                    if (themedImage == null) {
                        throw Util.unexpectedNull("icon", "icon", jsonReader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
                    }
                    break;
                case 3:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("button", "button", jsonReader);
                    }
                    break;
                case 4:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("deeplinkOld", Constants.DEEPLINK, jsonReader);
                    }
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (themedImage == null) {
            throw Util.missingProperty("icon", "icon", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("subtitle", "subtitle", jsonReader);
        }
        if (str3 == null) {
            throw Util.missingProperty("button", "button", jsonReader);
        }
        if (str4 != null) {
            return new NfcPaymentScreenPromoConfig(themedImage, str, str2, str3, str4, str5);
        }
        throw Util.missingProperty("deeplinkOld", Constants.DEEPLINK, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NfcPaymentScreenPromoConfig nfcPaymentScreenPromoConfig) {
        NfcPaymentScreenPromoConfig nfcPaymentScreenPromoConfig2 = nfcPaymentScreenPromoConfig;
        if (nfcPaymentScreenPromoConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("icon");
        this.themedImageAdapter.toJson(jsonWriter, (JsonWriter) nfcPaymentScreenPromoConfig2.getIcon());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) nfcPaymentScreenPromoConfig2.getTitle());
        jsonWriter.name("subtitle");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) nfcPaymentScreenPromoConfig2.getSubtitle());
        jsonWriter.name("button");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) nfcPaymentScreenPromoConfig2.getButton());
        jsonWriter.name(Constants.DEEPLINK);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) nfcPaymentScreenPromoConfig2.getDeeplinkOld());
        jsonWriter.name("deeplink_new");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) nfcPaymentScreenPromoConfig2.getDeeplinkNew());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(NfcPaymentScreenPromoConfig)");
    }
}
