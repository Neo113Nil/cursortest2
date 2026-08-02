package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupLimitsDataDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupLimitsDataDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RegularAutotopupLimitsDataDtoJsonAdapter extends JsonAdapter<RegularAutotopupLimitsDataDto> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("money_field_max_limit", "money_field_min_limit", "tooltip_max_limit_text", "tooltip_min_limit_text");
    private final JsonAdapter<String> stringAdapter;

    public RegularAutotopupLimitsDataDtoJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, CspBioProgressConstants.MAX);
        this.stringAdapter = moshi.adapter(String.class, emptySet, "tooltipMax");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RegularAutotopupLimitsDataDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull(CspBioProgressConstants.MAX, "money_field_max_limit", jsonReader);
                }
            } else if (selectName == 1) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("min", "money_field_min_limit", jsonReader);
                }
            } else if (selectName == 2) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("tooltipMax", "tooltip_max_limit_text", jsonReader);
                }
            } else if (selectName == 3 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("tooltipMin", "tooltip_min_limit_text", jsonReader);
            }
        }
        jsonReader.endObject();
        if (num == null) {
            throw Util.missingProperty(CspBioProgressConstants.MAX, "money_field_max_limit", jsonReader);
        }
        int intValue = num.intValue();
        if (num2 == null) {
            throw Util.missingProperty("min", "money_field_min_limit", jsonReader);
        }
        int intValue2 = num2.intValue();
        if (str == null) {
            throw Util.missingProperty("tooltipMax", "tooltip_max_limit_text", jsonReader);
        }
        if (str2 != null) {
            return new RegularAutotopupLimitsDataDto(intValue, intValue2, str, str2);
        }
        throw Util.missingProperty("tooltipMin", "tooltip_min_limit_text", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RegularAutotopupLimitsDataDto regularAutotopupLimitsDataDto) {
        RegularAutotopupLimitsDataDto regularAutotopupLimitsDataDto2 = regularAutotopupLimitsDataDto;
        if (regularAutotopupLimitsDataDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("money_field_max_limit");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(regularAutotopupLimitsDataDto2.getMax()));
        jsonWriter.name("money_field_min_limit");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(regularAutotopupLimitsDataDto2.getMin()));
        jsonWriter.name("tooltip_max_limit_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupLimitsDataDto2.getTooltipMax());
        jsonWriter.name("tooltip_min_limit_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupLimitsDataDto2.getTooltipMin());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(RegularAutotopupLimitsDataDto)");
    }
}
