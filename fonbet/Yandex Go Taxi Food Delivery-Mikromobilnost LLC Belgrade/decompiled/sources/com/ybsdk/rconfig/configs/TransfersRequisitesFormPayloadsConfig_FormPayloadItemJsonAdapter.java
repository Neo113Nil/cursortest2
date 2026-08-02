package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.rconfig.configs.TransfersRequisitesFormPayloadsConfig;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig_FormPayloadItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig$FormPayloadItem;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/rconfig/configs/TransfersRequisitesFormPayloadsConfig$FormPayloadItem$FormPayloadItemType;", "formPayloadItemTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransfersRequisitesFormPayloadsConfig_FormPayloadItemJsonAdapter extends JsonAdapter<TransfersRequisitesFormPayloadsConfig.FormPayloadItem> {
    private final JsonAdapter<TransfersRequisitesFormPayloadsConfig.FormPayloadItem.FormPayloadItemType> formPayloadItemTypeAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("item_type", "max_input_length");

    public TransfersRequisitesFormPayloadsConfig_FormPayloadItemJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.formPayloadItemTypeAdapter = moshi.adapter(TransfersRequisitesFormPayloadsConfig.FormPayloadItem.FormPayloadItemType.class, emptySet, "itemType");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "maxInputLength");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransfersRequisitesFormPayloadsConfig.FormPayloadItem fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        TransfersRequisitesFormPayloadsConfig.FormPayloadItem.FormPayloadItemType formPayloadItemType = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                formPayloadItemType = this.formPayloadItemTypeAdapter.fromJson(jsonReader);
                if (formPayloadItemType == null) {
                    throw Util.unexpectedNull("itemType", "item_type", jsonReader);
                }
            } else if (selectName == 1 && (num = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("maxInputLength", "max_input_length", jsonReader);
            }
        }
        jsonReader.endObject();
        if (formPayloadItemType == null) {
            throw Util.missingProperty("itemType", "item_type", jsonReader);
        }
        if (num != null) {
            return new TransfersRequisitesFormPayloadsConfig.FormPayloadItem(formPayloadItemType, num.intValue());
        }
        throw Util.missingProperty("maxInputLength", "max_input_length", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransfersRequisitesFormPayloadsConfig.FormPayloadItem formPayloadItem) {
        TransfersRequisitesFormPayloadsConfig.FormPayloadItem formPayloadItem2 = formPayloadItem;
        if (formPayloadItem2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("item_type");
        this.formPayloadItemTypeAdapter.toJson(jsonWriter, (JsonWriter) formPayloadItem2.getItemType());
        jsonWriter.name("max_input_length");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(formPayloadItem2.getMaxInputLength()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(75, "GeneratedJsonAdapter(TransfersRequisitesFormPayloadsConfig.FormPayloadItem)");
    }
}
