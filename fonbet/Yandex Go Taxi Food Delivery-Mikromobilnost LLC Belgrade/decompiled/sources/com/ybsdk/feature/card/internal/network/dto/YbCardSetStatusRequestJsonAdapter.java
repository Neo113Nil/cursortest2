package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/YbCardSetStatusRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardSetStatusRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/api/entities/YbCardStatusEntity;", "ybCardStatusEntityAdapter", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YbCardSetStatusRequestJsonAdapter extends JsonAdapter<YbCardSetStatusRequest> {
    private final JsonReader.Options options = JsonReader.Options.of("card_id", ACSPConstants.STATUS);
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<YbCardStatusEntity> ybCardStatusEntityAdapter;

    public YbCardSetStatusRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "cardId");
        this.ybCardStatusEntityAdapter = moshi.adapter(YbCardStatusEntity.class, emptySet, "cardStatus");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final YbCardSetStatusRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        YbCardStatusEntity ybCardStatusEntity = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("cardId", "card_id", jsonReader);
                }
            } else if (selectName == 1 && (ybCardStatusEntity = this.ybCardStatusEntityAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("cardStatus", ACSPConstants.STATUS, jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("cardId", "card_id", jsonReader);
        }
        if (ybCardStatusEntity != null) {
            return new YbCardSetStatusRequest(str, ybCardStatusEntity);
        }
        throw Util.missingProperty("cardStatus", ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, YbCardSetStatusRequest ybCardSetStatusRequest) {
        YbCardSetStatusRequest ybCardSetStatusRequest2 = ybCardSetStatusRequest;
        if (ybCardSetStatusRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("card_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybCardSetStatusRequest2.getCardId());
        jsonWriter.name(ACSPConstants.STATUS);
        this.ybCardStatusEntityAdapter.toJson(jsonWriter, (JsonWriter) ybCardSetStatusRequest2.getCardStatus());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(YbCardSetStatusRequest)");
    }
}
