package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountsInfoResponseV3JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountsInfoResponseV3;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/feature/savings/internal/network/dto/DivSavingsAccountResponse;", "listOfDivSavingsAccountResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/NoAccountsInfoResponseV3;", "nullableNoAccountsInfoResponseV3Adapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsAccountsInfoResponseV3JsonAdapter extends JsonAdapter<SavingsAccountsInfoResponseV3> {
    private final JsonAdapter<List<DivSavingsAccountResponse>> listOfDivSavingsAccountResponseAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<NoAccountsInfoResponseV3> nullableNoAccountsInfoResponseV3Adapter;
    private final JsonReader.Options options = JsonReader.Options.of("items", "common_div_data", "no_accounts_info");

    public SavingsAccountsInfoResponseV3JsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, DivSavingsAccountResponse.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfDivSavingsAccountResponseAdapter = moshi.adapter(newParameterizedType, emptySet, "items");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "commonDivData");
        this.nullableNoAccountsInfoResponseV3Adapter = moshi.adapter(NoAccountsInfoResponseV3.class, emptySet, "noAccountsInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SavingsAccountsInfoResponseV3 fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<DivSavingsAccountResponse> list = null;
        DivDataDto divDataDto = null;
        NoAccountsInfoResponseV3 noAccountsInfoResponseV3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfDivSavingsAccountResponseAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("items", "items", jsonReader);
                }
            } else if (selectName == 1) {
                divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                noAccountsInfoResponseV3 = this.nullableNoAccountsInfoResponseV3Adapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new SavingsAccountsInfoResponseV3(list, divDataDto, noAccountsInfoResponseV3);
        }
        throw Util.missingProperty("items", "items", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SavingsAccountsInfoResponseV3 savingsAccountsInfoResponseV3) {
        SavingsAccountsInfoResponseV3 savingsAccountsInfoResponseV32 = savingsAccountsInfoResponseV3;
        if (savingsAccountsInfoResponseV32 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("items");
        this.listOfDivSavingsAccountResponseAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountsInfoResponseV32.getItems());
        jsonWriter.name("common_div_data");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountsInfoResponseV32.getCommonDivData());
        jsonWriter.name("no_accounts_info");
        this.nullableNoAccountsInfoResponseV3Adapter.toJson(jsonWriter, (JsonWriter) savingsAccountsInfoResponseV32.getNoAccountsInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(SavingsAccountsInfoResponseV3)");
    }
}
