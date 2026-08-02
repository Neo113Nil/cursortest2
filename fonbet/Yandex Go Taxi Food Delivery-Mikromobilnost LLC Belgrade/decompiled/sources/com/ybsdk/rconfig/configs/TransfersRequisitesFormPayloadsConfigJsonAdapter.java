package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.rconfig.configs.TransfersRequisitesFormPayloadsConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig$FormPayload;", "listOfFormPayloadAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransfersRequisitesFormPayloadsConfigJsonAdapter extends JsonAdapter<TransfersRequisitesFormPayloadsConfig> {
    private final JsonAdapter<List<TransfersRequisitesFormPayloadsConfig.FormPayload>> listOfFormPayloadAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("payloads");

    public TransfersRequisitesFormPayloadsConfigJsonAdapter(Moshi moshi) {
        this.listOfFormPayloadAdapter = moshi.adapter(Types.newParameterizedType(List.class, TransfersRequisitesFormPayloadsConfig.FormPayload.class), EmptySet.a, "payloads");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransfersRequisitesFormPayloadsConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<TransfersRequisitesFormPayloadsConfig.FormPayload> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (list = this.listOfFormPayloadAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("payloads", "payloads", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new TransfersRequisitesFormPayloadsConfig(list);
        }
        throw Util.missingProperty("payloads", "payloads", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransfersRequisitesFormPayloadsConfig transfersRequisitesFormPayloadsConfig) {
        TransfersRequisitesFormPayloadsConfig transfersRequisitesFormPayloadsConfig2 = transfersRequisitesFormPayloadsConfig;
        if (transfersRequisitesFormPayloadsConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("payloads");
        this.listOfFormPayloadAdapter.toJson(jsonWriter, (JsonWriter) transfersRequisitesFormPayloadsConfig2.getPayloads());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(59, "GeneratedJsonAdapter(TransfersRequisitesFormPayloadsConfig)");
    }
}
