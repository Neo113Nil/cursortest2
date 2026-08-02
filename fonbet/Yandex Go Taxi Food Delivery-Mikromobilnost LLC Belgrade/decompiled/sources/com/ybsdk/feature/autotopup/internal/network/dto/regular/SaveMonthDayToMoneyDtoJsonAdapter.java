package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveMonthDayToMoneyDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SaveMonthDayToMoneyDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "hmacDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaveMonthDayToMoneyDtoJsonAdapter extends JsonAdapter<SaveMonthDayToMoneyDto> {
    private final JsonAdapter<HmacDto> hmacDtoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("day", "money", "hmac");

    public SaveMonthDayToMoneyDtoJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "day");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.hmacDtoAdapter = moshi.adapter(HmacDto.class, emptySet, "hmacDto");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SaveMonthDayToMoneyDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Money money = null;
        HmacDto hmacDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("day", "day", jsonReader);
                }
            } else if (selectName == 1) {
                money = this.moneyAdapter.fromJson(jsonReader);
                if (money == null) {
                    throw Util.unexpectedNull("money", "money", jsonReader);
                }
            } else if (selectName == 2 && (hmacDto = this.hmacDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("hmacDto", "hmac", jsonReader);
            }
        }
        jsonReader.endObject();
        if (num == null) {
            throw Util.missingProperty("day", "day", jsonReader);
        }
        int intValue = num.intValue();
        if (money == null) {
            throw Util.missingProperty("money", "money", jsonReader);
        }
        if (hmacDto != null) {
            return new SaveMonthDayToMoneyDto(intValue, money, hmacDto);
        }
        throw Util.missingProperty("hmacDto", "hmac", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SaveMonthDayToMoneyDto saveMonthDayToMoneyDto) {
        SaveMonthDayToMoneyDto saveMonthDayToMoneyDto2 = saveMonthDayToMoneyDto;
        if (saveMonthDayToMoneyDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("day");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(saveMonthDayToMoneyDto2.getDay()));
        jsonWriter.name("money");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) saveMonthDayToMoneyDto2.getMoney());
        jsonWriter.name("hmac");
        this.hmacDtoAdapter.toJson(jsonWriter, (JsonWriter) saveMonthDayToMoneyDto2.getHmacDto());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(SaveMonthDayToMoneyDto)");
    }
}
