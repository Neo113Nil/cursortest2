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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcFailScreenDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NfcFailScreenData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NfcFailButtonData;", "nfcFailButtonDataAdapter", "nullableNfcFailButtonDataAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcFailScreenDataJsonAdapter extends JsonAdapter<NfcFailScreenData> {
    private final JsonAdapter<NfcFailButtonData> nfcFailButtonDataAdapter;
    private final JsonAdapter<NfcFailButtonData> nullableNfcFailButtonDataAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "primary", "secondary");

    public NfcFailScreenDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nfcFailButtonDataAdapter = moshi.adapter(NfcFailButtonData.class, emptySet, "primary");
        this.nullableNfcFailButtonDataAdapter = moshi.adapter(NfcFailButtonData.class, emptySet, "secondary");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NfcFailScreenData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        NfcFailButtonData nfcFailButtonData = null;
        NfcFailButtonData nfcFailButtonData2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                nfcFailButtonData = this.nfcFailButtonDataAdapter.fromJson(jsonReader);
                if (nfcFailButtonData == null) {
                    throw Util.unexpectedNull("primary", "primary", jsonReader);
                }
            } else if (selectName == 3) {
                nfcFailButtonData2 = this.nullableNfcFailButtonDataAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (nfcFailButtonData != null) {
            return new NfcFailScreenData(str, str2, nfcFailButtonData, nfcFailButtonData2);
        }
        throw Util.missingProperty("primary", "primary", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NfcFailScreenData nfcFailScreenData) {
        NfcFailScreenData nfcFailScreenData2 = nfcFailScreenData;
        if (nfcFailScreenData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) nfcFailScreenData2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) nfcFailScreenData2.getSubtitle());
        jsonWriter.name("primary");
        this.nfcFailButtonDataAdapter.toJson(jsonWriter, (JsonWriter) nfcFailScreenData2.getPrimary());
        jsonWriter.name("secondary");
        this.nullableNfcFailButtonDataAdapter.toJson(jsonWriter, (JsonWriter) nfcFailScreenData2.getSecondary());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(NfcFailScreenData)");
    }
}
