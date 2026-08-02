package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/ValidateAutoTopupRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/ValidateAutoTopupRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupValidationParamsDto;", "autotopupValidationParamsDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutofundValidationParamsDto;", "nullableAutofundValidationParamsDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ValidateAutoTopupRequestJsonAdapter extends JsonAdapter<ValidateAutoTopupRequest> {
    private final JsonAdapter<AutotopupValidationParamsDto> autotopupValidationParamsDtoAdapter;
    private final JsonAdapter<AutofundValidationParamsDto> nullableAutofundValidationParamsDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreement_id", "autotopup_params", "autofund_params");
    private final JsonAdapter<String> stringAdapter;

    public ValidateAutoTopupRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.autotopupValidationParamsDtoAdapter = moshi.adapter(AutotopupValidationParamsDto.class, emptySet, "autotopupParams");
        this.nullableAutofundValidationParamsDtoAdapter = moshi.adapter(AutofundValidationParamsDto.class, emptySet, "autofundParams");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ValidateAutoTopupRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        AutotopupValidationParamsDto autotopupValidationParamsDto = null;
        AutofundValidationParamsDto autofundValidationParamsDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                }
            } else if (selectName == 1) {
                autotopupValidationParamsDto = this.autotopupValidationParamsDtoAdapter.fromJson(jsonReader);
                if (autotopupValidationParamsDto == null) {
                    throw Util.unexpectedNull("autotopupParams", "autotopup_params", jsonReader);
                }
            } else if (selectName == 2) {
                autofundValidationParamsDto = this.nullableAutofundValidationParamsDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
        }
        if (autotopupValidationParamsDto != null) {
            return new ValidateAutoTopupRequest(str, autotopupValidationParamsDto, autofundValidationParamsDto);
        }
        throw Util.missingProperty("autotopupParams", "autotopup_params", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ValidateAutoTopupRequest validateAutoTopupRequest) {
        ValidateAutoTopupRequest validateAutoTopupRequest2 = validateAutoTopupRequest;
        if (validateAutoTopupRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) validateAutoTopupRequest2.getAgreementId());
        jsonWriter.name("autotopup_params");
        this.autotopupValidationParamsDtoAdapter.toJson(jsonWriter, (JsonWriter) validateAutoTopupRequest2.getAutotopupParams());
        jsonWriter.name("autofund_params");
        this.nullableAutofundValidationParamsDtoAdapter.toJson(jsonWriter, (JsonWriter) validateAutoTopupRequest2.getAutofundParams());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(ValidateAutoTopupRequest)");
    }
}
