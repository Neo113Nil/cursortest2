package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundMoneyDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundMoneyDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableStringAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundSettingFieldTypeDto;", "autoFundSettingFieldTypeDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoFundMoneyDtoJsonAdapter extends JsonAdapter<AutoFundMoneyDto> {
    private final JsonAdapter<AutoFundSettingFieldTypeDto> autoFundSettingFieldTypeDtoAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("amount", "title", "hint", "field_type");
    private final JsonAdapter<String> stringAdapter;

    public AutoFundMoneyDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "amount");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "hint");
        this.autoFundSettingFieldTypeDtoAdapter = moshi.adapter(AutoFundSettingFieldTypeDto.class, emptySet, "fieldType");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoFundMoneyDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Money money = null;
        String str = null;
        String str2 = null;
        AutoFundSettingFieldTypeDto autoFundSettingFieldTypeDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                money = this.nullableMoneyAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3 && (autoFundSettingFieldTypeDto = this.autoFundSettingFieldTypeDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("fieldType", "field_type", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (autoFundSettingFieldTypeDto != null) {
            return new AutoFundMoneyDto(money, str, str2, autoFundSettingFieldTypeDto);
        }
        throw Util.missingProperty("fieldType", "field_type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoFundMoneyDto autoFundMoneyDto) {
        AutoFundMoneyDto autoFundMoneyDto2 = autoFundMoneyDto;
        if (autoFundMoneyDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("amount");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) autoFundMoneyDto2.getAmount());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) autoFundMoneyDto2.getTitle());
        jsonWriter.name("hint");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autoFundMoneyDto2.getHint());
        jsonWriter.name("field_type");
        this.autoFundSettingFieldTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) autoFundMoneyDto2.getFieldType());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(AutoFundMoneyDto)");
    }
}
