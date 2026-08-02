package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableMoneyAdapter", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansFilters;", "nullableCreditLimitPlansFiltersAdapter", "", "", "nullableListOfStringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditLimitPlansRequestJsonAdapter extends JsonAdapter<CreditLimitPlansRequest> {
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<CreditLimitPlansFilters> nullableCreditLimitPlansFiltersAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("loan", "payment", "filters", "experiment_flags");

    public CreditLimitPlansRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "loan");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "payment");
        this.nullableCreditLimitPlansFiltersAdapter = moshi.adapter(CreditLimitPlansFilters.class, emptySet, "filters");
        this.nullableListOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "experimentFlags");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditLimitPlansRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Money money = null;
        Money money2 = null;
        CreditLimitPlansFilters creditLimitPlansFilters = null;
        List<String> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                money = this.moneyAdapter.fromJson(jsonReader);
                if (money == null) {
                    throw Util.unexpectedNull("loan", "loan", jsonReader);
                }
            } else if (selectName == 1) {
                money2 = this.nullableMoneyAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                creditLimitPlansFilters = this.nullableCreditLimitPlansFiltersAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                list = this.nullableListOfStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (money != null) {
            return new CreditLimitPlansRequest(money, money2, creditLimitPlansFilters, list);
        }
        throw Util.missingProperty("loan", "loan", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditLimitPlansRequest creditLimitPlansRequest) {
        CreditLimitPlansRequest creditLimitPlansRequest2 = creditLimitPlansRequest;
        if (creditLimitPlansRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("loan");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlansRequest2.getLoan());
        jsonWriter.name("payment");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlansRequest2.getPayment());
        jsonWriter.name("filters");
        this.nullableCreditLimitPlansFiltersAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlansRequest2.getFilters());
        jsonWriter.name("experiment_flags");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlansRequest2.getExperimentFlags());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(CreditLimitPlansRequest)");
    }
}
