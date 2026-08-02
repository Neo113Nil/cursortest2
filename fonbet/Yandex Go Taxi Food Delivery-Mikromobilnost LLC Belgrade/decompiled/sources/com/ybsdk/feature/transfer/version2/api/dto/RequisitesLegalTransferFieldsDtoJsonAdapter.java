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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesLegalTransferFieldsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesLegalTransferFieldsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;", "requisiteFieldValidatorDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RequisitesLegalTransferFieldsDtoJsonAdapter extends JsonAdapter<RequisitesLegalTransferFieldsDto> {
    private final JsonReader.Options options = JsonReader.Options.of("account_number", "bic", "legal_name", "inn", "payment_purpose");
    private final JsonAdapter<RequisiteFieldValidatorDto> requisiteFieldValidatorDtoAdapter;

    public RequisitesLegalTransferFieldsDtoJsonAdapter(Moshi moshi) {
        this.requisiteFieldValidatorDtoAdapter = moshi.adapter(RequisiteFieldValidatorDto.class, EmptySet.a, "accountNumber");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RequisitesLegalTransferFieldsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        RequisiteFieldValidatorDto requisiteFieldValidatorDto = null;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto2 = null;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto3 = null;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto4 = null;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto5 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            RequisiteFieldValidatorDto requisiteFieldValidatorDto6 = requisiteFieldValidatorDto;
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                requisiteFieldValidatorDto = this.requisiteFieldValidatorDtoAdapter.fromJson(jsonReader);
                if (requisiteFieldValidatorDto == null) {
                    throw Util.unexpectedNull("accountNumber", "account_number", jsonReader);
                }
            } else if (selectName == 1) {
                requisiteFieldValidatorDto2 = this.requisiteFieldValidatorDtoAdapter.fromJson(jsonReader);
                if (requisiteFieldValidatorDto2 == null) {
                    throw Util.unexpectedNull("bic", "bic", jsonReader);
                }
            } else if (selectName == 2) {
                requisiteFieldValidatorDto3 = this.requisiteFieldValidatorDtoAdapter.fromJson(jsonReader);
                if (requisiteFieldValidatorDto3 == null) {
                    throw Util.unexpectedNull("legalName", "legal_name", jsonReader);
                }
            } else if (selectName == 3) {
                requisiteFieldValidatorDto4 = this.requisiteFieldValidatorDtoAdapter.fromJson(jsonReader);
                if (requisiteFieldValidatorDto4 == null) {
                    throw Util.unexpectedNull("inn", "inn", jsonReader);
                }
            } else if (selectName == 4 && (requisiteFieldValidatorDto5 = this.requisiteFieldValidatorDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("paymentPurpose", "payment_purpose", jsonReader);
            }
            requisiteFieldValidatorDto = requisiteFieldValidatorDto6;
        }
        RequisiteFieldValidatorDto requisiteFieldValidatorDto7 = requisiteFieldValidatorDto;
        jsonReader.endObject();
        if (requisiteFieldValidatorDto7 == null) {
            throw Util.missingProperty("accountNumber", "account_number", jsonReader);
        }
        if (requisiteFieldValidatorDto2 == null) {
            throw Util.missingProperty("bic", "bic", jsonReader);
        }
        if (requisiteFieldValidatorDto3 == null) {
            throw Util.missingProperty("legalName", "legal_name", jsonReader);
        }
        if (requisiteFieldValidatorDto4 == null) {
            throw Util.missingProperty("inn", "inn", jsonReader);
        }
        if (requisiteFieldValidatorDto5 != null) {
            return new RequisitesLegalTransferFieldsDto(requisiteFieldValidatorDto7, requisiteFieldValidatorDto2, requisiteFieldValidatorDto3, requisiteFieldValidatorDto4, requisiteFieldValidatorDto5);
        }
        throw Util.missingProperty("paymentPurpose", "payment_purpose", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RequisitesLegalTransferFieldsDto requisitesLegalTransferFieldsDto) {
        RequisitesLegalTransferFieldsDto requisitesLegalTransferFieldsDto2 = requisitesLegalTransferFieldsDto;
        if (requisitesLegalTransferFieldsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("account_number");
        this.requisiteFieldValidatorDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesLegalTransferFieldsDto2.getAccountNumber());
        jsonWriter.name("bic");
        this.requisiteFieldValidatorDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesLegalTransferFieldsDto2.getBic());
        jsonWriter.name("legal_name");
        this.requisiteFieldValidatorDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesLegalTransferFieldsDto2.getLegalName());
        jsonWriter.name("inn");
        this.requisiteFieldValidatorDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesLegalTransferFieldsDto2.getInn());
        jsonWriter.name("payment_purpose");
        this.requisiteFieldValidatorDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesLegalTransferFieldsDto2.getPaymentPurpose());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(54, "GeneratedJsonAdapter(RequisitesLegalTransferFieldsDto)");
    }
}
