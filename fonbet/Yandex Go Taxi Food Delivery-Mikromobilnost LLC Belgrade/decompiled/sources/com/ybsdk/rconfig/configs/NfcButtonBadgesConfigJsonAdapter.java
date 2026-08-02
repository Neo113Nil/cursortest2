package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcButtonBadgesConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NfcButtonBadgesConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;", "nullableNfcButtonBadgeConfigAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcButtonBadgesConfigJsonAdapter extends JsonAdapter<NfcButtonBadgesConfig> {
    private final JsonAdapter<NfcButtonBadgeConfig> nullableNfcButtonBadgeConfigAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("wallet", "split", "corp_card", "pro", "external", "yellow");

    public NfcButtonBadgesConfigJsonAdapter(Moshi moshi) {
        this.nullableNfcButtonBadgeConfigAdapter = moshi.adapter(NfcButtonBadgeConfig.class, EmptySet.a, "wallet");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NfcButtonBadgesConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        NfcButtonBadgeConfig nfcButtonBadgeConfig = null;
        NfcButtonBadgeConfig nfcButtonBadgeConfig2 = null;
        NfcButtonBadgeConfig nfcButtonBadgeConfig3 = null;
        NfcButtonBadgeConfig nfcButtonBadgeConfig4 = null;
        NfcButtonBadgeConfig nfcButtonBadgeConfig5 = null;
        NfcButtonBadgeConfig nfcButtonBadgeConfig6 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    nfcButtonBadgeConfig = this.nullableNfcButtonBadgeConfigAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    nfcButtonBadgeConfig2 = this.nullableNfcButtonBadgeConfigAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    nfcButtonBadgeConfig3 = this.nullableNfcButtonBadgeConfigAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    nfcButtonBadgeConfig4 = this.nullableNfcButtonBadgeConfigAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    nfcButtonBadgeConfig5 = this.nullableNfcButtonBadgeConfigAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    nfcButtonBadgeConfig6 = this.nullableNfcButtonBadgeConfigAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        return new NfcButtonBadgesConfig(nfcButtonBadgeConfig, nfcButtonBadgeConfig2, nfcButtonBadgeConfig3, nfcButtonBadgeConfig4, nfcButtonBadgeConfig5, nfcButtonBadgeConfig6);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NfcButtonBadgesConfig nfcButtonBadgesConfig) {
        NfcButtonBadgesConfig nfcButtonBadgesConfig2 = nfcButtonBadgesConfig;
        if (nfcButtonBadgesConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("wallet");
        this.nullableNfcButtonBadgeConfigAdapter.toJson(jsonWriter, (JsonWriter) nfcButtonBadgesConfig2.getWallet());
        jsonWriter.name("split");
        this.nullableNfcButtonBadgeConfigAdapter.toJson(jsonWriter, (JsonWriter) nfcButtonBadgesConfig2.getSplit());
        jsonWriter.name("corp_card");
        this.nullableNfcButtonBadgeConfigAdapter.toJson(jsonWriter, (JsonWriter) nfcButtonBadgesConfig2.getCorpcard());
        jsonWriter.name("pro");
        this.nullableNfcButtonBadgeConfigAdapter.toJson(jsonWriter, (JsonWriter) nfcButtonBadgesConfig2.getPro());
        jsonWriter.name("external");
        this.nullableNfcButtonBadgeConfigAdapter.toJson(jsonWriter, (JsonWriter) nfcButtonBadgesConfig2.getExternal());
        jsonWriter.name("yellow");
        this.nullableNfcButtonBadgeConfigAdapter.toJson(jsonWriter, (JsonWriter) nfcButtonBadgesConfig2.getYellow());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(NfcButtonBadgesConfig)");
    }
}
