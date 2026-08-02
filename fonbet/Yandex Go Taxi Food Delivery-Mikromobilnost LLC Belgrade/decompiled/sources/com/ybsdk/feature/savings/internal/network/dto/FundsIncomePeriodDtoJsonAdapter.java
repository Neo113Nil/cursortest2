package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundsIncomePeriodDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundsIncomePeriodDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/savings/internal/network/dto/FundsIncomePeriodPointDto;", "listOfFundsIncomePeriodPointDtoAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FundsIncomePeriodDtoJsonAdapter extends JsonAdapter<FundsIncomePeriodDto> {
    private final JsonAdapter<List<FundsIncomePeriodPointDto>> listOfFundsIncomePeriodPointDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "chip_title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "income", "start_date", "end_date", CRLDistributionPointsExtension.POINTS);
    private final JsonAdapter<String> stringAdapter;

    public FundsIncomePeriodDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.listOfFundsIncomePeriodPointDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, FundsIncomePeriodPointDto.class), emptySet, CRLDistributionPointsExtension.POINTS);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FundsIncomePeriodDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List<FundsIncomePeriodPointDto> list = null;
        while (true) {
            String str7 = str;
            String str8 = str2;
            String str9 = str3;
            if (!jsonReader.hasNext()) {
                String str10 = str4;
                jsonReader.endObject();
                if (str7 == null) {
                    throw Util.missingProperty("id", "id", jsonReader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("chipTitle", "chip_title", jsonReader);
                }
                if (str9 == null) {
                    throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
                if (str10 == null) {
                    throw Util.missingProperty("income", "income", jsonReader);
                }
                if (str5 == null) {
                    throw Util.missingProperty("startDate", "start_date", jsonReader);
                }
                if (str6 == null) {
                    throw Util.missingProperty("endDate", "end_date", jsonReader);
                }
                if (list != null) {
                    return new FundsIncomePeriodDto(str7, str8, str9, str10, str5, str6, list);
                }
                throw Util.missingProperty(CRLDistributionPointsExtension.POINTS, CRLDistributionPointsExtension.POINTS, jsonReader);
            }
            String str11 = str4;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str4 = str11;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                    str4 = str11;
                    str2 = str8;
                    str3 = str9;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("chipTitle", "chip_title", jsonReader);
                    }
                    str4 = str11;
                    str = str7;
                    str3 = str9;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                    }
                    str4 = str11;
                    str = str7;
                    str2 = str8;
                case 3:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("income", "income", jsonReader);
                    }
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                case 4:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("startDate", "start_date", jsonReader);
                    }
                    str4 = str11;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                case 5:
                    str6 = this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        throw Util.unexpectedNull("endDate", "end_date", jsonReader);
                    }
                    str4 = str11;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                case 6:
                    list = this.listOfFundsIncomePeriodPointDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull(CRLDistributionPointsExtension.POINTS, CRLDistributionPointsExtension.POINTS, jsonReader);
                    }
                    str4 = str11;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                default:
                    str4 = str11;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FundsIncomePeriodDto fundsIncomePeriodDto) {
        FundsIncomePeriodDto fundsIncomePeriodDto2 = fundsIncomePeriodDto;
        if (fundsIncomePeriodDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundsIncomePeriodDto2.getId());
        jsonWriter.name("chip_title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundsIncomePeriodDto2.getChipTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundsIncomePeriodDto2.getDescription());
        jsonWriter.name("income");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundsIncomePeriodDto2.getIncome());
        jsonWriter.name("start_date");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundsIncomePeriodDto2.getStartDate());
        jsonWriter.name("end_date");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundsIncomePeriodDto2.getEndDate());
        jsonWriter.name(CRLDistributionPointsExtension.POINTS);
        this.listOfFundsIncomePeriodPointDtoAdapter.toJson(jsonWriter, (JsonWriter) fundsIncomePeriodDto2.getPoints());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(FundsIncomePeriodDto)");
    }
}
