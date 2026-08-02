package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundParamsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundParamsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Ljava/math/BigDecimal;", "nullableBigDecimalAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoFundParamsDtoJsonAdapter extends JsonAdapter<AutoFundParamsDto> {
    private final JsonAdapter<BigDecimal> nullableBigDecimalAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("fundAmountLimit");

    public AutoFundParamsDtoJsonAdapter(Moshi moshi) {
        this.nullableBigDecimalAdapter = moshi.adapter(BigDecimal.class, EmptySet.a, "fundAmountLimit");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoFundParamsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        BigDecimal bigDecimal = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bigDecimal = this.nullableBigDecimalAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new AutoFundParamsDto(bigDecimal);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoFundParamsDto autoFundParamsDto) {
        AutoFundParamsDto autoFundParamsDto2 = autoFundParamsDto;
        if (autoFundParamsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("fundAmountLimit");
        this.nullableBigDecimalAdapter.toJson(jsonWriter, (JsonWriter) autoFundParamsDto2.getFundAmountLimit());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(AutoFundParamsDto)");
    }
}
