package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundsIncomePeriodPointDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundsIncomePeriodPointDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "doubleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FundsIncomePeriodPointDtoJsonAdapter extends JsonAdapter<FundsIncomePeriodPointDto> {
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("amount", "income_text", "subtitle", "daily_income");
    private final JsonAdapter<String> stringAdapter;

    public FundsIncomePeriodPointDtoJsonAdapter(Moshi moshi) {
        Class cls = Double.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.doubleAdapter = moshi.adapter(cls, emptySet, "amount");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "incomeText");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FundsIncomePeriodPointDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Double d = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                d = this.doubleAdapter.fromJson(jsonReader);
                if (d == null) {
                    throw Util.unexpectedNull("amount", "amount", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("incomeText", "income_text", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
                }
            } else if (selectName == 3 && (str3 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("dailyIncome", "daily_income", jsonReader);
            }
        }
        jsonReader.endObject();
        if (d == null) {
            throw Util.missingProperty("amount", "amount", jsonReader);
        }
        double doubleValue = d.doubleValue();
        if (str == null) {
            throw Util.missingProperty("incomeText", "income_text", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("subtitle", "subtitle", jsonReader);
        }
        if (str3 != null) {
            return new FundsIncomePeriodPointDto(doubleValue, str, str2, str3);
        }
        throw Util.missingProperty("dailyIncome", "daily_income", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FundsIncomePeriodPointDto fundsIncomePeriodPointDto) {
        FundsIncomePeriodPointDto fundsIncomePeriodPointDto2 = fundsIncomePeriodPointDto;
        if (fundsIncomePeriodPointDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("amount");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(fundsIncomePeriodPointDto2.getAmount()));
        jsonWriter.name("income_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundsIncomePeriodPointDto2.getIncomeText());
        jsonWriter.name("subtitle");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundsIncomePeriodPointDto2.getSubtitle());
        jsonWriter.name("daily_income");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundsIncomePeriodPointDto2.getDailyIncome());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(FundsIncomePeriodPointDto)");
    }
}
