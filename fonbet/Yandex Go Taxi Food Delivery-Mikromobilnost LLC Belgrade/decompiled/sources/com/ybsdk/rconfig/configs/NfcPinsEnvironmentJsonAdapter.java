package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcPinsEnvironmentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NfcPinsEnvironment;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "listOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcPinsEnvironmentJsonAdapter extends JsonAdapter<NfcPinsEnvironment> {
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("server_pins", "pcidss_pins");

    public NfcPinsEnvironmentJsonAdapter(Moshi moshi) {
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), EmptySet.a, "server");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NfcPinsEnvironment fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<String> list = null;
        List<String> list2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfStringAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("server", "server_pins", jsonReader);
                }
            } else if (selectName == 1 && (list2 = this.listOfStringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("pcidss", "pcidss_pins", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("server", "server_pins", jsonReader);
        }
        if (list2 != null) {
            return new NfcPinsEnvironment(list, list2);
        }
        throw Util.missingProperty("pcidss", "pcidss_pins", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NfcPinsEnvironment nfcPinsEnvironment) {
        NfcPinsEnvironment nfcPinsEnvironment2 = nfcPinsEnvironment;
        if (nfcPinsEnvironment2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("server_pins");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcPinsEnvironment2.getServer());
        jsonWriter.name("pcidss_pins");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcPinsEnvironment2.getPcidss());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(NfcPinsEnvironment)");
    }
}
