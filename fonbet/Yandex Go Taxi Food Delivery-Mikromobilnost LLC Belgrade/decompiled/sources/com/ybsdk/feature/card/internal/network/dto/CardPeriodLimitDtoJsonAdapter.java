package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.LimitHintDto;
import defpackage.ny61;
import defpackage.uw51;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CardPeriodLimitDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/CardPeriodLimitDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/math/BigDecimal;", "nullableBigDecimalAdapter", "nullableStringAdapter", "", "Lcom/ybsdk/core/common/data/network/dto/LimitHintDto;", "nullableListOfLimitHintDtoAdapter", "", "booleanAdapter", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardPeriodLimitDtoJsonAdapter extends JsonAdapter<CardPeriodLimitDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<BigDecimal> nullableBigDecimalAdapter;
    private final JsonAdapter<List<LimitHintDto>> nullableListOfLimitHintDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("setting_key", "period_title", "input_title", "default_value", "currency", "limit_hints", "selected");
    private final JsonAdapter<String> stringAdapter;

    public CardPeriodLimitDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "settingKey");
        this.nullableBigDecimalAdapter = moshi.adapter(BigDecimal.class, emptySet, "defaultValue");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "currency");
        this.nullableListOfLimitHintDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, LimitHintDto.class), emptySet, "limitHints");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "selected");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CardPeriodLimitDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        BigDecimal bigDecimal = null;
        String str4 = null;
        List<LimitHintDto> list = null;
        while (true) {
            Boolean bool2 = bool;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (str == null) {
                    throw Util.missingProperty("settingKey", "setting_key", jsonReader);
                }
                if (str2 == null) {
                    throw Util.missingProperty("periodTitle", "period_title", jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("inputTitle", "input_title", jsonReader);
                }
                if (bool2 != null) {
                    return new CardPeriodLimitDto(str, str2, str3, bigDecimal, str4, list, bool2.booleanValue());
                }
                throw Util.missingProperty("selected", "selected", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("settingKey", "setting_key", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("periodTitle", "period_title", jsonReader);
                    }
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("inputTitle", "input_title", jsonReader);
                    }
                    break;
                case 3:
                    bigDecimal = this.nullableBigDecimalAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    list = this.nullableListOfLimitHintDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    Boolean fromJson = this.booleanAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("selected", "selected", jsonReader);
                    }
                    bool = fromJson;
                    continue;
            }
            bool = bool2;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CardPeriodLimitDto cardPeriodLimitDto) {
        CardPeriodLimitDto cardPeriodLimitDto2 = cardPeriodLimitDto;
        if (cardPeriodLimitDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("setting_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cardPeriodLimitDto2.getSettingKey());
        jsonWriter.name("period_title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cardPeriodLimitDto2.getPeriodTitle());
        jsonWriter.name("input_title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cardPeriodLimitDto2.getInputTitle());
        jsonWriter.name("default_value");
        this.nullableBigDecimalAdapter.toJson(jsonWriter, (JsonWriter) cardPeriodLimitDto2.getDefaultValue());
        jsonWriter.name("currency");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) cardPeriodLimitDto2.getCurrency());
        jsonWriter.name("limit_hints");
        this.nullableListOfLimitHintDtoAdapter.toJson(jsonWriter, (JsonWriter) cardPeriodLimitDto2.getLimitHints());
        jsonWriter.name("selected");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(cardPeriodLimitDto2.getSelected()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(CardPeriodLimitDto)");
    }
}
