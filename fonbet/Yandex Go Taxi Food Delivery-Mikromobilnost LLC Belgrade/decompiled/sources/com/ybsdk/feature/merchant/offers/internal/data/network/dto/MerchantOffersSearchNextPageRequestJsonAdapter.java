package com.ybsdk.feature.merchant.offers.internal.data.network.dto;

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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersSearchNextPageRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersSearchNextPageRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfStringAdapter", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MerchantOffersSearchNextPageRequestJsonAdapter extends JsonAdapter<MerchantOffersSearchNextPageRequest> {
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("ml_request_id", "offer_ids", "query");

    public MerchantOffersSearchNextPageRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "mlRequestId");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "offerIds");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MerchantOffersSearchNextPageRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        List<String> list = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                list = this.listOfStringAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("offerIds", "offer_ids", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new MerchantOffersSearchNextPageRequest(str, list, str2);
        }
        throw Util.missingProperty("offerIds", "offer_ids", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MerchantOffersSearchNextPageRequest merchantOffersSearchNextPageRequest) {
        MerchantOffersSearchNextPageRequest merchantOffersSearchNextPageRequest2 = merchantOffersSearchNextPageRequest;
        if (merchantOffersSearchNextPageRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("ml_request_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersSearchNextPageRequest2.getMlRequestId());
        jsonWriter.name("offer_ids");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersSearchNextPageRequest2.getOfferIds());
        jsonWriter.name("query");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersSearchNextPageRequest2.getQuery());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(57, "GeneratedJsonAdapter(MerchantOffersSearchNextPageRequest)");
    }
}
