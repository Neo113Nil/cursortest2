package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesHcsPayloadDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesHcsPayloadDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RequisitesHcsPayloadDtoJsonAdapter extends JsonAdapter<RequisitesHcsPayloadDto> {
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("account_number", "bic", "legal_name", "inn", "hcs_personal_account", "payment_period", "payment_purpose", "divkit_widget");

    public RequisitesHcsPayloadDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "accountNumber");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divkitWidget");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RequisitesHcsPayloadDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        DivDataDto divDataDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        return new RequisitesHcsPayloadDto(str, str2, str3, str4, str5, str6, str7, divDataDto);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RequisitesHcsPayloadDto requisitesHcsPayloadDto) {
        RequisitesHcsPayloadDto requisitesHcsPayloadDto2 = requisitesHcsPayloadDto;
        if (requisitesHcsPayloadDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("account_number");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsPayloadDto2.getAccountNumber());
        jsonWriter.name("bic");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsPayloadDto2.getBic());
        jsonWriter.name("legal_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsPayloadDto2.getBeneficiaryName());
        jsonWriter.name("inn");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsPayloadDto2.getInn());
        jsonWriter.name("hcs_personal_account");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsPayloadDto2.getHcsPersonalAccount());
        jsonWriter.name("payment_period");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsPayloadDto2.getPaymentPeriod());
        jsonWriter.name("payment_purpose");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsPayloadDto2.getPaymentPurpose());
        jsonWriter.name("divkit_widget");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsPayloadDto2.getDivkitWidget());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(RequisitesHcsPayloadDto)");
    }
}
