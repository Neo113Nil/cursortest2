package com.ybsdk.feature.cashback.impl.dto.responses;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackPromosResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackPromosResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/cashback/impl/dto/responses/MonthlyCashbackResponse;", "monthlyCashbackResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/cashback/impl/dto/responses/ActivePromosResponse;", "nullableActivePromosResponseAdapter", "Lcom/ybsdk/feature/cashback/impl/dto/responses/SuggestedPromosResponse;", "nullableSuggestedPromosResponseAdapter", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CashbackPromosResponseJsonAdapter extends JsonAdapter<CashbackPromosResponse> {
    private final JsonAdapter<MonthlyCashbackResponse> monthlyCashbackResponseAdapter;
    private final JsonAdapter<ActivePromosResponse> nullableActivePromosResponseAdapter;
    private final JsonAdapter<SuggestedPromosResponse> nullableSuggestedPromosResponseAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("cashback", "active_promos", "suggested_promos");

    public CashbackPromosResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.monthlyCashbackResponseAdapter = moshi.adapter(MonthlyCashbackResponse.class, emptySet, "cashback");
        this.nullableActivePromosResponseAdapter = moshi.adapter(ActivePromosResponse.class, emptySet, "activePromos");
        this.nullableSuggestedPromosResponseAdapter = moshi.adapter(SuggestedPromosResponse.class, emptySet, "suggestedPromos");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CashbackPromosResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        MonthlyCashbackResponse monthlyCashbackResponse = null;
        ActivePromosResponse activePromosResponse = null;
        SuggestedPromosResponse suggestedPromosResponse = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                monthlyCashbackResponse = this.monthlyCashbackResponseAdapter.fromJson(jsonReader);
                if (monthlyCashbackResponse == null) {
                    throw Util.unexpectedNull("cashback", "cashback", jsonReader);
                }
            } else if (selectName == 1) {
                activePromosResponse = this.nullableActivePromosResponseAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                suggestedPromosResponse = this.nullableSuggestedPromosResponseAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (monthlyCashbackResponse != null) {
            return new CashbackPromosResponse(monthlyCashbackResponse, activePromosResponse, suggestedPromosResponse);
        }
        throw Util.missingProperty("cashback", "cashback", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CashbackPromosResponse cashbackPromosResponse) {
        CashbackPromosResponse cashbackPromosResponse2 = cashbackPromosResponse;
        if (cashbackPromosResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("cashback");
        this.monthlyCashbackResponseAdapter.toJson(jsonWriter, (JsonWriter) cashbackPromosResponse2.getCashback());
        jsonWriter.name("active_promos");
        this.nullableActivePromosResponseAdapter.toJson(jsonWriter, (JsonWriter) cashbackPromosResponse2.getActivePromos());
        jsonWriter.name("suggested_promos");
        this.nullableSuggestedPromosResponseAdapter.toJson(jsonWriter, (JsonWriter) cashbackPromosResponse2.getSuggestedPromos());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(CashbackPromosResponse)");
    }
}
