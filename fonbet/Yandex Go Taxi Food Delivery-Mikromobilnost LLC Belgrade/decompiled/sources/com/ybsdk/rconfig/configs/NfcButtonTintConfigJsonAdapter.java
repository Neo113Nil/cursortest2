package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcButtonTintConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NfcButtonTintConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "nullableThemedParameterOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcButtonTintConfigJsonAdapter extends JsonAdapter<NfcButtonTintConfig> {
    private final JsonAdapter<ThemedParameter<String>> nullableThemedParameterOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("wallet", "split", "corp_card", "pro");

    public NfcButtonTintConfigJsonAdapter(Moshi moshi) {
        this.nullableThemedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), EmptySet.a, "wallet");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NfcButtonTintConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ThemedParameter<String> themedParameter = null;
        ThemedParameter<String> themedParameter2 = null;
        ThemedParameter<String> themedParameter3 = null;
        ThemedParameter<String> themedParameter4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                themedParameter = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                themedParameter2 = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                themedParameter3 = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                themedParameter4 = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new NfcButtonTintConfig(themedParameter, themedParameter2, themedParameter3, themedParameter4);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NfcButtonTintConfig nfcButtonTintConfig) {
        NfcButtonTintConfig nfcButtonTintConfig2 = nfcButtonTintConfig;
        if (nfcButtonTintConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("wallet");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcButtonTintConfig2.getWallet());
        jsonWriter.name("split");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcButtonTintConfig2.getSplit());
        jsonWriter.name("corp_card");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcButtonTintConfig2.getCorpcard());
        jsonWriter.name("pro");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcButtonTintConfig2.getPro());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(NfcButtonTintConfig)");
    }
}
