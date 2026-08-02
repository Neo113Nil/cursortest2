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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcBannerEnabledConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NfcBannerEnabledConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableBooleanAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcBannerEnabledConfigJsonAdapter extends JsonAdapter<NfcBannerEnabledConfig> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("wallet", "split", "corp_card", "pro", "external", "yellow");

    public NfcBannerEnabledConfigJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "wallet");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "external");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NfcBannerEnabledConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("wallet", "wallet", jsonReader);
                    }
                    break;
                case 1:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("split", "split", jsonReader);
                    }
                    break;
                case 2:
                    bool3 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull("corpcard", "corp_card", jsonReader);
                    }
                    break;
                case 3:
                    bool4 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool4 == null) {
                        throw Util.unexpectedNull("pro", "pro", jsonReader);
                    }
                    break;
                case 4:
                    bool5 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    bool6 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (bool == null) {
            throw Util.missingProperty("wallet", "wallet", jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 == null) {
            throw Util.missingProperty("split", "split", jsonReader);
        }
        boolean booleanValue2 = bool2.booleanValue();
        if (bool3 == null) {
            throw Util.missingProperty("corpcard", "corp_card", jsonReader);
        }
        boolean booleanValue3 = bool3.booleanValue();
        if (bool4 != null) {
            return new NfcBannerEnabledConfig(booleanValue, booleanValue2, booleanValue3, bool4.booleanValue(), bool5, bool6);
        }
        throw Util.missingProperty("pro", "pro", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NfcBannerEnabledConfig nfcBannerEnabledConfig) {
        NfcBannerEnabledConfig nfcBannerEnabledConfig2 = nfcBannerEnabledConfig;
        if (nfcBannerEnabledConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("wallet");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(nfcBannerEnabledConfig2.getWallet()));
        jsonWriter.name("split");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(nfcBannerEnabledConfig2.getSplit()));
        jsonWriter.name("corp_card");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(nfcBannerEnabledConfig2.getCorpcard()));
        jsonWriter.name("pro");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(nfcBannerEnabledConfig2.getPro()));
        jsonWriter.name("external");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) nfcBannerEnabledConfig2.getExternal());
        jsonWriter.name("yellow");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) nfcBannerEnabledConfig2.getYellow());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(NfcBannerEnabledConfig)");
    }
}
