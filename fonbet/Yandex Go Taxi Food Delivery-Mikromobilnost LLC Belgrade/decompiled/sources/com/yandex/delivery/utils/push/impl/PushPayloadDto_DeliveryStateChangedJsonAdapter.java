package com.yandex.delivery.utils.push.impl;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR&\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/yandex/delivery/utils/push/impl/PushPayloadDto_DeliveryStateChangedJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/delivery/utils/push/impl/PushPayloadDto$DeliveryStateChanged;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "mapOfStringAnyAdapter", Constants.PUSH}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PushPayloadDto_DeliveryStateChangedJsonAdapter extends JsonAdapter<PushPayloadDto$DeliveryStateChanged> {
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", "delivery_id", Constants.REFERRER_API_META);
    private final JsonAdapter<String> stringAdapter;

    public PushPayloadDto_DeliveryStateChangedJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "type");
        this.mapOfStringAnyAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Object.class), emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PushPayloadDto$DeliveryStateChanged fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Map<String, Object> map = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("deliveryId", "delivery_id", jsonReader);
                }
            } else if (selectName == 2 && (map = this.mapOfStringAnyAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull(Constants.REFERRER_API_META, Constants.REFERRER_API_META, jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("deliveryId", "delivery_id", jsonReader);
        }
        if (map != null) {
            return new PushPayloadDto$DeliveryStateChanged(str, str2, map);
        }
        throw Util.missingProperty(Constants.REFERRER_API_META, Constants.REFERRER_API_META, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PushPayloadDto$DeliveryStateChanged pushPayloadDto$DeliveryStateChanged) {
        PushPayloadDto$DeliveryStateChanged pushPayloadDto$DeliveryStateChanged2 = pushPayloadDto$DeliveryStateChanged;
        if (pushPayloadDto$DeliveryStateChanged2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pushPayloadDto$DeliveryStateChanged2.getType());
        jsonWriter.name("delivery_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pushPayloadDto$DeliveryStateChanged2.getDeliveryId());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.mapOfStringAnyAdapter.toJson(jsonWriter, (JsonWriter) pushPayloadDto$DeliveryStateChanged2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(57, "GeneratedJsonAdapter(PushPayloadDto.DeliveryStateChanged)");
    }
}
