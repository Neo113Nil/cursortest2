package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcProductSkinsV3ConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NfcProductSkinsV3Config;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/rconfig/configs/NfcProductSkinV3Config;", "nullableNfcProductSkinV3ConfigAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcProductSkinsV3ConfigJsonAdapter extends JsonAdapter<NfcProductSkinsV3Config> {
    private final JsonAdapter<NfcProductSkinV3Config> nullableNfcProductSkinV3ConfigAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("wallet", "pro", "split", "corp_card");

    public NfcProductSkinsV3ConfigJsonAdapter(Moshi moshi) {
        this.nullableNfcProductSkinV3ConfigAdapter = moshi.adapter(NfcProductSkinV3Config.class, EmptySet.a, "wallet");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NfcProductSkinsV3Config fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        NfcProductSkinV3Config nfcProductSkinV3Config = null;
        NfcProductSkinV3Config nfcProductSkinV3Config2 = null;
        NfcProductSkinV3Config nfcProductSkinV3Config3 = null;
        NfcProductSkinV3Config nfcProductSkinV3Config4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                nfcProductSkinV3Config = this.nullableNfcProductSkinV3ConfigAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                nfcProductSkinV3Config2 = this.nullableNfcProductSkinV3ConfigAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                nfcProductSkinV3Config3 = this.nullableNfcProductSkinV3ConfigAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                nfcProductSkinV3Config4 = this.nullableNfcProductSkinV3ConfigAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new NfcProductSkinsV3Config(nfcProductSkinV3Config, nfcProductSkinV3Config2, nfcProductSkinV3Config3, nfcProductSkinV3Config4);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NfcProductSkinsV3Config nfcProductSkinsV3Config) {
        NfcProductSkinsV3Config nfcProductSkinsV3Config2 = nfcProductSkinsV3Config;
        if (nfcProductSkinsV3Config2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("wallet");
        this.nullableNfcProductSkinV3ConfigAdapter.toJson(jsonWriter, (JsonWriter) nfcProductSkinsV3Config2.getWallet());
        jsonWriter.name("pro");
        this.nullableNfcProductSkinV3ConfigAdapter.toJson(jsonWriter, (JsonWriter) nfcProductSkinsV3Config2.getPro());
        jsonWriter.name("split");
        this.nullableNfcProductSkinV3ConfigAdapter.toJson(jsonWriter, (JsonWriter) nfcProductSkinsV3Config2.getSplit());
        jsonWriter.name("corp_card");
        this.nullableNfcProductSkinV3ConfigAdapter.toJson(jsonWriter, (JsonWriter) nfcProductSkinsV3Config2.getCorpcard());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(NfcProductSkinsV3Config)");
    }
}
