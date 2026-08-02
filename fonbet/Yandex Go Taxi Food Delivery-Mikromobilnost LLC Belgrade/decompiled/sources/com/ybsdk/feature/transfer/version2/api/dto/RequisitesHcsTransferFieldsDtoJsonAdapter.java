package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesHcsTransferFieldsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesHcsTransferFieldsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;", "requisiteFieldValidatorDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RequisitesHcsTransferFieldsDtoJsonAdapter extends JsonAdapter<RequisitesHcsTransferFieldsDto> {
    private final JsonReader.Options options = JsonReader.Options.of("account_number", "bic", "legal_name", "inn", "payment_purpose", "hcs_personal_account", "payment_period");
    private final JsonAdapter<RequisiteFieldValidatorDto> requisiteFieldValidatorDtoAdapter;

    public RequisitesHcsTransferFieldsDtoJsonAdapter(Moshi moshi) {
        this.requisiteFieldValidatorDtoAdapter = moshi.adapter(RequisiteFieldValidatorDto.class, EmptySet.a, "accountNumber");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RequisitesHcsTransferFieldsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        RequisiteFieldValidatorDto requisiteFieldValidatorDto = null;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto2 = null;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto3 = null;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto4 = null;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto5 = null;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto6 = null;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto7 = null;
        while (true) {
            RequisiteFieldValidatorDto requisiteFieldValidatorDto8 = requisiteFieldValidatorDto;
            RequisiteFieldValidatorDto requisiteFieldValidatorDto9 = requisiteFieldValidatorDto2;
            RequisiteFieldValidatorDto requisiteFieldValidatorDto10 = requisiteFieldValidatorDto3;
            RequisiteFieldValidatorDto requisiteFieldValidatorDto11 = requisiteFieldValidatorDto4;
            RequisiteFieldValidatorDto requisiteFieldValidatorDto12 = requisiteFieldValidatorDto5;
            if (!jsonReader.hasNext()) {
                RequisiteFieldValidatorDto requisiteFieldValidatorDto13 = requisiteFieldValidatorDto6;
                jsonReader.endObject();
                if (requisiteFieldValidatorDto8 == null) {
                    throw Util.missingProperty("accountNumber", "account_number", jsonReader);
                }
                if (requisiteFieldValidatorDto9 == null) {
                    throw Util.missingProperty("bic", "bic", jsonReader);
                }
                if (requisiteFieldValidatorDto10 == null) {
                    throw Util.missingProperty("legalName", "legal_name", jsonReader);
                }
                if (requisiteFieldValidatorDto11 == null) {
                    throw Util.missingProperty("inn", "inn", jsonReader);
                }
                if (requisiteFieldValidatorDto12 == null) {
                    throw Util.missingProperty("paymentPurpose", "payment_purpose", jsonReader);
                }
                if (requisiteFieldValidatorDto13 == null) {
                    throw Util.missingProperty("hcsPersonalAccount", "hcs_personal_account", jsonReader);
                }
                if (requisiteFieldValidatorDto7 != null) {
                    return new RequisitesHcsTransferFieldsDto(requisiteFieldValidatorDto8, requisiteFieldValidatorDto9, requisiteFieldValidatorDto10, requisiteFieldValidatorDto11, requisiteFieldValidatorDto12, requisiteFieldValidatorDto13, requisiteFieldValidatorDto7);
                }
                throw Util.missingProperty("paymentPeriod", "payment_period", jsonReader);
            }
            RequisiteFieldValidatorDto requisiteFieldValidatorDto14 = requisiteFieldValidatorDto6;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    requisiteFieldValidatorDto6 = requisiteFieldValidatorDto14;
                    requisiteFieldValidatorDto = requisiteFieldValidatorDto8;
                    requisiteFieldValidatorDto2 = requisiteFieldValidatorDto9;
                    requisiteFieldValidatorDto3 = requisiteFieldValidatorDto10;
                    requisiteFieldValidatorDto4 = requisiteFieldValidatorDto11;
                    requisiteFieldValidatorDto5 = requisiteFieldValidatorDto12;
                case 0:
                    requisiteFieldValidatorDto = this.requisiteFieldValidatorDtoAdapter.fromJson(jsonReader);
                    if (requisiteFieldValidatorDto == null) {
                        throw Util.unexpectedNull("accountNumber", "account_number", jsonReader);
                    }
                    requisiteFieldValidatorDto6 = requisiteFieldValidatorDto14;
                    requisiteFieldValidatorDto2 = requisiteFieldValidatorDto9;
                    requisiteFieldValidatorDto3 = requisiteFieldValidatorDto10;
                    requisiteFieldValidatorDto4 = requisiteFieldValidatorDto11;
                    requisiteFieldValidatorDto5 = requisiteFieldValidatorDto12;
                case 1:
                    requisiteFieldValidatorDto2 = this.requisiteFieldValidatorDtoAdapter.fromJson(jsonReader);
                    if (requisiteFieldValidatorDto2 == null) {
                        throw Util.unexpectedNull("bic", "bic", jsonReader);
                    }
                    requisiteFieldValidatorDto6 = requisiteFieldValidatorDto14;
                    requisiteFieldValidatorDto = requisiteFieldValidatorDto8;
                    requisiteFieldValidatorDto3 = requisiteFieldValidatorDto10;
                    requisiteFieldValidatorDto4 = requisiteFieldValidatorDto11;
                    requisiteFieldValidatorDto5 = requisiteFieldValidatorDto12;
                case 2:
                    requisiteFieldValidatorDto3 = this.requisiteFieldValidatorDtoAdapter.fromJson(jsonReader);
                    if (requisiteFieldValidatorDto3 == null) {
                        throw Util.unexpectedNull("legalName", "legal_name", jsonReader);
                    }
                    requisiteFieldValidatorDto6 = requisiteFieldValidatorDto14;
                    requisiteFieldValidatorDto = requisiteFieldValidatorDto8;
                    requisiteFieldValidatorDto2 = requisiteFieldValidatorDto9;
                    requisiteFieldValidatorDto4 = requisiteFieldValidatorDto11;
                    requisiteFieldValidatorDto5 = requisiteFieldValidatorDto12;
                case 3:
                    requisiteFieldValidatorDto4 = this.requisiteFieldValidatorDtoAdapter.fromJson(jsonReader);
                    if (requisiteFieldValidatorDto4 == null) {
                        throw Util.unexpectedNull("inn", "inn", jsonReader);
                    }
                    requisiteFieldValidatorDto6 = requisiteFieldValidatorDto14;
                    requisiteFieldValidatorDto = requisiteFieldValidatorDto8;
                    requisiteFieldValidatorDto2 = requisiteFieldValidatorDto9;
                    requisiteFieldValidatorDto3 = requisiteFieldValidatorDto10;
                    requisiteFieldValidatorDto5 = requisiteFieldValidatorDto12;
                case 4:
                    requisiteFieldValidatorDto5 = this.requisiteFieldValidatorDtoAdapter.fromJson(jsonReader);
                    if (requisiteFieldValidatorDto5 == null) {
                        throw Util.unexpectedNull("paymentPurpose", "payment_purpose", jsonReader);
                    }
                    requisiteFieldValidatorDto6 = requisiteFieldValidatorDto14;
                    requisiteFieldValidatorDto = requisiteFieldValidatorDto8;
                    requisiteFieldValidatorDto2 = requisiteFieldValidatorDto9;
                    requisiteFieldValidatorDto3 = requisiteFieldValidatorDto10;
                    requisiteFieldValidatorDto4 = requisiteFieldValidatorDto11;
                case 5:
                    requisiteFieldValidatorDto6 = this.requisiteFieldValidatorDtoAdapter.fromJson(jsonReader);
                    if (requisiteFieldValidatorDto6 == null) {
                        throw Util.unexpectedNull("hcsPersonalAccount", "hcs_personal_account", jsonReader);
                    }
                    requisiteFieldValidatorDto = requisiteFieldValidatorDto8;
                    requisiteFieldValidatorDto2 = requisiteFieldValidatorDto9;
                    requisiteFieldValidatorDto3 = requisiteFieldValidatorDto10;
                    requisiteFieldValidatorDto4 = requisiteFieldValidatorDto11;
                    requisiteFieldValidatorDto5 = requisiteFieldValidatorDto12;
                case 6:
                    requisiteFieldValidatorDto7 = this.requisiteFieldValidatorDtoAdapter.fromJson(jsonReader);
                    if (requisiteFieldValidatorDto7 == null) {
                        throw Util.unexpectedNull("paymentPeriod", "payment_period", jsonReader);
                    }
                    requisiteFieldValidatorDto6 = requisiteFieldValidatorDto14;
                    requisiteFieldValidatorDto = requisiteFieldValidatorDto8;
                    requisiteFieldValidatorDto2 = requisiteFieldValidatorDto9;
                    requisiteFieldValidatorDto3 = requisiteFieldValidatorDto10;
                    requisiteFieldValidatorDto4 = requisiteFieldValidatorDto11;
                    requisiteFieldValidatorDto5 = requisiteFieldValidatorDto12;
                default:
                    requisiteFieldValidatorDto6 = requisiteFieldValidatorDto14;
                    requisiteFieldValidatorDto = requisiteFieldValidatorDto8;
                    requisiteFieldValidatorDto2 = requisiteFieldValidatorDto9;
                    requisiteFieldValidatorDto3 = requisiteFieldValidatorDto10;
                    requisiteFieldValidatorDto4 = requisiteFieldValidatorDto11;
                    requisiteFieldValidatorDto5 = requisiteFieldValidatorDto12;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RequisitesHcsTransferFieldsDto requisitesHcsTransferFieldsDto) {
        RequisitesHcsTransferFieldsDto requisitesHcsTransferFieldsDto2 = requisitesHcsTransferFieldsDto;
        if (requisitesHcsTransferFieldsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("account_number");
        this.requisiteFieldValidatorDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsTransferFieldsDto2.getAccountNumber());
        jsonWriter.name("bic");
        this.requisiteFieldValidatorDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsTransferFieldsDto2.getBic());
        jsonWriter.name("legal_name");
        this.requisiteFieldValidatorDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsTransferFieldsDto2.getLegalName());
        jsonWriter.name("inn");
        this.requisiteFieldValidatorDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsTransferFieldsDto2.getInn());
        jsonWriter.name("payment_purpose");
        this.requisiteFieldValidatorDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsTransferFieldsDto2.getPaymentPurpose());
        jsonWriter.name("hcs_personal_account");
        this.requisiteFieldValidatorDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsTransferFieldsDto2.getHcsPersonalAccount());
        jsonWriter.name("payment_period");
        this.requisiteFieldValidatorDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsTransferFieldsDto2.getPaymentPeriod());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(RequisitesHcsTransferFieldsDto)");
    }
}
