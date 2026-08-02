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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesTransferFieldsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesTransferFieldsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;", "requisiteFieldValidatorDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RequisitesTransferFieldsDtoJsonAdapter extends JsonAdapter<RequisitesTransferFieldsDto> {
    private final JsonReader.Options options = JsonReader.Options.of("account_number", "bic", "first_name", "last_name", "middle_name", "payment_purpose");
    private final JsonAdapter<RequisiteFieldValidatorDto> requisiteFieldValidatorDtoAdapter;

    public RequisitesTransferFieldsDtoJsonAdapter(Moshi moshi) {
        this.requisiteFieldValidatorDtoAdapter = moshi.adapter(RequisiteFieldValidatorDto.class, EmptySet.a, "accountNumber");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RequisitesTransferFieldsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        RequisiteFieldValidatorDto requisiteFieldValidatorDto = null;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto2 = null;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto3 = null;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto4 = null;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto5 = null;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto6 = null;
        while (true) {
            RequisiteFieldValidatorDto requisiteFieldValidatorDto7 = requisiteFieldValidatorDto;
            RequisiteFieldValidatorDto requisiteFieldValidatorDto8 = requisiteFieldValidatorDto2;
            RequisiteFieldValidatorDto requisiteFieldValidatorDto9 = requisiteFieldValidatorDto3;
            if (!jsonReader.hasNext()) {
                RequisiteFieldValidatorDto requisiteFieldValidatorDto10 = requisiteFieldValidatorDto4;
                jsonReader.endObject();
                if (requisiteFieldValidatorDto7 == null) {
                    throw Util.missingProperty("accountNumber", "account_number", jsonReader);
                }
                if (requisiteFieldValidatorDto8 == null) {
                    throw Util.missingProperty("bic", "bic", jsonReader);
                }
                if (requisiteFieldValidatorDto9 == null) {
                    throw Util.missingProperty("firstName", "first_name", jsonReader);
                }
                if (requisiteFieldValidatorDto10 == null) {
                    throw Util.missingProperty("lastName", "last_name", jsonReader);
                }
                if (requisiteFieldValidatorDto5 == null) {
                    throw Util.missingProperty("middleName", "middle_name", jsonReader);
                }
                if (requisiteFieldValidatorDto6 != null) {
                    return new RequisitesTransferFieldsDto(requisiteFieldValidatorDto7, requisiteFieldValidatorDto8, requisiteFieldValidatorDto9, requisiteFieldValidatorDto10, requisiteFieldValidatorDto5, requisiteFieldValidatorDto6);
                }
                throw Util.missingProperty("paymentPurpose", "payment_purpose", jsonReader);
            }
            RequisiteFieldValidatorDto requisiteFieldValidatorDto11 = requisiteFieldValidatorDto4;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    requisiteFieldValidatorDto4 = requisiteFieldValidatorDto11;
                    requisiteFieldValidatorDto = requisiteFieldValidatorDto7;
                    requisiteFieldValidatorDto2 = requisiteFieldValidatorDto8;
                    requisiteFieldValidatorDto3 = requisiteFieldValidatorDto9;
                case 0:
                    requisiteFieldValidatorDto = this.requisiteFieldValidatorDtoAdapter.fromJson(jsonReader);
                    if (requisiteFieldValidatorDto == null) {
                        throw Util.unexpectedNull("accountNumber", "account_number", jsonReader);
                    }
                    requisiteFieldValidatorDto4 = requisiteFieldValidatorDto11;
                    requisiteFieldValidatorDto2 = requisiteFieldValidatorDto8;
                    requisiteFieldValidatorDto3 = requisiteFieldValidatorDto9;
                case 1:
                    requisiteFieldValidatorDto2 = this.requisiteFieldValidatorDtoAdapter.fromJson(jsonReader);
                    if (requisiteFieldValidatorDto2 == null) {
                        throw Util.unexpectedNull("bic", "bic", jsonReader);
                    }
                    requisiteFieldValidatorDto4 = requisiteFieldValidatorDto11;
                    requisiteFieldValidatorDto = requisiteFieldValidatorDto7;
                    requisiteFieldValidatorDto3 = requisiteFieldValidatorDto9;
                case 2:
                    requisiteFieldValidatorDto3 = this.requisiteFieldValidatorDtoAdapter.fromJson(jsonReader);
                    if (requisiteFieldValidatorDto3 == null) {
                        throw Util.unexpectedNull("firstName", "first_name", jsonReader);
                    }
                    requisiteFieldValidatorDto4 = requisiteFieldValidatorDto11;
                    requisiteFieldValidatorDto = requisiteFieldValidatorDto7;
                    requisiteFieldValidatorDto2 = requisiteFieldValidatorDto8;
                case 3:
                    requisiteFieldValidatorDto4 = this.requisiteFieldValidatorDtoAdapter.fromJson(jsonReader);
                    if (requisiteFieldValidatorDto4 == null) {
                        throw Util.unexpectedNull("lastName", "last_name", jsonReader);
                    }
                    requisiteFieldValidatorDto = requisiteFieldValidatorDto7;
                    requisiteFieldValidatorDto2 = requisiteFieldValidatorDto8;
                    requisiteFieldValidatorDto3 = requisiteFieldValidatorDto9;
                case 4:
                    requisiteFieldValidatorDto5 = this.requisiteFieldValidatorDtoAdapter.fromJson(jsonReader);
                    if (requisiteFieldValidatorDto5 == null) {
                        throw Util.unexpectedNull("middleName", "middle_name", jsonReader);
                    }
                    requisiteFieldValidatorDto4 = requisiteFieldValidatorDto11;
                    requisiteFieldValidatorDto = requisiteFieldValidatorDto7;
                    requisiteFieldValidatorDto2 = requisiteFieldValidatorDto8;
                    requisiteFieldValidatorDto3 = requisiteFieldValidatorDto9;
                case 5:
                    requisiteFieldValidatorDto6 = this.requisiteFieldValidatorDtoAdapter.fromJson(jsonReader);
                    if (requisiteFieldValidatorDto6 == null) {
                        throw Util.unexpectedNull("paymentPurpose", "payment_purpose", jsonReader);
                    }
                    requisiteFieldValidatorDto4 = requisiteFieldValidatorDto11;
                    requisiteFieldValidatorDto = requisiteFieldValidatorDto7;
                    requisiteFieldValidatorDto2 = requisiteFieldValidatorDto8;
                    requisiteFieldValidatorDto3 = requisiteFieldValidatorDto9;
                default:
                    requisiteFieldValidatorDto4 = requisiteFieldValidatorDto11;
                    requisiteFieldValidatorDto = requisiteFieldValidatorDto7;
                    requisiteFieldValidatorDto2 = requisiteFieldValidatorDto8;
                    requisiteFieldValidatorDto3 = requisiteFieldValidatorDto9;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RequisitesTransferFieldsDto requisitesTransferFieldsDto) {
        RequisitesTransferFieldsDto requisitesTransferFieldsDto2 = requisitesTransferFieldsDto;
        if (requisitesTransferFieldsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("account_number");
        this.requisiteFieldValidatorDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesTransferFieldsDto2.getAccountNumber());
        jsonWriter.name("bic");
        this.requisiteFieldValidatorDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesTransferFieldsDto2.getBic());
        jsonWriter.name("first_name");
        this.requisiteFieldValidatorDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesTransferFieldsDto2.getFirstName());
        jsonWriter.name("last_name");
        this.requisiteFieldValidatorDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesTransferFieldsDto2.getLastName());
        jsonWriter.name("middle_name");
        this.requisiteFieldValidatorDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesTransferFieldsDto2.getMiddleName());
        jsonWriter.name("payment_purpose");
        this.requisiteFieldValidatorDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesTransferFieldsDto2.getPaymentPurpose());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(RequisitesTransferFieldsDto)");
    }
}
