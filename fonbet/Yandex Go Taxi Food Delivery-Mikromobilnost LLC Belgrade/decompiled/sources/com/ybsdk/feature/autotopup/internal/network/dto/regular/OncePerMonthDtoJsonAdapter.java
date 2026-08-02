package com.ybsdk.feature.autotopup.internal.network.dto.regular;

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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/OncePerMonthDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/OncePerMonthDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "", "booleanAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OncePerMonthDtoJsonAdapter extends JsonAdapter<OncePerMonthDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("money", "day", "is_last_day");

    public OncePerMonthDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "day");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isLastDay");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final OncePerMonthDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Money money = null;
        Integer num = null;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                money = this.moneyAdapter.fromJson(jsonReader);
                if (money == null) {
                    throw Util.unexpectedNull("money", "money", jsonReader);
                }
            } else if (selectName == 1) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (selectName == 2 && (bool = this.booleanAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("isLastDay", "is_last_day", jsonReader);
            }
        }
        jsonReader.endObject();
        if (money == null) {
            throw Util.missingProperty("money", "money", jsonReader);
        }
        if (bool != null) {
            return new OncePerMonthDto(money, num, bool.booleanValue());
        }
        throw Util.missingProperty("isLastDay", "is_last_day", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, OncePerMonthDto oncePerMonthDto) {
        OncePerMonthDto oncePerMonthDto2 = oncePerMonthDto;
        if (oncePerMonthDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("money");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) oncePerMonthDto2.getMoney());
        jsonWriter.name("day");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) oncePerMonthDto2.getDay());
        jsonWriter.name("is_last_day");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(oncePerMonthDto2.isLastDay()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(OncePerMonthDto)");
    }
}
