package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.kju0;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/InterestDataDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/InterestDataDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "nullableStringAdapter", "", "Lcom/ybsdk/feature/savings/internal/network/dto/InterestMonthDataDto;", "listOfInterestMonthDataDtoAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InterestDataDtoJsonAdapter extends JsonAdapter<InterestDataDto> {
    private final JsonAdapter<List<InterestMonthDataDto>> listOfInterestMonthDataDtoAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(kju0.f, "title", "subtitle", "total", "total_text_color", "action", Constants.KEY_DATA);
    private final JsonAdapter<String> stringAdapter;

    public InterestDataDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "layoutId");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "total");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "totalTextColor");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "action");
        this.listOfInterestMonthDataDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, InterestMonthDataDto.class), emptySet, Constants.KEY_DATA);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final InterestDataDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        Money money = null;
        Themes<String> themes = null;
        String str4 = null;
        List<InterestMonthDataDto> list = null;
        while (jsonReader.hasNext()) {
            String str5 = str;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("layoutId", kju0.f, jsonReader);
                    }
                    continue;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
                    }
                    break;
                case 3:
                    money = this.moneyAdapter.fromJson(jsonReader);
                    if (money == null) {
                        throw Util.unexpectedNull("total", "total", jsonReader);
                    }
                    break;
                case 4:
                    themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    list = this.listOfInterestMonthDataDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("data_", Constants.KEY_DATA, jsonReader);
                    }
                    break;
            }
            str = str5;
        }
        String str6 = str;
        jsonReader.endObject();
        if (str6 == null) {
            throw Util.missingProperty("layoutId", kju0.f, jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str3 == null) {
            throw Util.missingProperty("subtitle", "subtitle", jsonReader);
        }
        if (money == null) {
            throw Util.missingProperty("total", "total", jsonReader);
        }
        if (list != null) {
            return new InterestDataDto(str6, str2, str3, money, themes, str4, list);
        }
        throw Util.missingProperty("data_", Constants.KEY_DATA, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, InterestDataDto interestDataDto) {
        InterestDataDto interestDataDto2 = interestDataDto;
        if (interestDataDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(kju0.f);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) interestDataDto2.getLayoutId());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) interestDataDto2.getTitle());
        jsonWriter.name("subtitle");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) interestDataDto2.getSubtitle());
        jsonWriter.name("total");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) interestDataDto2.getTotal());
        jsonWriter.name("total_text_color");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) interestDataDto2.getTotalTextColor());
        jsonWriter.name("action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) interestDataDto2.getAction());
        jsonWriter.name(Constants.KEY_DATA);
        this.listOfInterestMonthDataDtoAdapter.toJson(jsonWriter, (JsonWriter) interestDataDto2.getData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(InterestDataDto)");
    }
}
