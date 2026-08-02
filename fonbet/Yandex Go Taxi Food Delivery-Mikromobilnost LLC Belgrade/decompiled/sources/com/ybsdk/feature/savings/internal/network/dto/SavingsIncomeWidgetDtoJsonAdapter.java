package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.kju0;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsIncomeWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsIncomeWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsIncomePeriodDto;", "listOfSavingsIncomePeriodDtoAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsIncomeWidgetDtoJsonAdapter extends JsonAdapter<SavingsIncomeWidgetDto> {
    private final JsonAdapter<List<SavingsIncomePeriodDto>> listOfSavingsIncomePeriodDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(kju0.f, "title", "periods");
    private final JsonAdapter<String> stringAdapter;

    public SavingsIncomeWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "layoutId");
        this.listOfSavingsIncomePeriodDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, SavingsIncomePeriodDto.class), emptySet, "periods");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SavingsIncomeWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        List<SavingsIncomePeriodDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("layoutId", kju0.f, jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 2 && (list = this.listOfSavingsIncomePeriodDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("periods", "periods", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("layoutId", kju0.f, jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (list != null) {
            return new SavingsIncomeWidgetDto(str, str2, list);
        }
        throw Util.missingProperty("periods", "periods", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SavingsIncomeWidgetDto savingsIncomeWidgetDto) {
        SavingsIncomeWidgetDto savingsIncomeWidgetDto2 = savingsIncomeWidgetDto;
        if (savingsIncomeWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(kju0.f);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsIncomeWidgetDto2.getLayoutId());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsIncomeWidgetDto2.getTitle());
        jsonWriter.name("periods");
        this.listOfSavingsIncomePeriodDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsIncomeWidgetDto2.getPeriods());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(SavingsIncomeWidgetDto)");
    }
}
