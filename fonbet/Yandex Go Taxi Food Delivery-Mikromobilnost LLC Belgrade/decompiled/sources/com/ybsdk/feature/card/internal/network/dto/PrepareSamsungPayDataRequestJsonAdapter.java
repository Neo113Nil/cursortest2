package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/PrepareSamsungPayDataRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/PrepareSamsungPayDataRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PrepareSamsungPayDataRequestJsonAdapter extends JsonAdapter<PrepareSamsungPayDataRequest> {
    private final JsonReader.Options options = JsonReader.Options.of("card_id", "wallet_dm_id", MetaDataField.DEVICE_ID_FIELD);
    private final JsonAdapter<String> stringAdapter;

    public PrepareSamsungPayDataRequestJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, EmptySet.a, "cardId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PrepareSamsungPayDataRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
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
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("walletId", "wallet_dm_id", jsonReader);
                }
            } else if (selectName == 2 && (str3 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("deviceId", MetaDataField.DEVICE_ID_FIELD, jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("cardId", "card_id", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("walletId", "wallet_dm_id", jsonReader);
        }
        if (str3 != null) {
            return new PrepareSamsungPayDataRequest(str, str2, str3);
        }
        throw Util.missingProperty("deviceId", MetaDataField.DEVICE_ID_FIELD, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PrepareSamsungPayDataRequest prepareSamsungPayDataRequest) {
        PrepareSamsungPayDataRequest prepareSamsungPayDataRequest2 = prepareSamsungPayDataRequest;
        if (prepareSamsungPayDataRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("card_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) prepareSamsungPayDataRequest2.getCardId());
        jsonWriter.name("wallet_dm_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) prepareSamsungPayDataRequest2.getWalletId());
        jsonWriter.name(MetaDataField.DEVICE_ID_FIELD);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) prepareSamsungPayDataRequest2.getDeviceId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(PrepareSamsungPayDataRequest)");
    }
}
